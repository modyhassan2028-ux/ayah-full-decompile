package O9;

/* JADX INFO: loaded from: classes.dex */
public final class m extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G5.b f6541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6542t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(G5.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f6541s = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6540r = obj;
        this.f6542t |= Integer.MIN_VALUE;
        return this.f6541s.b(null, this);
    }
}
