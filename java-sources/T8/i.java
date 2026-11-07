package T8;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f7954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f7956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7957u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, q9.c cVar) {
        super(cVar);
        this.f7956t = jVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7955s = obj;
        this.f7957u |= Integer.MIN_VALUE;
        return this.f7956t.b(this);
    }
}
