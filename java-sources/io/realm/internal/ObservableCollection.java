package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;

/* JADX INFO: loaded from: classes.dex */
@Keep
public interface ObservableCollection {

    public static class Callback implements ObserverPairList.Callback<CollectionObserverPair> {
        private final OsCollectionChangeSet changeSet;

        public Callback(OsCollectionChangeSet osCollectionChangeSet) {
            this.changeSet = osCollectionChangeSet;
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public void onCalled(CollectionObserverPair collectionObserverPair, Object obj) {
            collectionObserverPair.onChange(obj, this.changeSet);
        }
    }

    public static class CollectionObserverPair<T> extends ObserverPairList.ObserverPair<T, Object> {
        public CollectionObserverPair(T t2, Object obj) {
            super(t2, obj);
        }

        public void onChange(T t2, OsCollectionChangeSet osCollectionChangeSet) {
            S s10 = this.listener;
            if (s10 instanceof OrderedRealmCollectionChangeListener) {
                ((OrderedRealmCollectionChangeListener) s10).onChange(t2, new StatefulCollectionChangeSet(osCollectionChangeSet));
            } else if (s10 instanceof RealmChangeListener) {
                ((RealmChangeListener) s10).onChange(t2);
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.listener);
            }
        }
    }

    public static class RealmChangeListenerWrapper<T> implements OrderedRealmCollectionChangeListener<T> {
        private final RealmChangeListener<T> listener;

        public RealmChangeListenerWrapper(RealmChangeListener<T> realmChangeListener) {
            this.listener = realmChangeListener;
        }

        public boolean equals(Object obj) {
            return (obj instanceof RealmChangeListenerWrapper) && this.listener == ((RealmChangeListenerWrapper) obj).listener;
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        @Override // io.realm.OrderedRealmCollectionChangeListener
        public void onChange(T t2, OrderedCollectionChangeSet orderedCollectionChangeSet) {
            this.listener.onChange(t2);
        }
    }

    void notifyChangeListeners(long j);
}
