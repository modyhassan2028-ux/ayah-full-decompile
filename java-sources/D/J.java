package D;

import J0.InterfaceC0302z;

/* JADX INFO: loaded from: classes.dex */
public abstract class J extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ int f893F;

    public /* synthetic */ J(int i10) {
        this.f893F = i10;
    }

    @Override // J0.InterfaceC0302z
    public int a(J0.P p10, H0.H h7, int i10) {
        switch (this.f893F) {
            case 0:
                break;
        }
        return h7.N(i10);
    }

    public int c(J0.P p10, H0.H h7, int i10) {
        switch (this.f893F) {
            case 0:
                break;
        }
        return h7.d(i10);
    }

    @Override // J0.InterfaceC0302z
    public int d(J0.P p10, H0.H h7, int i10) {
        switch (this.f893F) {
            case 0:
                break;
        }
        return h7.H(i10);
    }

    @Override // J0.InterfaceC0302z
    public H0.J e(H0.K k7, H0.H h7, long j) {
        long jV0 = v0(h7, j);
        if (w0()) {
            jV0 = p063g1.b.e(j, jV0);
        }
        H0.U uA = h7.a(jV0);
        return k7.g0(uA.f3168r, uA.f3169s, p120l9.s.f19441r, new C0082z(uA, 1));
    }

    public int f(J0.P p10, H0.H h7, int i10) {
        switch (this.f893F) {
            case 0:
                break;
        }
        return h7.P(i10);
    }

    public abstract long v0(H0.H h7, long j);

    public abstract boolean w0();
}
