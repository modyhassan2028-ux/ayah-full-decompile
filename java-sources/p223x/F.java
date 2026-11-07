package p223x;

import A.C0029l;
import A.R0;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.S;
import Z.X;
import p011b0.e;
import p150o9.c;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23848a = new e(new D[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0681f0 f23849b = C0672b.r(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23850c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0681f0 f23851d = C0672b.r(Boolean.TRUE);

    public final void a(int i10, C0698o c0698o) {
        c0698o.V(-318043801);
        int i11 = (c0698o.i(this) ? 4 : 2) | i10;
        if (c0698o.K(i11 & 1, (i11 & 3) != 2)) {
            Object objH = c0698o.H();
            c cVar = null;
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.r(null);
                c0698o.e0(objH);
            }
            X x9 = (X) objH;
            if (((Boolean) this.f23851d.getValue()).booleanValue() || ((Boolean) this.f23849b.getValue()).booleanValue()) {
                c0698o.T(1719883733);
                boolean zI = c0698o.i(this);
                Object objH2 = c0698o.H();
                if (zI || objH2 == s10) {
                    objH2 = new C0029l(x9, this, cVar, 16);
                    c0698o.e0(objH2);
                }
                C0672b.f(c0698o, this, (p241y9.e) objH2);
                c0698o.p(false);
            } else {
                c0698o.T(1721270456);
                c0698o.p(false);
            }
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new R0(i10, 23, this);
        }
    }
}
