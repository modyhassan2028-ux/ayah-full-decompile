package A;

/* JADX INFO: renamed from: A.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0049v0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0053x0 f428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0053x0 f430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f431u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049v0(C0053x0 c0053x0, q9.c cVar) {
        super(cVar);
        this.f430t = c0053x0;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f429s = obj;
        this.f431u |= Integer.MIN_VALUE;
        return this.f430t.d(this);
    }
}
