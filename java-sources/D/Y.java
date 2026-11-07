package D;

import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f925F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f926G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f927H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f928I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f929J;

    @Override // J0.InterfaceC0302z
    public final int a(J0.P p10, H0.H h7, int i10) {
        long jV0 = v0(p10);
        if (p063g1.a.f(jV0)) {
            return p063g1.a.h(jV0);
        }
        if (!this.f929J) {
            i10 = p063g1.b.f(jV0, i10);
        }
        return p063g1.b.g(jV0, h7.N(i10));
    }

    @Override // J0.InterfaceC0302z
    public final int c(J0.P p10, H0.H h7, int i10) {
        long jV0 = v0(p10);
        if (p063g1.a.e(jV0)) {
            return p063g1.a.g(jV0);
        }
        if (!this.f929J) {
            i10 = p063g1.b.g(jV0, i10);
        }
        return p063g1.b.f(jV0, h7.d(i10));
    }

    @Override // J0.InterfaceC0302z
    public final int d(J0.P p10, H0.H h7, int i10) {
        long jV0 = v0(p10);
        if (p063g1.a.f(jV0)) {
            return p063g1.a.h(jV0);
        }
        if (!this.f929J) {
            i10 = p063g1.b.f(jV0, i10);
        }
        return p063g1.b.g(jV0, h7.H(i10));
    }

    @Override // J0.InterfaceC0302z
    public final H0.J e(H0.K k7, H0.H h7, long j) {
        int iJ;
        int iH;
        int i10;
        int iG;
        long jA;
        long jV0 = v0(k7);
        if (this.f929J) {
            jA = p063g1.b.e(j, jV0);
        } else {
            if (Float.isNaN(this.f925F)) {
                iJ = p063g1.a.j(j);
                int iH2 = p063g1.a.h(jV0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = p063g1.a.j(jV0);
            }
            if (Float.isNaN(this.f927H)) {
                iH = p063g1.a.h(j);
                int iJ2 = p063g1.a.j(jV0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = p063g1.a.h(jV0);
            }
            if (Float.isNaN(this.f926G)) {
                i10 = p063g1.a.i(j);
                int iG2 = p063g1.a.g(jV0);
                if (i10 > iG2) {
                    i10 = iG2;
                }
            } else {
                i10 = p063g1.a.i(jV0);
            }
            if (Float.isNaN(this.f928I)) {
                iG = p063g1.a.g(j);
                int i11 = p063g1.a.i(jV0);
                if (iG < i11) {
                    iG = i11;
                }
            } else {
                iG = p063g1.a.g(jV0);
            }
            jA = p063g1.b.a(iJ, iH, i10, iG);
        }
        H0.U uA = h7.a(jA);
        return k7.g0(uA.f3168r, uA.f3169s, p120l9.s.f19441r, new C0082z(uA, 2));
    }

    @Override // J0.InterfaceC0302z
    public final int f(J0.P p10, H0.H h7, int i10) {
        long jV0 = v0(p10);
        if (p063g1.a.e(jV0)) {
            return p063g1.a.g(jV0);
        }
        if (!this.f929J) {
            i10 = p063g1.b.g(jV0, i10);
        }
        return p063g1.b.f(jV0, h7.P(i10));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long v0(H0.K k7) {
        int iE;
        int iE2;
        int iE3;
        int i10 = 0;
        if (Float.isNaN(this.f927H)) {
            iE = Integer.MAX_VALUE;
        } else {
            iE = k7.E(this.f927H);
            if (iE < 0) {
                iE = 0;
            }
        }
        if (Float.isNaN(this.f928I)) {
            iE2 = Integer.MAX_VALUE;
        } else {
            iE2 = k7.E(this.f928I);
            if (iE2 < 0) {
                iE2 = 0;
            }
        }
        if (Float.isNaN(this.f925F)) {
            iE3 = 0;
        } else {
            iE3 = k7.E(this.f925F);
            if (iE3 < 0) {
                iE3 = 0;
            }
            if (iE3 > iE) {
                iE3 = iE;
            }
            if (iE3 == Integer.MAX_VALUE) {
                iE3 = 0;
            }
        }
        if (!Float.isNaN(this.f926G)) {
            int iE4 = k7.E(this.f926G);
            if (iE4 < 0) {
                iE4 = 0;
            }
            if (iE4 > iE2) {
                iE4 = iE2;
            }
            if (iE4 != Integer.MAX_VALUE) {
                i10 = iE4;
            }
        }
        return p063g1.b.a(iE3, iE, i10, iE2);
    }
}
