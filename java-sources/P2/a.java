package P2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.f f6583t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6583t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6581r = obj;
        this.f6582s |= Integer.MIN_VALUE;
        return this.f6583t.b(null, this);
    }
}
