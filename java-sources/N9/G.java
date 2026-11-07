package N9;

/* JADX INFO: loaded from: classes.dex */
public final class G extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B.f f6090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B.f f6093u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f6094v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6093u = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6091s = obj;
        this.f6092t |= Integer.MIN_VALUE;
        return this.f6093u.b(null, this);
    }
}
