package G5;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f2863t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f2863t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2861r = obj;
        this.f2862s |= Integer.MIN_VALUE;
        return this.f2863t.b(null, this);
    }
}
