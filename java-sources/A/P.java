package A;

/* JADX INFO: loaded from: classes.dex */
public final class P extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public T f110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0048v f111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B.b f112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ T f114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f115w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(T t2, q9.c cVar) {
        super(cVar);
        this.f114v = t2;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f113u = obj;
        this.f115w |= Integer.MIN_VALUE;
        return T.z0(this.f114v, null, this);
    }
}
