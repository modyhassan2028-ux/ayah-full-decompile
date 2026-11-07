package p116l5;

import C4.g;
import D.AbstractC0071n;
import D.C0059b;
import D.M;
import D.Z;
import D.f0;
import D.h0;
import H0.I;
import I4.c;
import J.b;
import J.d;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.InterfaceC0402u;
import W.P;
import W.V0;
import W.Y0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.S;
import Z.X;
import com.ayah.MainActivity;
import com.ayah.feature.library.view.LibraryComposePage;
import java.util.WeakHashMap;
import l0.o;
import l0.r;
import p074h0.j;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LibraryComposePage f19386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f19387t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MainActivity f19388u;

    public /* synthetic */ a(LibraryComposePage libraryComposePage, g gVar, MainActivity mainActivity, int i10) {
        this.f19385r = i10;
        this.f19386s = libraryComposePage;
        this.f19387t = gVar;
        this.f19388u = mainActivity;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f19385r;
        y yVar = y.f19095a;
        MainActivity mainActivity = this.f19388u;
        int i11 = 1;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = LibraryComposePage.f13804x;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, j.d(1123935494, new a(this.f19386s, this.f19387t, mainActivity, i11), c0698o), c0698o, 48);
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = LibraryComposePage.f13804x;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    Object objH = c0698o2.H();
                    S s10 = C0690k.f10683a;
                    if (objH == s10) {
                        objH = C0672b.m(c0698o2);
                        c0698o2.e0(objH);
                    }
                    InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH;
                    P p10 = V0.p(V0.q(390, 2, c0698o2), c0698o2, 2);
                    boolean zI = c0698o2.i(interfaceC0402u) | c0698o2.g(p10);
                    Object objH2 = c0698o2.H();
                    if (zI || objH2 == s10) {
                        objH2 = new c(interfaceC0402u, p10, 6);
                        c0698o2.e0(objH2);
                    }
                    r rVarB = androidx.compose.foundation.a.b(o.f19333a, null, null, false, null, (p241y9.a) objH2, 28);
                    WeakHashMap weakHashMap = f0.f955u;
                    r rVarA = h0.a(rVarB, new M(new Z(new Z(C0059b.f(c0698o2).g, C0059b.f(c0698o2).f960e), C0059b.f(c0698o2).f957b), 16 | 15));
                    Object objH3 = c0698o2.H();
                    if (objH3 == s10) {
                        objH3 = C0672b.r(Boolean.FALSE);
                        c0698o2.e0(objH3);
                    }
                    X x9 = (X) objH3;
                    I iD = AbstractC0071n.d(l0.c.f19313r, false);
                    int i14 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    r rVarC = l0.a.c(c0698o2, rVarA);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0672b.v(c0698o2, iD, C0287j.f4119f);
                    C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i14))) {
                        p123m2.c.y(i14, c0698o2, i14, c0285h);
                    }
                    C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                    float f3 = (float) 0.0d;
                    V0.b(j.d(623060123, new A4.c(this.f19386s, this.f19387t, interfaceC0402u, p10, 3), c0698o2), null, p10, 0, 0.0f, d.a(Y0.f8926e, null, null, new b(f3), new b(f3), 3), 0L, 0L, 0.0f, 0.0f, null, false, null, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).d(), 0L, j.d(1001554161, new H4.g(p10, x9, mainActivity, 7), c0698o2), c0698o2, 3078, 48082);
                    c0698o2.p(true);
                }
                break;
        }
        return yVar;
    }
}
