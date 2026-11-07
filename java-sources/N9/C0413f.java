package N9;

/* JADX INFO: renamed from: N9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0413f extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H2.i f6178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6179t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0413f(H2.i iVar, p150o9.c cVar) {
        super(cVar);
        this.f6178s = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6177r = obj;
        this.f6179t |= Integer.MIN_VALUE;
        return this.f6178s.b(null, this);
    }
}
