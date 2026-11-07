package C4;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f727t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f727t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f725r = obj;
        this.f726s |= Integer.MIN_VALUE;
        return this.f727t.b(null, this);
    }
}
