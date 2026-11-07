package H2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f3286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f3288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3289u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, q9.c cVar) {
        super(cVar);
        this.f3288t = mVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3287s = obj;
        this.f3289u |= Integer.MIN_VALUE;
        return this.f3288t.a(this);
    }
}
