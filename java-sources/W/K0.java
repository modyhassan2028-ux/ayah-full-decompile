package W;

import J0.AbstractC0283f;
import J0.InterfaceC0289l;
import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends l0.q implements InterfaceC0289l, InterfaceC0302z {
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
        float f3 = ((p063g1.f) AbstractC0283f.i(this, D0.f8496a)).f16252r;
        float f7 = 0;
        if (f3 < f7) {
            f3 = f7;
        }
        H0.U uA = h7.a(j);
        boolean z10 = this.f19338E && !Float.isNaN(f3) && Float.compare(f3, f7) > 0;
        int iE = Float.isNaN(f3) ? 0 : k7.E(f3);
        int iMax = z10 ? Math.max(uA.f3168r, iE) : uA.f3168r;
        int iMax2 = z10 ? Math.max(uA.f3169s, iE) : uA.f3169s;
        return k7.g0(iMax, iMax2, p120l9.s.f19441r, new D.E(iMax, iMax2, uA));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }
}
