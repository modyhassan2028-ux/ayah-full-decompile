package D;

import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public EnumC0080x f990F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p251z9.k f991G;

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
        H0.U uA = h7.a(p063g1.b.a(this.f990F != EnumC0080x.f1031r ? 0 : p063g1.a.j(j), p063g1.a.h(j), this.f990F == EnumC0080x.f1032s ? p063g1.a.i(j) : 0, p063g1.a.g(j)));
        int iL = B0.c.l(uA.f3168r, p063g1.a.j(j), p063g1.a.h(j));
        int iL2 = B0.c.l(uA.f3169s, p063g1.a.i(j), p063g1.a.g(j));
        return k7.g0(iL, iL2, p120l9.s.f19441r, new i0(this, iL, uA, iL2, k7));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }
}
