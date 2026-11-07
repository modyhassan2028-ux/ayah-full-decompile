package H2;

/* JADX INFO: loaded from: classes.dex */
public final class t extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f3328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f3329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p241y9.c f3330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f3331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f3333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3334x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, q9.c cVar) {
        super(cVar);
        this.f3333w = uVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3332v = obj;
        this.f3334x |= Integer.MIN_VALUE;
        return this.f3333w.d(null, null, this);
    }
}
