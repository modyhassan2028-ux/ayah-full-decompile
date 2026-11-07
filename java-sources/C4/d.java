package C4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f734t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f734t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f732r = obj;
        this.f733s |= Integer.MIN_VALUE;
        return this.f734t.b(null, this);
    }
}
