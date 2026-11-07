package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class U extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public V f6914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V f6916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6917u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v10, q9.c cVar) {
        super(cVar);
        this.f6916t = v10;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6915s = obj;
        this.f6917u |= Integer.MIN_VALUE;
        return V.a(this.f6916t, this);
    }
}
