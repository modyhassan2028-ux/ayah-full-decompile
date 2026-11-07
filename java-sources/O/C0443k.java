package O;

/* JADX INFO: renamed from: O.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0443k implements p104k1.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.e f6380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0444l f6381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6382c = 0;

    public C0443k(l0.e eVar, InterfaceC0444l interfaceC0444l) {
        this.f6380a = eVar;
        this.f6381b = interfaceC0444l;
    }

    @Override // p104k1.s
    public final long a(p063g1.k kVar, long j, p063g1.m mVar, long j10) {
        long jA = this.f6381b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f6382c;
        }
        this.f6382c = jA;
        return p063g1.j.c(p063g1.j.c(kVar.c(), va.g.L(jA)), this.f6380a.a(j10, 0L, mVar));
    }
}
