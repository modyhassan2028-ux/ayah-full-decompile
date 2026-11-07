package U4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f8181t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f8181t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f8179r = obj;
        this.f8180s |= Integer.MIN_VALUE;
        return this.f8181t.b(null, this);
    }
}
