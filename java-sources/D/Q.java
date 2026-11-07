package D;

import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public P f912F;

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int a(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.h(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int c(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.e(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int d(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.n(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final H0.J e(H0.K k7, H0.H h7, long j) {
        float fA = this.f912F.a(k7.getLayoutDirection());
        P p10 = this.f912F;
        float f3 = p10.f909b;
        float fB = p10.b(k7.getLayoutDirection());
        float f7 = this.f912F.f911d;
        float f10 = 0;
        if (!((Float.compare(f7, f10) >= 0) & (Float.compare(fA, f10) >= 0) & (Float.compare(f3, f10) >= 0) & (Float.compare(fB, f10) >= 0))) {
            E.a.a("Padding must be non-negative");
        }
        int iE = k7.E(fA);
        int iE2 = k7.E(fB) + iE;
        int iE3 = k7.E(f3);
        int iE4 = k7.E(f7) + iE3;
        H0.U uA = h7.a(p063g1.b.i(-iE2, -iE4, j));
        return k7.g0(p063g1.b.g(j, uA.f3168r + iE2), p063g1.b.f(j, uA.f3169s + iE4), p120l9.s.f19441r, new E(uA, iE, iE3, 1));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }
}
