package T5;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f7801t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f7801t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7799r = obj;
        this.f7800s |= Integer.MIN_VALUE;
        return this.f7801t.b(null, this);
    }
}
