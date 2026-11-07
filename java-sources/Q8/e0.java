package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f6974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c0 f6975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f6976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f0 f6977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6978v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, p150o9.c cVar) {
        super(cVar);
        this.f6977u = f0Var;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6976t = obj;
        this.f6978v |= Integer.MIN_VALUE;
        return f0.a(this.f6977u, null, null, this);
    }
}
