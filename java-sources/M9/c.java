package M9;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f5838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5839t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, q9.c cVar) {
        super(cVar);
        this.f5838s = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f5837r = obj;
        this.f5839t |= Integer.MIN_VALUE;
        Object objC = e.C(this.f5838s, this);
        return objC == p161p9.a.f21156r ? objC : new l(objC);
    }
}
