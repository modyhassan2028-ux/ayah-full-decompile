package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0833j2 extends U1 implements RandomAccess, InterfaceC0848m2, G2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f14339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0833j2 f14340v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f14341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14342t;

    static {
        int[] iArr = new int[0];
        f14339u = iArr;
        f14340v = new C0833j2(iArr, 0, false);
    }

    public C0833j2(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f14341s = iArr;
        this.f14342t = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f14342t)) {
            throw new IndexOutOfBoundsException(W1.a(this.f14342t, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f14341s;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14341s, 0, iArr2, 0, i10);
            System.arraycopy(this.f14341s, i10, iArr2, i12, this.f14342t - i10);
            this.f14341s = iArr2;
        }
        this.f14341s[i10] = iIntValue;
        this.f14342t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0863p2.f14382a;
        collection.getClass();
        if (!(collection instanceof C0833j2)) {
            return super.addAll(collection);
        }
        C0833j2 c0833j2 = (C0833j2) collection;
        int i10 = c0833j2.f14342t;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14342t;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f14341s;
        if (i12 > iArr.length) {
            this.f14341s = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c0833j2.f14341s, 0, this.f14341s, this.f14342t, c0833j2.f14342t);
        this.f14342t = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0858o2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0833j2 i(int i10) {
        if (i10 >= this.f14342t) {
            return new C0833j2(i10 == 0 ? f14339u : Arrays.copyOf(this.f14341s, i10), this.f14342t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        f(i10);
        return this.f14341s[i10];
    }

    public final void e(int i10) {
        b();
        int i11 = this.f14342t;
        int length = this.f14341s.length;
        if (i11 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14341s, 0, iArr, 0, this.f14342t);
            this.f14341s = iArr;
        }
        int[] iArr2 = this.f14341s;
        int i12 = this.f14342t;
        this.f14342t = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0833j2)) {
            return super.equals(obj);
        }
        C0833j2 c0833j2 = (C0833j2) obj;
        if (this.f14342t != c0833j2.f14342t) {
            return false;
        }
        int[] iArr = c0833j2.f14341s;
        for (int i10 = 0; i10 < this.f14342t; i10++) {
            if (this.f14341s[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        if (i10 < 0 || i10 >= this.f14342t) {
            throw new IndexOutOfBoundsException(W1.a(this.f14342t, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Integer.valueOf(this.f14341s[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14342t; i11++) {
            i10 = (i10 * 31) + this.f14341s[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f14342t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14341s[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        f(i10);
        int[] iArr = this.f14341s;
        int i11 = iArr[i10];
        int i12 = this.f14342t;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f14342t--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14341s;
        System.arraycopy(iArr, i11, iArr, i10, this.f14342t - i11);
        this.f14342t -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        f(i10);
        int[] iArr = this.f14341s;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14342t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
