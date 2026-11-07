package D;

import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public final class A extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public EnumC0080x f870F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f871G;

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
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!p063g1.a.d(j) || this.f870F == EnumC0080x.f1031r) {
            iJ = p063g1.a.j(j);
            iH = p063g1.a.h(j);
        } else {
            int iRound = Math.round(p063g1.a.h(j) * this.f871G);
            int iJ2 = p063g1.a.j(j);
            iJ = p063g1.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!p063g1.a.c(j) || this.f870F == EnumC0080x.f1032s) {
            int i10 = p063g1.a.i(j);
            iG = p063g1.a.g(j);
            iG2 = i10;
        } else {
            int iRound2 = Math.round(p063g1.a.g(j) * this.f871G);
            int i11 = p063g1.a.i(j);
            iG2 = p063g1.a.g(j);
            if (iRound2 < i11) {
                iRound2 = i11;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        H0.U uA = h7.a(p063g1.b.a(iJ, iH, iG2, iG));
        return k7.g0(uA.f3168r, uA.f3169s, p120l9.s.f19441r, new C0082z(uA, 0));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }
}
