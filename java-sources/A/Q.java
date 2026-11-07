package A;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public T f118r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0050w f119s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f120t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ T f121u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f122v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t2, q9.c cVar) {
        super(cVar);
        this.f121u = t2;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f120t = obj;
        this.f122v |= Integer.MIN_VALUE;
        return T.A0(this.f121u, null, this);
    }
}
