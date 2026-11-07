package J3;

/* JADX INFO: renamed from: J3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.f f4231t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0303a(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f4231t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4229r = obj;
        this.f4230s |= Integer.MIN_VALUE;
        return this.f4231t.b(null, this);
    }
}
