package N9;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.g f6240t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C4.g f6241u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0416i f6242v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C4.g gVar, p150o9.c cVar) {
        super(cVar);
        this.f6240t = gVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6238r = obj;
        this.f6239s |= Integer.MIN_VALUE;
        return this.f6240t.d(null, this);
    }
}
