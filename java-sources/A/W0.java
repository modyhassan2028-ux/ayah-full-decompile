package A;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b1 f160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p251z9.u f161s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f162t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b1 f163u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f164v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(b1 b1Var, q9.c cVar) {
        super(cVar);
        this.f163u = b1Var;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f162t = obj;
        this.f164v |= Integer.MIN_VALUE;
        return this.f163u.b(0L, this);
    }
}
