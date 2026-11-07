package W;

import D.AbstractC0071n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2 f9411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f9412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f9413u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(int i10, C2 c10, int i11, long j) {
        super(2);
        this.f9410r = i10;
        this.f9411s = c10;
        this.f9412t = i11;
        this.f9413u = j;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            boolean zD = this.f9411s.d();
            int i10 = this.f9410r;
            int i11 = this.f9412t;
            String strS = A2.s(i10, i11, c0698o, zD);
            H0.I iD = AbstractC0071n.d(l0.c.f19317v, false);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.o oVar = l0.o.f19333a;
            l0.r rVarC = l0.a.c(c0698o, oVar);
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
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            boolean zG = c0698o.g(strS);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                objH = new R0.n(strS, 7);
                c0698o.e0(objH);
            }
            AbstractC0542b2.b(Y.a(i11, 6), R0.m.a(oVar, false, (p241y9.c) objH), this.f9413u, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o, 0, 0, 131064);
            c0698o.p(true);
        }
        return p110k9.y.f19095a;
    }
}
