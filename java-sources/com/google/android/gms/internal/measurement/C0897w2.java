package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897w2 extends U1 implements RandomAccess, InterfaceC0853n2, G2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long[] f14498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0897w2 f14499v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[] f14500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14501t;

    static {
        long[] jArr = new long[0];
        f14498u = jArr;
        f14499v = new C0897w2(jArr, 0, false);
    }

    public C0897w2(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f14500s = jArr;
        this.f14501t = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f14501t)) {
            throw new IndexOutOfBoundsException(W1.a(this.f14501t, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f14500s;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14500s, 0, jArr2, 0, i10);
            System.arraycopy(this.f14500s, i10, jArr2, i12, this.f14501t - i10);
            this.f14500s = jArr2;
        }
        this.f14500s[i10] = jLongValue;
        this.f14501t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0863p2.f14382a;
        collection.getClass();
        if (!(collection instanceof C0897w2)) {
            return super.addAll(collection);
        }
        C0897w2 c0897w2 = (C0897w2) collection;
        int i10 = c0897w2.f14501t;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14501t;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f14500s;
        if (i12 > jArr.length) {
            this.f14500s = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c0897w2.f14500s, 0, this.f14500s, this.f14501t, c0897w2.f14501t);
        this.f14501t = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i10) {
        f(i10);
        return this.f14500s[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0858o2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C0897w2 i(int i10) {
        if (i10 >= this.f14501t) {
            return new C0897w2(i10 == 0 ? f14498u : Arrays.copyOf(this.f14500s, i10), this.f14501t, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(long j) {
        b();
        int i10 = this.f14501t;
        int length = this.f14500s.length;
        if (i10 == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14500s, 0, jArr, 0, this.f14501t);
            this.f14500s = jArr;
        }
        long[] jArr2 = this.f14500s;
        int i11 = this.f14501t;
        this.f14501t = i11 + 1;
        jArr2[i11] = j;
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0897w2)) {
            return super.equals(obj);
        }
        C0897w2 c0897w2 = (C0897w2) obj;
        if (this.f14501t != c0897w2.f14501t) {
            return false;
        }
        long[] jArr = c0897w2.f14500s;
        for (int i10 = 0; i10 < this.f14501t; i10++) {
            if (this.f14500s[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        if (i10 < 0 || i10 >= this.f14501t) {
            throw new IndexOutOfBoundsException(W1.a(this.f14501t, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Long.valueOf(this.f14500s[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14501t; i11++) {
            long j = this.f14500s[i11];
            Charset charset = AbstractC0863p2.f14382a;
            i10 = (i10 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f14501t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14500s[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.U1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        f(i10);
        long[] jArr = this.f14500s;
        long j = jArr[i10];
        int i11 = this.f14501t;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f14501t--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f14500s;
        System.arraycopy(jArr, i11, jArr, i10, this.f14501t - i11);
        this.f14501t -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        f(i10);
        long[] jArr = this.f14500s;
        long j = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14501t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
