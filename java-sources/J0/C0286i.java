package J0;

/* JADX INFO: renamed from: J0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0286i extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0286i f4103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0286i f4104t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4105r;

    static {
        int i10 = 0;
        f4103s = new C0286i(i10, 0);
        f4104t = new C0286i(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0286i(int i10, int i11) {
        super(i10);
        this.f4105r = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f4105r) {
            case 0:
                return new I(2);
            default:
                return new I(3);
        }
    }
}
