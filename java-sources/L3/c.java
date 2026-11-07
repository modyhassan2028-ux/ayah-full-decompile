package L3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f5497t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f5497t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f5495r = obj;
        this.f5496s |= Integer.MIN_VALUE;
        return this.f5497t.b(null, this);
    }
}
