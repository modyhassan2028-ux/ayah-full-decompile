package K0;

/* JADX INFO: renamed from: K0.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0382z0 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0382z0 f5212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0382z0 f5213t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5214r;

    static {
        int i10 = 0;
        f5212s = new C0382z0(i10, 0);
        f5213t = new C0382z0(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0382z0(int i10, int i11) {
        super(i10);
        this.f5214r = i11;
    }

    @Override // p241y9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f5214r) {
            case 0:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
