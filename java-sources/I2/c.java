package I2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f3800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public R2.a f3801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f3802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f3803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3804v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, q9.c cVar) {
        super(cVar);
        this.f3803u = dVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3802t = obj;
        this.f3804v |= Integer.MIN_VALUE;
        return this.f3803u.e(null, null, this);
    }
}
