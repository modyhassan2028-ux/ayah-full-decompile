package u;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22773a = M.f22699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f22774b = AbstractC1359n.f22739a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22777e;

    public x(int i10) {
        if (i10 >= 0) {
            c(M.e(i10));
        } else {
            p204v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(long j) {
        int iNumberOfTrailingZeros;
        int i10 = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f22775c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f22773a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f22774b[iNumberOfTrailingZeros] == j) {
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

    public final int b(int i10) {
        int i11 = this.f22775c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f22773a;
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

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, M.d(i10)) : 0;
        this.f22775c = iMax;
        if (iMax == 0) {
            jArr = M.f22699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        this.f22773a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f22777e = M.a(this.f22775c) - this.f22776d;
        this.f22774b = new long[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f22776d != this.f22776d) {
            return false;
        }
        long[] jArr = this.f22774b;
        long[] jArr2 = this.f22773a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr2[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128 && !xVar.a(jArr[(i10 << 3) + i12])) {
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

    public final int hashCode() {
        long[] jArr = this.f22774b;
        long[] jArr2 = this.f22773a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j = jArr2[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j) < 128) {
                        long j10 = jArr[(i10 << 3) + i13];
                        i11 += (int) (j10 ^ (j10 >>> 32));
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
        long[] jArr = this.f22774b;
        long[] jArr2 = this.f22773a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j = jArr2[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j) < 128) {
                        long j10 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(j10);
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
}
