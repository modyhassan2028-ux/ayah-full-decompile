package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class H implements A9.d, Set, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F f22692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F f22693s;

    public H(F f3) {
        this.f22692r = f3;
        this.f22693s = f3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f22693s.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        F f3 = this.f22693s;
        f3.getClass();
        int i10 = f3.f22678d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f3.j(it.next());
        }
        return i10 != f3.f22678d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f22693s.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22692r.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f22692r.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p251z9.j.a(this.f22692r, ((H) obj).f22692r);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f22692r.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f22692r.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new G9.h(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f22693s.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        F f3 = this.f22693s;
        f3.getClass();
        int i10 = f3.f22678d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f3.i(it.next());
        }
        return i10 != f3.f22678d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z10;
        p251z9.j.e(collection, "elements");
        F f3 = this.f22693s;
        f3.getClass();
        Object[] objArr = f3.f22676b;
        int i10 = f3.f22678d;
        long[] jArr = f3.f22675a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!p120l9.m.e0(collection, objArr[i14])) {
                                f3.m(i14);
                            }
                        }
                        j >>= 8;
                    }
                    z10 = false;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    z10 = false;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        } else {
            z10 = false;
        }
        if (i10 != f3.f22678d) {
            return true;
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f22692r.f22678d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return p251z9.i.a(this);
    }

    public final String toString() {
        return this.f22692r.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        p251z9.j.e(objArr, "array");
        return p251z9.i.b(this, objArr);
    }
}
