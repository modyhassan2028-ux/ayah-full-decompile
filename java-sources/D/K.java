package D;

/* JADX INFO: loaded from: classes.dex */
public final class K extends J {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public I f894G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f895H;

    @Override // D.J, J0.InterfaceC0302z
    public final int a(J0.P p10, H0.H h7, int i10) {
        return this.f894G == I.f890r ? h7.H(i10) : h7.N(i10);
    }

    @Override // D.J, J0.InterfaceC0302z
    public final int d(J0.P p10, H0.H h7, int i10) {
        return this.f894G == I.f890r ? h7.H(i10) : h7.N(i10);
    }

    @Override // D.J
    public final long v0(H0.H h7, long j) {
        int iH = this.f894G == I.f890r ? h7.H(p063g1.a.g(j)) : h7.N(p063g1.a.g(j));
        if (iH < 0) {
            iH = 0;
        }
        if (iH < 0) {
            p063g1.i.a("width must be >= 0");
        }
        return p063g1.b.h(iH, iH, 0, Integer.MAX_VALUE);
    }

    @Override // D.J
    public final boolean w0() {
        return this.f895H;
    }
}
