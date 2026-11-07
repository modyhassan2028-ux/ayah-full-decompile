package D;

import A.C0023i;
import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public final class O extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f903F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f904G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f905H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f906I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f907J;

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
        int iE = k7.E(this.f905H) + k7.E(this.f903F);
        int iE2 = k7.E(this.f906I) + k7.E(this.f904G);
        H0.U uA = h7.a(p063g1.b.i(-iE, -iE2, j));
        return k7.g0(p063g1.b.g(j, uA.f3168r + iE), p063g1.b.f(j, uA.f3169s + iE2), p120l9.s.f19441r, new C0023i(this, uA, k7, 3));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }
}
