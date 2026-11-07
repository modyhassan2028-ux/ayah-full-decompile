package u;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f22785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f22786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22789f;

    public z(int i10) {
        this.f22784a = M.f22699a;
        this.f22785b = p204v.a.f23000c;
        this.f22786c = AbstractC1357l.f22737a;
        if (i10 >= 0) {
            e(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f22788e = 0;
        long[] jArr = this.f22784a;
        if (jArr != M.f22699a) {
            p120l9.l.g0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f22784a;
            int i10 = this.f22787d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        p120l9.l.e0(0, this.f22787d, null, this.f22785b);
        this.f22789f = M.a(this.f22787d) - this.f22788e;
    }

    public final int b(int i10) {
        int i11 = this.f22787d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22784a;
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

    public final int c(Object obj) {
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
        int i14 = this.f22787d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f22784a;
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
                if (p251z9.j.a(this.f22785b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iB = b(i12);
                long j16 = 255;
                if (this.f22789f != 0 || ((this.f22784a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i22 = this.f22787d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compare((((long) this.f22788e) * 32) ^ Long.MIN_VALUE, (((long) i22) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f22784a;
                            int i24 = this.f22787d;
                            Object[] objArr2 = this.f22785b;
                            int[] iArr = this.f22786c;
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
                                    int iB2 = b(i33);
                                    int i34 = i33 & i24;
                                    long j21 = j19;
                                    if (((iB2 - i34) & i24) / 8 == ((i29 - i34) & i24) / i27) {
                                        jArr3[i30] = (((long) (i32 & 127)) << i31) | (jArr3[i30] & (~(j << i31)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j21) | Long.MIN_VALUE;
                                        i29++;
                                        j19 = j21;
                                        i27 = i27;
                                    } else {
                                        int i35 = i27;
                                        int i36 = iB2 >> 3;
                                        long j22 = jArr3[i36];
                                        int i37 = (iB2 & 7) << 3;
                                        if (((j22 >> i37) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i36] = ((~(j << i37)) & j22) | (((long) (i32 & 127)) << i37);
                                            jArr3[i30] = (jArr3[i30] & (~(j << i31))) | (128 << i31);
                                            objArr[iB2] = objArr[i29];
                                            objArr[i29] = null;
                                            iArr[iB2] = iArr[i29];
                                            iArr[i29] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i36] = (((long) (i32 & 127)) << i37) | ((~(j << i37)) & j22);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            int i38 = iArr[iB2];
                                            iArr[iB2] = iArr[i29];
                                            iArr[i29] = i38;
                                            i29--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j21) | Long.MIN_VALUE;
                                        i29++;
                                        i24 = i24;
                                        j19 = j21;
                                        i27 = i35;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f22789f = M.a(this.f22787d) - this.f22788e;
                        }
                        iB = b(i12);
                    }
                    j = 255;
                    j10 = j13;
                    j11 = 128;
                    int iC = M.c(this.f22787d);
                    long[] jArr4 = this.f22784a;
                    Object[] objArr3 = this.f22785b;
                    int[] iArr2 = this.f22786c;
                    int i39 = this.f22787d;
                    e(iC);
                    long[] jArr5 = this.f22784a;
                    Object[] objArr4 = this.f22785b;
                    int[] iArr3 = this.f22786c;
                    int i40 = this.f22787d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr4[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i41];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB3 = b(i42 >>> 7);
                            jArr = jArr5;
                            long j23 = i42 & 127;
                            int i43 = iB3 >> 3;
                            int i44 = (iB3 & 7) << 3;
                            long j24 = (jArr[i43] & (~(255 << i44))) | (j23 << i44);
                            jArr[i43] = j24;
                            jArr[(((iB3 - 7) & i40) + (i40 & 7)) >> 3] = j24;
                            objArr4[iB3] = obj4;
                            iArr3[iB3] = iArr2[i41];
                        } else {
                            jArr = jArr5;
                        }
                        i41++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iB = b(i12);
                }
                this.f22788e++;
                int i45 = this.f22789f;
                long[] jArr6 = this.f22784a;
                int i46 = iB >> 3;
                long j25 = jArr6[i46];
                int i47 = (iB & 7) << 3;
                this.f22789f = i45 - (((j25 >> i47) & j) == j11 ? 1 : 0);
                int i48 = this.f22787d;
                long j26 = (j25 & (~(j << i47))) | (j10 << i47);
                jArr6[i46] = j26;
                jArr6[(((iB - 7) & i48) + (i48 & 7)) >> 3] = j26;
                return ~iB;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final int d(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f22787d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f22784a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (p251z9.j.a(this.f22785b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22787d = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22784a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22789f = M.a(this.f22787d) - this.f22788e;
        this.f22785b = new Object[iMax];
        this.f22786c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (zVar.f22788e != this.f22788e) {
            return false;
        }
        Object[] objArr = this.f22785b;
        int[] iArr = this.f22786c;
        long[] jArr = this.f22784a;
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
                        Object obj2 = objArr[i13];
                        int i14 = iArr[i13];
                        int iD = zVar.d(obj2);
                        if (iD < 0 || i14 != zVar.f22786c[iD]) {
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

    public final void f(int i10) {
        this.f22788e--;
        long[] jArr = this.f22784a;
        int i11 = this.f22787d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f22785b[i10] = null;
    }

    public final void g(int i10, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f22785b[iC] = obj;
        this.f22786c[iC] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f22785b;
        int[] iArr = this.f22786c;
        long[] jArr = this.f22784a;
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
                        iHashCode += iArr[i13] ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f22788e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f22785b;
        int[] iArr = this.f22786c;
        long[] jArr = this.f22784a;
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
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i15);
                            i11++;
                            if (i11 < this.f22788e) {
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

    public /* synthetic */ z() {
        this(6);
    }
}
