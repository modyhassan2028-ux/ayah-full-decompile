package J0;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
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

/* JADX INFO: renamed from: J0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0296t implements List, A9.a, j$.util.List {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u.A f4167r = new u.A(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u.v f4168s = new u.v(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4169t = -1;

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

    public final long b() {
        long jA = AbstractC0283f.a(Float.POSITIVE_INFINITY, false, false);
        int i10 = this.f4169t + 1;
        int iE = AbstractC0813f2.E(this);
        if (i10 > iE) {
            return jA;
        }
        while (true) {
            u.v vVar = this.f4168s;
            if (i10 < 0) {
                vVar.getClass();
                break;
            }
            if (i10 >= vVar.f22766b) {
                break;
            }
            long j = vVar.f22765a[i10];
            if (AbstractC0283f.h(j, jA) < 0) {
                jA = j;
            }
            if ((AbstractC0283f.l(jA) < 0.0f && AbstractC0283f.q(jA)) || i10 == iE) {
                return jA;
            }
            i10++;
        }
        p204v.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void c(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f4167r.k(i10, i11);
        u.v vVar = this.f4168s;
        if (i10 >= 0) {
            int i12 = vVar.f22766b;
            if (i10 <= i12 && i11 >= 0 && i11 <= i12) {
                if (i11 < i10) {
                    p204v.a.c("The end index must be < start index");
                    throw null;
                }
                if (i11 != i10) {
                    if (i11 < i12) {
                        long[] jArr = vVar.f22765a;
                        p120l9.l.Z(jArr, jArr, i10, i11, i12);
                    }
                    vVar.f22766b -= i11 - i10;
                    return;
                }
                return;
            }
        } else {
            vVar.getClass();
        }
        p204v.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f4169t = -1;
        this.f4167r.c();
        this.f4168s.f22766b = 0;
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
        Object objE = this.f4167r.e(i10);
        p251z9.j.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (l0.q) objE;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof l0.q)) {
            return -1;
        }
        l0.q qVar = (l0.q) obj;
        int iE = AbstractC0813f2.E(this);
        if (iE >= 0) {
            int i10 = 0;
            while (!p251z9.j.a(this.f4167r.e(i10), qVar)) {
                if (i10 != iE) {
                    i10++;
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4167r.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof l0.q)) {
            return -1;
        }
        l0.q qVar = (l0.q) obj;
        for (int iE = AbstractC0813f2.E(this); -1 < iE; iE--) {
            if (p251z9.j.a(this.f4167r.e(iE), qVar)) {
                return iE;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new r(this, 0, 7);
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
        return this.f4167r.f22651b;
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
        return new C0295s(this, i10, i11);
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
        return new r(this, i10, 6);
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
