package R0;

import J0.y0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l0.q implements y0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f7072F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f7073G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p241y9.c f7074H;

    public c(boolean z10, boolean z11, p241y9.c cVar) {
        this.f7072F = z10;
        this.f7073G = z11;
        this.f7074H = cVar;
    }

    @Override // J0.y0
    public final void L(j jVar) {
        this.f7074H.e(jVar);
    }

    @Override // J0.y0
    public final boolean S() {
        return this.f7073G;
    }

    @Override // J0.y0
    public final boolean V() {
        return this.f7072F;
    }
}
