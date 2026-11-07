package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class D implements A9.d, Set, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B f22667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B f22668s;

    public D(B b5) {
        p251z9.j.e(b5, "parent");
        this.f22667r = b5;
        this.f22668s = b5;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f22668s.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        B b5 = this.f22668s;
        b5.getClass();
        int i10 = b5.g;
        for (Object obj : collection) {
            int iD = b5.d(obj);
            b5.f22653b[iD] = obj;
            long[] jArr = b5.f22654c;
            int i11 = b5.f22655d;
            jArr[iD] = (((long) i11) & 2147483647L) | 4611686016279904256L;
            if (i11 != Integer.MAX_VALUE) {
                jArr[i11] = ((2147483647L & ((long) iD)) << 31) | (jArr[i11] & (-4611686016279904257L));
            }
            b5.f22655d = iD;
            if (b5.f22656e == Integer.MAX_VALUE) {
                b5.f22656e = iD;
            }
        }
        return i10 != b5.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f22668s.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22667r.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f22667r.c(it.next())) {
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
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        return p251z9.j.a(this.f22667r, ((D) obj).f22667r);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f22667r.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f22667r.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new G9.h(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f22668s.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        p251z9.j.e(collection, "elements");
        B b5 = this.f22668s;
        b5.getClass();
        int i10 = b5.g;
        Iterator it = collection.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i13 = iHashCode ^ (iHashCode << 16);
            int i14 = i13 & 127;
            int i15 = b5.f22657f;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = b5.f22652a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                int i19 = i11;
                int i20 = i12;
                long j = (((-i18) >> 63) & (jArr[i17 + i11] << (64 - i18))) | (jArr[i17] >>> i18);
                long j10 = (((long) i14) * 72340172838076673L) ^ j;
                long j11 = -9187201950435737472L;
                long j12 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
                while (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i16) & i15;
                    long j13 = j11;
                    if (p251z9.j.a(b5.f22653b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j12 &= j12 - 1;
                    j11 = j13;
                }
                if ((j & ((~j) << 6) & j11) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i12 = i20 + 8;
                i16 = (i16 + i12) & i15;
                i11 = i19;
            }
            if (iNumberOfTrailingZeros >= 0) {
                b5.h(iNumberOfTrailingZeros);
            }
        }
        return i10 != b5.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        return this.f22668s.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f22667r.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return p251z9.i.a(this);
    }

    public final String toString() {
        return this.f22667r.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        p251z9.j.e(objArr, "array");
        return p251z9.i.b(this, objArr);
    }
}
