package l0;

import H0.H;
import H0.J;
import H0.K;
import H0.U;
import J0.InterfaceC0302z;
import J0.P;
import X.L;

/* JADX INFO: loaded from: classes.dex */
public final class u extends q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f19350F;

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int a(P p10, H h7, int i10) {
        return p245z2.a.h(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int c(P p10, H h7, int i10) {
        return p245z2.a.e(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int d(P p10, H h7, int i10) {
        return p245z2.a.n(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final J e(K k7, H h7, long j) {
        U uA = h7.a(j);
        return k7.g0(uA.f3168r, uA.f3169s, p120l9.s.f19441r, new L(12, uA, this));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(P p10, H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }

    public final String toString() {
        return p123m2.c.v(new StringBuilder("ZIndexModifier(zIndex="), this.f19350F, ')');
    }
}
