package K;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f4582s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(g0 g0Var, int i10) {
        super(1);
        this.f4581r = i10;
        this.f4582s = g0Var;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f4581r) {
            case 0:
                this.f4582s.c(((p171r0.c) obj).f21387a);
                break;
            default:
                D0.v vVar = (D0.v) obj;
                this.f4582s.e(D0.u.g(vVar, false));
                vVar.a();
                break;
        }
        return p110k9.y.f19095a;
    }
}
