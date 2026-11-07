package D;

import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f936F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f937G;

    @Override // J0.InterfaceC0302z
    public final int a(J0.P p10, H0.H h7, int i10) {
        int iN = h7.N(i10);
        int iC = !Float.isNaN(this.f936F) ? android.support.v4.media.session.p.c(p10, this.f936F) : 0;
        return iN < iC ? iC : iN;
    }

    @Override // J0.InterfaceC0302z
    public final int c(J0.P p10, H0.H h7, int i10) {
        int iD = h7.d(i10);
        int iC = !Float.isNaN(this.f937G) ? android.support.v4.media.session.p.c(p10, this.f937G) : 0;
        return iD < iC ? iC : iD;
    }

    @Override // J0.InterfaceC0302z
    public final int d(J0.P p10, H0.H h7, int i10) {
        int iH = h7.H(i10);
        int iC = !Float.isNaN(this.f936F) ? android.support.v4.media.session.p.c(p10, this.f936F) : 0;
        return iH < iC ? iC : iH;
    }

    @Override // J0.InterfaceC0302z
    public final H0.J e(H0.K k7, H0.H h7, long j) {
        int iJ;
        int i10;
        if (Float.isNaN(this.f936F) || p063g1.a.j(j) != 0) {
            iJ = p063g1.a.j(j);
        } else {
            int iE = k7.E(this.f936F);
            iJ = p063g1.a.h(j);
            if (iE < 0) {
                iE = 0;
            }
            if (iE <= iJ) {
                iJ = iE;
            }
        }
        int iH = p063g1.a.h(j);
        if (Float.isNaN(this.f937G) || p063g1.a.i(j) != 0) {
            i10 = p063g1.a.i(j);
        } else {
            int iE2 = k7.E(this.f937G);
            i10 = p063g1.a.g(j);
            int i11 = iE2 >= 0 ? iE2 : 0;
            if (i11 <= i10) {
                i10 = i11;
            }
        }
        H0.U uA = h7.a(p063g1.b.a(iJ, iH, i10, p063g1.a.g(j)));
        return k7.g0(uA.f3168r, uA.f3169s, p120l9.s.f19441r, new C0082z(uA, 3));
    }

    @Override // J0.InterfaceC0302z
    public final int f(J0.P p10, H0.H h7, int i10) {
        int iP = h7.P(i10);
        int iC = !Float.isNaN(this.f937G) ? android.support.v4.media.session.p.c(p10, this.f937G) : 0;
        return iP < iC ? iC : iP;
    }
}
