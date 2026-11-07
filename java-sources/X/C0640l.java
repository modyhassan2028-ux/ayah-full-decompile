package X;

/* JADX INFO: renamed from: X.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0640l extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public H2.i f9751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f9752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f9753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H2.i f9754u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9755v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640l(H2.i iVar, p150o9.c cVar) {
        super(cVar);
        this.f9754u = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f9753t = obj;
        this.f9755v |= Integer.MIN_VALUE;
        return this.f9754u.b(null, this);
    }
}
