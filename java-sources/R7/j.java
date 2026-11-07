package R7;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f7334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f7335u;

    public j(g gVar, float f3) {
        super(0);
        this.f7334t = gVar;
        this.f7335u = f3;
    }

    @Override // R7.f
    public final boolean n() {
        return true;
    }

    @Override // R7.f
    public final void p(float f3, float f7, float f10, y yVar) {
        this.f7334t.p(f3, f7 - this.f7335u, f10, yVar);
    }
}
