package Q3;

import A.C0030l0;
import C4.g;
import D.AbstractC0066i;
import D.C0076t;
import D.P;
import D.r;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.AbstractC0405x;
import W.C1;
import W.Q;
import W.S;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.X;
import com.ayah.R;
import com.ayah.common.ui.bookmarklist.view.wrapper.BookmarkListWrapper;
import l0.o;
import p015b4.f;
import p074h0.j;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f6856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BookmarkListWrapper f6857t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f6858u;

    public /* synthetic */ b(boolean z10, BookmarkListWrapper bookmarkListWrapper, X x9, int i10) {
        this.f6855r = i10;
        this.f6856s = z10;
        this.f6857t = bookmarkListWrapper;
        this.f6858u = x9;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        int i10 = this.f6855r;
        y yVar = y.f19095a;
        X x9 = this.f6858u;
        final BookmarkListWrapper bookmarkListWrapper = this.f6857t;
        int i11 = 1;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = BookmarkListWrapper.f13703v;
                int i13 = 1;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    C1.a(androidx.compose.foundation.layout.c.f11828c, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).d(), 0L, 0.0f, 0.0f, null, j.d(-1223594788, new b(this.f6856s, bookmarkListWrapper, x9, i13), c0698o), c0698o, 12582918, 122);
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = BookmarkListWrapper.f13703v;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    C0076t c0076tA = r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
                    int i15 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    o oVar = o.f19333a;
                    l0.r rVarC = l0.a.c(c0698o2, oVar);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0672b.v(c0698o2, c0076tA, C0287j.f4119f);
                    C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i15))) {
                        p123m2.c.y(i15, c0698o2, i15, c0285h);
                    }
                    C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                    f.j(R.string.bookmarks, 0, c0698o2);
                    P p10 = S.f8804a;
                    Q qD = S.d(0L, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), c0698o2, 13);
                    float f3 = 16;
                    l0.r rVarL = androidx.compose.foundation.layout.b.l(oVar, f3, 0.0f, 0.0f, 8, 6);
                    boolean z11 = this.f6856s;
                    boolean zH = c0698o2.h(z11);
                    Object objH = c0698o2.H();
                    Z.S s10 = C0690k.f10683a;
                    if (zH || objH == s10) {
                        objH = new H2.d(1, x9, z11);
                        c0698o2.e0(objH);
                    }
                    V0.k((p241y9.a) objH, rVarL, false, null, qD, null, j.d(-1420502385, new P3.f(i11, z11), c0698o2), c0698o2, 805306416, 492);
                    O3.d presenter = bookmarkListWrapper.getPresenter();
                    C4.e eVar = new C4.e(10, new C4.e(9, new g(presenter.f6469a.f22892c, presenter, 8)));
                    l0.r rVarJ = androidx.compose.foundation.layout.b.j(oVar, f3, 0.0f, 2);
                    boolean zI = c0698o2.i(bookmarkListWrapper);
                    Object objH2 = c0698o2.H();
                    if (zI || objH2 == s10) {
                        final int i16 = 0;
                        objH2 = new p241y9.c() { // from class: Q3.c
                            @Override // p241y9.c
                            public final Object e(Object obj3) {
                                int i17 = i16;
                                y yVar2 = y.f19095a;
                                BookmarkListWrapper bookmarkListWrapper2 = bookmarkListWrapper;
                                switch (i17) {
                                    case 0:
                                        N3.a aVar = (N3.a) obj3;
                                        int i18 = BookmarkListWrapper.f13703v;
                                        p251z9.j.e(aVar, "bookmark");
                                        if (aVar instanceof N3.b) {
                                            O3.d presenter2 = bookmarkListWrapper2.getPresenter();
                                            N3.b bVar = (N3.b) aVar;
                                            int i19 = bVar.f6001a;
                                            int i20 = bVar.f6004d;
                                            M3.a aVar2 = bVar.f6006f;
                                            presenter2.getClass();
                                            p251z9.j.e(aVar2, "color");
                                            presenter2.f6471c.a(i19, i20, p017b7.g.L(aVar2));
                                        }
                                        break;
                                    default:
                                        M3.a aVar3 = (M3.a) obj3;
                                        int i21 = BookmarkListWrapper.f13703v;
                                        p251z9.j.e(aVar3, "bookmarkColor");
                                        O3.d presenter3 = bookmarkListWrapper2.getPresenter();
                                        presenter3.getClass();
                                        AbstractC0405x.x(presenter3.f6472d, null, new C0030l0(presenter3, aVar3, null, 27), 3);
                                        break;
                                }
                                return yVar2;
                            }
                        };
                        c0698o2.e0(objH2);
                    }
                    p241y9.c cVar = (p241y9.c) objH2;
                    boolean zI2 = c0698o2.i(bookmarkListWrapper);
                    Object objH3 = c0698o2.H();
                    if (zI2 || objH3 == s10) {
                        final int i17 = 1;
                        objH3 = new p241y9.c() { // from class: Q3.c
                            @Override // p241y9.c
                            public final Object e(Object obj3) {
                                int i18 = i17;
                                y yVar2 = y.f19095a;
                                BookmarkListWrapper bookmarkListWrapper2 = bookmarkListWrapper;
                                switch (i18) {
                                    case 0:
                                        N3.a aVar = (N3.a) obj3;
                                        int i19 = BookmarkListWrapper.f13703v;
                                        p251z9.j.e(aVar, "bookmark");
                                        if (aVar instanceof N3.b) {
                                            O3.d presenter2 = bookmarkListWrapper2.getPresenter();
                                            N3.b bVar = (N3.b) aVar;
                                            int i110 = bVar.f6001a;
                                            int i20 = bVar.f6004d;
                                            M3.a aVar2 = bVar.f6006f;
                                            presenter2.getClass();
                                            p251z9.j.e(aVar2, "color");
                                            presenter2.f6471c.a(i110, i20, p017b7.g.L(aVar2));
                                        }
                                        break;
                                    default:
                                        M3.a aVar3 = (M3.a) obj3;
                                        int i21 = BookmarkListWrapper.f13703v;
                                        p251z9.j.e(aVar3, "bookmarkColor");
                                        O3.d presenter3 = bookmarkListWrapper2.getPresenter();
                                        presenter3.getClass();
                                        AbstractC0405x.x(presenter3.f6472d, null, new C0030l0(presenter3, aVar3, null, 27), 3);
                                        break;
                                }
                                return yVar2;
                            }
                        };
                        c0698o2.e0(objH3);
                    }
                    p241y9.c cVar2 = (p241y9.c) objH3;
                    boolean zI3 = c0698o2.i(bookmarkListWrapper);
                    Object objH4 = c0698o2.H();
                    if (zI3 || objH4 == s10) {
                        z10 = true;
                        objH4 = new a(bookmarkListWrapper, 1 == true ? 1 : 0);
                        c0698o2.e0(objH4);
                    } else {
                        z10 = true;
                    }
                    P3.e.c(eVar, cVar, rVarJ, null, cVar2, (e) objH4, z11, c0698o2, 384, 8);
                    c0698o2.p(z10);
                }
                break;
        }
        return yVar;
    }
}
