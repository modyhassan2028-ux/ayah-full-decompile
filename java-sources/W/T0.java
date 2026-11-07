package W;

import A.C0041r0;
import K0.AbstractC0359n0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import p180s0.C1292a;
import p223x.AbstractC1413d;
import p223x.AbstractC1434x;
import p223x.C1429s;
import p232y.C1457k;

/* JADX INFO: loaded from: classes.dex */
public abstract class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0.r f8823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8824c = 240;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f8825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f8826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1429s f8827f;
    public static final C1429s g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1429s f8828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1429s f8829i;
    public static final C1429s j;

    static {
        float f3 = 10;
        f8822a = f3;
        f8823b = androidx.compose.foundation.layout.b.j(R0.m.a(androidx.compose.ui.layout.a.b(l0.o.f19333a, C0577l0.f9232x), true, O.f8734u), 0.0f, f3, 1);
        float f7 = Y.l.f10209b;
        f8825d = f7;
        f8826e = Y.l.f10210c - (f7 * 2);
        f8827f = new C1429s(0.2f, 0.8f, 1.0f);
        g = new C1429s(0.4f, 1.0f, 1.0f);
        f8828h = new C1429s(0.0f, 0.65f, 1.0f);
        f8829i = new C1429s(0.1f, 0.45f, 1.0f);
        j = new C1429s(0.4f, 0.2f, 1.0f);
    }

    public static final void a(p241y9.a aVar, l0.r rVar, long j10, float f3, long j11, int i10, float f7, C0698o c0698o, int i11) {
        float f10;
        l0.r rVar2;
        float f11;
        float f12;
        c0698o.V(-1798883595);
        int i12 = i11 | (c0698o.i(aVar) ? 4 : 2) | (c0698o.f(j10) ? 256 : 128) | (c0698o.d(f3) ? 2048 : 1024) | (c0698o.f(j11) ? 16384 : 8192) | (c0698o.e(i10) ? 131072 : 65536) | 1572864;
        if ((599187 & i12) == 599186 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
            f12 = f7;
        } else {
            c0698o.P();
            if ((i11 & 1) == 0 || c0698o.w()) {
                f10 = L0.f8640f;
            } else {
                c0698o.N();
                f10 = f7;
            }
            c0698o.q();
            boolean z10 = (i12 & 14) == 4;
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (z10 || objH == obj) {
                objH = new C0041r0(29, aVar);
                c0698o.e0(objH);
            }
            p241y9.a aVar2 = (p241y9.a) objH;
            p196u0.g gVar = new p196u0.g(((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).w(f3), 0.0f, i10, 0, 26);
            boolean zG = c0698o.g(aVar2);
            Object objH2 = c0698o.H();
            if (zG || objH2 == obj) {
                objH2 = new A.E(2, aVar2);
                c0698o.e0(objH2);
            }
            rVar2 = rVar;
            l0.r rVarJ = androidx.compose.foundation.layout.c.j(R0.m.a(rVar2, true, (p241y9.c) objH2), f8826e);
            boolean zG2 = ((((i12 & 896) ^ 384) > 256 && c0698o.f(j10)) || (i12 & 384) == 256) | ((i12 & 458752) == 131072) | c0698o.g(aVar2) | ((i12 & 7168) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && c0698o.f(j11)) || (i12 & 24576) == 16384) | c0698o.i(gVar);
            Object objH3 = c0698o.H();
            if (zG2 || objH3 == obj) {
                f11 = f10;
                Object m10 = new M0(aVar2, i10, f11, f3, j11, gVar, j10);
                c0698o.e0(m10);
                objH3 = m10;
            } else {
                f11 = f10;
            }
            p171r0.f.a(rVarJ, (p241y9.c) objH3, c0698o, 0);
            f12 = f11;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new N0(aVar, rVar2, j10, f3, j11, i10, f12, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fd  */
    public static final void b(l0.r rVar, long j10, float f3, long j11, int i10, C0698o c0698o, int i11, int i12) {
        l0.r rVar2;
        int i13;
        float f7;
        int i14;
        int i15;
        int i16;
        l0.r rVar3;
        float f10;
        int i17;
        p196u0.g gVar;
        int i18;
        float f11;
        p223x.D dI;
        p223x.D dF;
        p223x.D dF2;
        p223x.D dF3;
        boolean z10;
        boolean z11;
        Object objH;
        C0698o c0698o2;
        long j12;
        long j13;
        Float fValueOf = Float.valueOf(290.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        c0698o.V(-115871647);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else if ((i11 & 6) == 0) {
            rVar2 = rVar;
            i13 = i11 | (c0698o.g(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i13 = i11;
        }
        int i20 = i13 | (c0698o.f(j10) ? 32 : 16);
        int i21 = i12 & 4;
        if (i21 != 0) {
            i14 = i20 | 384;
            f7 = f3;
        } else {
            f7 = f3;
            i14 = i20 | (c0698o.d(f7) ? 256 : 128);
        }
        long j14 = j11;
        int i22 = i14 | (((i12 & 8) == 0 && c0698o.f(j14)) ? 2048 : 1024);
        int i23 = i12 & 16;
        if (i23 != 0) {
            i16 = i22 | 24576;
            i15 = i10;
        } else {
            i15 = i10;
            i16 = i22 | (c0698o.e(i15) ? 16384 : 8192);
        }
        if ((i16 & 9363) == 9362 && c0698o.x()) {
            c0698o.N();
            c0698o2 = c0698o;
            j13 = j14;
        } else {
            c0698o.P();
            if ((i11 & 1) == 0 || c0698o.w()) {
                l0.r rVar4 = i19 != 0 ? l0.o.f19333a : rVar2;
                float f12 = i21 != 0 ? L0.f8635a : f7;
                if ((i12 & 8) != 0) {
                    float f13 = L0.f8635a;
                    i16 &= -7169;
                    j14 = p180s0.q.f21843f;
                }
                if (i23 != 0) {
                    rVar3 = rVar4;
                    f10 = f12;
                    i17 = L0.f8638d;
                } else {
                    rVar3 = rVar4;
                    f10 = f12;
                }
                c0698o.q();
                gVar = new p196u0.g(((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).w(f10), 0.0f, i17, 0, 26);
                p223x.F fO = AbstractC1413d.o(c0698o);
                p223x.v0 v0Var = p223x.w0.f24114b;
                C1292a c1292a = AbstractC1434x.f24124d;
                i18 = i16;
                f11 = f10;
                dI = AbstractC1413d.i(fO, 0, 5, v0Var, AbstractC1413d.n(AbstractC1413d.q(6660, 0, c1292a, 2)), c0698o, 33208, 16);
                dF = AbstractC1413d.f(fO, 286.0f, AbstractC1413d.n(AbstractC1413d.q(1332, 0, c1292a, 2)), c0698o);
                Da.r rVar5 = new Da.r(13, (byte) 0);
                rVar5.f1387s = 1332;
                p223x.G gC = rVar5.c(fValueOf2, 0);
                C1429s c1429s = j;
                gC.f23853b = c1429s;
                rVar5.c(fValueOf, 666);
                dF2 = AbstractC1413d.f(fO, 290.0f, AbstractC1413d.n(new p223x.H(rVar5)), c0698o);
                Da.r rVar6 = new Da.r(13, (byte) 0);
                rVar6.f1387s = 1332;
                rVar6.c(fValueOf2, 666).f23853b = c1429s;
                rVar6.c(fValueOf, rVar6.f1387s);
                dF3 = AbstractC1413d.f(fO, 290.0f, AbstractC1413d.n(new p223x.H(rVar6)), c0698o);
                l0.r rVarJ = androidx.compose.foundation.layout.c.j(R0.m.a(rVar3, true, C1457k.f24546w), f8826e);
                boolean zI = ((((i18 & 7168) ^ 3072) <= 2048 && c0698o.f(j14)) || (i18 & 3072) == 2048) | c0698o.i(gVar) | c0698o.g(dI) | c0698o.g(dF2) | c0698o.g(dF3) | c0698o.g(dF);
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = ((((i18 & 112) ^ 48) <= 32 && c0698o.f(j10)) || (i18 & 48) == 32) | zI | z10;
                objH = c0698o.H();
                if (!z11 || objH == C0690k.f10683a) {
                    c0698o2 = c0698o;
                    j12 = j14;
                    O0 o10 = new O0(j12, gVar, dI, dF2, dF3, dF, f11, j10);
                    c0698o2.e0(o10);
                    objH = o10;
                } else {
                    c0698o2 = c0698o;
                    j12 = j14;
                }
                p171r0.f.a(rVarJ, (p241y9.c) objH, c0698o2, 0);
                j13 = j12;
                rVar2 = rVar3;
                f7 = f11;
                i15 = i17;
            } else {
                c0698o.N();
                if ((i12 & 8) != 0) {
                    i16 &= -7169;
                }
                rVar3 = rVar2;
                f10 = f7;
            }
            i17 = i15;
            c0698o.q();
            gVar = new p196u0.g(((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).w(f10), 0.0f, i17, 0, 26);
            p223x.F fO2 = AbstractC1413d.o(c0698o);
            p223x.v0 v0Var2 = p223x.w0.f24114b;
            C1292a c1292a2 = AbstractC1434x.f24124d;
            i18 = i16;
            f11 = f10;
            dI = AbstractC1413d.i(fO2, 0, 5, v0Var2, AbstractC1413d.n(AbstractC1413d.q(6660, 0, c1292a2, 2)), c0698o, 33208, 16);
            dF = AbstractC1413d.f(fO2, 286.0f, AbstractC1413d.n(AbstractC1413d.q(1332, 0, c1292a2, 2)), c0698o);
            Da.r rVar7 = new Da.r(13, (byte) 0);
            rVar7.f1387s = 1332;
            p223x.G gC2 = rVar7.c(fValueOf2, 0);
            C1429s c1429s2 = j;
            gC2.f23853b = c1429s2;
            rVar7.c(fValueOf, 666);
            dF2 = AbstractC1413d.f(fO2, 290.0f, AbstractC1413d.n(new p223x.H(rVar7)), c0698o);
            Da.r rVar8 = new Da.r(13, (byte) 0);
            rVar8.f1387s = 1332;
            rVar8.c(fValueOf2, 666).f23853b = c1429s2;
            rVar8.c(fValueOf, rVar8.f1387s);
            dF3 = AbstractC1413d.f(fO2, 290.0f, AbstractC1413d.n(new p223x.H(rVar8)), c0698o);
            l0.r rVarJ2 = androidx.compose.foundation.layout.c.j(R0.m.a(rVar3, true, C1457k.f24546w), f8826e);
            boolean zI2 = ((((i18 & 7168) ^ 3072) <= 2048 && c0698o.f(j14)) || (i18 & 3072) == 2048) | c0698o.i(gVar) | c0698o.g(dI) | c0698o.g(dF2) | c0698o.g(dF3) | c0698o.g(dF);
            if ((i18 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = ((((i18 & 112) ^ 48) <= 32 && c0698o.f(j10)) || (i18 & 48) == 32) | zI2 | z10;
            objH = c0698o.H();
            if (z11) {
                c0698o2 = c0698o;
                j12 = j14;
                O0 o11 = new O0(j12, gVar, dI, dF2, dF3, dF, f11, j10);
                c0698o2.e0(o11);
                objH = o11;
            } else {
                c0698o2 = c0698o;
                j12 = j14;
                O0 o12 = new O0(j12, gVar, dI, dF2, dF3, dF, f11, j10);
                c0698o2.e0(o12);
                objH = o12;
            }
            p171r0.f.a(rVarJ2, (p241y9.c) objH, c0698o2, 0);
            j13 = j12;
            rVar2 = rVar3;
            f7 = f11;
            i15 = i17;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new P0(rVar2, j10, f7, j13, i15, i11, i12);
        }
    }

    public static final void c(l0.r rVar, long j10, long j11, int i10, float f3, C0698o c0698o, int i11) {
        int i12;
        float f7;
        l0.r rVar2;
        Object r10;
        int i13;
        float f10;
        int i14;
        int i15;
        float f11;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        c0698o.V(567589233);
        int i16 = i11 | (c0698o.f(j10) ? 32 : 16) | (c0698o.f(j11) ? 256 : 128) | 27648;
        if ((i16 & 9363) == 9362 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
            i15 = i10;
            f11 = f3;
        } else {
            c0698o.P();
            if ((i11 & 1) == 0 || c0698o.w()) {
                i12 = L0.f8636b;
                f7 = L0.f8639e;
            } else {
                c0698o.N();
                i12 = i10;
                f7 = f3;
            }
            c0698o.q();
            p223x.F fO = AbstractC1413d.o(c0698o);
            Da.r rVar3 = new Da.r(13, (byte) 0);
            rVar3.f1387s = 1800;
            rVar3.c(fValueOf2, 0).f23853b = f8827f;
            rVar3.c(fValueOf, 750);
            p223x.D dF = AbstractC1413d.f(fO, 1.0f, AbstractC1413d.n(new p223x.H(rVar3)), c0698o);
            Da.r rVar4 = new Da.r(13, (byte) 0);
            rVar4.f1387s = 1800;
            rVar4.c(fValueOf2, 333).f23853b = g;
            rVar4.c(fValueOf, 1183);
            p223x.D dF2 = AbstractC1413d.f(fO, 1.0f, AbstractC1413d.n(new p223x.H(rVar4)), c0698o);
            int i17 = i12;
            Da.r rVar5 = new Da.r(13, (byte) 0);
            rVar5.f1387s = 1800;
            rVar5.c(fValueOf2, 1000).f23853b = f8828h;
            rVar5.c(fValueOf, 1567);
            p223x.D dF3 = AbstractC1413d.f(fO, 1.0f, AbstractC1413d.n(new p223x.H(rVar5)), c0698o);
            float f12 = f7;
            Da.r rVar6 = new Da.r(13, (byte) 0);
            rVar6.f1387s = 1800;
            rVar6.c(fValueOf2, 1267).f23853b = f8829i;
            rVar6.c(fValueOf, 1800);
            p223x.D dF4 = AbstractC1413d.f(fO, 1.0f, AbstractC1413d.n(new p223x.H(rVar6)), c0698o);
            rVar2 = rVar;
            boolean z10 = true;
            l0.r rVarK = androidx.compose.foundation.layout.c.k(R0.m.a(rVar2.b(f8823b), true, C1457k.f24546w), f8824c, f8825d);
            boolean zG = c0698o.g(dF) | ((((i16 & 896) ^ 384) > 256 && c0698o.f(j11)) || (i16 & 384) == 256) | c0698o.g(dF2);
            if ((((i16 & 112) ^ 48) <= 32 || !c0698o.f(j10)) && (i16 & 48) != 32) {
                z10 = false;
            }
            boolean zG2 = zG | z10 | c0698o.g(dF3) | c0698o.g(dF4);
            Object objH = c0698o.H();
            if (zG2 || objH == C0690k.f10683a) {
                i13 = i17;
                f10 = f12;
                i14 = 0;
                r10 = new R0(i13, f10, dF, j11, dF2, j10, dF3, dF4);
                c0698o.e0(r10);
            } else {
                r10 = objH;
                i13 = i17;
                f10 = f12;
                i14 = 0;
            }
            p171r0.f.a(rVarK, (p241y9.c) r10, c0698o, i14);
            i15 = i13;
            f11 = f10;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new S0(rVar2, j10, j11, i15, f11, i11);
        }
    }

    public static final void d(p196u0.d dVar, float f3, float f7, long j10, float f10, int i10) {
        float fD = p171r0.i.d(dVar.b());
        float fB = p171r0.i.b(dVar.b());
        float f11 = 2;
        float f12 = fB / f11;
        boolean z10 = dVar.getLayoutDirection() == p063g1.m.f16261r;
        float f13 = (z10 ? f3 : 1.0f - f7) * fD;
        float f14 = (z10 ? f7 : 1.0f - f3) * fD;
        if (i10 == 0 || fB > fD) {
            dVar.W(j10, p171r0.d.a(f13, f12), p171r0.d.a(f14, f12), (240 & 8) != 0 ? 0.0f : f10, (240 & 16) != 0 ? 0 : 0, 3);
            return;
        }
        float f15 = f10 / f11;
        E9.a aVar = new E9.a(f15, fD - f15);
        float fFloatValue = ((Number) B0.c.n(Float.valueOf(f13), aVar)).floatValue();
        float fFloatValue2 = ((Number) B0.c.n(Float.valueOf(f14), aVar)).floatValue();
        if (Math.abs(f7 - f3) > 0.0f) {
            dVar.W(j10, p171r0.d.a(fFloatValue, f12), p171r0.d.a(fFloatValue2, f12), (240 & 8) != 0 ? 0.0f : f10, (240 & 16) != 0 ? 0 : i10, 3);
        }
    }

    public static final void e(p196u0.d dVar, float f3, float f7, long j10, p196u0.g gVar) {
        float f10 = 2;
        float f11 = gVar.f22801b / f10;
        float fD = p171r0.i.d(dVar.b()) - (f10 * f11);
        p123m2.c.d(dVar, j10, f3, f7, false, p171r0.d.a(f11, f11), p171r0.j.a(fD, fD), gVar, 832);
    }
}
