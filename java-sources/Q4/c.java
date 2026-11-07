package Q4;

import K9.AbstractC0405x;
import N9.U;
import N9.k0;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import com.ayah.feature.infolist.ui.wrapper.compose.SuraListWrapper;
import com.google.android.gms.internal.measurement.B1;
import p074h0.j;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuraListWrapper f6864s;

    public /* synthetic */ c(SuraListWrapper suraListWrapper, int i10) {
        this.f6863r = i10;
        this.f6864s = suraListWrapper;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6863r;
        int i11 = 2;
        p150o9.c cVar = null;
        int i12 = 3;
        y yVar = y.f19095a;
        SuraListWrapper suraListWrapper = this.f6864s;
        int i13 = 1;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i14 = SuraListWrapper.f13776u;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, j.d(-1500750425, new c(suraListWrapper, i13), c0698o), c0698o, 48);
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = SuraListWrapper.f13776u;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    U uB = suraListWrapper.getPresenter().b();
                    K4.d presenter = suraListWrapper.getPresenter();
                    H2.j jVar = new H2.j(presenter.b(), presenter.f5240d, new K4.c(i12, cVar, i13));
                    boolean zI = c0698o2.i(suraListWrapper);
                    Object objH = c0698o2.H();
                    S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        objH = new c(suraListWrapper, i11);
                        c0698o2.e0(objH);
                    }
                    e eVar = (e) objH;
                    boolean zI2 = c0698o2.i(suraListWrapper);
                    Object objH2 = c0698o2.H();
                    if (zI2 || objH2 == s10) {
                        objH2 = new c(suraListWrapper, i12);
                        c0698o2.e0(objH2);
                    }
                    B1.b(uB, jVar, eVar, (e) objH2, c0698o2, 0);
                }
                break;
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                int i16 = SuraListWrapper.f13776u;
                p218w3.c cVar2 = suraListWrapper.getPresenter().f5238b;
                AbstractC0405x.x(cVar2.f23655d, null, new p218w3.b(cVar2, iIntValue4, cVar, i13), 3);
                k0 k0Var = cVar2.f23656e;
                z3.d dVar = new z3.d(iIntValue3, iIntValue4);
                k0Var.getClass();
                k0Var.n(null, dVar);
                break;
            default:
                int iIntValue5 = ((Integer) obj).intValue();
                int iIntValue6 = ((Integer) obj2).intValue();
                int i17 = SuraListWrapper.f13776u;
                suraListWrapper.getPresenter().f5238b.a(iIntValue5, iIntValue6, null);
                break;
        }
        return yVar;
    }
}
