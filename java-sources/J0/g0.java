package J0;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f4088s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(j0 j0Var, int i10) {
        super(0);
        this.f4087r = i10;
        this.f4088s = j0Var;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f4087r) {
            case 0:
                j0 j0Var = this.f4088s;
                p180s0.o oVar = j0Var.S;
                p251z9.j.b(oVar);
                j0Var.x0(oVar, j0Var.R);
                break;
            default:
                j0 j0Var2 = this.f4088s.f4127E;
                if (j0Var2 != null) {
                    j0Var2.L0();
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
