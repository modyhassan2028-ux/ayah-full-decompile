package X4;

import A4.h;
import D.P;
import W.AbstractC0542b2;
import W.Q;
import W.S;
import W.V0;
import Z.C0690k;
import Z.C0698o;
import Z.X;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f9959s;

    public /* synthetic */ e(X x9, int i10) {
        this.f9958r = i10;
        this.f9959s = x9;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9958r;
        y yVar = y.f19095a;
        X x9 = this.f9959s;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    P p10 = S.f8804a;
                    Q qD = S.d(0L, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).l(), c0698o, 13);
                    Object objH = c0698o.H();
                    if (objH == C0690k.f10683a) {
                        objH = new h(x9, 8);
                        c0698o.e0(objH);
                    }
                    V0.k((p241y9.a) objH, null, false, null, qD, null, a.g, c0698o, 805306374, 494);
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    AbstractC0542b2.b(p000a.a.m0(((Number) x9.getValue()).intValue(), c0698o2), null, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o2, 0, 0, 131066);
                }
                break;
        }
        return yVar;
    }
}
