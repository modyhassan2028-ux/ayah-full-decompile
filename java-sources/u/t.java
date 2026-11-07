package u;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC1355j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22759f;

    public t(int i10) {
        this.f22731a = M.f22699a;
        this.f22732b = AbstractC1357l.f22737a;
        this.f22733c = p204v.a.f23000c;
        if (i10 >= 0) {
            f(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f22735e = 0;
        long[] jArr = this.f22731a;
        if (jArr != M.f22699a) {
            p120l9.l.g0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f22731a;
            int i10 = this.f22734d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        p120l9.l.e0(0, this.f22734d, null, this.f22733c);
        this.f22759f = M.a(this.f22734d) - this.f22735e;
    }

    public final int d(int i10) {
        long j;
        int i11;
        int i12;
        long j10;
        long[] jArr;
        int i13;
        int i14 = -862048943;
        int i15 = i10 * (-862048943);
        int i16 = i15 ^ (i15 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f22734d;
        int i20 = i17 & i19;
        int i21 = 0;
        while (true) {
            long[] jArr2 = this.f22731a;
            int i22 = i20 >> 3;
            int i23 = (i20 & 7) << 3;
            int i24 = 1;
            int i25 = i21;
            int i26 = 0;
            long j11 = (((-i23) >> 63) & (jArr2[i22 + 1] << (64 - i23))) | (jArr2[i22] >>> i23);
            long j12 = i18;
            int i27 = i14;
            int i28 = i18;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = -9187201950435737472L;
            long j15 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i20 + (Long.numberOfTrailingZeros(j15) >> 3)) & i19;
                long j16 = j14;
                if (this.f22732b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                j14 = j16;
            }
            long j17 = j14;
            if ((((~j11) << 6) & j11 & j17) != 0) {
                int iE = e(i17);
                long j18 = 255;
                if (this.f22759f != 0 || ((this.f22731a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i11 = 1;
                    i12 = 0;
                    j10 = 128;
                } else {
                    int i29 = this.f22734d;
                    if (i29 > 8) {
                        j10 = 128;
                        if (Long.compare((((long) this.f22735e) * 32) ^ Long.MIN_VALUE, (((long) i29) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f22731a;
                            int i30 = this.f22734d;
                            int[] iArr = this.f22732b;
                            Object[] objArr = this.f22733c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = 0;
                            while (i32 < i31) {
                                long j19 = j18;
                                long j20 = jArr3[i32] & j17;
                                jArr3[i32] = (-72340172838076674L) & ((~j20) + (j20 >>> 7));
                                i32++;
                                i31 = i31;
                                j18 = j19;
                            }
                            j = j18;
                            int iJ0 = p120l9.l.j0(jArr3);
                            int i33 = iJ0 - 1;
                            jArr3[i33] = (jArr3[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ0] = jArr3[0];
                            int i34 = 0;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j21 = (jArr3[i35] >> i36) & j;
                                if (j21 != 128 && j21 == 254) {
                                    int i37 = iArr[i34] * i27;
                                    int i38 = i37 ^ (i37 << 16);
                                    int i39 = i38 >>> 7;
                                    int iE2 = e(i39);
                                    int i40 = i39 & i30;
                                    int i41 = i27;
                                    if (((iE2 - i40) & i30) / 8 == ((i34 - i40) & i30) / 8) {
                                        int i42 = i24;
                                        int i43 = i26;
                                        jArr3[i35] = (((long) (i38 & 127)) << i36) | (jArr3[i35] & (~(j << i36)));
                                        jArr3[jArr3.length - i42] = (jArr3[i43] & 72057594037927935L) | Long.MIN_VALUE;
                                        i34++;
                                        i24 = i42;
                                        i27 = i41;
                                        i26 = i43;
                                    } else {
                                        int i44 = i24;
                                        int i45 = i26;
                                        int i46 = iE2 >> 3;
                                        long j22 = jArr3[i46];
                                        int i47 = (iE2 & 7) << 3;
                                        if (((j22 >> i47) & j) == 128) {
                                            int i48 = i34;
                                            jArr3[i46] = (j22 & (~(j << i47))) | (((long) (i38 & 127)) << i47);
                                            jArr3[i35] = (jArr3[i35] & (~(j << i36))) | (128 << i36);
                                            iArr[iE2] = iArr[i48];
                                            iArr[i48] = i45;
                                            objArr[iE2] = objArr[i48];
                                            objArr[i48] = null;
                                            i13 = i48;
                                        } else {
                                            int i49 = i34;
                                            jArr3[i46] = (((long) (i38 & 127)) << i47) | (j22 & (~(j << i47)));
                                            int i50 = iArr[iE2];
                                            iArr[iE2] = iArr[i49];
                                            iArr[i49] = i50;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i49];
                                            objArr[i49] = obj;
                                            i13 = i49 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i45] & 72057594037927935L) | Long.MIN_VALUE;
                                        i34 = i13 + 1;
                                        i30 = i30;
                                        i27 = i41;
                                        i26 = i45;
                                        i24 = i44;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i11 = i24;
                            i12 = i26;
                            this.f22759f = M.a(this.f22734d) - this.f22735e;
                        }
                        iE = e(i17);
                    } else {
                        j10 = 128;
                    }
                    j = 255;
                    i11 = 1;
                    i12 = 0;
                    int iC = M.c(this.f22734d);
                    long[] jArr4 = this.f22731a;
                    int[] iArr2 = this.f22732b;
                    Object[] objArr2 = this.f22733c;
                    int i51 = this.f22734d;
                    f(iC);
                    long[] jArr5 = this.f22731a;
                    int[] iArr3 = this.f22732b;
                    Object[] objArr3 = this.f22733c;
                    int i52 = this.f22734d;
                    int i53 = 0;
                    while (i53 < i51) {
                        if (((jArr4[i53 >> 3] >> ((i53 & 7) << 3)) & 255) < j10) {
                            int i54 = iArr2[i53];
                            int i55 = i54 * i27;
                            int i56 = i55 ^ (i55 << 16);
                            int iE3 = e(i56 >>> 7);
                            jArr = jArr5;
                            long j23 = i56 & 127;
                            int i57 = iE3 >> 3;
                            int i58 = (iE3 & 7) << 3;
                            long j24 = (jArr[i57] & (~(255 << i58))) | (j23 << i58);
                            jArr[i57] = j24;
                            jArr[(((iE3 - 7) & i52) + (i52 & 7)) >> 3] = j24;
                            iArr3[iE3] = i54;
                            objArr3[iE3] = objArr2[i53];
                        } else {
                            jArr = jArr5;
                        }
                        i53++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i17);
                }
                this.f22735e++;
                int i59 = this.f22759f;
                long[] jArr6 = this.f22731a;
                int i60 = iE >> 3;
                long j25 = jArr6[i60];
                int i61 = (iE & 7) << 3;
                if (((j25 >> i61) & j) == j10) {
                    i12 = i11;
                }
                this.f22759f = i59 - i12;
                int i62 = this.f22734d;
                long j26 = (j25 & (~(j << i61))) | (j12 << i61);
                jArr6[i60] = j26;
                jArr6[(((iE - 7) & i62) + (i62 & 7)) >> 3] = j26;
                return iE;
            }
            i21 = i25 + 8;
            i20 = (i20 + i21) & i19;
            i18 = i28;
            i14 = i27;
        }
    }

    public final int e(int i10) {
        int i11 = this.f22734d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22731a;
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

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22734d = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22731a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22759f = M.a(this.f22734d) - this.f22735e;
        this.f22732b = new int[iMax];
        this.f22733c = new Object[iMax];
    }

    public final Object g(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f22734d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f22731a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (((long) i13) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i14;
                if (this.f22732b[iNumberOfTrailingZeros] == i10) {
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
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f22735e--;
        long[] jArr2 = this.f22731a;
        int i19 = this.f22734d;
        int i20 = iNumberOfTrailingZeros >> 3;
        int i21 = (iNumberOfTrailingZeros & 7) << 3;
        long j12 = (jArr2[i20] & (~(255 << i21))) | (254 << i21);
        jArr2[i20] = j12;
        jArr2[(((iNumberOfTrailingZeros - 7) & i19) + (i19 & 7)) >> 3] = j12;
        Object[] objArr = this.f22733c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void h(int i10, Object obj) {
        int iD = d(i10);
        this.f22732b[iD] = i10;
        this.f22733c[iD] = obj;
    }

    public /* synthetic */ t() {
        this(6);
    }
}
