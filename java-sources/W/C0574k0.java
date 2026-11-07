package W;

import Z.C0698o;

/* JADX INFO: renamed from: W.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0574k0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0574k0 f9200A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0574k0 f9201B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0574k0 f9202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0574k0 f9203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0574k0 f9204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0574k0 f9205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0574k0 f9206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0574k0 f9207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0574k0 f9208y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0574k0 f9209z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9210r;

    static {
        int i10 = 2;
        f9202s = new C0574k0(i10, 0);
        f9203t = new C0574k0(i10, 1);
        f9204u = new C0574k0(i10, 2);
        f9205v = new C0574k0(i10, 3);
        f9206w = new C0574k0(i10, 4);
        f9207x = new C0574k0(i10, 5);
        f9208y = new C0574k0(i10, 6);
        f9209z = new C0574k0(i10, 7);
        f9200A = new C0574k0(i10, 8);
        f9201B = new C0574k0(i10, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0574k0(int i10, int i11) {
        super(i10);
        this.f9210r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9210r;
        p110k9.y yVar = p110k9.y.f19095a;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
                    c0698o.N();
                }
                return yVar;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o2.x()) {
                    c0698o2.N();
                } else {
                    B.f8461a.a(null, 0.0f, 0.0f, null, 0L, c0698o2, 196608);
                }
                return yVar;
            case 2:
                C0698o c0698o3 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o3.x()) {
                    c0698o3.N();
                }
                return yVar;
            case 3:
                return ((C0561g1) obj2).b();
            case 4:
                return (I1) ((H1) obj2).f8579b.g.getValue();
            case 5:
                return Integer.valueOf(((H0.H) obj).d(((Number) obj2).intValue()));
            case 6:
                return Integer.valueOf(((H0.H) obj).N(((Number) obj2).intValue()));
            case 7:
                return Integer.valueOf(((H0.H) obj).P(((Number) obj2).intValue()));
            case 8:
                return Integer.valueOf(((H0.H) obj).H(((Number) obj2).intValue()));
            case 9:
                D2 d5 = (D2) obj2;
                return p120l9.l.S(new Object[]{Integer.valueOf(d5.f()), Integer.valueOf(d5.f8504e.g()), Boolean.valueOf(d5.f8500a)});
            default:
                C0698o c0698o4 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o4.x()) {
                    c0698o4.N();
                } else {
                    p074h0.d dVar = AbstractC0586o0.f9293a;
                    p251z9.j.b(null);
                    dVar.d(null, c0698o4, 0);
                }
                return yVar;
        }
    }
}
