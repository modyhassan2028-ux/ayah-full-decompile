package J3;

/* JADX INFO: loaded from: classes.dex */
public final class v extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f4303t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f4303t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4301r = obj;
        this.f4302s |= Integer.MIN_VALUE;
        return this.f4303t.b(null, this);
    }
}
