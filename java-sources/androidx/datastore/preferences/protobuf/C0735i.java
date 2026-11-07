package androidx.datastore.preferences.protobuf;

import I1.AbstractC0244b0;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0735i extends AbstractC0244b0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12463A = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FileInputStream f12464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final byte[] f12465u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12466v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12468x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12469y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12470z;

    public C0735i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0748w.f12518a;
        this.f12464t = fileInputStream;
        this.f12465u = new byte[4096];
        this.f12466v = 0;
        this.f12468x = 0;
        this.f12470z = 0;
    }

    @Override // I1.AbstractC0244b0
    public final int A() {
        return J();
    }

    @Override // I1.AbstractC0244b0
    public final long B() {
        return K();
    }

    @Override // I1.AbstractC0244b0
    public final boolean C(int i10) throws C0750y {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                O(8);
                return true;
            }
            if (i11 == 2) {
                O(J());
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
            O(4);
            return true;
        }
        int i13 = this.f12466v - this.f12468x;
        byte[] bArr = this.f12465u;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f12468x;
                this.f12468x = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw C0750y.c();
        }
        while (i12 < 10) {
            if (this.f12468x == this.f12466v) {
                N(1);
            }
            int i15 = this.f12468x;
            this.f12468x = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw C0750y.c();
        return true;
    }

    public final byte[] E(int i10) throws IOException {
        byte[] bArrF = F(i10);
        if (bArrF != null) {
            return bArrF;
        }
        int i11 = this.f12468x;
        int i12 = this.f12466v;
        int length = i12 - i11;
        this.f12470z += i12;
        this.f12468x = 0;
        this.f12466v = 0;
        ArrayList arrayListG = G(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f12465u, i11, bArr, 0, length);
        int size = arrayListG.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListG.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i10) throws IOException {
        if (i10 == 0) {
            return AbstractC0748w.f12519b;
        }
        if (i10 < 0) {
            throw C0750y.d();
        }
        int i11 = this.f12470z;
        int i12 = this.f12468x;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new C0750y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f12463A;
        if (i13 > i14) {
            O((i14 - i11) - i12);
            throw C0750y.e();
        }
        int i15 = this.f12466v - i12;
        int i16 = i10 - i15;
        FileInputStream fileInputStream = this.f12464t;
        if (i16 >= 4096) {
            try {
                if (i16 > fileInputStream.available()) {
                    return null;
                }
            } catch (C0750y e10) {
                e10.f12520r = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f12465u, this.f12468x, bArr, 0, i15);
        this.f12470z += this.f12466v;
        this.f12468x = 0;
        this.f12466v = 0;
        while (i15 < i10) {
            try {
                int i17 = fileInputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw C0750y.e();
                }
                this.f12470z += i17;
                i15 += i17;
            } catch (C0750y e11) {
                e11.f12520r = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f12464t.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw C0750y.e();
                }
                this.f12470z += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws C0750y {
        int i10 = this.f12468x;
        if (this.f12466v - i10 < 4) {
            N(4);
            i10 = this.f12468x;
        }
        this.f12468x = i10 + 4;
        byte[] bArr = this.f12465u;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long I() throws C0750y {
        int i10 = this.f12468x;
        if (this.f12466v - i10 < 8) {
            N(8);
            i10 = this.f12468x;
        }
        this.f12468x = i10 + 8;
        byte[] bArr = this.f12465u;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int J() {
        int i10;
        int i11 = this.f12468x;
        int i12 = this.f12466v;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f12465u;
            byte b5 = bArr[i11];
            if (b5 >= 0) {
                this.f12468x = i13;
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
                this.f12468x = i14;
                return i10;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j10;
        long j11;
        long j12;
        int i10 = this.f12468x;
        int i11 = this.f12466v;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f12465u;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.f12468x = i12;
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
                this.f12468x = i13;
                return j;
            }
        }
        return L();
    }

    public final long L() throws C0750y {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f12468x == this.f12466v) {
                N(1);
            }
            int i11 = this.f12468x;
            this.f12468x = i11 + 1;
            byte b5 = this.f12465u[i11];
            j |= ((long) (b5 & 127)) << i10;
            if ((b5 & 128) == 0) {
                return j;
            }
        }
        throw C0750y.c();
    }

    public final void M() {
        int i10 = this.f12466v + this.f12467w;
        this.f12466v = i10;
        int i11 = this.f12470z + i10;
        int i12 = this.f12463A;
        if (i11 <= i12) {
            this.f12467w = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f12467w = i13;
        this.f12466v = i10 - i13;
    }

    public final void N(int i10) throws C0750y {
        if (P(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f12470z) - this.f12468x) {
            throw C0750y.e();
        }
        throw new C0750y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i10) throws C0750y {
        int i11 = this.f12466v;
        int i12 = this.f12468x;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f12468x = i12 + i10;
            return;
        }
        FileInputStream fileInputStream = this.f12464t;
        if (i10 < 0) {
            throw C0750y.d();
        }
        int i14 = this.f12470z;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.f12463A;
        if (i16 > i17) {
            O((i17 - i14) - i12);
            throw C0750y.e();
        }
        this.f12470z = i15;
        this.f12466v = 0;
        this.f12468x = 0;
        while (i13 < i10) {
            long j = i10 - i13;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (C0750y e10) {
                    e10.f12520r = true;
                    throw e10;
                }
            } catch (Throwable th) {
                this.f12470z += i13;
                M();
                throw th;
            }
        }
        this.f12470z += i13;
        M();
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f12466v;
        int i19 = i18 - this.f12468x;
        this.f12468x = i18;
        N(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f12466v;
            if (i20 <= i21) {
                this.f12468x = i20;
                return;
            } else {
                i19 += i21;
                this.f12468x = i21;
                N(1);
            }
        }
    }

    public final boolean P(int i10) throws IOException {
        FileInputStream fileInputStream = this.f12464t;
        int i11 = this.f12468x;
        int i12 = i11 + i10;
        int i13 = this.f12466v;
        if (i12 <= i13) {
            throw new IllegalStateException(p245z2.a.B(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f12470z;
        if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.f12463A) {
            byte[] bArr = this.f12465u;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f12470z += i11;
                this.f12466v -= i11;
                this.f12468x = 0;
            }
            int i15 = this.f12466v;
            try {
                int i16 = fileInputStream.read(bArr, i15, Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f12470z) - i15));
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f12466v += i16;
                    M();
                    if (this.f12466v >= i10) {
                        return true;
                    }
                    return P(i10);
                }
            } catch (C0750y e10) {
                e10.f12520r = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // I1.AbstractC0244b0
    public final void a(int i10) throws C0750y {
        if (this.f12469y != i10) {
            throw new C0750y("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // I1.AbstractC0244b0
    public final int b() {
        return this.f12470z + this.f12468x;
    }

    @Override // I1.AbstractC0244b0
    public final boolean c() {
        return this.f12468x == this.f12466v && !P(1);
    }

    @Override // I1.AbstractC0244b0
    public final void h(int i10) {
        this.f12463A = i10;
        M();
    }

    @Override // I1.AbstractC0244b0
    public final int i(int i10) throws C0750y {
        if (i10 < 0) {
            throw C0750y.d();
        }
        int i11 = this.f12470z + this.f12468x + i10;
        if (i11 < 0) {
            throw new C0750y("Failed to parse the message.");
        }
        int i12 = this.f12463A;
        if (i11 > i12) {
            throw C0750y.e();
        }
        this.f12463A = i11;
        M();
        return i12;
    }

    @Override // I1.AbstractC0244b0
    public final boolean j() {
        return K() != 0;
    }

    @Override // I1.AbstractC0244b0
    public final C0733g k() throws IOException {
        int iJ = J();
        int i10 = this.f12466v;
        int i11 = this.f12468x;
        int i12 = i10 - i11;
        byte[] bArr = this.f12465u;
        if (iJ <= i12 && iJ > 0) {
            C0733g c0733gD = C0733g.d(bArr, i11, iJ);
            this.f12468x += iJ;
            return c0733gD;
        }
        if (iJ == 0) {
            return C0733g.f12451t;
        }
        if (iJ < 0) {
            throw C0750y.d();
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return C0733g.d(bArrF, 0, bArrF.length);
        }
        int i13 = this.f12468x;
        int i14 = this.f12466v;
        int length = i14 - i13;
        this.f12470z += i14;
        this.f12468x = 0;
        this.f12466v = 0;
        ArrayList arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        int size = arrayListG.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayListG.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0733g c0733g = C0733g.f12451t;
        return new C0733g(bArr2);
    }

    @Override // I1.AbstractC0244b0
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // I1.AbstractC0244b0
    public final int m() {
        return J();
    }

    @Override // I1.AbstractC0244b0
    public final int n() {
        return H();
    }

    @Override // I1.AbstractC0244b0
    public final long o() {
        return I();
    }

    @Override // I1.AbstractC0244b0
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // I1.AbstractC0244b0
    public final int r() {
        return J();
    }

    @Override // I1.AbstractC0244b0
    public final long s() {
        return K();
    }

    @Override // I1.AbstractC0244b0
    public final int t() {
        return H();
    }

    @Override // I1.AbstractC0244b0
    public final long u() {
        return I();
    }

    @Override // I1.AbstractC0244b0
    public final int v() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // I1.AbstractC0244b0
    public final long w() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }

    @Override // I1.AbstractC0244b0
    public final String x() throws C0750y {
        int iJ = J();
        byte[] bArr = this.f12465u;
        if (iJ > 0) {
            int i10 = this.f12466v;
            int i11 = this.f12468x;
            if (iJ <= i10 - i11) {
                String str = new String(bArr, i11, iJ, AbstractC0748w.f12518a);
                this.f12468x += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw C0750y.d();
        }
        if (iJ > this.f12466v) {
            return new String(E(iJ), AbstractC0748w.f12518a);
        }
        N(iJ);
        String str2 = new String(bArr, this.f12468x, iJ, AbstractC0748w.f12518a);
        this.f12468x += iJ;
        return str2;
    }

    @Override // I1.AbstractC0244b0
    public final String y() throws IOException {
        int iJ = J();
        int i10 = this.f12468x;
        int i11 = this.f12466v;
        int i12 = i11 - i10;
        byte[] bArrE = this.f12465u;
        if (iJ <= i12 && iJ > 0) {
            this.f12468x = i10 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw C0750y.d();
            }
            i10 = 0;
            if (iJ <= i11) {
                N(iJ);
                this.f12468x = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return m0.f12487a.m(bArrE, i10, iJ);
    }

    @Override // I1.AbstractC0244b0
    public final int z() throws C0750y {
        if (c()) {
            this.f12469y = 0;
            return 0;
        }
        int iJ = J();
        this.f12469y = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new C0750y("Protocol message contained an invalid tag (zero).");
    }
}
