package G4;

import W.AbstractC0542b2;
import W.G2;
import W.H2;
import Z.C0698o;
import l0.o;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f2842s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2843t;

    public /* synthetic */ k(int i10, String str, String str2) {
        this.f2841r = i10;
        this.f2842s = str;
        this.f2843t = str2;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2841r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0542b2.b(this.f2842s + ": " + this.f2843t, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).k(), 0L, Y0.l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).g, c0698o, 196608, 0, 65498);
                } else {
                    c0698o.N();
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p015b4.f.a(this.f2842s, this.f2843t, androidx.compose.foundation.layout.b.l(o.f19333a, 16, 0.0f, 0.0f, 0.0f, 14), 1, c0698o2, 3456, 0);
                } else {
                    c0698o2.N();
                }
                break;
            default:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p015b4.f.i(432, 0, c0698o3, p074h0.j.d(1948641991, new N4.d(this.f2843t, 0), c0698o3), this.f2842s, androidx.compose.foundation.layout.b.l(o.f19333a, 16, 0.0f, 0.0f, 0.0f, 14));
                } else {
                    c0698o3.N();
                }
                break;
        }
        return y.f19095a;
    }
}
