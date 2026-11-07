package J3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f4250t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, p150o9.c cVar) {
        super(cVar);
        this.f4250t = gVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4248r = obj;
        this.f4249s |= Integer.MIN_VALUE;
        return this.f4250t.b(null, this);
    }
}
