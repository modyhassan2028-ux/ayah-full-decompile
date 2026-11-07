package p129m9;

import J0.r;
import android.support.v4.media.session.p;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p017b7.g;
import p120l9.f;
import p120l9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f19692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f19693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19694t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f19695u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f19696v;

    public a(Object[] objArr, int i10, int i11, a aVar, b bVar) {
        j.e(objArr, "backing");
        j.e(bVar, "root");
        this.f19692r = objArr;
        this.f19693s = i10;
        this.f19694t = i11;
        this.f19695u = aVar;
        this.f19696v = bVar;
        ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f19693s + this.f19694t, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        h();
        g();
        int size = collection.size();
        e(this.f19693s + this.f19694t, collection, size);
        return size > 0;
    }

    @Override // p120l9.f
    public final int b() {
        g();
        return this.f19694t;
    }

    @Override // p120l9.f
    public final Object c(int i10) {
        h();
        g();
        int i11 = this.f19694t;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        return j(this.f19693s + i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        l(this.f19693s, this.f19694t);
    }

    public final void e(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        b bVar = this.f19696v;
        a aVar = this.f19695u;
        if (aVar != null) {
            aVar.e(i10, collection, i11);
        } else {
            b bVar2 = b.f19697u;
            bVar.e(i10, collection, i11);
        }
        this.f19692r = bVar.f19698r;
        this.f19694t += i11;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f19692r;
            int i10 = this.f19694t;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (j.a(objArr[this.f19693s + i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f19696v;
        a aVar = this.f19695u;
        if (aVar != null) {
            aVar.f(i10, obj);
        } else {
            b bVar2 = b.f19697u;
            bVar.f(i10, obj);
        }
        this.f19692r = bVar.f19698r;
        this.f19694t++;
    }

    public final void g() {
        if (((AbstractList) this.f19696v).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g();
        int i11 = this.f19694t;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        return this.f19692r[this.f19693s + i10];
    }

    public final void h() {
        if (this.f19696v.f19700t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f19692r;
        int i10 = this.f19694t;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f19693s + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i10 = 0; i10 < this.f19694t; i10++) {
            if (j.a(this.f19692r[this.f19693s + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f19694t == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i10) {
        Object objJ;
        ((AbstractList) this).modCount++;
        a aVar = this.f19695u;
        if (aVar != null) {
            objJ = aVar.j(i10);
        } else {
            b bVar = b.f19697u;
            objJ = this.f19696v.j(i10);
        }
        this.f19694t--;
        return objJ;
    }

    public final void l(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f19695u;
        if (aVar != null) {
            aVar.l(i10, i11);
        } else {
            b bVar = b.f19697u;
            this.f19696v.l(i10, i11);
        }
        this.f19694t -= i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i10 = this.f19694t - 1; i10 >= 0; i10--) {
            if (j.a(this.f19692r[this.f19693s + i10], obj)) {
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
        int iM;
        a aVar = this.f19695u;
        if (aVar != null) {
            iM = aVar.m(i10, i11, collection, z10);
        } else {
            b bVar = b.f19697u;
            iM = this.f19696v.m(i10, i11, collection, z10);
        }
        if (iM > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f19694t -= iM;
        return iM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
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
        h();
        g();
        return m(this.f19693s, this.f19694t, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        h();
        g();
        return m(this.f19693s, this.f19694t, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        h();
        g();
        int i11 = this.f19694t;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        Object[] objArr = this.f19692r;
        int i12 = this.f19693s;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        g.T(i10, i11, this.f19694t);
        return new a(this.f19692r, this.f19693s + i10, i11 - i10, this, this.f19696v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        g();
        int length = objArr.length;
        int i10 = this.f19694t;
        int i11 = this.f19693s;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f19692r, i11, i10 + i11, objArr.getClass());
            j.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        l.X(0, i11, i10 + i11, this.f19692r, objArr);
        int i12 = this.f19694t;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return B9.a.f(this.f19692r, this.f19693s, this.f19694t, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        g();
        int i11 = this.f19694t;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        return new r(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        h();
        g();
        int i11 = this.f19694t;
        if (i10 >= 0 && i10 <= i11) {
            f(this.f19693s + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        j.e(collection, "elements");
        h();
        g();
        int i11 = this.f19694t;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            e(this.f19693s + i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f19692r;
        int i10 = this.f19694t;
        int i11 = this.f19693s;
        return l.d0(objArr, i11, i10 + i11);
    }
}
