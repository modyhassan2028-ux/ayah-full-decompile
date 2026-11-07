package F2;

/* JADX INFO: loaded from: classes.dex */
public final class E extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public K f2200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public M.k f2201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K f2203u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2204v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(K k7, q9.c cVar) {
        super(cVar);
        this.f2203u = k7;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2202t = obj;
        this.f2204v |= Integer.MIN_VALUE;
        return K.b(this.f2203u, this);
    }
}
