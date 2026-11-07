package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class I2 extends U1 implements RandomAccess {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object[] f14047u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final I2 f14048v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f14049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14050t;

    static {
        Object[] objArr = new Object[0];
        f14047u = objArr;
        f14048v = new I2(objArr, 0, false);
    }

    public I2(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f14049s = objArr;
        this.f14050t = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f14050t)) {
            throw new IndexOutOfBoundsException(W1.a(this.f14050t, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f14049s;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14049s, 0, objArr2, 0, i10);
            System.arraycopy(this.f14049s, i10, objArr2, i12, this.f14050t - i10);
            this.f14049s = objArr2;
        }
        this.f14049s[i10] = obj;
        this.f14050t++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f14050t) {
            throw new IndexOutOfBoundsException(W1.a(this.f14050t, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        c(i10);
        return this.f14049s[i10];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0858o2
    public final /* bridge */ /* synthetic */ InterfaceC0858o2 i(int i10) {
        if (i10 >= this.f14050t) {
            return new I2(i10 == 0 ? f14047u : Arrays.copyOf(this.f14049s, i10), this.f14050t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        c(i10);
        Object[] objArr = this.f14049s;
        Object obj = objArr[i10];
        int i11 = this.f14050t;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f14050t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        c(i10);
        Object[] objArr = this.f14049s;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14050t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f14050t;
        int length = this.f14049s.length;
        if (i10 == length) {
            this.f14049s = Arrays.copyOf(this.f14049s, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f14049s;
        int i11 = this.f14050t;
        this.f14050t = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
