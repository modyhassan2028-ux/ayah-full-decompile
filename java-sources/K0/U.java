package K0;

/* JADX INFO: loaded from: classes.dex */
public final class U extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ V f5014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5015t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v10, q9.c cVar) {
        super(cVar);
        this.f5014s = v10;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f5013r = obj;
        this.f5015t |= Integer.MIN_VALUE;
        this.f5014s.a(null, this);
        return p161p9.a.f21156r;
    }
}
