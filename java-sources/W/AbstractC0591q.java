package W;

import K0.AbstractC0359n0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;

/* JADX INFO: renamed from: W.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0591q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p104k1.t f9327a = new p104k1.t(14);

    public static final void a(boolean z10, p241y9.a aVar, l0.r rVar, long j, p232y.j0 j0Var, p104k1.t tVar, p180s0.J j10, long j11, float f3, float f7, p074h0.d dVar, C0698o c0698o, int i10) {
        long jFloatToRawIntBits;
        p104k1.t tVar2;
        p232y.j0 j0Var2;
        p180s0.J j12;
        long j13;
        float f10;
        float f11;
        l0.r rVar2;
        long j14;
        p104k1.t tVar3;
        l0.r rVar3;
        p232y.j0 j0Var3;
        p180s0.J j15;
        long j16;
        float f12;
        float f13;
        c0698o.V(1431928300);
        if (((i10 | (c0698o.h(z10) ? 4 : 2) | 910896512) & 306783379) == 306783378 && c0698o.x()) {
            c0698o.N();
            rVar3 = rVar;
            j14 = j;
            j0Var3 = j0Var;
            tVar3 = tVar;
            j15 = j10;
            j16 = j11;
            f12 = f3;
            f13 = f7;
        } else {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                float f14 = 0;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
                p232y.j0 j0VarD = p181s2.r.d(c0698o);
                float f15 = G0.f8553a;
                p180s0.J jA = AbstractC0537a1.a(Y.i.f10176b, c0698o);
                long jD = AbstractC0568i0.d(37, c0698o);
                float f16 = G0.f8553a;
                float f17 = G0.f8554b;
                l0.o oVar = l0.o.f19333a;
                tVar2 = f9327a;
                j0Var2 = j0VarD;
                j12 = jA;
                j13 = jD;
                f10 = f16;
                f11 = f17;
                rVar2 = oVar;
            } else {
                c0698o.N();
                rVar2 = rVar;
                jFloatToRawIntBits = j;
                j0Var2 = j0Var;
                tVar2 = tVar;
                j12 = j10;
                j13 = j11;
                f10 = f3;
                f11 = f7;
            }
            c0698o.q();
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (objH == obj) {
                objH = new p223x.I(Boolean.FALSE);
                c0698o.e0(objH);
            }
            p223x.I i11 = (p223x.I) objH;
            i11.f23856t.setValue(Boolean.valueOf(z10));
            if (((Boolean) i11.f23855s.getValue()).booleanValue() || ((Boolean) i11.f23856t.getValue()).booleanValue()) {
                Object objH2 = c0698o.H();
                if (objH2 == obj) {
                    objH2 = C0672b.r(new p180s0.M(p180s0.M.f21814b));
                    c0698o.e0(objH2);
                }
                Z.X x9 = (Z.X) objH2;
                p063g1.c cVar = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
                boolean zG = c0698o.g(cVar);
                Object objH3 = c0698o.H();
                if (zG || objH3 == obj) {
                    objH3 = new X.w(jFloatToRawIntBits, cVar, new C0585o(x9, 0));
                    c0698o.e0(objH3);
                }
                p104k1.i.a((X.w) objH3, aVar, tVar2, p074h0.j.d(2126968933, new C0579m(rVar2, i11, x9, j0Var2, j12, j13, f10, f11, dVar), c0698o), c0698o, 3504, 0);
            }
            j14 = jFloatToRawIntBits;
            tVar3 = tVar2;
            rVar3 = rVar2;
            j0Var3 = j0Var2;
            j15 = j12;
            j16 = j13;
            f12 = f10;
            f13 = f11;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0582n(z10, aVar, rVar3, j14, j0Var3, tVar3, j15, j16, f12, f13, dVar, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void b(p074h0.d dVar, p241y9.a aVar, l0.r rVar, p241y9.e eVar, boolean z10, H0 h7, D.P p10, C0698o c0698o, int i10, int i11) {
        p241y9.e eVar2;
        int i12;
        C0560g0 c0560g0;
        H0 h10;
        H0 h11;
        boolean z11;
        D.P p11;
        p241y9.e eVar3;
        int i13;
        l0.r rVar2;
        H0 h12;
        D.P p12;
        H0 h13;
        boolean z12;
        p241y9.e eVar4;
        l0.r rVar3;
        C0699o0 c0699o0R;
        c0698o.V(1826340448);
        int i14 = (c0698o.i(aVar) ? 32 : 16) | i10;
        int i15 = i14 | 3456;
        int i16 = i11 & 16;
        if (i16 == 0) {
            if ((i10 & 24576) == 0) {
                eVar2 = eVar;
                i15 |= c0698o.i(eVar2) ? 16384 : 8192;
            }
            i12 = i15 | 113967104;
            if ((38347923 & i12) == 38347922 || !c0698o.x()) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i16 != 0) {
                        eVar2 = null;
                    }
                    float f3 = G0.f8553a;
                    c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                    h10 = c0560g0.Q;
                    if (h10 == null) {
                        h11 = new H0(AbstractC0568i0.c(c0560g0, Y.h.f10173h), AbstractC0568i0.c(c0560g0, Y.h.f10174i), AbstractC0568i0.c(c0560g0, Y.h.j), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10171e), Y.h.f10167a), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10172f), Y.h.f10168b), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.g), Y.h.f10169c));
                        c0560g0.Q = h11;
                    } else {
                        h11 = h10;
                    }
                    z11 = true;
                    p11 = G0.f8555c;
                    eVar3 = eVar2;
                    i13 = i12 & (-3670017);
                    rVar2 = l0.o.f19333a;
                    h12 = h11;
                } else {
                    c0698o.N();
                    z11 = z10;
                    h12 = h7;
                    p11 = p10;
                    eVar3 = eVar2;
                    i13 = i12 & (-3670017);
                    rVar2 = rVar;
                }
                c0698o.q();
                J0.b(dVar, aVar, rVar2, eVar3, z11, h12, p11, c0698o, 268435454 & i13);
                p12 = p11;
                h13 = h12;
                z12 = z11;
                eVar4 = eVar3;
                rVar3 = rVar2;
            } else {
                c0698o.N();
                rVar3 = rVar;
                z12 = z10;
                h13 = h7;
                p12 = p10;
                eVar4 = eVar2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0588p(dVar, aVar, rVar3, eVar4, z12, h13, p12, i10, i11);
            }
        }
        i15 = i14 | 28032;
        eVar2 = eVar;
        i12 = i15 | 113967104;
        if ((38347923 & i12) == 38347922) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    eVar2 = null;
                }
                float f7 = G0.f8553a;
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                h10 = c0560g0.Q;
                if (h10 == null) {
                    h11 = new H0(AbstractC0568i0.c(c0560g0, Y.h.f10173h), AbstractC0568i0.c(c0560g0, Y.h.f10174i), AbstractC0568i0.c(c0560g0, Y.h.j), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10171e), Y.h.f10167a), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10172f), Y.h.f10168b), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.g), Y.h.f10169c));
                    c0560g0.Q = h11;
                } else {
                    h11 = h10;
                }
                z11 = true;
                p11 = G0.f8555c;
                eVar3 = eVar2;
                i13 = i12 & (-3670017);
                rVar2 = l0.o.f19333a;
                h12 = h11;
            } else {
                if (i16 != 0) {
                    eVar2 = null;
                }
                float f10 = G0.f8553a;
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                h10 = c0560g0.Q;
                if (h10 == null) {
                    h11 = new H0(AbstractC0568i0.c(c0560g0, Y.h.f10173h), AbstractC0568i0.c(c0560g0, Y.h.f10174i), AbstractC0568i0.c(c0560g0, Y.h.j), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10171e), Y.h.f10167a), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10172f), Y.h.f10168b), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.g), Y.h.f10169c));
                    c0560g0.Q = h11;
                } else {
                    h11 = h10;
                }
                z11 = true;
                p11 = G0.f8555c;
                eVar3 = eVar2;
                i13 = i12 & (-3670017);
                rVar2 = l0.o.f19333a;
                h12 = h11;
            }
            c0698o.q();
            J0.b(dVar, aVar, rVar2, eVar3, z11, h12, p11, c0698o, 268435454 & i13);
            p12 = p11;
            h13 = h12;
            z12 = z11;
            eVar4 = eVar3;
            rVar3 = rVar2;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    eVar2 = null;
                }
                float f11 = G0.f8553a;
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                h10 = c0560g0.Q;
                if (h10 == null) {
                    h11 = new H0(AbstractC0568i0.c(c0560g0, Y.h.f10173h), AbstractC0568i0.c(c0560g0, Y.h.f10174i), AbstractC0568i0.c(c0560g0, Y.h.j), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10171e), Y.h.f10167a), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10172f), Y.h.f10168b), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.g), Y.h.f10169c));
                    c0560g0.Q = h11;
                } else {
                    h11 = h10;
                }
                z11 = true;
                p11 = G0.f8555c;
                eVar3 = eVar2;
                i13 = i12 & (-3670017);
                rVar2 = l0.o.f19333a;
                h12 = h11;
            } else {
                if (i16 != 0) {
                    eVar2 = null;
                }
                float f12 = G0.f8553a;
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                h10 = c0560g0.Q;
                if (h10 == null) {
                    h11 = new H0(AbstractC0568i0.c(c0560g0, Y.h.f10173h), AbstractC0568i0.c(c0560g0, Y.h.f10174i), AbstractC0568i0.c(c0560g0, Y.h.j), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10171e), Y.h.f10167a), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.f10172f), Y.h.f10168b), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.h.g), Y.h.f10169c));
                    c0560g0.Q = h11;
                } else {
                    h11 = h10;
                }
                z11 = true;
                p11 = G0.f8555c;
                eVar3 = eVar2;
                i13 = i12 & (-3670017);
                rVar2 = l0.o.f19333a;
                h12 = h11;
            }
            c0698o.q();
            J0.b(dVar, aVar, rVar2, eVar3, z11, h12, p11, c0698o, 268435454 & i13);
            p12 = p11;
            h13 = h12;
            z12 = z11;
            eVar4 = eVar3;
            rVar3 = rVar2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0588p(dVar, aVar, rVar3, eVar4, z12, h13, p12, i10, i11);
        }
    }
}
