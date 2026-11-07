package D0;

/* JADX INFO: loaded from: classes.dex */
public final class K extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public K9.A f1057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f1059t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1060u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n6, q9.c cVar) {
        super(cVar);
        this.f1059t = n6;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f1058s = obj;
        this.f1060u |= Integer.MIN_VALUE;
        return this.f1059t.f(0L, null, this);
    }
}
