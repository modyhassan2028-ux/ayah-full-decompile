package Q4;

import K9.AbstractC0405x;
import N9.U;
import N9.k0;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import com.ayah.feature.infolist.ui.wrapper.compose.QuarterListWrapper;
import com.google.android.gms.internal.measurement.B1;
import p074h0.j;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ QuarterListWrapper f6862s;

    public /* synthetic */ a(QuarterListWrapper quarterListWrapper, int i10) {
        this.f6861r = i10;
        this.f6862s = quarterListWrapper;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6861r;
        int i11 = 0;
        int i12 = 2;
        p150o9.c cVar = null;
        int i13 = 3;
        int i14 = 1;
        y yVar = y.f19095a;
        QuarterListWrapper quarterListWrapper = this.f6862s;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = QuarterListWrapper.f13774u;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, j.d(1380620225, new a(quarterListWrapper, i14), c0698o), c0698o, 48);
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = QuarterListWrapper.f13774u;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    U uA = quarterListWrapper.getPresenter().a();
                    K4.d presenter = quarterListWrapper.getPresenter();
                    H2.j jVar = new H2.j(presenter.a(), presenter.f5240d, new K4.c(i13, cVar, i11));
                    boolean zI = c0698o2.i(quarterListWrapper);
                    Object objH = c0698o2.H();
                    S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        objH = new a(quarterListWrapper, i12);
                        c0698o2.e0(objH);
                    }
                    e eVar = (e) objH;
                    boolean zI2 = c0698o2.i(quarterListWrapper);
                    Object objH2 = c0698o2.H();
                    if (zI2 || objH2 == s10) {
                        objH2 = new a(quarterListWrapper, i13);
                        c0698o2.e0(objH2);
                    }
                    B1.b(uA, jVar, eVar, (e) objH2, c0698o2, 0);
                }
                break;
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                int i17 = QuarterListWrapper.f13774u;
                p218w3.c cVar2 = quarterListWrapper.getPresenter().f5238b;
                AbstractC0405x.x(cVar2.f23655d, null, new p218w3.b(cVar2, iIntValue4, cVar, i14), 3);
                k0 k0Var = cVar2.f23656e;
                z3.d dVar = new z3.d(iIntValue3, iIntValue4);
                k0Var.getClass();
                k0Var.n(null, dVar);
                break;
            default:
                int iIntValue5 = ((Integer) obj).intValue();
                int iIntValue6 = ((Integer) obj2).intValue();
                int i18 = QuarterListWrapper.f13774u;
                quarterListWrapper.getPresenter().f5238b.a(iIntValue5, iIntValue6, null);
                break;
        }
        return yVar;
    }
}
