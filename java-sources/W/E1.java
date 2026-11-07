package W;

/* JADX INFO: loaded from: classes.dex */
public final class E1 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H1 f8526r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f8527s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f8528t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(H1 h7, boolean z10, boolean z11) {
        super(2);
        this.f8526r = h7;
        this.f8527s = z10;
        this.f8528t = z11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        long j = ((p063g1.l) obj).f16260a;
        long j10 = ((p063g1.a) obj2).f16246a;
        D1 d1 = new D1((int) (j >> 32), this.f8527s, this.f8528t);
        X.u uVar = new X.u();
        d1.e(uVar);
        return new p110k9.j(new X.F(uVar.f9787a), (I1) this.f8526r.f8579b.f9781h.getValue());
    }
}
