package u;

import Z.J0;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f22676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22679e;

    public F(int i10) {
        this.f22675a = M.f22699a;
        this.f22676b = p204v.a.f23000c;
        if (i10 >= 0) {
            f(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f22678d;
        this.f22676b[d(obj)] = obj;
        return this.f22678d != i10;
    }

    public final void b() {
        this.f22678d = 0;
        long[] jArr = this.f22675a;
        if (jArr != M.f22699a) {
            p120l9.l.g0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f22675a;
            int i10 = this.f22677c;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        p120l9.l.e0(0, this.f22677c, null, this.f22676b);
        this.f22679e = M.a(this.f22677c) - this.f22678d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f22677c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f22675a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (p251z9.j.a(this.f22676b[iNumberOfTrailingZeros], obj)) {
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
        long j;
        long j10;
        long j11;
        long[] jArr;
        Object[] objArr;
        int i10 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f22677c;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f22675a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j12 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
            long j13 = i13;
            int i19 = i13;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j15) >> 3)) & i14;
                int i20 = i10;
                if (p251z9.j.a(this.f22676b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                long j16 = 255;
                if (this.f22679e != 0 || ((this.f22675a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i22 = this.f22677c;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compare((((long) this.f22678d) * 32) ^ Long.MIN_VALUE, (((long) i22) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f22675a;
                            int i24 = this.f22677c;
                            Object[] objArr2 = this.f22676b;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            j11 = 128;
                            while (i26 < i25) {
                                long j17 = j16;
                                long j18 = jArr3[i26] & (-9187201950435737472L);
                                jArr3[i26] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i26++;
                                i23 = i23;
                                j13 = j13;
                                j16 = j17;
                            }
                            j = j16;
                            j10 = j13;
                            int i27 = i23;
                            int iJ0 = p120l9.l.j0(jArr3);
                            int i28 = iJ0 - 1;
                            long j19 = 72057594037927935L;
                            jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ0] = jArr3[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j20 = (jArr3[i30] >> i31) & j;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i33 = i32 >>> 7;
                                    int iE2 = e(i33);
                                    int i34 = i33 & i24;
                                    if (((iE2 - i34) & i24) / i27 == ((i29 - i34) & i24) / i27) {
                                        long j21 = j19;
                                        jArr3[i30] = (((long) (i32 & 127)) << i31) | ((~(j << i31)) & jArr3[i30]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j21) | Long.MIN_VALUE;
                                        i29++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i35 = iE2 >> 3;
                                        long j23 = jArr3[i35];
                                        int i36 = (iE2 & 7) << 3;
                                        if (((j23 >> i36) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i35] = ((~(j << i36)) & j23) | (((long) (i32 & 127)) << i36);
                                            jArr3[i30] = (jArr3[i30] & (~(j << i31))) | (128 << i31);
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i35] = (((long) (i32 & 127)) << i36) | ((~(j << i36)) & j23);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            i29--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j22) | Long.MIN_VALUE;
                                        i29++;
                                        j19 = j22;
                                        i27 = i27;
                                        i24 = i24;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f22679e = M.a(this.f22677c) - this.f22678d;
                        }
                        iE = e(i12);
                    }
                    j = 255;
                    j10 = j13;
                    j11 = 128;
                    int iC = M.c(this.f22677c);
                    long[] jArr4 = this.f22675a;
                    Object[] objArr3 = this.f22676b;
                    int i37 = this.f22677c;
                    f(iC);
                    long[] jArr5 = this.f22675a;
                    Object[] objArr4 = this.f22676b;
                    int i38 = this.f22677c;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr4[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i40 >>> 7);
                            long j24 = i40 & 127;
                            int i41 = iE3 >> 3;
                            int i42 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j25 = (jArr5[i41] & (~(255 << i42))) | (j24 << i42);
                            jArr[i41] = j25;
                            jArr[(((iE3 - 7) & i38) + (i38 & 7)) >> 3] = j25;
                            objArr4[iE3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i39++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i12);
                }
                this.f22678d++;
                int i43 = this.f22679e;
                long[] jArr6 = this.f22675a;
                int i44 = iE >> 3;
                long j26 = jArr6[i44];
                int i45 = (iE & 7) << 3;
                this.f22679e = i43 - (((j26 >> i45) & j) == j11 ? 1 : 0);
                int i46 = this.f22677c;
                long j27 = (j26 & (~(j << i45))) | (j10 << i45);
                jArr6[i44] = j27;
                jArr6[(((iE - 7) & i46) + (i46 & 7)) >> 3] = j27;
                return iE;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final int e(int i10) {
        int i11 = this.f22677c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22675a;
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
        if (!(obj instanceof F)) {
            return false;
        }
        F f3 = (F) obj;
        if (f3.f22678d != this.f22678d) {
            return false;
        }
        Object[] objArr = this.f22676b;
        long[] jArr = this.f22675a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128 && !f3.c(objArr[(i10 << 3) + i12])) {
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
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22677c = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22675a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22679e = M.a(this.f22677c) - this.f22678d;
        this.f22676b = iMax == 0 ? p204v.a.f23000c : new Object[iMax];
    }

    public final boolean g() {
        return this.f22678d == 0;
    }

    public final boolean h() {
        return this.f22678d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f22677c * 31) + this.f22678d;
        Object[] objArr = this.f22676b;
        long[] jArr = this.f22675a;
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

    public final void i(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f22677c;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f22675a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (p251z9.j.a(this.f22676b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i10 += 8;
                i14 = i15 + i10;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(Object obj) {
        this.f22676b[d(obj)] = obj;
    }

    public final void k(F f3) {
        p251z9.j.e(f3, "elements");
        Object[] objArr = f3.f22676b;
        long[] jArr = f3.f22675a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        j(objArr[(i10 << 3) + i12]);
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f22677c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f22675a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (p251z9.j.a(this.f22676b[iNumberOfTrailingZeros], obj)) {
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
            m(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void m(int i10) {
        this.f22678d--;
        long[] jArr = this.f22675a;
        int i11 = this.f22677c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f22676b[i10] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:0: B:5:0x001b->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[SYNTHETIC] */
    public final String toString() {
        J0 j10 = new J0(this, 1);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f22676b;
        long[] jArr = this.f22675a;
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
                        Object obj = objArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) j10.e(obj));
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

    public /* synthetic */ F() {
        this(6);
    }
}
