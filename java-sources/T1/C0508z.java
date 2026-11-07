package T1;

/* JADX INFO: renamed from: T1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0508z extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p251z9.t f7770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f7772t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7773u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0508z(B b5, q9.c cVar) {
        super(cVar);
        this.f7772t = b5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7771s = obj;
        this.f7773u |= Integer.MIN_VALUE;
        return this.f7772t.k(null, false, this);
    }
}
