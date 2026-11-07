package F2;

/* JADX INFO: loaded from: classes.dex */
public final class B extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f2186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K f2188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2189u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(K k7, q9.c cVar) {
        super(cVar);
        this.f2188t = k7;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2187s = obj;
        this.f2189u |= Integer.MIN_VALUE;
        return K.a(this.f2188t, null, this);
    }
}
