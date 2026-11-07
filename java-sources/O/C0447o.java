package O;

/* JADX INFO: renamed from: O.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0447o implements InterfaceC0441i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0447o f6389b = new C0447o(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0447o f6390c = new C0447o(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J1.c f6391d = new J1.c(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final J1.c f6392e = new J1.c(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J1.c f6393f = new J1.c(17);
    public static final J1.c g = new J1.c(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6394a;

    public /* synthetic */ C0447o(int i10) {
        this.f6394a = i10;
    }

    @Override // O.InterfaceC0441i
    public long a(int i10, E2.A a9) {
        switch (this.f6394a) {
            case 0:
                String str = ((U0.I) a9.f1437e).f8023a.f8015a.f8060s;
                return va.g.e(K.T.t(str, i10), K.T.s(str, i10));
            default:
                return ((U0.I) a9.f1437e).i(i10);
        }
    }
}
