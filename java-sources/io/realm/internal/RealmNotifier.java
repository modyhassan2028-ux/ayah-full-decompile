package io.realm.internal;

import io.realm.RealmChangeListener;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public abstract class RealmNotifier implements Closeable {
    private OsSharedRealm sharedRealm;
    private ObserverPairList<RealmObserverPair> realmObserverPairs = new ObserverPairList<>();
    private final ObserverPairList.Callback<RealmObserverPair> onChangeCallBack = new ObserverPairList.Callback<RealmObserverPair>() { // from class: io.realm.internal.RealmNotifier.1
        @Override // io.realm.internal.ObserverPairList.Callback
        public void onCalled(RealmObserverPair realmObserverPair, Object obj) {
            if (RealmNotifier.this.sharedRealm == null || RealmNotifier.this.sharedRealm.isClosed()) {
                return;
            }
            realmObserverPair.onChange(obj);
        }
    };
    private List<Runnable> transactionCallbacks = new ArrayList();
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();

    public static class RealmObserverPair<T> extends ObserverPairList.ObserverPair<T, RealmChangeListener<T>> {
        public RealmObserverPair(T t2, RealmChangeListener<T> realmChangeListener) {
            super(t2, realmChangeListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onChange(T t2) {
            if (t2 != null) {
                ((RealmChangeListener) this.listener).onChange(t2);
            }
        }
    }

    public RealmNotifier(OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    private void removeAllChangeListeners() {
        this.realmObserverPairs.clear();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public <T> void addChangeListener(T t2, RealmChangeListener<T> realmChangeListener) {
        this.realmObserverPairs.add(new RealmObserverPair(t2, realmChangeListener));
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    public void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    public void didChange() {
        this.realmObserverPairs.foreach(this.onChangeCallBack);
        if (this.transactionCallbacks.isEmpty()) {
            return;
        }
        List<Runnable> list = this.transactionCallbacks;
        this.transactionCallbacks = new ArrayList();
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public void didSendNotifications() {
        for (int i10 = 0; i10 < this.startSendingNotificationsCallbacks.size(); i10++) {
            this.finishedSendingNotificationsCallbacks.get(i10).run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.size();
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e10, RealmChangeListener<E> realmChangeListener) {
        this.realmObserverPairs.remove(e10, realmChangeListener);
    }

    public <E> void removeChangeListeners(E e10) {
        this.realmObserverPairs.removeByObserver(e10);
    }

    public void willSendNotifications() {
        for (int i10 = 0; i10 < this.startSendingNotificationsCallbacks.size(); i10++) {
            this.startSendingNotificationsCallbacks.get(i10).run();
        }
    }
}
