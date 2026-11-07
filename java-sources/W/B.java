package W;

import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f8461a = new B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8463c;

    static {
        float f3 = Y.n.f10216a;
        f8462b = Y.n.f10218c;
        f8463c = 640;
    }

    public final void a(l0.r rVar, float f3, float f7, p180s0.J j, long j10, C0698o c0698o, int i10) {
        float f10;
        float f11;
        p180s0.J j11;
        long jD;
        l0.r rVar2;
        p180s0.J j12;
        long j13;
        l0.r rVar3;
        float f12;
        float f13;
        c0698o.V(-1364277227);
        if (((i10 | 9654) & 9363) == 9362 && c0698o.x()) {
            c0698o.N();
            rVar3 = rVar;
            f12 = f3;
            f13 = f7;
            j12 = j;
            j13 = j10;
        } else {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                float f14 = Y.n.f10217b;
                float f15 = Y.n.f10216a;
                J.d dVar = ((Z0) c0698o.k(AbstractC0537a1.f8962a)).f8938e;
                f10 = f14;
                f11 = f15;
                j11 = dVar;
                jD = AbstractC0568i0.d(19, c0698o);
                rVar2 = l0.o.f19333a;
            } else {
                c0698o.N();
                rVar2 = rVar;
                f10 = f3;
                f11 = f7;
                j11 = j;
                jD = j10;
            }
            c0698o.q();
            String strC = X.t.c(R.string.m3c_bottom_sheet_drag_handle_description, c0698o);
            l0.r rVarJ = androidx.compose.foundation.layout.b.j(rVar2, 0.0f, AbstractC0549d1.f9025a, 1);
            boolean zG = c0698o.g(strC);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                objH = new R0.n(strC, 2);
                c0698o.e0(objH);
            }
            C1.a(R0.m.a(rVarJ, false, (p241y9.c) objH), j11, jD, 0L, 0.0f, 0.0f, null, p074h0.j.d(-1039573072, new C0617z(f10, f11), c0698o), c0698o, 12582912, 120);
            j12 = j11;
            j13 = jD;
            rVar3 = rVar2;
            f12 = f10;
            f13 = f11;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A(this, rVar3, f12, f13, j12, j13, i10);
        }
    }
}
