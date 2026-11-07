package N9;

/* JADX INFO: loaded from: classes.dex */
public final class M extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.f f6113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f6114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0416i f6115v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6113t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6111r = obj;
        this.f6112s |= Integer.MIN_VALUE;
        return this.f6113t.b(null, this);
    }
}
