package p067g5;

import A.C0023i;
import A.EnumC0047u0;
import A5.f;
import D.AbstractC0066i;
import D.C0076t;
import D.P;
import D.U;
import D.W;
import D0.C0086d;
import F.A;
import F.D;
import F9.n;
import Ga.C0192a;
import Ga.J;
import Ga.x;
import H8.h;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import K9.InterfaceC0402u;
import U0.L;
import W.AbstractC0542b2;
import W.AbstractC0614y;
import W.C0;
import W.C0553e1;
import W.C0574k0;
import W.F1;
import W.F2;
import W.G1;
import W.G2;
import W.H1;
import W.H2;
import W.I1;
import Y0.l;
import Z.AbstractC0693l0;
import Z.C;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.C0707x;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import Z.X;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import i7.B;
import java.util.List;
import java.util.Locale;
import l0.o;
import l0.r;
import p005a4.e;
import p055f1.k;
import p058f5.a;
import p063g1.m;
import p074h0.d;
import p110k9.y;
import p180s0.F;
import p241y9.g;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f16293a = new d(-1743842166, new p026c5.a(6), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f16294b = new d(-138126005, new p026c5.a(7), false);

    public static final void a(BookType bookType, p241y9.a aVar, r rVar, C0698o c0698o, int i10) {
        int i11;
        C0698o c0698o2 = c0698o;
        j.e(bookType, "book");
        j.e(aVar, "onInstallClick");
        c0698o2.V(761453729);
        if ((i10 & 6) == 0) {
            i11 = (c0698o2.i(bookType) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o2.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o2.g(rVar) ? 256 : 128;
        }
        if (c0698o2.K(i11 & 1, (i11 & 147) != 146)) {
            r rVarB = rVar.b(c.f11826a);
            M0 m10 = e.f11187a;
            r rVarI = b.i(androidx.compose.foundation.a.c(androidx.compose.foundation.a.a(rVarB, ((p005a4.a) c0698o2.k(m10)).g(), F.f21774a), false, null, aVar, 7), 0, 8);
            W wA = U.a(AbstractC0066i.f977a, l0.c.f19307B, c0698o2, 48);
            int i12 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarI);
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
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o2, i12, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC, c0285h4);
            float f3 = 16;
            C0.a(n.M(2131230889, c0698o2), p000a.a.m0(R.string.add, c0698o2), c.j(b.h(o.f19333a, f3), 24), ((p005a4.a) c0698o2.k(m10)).l(), c0698o2, 384, 0);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            r rVarJ = b.j(new LayoutWeightElement(1.0f, true), f3, 0.0f, 2);
            C0076t c0076tA = D.r.a(AbstractC0066i.f981e, l0.c.f19309D, c0698o2, 6);
            int i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
            r rVarC2 = l0.a.c(c0698o2, rVarJ);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, c0076tA, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h3);
            }
            C0672b.v(c0698o2, rVarC2, c0285h4);
            String str = bookType.f13687c;
            long jK = ((p005a4.a) c0698o2.k(m10)).k();
            long jB = n.B(16);
            l lVar = l.f10362w;
            M0 m11 = H2.f8580a;
            AbstractC0542b2.b(str, null, jK, jB, lVar, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(m11)).j, c0698o2, 199680, 0, 65490);
            c0698o2 = c0698o2;
            if (bookType.f13688d.length() > 0) {
                c0698o2.T(1071253112);
                AbstractC0542b2.b(bookType.f13688d, null, ((p005a4.a) c0698o2.k(m10)).h(), n.B(16), null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(m11)).f8565k, c0698o, 3072, 0, 65522);
                c0698o2 = c0698o;
            } else {
                c0698o2.T(1068917851);
            }
            c0698o2.p(false);
            c0698o2.p(true);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G4.c(bookType, aVar, rVar, i10, 3);
        }
    }

    public static final void b(final p079h5.e eVar, final p241y9.c cVar, r rVar, r rVar2, C0698o c0698o, int i10) {
        j.e(eVar, "item");
        j.e(cVar, "onAction");
        c0698o.V(116017541);
        int i11 = (c0698o.g(eVar) ? 4 : 2) | i10 | (c0698o.i(cVar) ? 32 : 16) | (c0698o.g(rVar) ? 256 : 128);
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.g(rVar2) ? 2048 : 1024;
        }
        if (!c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            c0698o.N();
        } else if (eVar instanceof p079h5.a) {
            c0698o.T(-1169864106);
            e(((p079h5.a) eVar).f16457a.f13682b, rVar, c0698o, (i11 >> 3) & 112);
            c0698o.p(false);
        } else if (eVar instanceof p079h5.c) {
            c0698o.T(-1169684058);
            e(p000a.a.m0(R.string.my_library, c0698o), rVar, c0698o, (i11 >> 3) & 112);
            c0698o.p(false);
        } else {
            boolean z10 = eVar instanceof p079h5.d;
            S s10 = C0690k.f10683a;
            if (z10) {
                c0698o.T(-1169495454);
                BookType bookType = ((p079h5.d) eVar).f16460a;
                boolean z11 = ((i11 & 112) == 32) | ((i11 & 14) == 4);
                Object objH = c0698o.H();
                if (z11 || objH == s10) {
                    final int i12 = 0;
                    objH = new p241y9.a() { // from class: g5.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    cVar.e(new a(((p079h5.d) eVar).f16460a));
                                    break;
                                default:
                                    cVar.e(new p058f5.c(((p079h5.b) eVar).f16458a));
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o.e0(objH);
                }
                a(bookType, (p241y9.a) objH, rVar, c0698o, i11 & 896);
                c0698o.p(false);
            } else {
                if (!(eVar instanceof p079h5.b)) {
                    c0698o.T(-176285667);
                    c0698o.p(false);
                    throw new A6.a();
                }
                c0698o.T(-1169231241);
                BookType bookType2 = ((p079h5.b) eVar).f16458a;
                boolean z12 = ((i11 & 112) == 32) | ((i11 & 14) == 4);
                Object objH2 = c0698o.H();
                if (z12 || objH2 == s10) {
                    final int i13 = 1;
                    objH2 = new p241y9.a() { // from class: g5.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    cVar.e(new a(((p079h5.d) eVar).f16460a));
                                    break;
                                default:
                                    cVar.e(new p058f5.c(((p079h5.b) eVar).f16458a));
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o.e0(objH2);
                }
                f(bookType2, (p241y9.a) objH2, rVar, rVar2, c0698o, i11 & 8064);
                c0698o.p(false);
            }
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.e(eVar, cVar, rVar, rVar2, i10, 2);
        }
    }

    public static final void c(List list, p241y9.c cVar, p241y9.e eVar, r rVar, C0698o c0698o, int i10) {
        int i11;
        r rVar2;
        boolean z10;
        Ga.y yVar;
        j.e(list, "items");
        j.e(cVar, "onAction");
        j.e(eVar, "handleMoveBookAction");
        c0698o.V(-2062240906);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(eVar) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if (c0698o.K(i12 & 1, (i12 & 1171) != 1170)) {
            p243z0.a aVar = (p243z0.a) c0698o.k(AbstractC0359n0.f5121l);
            A a9 = D.a(c0698o);
            P pB = b.b(64, 0.0f, 13);
            boolean zI = c0698o.i(list) | c0698o.i(eVar) | c0698o.i(aVar);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (zI || objH == obj) {
                objH = new f(list, eVar, aVar, null);
                c0698o.e0(objH);
            }
            g gVar = (g) objH;
            j.e(a9, "lazyListState");
            j.e(gVar, "onMove");
            c0698o.T(-645045624);
            float f3 = Ga.l.f3048a;
            c0698o.T(1347434050);
            boolean zG = c0698o.g(a9);
            Object objH2 = c0698o.H();
            if (zG || objH2 == obj) {
                objH2 = new x(a9, 0);
                c0698o.e0(objH2);
            }
            p241y9.a aVar2 = (p241y9.a) objH2;
            c0698o.p(false);
            j.e(aVar2, "pixelAmountProvider");
            c0698o.T(996643712);
            Object objH3 = c0698o.H();
            if (objH3 == obj) {
                Object c0707x = new C0707x(C0672b.m(c0698o));
                c0698o.e0(c0707x);
                objH3 = c0707x;
            }
            InterfaceC0402u interfaceC0402u = ((C0707x) objH3).f10851r;
            X xU = C0672b.u(aVar2, c0698o);
            X xU2 = C0672b.u(100L, c0698o);
            c0698o.T(1852585201);
            boolean zF = c0698o.f(100L) | c0698o.g(a9) | c0698o.g(interfaceC0402u);
            Object objH4 = c0698o.H();
            if (zF || objH4 == obj) {
                objH4 = new J(a9, interfaceC0402u, new C0086d(4, xU, xU2));
                c0698o.e0(objH4);
            }
            J j = (J) objH4;
            c0698o.p(false);
            c0698o.p(false);
            p063g1.c cVar2 = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
            float fW = cVar2.w(f3);
            Object objH5 = c0698o.H();
            if (objH5 == obj) {
                Object c0707x2 = new C0707x(C0672b.m(c0698o));
                c0698o.e0(c0707x2);
                objH5 = c0707x2;
            }
            InterfaceC0402u interfaceC0402u2 = ((C0707x) objH5).f10851r;
            X xU3 = C0672b.u(gVar, c0698o);
            m mVar = (m) c0698o.k(AbstractC0359n0.f5123n);
            C0192a c0192a = new C0192a(cVar2.w(b.d(pB, mVar)), cVar2.w(b.c(pB, mVar)), cVar2.w(pB.f909b), cVar2.w(pB.f911d));
            c0698o.T(1347465600);
            boolean zG2 = c0698o.g(a9);
            Object objH6 = c0698o.H();
            if (zG2 || objH6 == obj) {
                objH6 = new x(a9, 1);
                c0698o.e0(objH6);
            }
            c0698o.p(false);
            C cO = C0672b.o((p241y9.a) objH6);
            Object obj2 = (EnumC0047u0) cO.getValue();
            c0698o.T(1347468268);
            boolean zD = c0698o.d(f3) | c0698o.g(interfaceC0402u2) | c0698o.g(a9) | c0698o.g(j) | c0698o.g(obj2);
            Object objH7 = c0698o.H();
            if (zD || objH7 == obj) {
                int iOrdinal = ((EnumC0047u0) cO.getValue()).ordinal();
                if (iOrdinal != 0) {
                    z10 = true;
                    if (iOrdinal != 1) {
                        throw new A6.a();
                    }
                    yVar = Ga.y.f3104t;
                } else {
                    z10 = true;
                    yVar = Ga.y.f3103s;
                }
                Ga.y yVar2 = yVar;
                j.e(j, "scroller");
                j.e(mVar, "layoutDirection");
                objH7 = new Ga.A(new p248z6.c(11, a9), interfaceC0402u2, xU3, fW, c0192a, j, mVar, yVar2);
                c0698o.e0(objH7);
            } else {
                z10 = true;
            }
            Object obj3 = (Ga.A) objH7;
            c0698o.p(false);
            c0698o.p(false);
            long jD = ((p005a4.a) c0698o.k(e.f11187a)).d();
            B b5 = F.f21774a;
            o oVar = o.f19333a;
            r rVarA = androidx.compose.foundation.a.a(oVar, jD, b5);
            boolean zI2 = c0698o.i(list) | c0698o.g(obj3) | ((i12 & 112) == 32 ? z10 : false) | c0698o.i(aVar);
            Object objH8 = c0698o.H();
            if (zI2 || objH8 == obj) {
                Object hVar = new h(list, obj3, cVar, aVar, 2);
                c0698o.e0(hVar);
                objH8 = hVar;
            }
            B9.a.c(0, 508, null, null, null, a9, c0698o, null, rVarA, null, (p241y9.c) objH8, false);
            rVar2 = oVar;
        } else {
            c0698o.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.e(list, cVar, eVar, rVar2, i10);
        }
    }

    public static final void d(p090i5.b bVar, p241y9.c cVar, p241y9.e eVar, p241y9.a aVar, r rVar, C0698o c0698o, int i10) {
        C0698o c0698o2 = c0698o;
        j.e(bVar, "editLibraryPagePresenter");
        j.e(cVar, "handleEditLibraryAction");
        j.e(eVar, "handleMoveBookAction");
        j.e(aVar, "onDismiss");
        c0698o2.V(803583832);
        int i11 = i10 | (c0698o2.i(bVar) ? 4 : 2) | (c0698o2.i(cVar) ? 32 : 16) | (c0698o2.i(eVar) ? 256 : 128) | (c0698o2.i(aVar) ? 2048 : 1024) | (c0698o2.g(rVar) ? 16384 : 8192);
        byte b5 = 0;
        if (c0698o2.K(i11 & 1, (i11 & 9363) != 9362)) {
            r rVarB = rVar.b(c.f11828c);
            M0 m10 = e.f11187a;
            r rVarA = androidx.compose.foundation.a.a(rVarB, ((p005a4.a) c0698o2.k(m10)).d(), F.f21774a);
            Object objH = c0698o2.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new Ba.b(3);
                c0698o2.e0(objH);
            }
            r rVarB2 = androidx.compose.foundation.a.b(rVarA, null, null, false, null, (p241y9.a) objH, 28);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
            int i12 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarB2);
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
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o2, i12, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            d dVarD = p074h0.j.d(159821512, new f(aVar, 8, b5), c0698o2);
            float f3 = F2.f8543a;
            AbstractC0614y.b(f16293a, null, dVarD, null, 0.0f, null, F2.a(((p005a4.a) c0698o2.k(m10)).g(), c0698o2), c0698o, 390, 186);
            c0698o2 = c0698o;
            List list = (List) C0672b.k(new C4.g(bVar.f16759a.f21517c, bVar, 17), p120l9.r.f19440r, null, c0698o2, 48, 2).getValue();
            boolean z10 = (i11 & 112) == 32;
            Object objH2 = c0698o2.H();
            if (z10 || objH2 == s10) {
                objH2 = new G4.j(cVar, 2);
                c0698o2.e0(objH2);
            }
            c(list, (p241y9.c) objH2, eVar, null, c0698o2, i11 & 896);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.c(bVar, cVar, eVar, aVar, rVar, i10);
        }
    }

    public static final void e(String str, r rVar, C0698o c0698o, int i10) {
        int i11;
        j.e(str, "text");
        c0698o.V(1150818101);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0698o.g(str) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            j.d(upperCase, "toUpperCase(...)");
            AbstractC0542b2.b(upperCase, b.h(rVar.b(c.f11826a), 16), ((p005a4.a) c0698o.k(e.f11187a)).h(), n.B(14), null, null, 0L, new k(5), 0L, 0, false, 0, 0, L.a(((G2) c0698o.k(H2.f8580a)).f8565k, 0L, 0L, l.f10359t, null, n.A(0.5d), 0L, null, 16777083), c0698o, 3072, 0, 65008);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.l(i10, 6, str, rVar);
        }
    }

    public static final void f(BookType bookType, p241y9.a aVar, r rVar, r rVar2, C0698o c0698o, int i10) {
        int i11;
        p085i0.n nVar;
        j.e(bookType, "book");
        j.e(aVar, "onRemoveClick");
        c0698o.V(798459724);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(bookType) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.g(rVar2) ? 2048 : 1024;
        }
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            boolean z10 = (i11 & 112) == 32;
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (z10 || objH == obj) {
                objH = new E5.a(13, aVar);
                c0698o.e0(objH);
            }
            Object obj2 = (p241y9.c) objH;
            float f3 = G1.f8556a;
            c0698o.T(-1853326336);
            AbstractC0693l0 abstractC0693l0 = AbstractC0359n0.f5118h;
            p063g1.c cVar = (p063g1.c) c0698o.k(abstractC0693l0);
            boolean zG = c0698o.g(cVar);
            Object objH2 = c0698o.H();
            if (zG || objH2 == obj) {
                objH2 = new C0553e1(cVar, 1);
                c0698o.e0(objH2);
            }
            Object obj3 = (p241y9.c) objH2;
            c0698o.p(false);
            Object obj4 = (p063g1.c) c0698o.k(abstractC0693l0);
            Object[] objArr = new Object[0];
            C0574k0 c0574k0 = C0574k0.f9206w;
            C0023i c0023i = new C0023i(obj4, obj2, obj3, 12);
            p085i0.n nVar2 = p085i0.o.f16735a;
            p085i0.n nVar3 = new p085i0.n(0, c0574k0, c0023i);
            Object obj5 = I1.f8597t;
            boolean zG2 = c0698o.g(obj5) | c0698o.g(obj4) | c0698o.g(obj2) | c0698o.g(obj3);
            Object objH3 = c0698o.H();
            if (zG2 || objH3 == obj) {
                nVar = nVar3;
                Object f7 = new F1(obj5, obj4, obj2, obj3, 0);
                c0698o.e0(f7);
                objH3 = f7;
            } else {
                nVar = nVar3;
            }
            H1 h7 = (H1) va.g.H(objArr, nVar, (p241y9.a) objH3, c0698o, 0, 4);
            G1.a(h7, p074h0.j.d(-1393921938, new A4.f(8, h7), c0698o), rVar, false, false, p074h0.j.d(-520106167, new H4.g(aVar, rVar2, bookType, 3), c0698o), c0698o, (i11 & 896) | 1600560);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.e(bookType, aVar, rVar, rVar2, i10);
        }
    }

    public static final String g(p079h5.e eVar) {
        if (eVar instanceof p079h5.a) {
            return p123m2.c.s("header_", ((p079h5.a) eVar).f16457a.f13681a);
        }
        if (eVar instanceof p079h5.c) {
            return "my_library_header";
        }
        if (eVar instanceof p079h5.d) {
            return p123m2.c.s("tafsir_", ((p079h5.d) eVar).f16460a.f13685a);
        }
        if (eVar instanceof p079h5.b) {
            return p123m2.c.s("installed_", ((p079h5.b) eVar).f16458a.f13685a);
        }
        throw new A6.a();
    }
}
