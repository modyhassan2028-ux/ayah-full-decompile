package A;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r1 f377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p110k9.e f378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p241y9.a f379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f383x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, q9.c cVar) {
        super(cVar);
        this.f382w = r1Var;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f381v = obj;
        this.f383x |= Integer.MIN_VALUE;
        return this.f382w.a(null, null, this);
    }
}
