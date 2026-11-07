package Y5;

import C4.g;
import W5.d;
import Z.C0690k;
import Z.C0698o;
import com.ayah.feature.starredlist.ui.wrapper.FavoritesListWrapper;
import p074h0.j;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FavoritesListWrapper f10436s;

    public /* synthetic */ a(FavoritesListWrapper favoritesListWrapper, int i10) {
        this.f10435r = i10;
        this.f10436s = favoritesListWrapper;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10435r;
        int i11 = 2;
        int i12 = 1;
        y yVar = y.f19095a;
        FavoritesListWrapper favoritesListWrapper = this.f10436s;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = FavoritesListWrapper.f13869u;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, j.d(1980776292, new a(favoritesListWrapper, i12), c0698o), c0698o, 48);
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = FavoritesListWrapper.f13869u;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    d presenter = favoritesListWrapper.getPresenter();
                    C4.e eVar = new C4.e(15, new C4.e(14, new g(presenter.f9640b.f22894b, presenter, 14)));
                    boolean zI = c0698o2.i(favoritesListWrapper);
                    Object objH = c0698o2.H();
                    if (zI || objH == C0690k.f10683a) {
                        objH = new a(favoritesListWrapper, i11);
                        c0698o2.e0(objH);
                    }
                    X5.a.b(eVar, (e) objH, c0698o2, 0);
                }
                break;
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                int i15 = FavoritesListWrapper.f13869u;
                favoritesListWrapper.getPresenter().f9641c.a(iIntValue3, iIntValue4, null);
                break;
        }
        return yVar;
    }
}
