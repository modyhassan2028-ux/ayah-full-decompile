package N9;

/* JADX INFO: loaded from: classes.dex */
public final class N extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public H2.i f6116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p251z9.v f6117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f6118t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H2.i f6119u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6120v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(H2.i iVar, p150o9.c cVar) {
        super(cVar);
        this.f6119u = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6118t = obj;
        this.f6120v |= Integer.MIN_VALUE;
        return this.f6119u.b(null, this);
    }
}
