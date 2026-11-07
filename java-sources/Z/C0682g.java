package Z;

/* JADX INFO: renamed from: Z.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0682g extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0682g f10666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0682g f10667t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10668r;

    static {
        int i10 = 2;
        f10666s = new C0682g(i10, 0);
        f10667t = new C0682g(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0682g(int i10, int i11) {
        super(i10);
        this.f10668r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10668r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
