package W;

/* JADX INFO: loaded from: classes.dex */
public final class J extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0561g1 f8599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f8600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f8601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f8602u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0561g1 c0561g1, float f3, float f7, float f10) {
        super(1);
        this.f8599r = c0561g1;
        this.f8600s = f3;
        this.f8601t = f7;
        this.f8602u = f10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        X.u uVar = (X.u) obj;
        C0561g1 c0561g1 = this.f8599r;
        c0561g1.getClass();
        EnumC0565h1 enumC0565h1 = EnumC0565h1.f9160t;
        float f3 = this.f8600s;
        float f7 = this.f8601t;
        uVar.a(enumC0565h1, f3 - f7);
        float f10 = this.f8602u;
        if (f10 != f7) {
            uVar.a(EnumC0565h1.f9159s, Math.max(f3 - f10, 0.0f));
        }
        if (!c0561g1.f9136a) {
            uVar.a(EnumC0565h1.f9158r, f3);
        }
        return p110k9.y.f19095a;
    }
}
