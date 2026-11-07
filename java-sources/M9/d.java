package M9;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f5841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5842t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, q9.c cVar) {
        super(cVar);
        this.f5841s = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f5840r = obj;
        this.f5842t |= Integer.MIN_VALUE;
        Object objD = this.f5841s.D(null, 0, 0L, this);
        return objD == p161p9.a.f21156r ? objD : new l(objD);
    }
}
