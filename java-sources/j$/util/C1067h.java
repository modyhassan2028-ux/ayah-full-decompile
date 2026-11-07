package j$.util;

import j$.util.stream.Stream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1067h implements java.util.Collection, Serializable, Collection {
    private static final long serialVersionUID = 3053995032091335093L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Collection f18169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18170b;

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C1067h(java.util.Collection collection) {
        this.f18169a = (java.util.Collection) Objects.requireNonNull(collection);
        this.f18170b = this;
    }

    public C1067h(java.util.Collection collection, Object obj) {
        this.f18169a = (java.util.Collection) Objects.requireNonNull(collection);
        this.f18170b = Objects.requireNonNull(obj);
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f18170b) {
            size = this.f18169a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f18170b) {
            zIsEmpty = this.f18169a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f18170b) {
            zContains = this.f18169a.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f18170b) {
            array = this.f18169a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f18170b) {
            array = this.f18169a.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f18169a.iterator();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f18170b) {
            zAdd = this.f18169a.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f18170b) {
            zRemove = this.f18169a.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        boolean zContainsAll;
        synchronized (this.f18170b) {
            zContainsAll = this.f18169a.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f18170b) {
            zAddAll = this.f18169a.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f18170b) {
            zRemoveAll = this.f18169a.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        boolean zRetainAll;
        synchronized (this.f18170b) {
            zRetainAll = this.f18169a.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f18170b) {
            this.f18169a.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f18170b) {
            string = this.f18169a.toString();
        }
        return string;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        synchronized (this.f18170b) {
            AbstractC1062c.q(this.f18169a, consumer);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f18170b) {
            java.util.Collection collection = this.f18169a;
            zRemoveIf = collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : Collection.CC.$default$removeIf(collection, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final Spliterator spliterator() {
        return AbstractC1062c.u(this.f18169a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(AbstractC1062c.u(this.f18169a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return AbstractC1062c.v(this.f18169a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(AbstractC1062c.v(this.f18169a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC1062c.s(this.f18169a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(AbstractC1062c.s(this.f18169a));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f18170b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
