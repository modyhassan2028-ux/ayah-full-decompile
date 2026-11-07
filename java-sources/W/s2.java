package W;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2 f9358s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(int i10, C2 c10) {
        super(0);
        this.f9357r = i10;
        this.f9358s = c10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f9357r) {
            case 0:
                this.f9358s.a(false);
                break;
            default:
                this.f9358s.a(true);
                break;
        }
        return p110k9.y.f19095a;
    }
}
