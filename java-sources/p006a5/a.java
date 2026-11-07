package p006a5;

import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0076t;
import D4.j;
import F9.n;
import G4.f;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import U0.C0515g;
import U0.L;
import W.AbstractC0542b2;
import W.C0;
import W.G2;
import W.H2;
import W.L0;
import W.T0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.S;
import Z.X;
import android.content.Context;
import android.text.TextDirectionHeuristics;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.List;
import l0.o;
import l0.r;
import p005a4.e;
import p017b7.g;
import p047e5.b;
import p047e5.h;
import p047e5.i;
import p055f1.k;
import p063g1.m;
import p074h0.d;
import p180s0.q;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11188a = new d(-1470516664, new j(27, 0), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f11189b = new d(-768975808, new j(28, 0), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f11190c = new d(2139099753, new j(29, 0), false);

    public static final void a(b bVar, c cVar, r rVar, C0698o c0698o, int i10) {
        r rVarC;
        C0698o c0698o2 = c0698o;
        boolean z10 = bVar.f15793e;
        int i11 = bVar.f15792d;
        p251z9.j.e(cVar, "onBookDownloadRequested");
        c0698o2.V(772245707);
        int i12 = i10 | (c0698o2.i(bVar) ? 4 : 2) | (c0698o2.i(cVar) ? 32 : 16);
        if (c0698o2.K(i12 & 1, (i12 & 147) != 146)) {
            r rVarQ = p000a.a.Q(androidx.compose.foundation.layout.c.d(rVar.b(androidx.compose.foundation.layout.c.f11826a), 56), p047e5.a.f15788u, c0698o2);
            S s10 = C0690k.f10683a;
            o oVar = o.f19333a;
            if (i11 != -1 || z10) {
                c0698o2.T(2127571911);
                c0698o2.p(false);
                rVarC = oVar;
            } else {
                c0698o2.T(2127453956);
                boolean zI = ((i12 & 112) == 32) | c0698o2.i(bVar);
                Object objH = c0698o2.H();
                if (zI || objH == s10) {
                    objH = new f(18, cVar, bVar);
                    c0698o2.e0(objH);
                }
                rVarC = androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH, 7);
                c0698o2.p(false);
            }
            r rVarB = rVarQ.b(rVarC);
            I iD = AbstractC0071n.d(l0.c.f19317v, false);
            int i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC2 = l0.a.c(c0698o2, rVarB);
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
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            }
            C0672b.v(c0698o2, rVarC2, C0287j.f4117d);
            if (i11 != -1) {
                c0698o2.T(1751613518);
                boolean zI2 = c0698o2.i(bVar);
                Object objH2 = c0698o2.H();
                if (zI2 || objH2 == s10) {
                    objH2 = new B3.f(9, bVar);
                    c0698o2.e0(objH2);
                }
                T0.a((p241y9.a) objH2, androidx.compose.foundation.layout.c.j(oVar, 24), ((p005a4.a) c0698o2.k(e.f11187a)).l(), L0.f8635a, q.f21843f, L0.f8637c, 0.0f, c0698o2, 48);
                c0698o2.p(false);
            } else if (z10) {
                c0698o2.T(1752162776);
                T0.b(androidx.compose.foundation.layout.c.j(oVar, 24), ((p005a4.a) c0698o2.k(e.f11187a)).l(), L0.f8635a, q.f21843f, L0.f8637c, c0698o, 6, 0);
                c0698o2 = c0698o;
                c0698o2.p(false);
            } else {
                c0698o2.T(1752571387);
                C0.a(n.M(2131230908, c0698o2), p000a.a.m0(R.string.download, c0698o2), androidx.compose.foundation.layout.c.j(oVar, 24), ((p005a4.a) c0698o2.k(e.f11187a)).l(), c0698o2, 384, 0);
                c0698o2.p(false);
            }
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a(bVar, cVar, rVar, i10, 8);
        }
    }

    public static final void b(p047e5.c cVar, p106k4.a aVar, r rVar, C0698o c0698o, int i10) {
        C0698o c0698o2;
        p047e5.a aVar2 = cVar.f15796c;
        BookType bookType = cVar.f15797d;
        p134n3.d dVar = cVar.f15795b;
        p251z9.j.e(aVar, "ayahTextFormatter");
        c0698o.V(-1726142644);
        int i11 = i10 | (c0698o.i(cVar) ? 4 : 2) | (c0698o.i(aVar) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            boolean zG = c0698o.g(dVar) | c0698o.g(bookType);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                objH = B9.a.c0(aVar.a(context, dVar.f19989b, p120l9.r.f19440r, bookType.g));
                c0698o.e0(objH);
            }
            C0515g c0515g = (C0515g) objH;
            FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
            r rVarQ = p000a.a.Q(rVar.b(fillElement), aVar2, c0698o);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarQ);
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
            g.E(aVar2, null, c0698o, 0);
            AbstractC0542b2.c(c0515g, androidx.compose.foundation.layout.b.h(fillElement, 15), ((p005a4.a) c0698o.k(e.f11187a)).h(), n.B(14), null, 0L, 0L, 0, false, 0, 0, null, null, ((G2) c0698o.k(H2.f8580a)).f8565k, c0698o, 3120, 131056);
            c0698o2 = c0698o;
            c0698o2.p(true);
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a(cVar, aVar, rVar, i10, 9);
        }
    }

    public static final void c(p047e5.d dVar, p106k4.a aVar, r rVar, C0698o c0698o, int i10) {
        BookType bookType = dVar.f15801d;
        p047e5.a aVar2 = dVar.f15800c;
        p134n3.e eVar = dVar.f15799b;
        p251z9.j.e(aVar, "ayahTextFormatter");
        c0698o.V(-2123141992);
        int i11 = (c0698o.i(dVar) ? 4 : 2) | i10 | (c0698o.i(aVar) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            boolean zG = c0698o.g(eVar) | c0698o.g(bookType);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (zG || objH == obj) {
                objH = B9.a.c0(aVar.a(context, eVar.f19992b, p120l9.r.f19440r, bookType.g));
                c0698o.e0(objH);
            }
            C0515g c0515g = (C0515g) objH;
            boolean zG2 = c0698o.g(c0515g);
            Object objH2 = c0698o.H();
            if (zG2 || objH2 == obj) {
                objH2 = Boolean.valueOf(TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(c0515g, 0, c0515g.f8060s.length()));
                c0698o.e0(objH2);
            }
            boolean zBooleanValue = ((Boolean) objH2).booleanValue();
            r rVarQ = p000a.a.Q(rVar.b(androidx.compose.foundation.layout.c.f11826a), aVar2, c0698o);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarQ);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar3 = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar3);
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
            if (aVar2 != p047e5.a.f15785r) {
                c0698o.T(1198699404);
                g.E(aVar2, null, c0698o, 0);
            } else {
                c0698o.T(1196571316);
            }
            c0698o.p(false);
            C0672b.a(AbstractC0359n0.f5123n.a(zBooleanValue ? m.f16262s : m.f16261r), p074h0.j.d(106596046, new b(c0515g, 0), c0698o), c0698o, 56);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a(dVar, aVar, rVar, i10, 10);
        }
    }

    public static final void d(p047e5.e eVar, r rVar, C0698o c0698o, int i10) {
        c0698o.V(1285807989);
        int i11 = i10 | (c0698o.i(eVar) ? 4 : 2);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            float f3 = 16;
            AbstractC0542b2.b(eVar.f15804c, androidx.compose.foundation.layout.b.i(p000a.a.Q(rVar.b(androidx.compose.foundation.layout.c.f11826a), p047e5.a.f15788u, c0698o), f3, f3), ((p005a4.a) c0698o.k(e.f11187a)).j(), 0L, null, null, 0L, new k(3), 0L, 0, false, 0, 0, L.a(((G2) c0698o.k(H2.f8580a)).f8565k, 0L, n.B(17), null, null, 0L, 0L, null, 16777213), c0698o, 0, 0, 65016);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I4.a(i10, 7, eVar, rVar);
        }
    }

    public static final void e(p047e5.f fVar, c cVar, r rVar, C0698o c0698o, int i10) {
        C0698o c0698o2;
        p047e5.a aVar = fVar.f15807c;
        p251z9.j.e(cVar, "onJumpToAyah");
        c0698o.V(-1895956772);
        int i11 = i10 | (c0698o.i(fVar) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
            r rVarQ = p000a.a.Q(rVar.b(fillElement), aVar, c0698o);
            boolean zI = ((i11 & 112) == 32) | c0698o.i(fVar);
            Object objH = c0698o.H();
            if (zI || objH == C0690k.f10683a) {
                objH = new f(19, cVar, fVar);
                c0698o.e0(objH);
            }
            r rVarC = androidx.compose.foundation.a.c(rVarQ, false, null, (p241y9.a) objH, 7);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC2 = l0.a.c(c0698o, rVarC);
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
            C0672b.v(c0698o, rVarC2, C0287j.f4117d);
            g.E(aVar, null, c0698o, 0);
            String string = context.getString(R.string.ayah_reference, fVar.f15809e.d(context));
            p251z9.j.d(string, "getString(...)");
            AbstractC0542b2.b(string, androidx.compose.foundation.layout.b.h(rVar.b(fillElement), 16), ((p005a4.a) c0698o.k(e.f11187a)).l(), 0L, null, null, 0L, new k(3), 0L, 0, false, 0, 0, L.a(((G2) c0698o.k(H2.f8580a)).j, 0L, n.B(17), null, null, 0L, 0L, null, 16777213), c0698o, 0, 0, 65016);
            c0698o2 = c0698o;
            c0698o2.p(true);
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a(fVar, cVar, rVar, i10, 11);
        }
    }

    public static final void f(p047e5.g gVar, p241y9.f fVar, p241y9.f fVar2, r rVar, List list, C0698o c0698o, int i10) {
        p251z9.j.e(fVar, "onShareText");
        p251z9.j.e(fVar2, "onShareImage");
        c0698o.V(917626598);
        int i11 = (c0698o.i(gVar) ? 4 : 2) | i10 | (c0698o.i(fVar) ? 32 : 16) | (c0698o.i(fVar2) ? 256 : 128) | (c0698o.i(list) ? 16384 : 8192);
        if (c0698o.K(i11 & 1, (i11 & 9363) != 9362)) {
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = C0672b.r(Boolean.FALSE);
                c0698o.e0(objH);
            }
            X x9 = (X) objH;
            String str = gVar.f15811b.f13691h;
            C0672b.a(AbstractC0359n0.f5123n.a(TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(str, 0, str.length()) ? m.f16262s : m.f16261r), p074h0.j.d(-1673182298, new H4.e(rVar, str, gVar, list, fVar, x9, fVar2), c0698o), c0698o, 56);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.c(gVar, fVar, fVar2, rVar, list, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public static final void g(h hVar, p106k4.a aVar, r rVar, C0698o c0698o, int i10) {
        p047e5.a aVar2 = hVar.f15816c;
        BookType bookType = hVar.f15817d;
        p134n3.g gVar = hVar.f15815b;
        p251z9.j.e(aVar, "ayahTextFormatter");
        c0698o.V(-1531022221);
        int i11 = (c0698o.i(hVar) ? 4 : 2) | i10 | (c0698o.i(aVar) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            boolean zG = c0698o.g(gVar) | c0698o.g(bookType);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (zG || objH == obj) {
                objH = B9.a.c0(aVar.a(context, gVar.f19997b, gVar.f20000e, bookType.g));
                c0698o.e0(objH);
            }
            C0515g c0515g = (C0515g) objH;
            boolean zG2 = c0698o.g(c0515g);
            Object objH2 = c0698o.H();
            if (zG2 || objH2 == obj) {
                objH2 = Boolean.valueOf(TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(c0515g, 0, c0515g.f8060s.length()));
                c0698o.e0(objH2);
            }
            boolean zBooleanValue = ((Boolean) objH2).booleanValue();
            r rVarQ = p000a.a.Q(rVar.b(androidx.compose.foundation.layout.c.f11826a), aVar2, c0698o);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarQ);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar3 = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar3);
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
            g.E(aVar2, null, c0698o, 0);
            C0672b.a(AbstractC0359n0.f5123n.a(zBooleanValue ? m.f16262s : m.f16261r), p074h0.j.d(-798694019, new b(c0515g, 1), c0698o), c0698o, 56);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a(hVar, aVar, rVar, i10, 12);
        }
    }

    public static final void h(i iVar, r rVar, C0698o c0698o, int i10) {
        c0698o.V(-1665919367);
        int i11 = (c0698o.i(iVar) ? 4 : 2) | i10;
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            p063g1.c cVar = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
            long jK = ((p005a4.a) c0698o.k(e.f11187a)).k();
            float f3 = 15;
            r rVarL = androidx.compose.foundation.layout.b.l(rVar.b(androidx.compose.foundation.layout.c.f11826a), f3, f3, f3, 0.0f, 8);
            boolean zF = c0698o.f(jK);
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (zF || objH == s10) {
                objH = new H8.i(jK, 1);
                c0698o.e0(objH);
            }
            c cVar2 = (c) objH;
            boolean zI = c0698o.i(iVar) | c0698o.g(cVar) | c0698o.i(context);
            Object objH2 = c0698o.H();
            if (zI || objH2 == s10) {
                objH2 = new Ca.h(iVar, cVar, context, 5);
                c0698o.e0(objH2);
            }
            androidx.compose.ui.viewinterop.a.a(cVar2, rVarL, (c) objH2, c0698o, 0);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I4.a(i10, 8, iVar, rVar);
        }
    }
}
