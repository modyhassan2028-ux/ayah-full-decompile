package A;

/* JADX INFO: loaded from: classes.dex */
public final class O extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public T f102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T f104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f105u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(T t2, q9.c cVar) {
        super(cVar);
        this.f104t = t2;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f103s = obj;
        this.f105u |= Integer.MIN_VALUE;
        return T.y0(this.f104t, this);
    }
}
