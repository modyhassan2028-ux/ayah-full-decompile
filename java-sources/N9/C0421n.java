package N9;

/* JADX INFO: renamed from: N9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0421n extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0422o f6224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f6225u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0416i f6226v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0421n(C0422o c0422o, p150o9.c cVar) {
        super(cVar);
        this.f6224t = c0422o;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6222r = obj;
        this.f6223s |= Integer.MIN_VALUE;
        return this.f6224t.d(null, this);
    }
}
