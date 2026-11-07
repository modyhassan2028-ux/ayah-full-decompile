package A;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f90r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ T f91s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(T t2, int i10) {
        super(0);
        this.f90r = i10;
        this.f91s = t2;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f90r) {
            case 0:
                M9.e eVar = this.f91s.f145L;
                if (eVar != null) {
                    eVar.k(C0044t.f415a);
                }
                return p110k9.y.f19095a;
            default:
                return Boolean.valueOf(!this.f91s.F0());
        }
    }
}
