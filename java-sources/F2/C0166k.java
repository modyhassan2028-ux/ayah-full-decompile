package F2;

/* JADX INFO: renamed from: F2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0166k extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p248z6.c f2290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2291t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166k(p248z6.c cVar, q9.c cVar2) {
        super(cVar2);
        this.f2290s = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2289r = obj;
        this.f2291t |= Integer.MIN_VALUE;
        this.f2290s.C(null, this);
        return p161p9.a.f21156r;
    }
}
