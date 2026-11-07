package p110k9;

import A9.a;
import I1.V;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p251z9.i;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Collection, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f19089r;

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

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        int i10 = ((r) obj).f19088r;
        int[] iArr = this.f19089r;
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            if (i10 == iArr[i11]) {
                if (i11 >= 0) {
                    return true;
                }
                return false;
            }
            i11++;
        }
        i11 = -1;
        if (i11 >= 0) {
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
                if (obj instanceof r) {
                    int i10 = ((r) obj).f19088r;
                    int[] iArr = this.f19089r;
                    int length = iArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i11 = -1;
                            break;
                        }
                        if (i10 == iArr[i11]) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return j.a(this.f19089r, ((s) obj).f19089r);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f19089r);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f19089r.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new V(2, this.f19089r);
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
        return this.f19089r.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f19089r) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        return i.b(this, objArr);
    }
}
