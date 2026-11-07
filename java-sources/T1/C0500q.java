package T1;

/* JADX INFO: renamed from: T1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0500q extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B f7718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public S9.c f7719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7720t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f7721u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7722v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0500q(B b5, q9.c cVar) {
        super(cVar);
        this.f7721u = b5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7720t = obj;
        this.f7722v |= Integer.MIN_VALUE;
        return B.c(this.f7721u, this);
    }
}
