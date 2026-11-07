package J0;

/* JADX INFO: loaded from: classes.dex */
public final class U extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ V f3985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r0 f3986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f3987t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v10, r0 r0Var, long j) {
        super(0);
        this.f3985r = v10;
        this.f3986s = r0Var;
        this.f3987t = j;
    }

    @Override // p241y9.a
    public final Object invoke() {
        Q qC0;
        M m10 = this.f3985r.f4004w;
        H0.T placementScope = null;
        if (AbstractC0283f.s(m10.f3945a) || m10.f3947c) {
            j0 j0Var = m10.a().f4127E;
            if (j0Var != null) {
                placementScope = j0Var.f3971z;
            }
        } else {
            j0 j0Var2 = m10.a().f4127E;
            if (j0Var2 != null && (qC0 = j0Var2.C0()) != null) {
                placementScope = qC0.f3971z;
            }
        }
        if (placementScope == null) {
            placementScope = this.f3986s.getPlacementScope();
        }
        Q qC1 = m10.a().C0();
        p251z9.j.b(qC1);
        H0.T.f(placementScope, qC1, this.f3987t);
        return p110k9.y.f19095a;
    }
}
