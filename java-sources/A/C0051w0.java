package A;

/* JADX INFO: renamed from: A.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0051w0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0053x0 f433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0053x0 f435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f436u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0051w0(C0053x0 c0053x0, q9.c cVar) {
        super(cVar);
        this.f435t = c0053x0;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f434s = obj;
        this.f436u |= Integer.MIN_VALUE;
        return this.f435t.e(this);
    }
}
