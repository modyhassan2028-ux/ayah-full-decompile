package A5;

import D.AbstractC0060c;
import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0059b;
import D.C0061d;
import D.C0076t;
import D.M;
import D.Z;
import D.f0;
import D.h0;
import F9.n;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import U0.L;
import W.AbstractC0542b2;
import W.G2;
import W.H2;
import W.V0;
import Y0.l;
import Z.C0672b;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.ayah.R;
import i7.B;
import java.util.WeakHashMap;
import l0.h;
import l0.o;
import l0.r;
import p180s0.F;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p074h0.d f548a = new p074h0.d(511995894, new d(0), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p074h0.d f549b = new p074h0.d(1744144793, new d(1), false);

    public static final void a(p241y9.a aVar, C0698o c0698o, int i10) {
        int i11;
        p241y9.a aVar2;
        C0698o c0698o2 = c0698o;
        j.e(aVar, "onContinueClicked");
        c0698o2.V(391341675);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0698o2.i(aVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        int i12 = 0;
        if (c0698o2.K(i11 & 1, (i11 & 3) != 2)) {
            long j = B9.a.j(R.color.background, c0698o2);
            B b5 = F.f21774a;
            o oVar = o.f19333a;
            r rVarB = androidx.compose.foundation.a.a(oVar, j, b5).b(androidx.compose.foundation.layout.c.f11828c);
            WeakHashMap weakHashMap = f0.f955u;
            r rVarA = h0.a(rVarB, new M(new Z(new Z(C0059b.f(c0698o2).g, C0059b.f(c0698o2).f960e), C0059b.f(c0698o2).f957b), 16 | AbstractC0060c.g));
            C0059b c0059b = AbstractC0066i.f979c;
            h hVar = l0.c.f19309D;
            C0076t c0076tA = D.r.a(c0059b, hVar, c0698o2, 0);
            int i13 = c0698o2.f10721P;
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
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o2, c0076tA, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o2, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC, c0285h4);
            C0061d c0061d = AbstractC0066i.f981e;
            r rVarC2 = androidx.compose.foundation.layout.c.c(oVar, 0.5f);
            h hVar2 = l0.c.f19310E;
            r rVarB2 = rVarC2.b(new HorizontalAlignElement(hVar2));
            C0076t c0076tA2 = D.r.a(c0061d, hVar, c0698o2, 6);
            int i14 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
            r rVarC3 = l0.a.c(c0698o2, rVarB2);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, c0076tA2, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o2, i14, c0285h3);
            }
            C0672b.v(c0698o2, rVarC3, c0285h4);
            p181s2.o.b(n.M(2131231029, c0698o2), p000a.a.m0(R.string.tip_description, c0698o2), null, null, null, 0.0f, null, c0698o, 0, 124);
            c0698o.p(true);
            r rVarC4 = androidx.compose.foundation.layout.c.c(oVar, 1.0f);
            C0076t c0076tA3 = D.r.a(c0059b, hVar, c0698o, 0);
            int i15 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
            r rVarC5 = l0.a.c(c0698o, rVarC4);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA3, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M3, c0285h2);
            if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o, i15, c0285h3);
            }
            C0672b.v(c0698o, rVarC5, c0285h4);
            String strM0 = p000a.a.m0(R.string.tip, c0698o);
            M0 m10 = H2.f8580a;
            L l10 = ((G2) c0698o.k(m10)).g;
            M0 m11 = p005a4.e.f11187a;
            AbstractC0542b2.b(strM0, androidx.compose.foundation.layout.b.l(new HorizontalAlignElement(hVar2), 0.0f, 0.0f, 0.0f, 8, 7), ((p005a4.a) c0698o.k(m11)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l10, c0698o, 0, 0, 65528);
            AbstractC0542b2.b(p000a.a.m0(R.string.tip_description, c0698o), new HorizontalAlignElement(hVar2), ((p005a4.a) c0698o.k(m11)).h(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(m10)).f8564i, c0698o, 0, 0, 65528);
            c0698o2 = c0698o;
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o2, new LayoutWeightElement(1.0f, true).b(androidx.compose.foundation.layout.c.f11826a));
            i12 = 0;
            aVar2 = aVar;
            V0.e(null, null, V0.m(B9.a.j(R.color.secondary_background, c0698o2), c0698o2), null, null, p074h0.j.d(1902681600, new a(i12, aVar2), c0698o2), c0698o2, 196608, 27);
            c0698o2.p(true);
            c0698o2.p(true);
        } else {
            aVar2 = aVar;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new b(i10, i12, aVar2);
        }
    }

    public static final void b(p241y9.a aVar, C0698o c0698o, int i10) {
        p241y9.a aVar2;
        C0698o c0698o2;
        j.e(aVar, "onContinueClicked");
        c0698o.V(451958699);
        if (c0698o.K(i10 & 1, (i10 & 3) != 2)) {
            long j = B9.a.j(R.color.background, c0698o);
            B b5 = F.f21774a;
            o oVar = o.f19333a;
            r rVarB = androidx.compose.foundation.a.a(oVar, j, b5).b(androidx.compose.foundation.layout.c.f11828c);
            WeakHashMap weakHashMap = f0.f955u;
            r rVarA = h0.a(rVarB, new M(new Z(new Z(C0059b.f(c0698o).g, C0059b.f(c0698o).f960e), C0059b.f(c0698o).f957b), AbstractC0060c.g | 16));
            I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i11 = c0698o.f10721P;
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
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o, iD, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i11))) {
                p123m2.c.y(i11, c0698o, i11, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            r rVarE = p181s2.r.e(oVar, p181s2.r.d(c0698o));
            FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
            r rVarL = androidx.compose.foundation.layout.b.l(rVarE.b(fillElement), 0.0f, 0.0f, 0.0f, 120, 7);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            r rVarC2 = l0.a.c(c0698o, rVarL);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
            if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h3);
            }
            C0672b.v(c0698o, rVarC2, c0285h4);
            p215w0.b bVarM = n.M(2131230840, c0698o);
            h hVar = l0.c.f19310E;
            p181s2.o.b(bVarM, null, androidx.compose.foundation.layout.b.l(new HorizontalAlignElement(hVar), 0.0f, 80, 0.0f, 52, 5), null, null, 0.0f, null, c0698o, 48, 120);
            String strM0 = p000a.a.m0(R.string.onboarding_welcome_to_ayah, c0698o);
            M0 m10 = H2.f8580a;
            L l10 = ((G2) c0698o.k(m10)).f8562f;
            M0 m11 = p005a4.e.f11187a;
            AbstractC0542b2.b(strM0, androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 0.0f, 16, 7).b(new HorizontalAlignElement(hVar)), ((p005a4.a) c0698o.k(m11)).k(), n.B(28), null, null, 0L, null, 0L, 0, false, 0, 0, l10, c0698o, 3072, 0, 65520);
            AbstractC0542b2.b(p000a.a.m0(R.string.onboarding_welcome_to_ayah_description, c0698o), androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 0.0f, 110, 7).b(new HorizontalAlignElement(hVar)), ((p005a4.a) c0698o.k(m11)).h(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, L.a(((G2) c0698o.k(m10)).f8563h, 0L, n.B(18), l.f10361v, null, 0L, 0L, null, 16777209), c0698o, 0, 0, 65528);
            c0698o.p(true);
            aVar2 = aVar;
            V0.e(androidx.compose.foundation.layout.a.f11825a.a(fillElement, l0.c.f19320y), null, V0.m(B9.a.j(R.color.secondary_background, c0698o), c0698o), null, null, p074h0.j.d(-1173426013, new a(1, aVar2), c0698o), c0698o, 196608, 26);
            c0698o2 = c0698o;
            c0698o2.p(true);
        } else {
            aVar2 = aVar;
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new f(i10, aVar2);
        }
    }
}
