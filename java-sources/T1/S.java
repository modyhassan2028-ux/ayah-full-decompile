package T1;

/* JADX INFO: loaded from: classes.dex */
public final class S extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f7622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f7623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f7624t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f7625u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ U f7626v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7627w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u8, q9.c cVar) {
        super(cVar);
        this.f7626v = u8;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7625u = obj;
        this.f7627w |= Integer.MIN_VALUE;
        return this.f7626v.b(null, this);
    }
}
