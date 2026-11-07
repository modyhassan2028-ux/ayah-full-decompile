package W;

import Z.C0698o;
import Z.C0699o0;

/* JADX INFO: renamed from: W.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0616y1 {
    public static final void a(int i10, C0698o c0698o) {
        int i11;
        c0698o.V(274621471);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 432;
        if ((i10 & 3072) == 0) {
            i12 = i11 | 1456;
        }
        if ((i10 & 24576) == 0) {
            i12 |= 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= 33554432;
        }
        if ((38347923 & i12) == 38347922 && c0698o.x()) {
            c0698o.N();
            C0699o0 c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0613x1(i10);
                return;
            }
            return;
        }
        c0698o.P();
        if ((i10 & 1) == 0 || c0698o.w()) {
            AbstractC0537a1.a(Y.p.f10224a, c0698o);
            AbstractC0568i0.d(6, c0698o);
            AbstractC0568i0.d(Y.p.f10226c, c0698o);
            AbstractC0568i0.d(5, c0698o);
            AbstractC0568i0.d(5, c0698o);
            AbstractC0568i0.d(Y.p.f10225b, c0698o);
        } else {
            c0698o.N();
        }
        c0698o.q();
        throw null;
    }
}
