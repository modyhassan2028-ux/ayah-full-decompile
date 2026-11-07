package j$.util;

import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1073n implements java.util.Collection, Serializable, Collection {
    private static final long serialVersionUID = 1820017752578914078L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Collection f18199a;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C1073n(java.util.Collection collection) {
        collection.getClass();
        this.f18199a = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f18199a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18199a.isEmpty();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f18199a.contains(obj);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f18199a.toArray();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f18199a.toArray(objArr);
    }

    public final String toString() {
        return this.f18199a.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C1072m(this);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.f18199a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public void forEach(Consumer consumer) {
        AbstractC1062c.q(this.f18199a, consumer);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public Spliterator spliterator() {
        return AbstractC1062c.u(this.f18199a);
    }

    @Override // java.util.Collection, j$.util.Collection
    public j$.util.stream.Stream stream() {
        return AbstractC1062c.v(this.f18199a);
    }

    @Override // java.util.Collection, j$.util.Collection
    public j$.util.stream.Stream parallelStream() {
        return AbstractC1062c.s(this.f18199a);
    }
}
