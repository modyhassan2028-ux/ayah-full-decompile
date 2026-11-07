package T1;

/* JADX INFO: renamed from: T1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0501s extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B f7729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public S9.c f7730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f7732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7733v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0501s(B b5, q9.c cVar) {
        super(cVar);
        this.f7732u = b5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7731t = obj;
        this.f7733v |= Integer.MIN_VALUE;
        return B.e(this.f7732u, this);
    }
}
