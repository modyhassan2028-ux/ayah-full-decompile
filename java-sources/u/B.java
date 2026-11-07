package u;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22652a = M.f22699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f22653b = p204v.a.f23000c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f22654c = AbstractC1361p.f22745b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22655d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22656e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22657f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22658h;

    public B(int i10) {
        if (i10 >= 0) {
            f(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.g;
        int iD = d(obj);
        this.f22653b[iD] = obj;
        long[] jArr = this.f22654c;
        int i11 = this.f22655d;
        jArr[iD] = (((long) i11) & 2147483647L) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((2147483647L & ((long) iD)) << 31) | (jArr[i11] & (-4611686016279904257L));
        }
        this.f22655d = iD;
        if (this.f22656e == Integer.MAX_VALUE) {
            this.f22656e = iD;
        }
        return this.g != i10;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.f22652a;
        if (jArr != M.f22699a) {
            p120l9.l.g0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f22652a;
            int i10 = this.f22657f;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        p120l9.l.e0(0, this.f22657f, null, this.f22653b);
        p120l9.l.g0(this.f22654c, 4611686018427387903L);
        this.f22655d = Integer.MAX_VALUE;
        this.f22656e = Integer.MAX_VALUE;
        this.f22658h = M.a(this.f22657f) - this.g;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f22657f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f22652a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (p251z9.j.a(this.f22653b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(Object obj) {
        int i10;
        long j;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f22657f;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.f22652a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j12 = ((jArr2[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr2[i18] >>> i19);
            long j13 = i14;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                int i20 = i11;
                if (p251z9.j.a(this.f22653b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i11 = i20;
            }
            int i21 = i11;
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                long j16 = 255;
                if (this.f22658h != 0 || ((this.f22652a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i10 = 0;
                    j = j13;
                    j10 = 255;
                    j11 = 128;
                } else {
                    int i22 = this.f22657f;
                    if (i22 > 8) {
                        c10 = 31;
                        j11 = 128;
                        if (Long.compare((((long) this.g) * 32) ^ Long.MIN_VALUE, (((long) i22) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f22652a;
                            if (jArr3 == null) {
                                i10 = 0;
                                j = j13;
                                j10 = 255;
                            } else {
                                int i23 = this.f22657f;
                                Object[] objArr = this.f22653b;
                                long[] jArr4 = this.f22654c;
                                long[] jArr5 = new long[i23];
                                Arrays.fill(jArr5, 0, i23, 9223372034707292159L);
                                i10 = 0;
                                int i24 = (i23 + 7) >> 3;
                                int i25 = 0;
                                while (i25 < i24) {
                                    long j17 = j16;
                                    long j18 = jArr3[i25] & (-9187201950435737472L);
                                    int i26 = i25;
                                    jArr3[i26] = ((~j18) + (j18 >>> 7)) & (-72340172838076674L);
                                    i25 = i26 + 1;
                                    j16 = j17;
                                }
                                j10 = j16;
                                int length = jArr3.length;
                                int i27 = length - 1;
                                int i28 = length - 2;
                                jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i27] = jArr3[0];
                                int i29 = 0;
                                while (i29 != i23) {
                                    int i30 = i29 >> 3;
                                    int i31 = (i29 & 7) << 3;
                                    long j19 = (jArr3[i30] >> i31) & j10;
                                    if (j19 != 128 && j19 == 254) {
                                        Object obj2 = objArr[i29];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                        int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i33 = i32 >>> 7;
                                        int iE2 = e(i33);
                                        int i34 = i33 & i23;
                                        if (((iE2 - i34) & i23) / 8 == ((i29 - i34) & i23) / 8) {
                                            int i35 = i23;
                                            Object[] objArr2 = objArr;
                                            jArr3[i30] = (jArr3[i30] & (~(j10 << i31))) | (((long) (i32 & 127)) << i31);
                                            if (jArr5[i29] == 9223372034707292159L) {
                                                long j20 = i29;
                                                jArr5[i29] = j20 | (j20 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i29++;
                                            i23 = i35;
                                            objArr = objArr2;
                                        } else {
                                            int i36 = i23;
                                            Object[] objArr3 = objArr;
                                            int i37 = iE2 >> 3;
                                            long j21 = jArr3[i37];
                                            int i38 = (iE2 & 7) << 3;
                                            if (((j21 >> i38) & j10) == 128) {
                                                jArr3[i37] = (j21 & (~(j10 << i38))) | (((long) (i32 & 127)) << i38);
                                                jArr3[i30] = (jArr3[i30] & (~(j10 << i31))) | (128 << i31);
                                                objArr3[iE2] = objArr3[i29];
                                                objArr3[i29] = null;
                                                jArr4[iE2] = jArr4[i29];
                                                jArr4[i29] = 4611686018427387903L;
                                                int i39 = (int) ((jArr5[i29] >> 32) & 4294967295L);
                                                int i40 = Integer.MAX_VALUE;
                                                if (i39 != Integer.MAX_VALUE) {
                                                    jArr5[i39] = ((long) iE2) | (jArr5[i39] & (-4294967296L));
                                                    jArr5[i29] = (jArr5[i29] & 4294967295L) | (-4294967296L);
                                                    i40 = Integer.MAX_VALUE;
                                                } else {
                                                    jArr5[i29] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr5[iE2] = (((long) i29) << 32) | ((long) i40);
                                            } else {
                                                j13 = j13;
                                                jArr3[i37] = (((long) (i32 & 127)) << i38) | (j21 & (~(j10 << i38)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i29];
                                                objArr3[i29] = obj3;
                                                long j22 = jArr4[iE2];
                                                jArr4[iE2] = jArr4[i29];
                                                jArr4[i29] = j22;
                                                int i41 = (int) ((jArr5[i29] >> 32) & 4294967295L);
                                                if (i41 != Integer.MAX_VALUE) {
                                                    long j23 = iE2;
                                                    jArr5[i41] = (jArr5[i41] & (-4294967296L)) | j23;
                                                    jArr5[i29] = (jArr5[i29] & 4294967295L) | (j23 << 32);
                                                } else {
                                                    long j24 = iE2;
                                                    jArr5[i29] = j24 | (j24 << 32);
                                                    i41 = i29;
                                                }
                                                jArr5[iE2] = (((long) i41) << 32) | ((long) i29);
                                                i29--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i29++;
                                            i23 = i36;
                                            objArr = objArr3;
                                            j13 = j13;
                                        }
                                    } else {
                                        i29++;
                                    }
                                }
                                j = j13;
                                this.f22658h = M.a(this.f22657f) - this.g;
                                long[] jArr6 = this.f22654c;
                                int length2 = jArr6.length;
                                for (int i42 = 0; i42 < length2; i42++) {
                                    long j25 = jArr6[i42];
                                    int i43 = (int) ((j25 >> 31) & 2147483647L);
                                    int i44 = (int) (j25 & 2147483647L);
                                    jArr6[i42] = (((j25 & (-4611686018427387904L)) | ((long) (i43 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i43] & 4294967295L)))) << 31) | ((long) (i44 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i44] & 4294967295L)));
                                }
                                int i45 = this.f22655d;
                                if (i45 != Integer.MAX_VALUE) {
                                    this.f22655d = (int) (jArr5[i45] & 4294967295L);
                                }
                                int i46 = this.f22656e;
                                if (i46 != Integer.MAX_VALUE) {
                                    this.f22656e = (int) (jArr5[i46] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i13);
                    } else {
                        c10 = 31;
                        j11 = 128;
                    }
                    i10 = 0;
                    j = j13;
                    j10 = 255;
                    int iC = M.c(this.f22657f);
                    long[] jArr7 = this.f22652a;
                    Object[] objArr4 = this.f22653b;
                    long[] jArr8 = this.f22654c;
                    int i47 = this.f22657f;
                    int[] iArr = new int[i47];
                    f(iC);
                    long[] jArr9 = this.f22652a;
                    Object[] objArr5 = this.f22653b;
                    long[] jArr10 = this.f22654c;
                    int i48 = this.f22657f;
                    int i49 = 0;
                    while (i49 < i47) {
                        if (((jArr7[i49 >> 3] >> ((i49 & 7) << 3)) & 255) < j11) {
                            Object obj4 = objArr4[i49];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i50 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i50 >>> 7);
                            jArr = jArr9;
                            long j26 = i50 & 127;
                            int i51 = iE3 >> 3;
                            int i52 = (iE3 & 7) << 3;
                            long j27 = (jArr[i51] & (~(255 << i52))) | (j26 << i52);
                            jArr[i51] = j27;
                            jArr[(((iE3 - 7) & i48) + (i48 & 7)) >> 3] = j27;
                            objArr5[iE3] = obj4;
                            jArr10[iE3] = jArr8[i49];
                            iArr[i49] = iE3;
                        } else {
                            jArr = jArr9;
                        }
                        i49++;
                        jArr7 = jArr7;
                        jArr9 = jArr;
                    }
                    long[] jArr11 = this.f22654c;
                    int length3 = jArr11.length;
                    for (int i53 = 0; i53 < length3; i53++) {
                        long j28 = jArr11[i53];
                        int i54 = (int) ((j28 >> c10) & 2147483647L);
                        int i55 = (int) (j28 & 2147483647L);
                        jArr11[i53] = (((j28 & (-4611686018427387904L)) | ((long) (i54 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i54]))) << c10) | ((long) (i55 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i55]));
                    }
                    int i56 = this.f22655d;
                    if (i56 != Integer.MAX_VALUE) {
                        this.f22655d = iArr[i56];
                    }
                    int i57 = this.f22656e;
                    if (i57 != Integer.MAX_VALUE) {
                        this.f22656e = iArr[i57];
                    }
                    iE = e(i13);
                }
                this.g++;
                int i58 = this.f22658h;
                long[] jArr12 = this.f22652a;
                int i59 = iE >> 3;
                long j29 = jArr12[i59];
                int i60 = (iE & 7) << 3;
                if (((j29 >> i60) & j10) == j11) {
                    i10 = 1;
                }
                this.f22658h = i58 - i10;
                int i61 = this.f22657f;
                long j30 = (j29 & (~(j10 << i60))) | (j << i60);
                jArr12[i59] = j30;
                jArr12[(((iE - 7) & i61) + (i61 & 7)) >> 3] = j30;
                return iE;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i11 = i21;
        }
    }

    public final int e(int i10) {
        int i11 = this.f22657f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22652a;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        if (b5.g != this.g) {
            return false;
        }
        Object[] objArr = this.f22653b;
        long[] jArr = this.f22652a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128 && !b5.c(objArr[(i10 << 3) + i12])) {
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
        long[] jArr;
        long[] jArr2;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22657f = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22652a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22658h = M.a(this.f22657f) - this.g;
        this.f22653b = iMax == 0 ? p204v.a.f23000c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC1361p.f22745b;
        } else {
            jArr2 = new long[iMax];
            p120l9.l.g0(jArr2, 4611686018427387903L);
        }
        this.f22654c = jArr2;
    }

    public final boolean g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f22657f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f22652a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (p251z9.j.a(this.f22653b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            h(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void h(int i10) {
        this.g--;
        long[] jArr = this.f22652a;
        int i11 = this.f22657f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f22653b[i10] = null;
        long[] jArr2 = this.f22654c;
        long j10 = jArr2[i10];
        int i14 = (int) ((j10 >> 31) & 2147483647L);
        int i15 = (int) (j10 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (((long) i15) & 2147483647L);
        } else {
            this.f22655d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f22656e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f22657f * 31) + this.g;
        Object[] objArr = this.f22653b;
        long[] jArr = this.f22652a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!p251z9.j.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 != length) {
                    i10++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean i(Collection collection) {
        p251z9.j.e(collection, "elements");
        Object[] objArr = this.f22653b;
        int i10 = this.g;
        long[] jArr = this.f22652a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!p120l9.m.e0(collection, objArr[i14])) {
                                h(i14);
                            }
                        }
                        j >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != this.g;
    }

    public final String toString() {
        p085i0.f fVar = new p085i0.f(8, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f22653b;
        long[] jArr = this.f22654c;
        int i10 = this.f22656e;
        int i11 = 0;
        while (i10 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                p251z9.j.d(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) fVar.e(obj));
            i11++;
            i10 = i12;
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        p251z9.j.d(string2, "toString(...)");
        return string2;
    }
}
