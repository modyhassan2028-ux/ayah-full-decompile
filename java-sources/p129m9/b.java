package p129m9;

import B9.a;
import J0.r;
import android.support.v4.media.session.p;
import io.realm.internal.OsCollectionChangeSet;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p017b7.g;
import p120l9.f;
import p120l9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f19697u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f19698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19700t;

    static {
        b bVar = new b(0);
        bVar.f19700t = true;
        f19697u = bVar;
    }

    public b(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f19698r = new Object[i10];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i10 = this.f19699s;
        ((AbstractList) this).modCount++;
        h(i10, 1);
        this.f19698r[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        g();
        int size = collection.size();
        e(this.f19699s, collection, size);
        return size > 0;
    }

    @Override // p120l9.f
    public final int b() {
        return this.f19699s;
    }

    @Override // p120l9.f
    public final Object c(int i10) {
        g();
        int i11 = this.f19699s;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        return j(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        l(0, this.f19699s);
    }

    public final void e(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        h(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f19698r[i10 + i12] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f19698r;
            int i10 = this.f19699s;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (j.a(objArr[i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        h(i10, 1);
        this.f19698r[i10] = obj;
    }

    public final void g() {
        if (this.f19700t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f19699s;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        return this.f19698r[i10];
    }

    public final void h(int i10, int i11) {
        int i12 = this.f19699s + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f19698r;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - OsCollectionChangeSet.MAX_ARRAY_LENGTH > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
            j.d(objArrCopyOf, "copyOf(...)");
            this.f19698r = objArrCopyOf;
        }
        Object[] objArr2 = this.f19698r;
        l.X(i10 + i11, i10, this.f19699s, objArr2, objArr2);
        this.f19699s += i11;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f19698r;
        int i10 = this.f19699s;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f19699s; i10++) {
            if (j.a(this.f19698r[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f19699s == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f19698r;
        Object obj = objArr[i10];
        l.X(i10, i10 + 1, this.f19699s, objArr, objArr);
        Object[] objArr2 = this.f19698r;
        int i11 = this.f19699s - 1;
        j.e(objArr2, "<this>");
        objArr2[i11] = null;
        this.f19699s--;
        return obj;
    }

    public final void l(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f19698r;
        l.X(i10, i10 + i11, this.f19699s, objArr, objArr);
        Object[] objArr2 = this.f19698r;
        int i12 = this.f19699s;
        a.T(objArr2, i12 - i11, i12);
        this.f19699s -= i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f19699s - 1; i10 >= 0; i10--) {
            if (j.a(this.f19698r[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int m(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f19698r[i14]) == z10) {
                Object[] objArr = this.f19698r;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f19698r;
        l.X(i10 + i13, i11 + i10, this.f19699s, objArr2, objArr2);
        Object[] objArr3 = this.f19698r;
        int i16 = this.f19699s;
        a.T(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f19699s -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        j.e(collection, "elements");
        g();
        return m(0, this.f19699s, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        g();
        return m(0, this.f19699s, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        g();
        int i11 = this.f19699s;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        Object[] objArr = this.f19698r;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        g.T(i10, i11, this.f19699s);
        return new a(this.f19698r, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f19699s;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f19698r, 0, i10, objArr.getClass());
            j.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        l.X(0, 0, i10, this.f19698r, objArr);
        int i11 = this.f19699s;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.f(this.f19698r, 0, this.f19699s, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f19699s;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        return new r(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        j.e(collection, "elements");
        g();
        int i11 = this.f19699s;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            e(i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        g();
        int i11 = this.f19699s;
        if (i10 >= 0 && i10 <= i11) {
            ((AbstractList) this).modCount++;
            h(i10, 1);
            this.f19698r[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return l.d0(this.f19698r, 0, this.f19699s);
    }
}
