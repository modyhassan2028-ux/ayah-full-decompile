package u;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22751a = M.f22699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f22752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f22753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22756f;

    public r() {
        int[] iArr = AbstractC1357l.f22737a;
        this.f22752b = iArr;
        this.f22753c = iArr;
        e(M.e(6));
    }

    public final void a() {
        this.f22755e = 0;
        long[] jArr = this.f22751a;
        if (jArr != M.f22699a) {
            p120l9.l.g0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f22751a;
            int i10 = this.f22754d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        this.f22756f = M.a(this.f22754d) - this.f22755e;
    }

    public final int b(int i10) {
        int i11 = this.f22754d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22751a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int c(int i10) {
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f22754d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f22751a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (((long) i13) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i14;
                if (this.f22752b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final int d(int i10) {
        int iC = c(i10);
        if (iC >= 0) {
            return this.f22753c[iC];
        }
        return -1;
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22754d = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22751a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22756f = M.a(this.f22754d) - this.f22755e;
        this.f22752b = new int[iMax];
        this.f22753c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f22755e != this.f22755e) {
            return false;
        }
        int[] iArr = this.f22752b;
        int[] iArr2 = this.f22753c;
        long[] jArr = this.f22751a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        loop0: while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        int i14 = iArr[i13];
                        int i15 = iArr2[i13];
                        int iC = rVar.c(i14);
                        if (iC < 0 || i15 != rVar.f22753c[iC]) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                    i12++;
                    z11 = z11;
                }
                z10 = z11;
                if (i11 != 8) {
                    return z10;
                }
            } else {
                z10 = z11;
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
            z11 = z10;
        }
        return false;
    }

    public final void f(int i10, int i11) {
        long j;
        long j10;
        int i12;
        long j11;
        int i13;
        char c10;
        long[] jArr;
        int i14 = i10;
        int i15 = -862048943;
        int i16 = i14 * (-862048943);
        int i17 = i16 ^ (i16 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = this.f22754d;
        int i21 = i18 & i20;
        int i22 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f22751a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            int i25 = 1;
            int i26 = i22;
            long j12 = (((-i24) >> 63) & (jArr2[i23 + 1] << (64 - i24))) | (jArr2[i23] >>> i24);
            long j13 = i19;
            int i27 = i15;
            int i28 = i19;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i21 + (Long.numberOfTrailingZeros(j16) >> 3)) & i20;
                long j17 = j15;
                if (this.f22752b[iNumberOfTrailingZeros] == i14) {
                    i13 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j16 &= j16 - 1;
                    j15 = j17;
                }
            }
            long j18 = j15;
            char c11 = '\b';
            if ((((~j12) << 6) & j12 & j18) != 0) {
                int iB = b(i18);
                long j19 = 255;
                if (this.f22756f != 0 || ((this.f22751a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = j13;
                    j10 = 255;
                    i12 = 1;
                    j11 = 128;
                } else {
                    int i29 = this.f22754d;
                    if (i29 > 8) {
                        j11 = 128;
                        j = j13;
                        char c12 = 7;
                        if (Long.compare((((long) this.f22755e) * 32) ^ Long.MIN_VALUE, (((long) i29) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f22751a;
                            int i30 = this.f22754d;
                            int[] iArr = this.f22752b;
                            int[] iArr2 = this.f22753c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = 0;
                            while (i32 < i31) {
                                long j20 = j19;
                                long j21 = jArr3[i32] & j18;
                                jArr3[i32] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i32++;
                                i25 = i25;
                                i27 = i27;
                                j19 = j20;
                            }
                            j10 = j19;
                            int i33 = i27;
                            i12 = i25;
                            int iJ0 = p120l9.l.j0(jArr3);
                            int i34 = iJ0 - 1;
                            long j22 = 72057594037927935L;
                            jArr3[i34] = (jArr3[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ0] = jArr3[0];
                            int i35 = 0;
                            while (i35 != i30) {
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                long j23 = (jArr3[i36] >> i37) & j10;
                                if (j23 != 128 && j23 == 254) {
                                    int i38 = iArr[i35] * i33;
                                    int i39 = i38 ^ (i38 << 16);
                                    int i40 = i39 >>> 7;
                                    int iB2 = b(i40);
                                    int i41 = i40 & i30;
                                    char c13 = c11;
                                    if (((iB2 - i41) & i30) / 8 == ((i35 - i41) & i30) / 8) {
                                        jArr3[i36] = (jArr3[i36] & (~(j10 << i37))) | (((long) (i39 & 127)) << i37);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j22) | Long.MIN_VALUE;
                                        i35++;
                                        c12 = c12;
                                        i30 = i30;
                                        c11 = c13;
                                    } else {
                                        char c14 = c12;
                                        int i42 = i30;
                                        int i43 = iB2 >> 3;
                                        long j24 = jArr3[i43];
                                        int i44 = (iB2 & 7) << 3;
                                        if (((j24 >> i44) & j10) == 128) {
                                            jArr3[i43] = (((long) (i39 & 127)) << i44) | (j24 & (~(j10 << i44)));
                                            jArr3[i36] = (jArr3[i36] & (~(j10 << i37))) | (128 << i37);
                                            iArr[iB2] = iArr[i35];
                                            iArr[i35] = 0;
                                            iArr2[iB2] = iArr2[i35];
                                            iArr2[i35] = 0;
                                        } else {
                                            jArr3[i43] = (((long) (i39 & 127)) << i44) | (j24 & (~(j10 << i44)));
                                            int i45 = iArr[iB2];
                                            iArr[iB2] = iArr[i35];
                                            iArr[i35] = i45;
                                            int i46 = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i35];
                                            iArr2[i35] = i46;
                                            i35--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j22) | Long.MIN_VALUE;
                                        i35++;
                                        c12 = c14;
                                        i30 = i42;
                                        c11 = c13;
                                        j22 = j22;
                                    }
                                } else {
                                    i35++;
                                }
                            }
                            c10 = c12;
                            this.f22756f = M.a(this.f22754d) - this.f22755e;
                        } else {
                            c10 = 7;
                        }
                        iB = b(i18);
                    } else {
                        j = j13;
                        c10 = 7;
                        j11 = 128;
                    }
                    j10 = 255;
                    i12 = 1;
                    int iC = M.c(this.f22754d);
                    long[] jArr4 = this.f22751a;
                    int[] iArr3 = this.f22752b;
                    int[] iArr4 = this.f22753c;
                    int i47 = this.f22754d;
                    e(iC);
                    long[] jArr5 = this.f22751a;
                    int[] iArr5 = this.f22752b;
                    int[] iArr6 = this.f22753c;
                    int i48 = this.f22754d;
                    int i49 = 0;
                    while (i49 < i47) {
                        if (((jArr4[i49 >> 3] >> ((i49 & 7) << 3)) & 255) < j11) {
                            int i50 = iArr3[i49];
                            int i51 = i50 * i27;
                            int i52 = i51 ^ (i51 << 16);
                            int iB3 = b(i52 >>> 7);
                            jArr = jArr5;
                            long j25 = i52 & 127;
                            int i53 = iB3 >> 3;
                            int i54 = (iB3 & 7) << 3;
                            long j26 = (jArr[i53] & (~(255 << i54))) | (j25 << i54);
                            jArr[i53] = j26;
                            jArr[(((iB3 - 7) & i48) + (i48 & 7)) >> 3] = j26;
                            iArr5[iB3] = i50;
                            iArr6[iB3] = iArr4[i49];
                        } else {
                            jArr = jArr5;
                        }
                        i49++;
                        c10 = c10;
                        jArr5 = jArr;
                    }
                    iB = b(i18);
                }
                this.f22755e++;
                int i55 = this.f22756f;
                long[] jArr6 = this.f22751a;
                int i56 = iB >> 3;
                long j27 = jArr6[i56];
                int i57 = (iB & 7) << 3;
                this.f22756f = i55 - (((j27 >> i57) & j10) == j11 ? i12 : 0);
                int i58 = this.f22754d;
                long j28 = (j27 & (~(j10 << i57))) | (j << i57);
                jArr6[i56] = j28;
                jArr6[(((iB - 7) & i58) + (i58 & 7)) >> 3] = j28;
                i13 = ~iB;
                break;
            }
            i22 = i26 + 8;
            i21 = (i21 + i22) & i20;
            i14 = i10;
            i19 = i28;
            i15 = i27;
        }
        if (i13 < 0) {
            i13 = ~i13;
        }
        this.f22752b[i13] = i10;
        this.f22753c[i13] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f22752b;
        int[] iArr2 = this.f22753c;
        long[] jArr = this.f22751a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j) < 128) {
                        int i14 = (i10 << 3) + i13;
                        i11 += iArr2[i14] ^ iArr[i14];
                    }
                    j >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f22755e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f22752b;
        int[] iArr2 = this.f22753c;
        long[] jArr = this.f22751a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            int i16 = iArr2[i14];
                            sb.append(i15);
                            sb.append("=");
                            sb.append(i16);
                            i11++;
                            if (i11 < this.f22755e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }
}
