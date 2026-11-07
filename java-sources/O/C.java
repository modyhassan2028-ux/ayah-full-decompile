package O;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C f6277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C f6278t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6279r;

    static {
        int i10 = 0;
        f6277s = new C(i10, 0);
        f6278t = new C(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i10, int i11) {
        super(i10);
        this.f6279r = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f6279r) {
            case 0:
                return null;
            default:
                return V.f6343b;
        }
    }
}
