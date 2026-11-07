package J3;

/* JADX INFO: loaded from: classes.dex */
public final class q extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f4288t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f4288t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4286r = obj;
        this.f4287s |= Integer.MIN_VALUE;
        return this.f4288t.b(null, this);
    }
}
