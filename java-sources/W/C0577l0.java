package W;

import Z.C0698o;
import com.ayah.R;

/* JADX INFO: renamed from: W.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0577l0 extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0577l0 f9227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0577l0 f9228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0577l0 f9229u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0577l0 f9230v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0577l0 f9231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0577l0 f9232x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9233r;

    static {
        int i10 = 3;
        f9227s = new C0577l0(i10, 0);
        f9228t = new C0577l0(i10, 1);
        f9229u = new C0577l0(i10, 2);
        f9230v = new C0577l0(i10, 3);
        f9231w = new C0577l0(i10, 4);
        f9232x = new C0577l0(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0577l0(int i10, int i11) {
        super(i10);
        this.f9233r = i11;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f9233r) {
            case 0:
                C0698o c0698o = (C0698o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0698o.x()) {
                    c0698o.N();
                }
                return p110k9.y.f19095a;
            case 1:
                C0610w1 c0610w1 = (C0610w1) obj;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0698o2.g(c0610w1) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0698o2.x()) {
                    c0698o2.N();
                } else {
                    V0.j(c0610w1, null, null, c0698o2, iIntValue & 14);
                }
                return p110k9.y.f19095a;
            case 2:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C0698o c0698o3 = (C0698o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0698o3.g(null) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c0698o3.x()) {
                    c0698o3.N();
                } else {
                    AbstractC0616y1.a(iIntValue2 & 14, c0698o3);
                }
                return p110k9.y.f19095a;
            case 3:
                C0698o c0698o4 = (C0698o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0698o4.x()) {
                    c0698o4.N();
                } else {
                    AbstractC0542b2.b(X.t.c(R.string.m3c_time_picker_am, c0698o4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o4, 0, 0, 131070);
                }
                return p110k9.y.f19095a;
            case 4:
                C0698o c0698o5 = (C0698o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0698o5.x()) {
                    c0698o5.N();
                } else {
                    AbstractC0542b2.b(X.t.c(R.string.m3c_time_picker_pm, c0698o5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o5, 0, 0, 131070);
                }
                return p110k9.y.f19095a;
            default:
                H0.K k7 = (H0.K) obj;
                long j = ((p063g1.a) obj3).f16246a;
                int iE = k7.E(T0.f8822a);
                int i10 = iE * 2;
                H0.U uA = ((H0.H) obj2).a(p063g1.b.i(0, i10, j));
                return k7.g0(uA.f3168r, uA.f3169s - i10, p120l9.s.f19441r, new Q0(iE, 0, uA));
        }
    }
}
