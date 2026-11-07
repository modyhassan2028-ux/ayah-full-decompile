package H;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p171r0.e f3108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f3109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3110t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3111u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f3113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3114x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, q9.c cVar) {
        super(cVar);
        this.f3113w = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3112v = obj;
        this.f3114x |= Integer.MIN_VALUE;
        return this.f3113w.a(null, this);
    }
}
