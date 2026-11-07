package H2;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f3316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g f3317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3318t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3319u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u f3320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, q9.c cVar) {
        super(cVar);
        this.f3320v = uVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3319u = obj;
        this.f3321w |= Integer.MIN_VALUE;
        return this.f3320v.f(false, this);
    }
}
