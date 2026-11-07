package T5;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f7798t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f7798t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7796r = obj;
        this.f7797s |= Integer.MIN_VALUE;
        return this.f7798t.b(null, this);
    }
}
