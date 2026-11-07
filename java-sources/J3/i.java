package J3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f4259t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, p150o9.c cVar) {
        super(cVar);
        this.f4259t = gVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4257r = obj;
        this.f4258s |= Integer.MIN_VALUE;
        return this.f4259t.b(null, this);
    }
}
