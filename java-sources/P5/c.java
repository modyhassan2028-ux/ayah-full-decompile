package P5;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.f f6693t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6693t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6691r = obj;
        this.f6692s |= Integer.MIN_VALUE;
        return this.f6693t.b(null, this);
    }
}
