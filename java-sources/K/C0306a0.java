package K;

/* JADX INFO: renamed from: K.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0306a0 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f4586s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0306a0(g0 g0Var, int i10) {
        super(0);
        this.f4585r = i10;
        this.f4586s = g0Var;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f4585r) {
            case 0:
                this.f4586s.a();
                break;
            default:
                this.f4586s.onCancel();
                break;
        }
        return p110k9.y.f19095a;
    }
}
