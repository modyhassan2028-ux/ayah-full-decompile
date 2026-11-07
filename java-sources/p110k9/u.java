package p110k9;

import A9.a;
import I1.V;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p251z9.i;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Collection, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long[] f19091r;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001f A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        long j = ((t) obj).f19090r;
        long[] jArr = this.f19091r;
        int length = jArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (j == jArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        j.e(collection, "elements");
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof t) {
                    long j = ((t) obj).f19090r;
                    long[] jArr = this.f19091r;
                    int length = jArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        }
                        if (j == jArr[i10]) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return j.a(this.f19091r, ((u) obj).f19091r);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f19091r);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f19091r.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new V(3, this.f19091r);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f19091r.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f19091r) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        return i.b(this, objArr);
    }
}
