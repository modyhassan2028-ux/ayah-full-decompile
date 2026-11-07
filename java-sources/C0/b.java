package C0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f663t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, q9.c cVar) {
        super(cVar);
        this.f662s = dVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f661r = obj;
        this.f663t |= Integer.MIN_VALUE;
        return this.f662s.a(0L, 0L, this);
    }
}
