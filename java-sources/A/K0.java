package A;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f86r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f87s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ L0 f88t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f89u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(L0 l10, q9.c cVar) {
        super(cVar);
        this.f88t = l10;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f87s = obj;
        this.f89u |= Integer.MIN_VALUE;
        return this.f88t.T(0L, 0L, this);
    }
}
