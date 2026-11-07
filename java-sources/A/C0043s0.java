package A;

/* JADX INFO: renamed from: A.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043s0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0045t0 f411r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0045t0 f413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f414u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0043s0(C0045t0 c0045t0, q9.c cVar) {
        super(cVar);
        this.f413t = c0045t0;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f412s = obj;
        this.f414u |= Integer.MIN_VALUE;
        return this.f413t.h(null, null, this);
    }
}
