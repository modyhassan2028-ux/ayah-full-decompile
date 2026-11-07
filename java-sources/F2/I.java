package F2;

/* JADX INFO: loaded from: classes.dex */
public final class I extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M.k f2227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K f2229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2230u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k7, q9.c cVar) {
        super(cVar);
        this.f2229t = k7;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2228s = obj;
        this.f2230u |= Integer.MIN_VALUE;
        return this.f2229t.e(this);
    }
}
