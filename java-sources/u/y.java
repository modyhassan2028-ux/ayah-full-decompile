package u;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f22779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f22780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22783f;

    public y(int i10) {
        this.f22778a = M.f22699a;
        this.f22779b = p204v.a.f23000c;
        this.f22780c = AbstractC1353h.f22729a;
        if (i10 >= 0) {
            d(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f22782e = 0;
        long[] jArr = this.f22778a;
        if (jArr != M.f22699a) {
            p120l9.l.g0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f22778a;
            int i10 = this.f22781d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        p120l9.l.e0(0, this.f22781d, null, this.f22779b);
        this.f22783f = M.a(this.f22781d) - this.f22782e;
    }

    public final int b(int i10) {
        int i11 = this.f22781d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22778a;
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
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f22781d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f22778a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (p251z9.j.a(this.f22779b[iNumberOfTrailingZeros], obj)) {
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

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22781d = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22778a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22783f = M.a(this.f22781d) - this.f22782e;
        this.f22779b = new Object[iMax];
        this.f22780c = new float[iMax];
    }

    public final void e(Object obj, float f3) {
        long j;
        long j10;
        long j11;
        int i10;
        long[] jArr;
        Object[] objArr;
        Object obj2 = obj;
        int i11 = -862048943;
        int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f22781d;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f22778a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j12 = ((jArr2[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr2[i18] >>> i19);
            long j13 = i14;
            int i20 = i14;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j16) >> 3)) & i15;
                int i21 = i11;
                if (p251z9.j.a(this.f22779b[iNumberOfTrailingZeros], obj2)) {
                    i10 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j16 &= j16 - 1;
                    i11 = i21;
                }
            }
            int i22 = i11;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iB = b(i13);
                if (this.f22783f != 0 || ((this.f22778a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i23 = this.f22781d;
                    if (i23 > 8) {
                        j11 = 128;
                        if (Long.compare((((long) this.f22782e) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f22778a;
                            int i24 = this.f22781d;
                            Object[] objArr2 = this.f22779b;
                            float[] fArr = this.f22780c;
                            int i25 = (i24 + 7) >> 3;
                            j = 255;
                            int i26 = 0;
                            while (i26 < i25) {
                                long j17 = jArr3[i26] & j15;
                                jArr3[i26] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i26++;
                                j13 = j13;
                                j15 = -9187201950435737472L;
                            }
                            j10 = j13;
                            char c10 = 7;
                            int iJ0 = p120l9.l.j0(jArr3);
                            int i27 = iJ0 - 1;
                            long j18 = 72057594037927935L;
                            jArr3[i27] = (jArr3[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iJ0] = jArr3[0];
                            int i28 = 0;
                            while (i28 != i24) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j19 = (jArr3[i29] >> i30) & 255;
                                if (j19 != 128 && j19 == 254) {
                                    Object obj3 = objArr2[i28];
                                    int iHashCode2 = (obj3 != null ? obj3.hashCode() : 0) * i22;
                                    int i31 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i32 = i31 >>> 7;
                                    int iB2 = b(i32);
                                    int i33 = i32 & i24;
                                    char c11 = c10;
                                    if (((iB2 - i33) & i24) / 8 == ((i28 - i33) & i24) / 8) {
                                        long j20 = j18;
                                        jArr3[i29] = (((long) (i31 & 127)) << i30) | (jArr3[i29] & (~(255 << i30)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j20) | Long.MIN_VALUE;
                                        i28++;
                                        c10 = c11;
                                        j18 = j20;
                                    } else {
                                        long j21 = j18;
                                        int i34 = iB2 >> 3;
                                        long j22 = jArr3[i34];
                                        int i35 = (iB2 & 7) << 3;
                                        if (((j22 >> i35) & 255) == 128) {
                                            objArr = objArr2;
                                            jArr3[i34] = ((~(255 << i35)) & j22) | (((long) (i31 & 127)) << i35);
                                            jArr3[i29] = (jArr3[i29] & (~(255 << i30))) | (128 << i30);
                                            objArr[iB2] = objArr[i28];
                                            objArr[i28] = null;
                                            fArr[iB2] = fArr[i28];
                                            fArr[i28] = 0.0f;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i34] = ((~(255 << i35)) & j22) | (((long) (i31 & 127)) << i35);
                                            Object obj4 = objArr[iB2];
                                            objArr[iB2] = objArr[i28];
                                            objArr[i28] = obj4;
                                            float f7 = fArr[iB2];
                                            fArr[iB2] = fArr[i28];
                                            fArr[i28] = f7;
                                            i28--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j21) | Long.MIN_VALUE;
                                        i28++;
                                        i24 = i24;
                                        c10 = c11;
                                        j18 = j21;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i28++;
                                }
                            }
                            this.f22783f = M.a(this.f22781d) - this.f22782e;
                        }
                        iB = b(i13);
                    } else {
                        j11 = 128;
                    }
                    j = 255;
                    j10 = j13;
                    int iC = M.c(this.f22781d);
                    long[] jArr4 = this.f22778a;
                    Object[] objArr3 = this.f22779b;
                    float[] fArr2 = this.f22780c;
                    int i36 = this.f22781d;
                    d(iC);
                    long[] jArr5 = this.f22778a;
                    Object[] objArr4 = this.f22779b;
                    float[] fArr3 = this.f22780c;
                    int i37 = this.f22781d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr4[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j11) {
                            Object obj5 = objArr3[i38];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i22;
                            int i39 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB3 = b(i39 >>> 7);
                            jArr = jArr5;
                            long j23 = i39 & 127;
                            int i40 = iB3 >> 3;
                            int i41 = (iB3 & 7) << 3;
                            long j24 = (jArr[i40] & (~(255 << i41))) | (j23 << i41);
                            jArr[i40] = j24;
                            jArr[(((iB3 - 7) & i37) + (i37 & 7)) >> 3] = j24;
                            objArr4[iB3] = obj5;
                            fArr3[iB3] = fArr2[i38];
                        } else {
                            jArr = jArr5;
                        }
                        i38++;
                        jArr5 = jArr;
                    }
                    iB = b(i13);
                }
                this.f22782e++;
                int i42 = this.f22783f;
                long[] jArr6 = this.f22778a;
                int i43 = iB >> 3;
                long j25 = jArr6[i43];
                int i44 = (iB & 7) << 3;
                this.f22783f = i42 - (((j25 >> i44) & j) == j11 ? 1 : 0);
                int i45 = this.f22781d;
                long j26 = (j25 & (~(j << i44))) | (j10 << i44);
                jArr6[i43] = j26;
                jArr6[(((iB - 7) & i45) + (i45 & 7)) >> 3] = j26;
                i10 = ~iB;
                break;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            obj2 = obj;
            i14 = i20;
            i11 = i22;
        }
        if (i10 < 0) {
            i10 = ~i10;
        }
        this.f22779b[i10] = obj;
        this.f22780c[i10] = f3;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f22782e != this.f22782e) {
            return false;
        }
        Object[] objArr = this.f22779b;
        float[] fArr = this.f22780c;
        long[] jArr = this.f22778a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = objArr[i13];
                        float f3 = fArr[i13];
                        int iC = yVar.c(obj2);
                        if (iC < 0 || f3 != yVar.f22780c[iC]) {
                            return false;
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
    }

    public final int hashCode() {
        Object[] objArr = this.f22779b;
        float[] fArr = this.f22780c;
        long[] jArr = this.f22778a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iFloatToIntBits = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iFloatToIntBits += Float.floatToIntBits(fArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return iFloatToIntBits;
                }
            }
            if (i10 == length) {
                return iFloatToIntBits;
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f22782e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f22779b;
        float[] fArr = this.f22780c;
        long[] jArr = this.f22778a;
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
                            float f3 = fArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f3);
                            i11++;
                            if (i11 < this.f22782e) {
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

    public /* synthetic */ y() {
        this(6);
    }
}
