package K0;

/* JADX INFO: renamed from: K0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0360o extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0360o f5135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0360o f5136t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0360o f5137u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0360o f5138v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5139r;

    static {
        int i10 = 1;
        f5135s = new C0360o(i10, 0);
        f5136t = new C0360o(i10, 1);
        f5137u = new C0360o(i10, 2);
        f5138v = new C0360o(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0360o(int i10, int i11) {
        super(i10);
        this.f5139r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f5139r) {
            case 0:
                return p110k9.y.f19095a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(P.d(obj));
        }
    }
}
