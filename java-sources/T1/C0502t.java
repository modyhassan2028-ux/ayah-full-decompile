package T1;

/* JADX INFO: renamed from: T1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0502t extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B f7734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7736t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f7737u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7738v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502t(B b5, q9.c cVar) {
        super(cVar);
        this.f7737u = b5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7736t = obj;
        this.f7738v |= Integer.MIN_VALUE;
        return this.f7737u.i(this);
    }
}
