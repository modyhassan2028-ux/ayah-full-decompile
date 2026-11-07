package N9;

/* JADX INFO: renamed from: N9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0430x extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public H2.i f6259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f6260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f6261t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H2.i f6262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6263v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0430x(H2.i iVar, p150o9.c cVar) {
        super(cVar);
        this.f6262u = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6261t = obj;
        this.f6263v |= Integer.MIN_VALUE;
        return this.f6262u.b(null, this);
    }
}
