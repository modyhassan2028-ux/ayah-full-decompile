package N9;

/* JADX INFO: loaded from: classes.dex */
public final class C extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B.f f6077r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6078s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6079t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B.f f6080u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f6081v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6080u = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6078s = obj;
        this.f6079t |= Integer.MIN_VALUE;
        return this.f6080u.b(null, this);
    }
}
