package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class q extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public A f3063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C f3064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f3065t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A f3066u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3067v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(A a9, q9.c cVar) {
        super(cVar);
        this.f3066u = a9;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3065t = obj;
        this.f3067v |= Integer.MIN_VALUE;
        return A.a(this.f3066u, null, this);
    }
}
