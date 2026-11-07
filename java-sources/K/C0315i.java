package K;

/* JADX INFO: renamed from: K.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0315i extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0315i f4646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0315i f4647t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0315i f4648u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4649r;

    static {
        int i10 = 0;
        f4646s = new C0315i(i10, 0);
        f4647t = new C0315i(i10, 1);
        f4648u = new C0315i(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0315i(int i10, int i11) {
        super(i10);
        this.f4649r = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f4649r) {
            case 0:
                return new p180s0.q(p180s0.F.c(1308617531));
            case 1:
                return new p063g1.j(0L);
            default:
                return new p063g1.j(0L);
        }
    }
}
