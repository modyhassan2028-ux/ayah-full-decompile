package T8;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f7932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public S9.a f7933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f7935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7936v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, q9.c cVar2) {
        super(cVar2);
        this.f7935u = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7934t = obj;
        this.f7936v |= Integer.MIN_VALUE;
        return this.f7935u.c(this);
    }
}
