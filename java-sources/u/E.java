package u;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f22670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f22671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22674f;

    public E(int i10) {
        this.f22669a = M.f22699a;
        Object[] objArr = p204v.a.f23000c;
        this.f22670b = objArr;
        this.f22671c = objArr;
        if (i10 >= 0) {
            h(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f22673e = 0;
        long[] jArr = this.f22669a;
        if (jArr != M.f22699a) {
            p120l9.l.g0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f22669a;
            int i10 = this.f22672d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        p120l9.l.e0(0, this.f22672d, null, this.f22671c);
        p120l9.l.e0(0, this.f22672d, null, this.f22670b);
        this.f22674f = M.a(this.f22672d) - this.f22673e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f22672d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f22669a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (p251z9.j.a(this.f22670b[iNumberOfTrailingZeros], obj)) {
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

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f22672d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f22669a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (p251z9.j.a(this.f22670b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean d(Object obj) {
        Object[] objArr = this.f22671c;
        long[] jArr = this.f22669a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128 && p251z9.j.a(obj, objArr[(i10 << 3) + i12])) {
                            return true;
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
        return false;
    }

    public final int e(int i10) {
        int i11 = this.f22672d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22669a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        if (e10.f22673e != this.f22673e) {
            return false;
        }
        Object[] objArr = this.f22670b;
        Object[] objArr2 = this.f22671c;
        long[] jArr = this.f22669a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            Object obj3 = objArr2[i13];
                            if (obj3 == null) {
                                if (e10.g(obj2) != null || !e10.c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(e10.g(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final int f(Object obj) {
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
        int i14 = this.f22672d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f22669a;
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
                if (p251z9.j.a(this.f22670b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                long j16 = 255;
                if (this.f22674f != 0 || ((this.f22669a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i22 = this.f22672d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compare((((long) this.f22673e) * 32) ^ Long.MIN_VALUE, (((long) i22) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f22669a;
                            int i24 = this.f22672d;
                            Object[] objArr2 = this.f22670b;
                            Object[] objArr3 = this.f22671c;
                            j11 = 128;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
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
                            jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ0] = jArr3[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j19 = (jArr3[i30] >> i31) & j;
                                if (j19 != 128 && j19 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i33 = i32 >>> 7;
                                    int iE2 = e(i33);
                                    int i34 = i33 & i24;
                                    if (((iE2 - i34) & i24) / i27 == ((i29 - i34) & i24) / i27) {
                                        jArr3[i30] = (((long) (i32 & 127)) << i31) | (jArr3[i30] & (~(j << i31)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i29++;
                                        i27 = i27;
                                    } else {
                                        int i35 = i27;
                                        int i36 = iE2 >> 3;
                                        long j20 = jArr3[i36];
                                        int i37 = (iE2 & 7) << 3;
                                        if (((j20 >> i37) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i36] = ((~(j << i37)) & j20) | (((long) (i32 & 127)) << i37);
                                            jArr3[i30] = (jArr3[i30] & (~(j << i31))) | (128 << i31);
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = null;
                                            objArr3[iE2] = objArr3[i29];
                                            objArr3[i29] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i36] = (((long) (i32 & 127)) << i37) | ((~(j << i37)) & j20);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            Object obj4 = objArr3[iE2];
                                            objArr3[iE2] = objArr3[i29];
                                            objArr3[i29] = obj4;
                                            i29--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i29++;
                                        i27 = i35;
                                        i24 = i24;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f22674f = M.a(this.f22672d) - this.f22673e;
                        }
                        iE = e(i12);
                    }
                    j = 255;
                    j10 = j13;
                    j11 = 128;
                    int iC = M.c(this.f22672d);
                    long[] jArr4 = this.f22669a;
                    Object[] objArr4 = this.f22670b;
                    Object[] objArr5 = this.f22671c;
                    int i38 = this.f22672d;
                    h(iC);
                    long[] jArr5 = this.f22669a;
                    Object[] objArr6 = this.f22670b;
                    Object[] objArr7 = this.f22671c;
                    int i39 = this.f22672d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr4[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i40];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i21;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i41 >>> 7);
                            jArr = jArr5;
                            long j21 = i41 & 127;
                            int i42 = iE3 >> 3;
                            int i43 = (iE3 & 7) << 3;
                            long j22 = (jArr[i42] & (~(255 << i43))) | (j21 << i43);
                            jArr[i42] = j22;
                            jArr[(((iE3 - 7) & i39) + (i39 & 7)) >> 3] = j22;
                            objArr6[iE3] = obj5;
                            objArr7[iE3] = objArr5[i40];
                        } else {
                            jArr = jArr5;
                        }
                        i40++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i12);
                }
                this.f22673e++;
                int i44 = this.f22674f;
                long[] jArr6 = this.f22669a;
                int i45 = iE >> 3;
                long j23 = jArr6[i45];
                int i46 = (iE & 7) << 3;
                this.f22674f = i44 - (((j23 >> i46) & j) == j11 ? 1 : 0);
                int i47 = this.f22672d;
                long j24 = (j23 & (~(j << i46))) | (j10 << i46);
                jArr6[i45] = j24;
                jArr6[(((iE - 7) & i47) + (i47 & 7)) >> 3] = j24;
                return ~iE;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final Object g(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f22672d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f22669a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (p251z9.j.a(this.f22670b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f22671c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void h(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22672d = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
            int i11 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i11] = (jArr[i11] & (~j)) | j;
        }
        this.f22669a = jArr;
        this.f22674f = M.a(this.f22672d) - this.f22673e;
        Object[] objArr = p204v.a.f23000c;
        this.f22670b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f22671c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f22670b;
        Object[] objArr2 = this.f22671c;
        long[] jArr = this.f22669a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.f22673e == 0;
    }

    public final Object j(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f22672d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f22669a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (p251z9.j.a(this.f22670b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return k(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object k(int i10) {
        this.f22673e--;
        long[] jArr = this.f22669a;
        int i11 = this.f22672d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f22670b[i10] = null;
        Object[] objArr = this.f22671c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void l(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.f22670b[iF] = obj;
        this.f22671c[iF] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
      0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f22670b;
        Object[] objArr2 = this.f22671c;
        long[] jArr = this.f22669a;
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
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i11++;
                            if (i11 < this.f22673e) {
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

    public /* synthetic */ E() {
        this(6);
    }
}
