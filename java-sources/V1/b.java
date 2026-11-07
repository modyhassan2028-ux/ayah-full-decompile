package V1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f8401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f8402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f8403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8404u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, q9.c cVar2) {
        super(cVar2);
        this.f8403t = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f8402s = obj;
        this.f8404u |= Integer.MIN_VALUE;
        return this.f8403t.c(null, this);
    }
}
