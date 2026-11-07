package K;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r0 f4726s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(r0 r0Var, int i10) {
        super(0);
        this.f4725r = i10;
        this.f4726s = r0Var;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f4725r) {
            case 0:
                return Boolean.valueOf(this.f4726s.f4766a.g() > 0.0f);
            default:
                r0 r0Var = this.f4726s;
                return Boolean.valueOf(r0Var.f4766a.g() < r0Var.f4767b.g());
        }
    }
}
