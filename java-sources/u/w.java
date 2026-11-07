package u;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22767a = M.f22699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f22768b = AbstractC1359n.f22739a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f22769c = p204v.a.f23000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22772f;

    public w(int i10) {
        if (i10 >= 0) {
            e(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f22771e = 0;
        long[] jArr = this.f22767a;
        if (jArr != M.f22699a) {
            p120l9.l.g0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f22767a;
            int i10 = this.f22770d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        p120l9.l.e0(0, this.f22770d, null, this.f22769c);
        this.f22772f = M.a(this.f22770d) - this.f22771e;
    }

    public final boolean b(long j) {
        int iNumberOfTrailingZeros;
        int i10 = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f22770d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f22767a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f22768b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i10) {
        int i11 = this.f22770d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22767a;
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

    public final Object d(long j) {
        int iNumberOfTrailingZeros;
        int i10 = ((int) ((j >>> 32) ^ j)) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f22770d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f22767a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f22768b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f22769c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22770d = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22767a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22772f = M.a(this.f22770d) - this.f22771e;
        this.f22768b = new long[iMax];
        this.f22769c = new Object[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        long[] jArr;
        boolean z11;
        long[] jArr2;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.f22771e != this.f22771e) {
            return false;
        }
        long[] jArr3 = this.f22768b;
        Object[] objArr = this.f22769c;
        long[] jArr4 = this.f22767a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        loop0: while (true) {
            long j = jArr4[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        z11 = z12;
                        jArr2 = jArr3;
                        long j10 = jArr2[i13];
                        Object obj2 = objArr[i13];
                        if (obj2 == null) {
                            if (wVar.d(j10) != null || !wVar.b(j10)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(wVar.d(j10))) {
                            return false;
                        }
                    } else {
                        z11 = z12;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i12++;
                    z12 = z11;
                    jArr3 = jArr2;
                }
                z10 = z12;
                jArr = jArr3;
                if (i11 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
                jArr = jArr3;
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
            z12 = z10;
            jArr3 = jArr;
        }
        return false;
    }

    public final Object f(long j) {
        int iNumberOfTrailingZeros;
        int i10 = ((int) ((j >>> 32) ^ j)) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f22770d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f22767a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f22768b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f22771e--;
        long[] jArr2 = this.f22767a;
        int i18 = this.f22770d;
        int i19 = iNumberOfTrailingZeros >> 3;
        int i20 = (iNumberOfTrailingZeros & 7) << 3;
        long j13 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
        jArr2[i19] = j13;
        jArr2[(((iNumberOfTrailingZeros - 7) & i18) + (i18 & 7)) >> 3] = j13;
        Object[] objArr = this.f22769c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void g(long j, Object obj) {
        long j10;
        int i10;
        long j11;
        int iNumberOfTrailingZeros;
        long[] jArr;
        long[] jArr2;
        char c10 = ' ';
        int i11 = -862048943;
        int i12 = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f22770d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f22767a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            int i22 = i18;
            long j12 = (((-i20) >> 63) & (jArr3[i19 + 1] << (64 - i20))) | (jArr3[i19] >>> i20);
            long j13 = i15;
            char c11 = c10;
            int i23 = i15;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                int i24 = i11;
                if (this.f22768b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j16 &= j16 - 1;
                i11 = i24;
            }
            int i25 = i11;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iC = c(i14);
                if (this.f22772f != 0 || ((this.f22767a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    i10 = 1;
                    j11 = 128;
                } else {
                    int i26 = this.f22770d;
                    if (i26 > 8) {
                        j11 = 128;
                        if (Long.compare((((long) this.f22771e) * 32) ^ Long.MIN_VALUE, (((long) i26) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f22767a;
                            int i27 = this.f22770d;
                            long[] jArr5 = this.f22768b;
                            Object[] objArr = this.f22769c;
                            int i28 = (i27 + 7) >> 3;
                            j10 = 255;
                            int i29 = 0;
                            while (i29 < i28) {
                                long j17 = j15;
                                long j18 = jArr4[i29] & j17;
                                jArr4[i29] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i29++;
                                i21 = i21;
                                c11 = c11;
                                j15 = j17;
                            }
                            char c12 = c11;
                            int i30 = i21;
                            int iJ0 = p120l9.l.j0(jArr4);
                            int i31 = iJ0 - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i31] = (jArr4[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iJ0] = jArr4[0];
                            int i32 = 0;
                            while (i32 != i27) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j20 = (jArr4[i33] >> i34) & 255;
                                if (j20 != 128 && j20 == 254) {
                                    long j21 = jArr5[i32];
                                    int i35 = ((int) (j21 ^ (j21 >>> c12))) * i25;
                                    int i36 = i35 ^ (i35 << 16);
                                    int i37 = i36 >>> 7;
                                    int iC2 = c(i37);
                                    int i38 = i37 & i27;
                                    int i39 = i30;
                                    if (((iC2 - i38) & i27) / 8 == ((i32 - i38) & i27) / 8) {
                                        long j22 = j19;
                                        jArr4[i33] = (((long) (i36 & 127)) << i34) | (jArr4[i33] & (~(255 << i34)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i32++;
                                        i30 = i39;
                                        j19 = j22;
                                    } else {
                                        long j23 = j19;
                                        int i40 = iC2 >> 3;
                                        long j24 = jArr4[i40];
                                        int i41 = (iC2 & 7) << 3;
                                        if (((j24 >> i41) & 255) == 128) {
                                            jArr2 = jArr5;
                                            jArr4[i40] = ((~(255 << i41)) & j24) | (((long) (i36 & 127)) << i41);
                                            jArr4[i33] = (jArr4[i33] & (~(255 << i34))) | (128 << i34);
                                            jArr2[iC2] = jArr2[i32];
                                            jArr2[i32] = 0;
                                            objArr[iC2] = objArr[i32];
                                            objArr[i32] = null;
                                        } else {
                                            jArr2 = jArr5;
                                            jArr4[i40] = ((~(255 << i41)) & j24) | (((long) (i36 & 127)) << i41);
                                            long j25 = jArr2[iC2];
                                            jArr2[iC2] = jArr2[i32];
                                            jArr2[i32] = j25;
                                            Object obj2 = objArr[iC2];
                                            objArr[iC2] = objArr[i32];
                                            objArr[i32] = obj2;
                                            i32--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j23) | Long.MIN_VALUE;
                                        i32++;
                                        i27 = i27;
                                        i30 = i39;
                                        j19 = j23;
                                        jArr5 = jArr2;
                                    }
                                } else {
                                    i32++;
                                }
                            }
                            i10 = i30;
                            this.f22772f = M.a(this.f22770d) - this.f22771e;
                        }
                        iC = c(i14);
                    } else {
                        j11 = 128;
                    }
                    j10 = 255;
                    i10 = 1;
                    int iC3 = M.c(this.f22770d);
                    long[] jArr6 = this.f22767a;
                    long[] jArr7 = this.f22768b;
                    Object[] objArr2 = this.f22769c;
                    int i42 = this.f22770d;
                    e(iC3);
                    long[] jArr8 = this.f22767a;
                    long[] jArr9 = this.f22768b;
                    Object[] objArr3 = this.f22769c;
                    int i43 = this.f22770d;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr6[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j11) {
                            long j26 = jArr7[i44];
                            jArr = jArr8;
                            int i45 = ((int) (j26 ^ (j26 >>> c11))) * i25;
                            int i46 = i45 ^ (i45 << 16);
                            int iC4 = c(i46 >>> 7);
                            int i47 = iC4 >> 3;
                            int i48 = (iC4 & 7) << 3;
                            long j27 = (jArr[i47] & (~(255 << i48))) | (((long) (i46 & 127)) << i48);
                            jArr[i47] = j27;
                            jArr[(((iC4 - 7) & i43) + (i43 & 7)) >> 3] = j27;
                            jArr9[iC4] = j26;
                            objArr3[iC4] = objArr2[i44];
                        } else {
                            jArr = jArr8;
                        }
                        i44++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iC = c(i14);
                }
                iNumberOfTrailingZeros = iC;
                this.f22771e++;
                int i49 = this.f22772f;
                long[] jArr10 = this.f22767a;
                int i50 = iNumberOfTrailingZeros >> 3;
                long j28 = jArr10[i50];
                int i51 = (iNumberOfTrailingZeros & 7) << 3;
                this.f22772f = i49 - (((j28 >> i51) & j10) == j11 ? i10 : 0);
                int i52 = this.f22770d;
                long j29 = (j28 & (~(j10 << i51))) | (j13 << i51);
                jArr10[i50] = j29;
                jArr10[(((iNumberOfTrailingZeros - 7) & i52) + (i52 & 7)) >> 3] = j29;
                break;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i15 = i23;
            i11 = i25;
            c10 = c11;
        }
        this.f22768b[iNumberOfTrailingZeros] = j;
        this.f22769c[iNumberOfTrailingZeros] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f22768b;
        Object[] objArr = this.f22769c;
        long[] jArr2 = this.f22767a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        long j10 = jArr[i13];
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ ((int) (j10 ^ (j10 >>> 32)));
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final String toString() {
        int i10;
        int i11;
        if (this.f22771e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f22768b;
        Object[] objArr = this.f22769c;
        long[] jArr2 = this.f22767a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j = jArr2[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j10 = jArr[i16];
                            Object obj = objArr[i16];
                            sb.append(j10);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i13++;
                            if (i13 < this.f22771e) {
                                sb.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }
}
