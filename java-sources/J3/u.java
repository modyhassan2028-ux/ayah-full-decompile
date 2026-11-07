package J3;

/* JADX INFO: loaded from: classes.dex */
public final class u extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f4300t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f4300t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4298r = obj;
        this.f4299s |= Integer.MIN_VALUE;
        return this.f4300t.b(null, this);
    }
}
