package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class v extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public A f3085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f3086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f3087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3088u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ A f3090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3091x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(A a9, q9.c cVar) {
        super(cVar);
        this.f3090w = a9;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3089v = obj;
        this.f3091x |= Integer.MIN_VALUE;
        return this.f3090w.g(null, 0L, this);
    }
}
