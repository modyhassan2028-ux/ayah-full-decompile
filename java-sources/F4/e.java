package F4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f2391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2392t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, q9.c cVar) {
        super(cVar);
        this.f2391s = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2390r = obj;
        this.f2392t |= Integer.MIN_VALUE;
        return this.f2391s.a(null, this);
    }
}
