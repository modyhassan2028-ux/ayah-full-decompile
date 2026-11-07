package Z0;

/* JADX INFO: renamed from: Z0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711b extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0711b f10896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0711b f10897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0711b f10898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0711b f10899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0711b f10900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0711b f10901x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10902r;

    static {
        int i10 = 1;
        f10896s = new C0711b(i10, 0);
        f10897t = new C0711b(i10, 1);
        f10898u = new C0711b(i10, 2);
        f10899v = new C0711b(i10, 3);
        f10900w = new C0711b(i10, 4);
        f10901x = new C0711b(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0711b(int i10, int i11) {
        super(i10);
        this.f10902r = i11;
    }

    @Override // p241y9.c
    public final /* synthetic */ Object e(Object obj) {
        switch (this.f10902r) {
            case 0:
                float[] fArr = ((p180s0.A) obj).f21769a;
                break;
            case 1:
                float[] fArr2 = ((p180s0.A) obj).f21769a;
                break;
            case 2:
                break;
            case 3:
                int i10 = ((j) obj).f10928a;
                break;
            case 4:
                break;
            default:
                int i11 = ((j) obj).f10928a;
                break;
        }
        return p110k9.y.f19095a;
    }
}
