package C0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f673t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f674u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f675v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f676w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, q9.c cVar) {
        super(cVar);
        this.f675v = gVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f674u = obj;
        this.f676w |= Integer.MIN_VALUE;
        return this.f675v.T(0L, 0L, this);
    }
}
