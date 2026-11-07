package C4;

import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.f f739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p165q3.a f741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f742w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f739t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f737r = obj;
        this.f738s |= Integer.MIN_VALUE;
        return this.f739t.b(null, this);
    }
}
