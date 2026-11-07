package H0;

import J0.InterfaceC0301y;

/* JADX INFO: loaded from: classes.dex */
public final class P extends l0.q implements InterfaceC0301y {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p241y9.c f3164F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f3165G;

    @Override // J0.InterfaceC0301y
    public final /* synthetic */ void G(InterfaceC0219s interfaceC0219s) {
    }

    @Override // l0.q
    public final boolean i0() {
        return true;
    }

    @Override // J0.InterfaceC0301y
    public final void s(long j) {
        if (p063g1.l.a(this.f3165G, j)) {
            return;
        }
        this.f3164F.e(new p063g1.l(j));
        this.f3165G = j;
    }
}
