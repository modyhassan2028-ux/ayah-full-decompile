package F2;

/* JADX INFO: loaded from: classes.dex */
public final class H extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f2219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f2220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f2221t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ K f2225x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2226y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(K k7, q9.c cVar) {
        super(cVar);
        this.f2225x = k7;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2224w = obj;
        this.f2226y |= Integer.MIN_VALUE;
        return K.d(this.f2225x, null, 0, this);
    }
}
