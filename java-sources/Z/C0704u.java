package Z;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p001a0.C0717a;

/* JADX INFO: renamed from: Z.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0704u implements InterfaceC0701q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final u.E f10810A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0717a f10811B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0717a f10812C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final u.E f10813D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public u.E f10814E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f10815F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C0704u f10816G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10817H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final S f10818I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0698o f10819J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f10820K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f10821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final android.support.v4.media.session.r f10822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f10823t = new AtomicReference(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f10824u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u.H f10825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x0 f10826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u.E f10827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u.F f10828y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final u.F f10829z;

    public C0704u(r rVar, android.support.v4.media.session.r rVar2) {
        this.f10821r = rVar;
        this.f10822s = rVar2;
        u.H h7 = new u.H(new u.F());
        this.f10825v = h7;
        x0 x0Var = new x0();
        if (rVar.c()) {
            x0Var.f10853B = new u.t();
        }
        if (rVar.e()) {
            x0Var.c();
        }
        this.f10826w = x0Var;
        this.f10827x = va.g.k();
        this.f10828y = new u.F();
        this.f10829z = new u.F();
        this.f10810A = va.g.k();
        C0717a c0717a = new C0717a();
        this.f10811B = c0717a;
        C0717a c0717a2 = new C0717a();
        this.f10812C = c0717a2;
        this.f10813D = va.g.k();
        this.f10814E = va.g.k();
        this.f10818I = new S(7);
        C0698o c0698o = new C0698o(rVar2, rVar, x0Var, h7, c0717a, c0717a2, this);
        rVar.l(c0698o);
        this.f10819J = c0698o;
        p074h0.d dVar = AbstractC0684h.f10674a;
    }

    public final void a() {
        this.f10823t.set(null);
        this.f10811B.f11086i.S();
        this.f10812C.f11086i.S();
        u.H h7 = this.f10825v;
        if (h7.f22692r.g()) {
            return;
        }
        new ArrayList();
        if (h7.f22692r.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            G9.h hVar = new G9.h(h7);
            G9.j jVar = (G9.j) hVar.f2934s;
            while (jVar.hasNext()) {
                t0 t0Var = (t0) jVar.next();
                hVar.remove();
                t0Var.c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    public final void b(Object obj, boolean z10) {
        int i10;
        Object objG = this.f10827x.g(obj);
        if (objG == null) {
            return;
        }
        boolean z11 = objG instanceof u.F;
        M m10 = M.f10623r;
        u.F f3 = this.f10828y;
        u.F f7 = this.f10829z;
        u.E e10 = this.f10813D;
        if (!z11) {
            C0699o0 c0699o0 = (C0699o0) objG;
            if (va.g.I(e10, obj, c0699o0) || c0699o0.c(obj) == m10) {
                return;
            }
            if (c0699o0.g == null || z10) {
                f3.a(c0699o0);
                return;
            } else {
                f7.a(c0699o0);
                return;
            }
        }
        u.F f10 = (u.F) objG;
        Object[] objArr = f10.f22676b;
        long[] jArr = f10.f22675a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j = jArr[i11];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j & 255) < 128) {
                        C0699o0 c0699o1 = (C0699o0) objArr[(i11 << 3) + i14];
                        if (va.g.I(e10, obj, c0699o1)) {
                            i10 = i12;
                        } else {
                            i10 = i12;
                            if (c0699o1.c(obj) != m10) {
                                if (c0699o1.g == null || z10) {
                                    f3.a(c0699o1);
                                } else {
                                    f7.a(c0699o1);
                                }
                            }
                        }
                    } else {
                        i10 = i12;
                    }
                    j >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0237 A[LOOP:6: B:94:0x01e3->B:111:0x0237, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0244 A[EDGE_INSN: B:204:0x0244->B:113:0x0244 BREAK  A[LOOP:6: B:94:0x01e3->B:111:0x0237], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0122 A[EDGE_INSN: B:224:0x0122->B:219:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void c(Set set, boolean z10) {
        long j;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j12;
        boolean zC;
        long[] jArr3;
        long j13;
        long[] jArr4;
        long[] jArr5;
        int i10;
        long j14;
        boolean zG;
        int i11;
        long j15;
        long[] jArr6;
        long[] jArr7;
        char c11;
        long j16;
        int i12;
        int i13;
        boolean z11 = set instanceof p011b0.h;
        u.E e10 = this.f10810A;
        Object obj = null;
        int i14 = 8;
        if (z11) {
            u.F f3 = ((p011b0.h) set).f13139r;
            Object[] objArr = f3.f22676b;
            long[] jArr8 = f3.f22675a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i15 = 0;
                j = 128;
                j10 = 255;
                while (true) {
                    long j17 = jArr8[i15];
                    char c12 = 7;
                    j11 = -9187201950435737472L;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j17 & 255) < 128) {
                                Object obj2 = objArr[(i15 << 3) + i17];
                                c11 = c12;
                                if (obj2 instanceof C0699o0) {
                                    ((C0699o0) obj2).c(obj);
                                } else {
                                    b(obj2, z10);
                                    Object objG = e10.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof u.F) {
                                            u.F f7 = (u.F) objG;
                                            Object[] objArr2 = f7.f22676b;
                                            long[] jArr9 = f7.f22675a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i18 = i14;
                                                i12 = length;
                                                int i19 = 0;
                                                while (true) {
                                                    long j18 = jArr9[i19];
                                                    j16 = j17;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j18) << c11) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((j18 & 255) < 128) {
                                                                b((C) objArr2[(i19 << 3) + i21], z10);
                                                            }
                                                            j18 >>= i18;
                                                            i21++;
                                                            jArr8 = jArr8;
                                                        }
                                                        jArr7 = jArr8;
                                                        if (i20 != i18) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr8;
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    jArr9 = jArr10;
                                                    j17 = j16;
                                                    jArr8 = jArr7;
                                                    i18 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j16 = j17;
                                            i12 = length;
                                            b((C) objG, z10);
                                        }
                                    }
                                    i13 = 8;
                                }
                                jArr7 = jArr8;
                                j16 = j17;
                                i12 = length;
                                i13 = 8;
                            } else {
                                jArr7 = jArr8;
                                c11 = c12;
                                j16 = j17;
                                i12 = length;
                                i13 = i14;
                            }
                            j17 = j16 >> i13;
                            i17++;
                            length = i12;
                            i14 = i13;
                            c12 = c11;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        c10 = c12;
                        int i22 = length;
                        if (i16 != i14) {
                            break;
                        } else {
                            length = i22;
                        }
                    } else {
                        jArr6 = jArr8;
                        c10 = 7;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    jArr8 = jArr6;
                    obj = null;
                    i14 = 8;
                }
            } else {
                j = 128;
                j10 = 255;
                j11 = -9187201950435737472L;
                c10 = 7;
            }
        } else {
            j = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c10 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C0699o0) {
                    ((C0699o0) obj3).c(null);
                } else {
                    b(obj3, z10);
                    Object objG2 = e10.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof u.F) {
                            u.F f10 = (u.F) objG2;
                            Object[] objArr3 = f10.f22676b;
                            long[] jArr11 = f10.f22675a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i23 = 0;
                                while (true) {
                                    long j19 = jArr11[i23];
                                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i23 != length3) {
                                            break;
                                            break;
                                        }
                                        i23++;
                                    } else {
                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                        for (int i25 = 0; i25 < i24; i25++) {
                                            if ((j19 & 255) < 128) {
                                                b((C) objArr3[(i23 << 3) + i25], z10);
                                            }
                                            j19 >>= 8;
                                        }
                                        if (i24 != 8) {
                                            break;
                                        } else if (i23 != length3) {
                                            break;
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((C) objG2, z10);
                        }
                    }
                }
            }
        }
        u.E e11 = this.f10827x;
        u.F f11 = this.f10828y;
        if (z10) {
            u.F f12 = this.f10829z;
            if (f12.h()) {
                long[] jArr12 = e11.f22669a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i26 = 0;
                    while (true) {
                        long j20 = jArr12[i26];
                        if ((((~j20) << c10) & j20 & j11) != j11) {
                            int i27 = 8 - ((~(i26 - length4)) >>> 31);
                            int i28 = 0;
                            while (i28 < i27) {
                                if ((j20 & j10) < j) {
                                    int i29 = (i26 << 3) + i28;
                                    Object obj4 = e11.f22670b[i29];
                                    Object obj5 = e11.f22671c[i29];
                                    if (obj5 instanceof u.F) {
                                        u.F f13 = (u.F) obj5;
                                        Object[] objArr4 = f13.f22676b;
                                        long[] jArr13 = f13.f22675a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j14 = j20;
                                            int i30 = 0;
                                            while (true) {
                                                long j21 = jArr13[i30];
                                                jArr5 = jArr12;
                                                i10 = length4;
                                                if ((((~j21) << c10) & j21 & j11) != j11) {
                                                    int i31 = 8 - ((~(i30 - length5)) >>> 31);
                                                    for (int i32 = 0; i32 < i31; i32 = i11 + 1) {
                                                        if ((j21 & j10) < j) {
                                                            i11 = i32;
                                                            int i33 = (i30 << 3) + i11;
                                                            j15 = j21;
                                                            C0699o0 c0699o0 = (C0699o0) objArr4[i33];
                                                            if (f12.c(c0699o0) || f11.c(c0699o0)) {
                                                                f13.m(i33);
                                                            }
                                                        } else {
                                                            i11 = i32;
                                                            j15 = j21;
                                                        }
                                                        j21 = j15 >> 8;
                                                    }
                                                    if (i31 != 8) {
                                                        break;
                                                    }
                                                    if (i30 != length5) {
                                                        break;
                                                    }
                                                    i30++;
                                                    length4 = i10;
                                                    jArr12 = jArr5;
                                                } else if (i30 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i30++;
                                                    length4 = i10;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i10 = length4;
                                            j14 = j20;
                                        }
                                        zG = f13.g();
                                    } else {
                                        jArr5 = jArr12;
                                        i10 = length4;
                                        j14 = j20;
                                        p251z9.j.c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        C0699o0 c0699o1 = (C0699o0) obj5;
                                        zG = f12.c(c0699o1) || f11.c(c0699o1);
                                    }
                                    if (zG) {
                                        e11.k(i29);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i10 = length4;
                                    j14 = j20;
                                }
                                j20 = j14 >> 8;
                                i28++;
                                length4 = i10;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i34 = length4;
                            if (i27 != 8) {
                                break;
                            } else {
                                length4 = i34;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i26 == length4) {
                            break;
                        }
                        i26++;
                        jArr12 = jArr4;
                    }
                }
                f12.b();
                h();
                return;
            }
        }
        if (f11.h()) {
            long[] jArr14 = e11.f22669a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i35 = 0;
                while (true) {
                    long j22 = jArr14[i35];
                    if ((((~j22) << c10) & j22 & j11) != j11) {
                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                        int i37 = 0;
                        while (i37 < i36) {
                            if ((j22 & j10) < j) {
                                int i38 = (i35 << 3) + i37;
                                Object obj6 = e11.f22670b[i38];
                                Object obj7 = e11.f22671c[i38];
                                if (obj7 instanceof u.F) {
                                    u.F f14 = (u.F) obj7;
                                    Object[] objArr5 = f14.f22676b;
                                    long[] jArr15 = f14.f22675a;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j12 = j22;
                                        int i39 = 0;
                                        while (true) {
                                            long j23 = jArr15[i39];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j23) << c10) & j23 & j11) != j11) {
                                                int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                int i41 = 0;
                                                while (i41 < i40) {
                                                    if ((j23 & j10) < j) {
                                                        jArr3 = jArr14;
                                                        int i42 = (i39 << 3) + i41;
                                                        j13 = j23;
                                                        if (f11.c((C0699o0) objArr6[i42])) {
                                                            f14.m(i42);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j13 = j23;
                                                    }
                                                    i41++;
                                                    jArr14 = jArr3;
                                                    j23 = j13 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i40 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i39 == length7) {
                                                break;
                                            }
                                            i39++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j12 = j22;
                                    }
                                    zC = f14.g();
                                } else {
                                    jArr2 = jArr14;
                                    j12 = j22;
                                    p251z9.j.c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zC = f11.c((C0699o0) obj7);
                                }
                                if (zC) {
                                    e11.k(i38);
                                }
                            } else {
                                jArr2 = jArr14;
                                j12 = j22;
                            }
                            i37++;
                            j22 = j12 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i36 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i35 == length6) {
                        break;
                    }
                    i35++;
                    jArr14 = jArr;
                }
            }
            h();
            f11.b();
        }
    }

    public final void d() {
        synchronized (this.f10824u) {
            try {
                e(this.f10811B);
                n();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f10825v.f22692r.g()) {
                            u.H h7 = this.f10825v;
                            new ArrayList();
                            if (!h7.f22692r.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    G9.h hVar = new G9.h(h7);
                                    while (((G9.j) hVar.f2934s).hasNext()) {
                                        t0 t0Var = (t0) ((G9.j) hVar.f2934s).next();
                                        hVar.remove();
                                        t0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        a();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0118 A[EDGE_INSN: B:114:0x0118->B:61:0x0118 BREAK  A[LOOP:3: B:44:0x00cd->B:59:0x010d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[Catch: all -> 0x00fd, LOOP:3: B:44:0x00cd->B:59:0x010d, LOOP_END, TryCatch #3 {all -> 0x00fd, blocks: (B:30:0x0073, B:33:0x007f, B:35:0x008f, B:37:0x009b, B:39:0x00a5, B:41:0x00b9, B:44:0x00cd, B:46:0x00db, B:48:0x00e5, B:50:0x00eb, B:52:0x00f9, B:55:0x0100, B:61:0x0118, B:67:0x0135, B:70:0x0146, B:59:0x010d, B:62:0x011d, B:76:0x0160, B:77:0x016a), top: B:103:0x0073, outer: #0 }] */
    public final void e(C0717a c0717a) {
        long[] jArr;
        int i10;
        long[] jArr2;
        long j;
        char c10;
        long j10;
        int i11;
        boolean zG;
        C0717a c0717a2 = this.f10812C;
        E6.h hVar = new E6.h(this.f10825v);
        try {
            if (c0717a.f11086i.U()) {
                if (c0717a2.f11086i.U()) {
                    hVar.c();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                android.support.v4.media.session.r rVar = this.f10822s;
                A0 a0E = this.f10826w.e();
                int i12 = 0;
                try {
                    c0717a.S(rVar, a0E, hVar);
                    a0E.e(true);
                    rVar.J();
                    Trace.endSection();
                    hVar.d();
                    p011b0.e eVar = (p011b0.e) hVar.f1925e;
                    if (eVar.f13127t != 0) {
                        Trace.beginSection("Compose:sideeffects");
                        try {
                            Object[] objArr = eVar.f13125r;
                            int i13 = eVar.f13127t;
                            for (int i14 = 0; i14 < i13; i14++) {
                                ((p241y9.a) objArr[i14]).invoke();
                            }
                            eVar.g();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (this.f10815F) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.f10815F = false;
                            u.E e10 = this.f10827x;
                            long[] jArr3 = e10.f22669a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j11 = jArr3[i15];
                                    char c11 = 7;
                                    long j12 = -9187201950435737472L;
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8;
                                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                                        int i18 = i12;
                                        while (i18 < i17) {
                                            if ((j11 & 255) < 128) {
                                                c10 = c11;
                                                int i19 = (i15 << 3) + i18;
                                                j10 = j12;
                                                Object obj = e10.f22670b[i19];
                                                Object obj2 = e10.f22671c[i19];
                                                if (obj2 instanceof u.F) {
                                                    u.F f3 = (u.F) obj2;
                                                    Object[] objArr2 = f3.f22676b;
                                                    long[] jArr4 = f3.f22675a;
                                                    int i20 = i16;
                                                    int length2 = jArr4.length - 2;
                                                    i10 = i18;
                                                    jArr2 = jArr3;
                                                    if (length2 >= 0) {
                                                        int i21 = 0;
                                                        while (true) {
                                                            long j13 = jArr4[i21];
                                                            j = j11;
                                                            if ((((~j13) << c10) & j13 & j10) != j10) {
                                                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                for (int i23 = 0; i23 < i22; i23++) {
                                                                    if ((j13 & 255) < 128) {
                                                                        int i24 = (i21 << 3) + i23;
                                                                        if (!((C0699o0) objArr2[i24]).b()) {
                                                                            f3.m(i24);
                                                                        }
                                                                    }
                                                                    j13 >>= i20;
                                                                }
                                                                if (i22 != i20) {
                                                                    break;
                                                                }
                                                                if (i21 != length2) {
                                                                    break;
                                                                }
                                                                i21++;
                                                                i20 = 8;
                                                                j11 = j;
                                                            } else if (i21 != length2) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i21++;
                                                                i20 = 8;
                                                                j11 = j;
                                                            }
                                                        }
                                                    } else {
                                                        j = j11;
                                                    }
                                                    zG = f3.g();
                                                } else {
                                                    i10 = i18;
                                                    jArr2 = jArr3;
                                                    j = j11;
                                                    p251z9.j.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                    zG = !((C0699o0) obj2).b();
                                                }
                                                if (zG) {
                                                    e10.k(i19);
                                                }
                                                i11 = 8;
                                            } else {
                                                i10 = i18;
                                                jArr2 = jArr3;
                                                j = j11;
                                                c10 = c11;
                                                j10 = j12;
                                                i11 = i16;
                                            }
                                            j11 = j >> i11;
                                            i18 = i10 + 1;
                                            i16 = i11;
                                            c11 = c10;
                                            j12 = j10;
                                            jArr3 = jArr2;
                                        }
                                        jArr = jArr3;
                                        if (i17 != i16) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                    }
                                    if (i15 == length) {
                                        break;
                                    }
                                    i15++;
                                    jArr3 = jArr;
                                    i12 = 0;
                                }
                            }
                            h();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    if (c0717a2.f11086i.U()) {
                        hVar.c();
                    }
                } catch (Throwable th3) {
                    a0E.e(false);
                    throw th3;
                }
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        } catch (Throwable th5) {
            if (c0717a2.f11086i.U()) {
                hVar.c();
            }
            throw th5;
        }
    }

    public final void f() {
        synchronized (this.f10824u) {
            try {
                if (this.f10812C.f11086i.V()) {
                    e(this.f10812C);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f10825v.f22692r.g()) {
                            u.H h7 = this.f10825v;
                            new ArrayList();
                            if (!h7.f22692r.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    G9.h hVar = new G9.h(h7);
                                    while (((G9.j) hVar.f2934s).hasNext()) {
                                        t0 t0Var = (t0) ((G9.j) hVar.f2934s).next();
                                        hVar.remove();
                                        t0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        a();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f10824u) {
            try {
                this.f10819J.f10740u = null;
                if (!this.f10825v.f22692r.g()) {
                    u.H h7 = this.f10825v;
                    new ArrayList();
                    if (!h7.f22692r.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            G9.h hVar = new G9.h(h7);
                            while (((G9.j) hVar.f2934s).hasNext()) {
                                t0 t0Var = (t0) ((G9.j) hVar.f2934s).next();
                                hVar.remove();
                                t0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f10825v.f22692r.g()) {
                            u.H h10 = this.f10825v;
                            new ArrayList();
                            if (!h10.f22692r.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    G9.h hVar2 = new G9.h(h10);
                                    while (((G9.j) hVar2.f2934s).hasNext()) {
                                        t0 t0Var2 = (t0) ((G9.j) hVar2.f2934s).next();
                                        hVar2.remove();
                                        t0Var2.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        a();
                        throw e10;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x005a->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b0 A[EDGE_INSN: B:83:0x00b0->B:32:0x00b0 BREAK  A[LOOP:2: B:16:0x005a->B:30:0x00a1], SYNTHETIC] */
    public final void h() {
        char c10;
        long j;
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        int i10;
        long j12;
        char c11;
        long j13;
        long j14;
        int i11;
        boolean zG;
        int i12;
        long j15;
        u.E e10 = this.f10810A;
        long[] jArr3 = e10.f22669a;
        int length = jArr3.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr3[i14];
                j10 = 255;
                if ((((~j18) << c12) & j18 & j16) != j16) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j18 & 255) < j17) {
                            c11 = c12;
                            int i17 = (i14 << 3) + i16;
                            j13 = j16;
                            Object obj = e10.f22670b[i17];
                            Object obj2 = e10.f22671c[i17];
                            boolean z10 = obj2 instanceof u.F;
                            u.E e11 = this.f10827x;
                            if (z10) {
                                u.F f3 = (u.F) obj2;
                                Object[] objArr = f3.f22676b;
                                long[] jArr4 = f3.f22675a;
                                j14 = j17;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j12 = j18;
                                    int i18 = i13;
                                    int i19 = 0;
                                    while (true) {
                                        long j19 = jArr4[i19];
                                        jArr2 = jArr3;
                                        i10 = length;
                                        if ((((~j19) << c11) & j19 & j13) == j13) {
                                            if (i19 != length2) {
                                                break;
                                                break;
                                            }
                                            i19++;
                                            jArr3 = jArr2;
                                            length = i10;
                                            i18 = 8;
                                        } else {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j19 & 255) < j14) {
                                                    i12 = i21;
                                                    int i22 = (i19 << 3) + i12;
                                                    j15 = j19;
                                                    if (!e11.c((C) objArr[i22])) {
                                                        f3.m(i22);
                                                    }
                                                } else {
                                                    i12 = i21;
                                                    j15 = j19;
                                                }
                                                j19 = j15 >> i18;
                                                i21 = i12 + 1;
                                            }
                                            if (i20 != i18) {
                                                break;
                                            }
                                            if (i19 != length2) {
                                                break;
                                            }
                                            i19++;
                                            jArr3 = jArr2;
                                            length = i10;
                                            i18 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i10 = length;
                                    j12 = j18;
                                }
                                zG = f3.g();
                            } else {
                                jArr2 = jArr3;
                                i10 = length;
                                j12 = j18;
                                j14 = j17;
                                p251z9.j.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zG = !e11.c((C) obj2);
                            }
                            if (zG) {
                                e10.k(i17);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = length;
                            j12 = j18;
                            c11 = c12;
                            j13 = j16;
                            j14 = j17;
                            i11 = i13;
                        }
                        j18 = j12 >> i11;
                        i16++;
                        i13 = i11;
                        c12 = c11;
                        j16 = j13;
                        j17 = j14;
                        jArr3 = jArr2;
                        length = i10;
                    }
                    jArr = jArr3;
                    int i23 = length;
                    c10 = c12;
                    j = j16;
                    j11 = j17;
                    if (i15 != i13) {
                        break;
                    } else {
                        length = i23;
                    }
                } else {
                    jArr = jArr3;
                    c10 = c12;
                    j = j16;
                    j11 = j17;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                c12 = c10;
                j16 = j;
                j17 = j11;
                jArr3 = jArr;
                i13 = 8;
            }
        } else {
            c10 = 7;
            j = -9187201950435737472L;
            j10 = 255;
            j11 = 128;
        }
        u.F f7 = this.f10829z;
        if (!f7.h()) {
            return;
        }
        Object[] objArr2 = f7.f22676b;
        long[] jArr5 = f7.f22675a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j20 = jArr5[i24];
            if ((((~j20) << c10) & j20 & j) != j) {
                int i25 = 8 - ((~(i24 - length3)) >>> 31);
                for (int i26 = 0; i26 < i25; i26++) {
                    if ((j20 & j10) < j11) {
                        int i27 = (i24 << 3) + i26;
                        if (!(((C0699o0) objArr2[i27]).g != null)) {
                            f7.m(i27);
                        }
                    }
                    j20 >>= 8;
                }
                if (i25 != 8) {
                    return;
                }
            }
            if (i24 == length3) {
                return;
            } else {
                i24++;
            }
        }
    }

    public final void i(p074h0.d dVar) throws Exception {
        try {
            synchronized (this.f10824u) {
                m();
                u.E e10 = this.f10814E;
                this.f10814E = va.g.k();
                try {
                    this.f10818I.getClass();
                    this.f10821r.getClass();
                    C0698o c0698o = this.f10819J;
                    if (!c0698o.f10726e.f11086i.U()) {
                        AbstractC0700p.c("Expected applyChanges() to have been called");
                    }
                    c0698o.n(e10, dVar);
                } catch (Exception e11) {
                    this.f10814E = e10;
                    throw e11;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f10825v.f22692r.g()) {
                    u.H h7 = this.f10825v;
                    new ArrayList();
                    if (!h7.f22692r.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            G9.h hVar = new G9.h(h7);
                            while (((G9.j) hVar.f2934s).hasNext()) {
                                t0 t0Var = (t0) ((G9.j) hVar.f2934s).next();
                                hVar.remove();
                                t0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e12) {
                a();
                throw e12;
            }
        }
    }

    public final void j(p074h0.d dVar) {
        if (this.f10820K) {
            AbstractC0689j0.b("The composition is disposed");
        }
        this.f10821r.a(this, dVar);
    }

    public final void k() {
        synchronized (this.f10824u) {
            try {
                boolean z10 = this.f10826w.f10855s > 0;
                if (z10 || !this.f10825v.f22692r.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        E6.h hVar = new E6.h(this.f10825v);
                        if (z10) {
                            A0 a0E = this.f10826w.e();
                            try {
                                AbstractC0700p.e(a0E, hVar);
                                a0E.e(true);
                                this.f10822s.J();
                                hVar.d();
                            } catch (Throwable th) {
                                a0E.e(false);
                                throw th;
                            }
                        }
                        hVar.c();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                this.f10827x.a();
                this.f10810A.a();
                this.f10814E.a();
                this.f10811B.f11086i.S();
                this.f10812C.f11086i.S();
                C0698o c0698o = this.f10819J;
                c0698o.f10709D.clear();
                c0698o.f10737r.clear();
                c0698o.f10726e.f11086i.S();
                c0698o.f10740u = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f10824u) {
            try {
                if (this.f10819J.f10710E) {
                    AbstractC0689j0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f10820K) {
                    this.f10820K = true;
                    p074h0.d dVar = AbstractC0684h.f10675b;
                    C0717a c0717a = this.f10819J.f10716K;
                    if (c0717a != null) {
                        e(c0717a);
                    }
                    boolean z10 = this.f10826w.f10855s > 0;
                    if (z10 || !this.f10825v.f22692r.g()) {
                        E6.h hVar = new E6.h(this.f10825v);
                        if (z10) {
                            A0 a0E = this.f10826w.e();
                            try {
                                AbstractC0700p.g(a0E, hVar);
                                a0E.e(true);
                                this.f10822s.y();
                                this.f10822s.J();
                                hVar.d();
                            } catch (Throwable th) {
                                a0E.e(false);
                                throw th;
                            }
                        }
                        hVar.c();
                    }
                    C0698o c0698o = this.f10819J;
                    c0698o.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0698o.f10723b.o(c0698o);
                        c0698o.f10709D.clear();
                        c0698o.f10737r.clear();
                        c0698o.f10726e.f11086i.S();
                        c0698o.f10740u = null;
                        c0698o.f10722a.y();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f10821r.p(this);
    }

    public final void m() {
        Object obj = C0672b.f10650a;
        AtomicReference atomicReference = this.f10823t;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC0700p.d("pending composition has not been applied");
                throw new A6.a();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0700p.d("corrupt pendingModifications drain: " + atomicReference);
                throw new A6.a();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f10823t;
        Object andSet = atomicReference.getAndSet(null);
        if (p251z9.j.a(andSet, C0672b.f10650a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC0700p.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new A6.a();
        }
        AbstractC0700p.d("corrupt pendingModifications drain: " + atomicReference);
        throw new A6.a();
    }

    public final void o() {
        p120l9.t tVar = p120l9.t.f19442r;
        AtomicReference atomicReference = this.f10823t;
        Object andSet = atomicReference.getAndSet(tVar);
        if (p251z9.j.a(andSet, C0672b.f10650a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0700p.d("corrupt pendingModifications drain: " + atomicReference);
            throw new A6.a();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p(ArrayList arrayList) throws Exception {
        u.H h7 = this.f10825v;
        if (arrayList.size() > 0) {
            ((W) ((p110k9.j) arrayList.get(0)).f19077r).getClass();
            throw null;
        }
        try {
            C0698o c0698o = this.f10819J;
            c0698o.getClass();
            try {
                c0698o.y(arrayList);
                c0698o.j();
            } catch (Throwable th) {
                c0698o.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!h7.f22692r.g()) {
                    new ArrayList();
                    if (!h7.f22692r.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            G9.h hVar = new G9.h(h7);
                            G9.j jVar = (G9.j) hVar.f2934s;
                            while (jVar.hasNext()) {
                                t0 t0Var = (t0) jVar.next();
                                hVar.remove();
                                t0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e10) {
                a();
                throw e10;
            }
        }
    }

    public final M q(C0699o0 c0699o0, Object obj) {
        C0704u c0704u;
        int i10 = c0699o0.f10746a;
        if ((i10 & 2) != 0) {
            c0699o0.f10746a = i10 | 4;
        }
        C0670a c0670a = c0699o0.f10748c;
        if (c0670a == null || !c0670a.a()) {
            return M.f10623r;
        }
        if (this.f10826w.f(c0670a)) {
            return c0699o0.f10749d != null ? s(c0699o0, c0670a, obj) : M.f10623r;
        }
        synchronized (this.f10824u) {
            c0704u = this.f10816G;
        }
        if (c0704u != null) {
            C0698o c0698o = c0704u.f10819J;
            if (c0698o.f10710E && c0698o.Z(c0699o0, obj)) {
                return M.f10626u;
            }
        }
        return M.f10623r;
    }

    public final void r() {
        C0704u c0704u;
        synchronized (this.f10824u) {
            try {
                for (Object obj : this.f10826w.f10856t) {
                    C0699o0 c0699o0 = obj instanceof C0699o0 ? (C0699o0) obj : null;
                    if (c0699o0 != null && (c0704u = c0699o0.f10747b) != null) {
                        c0704u.q(c0699o0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7 A[Catch: all -> 0x0042, LOOP:0: B:48:0x0096->B:62:0x00d7, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0068, B:38:0x0071, B:40:0x0075, B:41:0x007e, B:43:0x0086, B:45:0x008a, B:48:0x0096, B:50:0x00a6, B:52:0x00b2, B:54:0x00bc, B:58:0x00cb, B:62:0x00d7, B:63:0x00da, B:66:0x00df), top: B:79:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00df A[Catch: all -> 0x0042, EDGE_INSN: B:66:0x00df->B:67:0x00e4 BREAK  A[LOOP:0: B:48:0x0096->B:62:0x00d7], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0068, B:38:0x0071, B:40:0x0075, B:41:0x007e, B:43:0x0086, B:45:0x008a, B:48:0x0096, B:50:0x00a6, B:52:0x00b2, B:54:0x00bc, B:58:0x00cb, B:62:0x00d7, B:63:0x00da, B:66:0x00df), top: B:79:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00df A[SYNTHETIC] */
    public final M s(C0699o0 c0699o0, C0670a c0670a, Object obj) {
        synchronized (this.f10824u) {
            try {
                C0704u c0704u = this.f10816G;
                C0704u c0704u2 = null;
                if (c0704u != null) {
                    x0 x0Var = this.f10826w;
                    int i10 = this.f10817H;
                    if (x0Var.f10860x) {
                        AbstractC0700p.c("Writer is active");
                    }
                    if (i10 < 0 || i10 >= x0Var.f10855s) {
                        AbstractC0700p.c("Invalid group index");
                    }
                    if (x0Var.f(c0670a)) {
                        int i11 = x0Var.f10854r[(i10 * 5) + 3] + i10;
                        int i12 = c0670a.f10648a;
                        if (i10 > i12 || i12 >= i11) {
                            c0704u = null;
                        }
                    } else {
                        c0704u = null;
                    }
                    c0704u2 = c0704u;
                }
                if (c0704u2 == null) {
                    C0698o c0698o = this.f10819J;
                    if (c0698o.f10710E && c0698o.Z(c0699o0, obj)) {
                        return M.f10626u;
                    }
                    this.f10818I.getClass();
                    this.f10821r.getClass();
                    if (obj != null && (obj instanceof C)) {
                        Object objG = this.f10814E.g(c0699o0);
                        if (objG != null) {
                            if (!(objG instanceof u.F)) {
                                if (objG != S.f10642v) {
                                    va.g.h(this.f10814E, c0699o0, obj);
                                    break;
                                }
                            } else {
                                u.F f3 = (u.F) objG;
                                Object[] objArr = f3.f22676b;
                                long[] jArr = f3.f22675a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    va.g.h(this.f10814E, c0699o0, obj);
                                    break;
                                }
                                int i13 = 0;
                                loop0: while (true) {
                                    long j = jArr[i13];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i13 == length) {
                                            va.g.h(this.f10814E, c0699o0, obj);
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        int i14 = 8;
                                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j & 255) < 128 && objArr[(i13 << 3) + i16] == S.f10642v) {
                                                break loop0;
                                            }
                                            j >>= i14;
                                            i16++;
                                            i14 = i14;
                                        }
                                        if (i15 == i14) {
                                            if (i13 == length) {
                                                i13++;
                                            }
                                        }
                                        va.g.h(this.f10814E, c0699o0, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            va.g.h(this.f10814E, c0699o0, obj);
                            break;
                        }
                    } else {
                        this.f10814E.l(c0699o0, S.f10642v);
                    }
                }
                if (c0704u2 != null) {
                    return c0704u2.s(c0699o0, c0670a, obj);
                }
                this.f10821r.i(this);
                return this.f10819J.f10710E ? M.f10625t : M.f10624s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(Object obj) {
        Object objG = this.f10827x.g(obj);
        if (objG == null) {
            return;
        }
        boolean z10 = objG instanceof u.F;
        u.E e10 = this.f10813D;
        if (!z10) {
            C0699o0 c0699o0 = (C0699o0) objG;
            if (c0699o0.c(obj) == M.f10626u) {
                va.g.h(e10, obj, c0699o0);
                return;
            }
            return;
        }
        u.F f3 = (u.F) objG;
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
                        C0699o0 c0699o1 = (C0699o0) objArr[(i10 << 3) + i12];
                        if (c0699o1.c(obj) == M.f10626u) {
                            va.g.h(e10, obj, c0699o1);
                        }
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

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean u(Set set) {
        boolean z10 = set instanceof p011b0.h;
        u.E e10 = this.f10810A;
        u.E e11 = this.f10827x;
        if (z10) {
            u.F f3 = ((p011b0.h) set).f13139r;
            Object[] objArr = f3.f22676b;
            long[] jArr = f3.f22675a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (e11.c(obj) || e10.c(obj)) {
                                    break loop0;
                                }
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
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (e11.c(obj2) || e10.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        boolean zB;
        synchronized (this.f10824u) {
            try {
                m();
                try {
                    u.E e10 = this.f10814E;
                    this.f10814E = va.g.k();
                    try {
                        this.f10818I.getClass();
                        this.f10821r.getClass();
                        zB = this.f10819J.B(e10);
                        if (!zB) {
                            n();
                        }
                    } catch (Exception e11) {
                        this.f10814E = e10;
                        throw e11;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f10825v.f22692r.g()) {
                            u.H h7 = this.f10825v;
                            new ArrayList();
                            if (!h7.f22692r.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    G9.h hVar = new G9.h(h7);
                                    while (((G9.j) hVar.f2934s).hasNext()) {
                                        t0 t0Var = (t0) ((G9.j) hVar.f2934s).next();
                                        hVar.remove();
                                        t0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e12) {
                        a();
                        throw e12;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(p011b0.h hVar) {
        Object obj;
        boolean z10;
        Object obj2;
        do {
            obj = this.f10823t.get();
            z10 = true;
            if (obj == null ? true : obj.equals(C0672b.f10650a)) {
                obj2 = hVar;
            } else if (obj instanceof Set) {
                obj2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f10823t).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = hVar;
                obj2 = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f10823t;
            while (!atomicReference.compareAndSet(obj, obj2)) {
                if (atomicReference.get() != obj) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (obj == null) {
            synchronized (this.f10824u) {
                n();
            }
        }
    }

    public final void x(Object obj) {
        C0699o0 c0699o0V;
        boolean z10;
        boolean z11;
        int i10;
        C0698o c0698o = this.f10819J;
        if (c0698o.f10745z <= 0 && (c0699o0V = c0698o.v()) != null) {
            boolean z12 = true;
            int i11 = c0699o0V.f10746a | 1;
            c0699o0V.f10746a = i11;
            if ((i11 & 32) == 0) {
                u.z zVar = c0699o0V.f10751f;
                if (zVar == null) {
                    zVar = new u.z();
                    c0699o0V.f10751f = zVar;
                }
                int i12 = c0699o0V.f10750e;
                int iC = zVar.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i10 = -1;
                } else {
                    i10 = zVar.f22786c[iC];
                }
                zVar.f22785b[iC] = obj;
                zVar.f22786c[iC] = i12;
                if (i10 == c0699o0V.f10750e) {
                    return;
                }
            }
            if (obj instanceof p093j0.w) {
                ((p093j0.w) obj).f(1);
            }
            va.g.h(this.f10827x, obj, c0699o0V);
            if (obj instanceof C) {
                C c10 = (C) obj;
                B bH = c10.h();
                u.E e10 = this.f10810A;
                va.g.J(e10, obj);
                u.z zVar2 = bH.f10585e;
                Object[] objArr = zVar2.f22785b;
                long[] jArr = zVar2.f22784a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j = jArr[i13];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j & 255) < 128) {
                                    p093j0.v vVar = (p093j0.v) objArr[(i13 << 3) + i16];
                                    if (vVar instanceof p093j0.w) {
                                        z11 = true;
                                        ((p093j0.w) vVar).f(1);
                                    } else {
                                        z11 = true;
                                    }
                                    va.g.h(e10, vVar, obj);
                                } else {
                                    z11 = z12;
                                }
                                j >>= i14;
                                i16++;
                                z12 = z11;
                                i14 = i14;
                            }
                            z10 = z12;
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            z10 = z12;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        z12 = z10;
                    }
                }
                Object obj2 = bH.f10586f;
                u.E e11 = c0699o0V.g;
                if (e11 == null) {
                    e11 = new u.E();
                    c0699o0V.g = e11;
                }
                e11.l(c10, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void y(Object obj) {
        synchronized (this.f10824u) {
            try {
                t(obj);
                Object objG = this.f10810A.g(obj);
                if (objG != null) {
                    if (objG instanceof u.F) {
                        u.F f3 = (u.F) objG;
                        Object[] objArr = f3.f22676b;
                        long[] jArr = f3.f22675a;
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
                                            t((C) objArr[(i10 << 3) + i12]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    } else if (i10 != length) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    } else {
                        t((C) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
