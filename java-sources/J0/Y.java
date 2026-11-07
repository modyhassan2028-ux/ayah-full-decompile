package J0;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z f4020s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(Z z10, int i10) {
        super(0);
        this.f4019r = i10;
        this.f4020s = z10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        H0.T placementScope;
        switch (this.f4019r) {
            case 0:
                Z z10 = this.f4020s;
                M m10 = z10.f4046w;
                m10.f3952i = 0;
                p011b0.e eVarZ = m10.f3945a.z();
                Object[] objArr = eVarZ.f13125r;
                int i10 = eVarZ.f13127t;
                for (int i11 = 0; i11 < i10; i11++) {
                    Z z11 = ((I) objArr[i11]).f3915X.f3958p;
                    z11.f4048y = z11.f4049z;
                    z11.f4049z = Integer.MAX_VALUE;
                    z11.f4032L = false;
                    if (z11.f4023C == G.f3890s) {
                        z11.f4023C = G.f3891t;
                    }
                }
                I i12 = m10.f3945a;
                I i13 = m10.f3945a;
                p011b0.e eVarZ2 = i12.z();
                Object[] objArr2 = eVarZ2.f13125r;
                int i14 = eVarZ2.f13127t;
                for (int i15 = 0; i15 < i14; i15++) {
                    ((I) objArr2[i15]).f3915X.f3958p.f4036P.f3937d = false;
                }
                z10.o().n0().d();
                p011b0.e eVarZ3 = i13.z();
                Object[] objArr3 = eVarZ3.f13125r;
                int i16 = eVarZ3.f13127t;
                for (int i17 = 0; i17 < i16; i17++) {
                    I i18 = (I) objArr3[i17];
                    M m11 = i18.f3915X;
                    if (m11.f3958p.f4048y != i18.v()) {
                        i13.N();
                        i13.C();
                        if (i18.v() == Integer.MAX_VALUE) {
                            if (m11.f3947c) {
                                V v10 = m11.f3959q;
                                p251z9.j.b(v10);
                                v10.h0(false);
                            }
                            m11.f3958p.j0();
                        }
                    }
                }
                p011b0.e eVarZ4 = i13.z();
                Object[] objArr4 = eVarZ4.f13125r;
                int i19 = eVarZ4.f13127t;
                for (int i20 = 0; i20 < i19; i20++) {
                    J j = ((I) objArr4[i20]).f3915X.f3958p.f4036P;
                    j.f3938e = j.f3937d;
                }
                break;
            case 1:
                Z z12 = this.f4020s;
                z12.f4046w.a().a(z12.T);
                break;
            default:
                Z z13 = this.f4020s;
                M m12 = z13.f4046w;
                j0 j0Var = m12.a().f4127E;
                if (j0Var == null || (placementScope = j0Var.f3971z) == null) {
                    placementScope = L.a(m12.f3945a).getPlacementScope();
                }
                p241y9.c cVar = z13.f4040Y;
                p205v0.b bVar = z13.f4041Z;
                if (bVar != null) {
                    j0 j0VarA = m12.a();
                    long j10 = z13.f4042a0;
                    float f3 = z13.f4043b0;
                    placementScope.getClass();
                    H0.T.a(placementScope, j0VarA);
                    j0VarA.V(p063g1.j.c(j10, j0VarA.f3172v), f3, bVar);
                } else if (cVar == null) {
                    j0 j0VarA2 = m12.a();
                    long j11 = z13.f4042a0;
                    float f7 = z13.f4043b0;
                    placementScope.getClass();
                    H0.T.a(placementScope, j0VarA2);
                    j0VarA2.Y(p063g1.j.c(j11, j0VarA2.f3172v), f7, null);
                } else {
                    j0 j0VarA3 = m12.a();
                    long j12 = z13.f4042a0;
                    float f10 = z13.f4043b0;
                    placementScope.getClass();
                    H0.T.a(placementScope, j0VarA3);
                    j0VarA3.Y(p063g1.j.c(j12, j0VarA3.f3172v), f10, cVar);
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
