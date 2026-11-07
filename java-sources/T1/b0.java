package T1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public S9.c f7659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c0 f7662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7663v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, q9.c cVar) {
        super(cVar);
        this.f7662u = c0Var;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7661t = obj;
        this.f7663v |= Integer.MIN_VALUE;
        return this.f7662u.a(null, this);
    }
}
