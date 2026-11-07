package T8;

/* JADX INFO: loaded from: classes.dex */
public final class m extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f7966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7967t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, q9.c cVar) {
        super(cVar);
        this.f7966s = nVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7965r = obj;
        this.f7967t |= Integer.MIN_VALUE;
        return this.f7966s.c(null, this);
    }
}
