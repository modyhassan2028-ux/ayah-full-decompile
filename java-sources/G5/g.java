package G5;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f2888t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f2888t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2886r = obj;
        this.f2887s |= Integer.MIN_VALUE;
        return this.f2888t.b(null, this);
    }
}
