package Z9;

import j$.lang.Iterable$CC;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements List<i>, A9.a, j$.util.List {
    public static final c Companion = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f11046r;

    public d(List list) {
        p251z9.j.e(list, "content");
        this.f11046r = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f11046r.contains((i) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        return this.f11046r.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return p251z9.j.a(this.f11046r, obj);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final i get(int i10) {
        return (i) this.f11046r.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f11046r.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return this.f11046r.indexOf((i) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f11046r.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f11046r.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return this.f11046r.lastIndexOf((i) obj);
    }

    @Override // java.util.List
    public final ListIterator<i> listIterator() {
        return this.f11046r.listIterator();
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ i remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ i set(int i10, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f11046r.size();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public final List<i> subList(int i10, int i11) {
        return this.f11046r.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p251z9.i.a(this);
    }

    public final String toString() {
        return p120l9.m.l0(this.f11046r, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<i> listIterator(int i10) {
        return this.f11046r.listIterator(i10);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        p251z9.j.e(objArr, "array");
        return p251z9.i.b(this, objArr);
    }
}
