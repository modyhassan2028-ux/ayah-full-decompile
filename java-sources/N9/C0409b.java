package N9;

/* JADX INFO: renamed from: N9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0409b extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M9.s f6160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6161s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0410c f6162t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6163u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0409b(C0410c c0410c, q9.c cVar) {
        super(cVar);
        this.f6162t = c0410c;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6161s = obj;
        this.f6163u |= Integer.MIN_VALUE;
        return this.f6162t.e(null, this);
    }
}
