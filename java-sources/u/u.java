package u;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f22761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22764e;

    public u(int i10) {
        this.f22760a = M.f22699a;
        this.f22761b = AbstractC1357l.f22737a;
        if (i10 >= 0) {
            d(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i10) {
        long j;
        long j10;
        int i11;
        long j11;
        int iNumberOfTrailingZeros;
        char c10;
        int i12;
        long[] jArr;
        boolean z10;
        int i13 = this.f22763d;
        int i14 = -862048943;
        int i15 = i10 * (-862048943);
        int i16 = i15 ^ (i15 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f22762c;
        int i20 = i17 & i19;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f22760a;
            int i22 = i20 >> 3;
            int i23 = (i20 & 7) << 3;
            int i24 = 1;
            int i25 = i21;
            long j12 = (((-i23) >> 63) & (jArr2[i22 + 1] << (64 - i23))) | (jArr2[i22] >>> i23);
            long j13 = i18;
            int i26 = i14;
            int i27 = i18;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = (i20 + (Long.numberOfTrailingZeros(j16) >> 3)) & i19;
                long j17 = j15;
                if (this.f22761b[iNumberOfTrailingZeros] == i10) {
                    z10 = 1;
                    break loop0;
                }
                j16 &= j16 - 1;
                j15 = j17;
            }
            long j18 = j15;
            char c11 = '\b';
            if ((((~j12) << 6) & j12 & j18) != 0) {
                int iC = c(i17);
                long j19 = 255;
                if (this.f22764e != 0 || ((this.f22760a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j = j13;
                    j10 = 255;
                    i11 = 1;
                    j11 = 128;
                } else {
                    int i28 = this.f22762c;
                    if (i28 > 8) {
                        j11 = 128;
                        j = j13;
                        char c12 = 7;
                        if (Long.compare((((long) this.f22763d) * 32) ^ Long.MIN_VALUE, (((long) i28) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f22760a;
                            int i29 = this.f22762c;
                            int[] iArr = this.f22761b;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = 0;
                            while (i31 < i30) {
                                long j20 = j19;
                                long j21 = jArr3[i31] & j18;
                                jArr3[i31] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i31++;
                                i24 = i24;
                                i26 = i26;
                                j19 = j20;
                            }
                            j10 = j19;
                            int i32 = i26;
                            int i33 = i24;
                            int iJ0 = p120l9.l.j0(jArr3);
                            int i34 = iJ0 - 1;
                            jArr3[i34] = (jArr3[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ0] = jArr3[0];
                            int i35 = 0;
                            while (i35 != i29) {
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                long j22 = (jArr3[i36] >> i37) & j10;
                                if (j22 != 128 && j22 == 254) {
                                    int i38 = iArr[i35] * i32;
                                    int i39 = i38 ^ (i38 << 16);
                                    int i40 = i39 >>> 7;
                                    int iC2 = c(i40);
                                    int i41 = i40 & i29;
                                    char c13 = c11;
                                    if (((iC2 - i41) & i29) / 8 == ((i35 - i41) & i29) / 8) {
                                        jArr3[i36] = (jArr3[i36] & (~(j10 << i37))) | (((long) (i39 & 127)) << i37);
                                        jArr3[jArr3.length - i33] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i35++;
                                        c12 = c12;
                                        i29 = i29;
                                        c11 = c13;
                                    } else {
                                        char c14 = c12;
                                        int i42 = i29;
                                        int i43 = iC2 >> 3;
                                        long j23 = jArr3[i43];
                                        int i44 = (iC2 & 7) << 3;
                                        if (((j23 >> i44) & j10) == 128) {
                                            jArr3[i43] = (j23 & (~(j10 << i44))) | (((long) (i39 & 127)) << i44);
                                            jArr3[i36] = (jArr3[i36] & (~(j10 << i37))) | (128 << i37);
                                            iArr[iC2] = iArr[i35];
                                            iArr[i35] = 0;
                                        } else {
                                            jArr3[i43] = (((long) (i39 & 127)) << i44) | (j23 & (~(j10 << i44)));
                                            int i45 = iArr[iC2];
                                            iArr[iC2] = iArr[i35];
                                            iArr[i35] = i45;
                                            i35--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i35++;
                                        c12 = c14;
                                        i29 = i42;
                                        c11 = c13;
                                        i33 = i33;
                                    }
                                } else {
                                    i35++;
                                }
                            }
                            c10 = c12;
                            i12 = i33;
                            this.f22764e = M.a(this.f22762c) - this.f22763d;
                        } else {
                            c10 = 7;
                        }
                        iC = c(i17);
                        i11 = i12;
                    } else {
                        j = j13;
                        c10 = 7;
                        j11 = 128;
                    }
                    j10 = 255;
                    i12 = 1;
                    int iC3 = M.c(this.f22762c);
                    long[] jArr4 = this.f22760a;
                    int[] iArr2 = this.f22761b;
                    int i46 = this.f22762c;
                    d(iC3);
                    long[] jArr5 = this.f22760a;
                    int[] iArr3 = this.f22761b;
                    int i47 = this.f22762c;
                    int i48 = 0;
                    while (i48 < i46) {
                        if (((jArr4[i48 >> 3] >> ((i48 & 7) << 3)) & 255) < j11) {
                            int i49 = iArr2[i48];
                            int i50 = i49 * i26;
                            int i51 = i50 ^ (i50 << 16);
                            int iC4 = c(i51 >>> 7);
                            long j24 = i51 & 127;
                            int i52 = iC4 >> 3;
                            int i53 = (iC4 & 7) << 3;
                            jArr = jArr5;
                            long j25 = (jArr5[i52] & (~(255 << i53))) | (j24 << i53);
                            jArr[i52] = j25;
                            jArr[(((iC4 - 7) & i47) + (i47 & 7)) >> 3] = j25;
                            iArr3[iC4] = i49;
                        } else {
                            jArr = jArr5;
                        }
                        i48++;
                        i17 = i17;
                        c10 = c10;
                        jArr5 = jArr;
                    }
                    iC = c(i17);
                    i11 = i12;
                }
                this.f22763d++;
                int i54 = this.f22764e;
                long[] jArr6 = this.f22760a;
                int i55 = iC >> 3;
                long j26 = jArr6[i55];
                int i56 = (iC & 7) << 3;
                this.f22764e = i54 - (((j26 >> i56) & j10) == j11 ? i11 == true ? 1 : 0 : 0);
                int i57 = this.f22762c;
                long j27 = (j26 & (~(j10 << i56))) | (j << i56);
                jArr6[i55] = j27;
                jArr6[(((iC - 7) & i57) + (i57 & 7)) >> 3] = j27;
                iNumberOfTrailingZeros = iC;
                z10 = i11;
                break;
            }
            i21 = i25 + 8;
            i20 = (i20 + i21) & i19;
            i18 = i27;
            i14 = i26;
        }
        this.f22761b[iNumberOfTrailingZeros] = i10;
        if (this.f22763d != i13) {
            return z10;
        }
        return false;
    }

    public final boolean b(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f22762c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f22760a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (((long) i13) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i14;
                if (this.f22761b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i10) {
        int i11 = this.f22762c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22760a;
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

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22762c = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22760a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22764e = M.a(this.f22762c) - this.f22763d;
        this.f22761b = new int[iMax];
    }

    public final boolean e(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f22762c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f22760a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (((long) i13) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i14;
                if (this.f22761b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            f(iNumberOfTrailingZeros);
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f22763d != this.f22763d) {
            return false;
        }
        int[] iArr = this.f22761b;
        long[] jArr = this.f22760a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128 && !uVar.b(iArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public final void f(int i10) {
        this.f22763d--;
        long[] jArr = this.f22760a;
        int i11 = this.f22762c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.f22761b;
        long[] jArr = this.f22760a;
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
                        i11 += iArr[(i10 << 3) + i13];
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

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f22761b;
        long[] jArr = this.f22760a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j) < 128) {
                        int i14 = iArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i14);
                        i11++;
                    }
                    j >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i10 == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i10++;
        }
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ u() {
        this(6);
    }
}
