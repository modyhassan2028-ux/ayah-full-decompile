package C0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f681v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, q9.c cVar) {
        super(cVar);
        this.f680u = gVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f679t = obj;
        this.f681v |= Integer.MIN_VALUE;
        return this.f680u.h(0L, this);
    }
}
