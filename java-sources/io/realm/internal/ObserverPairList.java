package io.realm.internal;

import io.realm.internal.ObserverPairList.ObserverPair;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ObserverPairList<T extends ObserverPair> {
    private List<T> pairs = new CopyOnWriteArrayList();
    private boolean cleared = false;

    public interface Callback<T extends ObserverPair> {
        void onCalled(T t2, Object obj);
    }

    public static abstract class ObserverPair<T, S> {
        protected final S listener;
        final WeakReference<T> observerRef;
        boolean removed = false;

        public ObserverPair(T t2, S s10) {
            this.listener = s10;
            this.observerRef = new WeakReference<>(t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ObserverPair) {
                ObserverPair observerPair = (ObserverPair) obj;
                if (this.listener.equals(observerPair.listener) && this.observerRef.get() == observerPair.observerRef.get()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T t2 = this.observerRef.get();
            int iHashCode = (527 + (t2 != null ? t2.hashCode() : 0)) * 31;
            S s10 = this.listener;
            return iHashCode + (s10 != null ? s10.hashCode() : 0);
        }
    }

    public void add(T t2) {
        if (!this.pairs.contains(t2)) {
            this.pairs.add(t2);
            t2.removed = false;
        }
        if (this.cleared) {
            this.cleared = false;
        }
    }

    public void clear() {
        this.cleared = true;
        this.pairs.clear();
    }

    public void foreach(Callback<T> callback) {
        for (T t2 : this.pairs) {
            if (this.cleared) {
                return;
            }
            Object obj = t2.observerRef.get();
            if (obj == null) {
                this.pairs.remove(t2);
            } else if (!t2.removed) {
                callback.onCalled(t2, obj);
            }
        }
    }

    public boolean isEmpty() {
        return this.pairs.isEmpty();
    }

    public <S, U> void remove(S s10, U u8) {
        for (T t2 : this.pairs) {
            if (s10 == t2.observerRef.get() && u8.equals(t2.listener)) {
                t2.removed = true;
                this.pairs.remove(t2);
                return;
            }
        }
    }

    public void removeByObserver(Object obj) {
        for (T t2 : this.pairs) {
            Object obj2 = t2.observerRef.get();
            if (obj2 == null || obj2 == obj) {
                t2.removed = true;
                this.pairs.remove(t2);
            }
        }
    }

    public int size() {
        return this.pairs.size();
    }
}
