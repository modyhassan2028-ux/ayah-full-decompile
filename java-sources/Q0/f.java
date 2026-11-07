package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f6840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f6842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6843u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, q9.c cVar) {
        super(cVar);
        this.f6842t = gVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6841s = obj;
        this.f6843u |= Integer.MIN_VALUE;
        return this.f6842t.b(0.0f, this);
    }
}
