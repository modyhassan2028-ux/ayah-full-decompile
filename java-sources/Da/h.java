package Da;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j, i, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f1361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1362s;

    public final String A(long j, Charset charset) throws EOFException {
        p251z9.j.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f1362s < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        u uVar = this.f1361r;
        p251z9.j.b(uVar);
        int i10 = uVar.f1396b;
        if (((long) i10) + j > uVar.f1397c) {
            return new String(s(j), charset);
        }
        int i11 = (int) j;
        String str = new String(uVar.f1395a, i10, i11, charset);
        int i12 = uVar.f1396b + i11;
        uVar.f1396b = i12;
        this.f1362s -= j;
        if (i12 == uVar.f1397c) {
            this.f1361r = uVar.a();
            v.a(uVar);
        }
        return str;
    }

    public final String E() {
        return A(this.f1362s, H9.a.f3610a);
    }

    public final k F(int i10) {
        if (i10 == 0) {
            return k.f1363u;
        }
        F9.n.m(this.f1362s, 0L, i10);
        u uVar = this.f1361r;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            p251z9.j.b(uVar);
            int i14 = uVar.f1397c;
            int i15 = uVar.f1396b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            uVar = uVar.f1400f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        u uVar2 = this.f1361r;
        int i16 = 0;
        while (i11 < i10) {
            p251z9.j.b(uVar2);
            bArr[i16] = uVar2.f1395a;
            i11 += uVar2.f1397c - uVar2.f1396b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = uVar2.f1396b;
            uVar2.f1398d = true;
            i16++;
            uVar2 = uVar2.f1400f;
        }
        return new w(bArr, iArr);
    }

    @Override // Da.j
    public final String G(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j10 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jI = i(0L, j10, (byte) 10);
        if (jI != -1) {
            return Ea.a.c(jI, this);
        }
        if (j10 < this.f1362s && e(j10 - 1) == 13 && e(j10) == 10) {
            return Ea.a.c(j10, this);
        }
        h hVar = new h();
        b(hVar, 0L, Math.min(32, this.f1362s));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f1362s, j) + " content=" + hVar.k(hVar.f1362s).b() + (char) 8230);
    }

    public final u H(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        u uVar = this.f1361r;
        if (uVar == null) {
            u uVarB = v.b();
            this.f1361r = uVarB;
            uVarB.g = uVarB;
            uVarB.f1400f = uVarB;
            return uVarB;
        }
        u uVar2 = uVar.g;
        p251z9.j.b(uVar2);
        if (uVar2.f1397c + i10 <= 8192 && uVar2.f1399e) {
            return uVar2;
        }
        u uVarB2 = v.b();
        uVar2.b(uVarB2);
        return uVarB2;
    }

    @Override // Da.j
    public final long K(k kVar) {
        p251z9.j.e(kVar, "targetBytes");
        return n(kVar, 0L);
    }

    public final void L(int i10, byte[] bArr) {
        p251z9.j.e(bArr, "source");
        int i11 = 0;
        long j = i10;
        F9.n.m(bArr.length, 0, j);
        while (i11 < i10) {
            u uVarH = H(1);
            int iMin = Math.min(i10 - i11, 8192 - uVarH.f1397c);
            int i12 = i11 + iMin;
            p120l9.l.V(uVarH.f1397c, i11, i12, bArr, uVarH.f1395a);
            uVarH.f1397c += iMin;
            i11 = i12;
        }
        this.f1362s += j;
    }

    public final void N(k kVar) {
        p251z9.j.e(kVar, "byteString");
        kVar.l(this, kVar.a());
    }

    public final void O(int i10) {
        u uVarH = H(1);
        byte[] bArr = uVarH.f1395a;
        int i11 = uVarH.f1397c;
        uVarH.f1397c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f1362s++;
    }

    @Override // Da.j
    public final int Q(p pVar) throws EOFException {
        int iD = Ea.a.d(this, pVar, false);
        if (iD == -1) {
            return -1;
        }
        skip(pVar.f1378r[iD].a());
        return iD;
    }

    @Override // Da.j
    public final void S(long j) throws EOFException {
        if (this.f1362s < j) {
            throw new EOFException();
        }
    }

    @Override // Da.i
    public final /* bridge */ /* synthetic */ i T(String str) {
        d0(str);
        return this;
    }

    public final void V(long j) {
        boolean z10;
        if (j == 0) {
            O(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                d0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        byte[] bArr = Ea.a.f2003a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i10 = iNumberOfLeadingZeros + (j > Ea.a.f2004b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z10) {
            i10++;
        }
        u uVarH = H(i10);
        byte[] bArr2 = uVarH.f1395a;
        int i11 = uVarH.f1397c + i10;
        while (j != 0) {
            long j10 = 10;
            i11--;
            bArr2[i11] = Ea.a.f2003a[(int) (j % j10)];
            j /= j10;
        }
        if (z10) {
            bArr2[i11 - 1] = 45;
        }
        uVarH.f1397c += i10;
        this.f1362s += (long) i10;
    }

    @Override // Da.i
    public final long W(y yVar) {
        p251z9.j.e(yVar, "source");
        long j = 0;
        while (true) {
            long jO = yVar.o(8192L, this);
            if (jO == -1) {
                return j;
            }
            j += jO;
        }
    }

    public final void X(long j) {
        if (j == 0) {
            O(48);
            return;
        }
        long j10 = (j >>> 1) | j;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        u uVarH = H(i10);
        byte[] bArr = uVarH.f1395a;
        int i11 = uVarH.f1397c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = Ea.a.f2003a[(int) (15 & j)];
            j >>>= 4;
        }
        uVarH.f1397c += i10;
        this.f1362s += (long) i10;
    }

    @Override // Da.j
    public final long Y() throws EOFException {
        int i10;
        if (this.f1362s == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j = 0;
        do {
            u uVar = this.f1361r;
            p251z9.j.b(uVar);
            byte[] bArr = uVar.f1395a;
            int i12 = uVar.f1396b;
            int i13 = uVar.f1397c;
            while (i12 < i13) {
                byte b5 = bArr[i12];
                if (b5 >= 48 && b5 <= 57) {
                    i10 = b5 - 48;
                } else if (b5 >= 97 && b5 <= 102) {
                    i10 = b5 - 87;
                } else {
                    if (b5 < 65 || b5 > 70) {
                        if (i11 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(F9.n.V(b5)));
                        }
                        z10 = true;
                        break;
                    }
                    i10 = b5 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    h hVar = new h();
                    hVar.X(j);
                    hVar.O(b5);
                    throw new NumberFormatException("Number too large: ".concat(hVar.E()));
                }
                j = (j << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f1361r = uVar.a();
                v.a(uVar);
            } else {
                uVar.f1396b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f1361r != null);
        this.f1362s -= (long) i11;
        return j;
    }

    @Override // Da.x
    public final void Z(long j, h hVar) {
        u uVarB;
        p251z9.j.e(hVar, "source");
        if (hVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        F9.n.m(hVar.f1362s, 0L, j);
        while (j > 0) {
            u uVar = hVar.f1361r;
            p251z9.j.b(uVar);
            int i10 = uVar.f1397c;
            u uVar2 = hVar.f1361r;
            p251z9.j.b(uVar2);
            long j10 = i10 - uVar2.f1396b;
            int i11 = 0;
            if (j < j10) {
                u uVar3 = this.f1361r;
                u uVar4 = uVar3 != null ? uVar3.g : null;
                if (uVar4 != null && uVar4.f1399e) {
                    if ((((long) uVar4.f1397c) + j) - ((long) (uVar4.f1398d ? 0 : uVar4.f1396b)) <= 8192) {
                        u uVar5 = hVar.f1361r;
                        p251z9.j.b(uVar5);
                        uVar5.d(uVar4, (int) j);
                        hVar.f1362s -= j;
                        this.f1362s += j;
                        return;
                    }
                }
                u uVar6 = hVar.f1361r;
                p251z9.j.b(uVar6);
                int i12 = (int) j;
                if (i12 <= 0 || i12 > uVar6.f1397c - uVar6.f1396b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    uVarB = uVar6.c();
                } else {
                    uVarB = v.b();
                    byte[] bArr = uVar6.f1395a;
                    byte[] bArr2 = uVarB.f1395a;
                    int i13 = uVar6.f1396b;
                    p120l9.l.V(0, i13, i13 + i12, bArr, bArr2);
                }
                uVarB.f1397c = uVarB.f1396b + i12;
                uVar6.f1396b += i12;
                u uVar7 = uVar6.g;
                p251z9.j.b(uVar7);
                uVar7.b(uVarB);
                hVar.f1361r = uVarB;
            }
            u uVar8 = hVar.f1361r;
            p251z9.j.b(uVar8);
            long j11 = uVar8.f1397c - uVar8.f1396b;
            hVar.f1361r = uVar8.a();
            u uVar9 = this.f1361r;
            if (uVar9 == null) {
                this.f1361r = uVar8;
                uVar8.g = uVar8;
                uVar8.f1400f = uVar8;
            } else {
                u uVar10 = uVar9.g;
                p251z9.j.b(uVar10);
                uVar10.b(uVar8);
                u uVar11 = uVar8.g;
                if (uVar11 == uVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                p251z9.j.b(uVar11);
                if (uVar11.f1399e) {
                    int i14 = uVar8.f1397c - uVar8.f1396b;
                    u uVar12 = uVar8.g;
                    p251z9.j.b(uVar12);
                    int i15 = 8192 - uVar12.f1397c;
                    u uVar13 = uVar8.g;
                    p251z9.j.b(uVar13);
                    if (!uVar13.f1398d) {
                        u uVar14 = uVar8.g;
                        p251z9.j.b(uVar14);
                        i11 = uVar14.f1396b;
                    }
                    if (i14 <= i15 + i11) {
                        u uVar15 = uVar8.g;
                        p251z9.j.b(uVar15);
                        uVar8.d(uVar15, i14);
                        uVar8.a();
                        v.a(uVar8);
                    }
                }
            }
            hVar.f1362s -= j11;
            this.f1362s += j11;
            j -= j11;
        }
    }

    public final void b(h hVar, long j, long j10) {
        p251z9.j.e(hVar, "out");
        long j11 = j;
        F9.n.m(this.f1362s, j11, j10);
        if (j10 == 0) {
            return;
        }
        hVar.f1362s += j10;
        u uVar = this.f1361r;
        while (true) {
            p251z9.j.b(uVar);
            long j12 = uVar.f1397c - uVar.f1396b;
            if (j11 < j12) {
                break;
            }
            j11 -= j12;
            uVar = uVar.f1400f;
        }
        u uVar2 = uVar;
        long j13 = j10;
        while (j13 > 0) {
            p251z9.j.b(uVar2);
            u uVarC = uVar2.c();
            int i10 = uVarC.f1396b + ((int) j11);
            uVarC.f1396b = i10;
            uVarC.f1397c = Math.min(i10 + ((int) j13), uVarC.f1397c);
            u uVar3 = hVar.f1361r;
            if (uVar3 == null) {
                uVarC.g = uVarC;
                uVarC.f1400f = uVarC;
                hVar.f1361r = uVarC;
            } else {
                u uVar4 = uVar3.g;
                p251z9.j.b(uVar4);
                uVar4.b(uVarC);
            }
            j13 -= (long) (uVarC.f1397c - uVarC.f1396b);
            uVar2 = uVar2.f1400f;
            j11 = 0;
        }
    }

    public final void b0(int i10) {
        u uVarH = H(4);
        byte[] bArr = uVarH.f1395a;
        int i11 = uVarH.f1397c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        uVarH.f1397c = i11 + 4;
        this.f1362s += 4;
    }

    public final void c0(int i10) {
        u uVarH = H(2);
        byte[] bArr = uVarH.f1395a;
        int i11 = uVarH.f1397c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        uVarH.f1397c = i11 + 2;
        this.f1362s += 2;
    }

    public final Object clone() {
        h hVar = new h();
        if (this.f1362s == 0) {
            return hVar;
        }
        u uVar = this.f1361r;
        p251z9.j.b(uVar);
        u uVarC = uVar.c();
        hVar.f1361r = uVarC;
        uVarC.g = uVarC;
        uVarC.f1400f = uVarC;
        for (u uVar2 = uVar.f1400f; uVar2 != uVar; uVar2 = uVar2.f1400f) {
            u uVar3 = uVarC.g;
            p251z9.j.b(uVar3);
            p251z9.j.b(uVar2);
            uVar3.b(uVar2.c());
        }
        hVar.f1362s = this.f1362s;
        return hVar;
    }

    @Override // Da.y
    public final A d() {
        return A.f1341d;
    }

    public final void d0(String str) {
        p251z9.j.e(str, "string");
        e0(str, 0, str.length());
    }

    public final byte e(long j) {
        F9.n.m(this.f1362s, j, 1L);
        u uVar = this.f1361r;
        if (uVar == null) {
            p251z9.j.b(null);
            throw null;
        }
        long j10 = this.f1362s;
        if (j10 - j < j) {
            while (j10 > j) {
                uVar = uVar.g;
                p251z9.j.b(uVar);
                j10 -= (long) (uVar.f1397c - uVar.f1396b);
            }
            return uVar.f1395a[(int) ((((long) uVar.f1396b) + j) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i10 = uVar.f1397c;
            int i11 = uVar.f1396b;
            long j12 = ((long) (i10 - i11)) + j11;
            if (j12 > j) {
                return uVar.f1395a[(int) ((((long) i11) + j) - j11)];
            }
            uVar = uVar.f1400f;
            p251z9.j.b(uVar);
            j11 = j12;
        }
    }

    public final void e0(String str, int i10, int i11) {
        char cCharAt;
        p251z9.j.e(str, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(p123m2.c.r(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(i11, i10, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i11 > str.length()) {
            StringBuilder sbW = p123m2.c.w(i11, "endIndex > string.length: ", " > ");
            sbW.append(str.length());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                u uVarH = H(1);
                byte[] bArr = uVarH.f1395a;
                int i12 = uVarH.f1397c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = uVarH.f1397c;
                int i15 = (i12 + i10) - i14;
                uVarH.f1397c = i14 + i15;
                this.f1362s += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    u uVarH2 = H(2);
                    byte[] bArr2 = uVarH2.f1395a;
                    int i16 = uVarH2.f1397c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    uVarH2.f1397c = i16 + 2;
                    this.f1362s += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    u uVarH3 = H(3);
                    byte[] bArr3 = uVarH3.f1395a;
                    int i17 = uVarH3.f1397c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    uVarH3.f1397c = i17 + 3;
                    this.f1362s += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        O(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        u uVarH4 = H(4);
                        byte[] bArr4 = uVarH4.f1395a;
                        int i20 = uVarH4.f1397c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        uVarH4.f1397c = i20 + 4;
                        this.f1362s += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        long j = this.f1362s;
        h hVar = (h) obj;
        if (j != hVar.f1362s) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        u uVar = this.f1361r;
        p251z9.j.b(uVar);
        u uVar2 = hVar.f1361r;
        p251z9.j.b(uVar2);
        int i10 = uVar.f1396b;
        int i11 = uVar2.f1396b;
        long j10 = 0;
        while (j10 < this.f1362s) {
            long jMin = Math.min(uVar.f1397c - i10, uVar2.f1397c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (uVar.f1395a[i10] != uVar2.f1395a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == uVar.f1397c) {
                uVar = uVar.f1400f;
                p251z9.j.b(uVar);
                i10 = uVar.f1396b;
            }
            if (i11 == uVar2.f1397c) {
                uVar2 = uVar2.f1400f;
                p251z9.j.b(uVar2);
                i11 = uVar2.f1396b;
            }
            j10 += jMin;
        }
        return true;
    }

    public final void f0(int i10) {
        if (i10 < 128) {
            O(i10);
            return;
        }
        if (i10 < 2048) {
            u uVarH = H(2);
            byte[] bArr = uVarH.f1395a;
            int i11 = uVarH.f1397c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            uVarH.f1397c = i11 + 2;
            this.f1362s += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            O(63);
            return;
        }
        if (i10 < 65536) {
            u uVarH2 = H(3);
            byte[] bArr2 = uVarH2.f1395a;
            int i12 = uVarH2.f1397c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            uVarH2.f1397c = i12 + 3;
            this.f1362s += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(F9.n.W(i10)));
        }
        u uVarH3 = H(4);
        byte[] bArr3 = uVarH3.f1395a;
        int i13 = uVarH3.f1397c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        uVarH3.f1397c = i13 + 4;
        this.f1362s += 4;
    }

    @Override // Da.j
    public final long g(k kVar) {
        p251z9.j.e(kVar, "bytes");
        byte[] bArr = Ea.a.f2003a;
        return Ea.a.a(this, kVar, 0L, Long.MAX_VALUE, kVar.a());
    }

    @Override // Da.i
    public final /* bridge */ /* synthetic */ i h(String str, int i10, int i11) {
        e0(str, i10, i11);
        return this;
    }

    public final int hashCode() {
        u uVar = this.f1361r;
        if (uVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = uVar.f1397c;
            for (int i12 = uVar.f1396b; i12 < i11; i12++) {
                i10 = (i10 * 31) + uVar.f1395a[i12];
            }
            uVar = uVar.f1400f;
            p251z9.j.b(uVar);
        } while (uVar != this.f1361r);
        return i10;
    }

    public final long i(long j, long j10, byte b5) {
        u uVar;
        long j11 = 0;
        if (0 > j || j > j10) {
            throw new IllegalArgumentException(("size=" + this.f1362s + " fromIndex=" + j + " toIndex=" + j10).toString());
        }
        long j12 = this.f1362s;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j == j10 || (uVar = this.f1361r) == null) {
            return -1L;
        }
        if (j12 - j < j) {
            while (j12 > j) {
                uVar = uVar.g;
                p251z9.j.b(uVar);
                j12 -= (long) (uVar.f1397c - uVar.f1396b);
            }
            while (j12 < j10) {
                byte[] bArr = uVar.f1395a;
                int iMin = (int) Math.min(uVar.f1397c, (((long) uVar.f1396b) + j10) - j12);
                for (int i10 = (int) ((((long) uVar.f1396b) + j) - j12); i10 < iMin; i10++) {
                    if (bArr[i10] == b5) {
                        return ((long) (i10 - uVar.f1396b)) + j12;
                    }
                }
                j12 += (long) (uVar.f1397c - uVar.f1396b);
                uVar = uVar.f1400f;
                p251z9.j.b(uVar);
                j = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = ((long) (uVar.f1397c - uVar.f1396b)) + j11;
            if (j13 > j) {
                break;
            }
            uVar = uVar.f1400f;
            p251z9.j.b(uVar);
            j11 = j13;
        }
        while (j11 < j10) {
            byte[] bArr2 = uVar.f1395a;
            int iMin2 = (int) Math.min(uVar.f1397c, (((long) uVar.f1396b) + j10) - j11);
            for (int i11 = (int) ((((long) uVar.f1396b) + j) - j11); i11 < iMin2; i11++) {
                if (bArr2[i11] == b5) {
                    return ((long) (i11 - uVar.f1396b)) + j11;
                }
            }
            j11 += (long) (uVar.f1397c - uVar.f1396b);
            uVar = uVar.f1400f;
            p251z9.j.b(uVar);
            j = j11;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // Da.j
    public final k k(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f1362s < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new k(s(j));
        }
        k kVarF = F((int) j);
        skip(j);
        return kVarF;
    }

    public final long n(k kVar, long j) {
        p251z9.j.e(kVar, "targetBytes");
        long j10 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        u uVar = this.f1361r;
        if (uVar == null) {
            return -1L;
        }
        long j11 = this.f1362s;
        if (j11 - j < j) {
            while (j11 > j) {
                uVar = uVar.g;
                p251z9.j.b(uVar);
                j11 -= (long) (uVar.f1397c - uVar.f1396b);
            }
            if (kVar.a() == 2) {
                byte bD = kVar.d(0);
                byte bD2 = kVar.d(1);
                while (j11 < this.f1362s) {
                    byte[] bArr = uVar.f1395a;
                    int i10 = uVar.f1397c;
                    for (int i11 = (int) ((((long) uVar.f1396b) + j) - j11); i11 < i10; i11++) {
                        byte b5 = bArr[i11];
                        if (b5 == bD || b5 == bD2) {
                            return ((long) (i11 - uVar.f1396b)) + j11;
                        }
                    }
                    j11 += (long) (uVar.f1397c - uVar.f1396b);
                    uVar = uVar.f1400f;
                    p251z9.j.b(uVar);
                    j = j11;
                }
            } else {
                byte[] bArrC = kVar.c();
                while (j11 < this.f1362s) {
                    byte[] bArr2 = uVar.f1395a;
                    int i12 = uVar.f1397c;
                    for (int i13 = (int) ((((long) uVar.f1396b) + j) - j11); i13 < i12; i13++) {
                        byte b10 = bArr2[i13];
                        for (byte b11 : bArrC) {
                            if (b10 == b11) {
                                return ((long) (i13 - uVar.f1396b)) + j11;
                            }
                        }
                    }
                    j11 += (long) (uVar.f1397c - uVar.f1396b);
                    uVar = uVar.f1400f;
                    p251z9.j.b(uVar);
                    j = j11;
                }
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (uVar.f1397c - uVar.f1396b)) + j10;
            if (j12 > j) {
                break;
            }
            uVar = uVar.f1400f;
            p251z9.j.b(uVar);
            j10 = j12;
        }
        if (kVar.a() == 2) {
            byte bD3 = kVar.d(0);
            byte bD4 = kVar.d(1);
            while (j10 < this.f1362s) {
                byte[] bArr3 = uVar.f1395a;
                int i14 = uVar.f1397c;
                for (int i15 = (int) ((((long) uVar.f1396b) + j) - j10); i15 < i14; i15++) {
                    byte b12 = bArr3[i15];
                    if (b12 == bD3 || b12 == bD4) {
                        return ((long) (i15 - uVar.f1396b)) + j10;
                    }
                }
                j10 += (long) (uVar.f1397c - uVar.f1396b);
                uVar = uVar.f1400f;
                p251z9.j.b(uVar);
                j = j10;
            }
        } else {
            byte[] bArrC2 = kVar.c();
            while (j10 < this.f1362s) {
                byte[] bArr4 = uVar.f1395a;
                int i16 = uVar.f1397c;
                for (int i17 = (int) ((((long) uVar.f1396b) + j) - j10); i17 < i16; i17++) {
                    byte b13 = bArr4[i17];
                    for (byte b14 : bArrC2) {
                        if (b13 == b14) {
                            return ((long) (i17 - uVar.f1396b)) + j10;
                        }
                    }
                }
                j10 += (long) (uVar.f1397c - uVar.f1396b);
                uVar = uVar.f1400f;
                p251z9.j.b(uVar);
                j = j10;
            }
        }
        return -1L;
    }

    @Override // Da.y
    public final long o(long j, h hVar) {
        p251z9.j.e(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        long j10 = this.f1362s;
        if (j10 == 0) {
            return -1L;
        }
        if (j > j10) {
            j = j10;
        }
        hVar.Z(j, this);
        return j;
    }

    @Override // Da.j
    public final t peek() {
        return Y2.a.p(new q(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        p251z9.j.e(byteBuffer, "sink");
        u uVar = this.f1361r;
        if (uVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), uVar.f1397c - uVar.f1396b);
        byteBuffer.put(uVar.f1395a, uVar.f1396b, iMin);
        int i10 = uVar.f1396b + iMin;
        uVar.f1396b = i10;
        this.f1362s -= (long) iMin;
        if (i10 == uVar.f1397c) {
            this.f1361r = uVar.a();
            v.a(uVar);
        }
        return iMin;
    }

    @Override // Da.j
    public final byte readByte() throws EOFException {
        if (this.f1362s == 0) {
            throw new EOFException();
        }
        u uVar = this.f1361r;
        p251z9.j.b(uVar);
        int i10 = uVar.f1396b;
        int i11 = uVar.f1397c;
        int i12 = i10 + 1;
        byte b5 = uVar.f1395a[i10];
        this.f1362s--;
        if (i12 != i11) {
            uVar.f1396b = i12;
            return b5;
        }
        this.f1361r = uVar.a();
        v.a(uVar);
        return b5;
    }

    @Override // Da.j
    public final int readInt() throws EOFException {
        if (this.f1362s < 4) {
            throw new EOFException();
        }
        u uVar = this.f1361r;
        p251z9.j.b(uVar);
        int i10 = uVar.f1396b;
        int i11 = uVar.f1397c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = uVar.f1395a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f1362s -= 4;
        if (i14 != i11) {
            uVar.f1396b = i14;
            return i15;
        }
        this.f1361r = uVar.a();
        v.a(uVar);
        return i15;
    }

    @Override // Da.j
    public final short readShort() throws EOFException {
        if (this.f1362s < 2) {
            throw new EOFException();
        }
        u uVar = this.f1361r;
        p251z9.j.b(uVar);
        int i10 = uVar.f1396b;
        int i11 = uVar.f1397c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = uVar.f1395a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f1362s -= 2;
        if (i14 == i11) {
            this.f1361r = uVar.a();
            v.a(uVar);
        } else {
            uVar.f1396b = i14;
        }
        return (short) i15;
    }

    @Override // Da.j
    public final boolean request(long j) {
        return this.f1362s >= j;
    }

    public final byte[] s(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f1362s < j) {
            throw new EOFException();
        }
        int i10 = (int) j;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        return bArr;
    }

    @Override // Da.j
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            u uVar = this.f1361r;
            if (uVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, uVar.f1397c - uVar.f1396b);
            long j10 = iMin;
            this.f1362s -= j10;
            j -= j10;
            int i10 = uVar.f1396b + iMin;
            uVar.f1396b = i10;
            if (i10 == uVar.f1397c) {
                this.f1361r = uVar.a();
                v.a(uVar);
            }
        }
    }

    public final String toString() {
        long j = this.f1362s;
        if (j <= 2147483647L) {
            return F((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1362s).toString());
    }

    @Override // Da.j
    public final String u() {
        return G(Long.MAX_VALUE);
    }

    @Override // Da.i
    public final /* bridge */ /* synthetic */ i v(k kVar) {
        N(kVar);
        return this;
    }

    public final long w() throws EOFException {
        long j;
        byte b5;
        long j10 = 0;
        if (this.f1362s == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j11 = 0;
        long j12 = -7;
        boolean z11 = false;
        loop0: while (true) {
            u uVar = this.f1361r;
            p251z9.j.b(uVar);
            byte[] bArr = uVar.f1395a;
            int i11 = uVar.f1396b;
            int i12 = uVar.f1397c;
            while (true) {
                if (i11 >= i12) {
                    j = j10;
                    break;
                }
                b5 = bArr[i11];
                if (b5 >= 48 && b5 <= 57) {
                    int i13 = 48 - b5;
                    if (j11 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j10;
                    if (j11 == -922337203685477580L && i13 < j12) {
                        break loop0;
                    }
                    j11 = (j11 * 10) + ((long) i13);
                } else {
                    j = j10;
                    if (b5 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j12--;
                    z10 = true;
                }
                i11++;
                i10++;
                j10 = j;
            }
            if (i11 == i12) {
                this.f1361r = uVar.a();
                v.a(uVar);
            } else {
                uVar.f1396b = i11;
            }
            if (z11 || this.f1361r == null) {
                long j13 = this.f1362s - ((long) i10);
                this.f1362s = j13;
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j11 : -j11;
                }
                if (j13 == j) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + F9.n.V(e(j)));
            }
            j10 = j;
        }
        h hVar = new h();
        hVar.V(j11);
        hVar.O(b5);
        if (!z10) {
            hVar.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(hVar.E()));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        p251z9.j.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            u uVarH = H(1);
            int iMin = Math.min(i10, 8192 - uVarH.f1397c);
            byteBuffer.get(uVarH.f1395a, uVarH.f1397c, iMin);
            i10 -= iMin;
            uVarH.f1397c += iMin;
        }
        this.f1362s += (long) iRemaining;
        return iRemaining;
    }

    @Override // Da.i
    public final /* bridge */ /* synthetic */ i writeByte(int i10) {
        O(i10);
        return this;
    }

    @Override // Da.i
    public final /* bridge */ /* synthetic */ i writeInt(int i10) {
        b0(i10);
        return this;
    }

    @Override // Da.i
    public final /* bridge */ /* synthetic */ i writeShort(int i10) {
        c0(i10);
        return this;
    }

    @Override // Da.j
    public final boolean y() {
        return this.f1362s == 0;
    }

    @Override // Da.i
    public final i write(byte[] bArr) {
        L(bArr.length, bArr);
        return this;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        F9.n.m(bArr.length, i10, i11);
        u uVar = this.f1361r;
        if (uVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, uVar.f1397c - uVar.f1396b);
        byte[] bArr2 = uVar.f1395a;
        int i12 = uVar.f1396b;
        p120l9.l.V(i10, i12, i12 + iMin, bArr2, bArr);
        int i13 = uVar.f1396b + iMin;
        uVar.f1396b = i13;
        this.f1362s -= (long) iMin;
        if (i13 == uVar.f1397c) {
            this.f1361r = uVar.a();
            v.a(uVar);
        }
        return iMin;
    }

    @Override // Da.i
    public final i D() {
        return this;
    }

    @Override // Da.j, Da.i
    public final h a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, Da.x
    public final void close() {
    }

    @Override // Da.i, Da.x, java.io.Flushable
    public final void flush() {
    }
}
