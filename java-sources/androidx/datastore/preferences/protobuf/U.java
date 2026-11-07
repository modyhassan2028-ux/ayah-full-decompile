package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0728b implements RandomAccess {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final U f12409u = new U(new Object[0], 0, false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f12410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12411t;

    public U(Object[] objArr, int i10, boolean z10) {
        this.f12433r = z10;
        this.f12410s = objArr;
        this.f12411t = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f12411t;
        Object[] objArr = this.f12410s;
        if (i10 == objArr.length) {
            this.f12410s = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12410s;
        int i11 = this.f12411t;
        this.f12411t = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f12411t) {
            StringBuilder sbW = p123m2.c.w(i10, "Index:", ", Size:");
            sbW.append(this.f12411t);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    public final U d(int i10) {
        if (i10 >= this.f12411t) {
            return new U(Arrays.copyOf(this.f12410s, i10), this.f12411t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        c(i10);
        return this.f12410s[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0728b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        c(i10);
        Object[] objArr = this.f12410s;
        Object obj = objArr[i10];
        int i11 = this.f12411t;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f12411t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        c(i10);
        Object[] objArr = this.f12410s;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12411t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f12411t)) {
            Object[] objArr = this.f12410s;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f12410s, i10, objArr2, i10 + 1, this.f12411t - i10);
                this.f12410s = objArr2;
            }
            this.f12410s[i10] = obj;
            this.f12411t++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbW = p123m2.c.w(i10, "Index:", ", Size:");
        sbW.append(this.f12411t);
        throw new IndexOutOfBoundsException(sbW.toString());
    }
}
