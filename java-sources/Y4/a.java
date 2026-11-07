package Y4;

import A4.h;
import D.AbstractC0066i;
import D.C0076t;
import D4.j;
import D4.l;
import G4.f;
import G4.m;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.AbstractC0614y;
import W.F2;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import Z.X;
import androidx.compose.foundation.layout.FillElement;
import com.ayah.R;
import java.util.Iterator;
import java.util.List;
import l0.o;
import l0.r;
import p017b7.g;
import p074h0.d;
import p173r2.A;
import p180s0.F;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f10429a = new d(395814384, new j(26, 0), false);

    public static final void a(int i10, String str, p241y9.c cVar, C0698o c0698o, int i11) {
        int i12;
        int i13;
        C0698o c0698o2;
        p251z9.j.e(cVar, "onCategorySelected");
        c0698o.V(1701277150);
        if ((i11 & 6) == 0) {
            i12 = (c0698o.e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0698o.g(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0698o.i(cVar) ? 256 : 128;
        }
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            boolean z10 = ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object objH = c0698o.H();
            if (z10 || objH == C0690k.f10683a) {
                objH = new f(13, cVar, str);
                c0698o.e0(objH);
            }
            i13 = i10;
            c0698o2 = c0698o;
            Y2.a.b(i13, (p241y9.a) objH, null, c0698o2, i12 & 14, 4);
        } else {
            i13 = i10;
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new W4.a(i13, str, cVar, i11);
        }
    }

    public static final void b(p095j3.c cVar, p241y9.c cVar2, C0698o c0698o, int i10) {
        int i11;
        p251z9.j.e(cVar, "khatmahPlan");
        p251z9.j.e(cVar2, "onKhatmahSelected");
        c0698o.V(-902392447);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.e(cVar.ordinal()) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(cVar2) ? 32 : 16;
        }
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            int i12 = i11;
            int i13 = cVar.f18775r;
            int i14 = cVar.f18776s;
            boolean z10 = ((i12 & 112) == 32) | ((i12 & 14) == 4);
            Object objH = c0698o.H();
            if (z10 || objH == C0690k.f10683a) {
                objH = new f(14, cVar2, cVar);
                c0698o.e0(objH);
            }
            Y2.a.a(i13, i14, (p241y9.a) objH, null, c0698o, 0);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new l(i10, 5, cVar, cVar2);
        }
    }

    public static final void c(p095j3.c cVar, e eVar, e eVar2, r rVar, C0698o c0698o, int i10) {
        r rVar2;
        p251z9.j.e(cVar, "khatmahPlan");
        p251z9.j.e(eVar, "onKhatmahStarted");
        p251z9.j.e(eVar2, "khatmahInfoFetcher");
        c0698o.V(991199602);
        int i11 = i10 | (c0698o.e(cVar.ordinal()) ? 4 : 2) | (c0698o.i(eVar) ? 32 : 16) | (c0698o.i(eVar2) ? 256 : 128) | 3072;
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.r(Boolean.TRUE);
                c0698o.e0(objH);
            }
            X x9 = (X) objH;
            r rVarE = p181s2.r.e(androidx.compose.foundation.layout.c.f11826a, p181s2.r.d(c0698o));
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarE);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            int i13 = i11 & 112;
            int i14 = i11 & 14;
            boolean z10 = (i13 == 32) | (i14 == 4);
            Object objH2 = c0698o.H();
            if (z10 || objH2 == s10) {
                objH2 = new f(15, eVar, cVar);
                c0698o.e0(objH2);
            }
            o oVar = o.f19333a;
            Y2.a.b(R.string.beginning_of_quran, (p241y9.a) objH2, androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 0.0f, 16, 7), c0698o, 384, 0);
            if (((Boolean) x9.getValue()).booleanValue()) {
                c0698o.T(-1444314414);
                Object objH3 = c0698o.H();
                if (objH3 == s10) {
                    objH3 = new h(x9, 9);
                    c0698o.e0(objH3);
                }
                Y2.a.b(R.string.specific_day, (p241y9.a) objH3, null, c0698o, 48, 4);
                c0698o.p(false);
            } else {
                c0698o.T(-1444169799);
                boolean z11 = i13 == 32;
                Object objH4 = c0698o.H();
                if (z11 || objH4 == s10) {
                    objH4 = new m(6, eVar);
                    c0698o.e0(objH4);
                }
                g.D(cVar, eVar2, null, (e) objH4, null, c0698o, i14 | ((i11 >> 3) & 112), 20);
                c0698o.p(false);
            }
            c0698o.p(true);
            rVar2 = oVar;
        } else {
            c0698o.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new M4.a((Object) cVar, eVar, eVar2, (Object) rVar2, i10, 3);
        }
    }

    public static final void d(A a9, e eVar, e eVar2, p241y9.a aVar, C0698o c0698o, int i10) {
        p251z9.j.e(a9, "navController");
        p251z9.j.e(eVar, "onKhatmahStarted");
        p251z9.j.e(eVar2, "khatmahInfoFetcher");
        p251z9.j.e(aVar, "onDismiss");
        c0698o.V(875172355);
        int i11 = i10 | (c0698o.i(a9) ? 4 : 2) | (c0698o.i(eVar) ? 32 : 16) | (c0698o.i(eVar2) ? 256 : 128) | (c0698o.i(aVar) ? 2048 : 1024);
        int i12 = 1;
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.r(Integer.valueOf(R.string.new_khatmah));
                c0698o.e0(objH);
            }
            X x9 = (X) objH;
            FillElement fillElement = androidx.compose.foundation.layout.c.f11828c;
            M0 m10 = p005a4.e.f11187a;
            r rVarA = androidx.compose.foundation.a.a(fillElement, ((p005a4.a) c0698o.k(m10)).d(), F.f21774a);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarA);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            float f3 = F2.f8543a;
            AbstractC0614y.b(p074h0.j.d(1207369745, new X4.e(x9, i12), c0698o), null, p074h0.j.d(-143040365, new I4.a(5, a9, aVar), c0698o), null, 0.0f, null, F2.a(((p005a4.a) c0698o.k(m10)).d(), c0698o), c0698o, 390, 186);
            boolean zI = c0698o.i(a9) | ((i11 & 112) == 32) | c0698o.i(eVar2);
            Object objH2 = c0698o.H();
            if (zI || objH2 == s10) {
                H8.h hVar = new H8.h(x9, a9, eVar, eVar2, 1);
                c0698o.e0(hVar);
                objH2 = hVar;
            }
            p181s2.A.a(a9, null, null, null, null, null, null, (p241y9.c) objH2, c0698o, (i11 & 14) | 48);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new M4.a((Object) a9, eVar, eVar2, (Object) aVar, i10, 4);
        }
    }

    public static final void e(List list, p241y9.c cVar, p241y9.c cVar2, r rVar, C0698o c0698o, int i10) {
        r rVar2;
        p251z9.j.e(list, "entries");
        p251z9.j.e(cVar, "onCategorySelected");
        p251z9.j.e(cVar2, "onKhatmahSelected");
        c0698o.V(1702339558);
        int i11 = i10 | (c0698o.i(list) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16) | (c0698o.i(cVar2) ? 256 : 128) | 3072;
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            r rVarE = p181s2.r.e(androidx.compose.foundation.layout.c.f11826a, p181s2.r.d(c0698o));
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarE);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            c0698o.T(-449209247);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                T4.g gVar = (T4.g) it.next();
                if (gVar instanceof T4.d) {
                    c0698o.T(-1691698012);
                    T4.d dVar = (T4.d) gVar;
                    p000a.a.b(dVar.f7790a, dVar.f7791b, null, c0698o, 0, 4);
                    c0698o.p(false);
                } else if (gVar instanceof T4.e) {
                    c0698o.T(-1691692516);
                    T4.e eVar = (T4.e) gVar;
                    a(eVar.f7792a, eVar.f7793b, cVar, c0698o, (i11 << 3) & 896);
                    c0698o.p(false);
                } else {
                    if (!(gVar instanceof T4.f)) {
                        c0698o.T(-1691699239);
                        c0698o.p(false);
                        throw new A6.a();
                    }
                    c0698o.T(-1691685762);
                    b(((T4.f) gVar).f7795a, cVar2, c0698o, (i11 >> 3) & 112);
                    c0698o.p(false);
                }
            }
            c0698o.p(false);
            c0698o.p(true);
            rVar2 = o.f19333a;
        } else {
            c0698o.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new M4.a(list, cVar, cVar2, rVar2, i10, 5);
        }
    }
}
