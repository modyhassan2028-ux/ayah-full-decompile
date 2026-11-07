package N9;

/* JADX INFO: renamed from: N9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0428v extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0429w f6254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6255t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0428v(C0429w c0429w, p150o9.c cVar) {
        super(cVar);
        this.f6254s = c0429w;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6253r = obj;
        this.f6255t |= Integer.MIN_VALUE;
        return this.f6254s.b(null, this);
    }
}
