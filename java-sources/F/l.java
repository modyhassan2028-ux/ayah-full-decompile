package F;

import G.F;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f2061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f2062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2064u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(F f3, long j, int i10, int i11) {
        super(3);
        this.f2061r = f3;
        this.f2062s = j;
        this.f2063t = i10;
        this.f2064u = i11;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int i10 = iIntValue + this.f2063t;
        long j = this.f2062s;
        int iG = p063g1.b.g(j, i10);
        int iF = p063g1.b.f(j, iIntValue2 + this.f2064u);
        return this.f2061r.f2583s.g0(iG, iF, p120l9.s.f19441r, (p241y9.c) obj3);
    }
}
