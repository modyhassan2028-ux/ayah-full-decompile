package W;

import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0709z;

/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.M0 f8890a = new Z.M0(C0564h0.f9156z);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0709z f8891b = new C0709z(C0564h0.f9155y);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0 f8892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X0 f8893d;

    static {
        long j = p180s0.q.g;
        f8892c = new X0(true, Float.NaN, j);
        f8893d = new X0(false, Float.NaN, j);
    }

    public static final X0 a(boolean z10, float f3, long j) {
        if (p063g1.f.a(f3, Float.NaN) && p180s0.q.c(j, p180s0.q.g)) {
            return z10 ? f8892c : f8893d;
        }
        return new X0(z10, f3, j);
    }

    public static X0 b(float f3) {
        return a(false, f3, p180s0.q.g);
    }

    public static final p232y.J c(boolean z10, float f3, C0698o c0698o, int i10, int i11) {
        p232y.J jA;
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f3 = Float.NaN;
        }
        long j = p180s0.q.g;
        c0698o.T(-1280632857);
        if (((Boolean) c0698o.k(f8890a)).booleanValue()) {
            p223x.u0 u0Var = V.h.f8352a;
            Z.X xU = C0672b.u(new p180s0.q(j), c0698o);
            boolean z12 = (((i10 & 14) ^ 6) > 4 && c0698o.h(z10)) || (i10 & 6) == 4;
            if ((((i10 & 112) ^ 48) <= 32 || !c0698o.d(f3)) && (i10 & 48) != 32) {
                z11 = false;
            }
            boolean z13 = z12 | z11;
            Object objH = c0698o.H();
            if (z13 || objH == C0690k.f10683a) {
                objH = new V.d(z10, f3, xU);
                c0698o.e0(objH);
            }
            jA = (V.d) objH;
        } else {
            jA = a(z10, f3, j);
        }
        c0698o.p(false);
        return jA;
    }
}
