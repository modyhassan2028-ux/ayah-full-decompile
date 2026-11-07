package N9;

/* JADX INFO: renamed from: N9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0426t extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B.f f6246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.f f6248t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6249u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0426t(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6248t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6247s = obj;
        this.f6249u |= Integer.MIN_VALUE;
        return this.f6248t.b(null, this);
    }
}
