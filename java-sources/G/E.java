package G;

import D.AbstractC0071n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.C0560g0;
import W.F0;
import W.G2;
import W.Z0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import p223x.InterfaceC1435y;
import p223x.n0;
import p223x.q0;
import p223x.t0;
import p223x.u0;
import p223x.v0;
import p223x.w0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2580u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f2581v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(Object obj, Object obj2, Object obj3, p241y9.e eVar, int i10, int i11) {
        super(2);
        this.f2577r = i11;
        this.f2578s = obj;
        this.f2579t = obj2;
        this.f2580u = obj3;
        this.f2581v = eVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2577r) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0190y.a((p241y9.a) this.f2578s, (l0.r) this.f2579t, (L) this.f2580u, this.f2581v, (C0698o) obj, C0672b.y(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                F0.a((C0560g0) this.f2578s, (Z0) this.f2579t, (G2) this.f2580u, (p074h0.d) this.f2581v, (C0698o) obj, C0672b.y(3073));
                break;
            default:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q0 q0Var = (q0) this.f2578s;
                    A.D d5 = new A.D(8, (u0) this.f2579t);
                    v0 v0Var = w0.f24113a;
                    Object objI = q0Var.f24065a.i();
                    c0698o.T(-438678252);
                    Object obj3 = this.f2580u;
                    float f3 = p251z9.j.a(objI, obj3) ? 1.0f : 0.0f;
                    c0698o.p(false);
                    Float fValueOf = Float.valueOf(f3);
                    Object value = q0Var.f24068d.getValue();
                    c0698o.T(-438678252);
                    float f7 = p251z9.j.a(value, obj3) ? 1.0f : 0.0f;
                    c0698o.p(false);
                    n0 n0VarC = t0.c(q0Var, fValueOf, Float.valueOf(f7), (InterfaceC1435y) d5.d(q0Var.f(), c0698o, 0), v0Var, c0698o, 0);
                    boolean zG = c0698o.g(n0VarC);
                    Object objH = c0698o.H();
                    if (zG || objH == C0690k.f10683a) {
                        objH = new p085i0.f(12, n0VarC);
                        c0698o.e0(objH);
                    }
                    l0.r rVarA = androidx.compose.ui.graphics.a.a(l0.o.f19333a, (p241y9.c) objH);
                    p074h0.d dVar = (p074h0.d) this.f2581v;
                    H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
                    int i10 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    l0.r rVarC = l0.a.c(c0698o, rVarA);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, iD, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i10))) {
                        p123m2.c.y(i10, c0698o, i10, c0285h);
                    }
                    C0672b.v(c0698o, rVarC, C0287j.f4117d);
                    dVar.d(obj3, c0698o, 0);
                    c0698o.p(true);
                } else {
                    c0698o.N();
                }
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(q0 q0Var, u0 u0Var, Object obj, p074h0.d dVar) {
        super(2);
        this.f2577r = 2;
        this.f2578s = q0Var;
        this.f2579t = u0Var;
        this.f2580u = obj;
        this.f2581v = dVar;
    }
}
