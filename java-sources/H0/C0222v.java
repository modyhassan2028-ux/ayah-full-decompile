package H0;

import J0.InterfaceC0302z;

/* JADX INFO: renamed from: H0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0222v extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p241y9.f f3222F;

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int a(J0.P p10, H h7, int i10) {
        return p245z2.a.h(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int c(J0.P p10, H h7, int i10) {
        return p245z2.a.e(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int d(J0.P p10, H h7, int i10) {
        return p245z2.a.n(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final J e(K k7, H h7, long j) {
        return (J) this.f3222F.d(k7, h7, new p063g1.a(j));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f3222F + ')';
    }
}
