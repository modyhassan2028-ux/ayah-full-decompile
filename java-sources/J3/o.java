package J3;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f4282t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f4282t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4280r = obj;
        this.f4281s |= Integer.MIN_VALUE;
        return this.f4282t.b(null, this);
    }
}
