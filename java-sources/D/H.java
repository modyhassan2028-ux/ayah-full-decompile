package D;

/* JADX INFO: loaded from: classes.dex */
public final class H extends J {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public I f888G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f889H;

    @Override // D.J, J0.InterfaceC0302z
    public final int c(J0.P p10, H0.H h7, int i10) {
        return this.f888G == I.f890r ? h7.P(i10) : h7.d(i10);
    }

    @Override // D.J, J0.InterfaceC0302z
    public final int f(J0.P p10, H0.H h7, int i10) {
        return this.f888G == I.f890r ? h7.P(i10) : h7.d(i10);
    }

    @Override // D.J
    public final long v0(H0.H h7, long j) {
        int iP = this.f888G == I.f890r ? h7.P(p063g1.a.h(j)) : h7.d(p063g1.a.h(j));
        if (iP < 0) {
            iP = 0;
        }
        if (iP < 0) {
            p063g1.i.a("height must be >= 0");
        }
        return p063g1.b.h(0, Integer.MAX_VALUE, iP, iP);
    }

    @Override // D.J
    public final boolean w0() {
        return this.f889H;
    }
}
