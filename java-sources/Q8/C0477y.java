package Q8;

/* JADX INFO: renamed from: Q8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0477y extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f7061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0470q f7063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7064u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0477y(C0470q c0470q, q9.c cVar) {
        super(cVar);
        this.f7063t = c0470q;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7062s = obj;
        this.f7064u |= Integer.MIN_VALUE;
        return this.f7063t.a(null, this);
    }
}
