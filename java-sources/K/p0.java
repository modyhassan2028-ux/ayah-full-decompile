package K;

import A.C0042s;
import A.EnumC0047u0;
import A.M0;
import A.T0;
import A.U0;
import K0.AbstractC0359n0;
import W.A2;
import W.C0554e2;
import W.C0576l;
import W.I0;
import W.L1;
import W.P1;
import W.W1;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.L0;
import p223x.AbstractC1413d;
import p223x.AbstractC1415e;
import p232y.C1460n;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4750r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f4752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4753u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(B.j jVar, boolean z10, L1 l10) {
        super(3);
        P1 p10 = P1.f8759a;
        P1 p11 = P1.f8759a;
        this.f4751s = jVar;
        this.f4752t = z10;
        this.f4753u = l10;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j;
        L0 l0U;
        L0 l0U2;
        int i10 = this.f4750r;
        l0.o oVar = l0.o.f19333a;
        boolean z10 = this.f4752t;
        Object obj4 = this.f4751s;
        Object obj5 = this.f4753u;
        int i11 = 0;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj2;
                ((Number) obj3).intValue();
                r0 r0Var = (r0) obj5;
                C0681f0 c0681f0 = r0Var.f4771f;
                c0698o.T(805428266);
                boolean z11 = ((EnumC0047u0) c0681f0.getValue()) == EnumC0047u0.f424r || !(c0698o.k(AbstractC0359n0.f5123n) == p063g1.m.f16262s);
                boolean zG = c0698o.g(r0Var);
                Object objH = c0698o.H();
                Z.S s10 = C0690k.f10683a;
                if (zG || objH == s10) {
                    objH = new M0(14, r0Var);
                    c0698o.e0(objH);
                }
                Z.X xU = C0672b.u((p241y9.c) objH, c0698o);
                Object objH2 = c0698o.H();
                if (objH2 == s10) {
                    C0042s c0042s = new C0042s(new U0(xU, i11));
                    c0698o.e0(c0042s);
                    objH2 = c0042s;
                }
                T0 t2 = (T0) objH2;
                boolean zG2 = c0698o.g(t2) | c0698o.g(r0Var);
                Object objH3 = c0698o.H();
                if (zG2 || objH3 == s10) {
                    objH3 = new o0(t2, r0Var);
                    c0698o.e0(objH3);
                }
                l0.r rVarB = androidx.compose.foundation.gestures.a.b((o0) objH3, (EnumC0047u0) c0681f0.getValue(), z10 && r0Var.f4767b.g() != 0.0f, z11, (B.j) obj4);
                c0698o.p(false);
                return rVarB;
            case 1:
                C0698o c0698o2 = (C0698o) obj2;
                ((Number) obj3).intValue();
                c0698o2.T(-891038934);
                boolean zBooleanValue = ((Boolean) p000a.a.r((B.j) obj4, c0698o2, 0).getValue()).booleanValue();
                L1 l10 = (L1) obj5;
                float f3 = P1.f8763e;
                float f7 = P1.f8762d;
                float f10 = X.M.f9711b;
                if (z10) {
                    j = zBooleanValue ? l10.f8666l : l10.f8667m;
                } else {
                    j = l10.f8668n;
                }
                int i12 = 6;
                if (z10) {
                    c0698o2.T(1023053998);
                    l0U = p214w.L.a(j, AbstractC1413d.q(150, 0, null, 6), c0698o2);
                    c0698o2.p(false);
                } else {
                    c0698o2.T(1023165505);
                    l0U = C0672b.u(new p180s0.q(j), c0698o2);
                    c0698o2.p(false);
                }
                if (z10) {
                    c0698o2.T(1023269417);
                    if (!zBooleanValue) {
                        f3 = f7;
                    }
                    p223x.u0 u0VarQ = AbstractC1413d.q(150, 0, null, 6);
                    int i13 = AbstractC1415e.f23965a;
                    l0U2 = AbstractC1415e.a(new p063g1.f(f3), p223x.w0.f24115c, u0VarQ, "DpAnimation", c0698o2, 384);
                    c0698o2.p(false);
                } else {
                    c0698o2.T(1023478388);
                    l0U2 = C0672b.u(new p063g1.f(f7), c0698o2);
                    c0698o2.p(false);
                }
                Z.X xU2 = C0672b.u(new C1460n(((p063g1.f) l0U2.getValue()).f16252r, new p180s0.L(((p180s0.q) l0U.getValue()).f21845a)), c0698o2);
                int i14 = W1.f8894a;
                l0.r rVarC = androidx.compose.ui.draw.a.c(oVar, new U0(xU2, i12));
                c0698o2.p(false);
                return rVarC;
            default:
                C0698o c0698o3 = (C0698o) obj2;
                ((Number) obj3).intValue();
                A2.l(R0.m.a(androidx.compose.foundation.layout.c.j(oVar, Y.s.f10234a), false, W.O.f8737x), A2.f8452a, p074h0.j.d(-320307952, new I0((C0554e2) obj5, (u.s) obj, (C0576l) obj4, z10), c0698o3), c0698o3, 432);
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, boolean z10, B.j jVar) {
        super(3);
        this.f4753u = r0Var;
        this.f4752t = z10;
        this.f4751s = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(C0554e2 c0554e2, C0576l c0576l, boolean z10) {
        super(3);
        this.f4753u = c0554e2;
        this.f4751s = c0576l;
        this.f4752t = z10;
    }
}
