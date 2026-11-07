package W;

import Z.C0672b;
import Z.C0690k;
import Z.C0695m0;
import Z.C0698o;
import Z.C0699o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {
    static {
        new Z.Q(C0564h0.f9154x);
    }

    public static final void a(C0560g0 c0560g0, Z0 z10, G2 g10, p074h0.d dVar, C0698o c0698o, int i10) {
        c0698o.V(-2127166334);
        if (((i10 | 146) & 1171) == 1170 && c0698o.x()) {
            c0698o.N();
        } else {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
                z10 = (Z0) c0698o.k(AbstractC0537a1.f8962a);
                g10 = (G2) c0698o.k(H2.f8580a);
            } else {
                c0698o.N();
            }
            c0698o.q();
            p232y.J jC = W0.c(false, 0.0f, c0698o, 0, 7);
            long j = c0560g0.f9112a;
            boolean zF = c0698o.f(j);
            Object objH = c0698o.H();
            if (zF || objH == C0690k.f10683a) {
                objH = new O.U(j, p180s0.q.b(j, 0.4f));
                c0698o.e0(objH);
            }
            C0672b.b(new C0695m0[]{AbstractC0568i0.f9172a.a(c0560g0), androidx.compose.foundation.f.f11784a.a(jC), V.k.f8354a.a(C0571j0.f9190a), AbstractC0537a1.f8962a.a(z10), O.V.f6342a.a((O.U) objH), H2.f8580a.a(g10)}, p074h0.j.d(-1066563262, new A.K(10, g10, dVar), c0698o), c0698o, 56);
        }
        C0560g0 c0560g1 = c0560g0;
        Z0 z11 = z10;
        G2 g11 = g10;
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G.E(c0560g1, z11, g11, dVar, i10, 1);
        }
    }
}
