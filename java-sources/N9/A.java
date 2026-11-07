package N9;

/* JADX INFO: loaded from: classes.dex */
public final class A extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H2.i f6071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6072t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(H2.i iVar, p150o9.c cVar) {
        super(cVar);
        this.f6071s = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6070r = obj;
        this.f6072t |= Integer.MIN_VALUE;
        return this.f6071s.b(null, this);
    }
}
