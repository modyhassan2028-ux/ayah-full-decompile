package U4;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p095j3.c f8174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f8177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8178v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, p150o9.c cVar) {
        super(cVar);
        this.f8177u = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f8176t = obj;
        this.f8178v |= Integer.MIN_VALUE;
        return this.f8177u.a(null, this);
    }
}
