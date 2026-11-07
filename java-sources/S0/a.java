package S0;

import A.C0041r0;
import G.a0;
import J0.C0280d0;
import J0.C0298v;
import J0.I;
import J0.Z;
import J0.j0;
import J0.q0;
import K0.RunnableC0373v;
import android.os.Handler;
import com.google.android.gms.internal.measurement.B1;
import p011b0.e;
import p063g1.j;
import p180s0.F;
import u.A;
import u.t;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f7456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f7458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7461f;
    public RunnableC0373v g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0041r0 f7463i;
    public final p171r0.b j;

    public a() {
        a0 a0Var = new a0(3, (byte) 0);
        a0Var.f2655c = new long[192];
        a0Var.f2656d = new long[192];
        this.f7456a = a0Var;
        this.f7457b = new b();
        this.f7458c = new A();
        this.f7462h = -1L;
        this.f7463i = new C0041r0(22, this);
        this.j = new p171r0.b();
    }

    public static long g(I i10) {
        float[] fArrMo0getUnderlyingMatrixsQKQjiQ;
        int iE;
        C0280d0 c0280d0 = i10.f3914W;
        j0 j0Var = (j0) c0280d0.f4065d;
        j0 j0Var2 = (C0298v) c0280d0.f4064c;
        long jG = 0;
        while (j0Var2 != null && j0Var2 != j0Var) {
            q0 q0Var = j0Var2.f4140W;
            jG = g.G(jG, j0Var2.f4136N);
            j0Var2 = j0Var2.f4127E;
            if (q0Var != null && (iE = B1.e((fArrMo0getUnderlyingMatrixsQKQjiQ = q0Var.mo0getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iE & 2) == 0) {
                    return 9223372034707292159L;
                }
                jG = p180s0.A.b(jG, fArrMo0getUnderlyingMatrixsQKQjiQ);
            }
        }
        return g.L(jG);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00e5 A[EDGE_INSN: B:100:0x00e5->B:53:0x00e5 BREAK  A[LOOP:3: B:36:0x009f->B:50:0x00d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7 A[LOOP:3: B:36:0x009f->B:50:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:76:0x0151  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0177 A[LOOP:6: B:74:0x0145->B:88:0x0177, LOOP_END] */
    public final void a() {
        char c10;
        long j;
        long j10;
        long j11;
        long[] jArr;
        int length;
        int i10;
        long j12;
        int i11;
        int i12;
        long[] jArr2;
        long[] jArr3;
        int i13;
        int i14;
        int i15;
        Handler handler = l0.b.f19305a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.f7459d;
        boolean z11 = z10 || this.f7460e;
        a0 a0Var = this.f7456a;
        b bVar = this.f7457b;
        if (z10) {
            this.f7459d = false;
            A a9 = this.f7458c;
            Object[] objArr = a9.f22650a;
            int i16 = a9.f22651b;
            for (int i17 = 0; i17 < i16; i17++) {
                ((p241y9.a) objArr[i17]).invoke();
            }
            long[] jArr4 = (long[]) a0Var.f2655c;
            int i18 = a0Var.f2654b;
            for (int i19 = 0; i19 < jArr4.length - 2 && i19 < i18; i19 += 3) {
                long j13 = jArr4[i19 + 2];
                if ((((int) (j13 >> 61)) & 1) != 0) {
                    long j14 = jArr4[i19];
                    long j15 = jArr4[i19 + 1];
                    if (bVar.f7464a.b(((int) j13) & 67108863) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            long[] jArr5 = (long[]) a0Var.f2655c;
            int i20 = a0Var.f2654b;
            for (int i21 = 0; i21 < jArr5.length - 2 && i21 < i20; i21 += 3) {
                int i22 = i21 + 2;
                jArr5[i22] = jArr5[i22] & (-2305843009213693953L);
            }
        }
        if (this.f7460e) {
            this.f7460e = false;
            t tVar = bVar.f7464a;
            c10 = 7;
            Object[] objArr2 = tVar.f22733c;
            long[] jArr6 = tVar.f22731a;
            j = 128;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                int i23 = 0;
                j10 = 255;
                while (true) {
                    long j16 = jArr6[i23];
                    j11 = -9187201950435737472L;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i23 != length2) {
                            break;
                            break;
                        }
                        i23++;
                    } else {
                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                        for (int i25 = 0; i25 < i24; i25++) {
                            if ((j16 & 255) < 128 && objArr2[(i23 << 3) + i25] != null) {
                                throw new ClassCastException();
                            }
                            j16 >>= 8;
                        }
                        if (i24 != 8) {
                            break;
                        } else if (i23 != length2) {
                            break;
                        } else {
                            i23++;
                        }
                    }
                }
            }
            if (z11) {
                bVar.getClass();
            }
            if (this.f7461f) {
                this.f7461f = false;
                jArr2 = (long[]) a0Var.f2655c;
                int i26 = a0Var.f2654b;
                jArr3 = (long[]) a0Var.f2656d;
                i14 = 0;
                for (i13 = 0; i13 < jArr2.length - 2 && i14 < jArr3.length - 2 && i13 < i26; i13 += 3) {
                    i15 = i13 + 2;
                    if (jArr2[i15] != 2305843009213693951L) {
                        jArr3[i14] = jArr2[i13];
                        jArr3[i14 + 1] = jArr2[i13 + 1];
                        jArr3[i14 + 2] = jArr2[i15];
                        i14 += 3;
                    }
                }
                a0Var.f2654b = i14;
                a0Var.f2655c = jArr3;
                a0Var.f2656d = jArr2;
            }
            if (bVar.f7465b > jCurrentTimeMillis) {
                return;
            }
            t tVar2 = bVar.f7464a;
            Object[] objArr3 = tVar2.f22733c;
            jArr = tVar2.f22731a;
            length = jArr.length - 2;
            if (length >= 0) {
                i10 = 0;
                while (true) {
                    j12 = jArr[i10];
                    if ((((~j12) << c10) & j12 & j11) != j11) {
                        i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (i12 = 0; i12 < i11; i12++) {
                            if ((j12 & j10) >= j && objArr3[(i10 << 3) + i12] != null) {
                                throw new ClassCastException();
                            }
                            j12 >>= 8;
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
            bVar.f7465b = -1L;
        }
        c10 = 7;
        j = 128;
        j10 = 255;
        j11 = -9187201950435737472L;
        if (z11) {
            bVar.getClass();
        }
        if (this.f7461f) {
            this.f7461f = false;
            jArr2 = (long[]) a0Var.f2655c;
            int i27 = a0Var.f2654b;
            jArr3 = (long[]) a0Var.f2656d;
            i14 = 0;
            while (i13 < jArr2.length - 2) {
                i15 = i13 + 2;
                if (jArr2[i15] != 2305843009213693951L) {
                    jArr3[i14] = jArr2[i13];
                    jArr3[i14 + 1] = jArr2[i13 + 1];
                    jArr3[i14 + 2] = jArr2[i15];
                    i14 += 3;
                }
            }
            a0Var.f2654b = i14;
            a0Var.f2655c = jArr3;
            a0Var.f2656d = jArr2;
        }
        if (bVar.f7465b > jCurrentTimeMillis) {
            return;
        }
        t tVar3 = bVar.f7464a;
        Object[] objArr4 = tVar3.f22733c;
        jArr = tVar3.f22731a;
        length = jArr.length - 2;
        if (length >= 0) {
            i10 = 0;
            while (true) {
                j12 = jArr[i10];
                if ((((~j12) << c10) & j12 & j11) != j11) {
                    i11 = 8 - ((~(i10 - length)) >>> 31);
                    while (i12 < i11) {
                        if ((j12 & j10) >= j) {
                        }
                        j12 >>= 8;
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
        bVar.f7465b = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e7  */
    public final void b(I i10, long j, boolean z10) {
        boolean z11;
        I iU;
        int i11;
        j0 j0Var = (j0) i10.f3914W.f4065d;
        Z z12 = i10.f3915X.f3958p;
        int i12 = (int) (j >> 32);
        float f3 = i12;
        long j10 = 4294967295L;
        int i13 = (int) (j & 4294967295L);
        float fT = i12 + z12.T();
        float fS = i13 + z12.S();
        p171r0.b bVar = this.j;
        bVar.f21383a = f3;
        bVar.f21384b = i13;
        bVar.f21385c = fT;
        bVar.f21386d = fS;
        while (j0Var != null) {
            q0 q0Var = j0Var.f4140W;
            long j11 = j0Var.f4136N;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            bVar.f21383a += fIntBitsToFloat;
            bVar.f21384b += fIntBitsToFloat2;
            bVar.f21385c += fIntBitsToFloat;
            bVar.f21386d += fIntBitsToFloat2;
            j0Var = j0Var.f4127E;
            if (q0Var != null) {
                float[] fArrMo0getUnderlyingMatrixsQKQjiQ = q0Var.mo0getUnderlyingMatrixsQKQjiQ();
                if (!F.n(fArrMo0getUnderlyingMatrixsQKQjiQ)) {
                    p180s0.A.c(fArrMo0getUnderlyingMatrixsQKQjiQ, bVar);
                }
            }
        }
        int i14 = (int) bVar.f21383a;
        int i15 = (int) bVar.f21384b;
        int i16 = (int) bVar.f21385c;
        int i17 = (int) bVar.f21386d;
        int i18 = i10.f3926s;
        a0 a0Var = this.f7456a;
        if (z10) {
            z11 = true;
            iU = i10.u();
            if (iU != null) {
                i11 = iU.f3926s;
            } else {
                i11 = -1;
            }
            a0.h(a0Var, i18, i14, i15, i16, i17, i11);
        } else {
            int i19 = i18 & 67108863;
            long[] jArr = (long[]) a0Var.f2655c;
            int i20 = a0Var.f2654b;
            int i21 = 0;
            while (true) {
                if (i21 >= jArr.length - 2 || i21 >= i20) {
                    z11 = true;
                    iU = i10.u();
                    if (iU != null) {
                        i11 = iU.f3926s;
                    } else {
                        i11 = -1;
                    }
                    a0.h(a0Var, i18, i14, i15, i16, i17, i11);
                } else {
                    int i22 = i21 + 2;
                    long j12 = j10;
                    long j13 = jArr[i22];
                    z11 = true;
                    if ((((int) j13) & 67108863) == i19) {
                        jArr[i21] = (((long) i14) << 32) | (((long) i15) & j12);
                        jArr[i21 + 1] = (((long) i16) << 32) | (((long) i17) & j12);
                        jArr[i22] = 2305843009213693952L | j13;
                    } else {
                        i21 += 3;
                        j10 = j12;
                    }
                }
            }
        }
        this.f7459d = z11;
    }

    public final void c(I i10) {
        e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            b(i13, ((j0) i13.f3914W.f4065d).f4136N, false);
            c(i13);
        }
    }

    public final void d(I i10) {
        this.f7459d = true;
        int i11 = i10.f3926s & 67108863;
        a0 a0Var = this.f7456a;
        long[] jArr = (long[]) a0Var.f2655c;
        int i12 = a0Var.f2654b;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j = jArr[i14];
            if ((((int) j) & 67108863) == i11) {
                jArr[i14] = 2305843009213693952L | j;
                break;
            }
        }
        RunnableC0373v runnableC0373v = this.g;
        boolean z10 = runnableC0373v != null;
        long j10 = this.f7457b.f7465b;
        if (j10 >= 0 || !z10) {
            if (this.f7462h == j10 && z10) {
                return;
            }
            if (runnableC0373v != null) {
                Handler handler = l0.b.f19305a;
                l0.b.f19305a.removeCallbacks(runnableC0373v);
            }
            Handler handler2 = l0.b.f19305a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j10, ((long) 16) + jCurrentTimeMillis);
            this.f7462h = jMax;
            RunnableC0373v runnableC0373v2 = new RunnableC0373v(4, this.f7463i);
            l0.b.f19305a.postDelayed(runnableC0373v2, jMax - jCurrentTimeMillis);
            this.g = runnableC0373v2;
        }
    }

    public final void e(I i10) {
        long jG = g(i10);
        if (j.a(jG, 9223372034707292159L)) {
            c(i10);
            return;
        }
        i10.f3929v = jG;
        i10.f3930w = false;
        e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            f(i13, ((j0) i13.f3914W.f4065d).f4136N, false);
        }
        d(i10);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0207  */
    /* JADX WARN: Code duplicated, block: B:75:0x0216  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    public final void f(I i10, long j, boolean z10) {
        char c10;
        long j10;
        int i11;
        long jL;
        ?? r10;
        I iU;
        int i12;
        long j11;
        char c11;
        int i13;
        float[] fArrMo0getUnderlyingMatrixsQKQjiQ;
        int iE;
        Z z11 = i10.f3915X.f3958p;
        int iT = z11.T();
        int iS = z11.S();
        I iU2 = i10.u();
        long j12 = i10.f3927t;
        long j13 = i10.f3928u;
        int i14 = (int) (j13 >> 32);
        int i15 = (int) (j13 & 4294967295L);
        int i16 = 0;
        if (iU2 != null) {
            c10 = ' ';
            boolean z12 = iU2.f3930w;
            j10 = 4294967295L;
            long j14 = iU2.f3927t;
            long jG = iU2.f3929v;
            if (j.a(j14, 9223372034707292159L)) {
                j0 j0Var = (j0) i10.f3914W.f4065d;
                long jG2 = 0;
                while (true) {
                    if (j0Var == null) {
                        i11 = i16;
                        jL = g.L(jG2);
                        break;
                    }
                    i11 = i16;
                    q0 q0Var = j0Var.f4140W;
                    jG2 = g.G(jG2, j0Var.f4136N);
                    j0Var = j0Var.f4127E;
                    if (q0Var != null && (iE = B1.e((fArrMo0getUnderlyingMatrixsQKQjiQ = q0Var.mo0getUnderlyingMatrixsQKQjiQ()))) != 3) {
                        if ((iE & 2) == 0) {
                            jL = 9223372034707292159L;
                            break;
                        }
                        jG2 = p180s0.A.b(jG2, fArrMo0getUnderlyingMatrixsQKQjiQ);
                    }
                    i16 = i11;
                }
            } else {
                if (z12) {
                    jG = g(iU2);
                    iU2.f3929v = jG;
                    iU2.f3930w = false;
                }
                boolean zA = j.a(jG, 9223372034707292159L);
                jL = j.c(j.c(j14, jG), j);
                i11 = 0;
                r10 = zA;
            }
            if (r10 == 0 || j.a(jL, 9223372034707292159L)) {
                b(i10, j, z10);
            }
            i10.f3927t = jL;
            i10.f3928u = (((long) iT) << c10) | (((long) iS) & j10);
            int i17 = (int) (jL >> c10);
            int i18 = (int) (jL & j10);
            int i19 = i17 + iT;
            int i20 = i18 + iS;
            if (!z10 && j.a(jL, j12) && i14 == iT && i15 == iS) {
                return;
            }
            int i21 = i10.f3926s;
            a0 a0Var = this.f7456a;
            if (z10) {
                iU = i10.u();
                if (iU != null) {
                    i12 = iU.f3926s;
                } else {
                    i12 = -1;
                }
                a0.h(a0Var, i21, i17, i18, i19, i20, i12);
            } else {
                int i22 = 67108863;
                int i23 = i21 & 67108863;
                long[] jArr = (long[]) a0Var.f2655c;
                int i24 = a0Var.f2654b;
                int i25 = i11;
                while (true) {
                    if (i25 >= jArr.length - 2 || i25 >= i24) {
                        iU = i10.u();
                        if (iU != null) {
                            i12 = iU.f3926s;
                        } else {
                            i12 = -1;
                        }
                        a0.h(a0Var, i21, i17, i18, i19, i20, i12);
                    } else {
                        int i26 = i25 + 2;
                        int i27 = i22;
                        long j15 = jArr[i26];
                        if ((((int) j15) & i27) == i23) {
                            long j16 = jArr[i25];
                            jArr[i25] = (((long) i17) << c10) | (((long) i18) & j10);
                            jArr[i25 + 1] = (((long) i19) << c10) | (((long) i20) & j10);
                            long j17 = 2305843009213693952L;
                            jArr[i26] = j15 | 2305843009213693952L;
                            int i28 = i17 - ((int) (j16 >> c10));
                            int i29 = i18 - ((int) j16);
                            if (((i28 != 0 ? 1 : i11) | (i29 != 0 ? 1 : i11)) != 0) {
                                long j18 = -4503599560261633L;
                                char c12 = 26;
                                long j19 = (j15 & (-4503599560261633L)) | (((long) ((i25 + 3) & i27)) << 26);
                                long[] jArr2 = (long[]) a0Var.f2655c;
                                long[] jArr3 = (long[]) a0Var.f2656d;
                                int i30 = a0Var.f2654b / 3;
                                jArr3[i11] = j19;
                                int i31 = 1;
                                while (i31 > 0) {
                                    i31--;
                                    long j20 = jArr3[i31];
                                    int i32 = ((int) j20) & i27;
                                    long j21 = j18;
                                    int i33 = ((int) (j20 >> c12)) & i27;
                                    char c13 = '4';
                                    int i34 = ((int) (j20 >> 52)) & 511;
                                    int i35 = i34 == 511 ? i30 : i34 + i33;
                                    if (i33 < 0) {
                                        break;
                                    }
                                    while (i33 < jArr2.length - 2 && i33 < i35) {
                                        int i36 = i33 + 2;
                                        long j22 = jArr2[i36];
                                        char c14 = c13;
                                        int i37 = i30;
                                        if ((((int) (j22 >> c12)) & i27) == i32) {
                                            long j23 = jArr2[i33];
                                            int i38 = i33 + 1;
                                            j11 = j17;
                                            long j24 = jArr2[i38];
                                            c11 = c12;
                                            i13 = i35;
                                            jArr2[i33] = (((long) (((int) j23) + i29)) & j10) | (((long) (((int) (j23 >> c10)) + i28)) << c10);
                                            jArr2[i38] = (((long) (((int) j24) + i29)) & j10) | (((long) (((int) (j24 >> c10)) + i28)) << c10);
                                            jArr2[i36] = j22 | j11;
                                            if ((((int) (j22 >> c14)) & 511) > 0) {
                                                jArr3[i31] = (j22 & j21) | (((long) ((i33 + 3) & i27)) << c11);
                                                i31++;
                                            }
                                        } else {
                                            j11 = j17;
                                            c11 = c12;
                                            i13 = i35;
                                        }
                                        i33 += 3;
                                        i30 = i37;
                                        c13 = c14;
                                        j17 = j11;
                                        c12 = c11;
                                        i35 = i13;
                                    }
                                    i30 = i30;
                                    j18 = j21;
                                    j17 = j17;
                                    c12 = c12;
                                }
                            }
                        } else {
                            i25 += 3;
                            i22 = i27;
                        }
                    }
                }
            }
            this.f7459d = true;
            return;
        }
        c10 = ' ';
        j10 = 4294967295L;
        i11 = 0;
        jL = j;
        r10 = i11;
        if (r10 == 0) {
        }
        b(i10, j, z10);
    }

    public final void h(I i10) {
        int i11 = i10.f3926s & 67108863;
        a0 a0Var = this.f7456a;
        long[] jArr = (long[]) a0Var.f2655c;
        int i12 = a0Var.f2654b;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            if ((((int) jArr[i14]) & 67108863) == i11) {
                jArr[i13] = -1;
                jArr[i13 + 1] = -1;
                jArr[i14] = 2305843009213693951L;
                break;
            }
        }
        this.f7459d = true;
        this.f7461f = true;
    }
}
