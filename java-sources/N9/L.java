package N9;

/* JADX INFO: loaded from: classes.dex */
public final class L extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f6110t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f6110t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6108r = obj;
        this.f6109s |= Integer.MIN_VALUE;
        return this.f6110t.b(null, this);
    }
}
