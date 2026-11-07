package H5;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3402r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f3404t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f3404t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3402r = obj;
        this.f3403s |= Integer.MIN_VALUE;
        return this.f3404t.b(null, this);
    }
}
