package W;

import D.AbstractC0066i;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import p056f2.AbstractC0939l;
import p223x.AbstractC1413d;
import p223x.AbstractC1434x;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8605c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f8606d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f8607e = 112;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f8608f = 280;

    static {
        float f3 = 48;
        f8603a = f3;
        f8604b = f3;
    }

    public static final void a(l0.r rVar, p223x.I i10, Z.X x9, p232y.j0 j0Var, p180s0.J j, long j10, float f3, float f7, p074h0.d dVar, C0698o c0698o, int i11) {
        boolean z10;
        p223x.u0 u0VarQ;
        boolean z11;
        c0698o.V(-151448888);
        int i12 = i11 | (c0698o.g(rVar) ? 4 : 2) | (c0698o.g(i10) ? 32 : 16) | (c0698o.g(j0Var) ? 2048 : 1024) | (c0698o.g(j) ? 16384 : 8192) | (c0698o.f(j10) ? 131072 : 65536) | (c0698o.d(f3) ? 1048576 : 524288) | (c0698o.d(f7) ? 8388608 : 4194304) | (c0698o.g(null) ? 67108864 : 33554432) | (c0698o.i(dVar) ? 536870912 : 268435456);
        if ((i12 & 306783379) == 306783378 && c0698o.x()) {
            c0698o.N();
        } else {
            p223x.q0 q0VarD = p223x.t0.d(i10, "DropDownMenu", c0698o, (((i12 >> 3) & 14) | 48) & 126);
            p223x.v0 v0Var = p223x.w0.f24113a;
            AbstractC0939l abstractC0939l = q0VarD.f24065a;
            C0681f0 c0681f0 = q0VarD.f24068d;
            boolean zBooleanValue = ((Boolean) abstractC0939l.i()).booleanValue();
            c0698o.T(2139028452);
            float f10 = zBooleanValue ? 1.0f : 0.8f;
            c0698o.p(false);
            Float fValueOf = Float.valueOf(f10);
            boolean zBooleanValue2 = ((Boolean) c0681f0.getValue()).booleanValue();
            c0698o.T(2139028452);
            float f11 = zBooleanValue2 ? 1.0f : 0.8f;
            c0698o.p(false);
            Float fValueOf2 = Float.valueOf(f11);
            p223x.l0 l0VarF = q0VarD.f();
            c0698o.T(1033023423);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (l0VarF.b(bool, bool2)) {
                u0VarQ = AbstractC1413d.q(120, 0, AbstractC1434x.f24122b, 2);
                z11 = false;
                z10 = true;
            } else {
                z10 = true;
                u0VarQ = AbstractC1413d.q(1, 74, null, 4);
                z11 = false;
            }
            c0698o.p(z11);
            p223x.n0 n0VarC = p223x.t0.c(q0VarD, fValueOf, fValueOf2, u0VarQ, v0Var, c0698o, 0);
            boolean zBooleanValue3 = ((Boolean) q0VarD.f24065a.i()).booleanValue();
            c0698o.T(-249413128);
            float f12 = zBooleanValue3 ? 1.0f : 0.0f;
            c0698o.p(false);
            Float fValueOf3 = Float.valueOf(f12);
            boolean zBooleanValue4 = ((Boolean) c0681f0.getValue()).booleanValue();
            c0698o.T(-249413128);
            float f13 = zBooleanValue4 ? 1.0f : 0.0f;
            c0698o.p(false);
            Float fValueOf4 = Float.valueOf(f13);
            p223x.l0 l0VarF2 = q0VarD.f();
            c0698o.T(-1355418157);
            p223x.u0 u0VarQ2 = l0VarF2.b(bool, bool2) ? AbstractC1413d.q(30, 0, null, 6) : AbstractC1413d.q(75, 0, null, 6);
            c0698o.p(false);
            p223x.n0 n0VarC2 = p223x.t0.c(q0VarD, fValueOf3, fValueOf4, u0VarQ2, v0Var, c0698o, 0);
            boolean zBooleanValue5 = ((Boolean) c0698o.k(K0.A0.f4865a)).booleanValue();
            boolean zH = c0698o.h(zBooleanValue5) | c0698o.g(n0VarC) | ((i12 & 112) != 32 ? false : z10) | c0698o.g(n0VarC2);
            Object objH = c0698o.H();
            if (zH || objH == C0690k.f10683a) {
                Object e10 = new K.E(zBooleanValue5, i10, x9, n0VarC, n0VarC2);
                c0698o.e0(e10);
                objH = e10;
            }
            int i13 = i12 >> 9;
            int i14 = i12 >> 6;
            C1.a(androidx.compose.ui.graphics.a.a(l0.o.f19333a, (p241y9.c) objH), j, j10, 0L, f3, f7, null, p074h0.j.d(1573559053, new A.I0(rVar, j0Var, dVar, 5), c0698o), c0698o, (i13 & 896) | (i13 & 112) | 12582912 | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 8);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0579m(rVar, i10, x9, j0Var, j, j10, f3, f7, dVar, i11);
        }
    }

    public static final void b(p074h0.d dVar, p241y9.a aVar, l0.r rVar, p241y9.e eVar, boolean z10, H0 h7, D.P p10, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-1564716777);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.i(null) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(eVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.h(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0698o.g(h7) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0698o.g(p10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0698o.g(null) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) == 38347922 && c0698o.x()) {
            c0698o.N();
        } else {
            l0.r rVarG = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.a.b(rVar, null, W0.c(true, 0.0f, c0698o, 6, 6), z10, null, aVar, 24).b(androidx.compose.foundation.layout.c.f11826a), f8607e, f8608f, 8), p10);
            D.W wA = D.U.a(AbstractC0066i.f977a, l0.c.f19307B, c0698o, 48);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarG);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, wA, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            AbstractC0542b2.a(((G2) c0698o.k(H2.f8580a)).f8567m, p074h0.j.d(1065051884, new I0(h7, z10, eVar, dVar), c0698o), c0698o, 48);
            c0698o.p(true);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new Ga.w(dVar, aVar, rVar, eVar, z10, h7, p10, i10);
        }
    }
}
