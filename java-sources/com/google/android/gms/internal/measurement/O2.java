package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class O2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O2 f14091f = new O2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f14093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f14094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14095d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14096e;

    public O2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f14092a = i10;
        this.f14093b = iArr;
        this.f14094c = objArr;
        this.f14096e = z10;
    }

    public static O2 a() {
        return new O2(0, new int[8], new Object[8], true);
    }

    public final void b(C0902x2 c0902x2) {
        if (this.f14092a != 0) {
            for (int i10 = 0; i10 < this.f14092a; i10++) {
                int i11 = this.f14093b[i10];
                Object obj = this.f14094c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ((C0788a2) c0902x2.f14509r).l0(((Long) obj).longValue(), i13);
                } else if (i12 == 1) {
                    ((C0788a2) c0902x2.f14509r).m0(((Long) obj).longValue(), i13);
                } else if (i12 == 2) {
                    C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
                    c0788a2.q0((i13 << 3) | 2);
                    c0788a2.n0((Z1) obj);
                } else if (i12 == 3) {
                    ((C0788a2) c0902x2.f14509r).h0(i13, 3);
                    ((O2) obj).b(c0902x2);
                    ((C0788a2) c0902x2.f14509r).h0(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C0868q2());
                    }
                    ((C0788a2) c0902x2.f14509r).k0(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iW0;
        int iF0;
        int iW1;
        int i10 = this.f14095d;
        if (i10 != -1) {
            return i10;
        }
        int iP = 0;
        for (int i11 = 0; i11 < this.f14092a; i11++) {
            int i12 = this.f14093b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        int i15 = i13 << 3;
                        Z1 z10 = (Z1) this.f14094c[i11];
                        int iW2 = C0788a2.w0(i15);
                        int iD = z10.d();
                        iP = android.support.v4.media.session.p.p(iD, iD, iW2, iP);
                    } else if (i14 == 3) {
                        int iW3 = C0788a2.w0(i13 << 3);
                        iW0 = iW3 + iW3;
                        iF0 = ((O2) this.f14094c[i11]).c();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(new C0868q2());
                        }
                        ((Integer) this.f14094c[i11]).getClass();
                        iW1 = C0788a2.w0(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.f14094c[i11]).getClass();
                    iW1 = C0788a2.w0(i13 << 3) + 8;
                }
                iP = iW1 + iP;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f14094c[i11]).longValue();
                iW0 = C0788a2.w0(i16);
                iF0 = C0788a2.f0(jLongValue);
            }
            iP = iF0 + iW0 + iP;
        }
        this.f14095d = iP;
        return iP;
    }

    public final void d(int i10, Object obj) {
        if (!this.f14096e) {
            throw new UnsupportedOperationException();
        }
        e(this.f14092a + 1);
        int[] iArr = this.f14093b;
        int i11 = this.f14092a;
        iArr[i11] = i10;
        this.f14094c[i11] = obj;
        this.f14092a = i11 + 1;
    }

    public final void e(int i10) {
        int[] iArr = this.f14093b;
        if (i10 > iArr.length) {
            int i11 = this.f14092a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f14093b = Arrays.copyOf(iArr, i10);
            this.f14094c = Arrays.copyOf(this.f14094c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O2)) {
            return false;
        }
        O2 o10 = (O2) obj;
        int i10 = this.f14092a;
        if (i10 == o10.f14092a) {
            int[] iArr = this.f14093b;
            int[] iArr2 = o10.f14093b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f14094c;
            Object[] objArr2 = o10.f14094c;
            int i12 = this.f14092a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f14092a;
        int i11 = i10 + 527;
        int[] iArr = this.f14093b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f14094c;
        int i15 = this.f14092a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
