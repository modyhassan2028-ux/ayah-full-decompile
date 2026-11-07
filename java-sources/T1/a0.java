package T1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f7654r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public S9.c f7655s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7656t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c0 f7657u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7658v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, q9.c cVar) {
        super(cVar);
        this.f7657u = c0Var;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7656t = obj;
        this.f7658v |= Integer.MIN_VALUE;
        return this.f7657u.b(null, this);
    }
}
