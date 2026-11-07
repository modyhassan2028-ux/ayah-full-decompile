package F8;

/* JADX INFO: loaded from: classes.dex */
public final class g implements C8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2534a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2535b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C8.c f2536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f2537d;

    public g(e eVar) {
        this.f2537d = eVar;
    }

    @Override // C8.g
    public final C8.g b(String str) {
        if (this.f2534a) {
            throw new C8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f2534a = true;
        this.f2537d.h(this.f2536c, str, this.f2535b);
        return this;
    }

    @Override // C8.g
    public final C8.g c(boolean z10) {
        if (this.f2534a) {
            throw new C8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f2534a = true;
        this.f2537d.c(this.f2536c, z10 ? 1 : 0, this.f2535b);
        return this;
    }
}
