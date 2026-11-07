package H3;

import H2.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f3345t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, p150o9.c cVar) {
        super(cVar);
        this.f3345t = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3343r = obj;
        this.f3344s |= Integer.MIN_VALUE;
        return this.f3345t.b(null, this);
    }
}
