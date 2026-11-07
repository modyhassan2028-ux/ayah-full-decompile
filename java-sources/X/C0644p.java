package X;

/* JADX INFO: renamed from: X.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0644p extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f9767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f9768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f9769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9770u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644p(s sVar, q9.c cVar) {
        super(cVar);
        this.f9769t = sVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f9768s = obj;
        this.f9770u |= Integer.MIN_VALUE;
        return this.f9769t.a(null, null, null, this);
    }
}
