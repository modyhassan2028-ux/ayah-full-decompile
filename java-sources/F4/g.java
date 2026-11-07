package F4;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f2397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2398t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, q9.c cVar) {
        super(cVar);
        this.f2397s = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2396r = obj;
        this.f2398t |= Integer.MIN_VALUE;
        return this.f2397s.a(null, this);
    }
}
