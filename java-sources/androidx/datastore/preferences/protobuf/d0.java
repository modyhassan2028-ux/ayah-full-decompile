package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f12442f = new d0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f12445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12446d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12447e;

    public d0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f12443a = i10;
        this.f12444b = iArr;
        this.f12445c = objArr;
        this.f12447e = z10;
    }

    public final void a(int i10) {
        int[] iArr = this.f12444b;
        if (i10 > iArr.length) {
            int i11 = this.f12443a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f12444b = Arrays.copyOf(iArr, i10);
            this.f12445c = Arrays.copyOf(this.f12445c, i10);
        }
    }

    public final int b() {
        int iZ;
        int iB0;
        int iZ2;
        int i10 = this.f12446d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12443a; i12++) {
            int i13 = this.f12444b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f12445c[i12]).getClass();
                    iZ2 = C0737k.Z(i14) + 8;
                } else if (i15 == 2) {
                    iZ2 = C0737k.X(i14, (C0733g) this.f12445c[i12]);
                } else if (i15 == 3) {
                    iZ = C0737k.Z(i14) * 2;
                    iB0 = ((d0) this.f12445c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(C0750y.b());
                    }
                    ((Integer) this.f12445c[i12]).getClass();
                    iZ2 = C0737k.Z(i14) + 4;
                }
                i11 = iZ2 + i11;
            } else {
                long jLongValue = ((Long) this.f12445c[i12]).longValue();
                iZ = C0737k.Z(i14);
                iB0 = C0737k.b0(jLongValue);
            }
            i11 = iB0 + iZ + i11;
        }
        this.f12446d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f12447e) {
            throw new UnsupportedOperationException();
        }
        a(this.f12443a + 1);
        int[] iArr = this.f12444b;
        int i11 = this.f12443a;
        iArr[i11] = i10;
        this.f12445c[i11] = obj;
        this.f12443a = i11 + 1;
    }

    public final void d(E e10) {
        if (this.f12443a == 0) {
            return;
        }
        e10.getClass();
        C0737k c0737k = (C0737k) e10.f12378a;
        for (int i10 = 0; i10 < this.f12443a; i10++) {
            int i11 = this.f12444b[i10];
            Object obj = this.f12445c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c0737k.v0(((Long) obj).longValue(), i12);
            } else if (i13 == 1) {
                c0737k.l0(((Long) obj).longValue(), i12);
            } else if (i13 == 2) {
                c0737k.h0(i12, (C0733g) obj);
            } else if (i13 == 3) {
                c0737k.s0(i12, 3);
                ((d0) obj).d(e10);
                c0737k.s0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(C0750y.b());
                }
                c0737k.j0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i10 = this.f12443a;
        if (i10 == d0Var.f12443a) {
            int[] iArr = this.f12444b;
            int[] iArr2 = d0Var.f12444b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f12445c;
            Object[] objArr2 = d0Var.f12445c;
            int i12 = this.f12443a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12443a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f12444b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f12445c;
        int i15 = this.f12443a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
