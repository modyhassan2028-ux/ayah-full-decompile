package Z;

import K0.C0333a0;

/* JADX INFO: renamed from: Z.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0683g0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0333a0 f10669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p241y9.c f10670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10671t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0333a0 f10672u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10673v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0683g0(C0333a0 c0333a0, p150o9.c cVar) {
        super(cVar);
        this.f10672u = c0333a0;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f10671t = obj;
        this.f10673v |= Integer.MIN_VALUE;
        return this.f10672u.b0(null, this);
    }
}
