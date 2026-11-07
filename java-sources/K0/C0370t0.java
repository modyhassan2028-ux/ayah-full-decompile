package K0;

/* JADX INFO: renamed from: K0.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0370t0 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f5167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L5.c f5168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f5169t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0370t0(boolean z10, L5.c cVar, String str) {
        super(0);
        this.f5167r = z10;
        this.f5168s = cVar;
        this.f5169t = str;
    }

    @Override // p241y9.a
    public final Object invoke() {
        if (this.f5167r) {
            L5.c cVar = this.f5168s;
            String str = this.f5169t;
            O2.b bVar = (O2.b) cVar.f5532s;
            synchronized (bVar.f6452c) {
            }
        }
        return p110k9.y.f19095a;
    }
}
