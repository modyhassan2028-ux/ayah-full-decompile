package N9;

/* JADX INFO: renamed from: N9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0417j extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.e f6192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C4.e f6193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0416i f6194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6196x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0417j(C4.e eVar, p150o9.c cVar) {
        super(cVar);
        this.f6192t = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6190r = obj;
        this.f6191s |= Integer.MIN_VALUE;
        return this.f6192t.d(null, this);
    }
}
