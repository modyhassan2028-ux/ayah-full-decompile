package T1;

/* JADX INFO: renamed from: T1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0503u extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B f7739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d0 f7740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7741t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f7742u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B f7743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7744w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0503u(B b5, p150o9.c cVar) {
        super(cVar);
        this.f7743v = b5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7742u = obj;
        this.f7744w |= Integer.MIN_VALUE;
        return B.f(this.f7743v, false, this);
    }
}
