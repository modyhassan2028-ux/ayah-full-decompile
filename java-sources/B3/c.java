package B3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f602t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, q9.c cVar) {
        super(cVar);
        this.f601s = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f600r = obj;
        this.f602t |= Integer.MIN_VALUE;
        return this.f601s.a(null, this);
    }
}
