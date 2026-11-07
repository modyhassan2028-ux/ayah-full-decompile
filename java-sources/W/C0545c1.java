package W;

/* JADX INFO: renamed from: W.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0545c1 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p063g1.c f9002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EnumC0565h1 f9003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f9004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f9005u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0545c1(p063g1.c cVar, EnumC0565h1 enumC0565h1, p241y9.c cVar2, boolean z10) {
        super(0);
        this.f9002r = cVar;
        this.f9003s = enumC0565h1;
        this.f9004t = cVar2;
        this.f9005u = z10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        return new C0561g1(this.f9002r, this.f9003s, this.f9004t, this.f9005u);
    }
}
