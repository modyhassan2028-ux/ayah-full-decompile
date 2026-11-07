package N4;

import F9.n;
import U0.L;
import W.AbstractC0542b2;
import W.G2;
import W.H2;
import Y0.l;
import Z.C0698o;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f6029s;

    public /* synthetic */ d(String str, int i10) {
        this.f6028r = i10;
        this.f6029s = str;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6028r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long jK = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).k();
                    L l10 = ((G2) c0698o.k(H2.f8580a)).g;
                    AbstractC0542b2.b(this.f6029s, null, jK, n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, l10, c0698o, 199680, 0, 65490);
                } else {
                    c0698o.N();
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC0542b2.b(this.f6029s, null, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o2, 0, 0, 131066);
                } else {
                    c0698o2.N();
                }
                break;
            default:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC0542b2.b(this.f6029s, null, ((p005a4.a) c0698o3.k(p005a4.e.f11187a)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o3, 0, 0, 131066);
                } else {
                    c0698o3.N();
                }
                break;
        }
        return y.f19095a;
    }
}
