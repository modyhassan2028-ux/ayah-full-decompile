package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class t extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public A f3075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f3076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f3077t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S9.a f3078u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3079v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ A f3080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3081x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(A a9, q9.c cVar) {
        super(cVar);
        this.f3080w = a9;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3079v = obj;
        this.f3081x |= Integer.MIN_VALUE;
        return A.b(this.f3080w, null, null, this);
    }
}
