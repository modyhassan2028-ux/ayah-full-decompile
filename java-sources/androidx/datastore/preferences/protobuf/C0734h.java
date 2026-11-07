package androidx.datastore.preferences.protobuf;

import I1.AbstractC0244b0;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0734h extends AbstractC0244b0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f12456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12462z = Integer.MAX_VALUE;

    public C0734h(byte[] bArr, int i10, int i11, boolean z10) {
        this.f12456t = bArr;
        this.f12457u = i11 + i10;
        this.f12459w = i10;
        this.f12460x = i10;
    }

    @Override // I1.AbstractC0244b0
    public final int A() {
        return G();
    }

    @Override // I1.AbstractC0244b0
    public final long B() {
        return H();
    }

    @Override // I1.AbstractC0244b0
    public final boolean C(int i10) throws C0750y {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                K(8);
                return true;
            }
            if (i11 == 2) {
                K(G());
                return true;
            }
            if (i11 == 3) {
                D();
                a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw C0750y.b();
            }
            K(4);
            return true;
        }
        int i13 = this.f12457u - this.f12459w;
        byte[] bArr = this.f12456t;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f12459w;
                this.f12459w = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw C0750y.c();
        }
        while (i12 < 10) {
            int i15 = this.f12459w;
            if (i15 == this.f12457u) {
                throw C0750y.e();
            }
            this.f12459w = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw C0750y.c();
        return true;
    }

    public final int E() throws C0750y {
        int i10 = this.f12459w;
        if (this.f12457u - i10 < 4) {
            throw C0750y.e();
        }
        this.f12459w = i10 + 4;
        byte[] bArr = this.f12456t;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long F() throws C0750y {
        int i10 = this.f12459w;
        if (this.f12457u - i10 < 8) {
            throw C0750y.e();
        }
        this.f12459w = i10 + 8;
        byte[] bArr = this.f12456t;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int G() {
        int i10;
        int i11 = this.f12459w;
        int i12 = this.f12457u;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f12456t;
            byte b5 = bArr[i11];
            if (b5 >= 0) {
                this.f12459w = i13;
                return b5;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b5;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b10 = bArr[i18];
                            int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f12459w = i14;
                return i10;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j10;
        long j11;
        long j12;
        int i10 = this.f12459w;
        int i11 = this.f12457u;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f12456t;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.f12459w = i12;
                return b5;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b5;
                if (i14 < 0) {
                    j = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j12 = (-2080896) ^ i18;
                        } else {
                            long j13 = i18;
                            i13 = i10 + 5;
                            long j14 = j13 ^ (((long) bArr[i17]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j15 = j14 ^ (((long) bArr[i13]) << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j14 = j15 ^ (((long) bArr[i17]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j15 = j14 ^ (((long) bArr[i13]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j = j11 ^ j14;
                        }
                        i13 = i17;
                        j = j12;
                    }
                }
                this.f12459w = i13;
                return j;
            }
        }
        return I();
    }

    public final long I() throws C0750y {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f12459w;
            if (i11 == this.f12457u) {
                throw C0750y.e();
            }
            this.f12459w = i11 + 1;
            byte b5 = this.f12456t[i11];
            j |= ((long) (b5 & 127)) << i10;
            if ((b5 & 128) == 0) {
                return j;
            }
        }
        throw C0750y.c();
    }

    public final void J() {
        int i10 = this.f12457u + this.f12458v;
        this.f12457u = i10;
        int i11 = i10 - this.f12460x;
        int i12 = this.f12462z;
        if (i11 <= i12) {
            this.f12458v = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f12458v = i13;
        this.f12457u = i10 - i13;
    }

    public final void K(int i10) throws C0750y {
        if (i10 >= 0) {
            int i11 = this.f12457u;
            int i12 = this.f12459w;
            if (i10 <= i11 - i12) {
                this.f12459w = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw C0750y.e();
        }
        throw C0750y.d();
    }

    @Override // I1.AbstractC0244b0
    public final void a(int i10) throws C0750y {
        if (this.f12461y != i10) {
            throw new C0750y("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // I1.AbstractC0244b0
    public final int b() {
        return this.f12459w - this.f12460x;
    }

    @Override // I1.AbstractC0244b0
    public final boolean c() {
        return this.f12459w == this.f12457u;
    }

    @Override // I1.AbstractC0244b0
    public final void h(int i10) {
        this.f12462z = i10;
        J();
    }

    @Override // I1.AbstractC0244b0
    public final int i(int i10) throws C0750y {
        if (i10 < 0) {
            throw C0750y.d();
        }
        int iB = b() + i10;
        if (iB < 0) {
            throw new C0750y("Failed to parse the message.");
        }
        int i11 = this.f12462z;
        if (iB > i11) {
            throw C0750y.e();
        }
        this.f12462z = iB;
        J();
        return i11;
    }

    @Override // I1.AbstractC0244b0
    public final boolean j() {
        return H() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // I1.AbstractC0244b0
    public final C0733g k() throws C0750y {
        byte[] bArrCopyOfRange;
        int iG = G();
        byte[] bArr = this.f12456t;
        if (iG > 0) {
            int i10 = this.f12457u;
            int i11 = this.f12459w;
            if (iG <= i10 - i11) {
                C0733g c0733gD = C0733g.d(bArr, i11, iG);
                this.f12459w += iG;
                return c0733gD;
            }
        }
        if (iG == 0) {
            return C0733g.f12451t;
        }
        if (iG > 0) {
            int i12 = this.f12457u;
            int i13 = this.f12459w;
            if (iG <= i12 - i13) {
                int i14 = iG + i13;
                this.f12459w = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iG <= 0) {
                    throw C0750y.e();
                }
                if (iG == 0) {
                    throw C0750y.d();
                }
                bArrCopyOfRange = AbstractC0748w.f12519b;
            }
        } else {
            if (iG <= 0) {
                throw C0750y.e();
            }
            if (iG == 0) {
                throw C0750y.d();
            }
            bArrCopyOfRange = AbstractC0748w.f12519b;
        }
        C0733g c0733g = C0733g.f12451t;
        return new C0733g(bArrCopyOfRange);
    }

    @Override // I1.AbstractC0244b0
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // I1.AbstractC0244b0
    public final int m() {
        return G();
    }

    @Override // I1.AbstractC0244b0
    public final int n() {
        return E();
    }

    @Override // I1.AbstractC0244b0
    public final long o() {
        return F();
    }

    @Override // I1.AbstractC0244b0
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // I1.AbstractC0244b0
    public final int r() {
        return G();
    }

    @Override // I1.AbstractC0244b0
    public final long s() {
        return H();
    }

    @Override // I1.AbstractC0244b0
    public final int t() {
        return E();
    }

    @Override // I1.AbstractC0244b0
    public final long u() {
        return F();
    }

    @Override // I1.AbstractC0244b0
    public final int v() {
        int iG = G();
        return (-(iG & 1)) ^ (iG >>> 1);
    }

    @Override // I1.AbstractC0244b0
    public final long w() {
        long jH = H();
        return (-(jH & 1)) ^ (jH >>> 1);
    }

    @Override // I1.AbstractC0244b0
    public final String x() throws C0750y {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f12457u;
            int i11 = this.f12459w;
            if (iG <= i10 - i11) {
                String str = new String(this.f12456t, i11, iG, AbstractC0748w.f12518a);
                this.f12459w += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw C0750y.d();
        }
        throw C0750y.e();
    }

    @Override // I1.AbstractC0244b0
    public final String y() throws C0750y {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f12457u;
            int i11 = this.f12459w;
            if (iG <= i10 - i11) {
                String strM = m0.f12487a.m(this.f12456t, i11, iG);
                this.f12459w += iG;
                return strM;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw C0750y.d();
        }
        throw C0750y.e();
    }

    @Override // I1.AbstractC0244b0
    public final int z() throws C0750y {
        if (c()) {
            this.f12461y = 0;
            return 0;
        }
        int iG = G();
        this.f12461y = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new C0750y("Protocol message contained an invalid tag (zero).");
    }
}
