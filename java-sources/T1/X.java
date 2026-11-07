package T1;

/* JADX INFO: loaded from: classes.dex */
public final class X extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Aa.a f7647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public S9.a f7648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Aa.a f7650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7651v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Aa.a aVar, q9.c cVar) {
        super(cVar);
        this.f7650u = aVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7649t = obj;
        this.f7651v |= Integer.MIN_VALUE;
        return this.f7650u.G(this);
    }
}
