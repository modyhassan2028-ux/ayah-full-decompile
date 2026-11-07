package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: u.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1349d implements Collection {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1350e f22720r;

    public C1349d(C1350e c1350e) {
        this.f22720r = c1350e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f22720r.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22720r.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f22720r.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1346a(this.f22720r, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1350e c1350e = this.f22720r;
        int iA = c1350e.a(obj);
        if (iA < 0) {
            return false;
        }
        c1350e.g(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1350e c1350e = this.f22720r;
        int i10 = c1350e.f22703t;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (collection.contains(c1350e.i(i11))) {
                c1350e.g(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1350e c1350e = this.f22720r;
        int i10 = c1350e.f22703t;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (!collection.contains(c1350e.i(i11))) {
                c1350e.g(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f22720r.f22703t;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1350e c1350e = this.f22720r;
        int i10 = c1350e.f22703t;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c1350e.i(i11);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1350e c1350e = this.f22720r;
        int i10 = c1350e.f22703t;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c1350e.i(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
