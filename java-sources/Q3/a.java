package Q3;

import A.C0039q;
import H9.o;
import K9.AbstractC0405x;
import N9.k0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.X;
import com.ayah.common.ui.bookmarklist.view.wrapper.BookmarkListWrapper;
import p074h0.j;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BookmarkListWrapper f6854s;

    public /* synthetic */ a(BookmarkListWrapper bookmarkListWrapper, int i10) {
        this.f6853r = i10;
        this.f6854s = bookmarkListWrapper;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6853r;
        y yVar = y.f19095a;
        BookmarkListWrapper bookmarkListWrapper = this.f6854s;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i11 = BookmarkListWrapper.f13703v;
                int i12 = 0;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    k0 k0Var = bookmarkListWrapper.getDrawerVisibilityModel().f13462c;
                    Boolean bool = Boolean.FALSE;
                    X xK = C0672b.k(k0Var, bool, null, c0698o, 48, 2);
                    Object objH = c0698o.H();
                    if (objH == C0690k.f10683a) {
                        objH = C0672b.r(bool);
                        c0698o.e0(objH);
                    }
                    X x9 = (X) objH;
                    boolean zBooleanValue = ((Boolean) x9.getValue()).booleanValue();
                    if (!((Boolean) xK.getValue()).booleanValue()) {
                        x9.setValue(bool);
                    }
                    p005a4.e.a(false, j.d(795754071, new b(zBooleanValue, bookmarkListWrapper, x9, i12), c0698o), c0698o, 48);
                }
                break;
            default:
                M3.a aVar = (M3.a) obj;
                String str = (String) obj2;
                int i13 = BookmarkListWrapper.f13703v;
                p251z9.j.e(aVar, "bookmarkColor");
                p251z9.j.e(str, "bookmarkName");
                p150o9.c cVar = null;
                if (o.e1(str) || str.equals(bookmarkListWrapper.getContext().getString(aVar.f5685v)) || str.equals(bookmarkListWrapper.getContext().getString(aVar.f5684u))) {
                    O3.d presenter = bookmarkListWrapper.getPresenter();
                    presenter.getClass();
                    AbstractC0405x.x(presenter.f6472d, null, new C0039q(presenter, aVar, "", cVar, 18), 3);
                } else {
                    O3.d presenter2 = bookmarkListWrapper.getPresenter();
                    presenter2.getClass();
                    AbstractC0405x.x(presenter2.f6472d, null, new C0039q(presenter2, aVar, str, cVar, 18), 3);
                }
                break;
        }
        return yVar;
    }
}
