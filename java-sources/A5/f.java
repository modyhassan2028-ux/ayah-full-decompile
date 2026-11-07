package A5;

import D4.k;
import G4.n;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f551s;

    public /* synthetic */ f(int i10, p241y9.a aVar) {
        this.f550r = 0;
        this.f551s = aVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f550r) {
            case 0:
                ((Integer) obj2).getClass();
                e.b(this.f551s, (C0698o) obj, C0672b.y(7));
                break;
            case 1:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    V0.h(this.f551s, null, false, null, k.f1207c, c0698o, 196608, 30);
                } else {
                    c0698o.N();
                }
                break;
            case 2:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p241y9.a aVar = this.f551s;
                    boolean zG = c0698o2.g(aVar);
                    Object objH = c0698o2.H();
                    if (zG || objH == C0690k.f10683a) {
                        objH = new c(3, aVar);
                        c0698o2.e0(objH);
                    }
                    V0.h((p241y9.a) objH, null, false, null, n.f2859e, c0698o2, 196608, 30);
                } else {
                    c0698o2.N();
                }
                break;
            case 3:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p241y9.a aVar2 = this.f551s;
                    boolean zG2 = c0698o3.g(aVar2);
                    Object objH2 = c0698o3.H();
                    if (zG2 || objH2 == C0690k.f10683a) {
                        objH2 = new c(6, aVar2);
                        c0698o3.e0(objH2);
                    }
                    V0.h((p241y9.a) objH2, null, false, null, U5.a.f8193b, c0698o3, 196608, 30);
                } else {
                    c0698o3.N();
                }
                break;
            case 4:
                C0698o c0698o4 = (C0698o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c0698o4.K(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p241y9.a aVar3 = this.f551s;
                    boolean zG3 = c0698o4.g(aVar3);
                    Object objH3 = c0698o4.H();
                    if (zG3 || objH3 == C0690k.f10683a) {
                        objH3 = new c(11, aVar3);
                        c0698o4.e0(objH3);
                    }
                    V0.h((p241y9.a) objH3, null, false, null, X4.a.f9945d, c0698o4, 196608, 30);
                } else {
                    c0698o4.N();
                }
                break;
            case 5:
                C0698o c0698o5 = (C0698o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c0698o5.K(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    V0.k(this.f551s, null, false, null, null, null, p015b4.f.f13263a, c0698o5, 805306368, 510);
                } else {
                    c0698o5.N();
                }
                break;
            case 6:
                C0698o c0698o6 = (C0698o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c0698o6.K(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    V0.k(this.f551s, null, false, null, null, null, p015b4.f.f13264b, c0698o6, 805306368, 510);
                } else {
                    c0698o6.N();
                }
                break;
            case 7:
                C0698o c0698o7 = (C0698o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c0698o7.K(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    V0.h(this.f551s, null, false, null, p026c5.b.f13466b, c0698o7, 196608, 30);
                } else {
                    c0698o7.N();
                }
                break;
            default:
                C0698o c0698o8 = (C0698o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c0698o8.K(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    V0.h(this.f551s, null, false, null, p067g5.a.f16294b, c0698o8, 196608, 30);
                } else {
                    c0698o8.N();
                }
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ f(p241y9.a aVar, int i10, byte b5) {
        this.f550r = i10;
        this.f551s = aVar;
    }
}
