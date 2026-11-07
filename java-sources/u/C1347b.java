package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: u.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1347b implements Set {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1350e f22715r;

    public C1347b(C1350e c1350e) {
        this.f22715r = c1350e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f22715r.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22715r.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f22715r.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C1350e c1350e = this.f22715r;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c1350e.f22703t == set.size() && c1350e.j(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C1350e c1350e = this.f22715r;
        int iHashCode = 0;
        for (int i10 = c1350e.f22703t - 1; i10 >= 0; i10--) {
            Object objF = c1350e.f(i10);
            iHashCode += objF == null ? 0 : objF.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f22715r.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1346a(this.f22715r, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1350e c1350e = this.f22715r;
        int iD = c1350e.d(obj);
        if (iD < 0) {
            return false;
        }
        c1350e.g(iD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f22715r.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1350e c1350e = this.f22715r;
        int i10 = c1350e.f22703t;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(c1350e.f(i11))) {
                c1350e.g(i11);
            }
        }
        return i10 != c1350e.f22703t;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f22715r.f22703t;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1350e c1350e = this.f22715r;
        int i10 = c1350e.f22703t;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c1350e.f(i11);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1350e c1350e = this.f22715r;
        int i10 = c1350e.f22703t;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c1350e.f(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
