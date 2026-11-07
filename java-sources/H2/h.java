package H2;

import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0416i f3276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f3277u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, p150o9.c cVar) {
        super(cVar);
        this.f3277u = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3274r = obj;
        this.f3275s |= Integer.MIN_VALUE;
        return this.f3277u.b(null, this);
    }
}
