package L3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f5492t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f5492t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f5490r = obj;
        this.f5491s |= Integer.MIN_VALUE;
        return this.f5492t.b(null, this);
    }
}
