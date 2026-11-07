package T1;

/* JADX INFO: loaded from: classes.dex */
public final class H extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I f7591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f7592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f7593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public K f7594u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f7595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ I f7596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i10, q9.c cVar) {
        super(cVar);
        this.f7596w = i10;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7595v = obj;
        this.f7597x |= Integer.MIN_VALUE;
        return this.f7596w.b(null, this);
    }
}
