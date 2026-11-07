package F2;

/* JADX INFO: loaded from: classes.dex */
public final class C extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public D f2190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f2191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D f2193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2194v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d5, p150o9.c cVar) {
        super(cVar);
        this.f2193u = d5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2192t = obj;
        this.f2194v |= Integer.MIN_VALUE;
        return this.f2193u.c(null, this);
    }
}
