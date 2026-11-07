package J0;

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

/* JADX INFO: renamed from: J0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0295s implements List, A9.a, j$.util.List {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0296t f4166t;

    public C0295s(C0296t c0296t, int i10, int i11) {
        this.f4166t = c0296t;
        this.f4164r = i10;
        this.f4165s = i11;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof l0.q) && indexOf((l0.q) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((l0.q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object objE = this.f4166t.f4167r.e(i10 + this.f4164r);
        p251z9.j.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (l0.q) objE;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof l0.q)) {
            return -1;
        }
        l0.q qVar = (l0.q) obj;
        int i10 = this.f4164r;
        int i11 = this.f4165s;
        if (i10 <= i11) {
            int i12 = i10;
            while (!p251z9.j.a(this.f4166t.f4167r.e(i12), qVar)) {
                if (i12 != i11) {
                    i12++;
                }
            }
            return i12 - i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f4164r;
        return new r(this.f4166t, i10, i10, this.f4165s);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof l0.q)) {
            return -1;
        }
        l0.q qVar = (l0.q) obj;
        int i10 = this.f4165s;
        int i11 = this.f4164r;
        if (i11 <= i10) {
            while (!p251z9.j.a(this.f4166t.f4167r.e(i10), qVar)) {
                if (i10 != i11) {
                    i10--;
                }
            }
            return i10 - i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i10 = this.f4164r;
        return new r(this.f4166t, i10, i10, this.f4165s);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4165s - this.f4164r;
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
    public final List subList(int i10, int i11) {
        int i12 = this.f4164r;
        return new C0295s(this.f4166t, i10 + i12, i12 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p251z9.i.a(this);
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
    public final ListIterator listIterator(int i10) {
        int i11 = this.f4164r;
        int i12 = this.f4165s;
        return new r(this.f4166t, i10 + i11, i11, i12);
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
        return p251z9.i.b(this, objArr);
    }
}
