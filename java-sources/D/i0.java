package D;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j0 f983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0.U f985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H0.K f987v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, int i10, H0.U u8, int i11, H0.K k7) {
        super(1);
        this.f983r = j0Var;
        this.f984s = i10;
        this.f985t = u8;
        this.f986u = i11;
        this.f987v = k7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [y9.e, z9.k] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        ?? r10 = this.f983r.f991G;
        H0.U u8 = this.f985t;
        H0.T.f((H0.T) obj, u8, ((p063g1.j) r10.invoke(new p063g1.l((((long) (this.f984s - u8.f3168r)) << 32) | (((long) (this.f986u - u8.f3169s)) & 4294967295L)), this.f987v.getLayoutDirection())).f16254a);
        return p110k9.y.f19095a;
    }
}
