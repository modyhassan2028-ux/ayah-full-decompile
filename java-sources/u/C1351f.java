package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: u.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1351f implements Collection, Set, A9.b, A9.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f22724r = p204v.a.f22998a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f22725s = p204v.a.f23000c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22726t;

    public C1351f(int i10) {
        if (i10 > 0) {
            AbstractC1361p.b(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iC;
        int i11 = this.f22726t;
        if (obj == null) {
            iC = AbstractC1361p.c(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = AbstractC1361p.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i12 = ~iC;
        int[] iArr = this.f22724r;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f22725s;
            int[] iArr2 = new int[i13];
            this.f22724r = iArr2;
            this.f22725s = new Object[i13];
            if (i11 != this.f22726t) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                p120l9.l.a0(0, iArr.length, 6, iArr, iArr2);
                p120l9.l.b0(0, objArr.length, 6, objArr, this.f22725s);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f22724r;
            int i14 = i12 + 1;
            p120l9.l.W(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f22725s;
            p120l9.l.X(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f22726t;
        if (i11 == i15) {
            int[] iArr4 = this.f22724r;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f22725s[i12] = obj;
                this.f22726t = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        int size = collection.size() + this.f22726t;
        int i10 = this.f22726t;
        int[] iArr = this.f22724r;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f22725s;
            int[] iArr2 = new int[size];
            this.f22724r = iArr2;
            this.f22725s = new Object[size];
            if (i10 > 0) {
                p120l9.l.a0(0, i10, 6, iArr, iArr2);
                p120l9.l.b0(0, this.f22726t, 6, objArr, this.f22725s);
            }
        }
        if (this.f22726t != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i10) {
        int i11 = this.f22726t;
        Object[] objArr = this.f22725s;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f22724r;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                p120l9.l.W(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.f22725s;
                p120l9.l.X(i10, i13, i11, objArr2, objArr2);
            }
            this.f22725s[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.f22724r = iArr2;
            this.f22725s = new Object[i14];
            if (i10 > 0) {
                p120l9.l.a0(0, i10, 6, iArr, iArr2);
                p120l9.l.b0(0, i10, 6, objArr, this.f22725s);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                p120l9.l.W(i10, i15, i11, iArr, this.f22724r);
                p120l9.l.X(i10, i15, i11, objArr, this.f22725s);
            }
        }
        if (i11 != this.f22726t) {
            throw new ConcurrentModificationException();
        }
        this.f22726t = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f22726t != 0) {
            this.f22724r = p204v.a.f22998a;
            this.f22725s = p204v.a.f23000c;
            this.f22726t = 0;
        }
        if (this.f22726t != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1361p.c(this, null, 0) : AbstractC1361p.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f22726t != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f22726t;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f22725s[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f22724r;
        int i10 = this.f22726t;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f22726t <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1346a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? AbstractC1361p.c(this, null, 0) : AbstractC1361p.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        b(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        boolean z10 = false;
        for (int i10 = this.f22726t - 1; -1 < i10; i10--) {
            if (!p120l9.m.e0(collection, this.f22725s[i10])) {
                b(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f22726t;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return p120l9.l.d0(this.f22725s, 0, this.f22726t);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22726t * 14);
        sb.append('{');
        int i10 = this.f22726t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = this.f22725s[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        p251z9.j.e(objArr, "array");
        int i10 = this.f22726t;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        p120l9.l.X(0, 0, this.f22726t, this.f22725s, objArr);
        return objArr;
    }
}
