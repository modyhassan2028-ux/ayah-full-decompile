package K9;

/* JADX INFO: loaded from: classes.dex */
public final class L implements X {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f5326r;

    public L(boolean z10) {
        this.f5326r = z10;
    }

    @Override // K9.X
    public final boolean b() {
        return this.f5326r;
    }

    @Override // K9.X
    public final j0 d() {
        return null;
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("Empty{"), this.f5326r ? "Active" : "New", '}');
    }
}
