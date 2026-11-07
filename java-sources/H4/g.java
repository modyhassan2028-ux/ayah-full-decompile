package H4;

import A4.i;
import D.AbstractC0066i;
import D.C0076t;
import D.C0077u;
import D.U;
import D.W;
import D.X;
import E4.t;
import F.C0153b;
import F9.n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.InterfaceC0402u;
import W.AbstractC0542b2;
import W.C0;
import W.EnumC0565h1;
import W.G2;
import W.H2;
import W.P;
import X.C0641m;
import Y0.l;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.feature.library.edit.view.EditLibraryComposePage;
import com.ayah.feature.library.view.LibraryComposePage;
import com.ayah.feature.today.ui.wrapper.TodayPage;
import i7.B;
import j$.time.LocalDate;
import j$.time.chrono.HijrahDate;
import java.text.NumberFormat;
import l0.o;
import p110k9.y;
import p180s0.F;
import p214w.r;
import p251z9.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3385t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3386u;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.f3383r = i10;
        this.f3384s = obj;
        this.f3385t = obj2;
        this.f3386u = obj3;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        boolean z10;
        TodayPage todayPage;
        int i10 = this.f3383r;
        int i11 = 14;
        B b5 = F.f21774a;
        int i12 = 3;
        S s10 = C0690k.f10683a;
        p150o9.c cVar = null;
        y yVar = y.f19095a;
        Object obj4 = this.f3386u;
        Object obj5 = this.f3385t;
        Object obj6 = this.f3384s;
        switch (i10) {
            case 0:
                t tVar = (t) obj6;
                NumberFormat numberFormat = (NumberFormat) obj5;
                p241y9.c cVar2 = (p241y9.c) obj4;
                C0698o c0698o = (C0698o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j.e((C0153b) obj, "$this$item");
                if (!c0698o.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c0698o.N();
                } else {
                    p015b4.f.f(390, 2, c0698o, p074h0.j.d(599812443, new A4.a(tVar, numberFormat, cVar2, i12), c0698o), null, androidx.compose.foundation.layout.b.l(o.f19333a, 0.0f, 0.0f, 0.0f, 8, 7));
                }
                break;
            case 1:
                ((Integer) obj3).getClass();
                j.e((r) obj, "$this$AnimatedVisibility");
                P3.e.a((String) obj6, ((N3.b) obj5).f6006f, (p241y9.e) obj4, null, (C0698o) obj2, 0);
                break;
            case 2:
                ((Integer) obj3).getClass();
                j.e((r) obj, "$this$AnimatedVisibility");
                P3.e.a((String) obj6, ((N3.c) obj5).f6008b, (p241y9.e) obj4, null, (C0698o) obj2, 0);
                break;
            case 3:
                p241y9.a aVar = (p241y9.a) obj6;
                l0.r rVar = (l0.r) obj5;
                BookType bookType = (BookType) obj4;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j.e((X) obj, "$this$SwipeToDismissBox");
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c0698o2.N();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
                    M0 m10 = p005a4.e.f11187a;
                    l0.r rVarI = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.c(androidx.compose.foundation.a.a(fillElement, ((p005a4.a) c0698o2.k(m10)).g(), b5), false, null, aVar, 7), 0, 8);
                    W wA = U.a(AbstractC0066i.f977a, l0.c.f19307B, c0698o2, 48);
                    int i13 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    l0.r rVarC = l0.a.c(c0698o2, rVarI);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0285h c0285h = C0287j.f4119f;
                    C0672b.v(c0698o2, wA, c0285h);
                    C0285h c0285h2 = C0287j.f4118e;
                    C0672b.v(c0698o2, interfaceC0687i0M, c0285h2);
                    C0285h c0285h3 = C0287j.g;
                    if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i13))) {
                        p123m2.c.y(i13, c0698o2, i13, c0285h3);
                    }
                    C0285h c0285h4 = C0287j.f4117d;
                    C0672b.v(c0698o2, rVarC, c0285h4);
                    float f3 = 16;
                    float f7 = 24;
                    C0.a(n.M(2131230930, c0698o2), p000a.a.m0(R.string.remove, c0698o2), androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.b.h(o.f19333a, f3), f7), ((p005a4.a) c0698o2.k(m10)).f(), c0698o2, 384, 0);
                    if (1.0f <= 0.0d) {
                        E.a.a("invalid weight; must be greater than zero");
                    }
                    l0.r rVarJ = androidx.compose.foundation.layout.b.j(new LayoutWeightElement(1.0f, true), f3, 0.0f, 2);
                    C0076t c0076tA = D.r.a(AbstractC0066i.f981e, l0.c.f19309D, c0698o2, 6);
                    int i14 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
                    l0.r rVarC2 = l0.a.c(c0698o2, rVarJ);
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0672b.v(c0698o2, c0076tA, c0285h);
                    C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
                    if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i14))) {
                        p123m2.c.y(i14, c0698o2, i14, c0285h3);
                    }
                    C0672b.v(c0698o2, rVarC2, c0285h4);
                    String str = bookType.f13687c;
                    long jK = ((p005a4.a) c0698o2.k(m10)).k();
                    long jB = n.B(16);
                    l lVar = l.f10362w;
                    M0 m11 = H2.f8580a;
                    AbstractC0542b2.b(str, null, jK, jB, lVar, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(m11)).j, c0698o2, 199680, 0, 65490);
                    if (bookType.f13688d.length() > 0) {
                        c0698o2.T(-921903284);
                        AbstractC0542b2.b(bookType.f13688d, null, ((p005a4.a) c0698o2.k(m10)).h(), n.B(16), null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(m11)).f8565k, c0698o2, 3072, 0, 65522);
                        z10 = false;
                    } else {
                        z10 = false;
                        c0698o2.T(-925377857);
                    }
                    c0698o2.p(z10);
                    c0698o2.p(true);
                    C0.a(n.M(2131230909, c0698o2), p000a.a.m0(R.string.reorder, c0698o2), androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.b.h(rVar, f3), f7), ((p005a4.a) c0698o2.k(m10)).h(), c0698o2, 0, 0);
                    c0698o2.p(true);
                }
                break;
            case 4:
                TodayPage todayPage2 = (TodayPage) obj6;
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj5;
                P p10 = (P) obj4;
                C0698o c0698o3 = (C0698o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i15 = TodayPage.f13902v;
                j.e((C0077u) obj, "$this$BottomSheetScaffold");
                if (!c0698o3.K(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c0698o3.N();
                } else {
                    Object objH = c0698o3.H();
                    if (objH == s10) {
                        LocalDate localDateNow = LocalDate.now();
                        j.d(localDateNow, "now(...)");
                        HijrahDate hijrahDateNow = HijrahDate.now();
                        j.d(hijrahDateNow, "now(...)");
                        objH = C0672b.r(new p048e6.a(localDateNow, hijrahDateNow, p120l9.r.f19440r));
                        c0698o3.e0(objH);
                    }
                    Z.X x9 = (Z.X) objH;
                    boolean zI = c0698o3.i(todayPage2);
                    Object objH2 = c0698o3.H();
                    if (zI || objH2 == s10) {
                        objH2 = new C0641m(x9, todayPage2, cVar, 6);
                        c0698o3.e0(objH2);
                    }
                    C0672b.f(c0698o3, yVar, (p241y9.e) objH2);
                    p048e6.a aVar2 = (p048e6.a) x9.getValue();
                    boolean zI2 = c0698o3.i(interfaceC0402u) | c0698o3.g(p10);
                    Object objH3 = c0698o3.H();
                    if (zI2 || objH3 == s10) {
                        objH3 = new I4.c(interfaceC0402u, p10, i12);
                        c0698o3.e0(objH3);
                    }
                    p241y9.a aVar3 = (p241y9.a) objH3;
                    boolean zI3 = c0698o3.i(todayPage2);
                    Object objH4 = c0698o3.H();
                    if (zI3 || objH4 == s10) {
                        todayPage = todayPage2;
                        E5.c cVar3 = new E5.c(1, todayPage, TodayPage.class, "onShare", "onShare(Lcom/ayah/feature/today/data/TodayItem;)V", 0, 0, 10);
                        c0698o3.e0(cVar3);
                        objH4 = cVar3;
                    } else {
                        todayPage = todayPage2;
                    }
                    p241y9.c cVar4 = (p241y9.c) ((h) objH4);
                    boolean zI4 = c0698o3.i(todayPage);
                    Object objH5 = c0698o3.H();
                    if (zI4 || objH5 == s10) {
                        E5.c cVar5 = new E5.c(1, todayPage, TodayPage.class, "onLibrary", "onLibrary(I)V", 0, 0, 11);
                        c0698o3.e0(cVar5);
                        objH5 = cVar5;
                    }
                    p068g6.b.b(aVar2, aVar3, cVar4, (p241y9.c) ((h) objH5), androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f11828c, ((p005a4.a) c0698o3.k(p005a4.e.f11187a)).d(), b5), K0.P.q(c0698o3), null), c0698o3, 0);
                }
                break;
            case 5:
                P p11 = (P) obj6;
                Z.X x10 = (Z.X) obj5;
                Context context = (Context) obj4;
                C0698o c0698o4 = (C0698o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i16 = TodayPage.f13902v;
                j.e((D.P) obj, "it");
                if (!c0698o4.K(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c0698o4.N();
                } else {
                    boolean zG = c0698o4.g(p11);
                    Object objH6 = c0698o4.H();
                    if (zG || objH6 == s10) {
                        objH6 = new A4.j(p11, x10, null, 1);
                        c0698o4.e0(objH6);
                    }
                    C0672b.f(c0698o4, yVar, (p241y9.e) objH6);
                    if (((Boolean) x10.getValue()).booleanValue()) {
                        c0698o4.T(1227380629);
                        EnumC0565h1 enumC0565h1B = p11.f8750a.b();
                        boolean zG2 = c0698o4.g(p11) | c0698o4.i(context);
                        Object objH7 = c0698o4.H();
                        if (zG2 || objH7 == s10) {
                            objH7 = new B2.d(p11, context, cVar, 12);
                            c0698o4.e0(objH7);
                        }
                        C0672b.f(c0698o4, enumC0565h1B, (p241y9.e) objH7);
                    } else {
                        c0698o4.T(1222277967);
                    }
                    c0698o4.p(false);
                    boolean zI5 = c0698o4.i(context);
                    Object objH8 = c0698o4.H();
                    if (zI5 || objH8 == s10) {
                        objH8 = new i(context, 2);
                        c0698o4.e0(objH8);
                    }
                    C0672b.d(yVar, (p241y9.c) objH8, c0698o4);
                }
                break;
            case 6:
                EditLibraryComposePage editLibraryComposePage = (EditLibraryComposePage) obj6;
                InterfaceC0402u interfaceC0402u2 = (InterfaceC0402u) obj5;
                P p12 = (P) obj4;
                C0698o c0698o5 = (C0698o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i17 = EditLibraryComposePage.f13797v;
                j.e((C0077u) obj, "$this$BottomSheetScaffold");
                if (!c0698o5.K(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    c0698o5.N();
                } else {
                    p090i5.b editLibraryPagePresenter = editLibraryComposePage.getEditLibraryPagePresenter();
                    l0.r rVarA = androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f11828c, ((p005a4.a) c0698o5.k(p005a4.e.f11187a)).d(), b5), K0.P.q(c0698o5), null);
                    boolean zI6 = c0698o5.i(editLibraryComposePage);
                    Object objH9 = c0698o5.H();
                    if (zI6 || objH9 == s10) {
                        objH9 = new E5.a(14, editLibraryComposePage);
                        c0698o5.e0(objH9);
                    }
                    p241y9.c cVar6 = (p241y9.c) objH9;
                    boolean zI7 = c0698o5.i(editLibraryComposePage);
                    Object objH10 = c0698o5.H();
                    if (zI7 || objH10 == s10) {
                        objH10 = new O9.y(editLibraryComposePage, cVar, 21);
                        c0698o5.e0(objH10);
                    }
                    p241y9.e eVar = (p241y9.e) objH10;
                    boolean zI8 = c0698o5.i(interfaceC0402u2) | c0698o5.g(p12);
                    Object objH11 = c0698o5.H();
                    if (zI8 || objH11 == s10) {
                        objH11 = new I4.c(interfaceC0402u2, p12, 5);
                        c0698o5.e0(objH11);
                    }
                    p067g5.a.d(editLibraryPagePresenter, cVar6, eVar, (p241y9.a) objH11, rVarA, c0698o5, 0);
                }
                break;
            default:
                P p13 = (P) obj6;
                Z.X x11 = (Z.X) obj5;
                MainActivity mainActivity = (MainActivity) obj4;
                C0698o c0698o6 = (C0698o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i18 = LibraryComposePage.f13804x;
                j.e((D.P) obj, "it");
                if (!c0698o6.K(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    c0698o6.N();
                } else {
                    boolean zG3 = c0698o6.g(p13);
                    Object objH12 = c0698o6.H();
                    if (zG3 || objH12 == s10) {
                        objH12 = new A4.j(p13, x11, null, 3);
                        c0698o6.e0(objH12);
                    }
                    C0672b.f(c0698o6, yVar, (p241y9.e) objH12);
                    if (((Boolean) x11.getValue()).booleanValue()) {
                        c0698o6.T(162502455);
                        EnumC0565h1 enumC0565h1B2 = p13.f8750a.b();
                        boolean zG4 = c0698o6.g(p13) | c0698o6.i(mainActivity);
                        Object objH13 = c0698o6.H();
                        if (zG4 || objH13 == s10) {
                            objH13 = new B2.d(p13, mainActivity, cVar, i11);
                            c0698o6.e0(objH13);
                        }
                        C0672b.f(c0698o6, enumC0565h1B2, (p241y9.e) objH13);
                    } else {
                        c0698o6.T(156914705);
                    }
                    c0698o6.p(false);
                    boolean zI9 = c0698o6.i(mainActivity);
                    Object objH14 = c0698o6.H();
                    if (zI9 || objH14 == s10) {
                        objH14 = new I4.e(mainActivity, 2);
                        c0698o6.e0(objH14);
                    }
                    C0672b.d(yVar, (p241y9.c) objH14, c0698o6);
                }
                break;
        }
        return yVar;
    }
}
