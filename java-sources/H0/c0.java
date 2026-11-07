package H0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f3188s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i10) {
        super(2);
        this.f3187r = i10;
        this.f3188s = d0Var;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3187r) {
            case 0:
                this.f3188s.a().f3145s = (Z.r) obj2;
                break;
            case 1:
                E eA = this.f3188s.a();
                ((J0.I) obj).b0(new B(eA, (p241y9.e) obj2, eA.f3143G));
                break;
            default:
                J0.I i10 = (J0.I) obj;
                d0 d0Var = this.f3188s;
                M.k kVar = d0Var.f3189a;
                E e10 = i10.f3916Y;
                if (e10 == null) {
                    e10 = new E(i10, kVar);
                    i10.f3916Y = e10;
                }
                d0Var.f3190b = e10;
                d0Var.a().b();
                E eA2 = d0Var.a();
                if (eA2.f3146t != kVar) {
                    eA2.f3146t = kVar;
                    eA2.f(false);
                    J0.I.W(eA2.f3144r, false, 7);
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
