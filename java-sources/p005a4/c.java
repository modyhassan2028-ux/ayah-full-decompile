package p005a4;

import W.F0;
import W.U0;
import W.W0;
import Z.C0672b;
import Z.C0698o;
import p074h0.d;
import p074h0.j;
import p110k9.y;
import p180s0.q;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f11183s;

    public /* synthetic */ c(d dVar, int i10) {
        this.f11182r = i10;
        this.f11183s = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11182r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    F0.a(null, null, null, j.d(-1414404605, new c(this.f11183s, 1), c0698o), c0698o, 3072);
                } else {
                    c0698o.N();
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0672b.a(W0.f8891b.a(new U0(((q) ((a) c0698o2.k(e.f11187a)).f11166e.getValue()).f21845a, new V.e(0.75f, 0.75f, 0.75f, 0.75f))), j.d(2082920771, new c(this.f11183s, 2), c0698o2), c0698o2, 56);
                } else {
                    c0698o2.N();
                }
                break;
            default:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    this.f11183s.invoke(c0698o3, 0);
                } else {
                    c0698o3.N();
                }
                break;
        }
        return y.f19095a;
    }
}
