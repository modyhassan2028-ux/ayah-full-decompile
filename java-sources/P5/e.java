package P5;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f6699t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f6699t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6697r = obj;
        this.f6698s |= Integer.MIN_VALUE;
        return this.f6699t.b(null, this);
    }
}
