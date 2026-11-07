package Z;

import A.R0;
import J0.C0299w;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p001a0.C0717a;
import p001a0.C0718b;
import p001a0.C0719c;
import p001a0.C0721e;

/* JADX INFO: renamed from: Z.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0698o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10706A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10707B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0696n f10708C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f10709D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f10710E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public w0 f10711F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public x0 f10712G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public A0 f10713H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10714I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public InterfaceC0687i0 f10715J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0717a f10716K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0718b f10717L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0670a f10718M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0719c f10719N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f10720O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f10721P;
    public C0703t Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.r f10722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f10723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f10724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u.H f10725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0717a f10726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0717a f10727f;
    public final C0704u g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0685h0 f10729i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10731l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f10733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u.r f10734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10736q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public u.t f10740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10741v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10743x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10745z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f10728h = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0299w f10732m = new C0299w();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f10737r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0299w f10738s = new C0299w();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0687i0 f10739t = p074h0.h.f16418u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0299w f10742w = new C0299w();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10744y = -1;

    public C0698o(android.support.v4.media.session.r rVar, r rVar2, x0 x0Var, u.H h7, C0717a c0717a, C0717a c0717a2, C0704u c0704u) {
        this.f10722a = rVar;
        this.f10723b = rVar2;
        this.f10724c = x0Var;
        this.f10725d = h7;
        this.f10726e = c0717a;
        this.f10727f = c0717a2;
        this.g = c0704u;
        this.f10707B = rVar2.e() || rVar2.c();
        this.f10708C = new C0696n(0, this);
        this.f10709D = new ArrayList();
        w0 w0VarD = x0Var.d();
        w0VarD.c();
        this.f10711F = w0VarD;
        x0 x0Var2 = new x0();
        if (rVar2.e()) {
            x0Var2.c();
        }
        if (rVar2.c()) {
            x0Var2.f10853B = new u.t();
        }
        this.f10712G = x0Var2;
        A0 a0E = x0Var2.e();
        a0E.e(true);
        this.f10713H = a0E;
        this.f10717L = new C0718b(this, c0717a);
        w0 w0VarD2 = this.f10712G.d();
        try {
            C0670a c0670aA = w0VarD2.a(0);
            w0VarD2.c();
            this.f10718M = c0670aA;
            this.f10719N = new C0719c();
        } catch (Throwable th) {
            w0VarD2.c();
            throw th;
        }
    }

    public static final int J(int i10, int i11, C0698o c0698o, boolean z10) {
        w0 w0Var = c0698o.f10711F;
        int[] iArr = w0Var.f10840b;
        int i12 = i10 * 5;
        int i13 = iArr[i12 + 1];
        if ((134217728 & i13) != 0) {
            int i14 = iArr[i12];
            Object objM = w0Var.m(iArr, i10);
            if (i14 == 206 && p251z9.j.a(objM, AbstractC0700p.f10756e)) {
                Object objG = w0Var.g(i10, 0);
                C0692l c0692l = objG instanceof C0692l ? (C0692l) objG : null;
                if (c0692l != null) {
                    for (C0698o c0698o2 : c0692l.f10686r.f10692e) {
                        x0 x0Var = c0698o2.f10724c;
                        if (x0Var.f10855s > 0 && (x0Var.f10854r[1] & 67108864) != 0) {
                            C0704u c0704u = c0698o2.g;
                            synchronized (c0704u.f10824u) {
                                c0704u.o();
                                u.E e10 = c0704u.f10814E;
                                c0704u.f10814E = va.g.k();
                                try {
                                    c0704u.f10819J.a0(e10);
                                } catch (Exception e11) {
                                    c0704u.f10814E = e10;
                                    throw e11;
                                }
                            }
                            C0717a c0717a = new C0717a();
                            c0698o2.f10716K = c0717a;
                            w0 w0VarD = c0698o2.f10724c.d();
                            try {
                                c0698o2.f10711F = w0VarD;
                                C0718b c0718b = c0698o2.f10717L;
                                C0717a c0717a2 = c0718b.f11088b;
                                try {
                                    c0718b.f11088b = c0717a;
                                    c0698o2.I(0);
                                    C0718b c0718b2 = c0698o2.f10717L;
                                    c0718b2.b();
                                    if (c0718b2.f11089c) {
                                        c0718b2.f11088b.f11086i.W(p001a0.B.f11072c);
                                        if (c0718b2.f11089c) {
                                            c0718b2.d(false);
                                            c0718b2.d(false);
                                            c0718b2.f11088b.f11086i.W(p001a0.m.f11107c);
                                            c0718b2.f11089c = false;
                                        }
                                    }
                                    c0718b.f11088b = c0717a2;
                                    w0VarD.c();
                                } catch (Throwable th) {
                                    c0718b.f11088b = c0717a2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                w0VarD.c();
                                throw th2;
                            }
                        }
                        c0698o.f10723b.m(c0698o2.g);
                    }
                }
                return w0Var.l(i10);
            }
            if (!w0Var.i(i10)) {
                return w0Var.l(i10);
            }
        } else if ((i13 & 67108864) != 0) {
            int i15 = iArr[i12 + 3] + i10;
            int iJ = 0;
            for (int i16 = i10 + 1; i16 < i15; i16 += w0Var.f10840b[(i16 * 5) + 3]) {
                boolean zI = w0Var.i(i16);
                if (zI) {
                    c0698o.f10717L.c();
                    C0718b c0718b3 = c0698o.f10717L;
                    Object objK = w0Var.k(i16);
                    c0718b3.c();
                    c0718b3.f11093h.add(objK);
                }
                iJ += J(i16, zI ? 0 : i11 + iJ, c0698o, zI || z10);
                if (zI) {
                    c0698o.f10717L.c();
                    c0698o.f10717L.a();
                }
            }
            if (!w0Var.i(i10)) {
                return iJ;
            }
        } else if (!w0Var.i(i10)) {
            return w0Var.l(i10);
        }
        return 1;
    }

    public static final void b(C0698o c0698o, InterfaceC0687i0 interfaceC0687i0, Object obj) {
        c0698o.R(126665345, null);
        c0698o.z();
        c0698o.f0(obj);
        int i10 = c0698o.f10721P;
        try {
            c0698o.f10721P = 126665345;
            if (c0698o.f10720O) {
                A0.x(c0698o.f10713H);
            }
            boolean z10 = (c0698o.f10720O || p251z9.j.a(c0698o.f10711F.e(), interfaceC0687i0)) ? false : true;
            if (z10) {
                c0698o.F(interfaceC0687i0);
            }
            c0698o.O(202, 0, AbstractC0700p.f10754c, interfaceC0687i0);
            c0698o.f10715J = null;
            boolean z11 = c0698o.f10741v;
            c0698o.f10741v = z10;
            p074h0.j.c(c0698o, new p074h0.d(316014703, new R0(14, obj), true));
            c0698o.f10741v = z11;
        } finally {
            c0698o.p(false);
            c0698o.f10715J = null;
            c0698o.f10721P = i10;
            c0698o.p(false);
        }
    }

    public final int A(int i10) {
        int iN = this.f10711F.n(i10) + 1;
        int i11 = 0;
        while (iN < i10) {
            if (!this.f10711F.h(iN)) {
                i11++;
            }
            iN += z0.a(this.f10711F.f10840b, iN);
        }
        return i11;
    }

    public final boolean B(u.E e10) {
        p001a0.J j = this.f10726e.f11086i;
        if (!j.U()) {
            AbstractC0700p.c("Expected applyChanges() to have been called");
        }
        if (e10.f22673e <= 0 && this.f10737r.isEmpty()) {
            return false;
        }
        n(e10, null);
        return j.V();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    public final Object C(C0704u c0704u, C0704u c0704u2, Integer num, List list, p241y9.a aVar) {
        Object objInvoke;
        boolean z10 = this.f10710E;
        int i10 = this.j;
        try {
            this.f10710E = true;
            this.j = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                p110k9.j jVar = (p110k9.j) list.get(i11);
                C0699o0 c0699o0 = (C0699o0) jVar.f19077r;
                Object obj = jVar.f19078s;
                if (obj != null) {
                    Z(c0699o0, obj);
                } else {
                    Z(c0699o0, null);
                }
            }
            if (c0704u == null) {
                objInvoke = aVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (c0704u2 == null || c0704u2.equals(c0704u) || iIntValue < 0) {
                    objInvoke = aVar.invoke();
                } else {
                    c0704u.f10816G = c0704u2;
                    c0704u.f10817H = iIntValue;
                    try {
                        objInvoke = aVar.invoke();
                        c0704u.f10816G = null;
                        c0704u.f10817H = 0;
                    } catch (Throwable th) {
                        c0704u.f10816G = null;
                        c0704u.f10817H = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = aVar.invoke();
                }
            }
            this.f10710E = z10;
            this.j = i10;
            return objInvoke;
        } catch (Throwable th2) {
            this.f10710E = z10;
            this.j = i10;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0223  */
    /* JADX WARN: Code duplicated, block: B:125:0x0229  */
    /* JADX WARN: Code duplicated, block: B:126:0x0233  */
    /* JADX WARN: Code duplicated, block: B:128:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0238  */
    /* JADX WARN: Code duplicated, block: B:134:0x024d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0250  */
    /* JADX WARN: Code duplicated, block: B:179:0x0324  */
    /* JADX WARN: Code duplicated, block: B:190:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:68:0x0154
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void D() {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.C0698o.D():void");
    }

    public final void E() {
        int i10;
        I(this.f10711F.g);
        C0718b c0718b = this.f10717L;
        c0718b.d(false);
        C0299w c0299w = c0718b.f11090d;
        C0698o c0698o = c0718b.f11087a;
        w0 w0Var = c0698o.f10711F;
        if (w0Var.f10841c > 0 && c0299w.a(-2) != (i10 = w0Var.f10846i)) {
            if (!c0718b.f11089c && c0718b.f11091e) {
                c0718b.d(false);
                c0718b.f11088b.f11086i.W(p001a0.q.f11111c);
                c0718b.f11089c = true;
            }
            if (i10 > 0) {
                C0670a c0670aA = w0Var.a(i10);
                c0299w.c(i10);
                c0718b.d(false);
                p001a0.J j = c0718b.f11088b.f11086i;
                j.W(p001a0.p.f11110c);
                p050e8.b.Y(j, 0, c0670aA);
                c0718b.f11089c = true;
            }
        }
        c0718b.f11088b.f11086i.W(p001a0.x.f11121c);
        int i11 = c0718b.f11092f;
        w0 w0Var2 = c0698o.f10711F;
        c0718b.f11092f = w0Var2.f10840b[(w0Var2.g * 5) + 3] + i11;
    }

    public final void F(InterfaceC0687i0 interfaceC0687i0) {
        u.t tVar = this.f10740u;
        if (tVar == null) {
            tVar = new u.t();
            this.f10740u = tVar;
        }
        tVar.h(this.f10711F.g, interfaceC0687i0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void G(int i10, int i11, int i12) {
        w0 w0Var = this.f10711F;
        if (i10 == i11) {
            i12 = i10;
        } else if (i10 != i12 && i11 != i12) {
            if (w0Var.n(i10) == i11) {
                i12 = i11;
            } else if (w0Var.n(i11) == i10) {
                i12 = i10;
            } else if (w0Var.n(i10) == w0Var.n(i11)) {
                i12 = w0Var.n(i10);
            } else {
                int iN = i10;
                int i13 = 0;
                while (iN > 0 && iN != i12) {
                    iN = w0Var.n(iN);
                    i13++;
                }
                int iN2 = i11;
                int i14 = 0;
                while (iN2 > 0 && iN2 != i12) {
                    iN2 = w0Var.n(iN2);
                    i14++;
                }
                int i15 = i13 - i14;
                int iN3 = i10;
                for (int i16 = 0; i16 < i15; i16++) {
                    iN3 = w0Var.n(iN3);
                }
                int i17 = i14 - i13;
                int iN4 = i11;
                for (int i18 = 0; i18 < i17; i18++) {
                    iN4 = w0Var.n(iN4);
                }
                i12 = iN3;
                for (int iN5 = iN4; i12 != iN5; iN5 = w0Var.n(iN5)) {
                    i12 = w0Var.n(i12);
                }
            }
        }
        while (i10 > 0 && i10 != i12) {
            if (w0Var.i(i10)) {
                this.f10717L.a();
            }
            i10 = w0Var.n(i10);
        }
        o(i11, i12);
    }

    public final Object H() {
        boolean z10 = this.f10720O;
        S s10 = C0690k.f10683a;
        if (!z10) {
            Object objJ = this.f10711F.j();
            if (!this.f10743x || (objJ instanceof C0692l)) {
                return objJ instanceof u0 ? ((u0) objJ).f10830a : objJ;
            }
        } else if (this.f10736q) {
            AbstractC0700p.c("A call to createNode(), emitNode() or useNode() expected");
            return s10;
        }
        return s10;
    }

    public final void I(int i10) {
        boolean zI = this.f10711F.i(i10);
        C0718b c0718b = this.f10717L;
        if (zI) {
            c0718b.c();
            Object objK = this.f10711F.k(i10);
            c0718b.c();
            c0718b.f11093h.add(objK);
        }
        J(i10, 0, this, zI);
        c0718b.c();
        if (zI) {
            c0718b.a();
        }
    }

    public final boolean K(int i10, boolean z10) {
        return ((i10 & 1) == 0 && (this.f10720O || this.f10743x)) || z10 || !x();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    public final void L() {
        int iRotateLeft;
        if (this.f10737r.isEmpty()) {
            this.f10730k = this.f10711F.p() + this.f10730k;
            return;
        }
        w0 w0Var = this.f10711F;
        int iF = w0Var.f();
        int[] iArr = w0Var.f10840b;
        int i10 = w0Var.g;
        Object objM = i10 < w0Var.f10845h ? w0Var.m(iArr, i10) : null;
        Object objE = w0Var.e();
        int i11 = this.f10731l;
        S s10 = C0690k.f10683a;
        if (objM == null) {
            if (objE == null || iF != 207 || objE.equals(s10)) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f10721P, 3) ^ iF, 3) ^ i11;
            } else {
                this.f10721P = Integer.rotateLeft(objE.hashCode() ^ Integer.rotateLeft(this.f10721P, 3), 3) ^ i11;
            }
            S(null, (iArr[(w0Var.g * 5) + 1] & 1073741824) != 0);
            D();
            w0Var.d();
            if (objM != null) {
                if (objM instanceof Enum) {
                    this.f10721P = Integer.rotateRight(((Enum) objM).ordinal() ^ Integer.rotateRight(this.f10721P, 3), 3);
                } else {
                    this.f10721P = Integer.rotateRight(objM.hashCode() ^ Integer.rotateRight(this.f10721P, 3), 3);
                }
            }
            if (objE == null && iF == 207 && !objE.equals(s10)) {
                this.f10721P = Integer.rotateRight(objE.hashCode() ^ Integer.rotateRight(this.f10721P ^ i11, 3), 3);
                return;
            } else {
                this.f10721P = Integer.rotateRight(Integer.rotateRight(this.f10721P ^ i11, 3) ^ iF, 3);
            }
        }
        iRotateLeft = Integer.rotateLeft((objM instanceof Enum ? ((Enum) objM).ordinal() : objM.hashCode()) ^ Integer.rotateLeft(this.f10721P, 3), 3);
        this.f10721P = iRotateLeft;
        S(null, (iArr[(w0Var.g * 5) + 1] & 1073741824) != 0);
        D();
        w0Var.d();
        if (objM != null) {
            if (objE == null) {
            }
            this.f10721P = Integer.rotateRight(Integer.rotateRight(this.f10721P ^ i11, 3) ^ iF, 3);
        } else if (objM instanceof Enum) {
            this.f10721P = Integer.rotateRight(((Enum) objM).ordinal() ^ Integer.rotateRight(this.f10721P, 3), 3);
        } else {
            this.f10721P = Integer.rotateRight(objM.hashCode() ^ Integer.rotateRight(this.f10721P, 3), 3);
        }
    }

    public final void M() {
        w0 w0Var = this.f10711F;
        int i10 = w0Var.f10846i;
        this.f10730k = i10 >= 0 ? w0Var.f10840b[(i10 * 5) + 1] & 67108863 : 0;
        w0Var.q();
    }

    public final void N() {
        if (this.f10730k != 0) {
            AbstractC0700p.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f10720O) {
            return;
        }
        C0699o0 c0699o0V = v();
        if (c0699o0V != null) {
            int i10 = c0699o0V.f10746a;
            if ((i10 & 128) == 0) {
                c0699o0V.f10746a = i10 | 16;
            }
        }
        if (this.f10737r.isEmpty()) {
            M();
        } else {
            D();
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0320  */
    /* JADX WARN: Code duplicated, block: B:176:0x0336  */
    /* JADX WARN: Code duplicated, block: B:179:0x0351  */
    /* JADX WARN: Code duplicated, block: B:180:0x0357 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x0359 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x035d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0364  */
    /* JADX WARN: Code duplicated, block: B:187:0x0367  */
    /* JADX WARN: Code duplicated, block: B:188:0x0369  */
    /* JADX WARN: Code duplicated, block: B:192:0x0397  */
    /* JADX WARN: Code duplicated, block: B:193:0x0399  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x014f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0159  */
    /* JADX WARN: Code duplicated, block: B:83:0x016d  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x0188  */
    /* JADX WARN: Code duplicated, block: B:93:0x0191  */
    public final void O(int i10, int i11, Object obj, Object obj2) {
        int iRotateLeft;
        boolean z10;
        boolean z11;
        boolean z12;
        C0685h0 c0685h0;
        C0685h0 c0685h1;
        ArrayList arrayList;
        u.t tVar;
        int i12;
        Object objValueOf;
        u.E e10;
        Object objG;
        u.A a9;
        A0 a10;
        int i13;
        Object obj3;
        int i14;
        int i15;
        Object[] objArr;
        Object[] objArr2;
        int i16;
        int i17;
        int i18;
        w0 w0Var;
        int[] iArr;
        ArrayList arrayList2;
        int i19;
        int i20;
        int i21;
        w0 w0Var2;
        int i22;
        Object objM;
        A0 a11;
        int i23;
        C0685h0 c0685h2;
        Object obj4 = obj;
        if (this.f10736q) {
            AbstractC0700p.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i24 = this.f10731l;
        Object obj5 = C0690k.f10683a;
        if (obj4 == null) {
            if (obj2 == null || i10 != 207 || obj2.equals(obj5)) {
                iRotateLeft = i24 ^ Integer.rotateLeft(Integer.rotateLeft(this.f10721P, 3) ^ i10, 3);
            } else {
                this.f10721P = i24 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(this.f10721P, 3), 3);
            }
            if (obj4 == null) {
                this.f10731l++;
            }
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f10720O) {
                this.f10711F.f10847k++;
                a11 = this.f10713H;
                i23 = a11.f10577t;
                if (z10) {
                    a11.O(i10, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    a11.O(i10, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    a11.O(i10, obj4, obj5, false);
                }
                c0685h2 = this.f10729i;
                if (c0685h2 != null) {
                    int i25 = (-2) - i23;
                    O o10 = new O(-1, i10, i25, -1);
                    c0685h2.f10680e.h(i25, new I(-1, this.j - c0685h2.f10677b, 0));
                    c0685h2.f10679d.add(o10);
                }
                t(z10, null);
                return;
            }
            if (i11 != 1 && this.f10743x) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f10729i == null) {
                int iF = this.f10711F.f();
                if (!z11 && iF == i10) {
                    w0Var2 = this.f10711F;
                    i22 = w0Var2.g;
                    if (i22 < w0Var2.f10845h) {
                        objM = w0Var2.m(w0Var2.f10840b, i22);
                    } else {
                        objM = null;
                    }
                    if (p251z9.j.a(obj4, objM)) {
                        S(obj2, z10);
                        z12 = z11;
                    }
                }
                w0Var = this.f10711F;
                iArr = w0Var.f10840b;
                arrayList2 = new ArrayList();
                if (w0Var.f10847k <= 0) {
                    i19 = w0Var.g;
                    while (i19 < w0Var.f10845h) {
                        int i26 = i19 * 5;
                        int i27 = iArr[i26];
                        Object objM2 = w0Var.m(iArr, i19);
                        i20 = iArr[i26 + 1];
                        if ((i20 & 1073741824) != 0) {
                            i21 = 1;
                        } else {
                            i21 = i20 & 67108863;
                        }
                        arrayList2.add(new O(objM2, i27, i19, i21));
                        i19 += iArr[i26 + 3];
                        z11 = z11;
                    }
                }
                z12 = z11;
                this.f10729i = new C0685h0(this.j, arrayList2);
            } else {
                z12 = z11;
            }
            c0685h0 = this.f10729i;
            if (c0685h0 != null) {
                arrayList = c0685h0.f10679d;
                tVar = c0685h0.f10680e;
                i12 = c0685h0.f10677b;
                if (obj4 != null) {
                    objValueOf = new N(Integer.valueOf(i10), obj4);
                } else {
                    objValueOf = Integer.valueOf(i10);
                }
                e10 = ((p011b0.a) c0685h0.f10681f.getValue()).f13118a;
                objG = e10.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof u.A) {
                    a9 = (u.A) objG;
                    Object objJ = a9.j(0);
                    if (a9.g()) {
                        e10.j(objValueOf);
                    }
                    if (a9.f22651b == 1) {
                        e10.l(objValueOf, a9.d());
                    }
                    objG = objJ;
                } else {
                    e10.j(objValueOf);
                }
                O o11 = (O) objG;
                if (!z12 || o11 == null) {
                    this.f10711F.f10847k++;
                    this.f10720O = true;
                    this.f10715J = null;
                    if (this.f10713H.f10580w) {
                        A0 a0E = this.f10712G.e();
                        this.f10713H = a0E;
                        a0E.J();
                        this.f10714I = false;
                        this.f10715J = null;
                    }
                    this.f10713H.d();
                    a10 = this.f10713H;
                    int i28 = a10.f10577t;
                    if (z10) {
                        a10.O(i10, obj5, obj5, true);
                        i13 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i13 = 0;
                        a10.O(i10, obj5, obj2, false);
                    } else {
                        i13 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        a10.O(i10, obj3, obj5, false);
                    }
                    this.f10718M = this.f10713H.b(i28);
                    int i29 = (-2) - i28;
                    O o12 = new O(-1, i10, i29, -1);
                    tVar.h(i29, new I(-1, this.j - i12, i13));
                    arrayList.add(o12);
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i14 = i13;
                    } else {
                        i14 = this.j;
                    }
                    c0685h1 = new C0685h0(i14, arrayList3);
                } else {
                    int i30 = o11.f10633c;
                    arrayList.add(o11);
                    I i31 = (I) tVar.b(i30);
                    this.j = (i31 != null ? i31.f10605b : -1) + i12;
                    I i32 = (I) tVar.b(i30);
                    int i33 = i32 != null ? i32.f10604a : -1;
                    int i34 = c0685h0.f10678c;
                    int i35 = i33 - i34;
                    int i36 = 8;
                    if (i33 <= i34) {
                        i15 = i35;
                        if (i34 > i33) {
                            Object[] objArr3 = tVar.f22733c;
                            long[] jArr = tVar.f22731a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i37 = 0;
                                while (true) {
                                    long j = jArr[i37];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                I i40 = (I) objArr3[(i37 << 3) + i39];
                                                int i41 = i40.f10604a;
                                                if (i41 == i33) {
                                                    i40.f10604a = i34;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i33 + 1 <= i41 && i41 < i34) {
                                                        i40.f10604a = i41 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i39++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i38 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i37 == length) {
                                        break;
                                    }
                                    i37++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = tVar.f22733c;
                        long[] jArr2 = tVar.f22731a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i42 = 0;
                            while (true) {
                                long j10 = jArr2[i42];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i43 = 8 - ((~(i42 - length2)) >>> 31);
                                    int i44 = 0;
                                    while (i44 < i43) {
                                        if ((j10 & 255) < 128) {
                                            i18 = i36;
                                            I i45 = (I) objArr4[(i42 << 3) + i44];
                                            i17 = i35;
                                            int i46 = i45.f10604a;
                                            if (i46 == i33) {
                                                i45.f10604a = i34;
                                            } else if (i34 <= i46 && i46 < i33) {
                                                i45.f10604a = i46 + 1;
                                            }
                                        } else {
                                            i17 = i35;
                                            i18 = i36;
                                        }
                                        j10 >>= i18;
                                        i44++;
                                        i35 = i17;
                                        i36 = i18;
                                    }
                                    i15 = i35;
                                    if (i43 != i36) {
                                        break;
                                    }
                                } else {
                                    i15 = i35;
                                }
                                if (i42 == length2) {
                                    break;
                                }
                                i42++;
                                i35 = i15;
                                i36 = 8;
                            }
                        } else {
                            i15 = i35;
                        }
                    }
                    C0718b c0718b = this.f10717L;
                    int i47 = c0718b.f11092f;
                    C0698o c0698o = c0718b.f11087a;
                    c0718b.f11092f = (i30 - c0698o.f10711F.g) + i47;
                    this.f10711F.o(i30);
                    if (i15 > 0) {
                        c0718b.d(false);
                        C0299w c0299w = c0718b.f11090d;
                        w0 w0Var3 = c0698o.f10711F;
                        if (w0Var3.f10841c > 0 && c0299w.a(-2) != (i16 = w0Var3.f10846i)) {
                            if (!c0718b.f11089c && c0718b.f11091e) {
                                c0718b.d(false);
                                c0718b.f11088b.f11086i.W(p001a0.q.f11111c);
                                c0718b.f11089c = true;
                            }
                            if (i16 > 0) {
                                C0670a c0670aA = w0Var3.a(i16);
                                c0299w.c(i16);
                                c0718b.d(false);
                                p001a0.J j11 = c0718b.f11088b.f11086i;
                                j11.W(p001a0.p.f11110c);
                                p050e8.b.Y(j11, 0, c0670aA);
                                c0718b.f11089c = true;
                            }
                        }
                        p001a0.J j12 = c0718b.f11088b.f11086i;
                        j12.W(p001a0.u.f11118c);
                        j12.f11082k[j12.f11083l - j12.f11081i[j12.j - 1].f11079a] = i15;
                    }
                    S(obj2, z10);
                    c0685h1 = null;
                }
            } else {
                c0685h1 = null;
            }
            t(z10, c0685h1);
        }
        iRotateLeft = Integer.rotateLeft((obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode()) ^ Integer.rotateLeft(this.f10721P, 3), 3);
        this.f10721P = iRotateLeft;
        if (obj4 == null) {
            this.f10731l++;
        }
        if (i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f10720O) {
            this.f10711F.f10847k++;
            a11 = this.f10713H;
            i23 = a11.f10577t;
            if (z10) {
                a11.O(i10, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                a11.O(i10, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                a11.O(i10, obj4, obj5, false);
            }
            c0685h2 = this.f10729i;
            if (c0685h2 != null) {
                int i210 = (-2) - i23;
                O o13 = new O(-1, i10, i210, -1);
                c0685h2.f10680e.h(i210, new I(-1, this.j - c0685h2.f10677b, 0));
                c0685h2.f10679d.add(o13);
            }
            t(z10, null);
            return;
        }
        if (i11 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f10729i == null) {
            int iF2 = this.f10711F.f();
            if (!z11) {
                w0Var2 = this.f10711F;
                i22 = w0Var2.g;
                if (i22 < w0Var2.f10845h) {
                    objM = w0Var2.m(w0Var2.f10840b, i22);
                } else {
                    objM = null;
                }
                if (p251z9.j.a(obj4, objM)) {
                    S(obj2, z10);
                    z12 = z11;
                }
            }
            w0Var = this.f10711F;
            iArr = w0Var.f10840b;
            arrayList2 = new ArrayList();
            if (w0Var.f10847k <= 0) {
                i19 = w0Var.g;
                while (i19 < w0Var.f10845h) {
                    int i211 = i19 * 5;
                    int i212 = iArr[i211];
                    Object objM3 = w0Var.m(iArr, i19);
                    i20 = iArr[i211 + 1];
                    if ((i20 & 1073741824) != 0) {
                        i21 = 1;
                    } else {
                        i21 = i20 & 67108863;
                    }
                    arrayList2.add(new O(objM3, i212, i19, i21));
                    i19 += iArr[i211 + 3];
                    z11 = z11;
                }
            }
            z12 = z11;
            this.f10729i = new C0685h0(this.j, arrayList2);
        } else {
            z12 = z11;
        }
        c0685h0 = this.f10729i;
        if (c0685h0 != null) {
            arrayList = c0685h0.f10679d;
            tVar = c0685h0.f10680e;
            i12 = c0685h0.f10677b;
            if (obj4 != null) {
                objValueOf = new N(Integer.valueOf(i10), obj4);
            } else {
                objValueOf = Integer.valueOf(i10);
            }
            e10 = ((p011b0.a) c0685h0.f10681f.getValue()).f13118a;
            objG = e10.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof u.A) {
                a9 = (u.A) objG;
                Object objJ2 = a9.j(0);
                if (a9.g()) {
                    e10.j(objValueOf);
                }
                if (a9.f22651b == 1) {
                    e10.l(objValueOf, a9.d());
                }
                objG = objJ2;
            } else {
                e10.j(objValueOf);
            }
            O o14 = (O) objG;
            if (z12) {
            }
            this.f10711F.f10847k++;
            this.f10720O = true;
            this.f10715J = null;
            if (this.f10713H.f10580w) {
                A0 a0E2 = this.f10712G.e();
                this.f10713H = a0E2;
                a0E2.J();
                this.f10714I = false;
                this.f10715J = null;
            }
            this.f10713H.d();
            a10 = this.f10713H;
            int i213 = a10.f10577t;
            if (z10) {
                a10.O(i10, obj5, obj5, true);
                i13 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i13 = 0;
                a10.O(i10, obj5, obj2, false);
            } else {
                i13 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                a10.O(i10, obj3, obj5, false);
            }
            this.f10718M = this.f10713H.b(i213);
            int i214 = (-2) - i213;
            O o15 = new O(-1, i10, i214, -1);
            tVar.h(i214, new I(-1, this.j - i12, i13));
            arrayList.add(o15);
            ArrayList arrayList4 = new ArrayList();
            if (z10) {
                i14 = i13;
            } else {
                i14 = this.j;
            }
            c0685h1 = new C0685h0(i14, arrayList4);
        } else {
            c0685h1 = null;
        }
        t(z10, c0685h1);
    }

    public final void P() {
        O(-127, 0, null, null);
    }

    public final void Q(int i10, Z z10) {
        O(i10, 0, z10, null);
    }

    public final void R(int i10, Object obj) {
        O(i10, 0, obj, null);
    }

    public final void S(Object obj, boolean z10) {
        if (z10) {
            w0 w0Var = this.f10711F;
            if (w0Var.f10847k <= 0) {
                if ((w0Var.f10840b[(w0Var.g * 5) + 1] & 1073741824) == 0) {
                    AbstractC0689j0.a("Expected a node group");
                }
                w0Var.r();
                return;
            }
            return;
        }
        if (obj != null && this.f10711F.e() != obj) {
            C0718b c0718b = this.f10717L;
            c0718b.getClass();
            c0718b.d(false);
            p001a0.J j = c0718b.f11088b.f11086i;
            j.W(p001a0.E.f11075c);
            p050e8.b.Y(j, 0, obj);
        }
        this.f10711F.r();
    }

    public final void T(int i10) {
        int i11;
        int i12;
        if (this.f10729i != null) {
            O(i10, 0, null, null);
            return;
        }
        if (this.f10736q) {
            AbstractC0700p.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f10721P = this.f10731l ^ Integer.rotateLeft(Integer.rotateLeft(this.f10721P, 3) ^ i10, 3);
        this.f10731l++;
        w0 w0Var = this.f10711F;
        boolean z10 = this.f10720O;
        S s10 = C0690k.f10683a;
        if (z10) {
            w0Var.f10847k++;
            this.f10713H.O(i10, s10, s10, false);
            t(false, null);
            return;
        }
        if (w0Var.f() == i10 && ((i12 = w0Var.g) >= w0Var.f10845h || (w0Var.f10840b[(i12 * 5) + 1] & 536870912) == 0)) {
            w0Var.r();
            t(false, null);
            return;
        }
        if (w0Var.f10847k <= 0 && (i11 = w0Var.g) != w0Var.f10845h) {
            int i13 = this.j;
            E();
            this.f10717L.e(i13, w0Var.p());
            AbstractC0700p.a(i11, w0Var.g, this.f10737r);
        }
        w0Var.f10847k++;
        this.f10720O = true;
        this.f10715J = null;
        if (this.f10713H.f10580w) {
            A0 a0E = this.f10712G.e();
            this.f10713H = a0E;
            a0E.J();
            this.f10714I = false;
            this.f10715J = null;
        }
        A0 a9 = this.f10713H;
        a9.d();
        int i14 = a9.f10577t;
        a9.O(i10, s10, s10, false);
        this.f10718M = a9.b(i14);
        t(false, null);
    }

    public final void U(int i10) {
        O(i10, 0, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    public final C0698o V(int i10) {
        C0699o0 c0699o0;
        T(i10);
        boolean z10 = this.f10720O;
        ArrayList arrayList = this.f10709D;
        C0704u c0704u = this.g;
        if (z10) {
            C0699o0 c0699o1 = new C0699o0(c0704u);
            arrayList.add(c0699o1);
            f0(c0699o1);
            c0699o1.f10750e = this.f10706A;
            c0699o1.f10746a &= -17;
            return this;
        }
        int i11 = this.f10711F.f10846i;
        ArrayList arrayList2 = this.f10737r;
        int iF = AbstractC0700p.f(i11, arrayList2);
        L l10 = iF >= 0 ? (L) arrayList2.remove(iF) : null;
        Object objJ = this.f10711F.j();
        if (p251z9.j.a(objJ, C0690k.f10683a)) {
            c0699o0 = new C0699o0(c0704u);
            f0(c0699o0);
        } else {
            p251z9.j.c(objJ, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            c0699o0 = (C0699o0) objJ;
        }
        if (l10 == null) {
            int i12 = c0699o0.f10746a;
            boolean z11 = (i12 & 64) != 0;
            if (z11) {
                c0699o0.f10746a = i12 & (-65);
            }
            if (z11) {
                c0699o0.f10746a |= 8;
            } else {
                c0699o0.f10746a &= -9;
            }
        } else {
            c0699o0.f10746a |= 8;
        }
        arrayList.add(c0699o0);
        c0699o0.f10750e = this.f10706A;
        int i13 = c0699o0.f10746a;
        c0699o0.f10746a = i13 & (-17);
        if ((i13 & 256) != 0) {
            c0699o0.f10746a = (i13 & (-273)) | 512;
            p001a0.J j = this.f10717L.f11088b.f11086i;
            j.W(p001a0.C.f11073c);
            p050e8.b.Y(j, 0, c0699o0);
        }
        return this;
    }

    public final void W(Object obj) {
        if (!this.f10720O && this.f10711F.f() == 207 && !p251z9.j.a(this.f10711F.e(), obj) && this.f10744y < 0) {
            this.f10744y = this.f10711F.g;
            this.f10743x = true;
        }
        O(207, 0, null, obj);
    }

    public final void X() {
        O(125, 2, null, null);
        this.f10736q = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Y() {
        this.f10731l = 0;
        this.f10711F = this.f10724c.d();
        O(100, 0, null, null);
        r rVar = this.f10723b;
        rVar.n();
        this.f10739t = rVar.f();
        this.f10742w.c(this.f10741v ? 1 : 0);
        this.f10741v = g(this.f10739t);
        this.f10715J = null;
        if (!this.f10735p) {
            this.f10735p = rVar.d();
        }
        if (!this.f10707B) {
            this.f10707B = rVar.e();
        }
        Set set = (Set) C0672b.s(this.f10739t, p103k0.b.f18893a);
        if (set != null) {
            C0703t c0703t = this.Q;
            if (c0703t == null) {
                c0703t = new C0703t(this.g);
                this.Q = c0703t;
            }
            set.add(c0703t);
            rVar.k(set);
        }
        O(rVar.g(), 0, null, null);
    }

    public final boolean Z(C0699o0 c0699o0, Object obj) {
        C0670a c0670a = c0699o0.f10748c;
        if (c0670a == null) {
            return false;
        }
        int iB = this.f10711F.f10839a.b(c0670a);
        if (!this.f10710E || iB < this.f10711F.g) {
            return false;
        }
        ArrayList arrayList = this.f10737r;
        int iF = AbstractC0700p.f(iB, arrayList);
        if (iF < 0) {
            int i10 = -(iF + 1);
            if (!(obj instanceof C)) {
                obj = null;
            }
            arrayList.add(i10, new L(c0699o0, iB, obj));
            return true;
        }
        L l10 = (L) arrayList.get(iF);
        if (!(obj instanceof C)) {
            l10.f10622c = null;
            return true;
        }
        Object obj2 = l10.f10622c;
        if (obj2 == null) {
            l10.f10622c = obj;
            return true;
        }
        if (obj2 instanceof u.F) {
            ((u.F) obj2).a(obj);
            return true;
        }
        int i11 = u.N.f22700a;
        u.F f3 = new u.F(2);
        f3.j(obj2);
        f3.j(obj);
        l10.f10622c = f3;
        return true;
    }

    public final void a() {
        j();
        this.f10728h.clear();
        this.f10732m.f4183b = 0;
        this.f10738s.f4183b = 0;
        this.f10742w.f4183b = 0;
        this.f10740u = null;
        C0719c c0719c = this.f10719N;
        c0719c.j.S();
        c0719c.f11097i.S();
        this.f10721P = 0;
        this.f10745z = 0;
        this.f10736q = false;
        this.f10720O = false;
        this.f10743x = false;
        this.f10710E = false;
        this.f10744y = -1;
        w0 w0Var = this.f10711F;
        if (!w0Var.f10844f) {
            w0Var.c();
        }
        if (this.f10713H.f10580w) {
            return;
        }
        u();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060 A[LOOP:0: B:5:0x0012->B:20:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[EDGE_INSN: B:24:0x0063->B:21:0x0063 BREAK  A[LOOP:0: B:5:0x0012->B:20:0x0060], SYNTHETIC] */
    public final void a0(u.E e10) {
        Object[] objArr = e10.f22670b;
        Object[] objArr2 = e10.f22671c;
        long[] jArr = e10.f22669a;
        int length = jArr.length - 2;
        ArrayList arrayList = this.f10737r;
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
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            p251z9.j.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            C0699o0 c0699o0 = (C0699o0) obj;
                            C0670a c0670a = c0699o0.f10748c;
                            if (c0670a != null) {
                                int i14 = c0670a.f10648a;
                                if (obj2 == S.f10642v) {
                                    obj2 = null;
                                }
                                arrayList.add(new L(c0699o0, i14, obj2));
                            }
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
        p120l9.p.c0(arrayList, AbstractC0700p.f10757f);
    }

    public final void b0(int i10, int i11) {
        if (g0(i10) != i11) {
            if (i10 < 0) {
                u.r rVar = this.f10734o;
                if (rVar == null) {
                    rVar = new u.r();
                    this.f10734o = rVar;
                }
                rVar.f(i10, i11);
                return;
            }
            int[] iArr = this.f10733n;
            if (iArr == null) {
                iArr = new int[this.f10711F.f10841c];
                p120l9.l.f0(iArr, -1);
                this.f10733n = iArr;
            }
            iArr[i10] = i11;
        }
    }

    public final void c(Object obj, p241y9.e eVar) {
        if (this.f10720O) {
            p001a0.J j = this.f10719N.f11097i;
            j.W(p001a0.F.f11076c);
            p050e8.b.Y(j, 0, obj);
            p251z9.j.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            p251z9.y.b(2, eVar);
            p050e8.b.Y(j, 1, eVar);
            return;
        }
        C0718b c0718b = this.f10717L;
        c0718b.b();
        p001a0.J j10 = c0718b.f11088b.f11086i;
        j10.W(p001a0.F.f11076c);
        p251z9.j.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        p251z9.y.b(2, eVar);
        p050e8.b.Z(j10, 0, obj, 1, eVar);
    }

    public final void c0(int i10, int i11) {
        int iG0 = g0(i10);
        if (iG0 != i11) {
            int i12 = i11 - iG0;
            ArrayList arrayList = this.f10728h;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int iG1 = g0(i10) + i12;
                b0(i10, iG1);
                for (int i13 = size; -1 < i13; i13--) {
                    C0685h0 c0685h0 = (C0685h0) arrayList.get(i13);
                    if (c0685h0 != null && c0685h0.a(i10, iG1)) {
                        size = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f10711F.f10846i;
                } else if (this.f10711F.i(i10)) {
                    return;
                } else {
                    i10 = this.f10711F.n(i10);
                }
            }
        }
    }

    public final boolean d(float f3) {
        Object objZ = z();
        if ((objZ instanceof Float) && f3 == ((Number) objZ).floatValue()) {
            return false;
        }
        f0(Float.valueOf(f3));
        return true;
    }

    public final p074h0.h d0(InterfaceC0687i0 interfaceC0687i0, p074h0.h hVar) {
        p074h0.h hVar2 = (p074h0.h) interfaceC0687i0;
        hVar2.getClass();
        p074h0.g gVar = new p074h0.g(hVar2);
        gVar.putAll(hVar);
        p074h0.h hVarB = gVar.b();
        Q(204, AbstractC0700p.f10755d);
        z();
        f0(hVarB);
        z();
        f0(hVar);
        p(false);
        return hVarB;
    }

    public final boolean e(int i10) {
        Object objZ = z();
        if ((objZ instanceof Integer) && i10 == ((Number) objZ).intValue()) {
            return false;
        }
        f0(Integer.valueOf(i10));
        return true;
    }

    public final void e0(Object obj) {
        int i10;
        w0 w0Var;
        int i11;
        A0 a9;
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            C0670a c0670aA = null;
            if (this.f10720O) {
                A0 a10 = this.f10713H;
                int i12 = a10.f10577t;
                if (i12 > a10.f10579v + 1) {
                    int i13 = i12 - 1;
                    int iC = a10.C(a10.f10561b, i13);
                    while (true) {
                        i11 = i13;
                        i13 = iC;
                        a9 = this.f10713H;
                        if (i13 == a9.f10579v || i13 < 0) {
                            break;
                        } else {
                            iC = a9.C(a9.f10561b, i13);
                        }
                    }
                    c0670aA = a9.b(i11);
                }
            } else {
                w0 w0Var2 = this.f10711F;
                int i14 = w0Var2.g;
                if (i14 > w0Var2.f10846i + 1) {
                    int i15 = i14 - 1;
                    int iN = w0Var2.n(i15);
                    while (true) {
                        i10 = i15;
                        i15 = iN;
                        w0Var = this.f10711F;
                        if (i15 == w0Var.f10846i || i15 < 0) {
                            break;
                        } else {
                            iN = w0Var.n(i15);
                        }
                    }
                    c0670aA = w0Var.a(i10);
                }
            }
            u0 u0Var = new u0(t0Var, c0670aA);
            if (this.f10720O) {
                p001a0.J j = this.f10717L.f11088b.f11086i;
                j.W(p001a0.w.f11120c);
                p050e8.b.Y(j, 0, u0Var);
            }
            this.f10725d.add(obj);
            obj = u0Var;
        }
        f0(obj);
    }

    public final boolean f(long j) {
        Object objZ = z();
        if ((objZ instanceof Long) && j == ((Number) objZ).longValue()) {
            return false;
        }
        f0(Long.valueOf(j));
        return true;
    }

    public final void f0(Object obj) {
        if (this.f10720O) {
            A0 a9 = this.f10713H;
            if (a9.f10571n <= 0 || a9.f10567i == a9.f10568k) {
                a9.D(obj);
                return;
            }
            u.t tVar = a9.f10576s;
            if (tVar == null) {
                tVar = new u.t();
            }
            a9.f10576s = tVar;
            int i10 = a9.f10579v;
            Object objB = tVar.b(i10);
            if (objB == null) {
                objB = new u.A();
                tVar.h(i10, objB);
            }
            ((u.A) objB).a(obj);
            return;
        }
        w0 w0Var = this.f10711F;
        boolean z10 = w0Var.f10850n;
        C0718b c0718b = this.f10717L;
        if (!z10) {
            C0670a c0670aA = w0Var.a(w0Var.f10846i);
            p001a0.J j = c0718b.f11088b.f11086i;
            j.W(C0721e.f11099c);
            p050e8.b.Z(j, 0, c0670aA, 1, obj);
            return;
        }
        int iC = (w0Var.f10848l - z0.c(w0Var.f10840b, w0Var.f10846i)) - 1;
        if (c0718b.f11087a.f10711F.f10846i - c0718b.f11092f >= 0) {
            c0718b.d(true);
            p001a0.J j10 = c0718b.f11088b.f11086i;
            j10.W(p001a0.r.g);
            p050e8.b.Y(j10, 0, obj);
            j10.f11082k[j10.f11083l - j10.f11081i[j10.j - 1].f11079a] = iC;
            return;
        }
        w0 w0Var2 = this.f10711F;
        C0670a c0670aA2 = w0Var2.a(w0Var2.f10846i);
        p001a0.J j11 = c0718b.f11088b.f11086i;
        j11.W(p001a0.r.f11114f);
        p050e8.b.Z(j11, 0, obj, 1, c0670aA2);
        j11.f11082k[j11.f11083l - j11.f11081i[j11.j - 1].f11079a] = iC;
    }

    public final boolean g(Object obj) {
        if (p251z9.j.a(z(), obj)) {
            return false;
        }
        f0(obj);
        return true;
    }

    public final int g0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f10733n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.f10711F.l(i10) : i11;
        }
        u.r rVar = this.f10734o;
        if (rVar == null || rVar.c(i10) < 0) {
            return 0;
        }
        int iC = rVar.c(i10);
        if (iC >= 0) {
            return rVar.f22753c[iC];
        }
        p204v.a.e("Cannot find value for key " + i10);
        throw null;
    }

    public final boolean h(boolean z10) {
        Object objZ = z();
        if ((objZ instanceof Boolean) && z10 == ((Boolean) objZ).booleanValue()) {
            return false;
        }
        f0(Boolean.valueOf(z10));
        return true;
    }

    public final void h0() {
        if (!this.f10736q) {
            AbstractC0700p.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f10736q = false;
        if (this.f10720O) {
            AbstractC0700p.c("useNode() called while inserting");
        }
        w0 w0Var = this.f10711F;
        Object objK = w0Var.k(w0Var.f10846i);
        C0718b c0718b = this.f10717L;
        c0718b.c();
        c0718b.f11093h.add(objK);
        if (this.f10743x && (objK instanceof InterfaceC0686i)) {
            c0718b.b();
            c0718b.f11088b.f11086i.W(p001a0.H.f11078c);
        }
    }

    public final boolean i(Object obj) {
        if (z() == obj) {
            return false;
        }
        f0(obj);
        return true;
    }

    public final void j() {
        this.f10729i = null;
        this.j = 0;
        this.f10730k = 0;
        this.f10721P = 0;
        this.f10736q = false;
        C0718b c0718b = this.f10717L;
        c0718b.f11089c = false;
        c0718b.f11090d.f4183b = 0;
        c0718b.f11092f = 0;
        this.f10709D.clear();
        this.f10733n = null;
        this.f10734o = null;
    }

    public final Object k(AbstractC0693l0 abstractC0693l0) {
        return C0672b.s(m(), abstractC0693l0);
    }

    public final void l(p241y9.a aVar) {
        if (!this.f10736q) {
            AbstractC0700p.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f10736q = false;
        if (!this.f10720O) {
            AbstractC0700p.c("createNode() can only be called when inserting");
        }
        C0299w c0299w = this.f10732m;
        int i10 = c0299w.f4182a[c0299w.f4183b - 1];
        A0 a9 = this.f10713H;
        C0670a c0670aB = a9.b(a9.f10579v);
        this.f10730k++;
        C0719c c0719c = this.f10719N;
        p001a0.J j = c0719c.f11097i;
        j.W(p001a0.r.f11112d);
        p050e8.b.Y(j, 0, aVar);
        j.f11082k[j.f11083l - j.f11081i[j.j - 1].f11079a] = i10;
        p050e8.b.Y(j, 1, c0670aB);
        p001a0.J j10 = c0719c.j;
        j10.W(p001a0.r.f11113e);
        j10.f11082k[j10.f11083l - j10.f11081i[j10.j - 1].f11079a] = i10;
        p050e8.b.Y(j10, 0, c0670aB);
    }

    public final InterfaceC0687i0 m() {
        InterfaceC0687i0 interfaceC0687i0;
        InterfaceC0687i0 interfaceC0687i1 = this.f10715J;
        if (interfaceC0687i1 != null) {
            return interfaceC0687i1;
        }
        int iN = this.f10711F.f10846i;
        boolean z10 = this.f10720O;
        Z z11 = AbstractC0700p.f10754c;
        if (z10 && this.f10714I) {
            int iC = this.f10713H.f10579v;
            while (iC > 0) {
                A0 a9 = this.f10713H;
                if (a9.f10561b[a9.q(iC) * 5] == 202 && p251z9.j.a(this.f10713H.r(iC), z11)) {
                    Object objP = this.f10713H.p(iC);
                    p251z9.j.c(objP, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC0687i0 interfaceC0687i2 = (InterfaceC0687i0) objP;
                    this.f10715J = interfaceC0687i2;
                    return interfaceC0687i2;
                }
                A0 a10 = this.f10713H;
                iC = a10.C(a10.f10561b, iC);
            }
        }
        if (this.f10711F.f10841c > 0) {
            while (iN > 0) {
                w0 w0Var = this.f10711F;
                int[] iArr = w0Var.f10840b;
                if (iArr[iN * 5] == 202 && p251z9.j.a(w0Var.m(iArr, iN), z11)) {
                    u.t tVar = this.f10740u;
                    if (tVar == null || (interfaceC0687i0 = (InterfaceC0687i0) tVar.b(iN)) == null) {
                        w0 w0Var2 = this.f10711F;
                        Object objB = w0Var2.b(w0Var2.f10840b, iN);
                        p251z9.j.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC0687i0 = (InterfaceC0687i0) objB;
                    }
                    this.f10715J = interfaceC0687i0;
                    return interfaceC0687i0;
                }
                iN = this.f10711F.n(iN);
            }
        }
        InterfaceC0687i0 interfaceC0687i3 = this.f10739t;
        this.f10715J = interfaceC0687i3;
        return interfaceC0687i3;
    }

    public final void n(u.E e10, p074h0.d dVar) {
        ArrayList arrayList = this.f10737r;
        if (this.f10710E) {
            AbstractC0700p.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            long jG = p093j0.n.k().g();
            this.f10706A = (int) (jG ^ (jG >>> 32));
            this.f10740u = null;
            a0(e10);
            this.j = 0;
            this.f10710E = true;
            try {
                Y();
                Object objZ = z();
                if (objZ != dVar && dVar != null) {
                    f0(dVar);
                }
                C0696n c0696n = this.f10708C;
                p011b0.e eVarN = C0672b.n();
                try {
                    eVarN.b(c0696n);
                    Z z10 = AbstractC0700p.f10752a;
                    if (dVar != null) {
                        Q(200, z10);
                        p074h0.j.c(this, dVar);
                        p(false);
                    } else if (!this.f10741v || objZ == null || objZ.equals(C0690k.f10683a)) {
                        L();
                    } else {
                        Q(200, z10);
                        p251z9.y.b(2, objZ);
                        p074h0.j.c(this, (p241y9.e) objZ);
                        p(false);
                    }
                    eVarN.l(eVarN.f13127t - 1);
                    s();
                    this.f10710E = false;
                    arrayList.clear();
                    if (!this.f10713H.f10580w) {
                        AbstractC0700p.c("Check failed");
                    }
                    u();
                    Trace.endSection();
                } catch (Throwable th) {
                    eVarN.l(eVarN.f13127t - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f10710E = false;
                arrayList.clear();
                a();
                if (!this.f10713H.f10580w) {
                    AbstractC0700p.c("Check failed");
                }
                u();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void o(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        o(this.f10711F.n(i10), i11);
        if (this.f10711F.i(i10)) {
            Object objK = this.f10711F.k(i10);
            C0718b c0718b = this.f10717L;
            c0718b.c();
            c0718b.f11093h.add(objK);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x038e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0501  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z10) {
        int iOrdinal;
        C0299w c0299w;
        ArrayList arrayList;
        int i10;
        ?? r10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0299w c0299w2;
        int i16;
        LinkedHashSet linkedHashSet;
        int i17;
        int i18;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i19;
        int i20;
        Object[] objArr;
        long[] jArr;
        int i21;
        Object[] objArr2;
        long[] jArr2;
        int i22;
        Object[] objArr3;
        long[] jArr3;
        int i23;
        Object[] objArr4;
        long[] jArr4;
        int iOrdinal2;
        C0299w c0299w3 = this.f10732m;
        int i24 = c0299w3.f4182a[c0299w3.f4183b - 2] - 1;
        boolean z11 = this.f10720O;
        S s10 = C0690k.f10683a;
        if (z11) {
            A0 a9 = this.f10713H;
            int i25 = a9.f10579v;
            int i26 = a9.f10561b[a9.q(i25) * 5];
            Object objR = this.f10713H.r(i25);
            Object objP = this.f10713H.p(i25);
            if (objR != null) {
                iOrdinal2 = (objR instanceof Enum ? ((Enum) objR).ordinal() : objR.hashCode()) ^ Integer.rotateRight(this.f10721P, 3);
            } else if (objP == null || i26 != 207 || objP.equals(s10)) {
                iOrdinal2 = Integer.rotateRight(i24 ^ this.f10721P, 3) ^ i26;
            } else {
                this.f10721P = Integer.rotateRight(Integer.rotateRight(i24 ^ this.f10721P, 3) ^ objP.hashCode(), 3);
            }
            this.f10721P = Integer.rotateRight(iOrdinal2, 3);
        } else {
            w0 w0Var = this.f10711F;
            int i27 = w0Var.f10846i;
            int[] iArr = w0Var.f10840b;
            int i28 = iArr[i27 * 5];
            Object objM = w0Var.m(iArr, i27);
            w0 w0Var2 = this.f10711F;
            Object objB = w0Var2.b(w0Var2.f10840b, i27);
            if (objM != null) {
                iOrdinal = (objM instanceof Enum ? ((Enum) objM).ordinal() : objM.hashCode()) ^ Integer.rotateRight(this.f10721P, 3);
            } else if (objB == null || i28 != 207 || objB.equals(s10)) {
                iOrdinal = Integer.rotateRight(i24 ^ this.f10721P, 3) ^ i28;
            } else {
                this.f10721P = Integer.rotateRight(Integer.rotateRight(i24 ^ this.f10721P, 3) ^ objB.hashCode(), 3);
            }
            this.f10721P = Integer.rotateRight(iOrdinal, 3);
        }
        int i29 = this.f10730k;
        C0685h0 c0685h0 = this.f10729i;
        ArrayList arrayList4 = this.f10737r;
        C0718b c0718b = this.f10717L;
        if (c0685h0 != null) {
            u.t tVar = c0685h0.f10680e;
            int i30 = c0685h0.f10677b;
            ArrayList arrayList5 = c0685h0.f10676a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = c0685h0.f10679d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i31 = 0; i31 < size; i31++) {
                    hashSet2.add(arrayList6.get(i31));
                }
                i10 = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                while (i32 < size3) {
                    O o10 = (O) arrayList5.get(i32);
                    if (hashSet2.contains(o10)) {
                        c0299w2 = c0299w3;
                        i16 = i32;
                        if (!linkedHashSet2.contains(o10)) {
                            int i35 = i33;
                            if (i35 < size2) {
                                O o11 = (O) arrayList6.get(i35);
                                if (o11 != o10) {
                                    I i36 = (I) tVar.b(o11.f10633c);
                                    int i37 = i36 != null ? i36.f10605b : -1;
                                    linkedHashSet2.add(o11);
                                    i19 = i34;
                                    if (i37 != i19) {
                                        I i38 = (I) tVar.b(o11.f10633c);
                                        int i39 = i38 != null ? i38.f10606c : o11.f10634d;
                                        linkedHashSet = linkedHashSet2;
                                        int i40 = i37 + i30;
                                        i17 = size2;
                                        int i41 = i19 + i30;
                                        if (i39 > 0) {
                                            i18 = i30;
                                            int i42 = c0718b.f11096l;
                                            if (i42 > 0) {
                                                arrayList2 = arrayList5;
                                                if (c0718b.j == i40 - i42 && c0718b.f11095k == i41 - i42) {
                                                    c0718b.f11096l = i42 + i39;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            c0718b.c();
                                            c0718b.j = i40;
                                            c0718b.f11095k = i41;
                                            c0718b.f11096l = i39;
                                        } else {
                                            i18 = i30;
                                            arrayList2 = arrayList5;
                                            c0718b.getClass();
                                        }
                                        if (i37 <= i19) {
                                            int i43 = i39;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i19 > i37) {
                                                Object[] objArr5 = tVar.f22733c;
                                                long[] jArr5 = tVar.f22731a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i44 = 0;
                                                    while (true) {
                                                        long j = jArr5[i44];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i45 = 8 - ((~(i44 - length)) >>> 31);
                                                            int i46 = 0;
                                                            while (i46 < i45) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    I i47 = (I) objArr5[(i44 << 3) + i46];
                                                                    jArr2 = jArr5;
                                                                    int i48 = i47.f10605b;
                                                                    i22 = i37;
                                                                    if (i37 <= i48 && i48 < i22 + i43) {
                                                                        i47.f10605b = (i48 - i22) + i19;
                                                                    } else if (i22 + 1 <= i48 && i48 < i19) {
                                                                        i47.f10605b = i48 - i43;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i22 = i37;
                                                                }
                                                                j >>= 8;
                                                                i46++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i37 = i22;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i21 = i37;
                                                            if (i45 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i21 = i37;
                                                        }
                                                        if (i44 == length) {
                                                            break;
                                                        }
                                                        i44++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i37 = i21;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = tVar.f22733c;
                                            long[] jArr6 = tVar.f22731a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i49 = 0;
                                                while (true) {
                                                    long j10 = jArr6[i49];
                                                    int i50 = i39;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i51 = 8 - ((~(i49 - length2)) >>> 31);
                                                        int i52 = 0;
                                                        while (i52 < i51) {
                                                            if ((j10 & 255) < 128) {
                                                                i23 = i52;
                                                                I i53 = (I) objArr6[(i49 << 3) + i52];
                                                                objArr4 = objArr6;
                                                                int i54 = i53.f10605b;
                                                                jArr4 = jArr6;
                                                                if (i37 <= i54 && i54 < i37 + i50) {
                                                                    i53.f10605b = (i54 - i37) + i19;
                                                                } else if (i19 <= i54 && i54 < i37) {
                                                                    i53.f10605b = i54 + i50;
                                                                }
                                                            } else {
                                                                i23 = i52;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j10 >>= 8;
                                                            i52 = i23 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i51 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i49 == length2) {
                                                        break;
                                                    }
                                                    i49++;
                                                    arrayList4 = arrayList4;
                                                    i39 = i50;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i20 = i16;
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        i17 = size2;
                                        i18 = i30;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i20 = i16;
                                } else {
                                    arrayList4 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i17 = size2;
                                    i18 = i30;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i19 = i34;
                                    i20 = i16 + 1;
                                }
                                i33 = i35 + 1;
                                I i55 = (I) tVar.b(o11.f10633c);
                                int i56 = i19 + (i55 != null ? i55.f10606c : o11.f10634d);
                                i32 = i20;
                                c0685h0 = c0685h0;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i17;
                                i30 = i18;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i34 = i56;
                                c0299w3 = c0299w2;
                            } else {
                                i33 = i35;
                                c0299w3 = c0299w2;
                                i32 = i16;
                            }
                        }
                    } else {
                        c0299w2 = c0299w3;
                        I i57 = (I) tVar.b(o10.f10633c);
                        int i58 = i57 != null ? i57.f10605b : -1;
                        int i59 = o10.f10633c;
                        i16 = i32;
                        c0718b.e(i58 + i30, o10.f10634d);
                        c0685h0.a(i59, 0);
                        c0718b.f11092f = (i59 - c0718b.f11087a.f10711F.g) + c0718b.f11092f;
                        this.f10711F.o(i59);
                        E();
                        this.f10711F.p();
                        AbstractC0700p.a(i59, this.f10711F.f10840b[(i59 * 5) + 3] + i59, arrayList4);
                    }
                    i32 = i16 + 1;
                    c0299w3 = c0299w2;
                }
                c0299w = c0299w3;
                arrayList = arrayList4;
                c0718b.c();
                if (arrayList5.size() > 0) {
                    w0 w0Var3 = this.f10711F;
                    c0718b.f11092f = (w0Var3.f10845h - c0718b.f11087a.f10711F.g) + c0718b.f11092f;
                    w0Var3.q();
                }
            } else {
                c0299w = c0299w3;
                arrayList = arrayList4;
                i10 = -1;
            }
        } else {
            c0299w = c0299w3;
            arrayList = arrayList4;
            i10 = -1;
        }
        boolean z12 = this.f10720O;
        if (!z12) {
            w0 w0Var4 = this.f10711F;
            int i60 = w0Var4.f10849m - w0Var4.f10848l;
            if (i60 > 0) {
                if (i60 > 0) {
                    c0718b.d(false);
                    C0299w c0299w4 = c0718b.f11090d;
                    w0 w0Var5 = c0718b.f11087a.f10711F;
                    if (w0Var5.f10841c > 0 && c0299w4.a(-2) != (i15 = w0Var5.f10846i)) {
                        if (!c0718b.f11089c && c0718b.f11091e) {
                            c0718b.d(false);
                            c0718b.f11088b.f11086i.W(p001a0.q.f11111c);
                            c0718b.f11089c = true;
                        }
                        if (i15 > 0) {
                            C0670a c0670aA = w0Var5.a(i15);
                            c0299w4.c(i15);
                            c0718b.d(false);
                            p001a0.J j11 = c0718b.f11088b.f11086i;
                            j11.W(p001a0.p.f11110c);
                            p050e8.b.Y(j11, 0, c0670aA);
                            c0718b.f11089c = true;
                        }
                    }
                    p001a0.J j12 = c0718b.f11088b.f11086i;
                    j12.W(p001a0.D.f11074c);
                    j12.f11082k[j12.f11083l - j12.f11081i[j12.j - 1].f11079a] = i60;
                } else {
                    c0718b.getClass();
                }
            }
        }
        int i61 = this.j;
        while (true) {
            w0 w0Var6 = this.f10711F;
            if (w0Var6.f10847k > 0 || (i14 = w0Var6.g) == w0Var6.f10845h) {
                break;
            }
            E();
            c0718b.e(i61, this.f10711F.p());
            AbstractC0700p.a(i14, this.f10711F.g, arrayList);
        }
        if (z12) {
            if (z10) {
                C0719c c0719c = this.f10719N;
                p001a0.J j13 = c0719c.j;
                if (!j13.V()) {
                    AbstractC0700p.c("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                p001a0.J j14 = c0719c.f11097i;
                p001a0.I[] iArr2 = j13.f11081i;
                int i62 = j13.j - 1;
                j13.j = i62;
                p001a0.I i63 = iArr2[i62];
                iArr2[i62] = null;
                j14.W(i63);
                Object[] objArr7 = j13.f11084m;
                Object[] objArr8 = j14.f11084m;
                int i64 = j14.f11085n;
                int i65 = i63.f11080b;
                int i66 = j13.f11085n;
                int i67 = i66 - i65;
                System.arraycopy(objArr7, i67, objArr8, i64 - i65, i66 - i67);
                Object[] objArr9 = j13.f11084m;
                int i68 = j13.f11085n;
                Arrays.fill(objArr9, i68 - i65, i68, (Object) null);
                int[] iArr3 = j13.f11082k;
                int[] iArr4 = j14.f11082k;
                int i69 = j14.f11083l;
                int i70 = i63.f11079a;
                int i71 = j13.f11083l;
                p120l9.l.W(i69 - i70, i71 - i70, i71, iArr3, iArr4);
                j13.f11085n -= i65;
                j13.f11083l -= i70;
                i29 = 1;
            }
            w0 w0Var7 = this.f10711F;
            if (w0Var7.f10847k <= 0) {
                AbstractC0689j0.a("Unbalanced begin/end empty");
            }
            w0Var7.f10847k--;
            A0 a10 = this.f10713H;
            int i72 = a10.f10579v;
            a10.i();
            if (this.f10711F.f10847k <= 0) {
                int i73 = (-2) - i72;
                this.f10713H.j();
                this.f10713H.e(true);
                C0670a c0670a = this.f10718M;
                if (this.f10719N.f11097i.U()) {
                    x0 x0Var = this.f10712G;
                    c0718b.b();
                    c0718b.d(false);
                    C0299w c0299w5 = c0718b.f11090d;
                    w0 w0Var8 = c0718b.f11087a.f10711F;
                    if (w0Var8.f10841c <= 0 || c0299w5.a(-2) == (i13 = w0Var8.f10846i)) {
                        i12 = 1;
                    } else {
                        if (!c0718b.f11089c && c0718b.f11091e) {
                            c0718b.d(false);
                            c0718b.f11088b.f11086i.W(p001a0.q.f11111c);
                            c0718b.f11089c = true;
                        }
                        if (i13 > 0) {
                            C0670a c0670aA2 = w0Var8.a(i13);
                            c0299w5.c(i13);
                            c0718b.d(false);
                            p001a0.J j15 = c0718b.f11088b.f11086i;
                            j15.W(p001a0.p.f11110c);
                            p050e8.b.Y(j15, 0, c0670aA2);
                            i12 = 1;
                            c0718b.f11089c = true;
                        } else {
                            i12 = 1;
                        }
                    }
                    c0718b.c();
                    p001a0.J j16 = c0718b.f11088b.f11086i;
                    j16.W(p001a0.s.f11116c);
                    p050e8.b.Z(j16, 0, c0670a, i12, x0Var);
                    r10 = 0;
                } else {
                    x0 x0Var2 = this.f10712G;
                    C0719c c0719c2 = this.f10719N;
                    c0718b.b();
                    c0718b.d(false);
                    C0299w c0299w6 = c0718b.f11090d;
                    w0 w0Var9 = c0718b.f11087a.f10711F;
                    if (w0Var9.f10841c > 0 && c0299w6.a(-2) != (i11 = w0Var9.f10846i)) {
                        if (!c0718b.f11089c && c0718b.f11091e) {
                            c0718b.d(false);
                            c0718b.f11088b.f11086i.W(p001a0.q.f11111c);
                            c0718b.f11089c = true;
                        }
                        if (i11 > 0) {
                            C0670a c0670aA3 = w0Var9.a(i11);
                            c0299w6.c(i11);
                            c0718b.d(false);
                            p001a0.J j17 = c0718b.f11088b.f11086i;
                            j17.W(p001a0.p.f11110c);
                            p050e8.b.Y(j17, 0, c0670aA3);
                            c0718b.f11089c = true;
                        }
                    }
                    c0718b.c();
                    p001a0.J j18 = c0718b.f11088b.f11086i;
                    j18.W(p001a0.t.f11117c);
                    int i74 = j18.f11085n - j18.f11081i[j18.j - 1].f11080b;
                    Object[] objArr10 = j18.f11084m;
                    objArr10[i74] = c0670a;
                    objArr10[i74 + 1] = x0Var2;
                    objArr10[i74 + 2] = c0719c2;
                    this.f10719N = new C0719c();
                    r10 = 0;
                }
                this.f10720O = r10;
                if (this.f10724c.f10855s != 0) {
                    b0(i73, r10);
                    c0(i73, i29);
                }
            }
        } else {
            if (z10) {
                c0718b.a();
            }
            int i75 = c0718b.f11087a.f10711F.f10846i;
            C0299w c0299w7 = c0718b.f11090d;
            int i76 = i10;
            if (c0299w7.a(i76) > i75) {
                AbstractC0700p.c("Missed recording an endGroup");
            }
            if (c0299w7.a(i76) == i75) {
                c0718b.d(false);
                c0299w7.b();
                c0718b.f11088b.f11086i.W(p001a0.m.f11107c);
            }
            int i77 = this.f10711F.f10846i;
            if (i29 != g0(i77)) {
                c0(i77, i29);
            }
            if (z10) {
                i29 = 1;
            }
            this.f10711F.d();
            c0718b.c();
        }
        ArrayList arrayList7 = this.f10728h;
        C0685h0 c0685h1 = (C0685h0) arrayList7.remove(arrayList7.size() - 1);
        if (c0685h1 != null && !z12) {
            c0685h1.f10678c++;
        }
        this.f10729i = c0685h1;
        this.j = c0299w.b() + i29;
        this.f10731l = c0299w.b();
        this.f10730k = c0299w.b() + i29;
    }

    public final void q() {
        p(false);
        C0699o0 c0699o0V = v();
        if (c0699o0V != null) {
            int i10 = c0699o0V.f10746a;
            if ((i10 & 1) != 0) {
                c0699o0V.f10746a = i10 | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[LOOP:0: B:15:0x0037->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[EDGE_INSN: B:28:0x007c->B:29:0x007d BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0079]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x007c A[SYNTHETIC] */
    public final C0699o0 r() {
        C0699o0 c0699o0;
        C0670a c0670aA;
        C0697n0 c0697n0;
        ArrayList arrayList = this.f10709D;
        C0699o0 c0699o1 = !arrayList.isEmpty() ? (C0699o0) arrayList.remove(arrayList.size() - 1) : null;
        if (c0699o1 != null) {
            int i10 = c0699o1.f10746a;
            c0699o1.f10746a = i10 & (-9);
            int i11 = this.f10706A;
            u.z zVar = c0699o1.f10751f;
            if (zVar == null || (i10 & 16) != 0) {
                c0697n0 = null;
                break;
            }
            Object[] objArr = zVar.f22785b;
            int[] iArr = zVar.f22786c;
            long[] jArr = zVar.f22784a;
            int length = jArr.length - 2;
            if (length < 0) {
                c0697n0 = null;
                break;
            }
            int i12 = 0;
            loop0: while (true) {
                long j = jArr[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j & 255) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr[i15];
                            if (iArr[i15] != i11) {
                                c0697n0 = new C0697n0(i11, 0, c0699o1, zVar);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i13 == 8) {
                        if (i12 == length) {
                            i12++;
                        }
                    }
                    c0697n0 = null;
                    break;
                }
                if (i12 == length) {
                    c0697n0 = null;
                    break;
                }
                i12++;
            }
            C0718b c0718b = this.f10717L;
            if (c0697n0 != null) {
                p001a0.J j10 = c0718b.f11088b.f11086i;
                j10.W(p001a0.l.f11106c);
                p050e8.b.Z(j10, 0, c0697n0, 1, this.g);
            }
            int i16 = c0699o1.f10746a;
            if ((i16 & 512) != 0) {
                c0699o1.f10746a = i16 & (-513);
                p001a0.J j11 = c0718b.f11088b.f11086i;
                j11.W(p001a0.o.f11109c);
                p050e8.b.Y(j11, 0, c0699o1);
            }
        }
        if (c0699o1 != null) {
            int i17 = c0699o1.f10746a;
            if ((i17 & 16) == 0 && ((i17 & 1) != 0 || this.f10735p)) {
                if (c0699o1.f10748c == null) {
                    if (this.f10720O) {
                        A0 a9 = this.f10713H;
                        c0670aA = a9.b(a9.f10579v);
                    } else {
                        w0 w0Var = this.f10711F;
                        c0670aA = w0Var.a(w0Var.f10846i);
                    }
                    c0699o1.f10748c = c0670aA;
                }
                c0699o1.f10746a &= -5;
                c0699o0 = c0699o1;
            } else {
                c0699o0 = null;
            }
        } else {
            c0699o0 = null;
        }
        p(false);
        return c0699o0;
    }

    public final void s() {
        p(false);
        this.f10723b.b();
        p(false);
        C0718b c0718b = this.f10717L;
        if (c0718b.f11089c) {
            c0718b.d(false);
            c0718b.d(false);
            c0718b.f11088b.f11086i.W(p001a0.m.f11107c);
            c0718b.f11089c = false;
        }
        c0718b.b();
        if (c0718b.f11090d.f4183b != 0) {
            AbstractC0700p.c("Missed recording an endGroup()");
        }
        if (!this.f10728h.isEmpty()) {
            AbstractC0700p.c("Start/end imbalance");
        }
        j();
        this.f10711F.c();
        this.f10741v = this.f10742w.b() != 0;
    }

    public final void t(boolean z10, C0685h0 c0685h0) {
        this.f10728h.add(this.f10729i);
        this.f10729i = c0685h0;
        int i10 = this.f10730k;
        C0299w c0299w = this.f10732m;
        c0299w.c(i10);
        c0299w.c(this.f10731l);
        c0299w.c(this.j);
        if (z10) {
            this.j = 0;
        }
        this.f10730k = 0;
        this.f10731l = 0;
    }

    public final void u() {
        x0 x0Var = new x0();
        if (this.f10707B) {
            x0Var.c();
        }
        if (this.f10723b.c()) {
            x0Var.f10853B = new u.t();
        }
        this.f10712G = x0Var;
        A0 a0E = x0Var.e();
        a0E.e(true);
        this.f10713H = a0E;
    }

    public final C0699o0 v() {
        if (this.f10745z != 0) {
            return null;
        }
        ArrayList arrayList = this.f10709D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C0699o0) p123m2.c.q(1, arrayList);
    }

    public final boolean w() {
        if (!x() || this.f10741v) {
            return true;
        }
        C0699o0 c0699o0V = v();
        return (c0699o0V == null || (c0699o0V.f10746a & 4) == 0) ? false : true;
    }

    public final boolean x() {
        C0699o0 c0699o0V;
        return (this.f10720O || this.f10743x || this.f10741v || (c0699o0V = v()) == null || (c0699o0V.f10746a & 8) != 0) ? false : true;
    }

    public final void y(ArrayList arrayList) {
        C0717a c0717a = this.f10727f;
        C0718b c0718b = this.f10717L;
        C0717a c0717a2 = c0718b.f11088b;
        try {
            c0718b.f11088b = c0717a;
            c0717a.f11086i.W(p001a0.z.f11123c);
            if (arrayList.size() <= 0) {
                c0718b.f11088b.f11086i.W(p001a0.n.f11108c);
                c0718b.f11092f = 0;
                c0718b.f11088b = c0717a2;
            } else {
                p110k9.j jVar = (p110k9.j) arrayList.get(0);
                W w9 = (W) jVar.f19077r;
                w9.getClass();
                throw null;
            }
        } catch (Throwable th) {
            c0718b.f11088b = c0717a2;
            throw th;
        }
    }

    public final Object z() {
        boolean z10 = this.f10720O;
        S s10 = C0690k.f10683a;
        if (!z10) {
            Object objJ = this.f10711F.j();
            if (!this.f10743x || (objJ instanceof C0692l)) {
                return objJ;
            }
        } else if (this.f10736q) {
            AbstractC0700p.c("A call to createNode(), emitNode() or useNode() expected");
            return s10;
        }
        return s10;
    }
}
