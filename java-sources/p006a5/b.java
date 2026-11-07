package p006a5;

import F9.n;
import U0.C0515g;
import U0.L;
import W.AbstractC0542b2;
import W.G2;
import W.H2;
import Y0.l;
import Z.C0698o;
import androidx.compose.foundation.layout.c;
import l0.r;
import p005a4.a;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0515g f11192s;

    public /* synthetic */ b(C0515g c0515g, int i10) {
        this.f11191r = i10;
        this.f11192s = c0515g;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11191r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0542b2.c(this.f11192s, androidx.compose.foundation.layout.b.h(c.f11826a, 15), ((a) c0698o.k(p005a4.e.f11187a)).k(), 0L, l.f10362w, 0L, 0L, 0, false, 0, 0, null, null, ((G2) c0698o.k(H2.f8580a)).f8563h, c0698o, 196656, 131032);
                } else {
                    c0698o.N();
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r rVarH = androidx.compose.foundation.layout.b.h(c.f11826a, 15);
                    L l10 = ((G2) c0698o2.k(H2.f8580a)).f8563h;
                    AbstractC0542b2.c(this.f11192s, rVarH, ((a) c0698o2.k(p005a4.e.f11187a)).k(), n.B(17), l.f10359t, 0L, 0L, 0, false, 0, 0, null, null, l10, c0698o2, 199728, 131024);
                } else {
                    c0698o2.N();
                }
                break;
        }
        return y.f19095a;
    }
}
