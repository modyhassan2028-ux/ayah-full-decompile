package p068g6;

import D.AbstractC0060c;
import D.AbstractC0066i;
import D.C0061d;
import D.C0076t;
import D.U;
import D.W;
import G4.f;
import G4.g;
import G9.m;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import U0.L;
import W.AbstractC0537a1;
import W.AbstractC0542b2;
import W.C1;
import W.G2;
import W.H2;
import W.V0;
import W.Z0;
import Y3.t;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import com.ayah.common.ui.view.QuranAyahTextView;
import j$.time.LocalDate;
import j$.time.chrono.HijrahDate;
import j$.time.format.TextStyle;
import j$.time.temporal.ChronoField;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l0.i;
import l0.o;
import l0.r;
import p005a4.e;
import p026c5.a;
import p074h0.d;
import p110k9.y;
import p180s0.F;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f16317a = new d(965849919, new a(8), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f16318b = new d(-753309726, new c(0), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f16319c = new d(747641156, new a(9), false);

    public static final void a(String str, int i10, NumberFormat numberFormat, C0698o c0698o, int i11) {
        j.e(str, "month");
        c0698o.V(2123235483);
        int i12 = i11 | (c0698o.g(str) ? 4 : 2) | (c0698o.e(i10) ? 32 : 16) | (c0698o.i(numberFormat) ? 256 : 128);
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            C1.a(null, ((Z0) c0698o.k(AbstractC0537a1.f8962a)).f8936c, ((p005a4.a) c0698o.k(e.f11187a)).g(), 0L, 0.0f, 0.0f, null, p074h0.j.d(747754272, new a(str, numberFormat, i10), c0698o), c0698o, 12582912, 121);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new a(str, i10, numberFormat, i11);
        }
    }

    public static final void b(p048e6.a aVar, p241y9.a aVar2, c cVar, c cVar2, r rVar, C0698o c0698o, int i10) {
        p048e6.a aVar3 = aVar;
        C0698o c0698o2 = c0698o;
        j.e(aVar3, "todayInfo");
        LocalDate localDate = aVar3.f15823a;
        j.e(aVar2, "onCloseAction");
        j.e(cVar, "onShareAction");
        j.e(cVar2, "onLibraryAction");
        c0698o2.V(1209227021);
        int i11 = i10 | (c0698o2.i(aVar3) ? 4 : 2) | (c0698o2.i(aVar2) ? 32 : 16) | (c0698o2.i(cVar) ? 256 : 128) | (c0698o2.i(cVar2) ? 2048 : 1024) | (c0698o2.g(rVar) ? 16384 : 8192);
        if (c0698o2.K(i11 & 1, (i11 & 9363) != 9362)) {
            FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
            r rVarE = p181s2.r.e(rVar.b(fillElement), p181s2.r.d(c0698o2));
            M0 m10 = e.f11187a;
            r rVarA = androidx.compose.foundation.a.a(rVarE, ((p005a4.a) c0698o2.k(m10)).d(), F.f21774a);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
            int i12 = c0698o2.f10721P;
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
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o2, i12, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC, c0285h4);
            NumberFormat numberFormat = p125m4.b.f19615b;
            Locale locale = p050e8.b.z((Configuration) c0698o2.k(AndroidCompositionLocals_androidKt.f12062a)).f1426a.get(0);
            String[] strArrL0 = p000a.a.l0(R.array.hijri_months, c0698o2);
            C0061d c0061d = AbstractC0066i.g;
            i iVar = l0.c.f19306A;
            W wA = U.a(c0061d, iVar, c0698o2, 6);
            int i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
            r rVarC2 = l0.a.c(c0698o2, fillElement);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, wA, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h3);
            }
            C0672b.v(c0698o2, rVarC2, c0285h4);
            String strM0 = p000a.a.m0(R.string.today, c0698o2);
            L l10 = ((G2) c0698o2.k(H2.f8580a)).g;
            long jM = ((p005a4.a) c0698o2.k(m10)).m();
            float f3 = 16;
            o oVar = o.f19333a;
            int i14 = i11;
            AbstractC0542b2.b(strM0, androidx.compose.foundation.layout.b.h(oVar, f3), jM, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l10, c0698o, 48, 0, 65528);
            c0698o2 = c0698o;
            boolean z10 = (i14 & 112) == 32;
            Object objH = c0698o2.H();
            S s10 = C0690k.f10683a;
            if (z10 || objH == s10) {
                objH = new A5.c(12, aVar2);
                c0698o2.e0(objH);
            }
            V0.h((p241y9.a) objH, null, false, null, f16319c, c0698o2, 196608, 30);
            c0698o2.p(true);
            W wA2 = U.a(AbstractC0066i.f982f, iVar, c0698o2, 6);
            int i15 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o2.m();
            r rVarC3 = l0.a.c(c0698o2, fillElement);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, wA2, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M3, c0285h2);
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o2, i15, c0285h3);
            }
            C0672b.v(c0698o2, rVarC3, c0285h4);
            aVar3 = aVar;
            HijrahDate hijrahDate = aVar3.f15824b;
            String str = strArrL0[hijrahDate.get(ChronoField.MONTH_OF_YEAR) - 1];
            int i16 = hijrahDate.get(ChronoField.DAY_OF_MONTH);
            j.b(numberFormat);
            a(str, i16, numberFormat, c0698o2, 0);
            String displayName = localDate.getMonth().getDisplayName(TextStyle.FULL, locale);
            j.d(displayName, "getDisplayName(...)");
            a(displayName, localDate.getDayOfMonth(), numberFormat, c0698o2, 0);
            c0698o2.p(true);
            c0698o2.T(-924145456);
            for (p048e6.b bVar : aVar3.f15825c) {
                bVar.getClass();
                c0698o2.T(-2125143737);
                String strM1 = p000a.a.m0(R.string.verse_of_the_day, c0698o2);
                c0698o2.p(false);
                int i17 = i14;
                boolean zI = c0698o2.i(bVar) | ((i17 & 896) == 256);
                Object objH2 = c0698o2.H();
                if (zI || objH2 == s10) {
                    objH2 = new f(22, cVar, bVar);
                    c0698o2.e0(objH2);
                }
                c(strM1, (p241y9.a) objH2, c0698o2, 0);
                i14 = i17;
                C0698o c0698o3 = c0698o2;
                V0.e(androidx.compose.foundation.layout.b.h(oVar, f3), null, V0.m(((p005a4.a) c0698o2.k(e.f11187a)).g(), c0698o2), null, null, p074h0.j.d(-1037273902, new A4.d(5, bVar, cVar2), c0698o2), c0698o3, 196614, 26);
                c0698o2 = c0698o3;
            }
            c0698o2.p(false);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.c(aVar3, aVar2, cVar, cVar2, rVar, i10);
        }
    }

    public static final void c(String str, p241y9.a aVar, C0698o c0698o, int i10) {
        int i11;
        C0698o c0698o2 = c0698o;
        j.e(str, "text");
        j.e(aVar, "onShareAction");
        c0698o2.V(-1382682626);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0698o2.g(str) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o2.i(aVar) ? 32 : 16;
        }
        int i12 = i11;
        if (c0698o2.K(i12 & 1, (i12 & 19) != 18)) {
            o oVar = o.f19333a;
            r rVarI = androidx.compose.foundation.layout.b.i(oVar, 25, 10);
            W wA = U.a(AbstractC0066i.f977a, l0.c.f19306A, c0698o2, 0);
            int i13 = c0698o2.f10721P;
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
            C0672b.v(c0698o2, wA, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            String upperCase = str.toUpperCase(Locale.ROOT);
            j.d(upperCase, "toUpperCase(...)");
            AbstractC0542b2.b(upperCase, new VerticalAlignElement(), ((p005a4.a) c0698o2.k(e.f11187a)).h(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).f8564i, c0698o, 0, 0, 65528);
            c0698o2 = c0698o;
            AbstractC0060c.a(c0698o2, p245z2.a.J(oVar));
            V0.h(aVar, null, false, null, f16317a, c0698o2, ((i12 >> 3) & 14) | 196608, 30);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new d(str, aVar, i10, 0);
        }
    }

    public static final void d(final SpannableStringBuilder spannableStringBuilder, C0698o c0698o, int i10) {
        c0698o.V(-147968369);
        int i11 = (c0698o.i(spannableStringBuilder) ? 4 : 2) | i10;
        if (c0698o.K(i11 & 1, (i11 & 3) != 2)) {
            final int iU = F.u(((p005a4.a) c0698o.k(e.f11187a)).k());
            r rVarJ = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.f11826a, 15, 0.0f, 2);
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new m(19);
                c0698o.e0(objH);
            }
            c cVar = (c) objH;
            boolean zE = c0698o.e(iU) | c0698o.i(spannableStringBuilder);
            Object objH2 = c0698o.H();
            if (zE || objH2 == s10) {
                objH2 = new c() { // from class: g6.e
                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        QuranAyahTextView quranAyahTextView = (QuranAyahTextView) obj;
                        j.e(quranAyahTextView, "view");
                        quranAyahTextView.setTextColor(iU);
                        quranAyahTextView.setTextDirection(4);
                        quranAyahTextView.setLayoutDirection(1);
                        quranAyahTextView.setText(spannableStringBuilder);
                        quranAyahTextView.setTextSize(22.0f);
                        return y.f19095a;
                    }
                };
                c0698o.e0(objH2);
            }
            androidx.compose.ui.viewinterop.a.a(cVar, rVarJ, (c) objH2, c0698o, 54);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G4.m(i10, 8, spannableStringBuilder);
        }
    }

    public static final void e(p124m3.j jVar, C0698o c0698o, int i10) {
        int i11;
        j.e(jVar, "verse");
        c0698o.V(-1252922568);
        int i12 = (c0698o.i(jVar) ? 4 : 2) | i10 | (c0698o.e(-1) ? 32 : 16) | (c0698o.e(-1) ? 256 : 128);
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            float density = ((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).getDensity();
            j.e(context, "context");
            String str = jVar.f19590f;
            int iMax = Math.max(-1, -1);
            if (iMax == -1) {
                i11 = 0;
            } else {
                List listN1 = H9.o.n1(str, new String[]{" "});
                if (iMax >= listN1.size()) {
                    i11 = -1;
                } else {
                    int length = 0;
                    Iterator it = listN1.subList(0, iMax).iterator();
                    while (it.hasNext()) {
                        length += ((String) it.next()).length() + 1;
                    }
                    i11 = length;
                }
            }
            E9.d dVarI0 = B0.c.i0(i11, str.length());
            j.e(str, "<this>");
            j.e(dVarI0, "range");
            String strSubstring = str.substring(dVarI0.f1995r, dVarI0.f1996s + 1);
            j.d(strSubstring, "substring(...)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strSubstring);
            float f3 = 23 * density;
            int i13 = (int) (((double) f3) * 0.85d);
            float f7 = i13;
            Y3.m mVar = new Y3.m(context, jVar, new t(16));
            mVar.a(f3);
            mVar.setBounds(0, 0, i13, (int) (1.3333334f * f7));
            p089i4.a aVar = new p089i4.a(mVar, f7 * (-0.35f));
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(aVar, length2 + 1, spannableStringBuilder.length(), 17);
            d(spannableStringBuilder, c0698o, 0);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G4.m(i10, 7, jVar);
        }
    }

    public static final void f(int i10, c cVar, C0698o c0698o, int i11) {
        j.e(cVar, "onGoToLibraryAction");
        c0698o.V(778766847);
        int i12 = (c0698o.e(i10) ? 4 : 2) | i11 | (c0698o.i(cVar) ? 32 : 16);
        if (c0698o.K(i12 & 1, (i12 & 19) != 18)) {
            boolean z10 = ((i12 & 112) == 32) | ((i12 & 14) == 4);
            Object objH = c0698o.H();
            if (z10 || objH == C0690k.f10683a) {
                objH = new g(i10, 2, cVar);
                c0698o.e0(objH);
            }
            V0.k((p241y9.a) objH, androidx.compose.foundation.layout.b.j(o.f19333a, 16, 0.0f, 2), false, null, null, null, f16318b, c0698o, 805306416, 508);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G4.d(i10, i11, cVar);
        }
    }

    public static final void g(r rVar, C0698o c0698o, int i10) {
        c0698o.V(-1904550076);
        if (c0698o.K(i10 & 1, (i10 & 3) != 2)) {
            long jI = ((p005a4.a) c0698o.k(e.f11187a)).i();
            r rVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.b.i(rVar.b(androidx.compose.foundation.layout.c.f11826a), 15, 4), 1);
            boolean zF = c0698o.f(jI);
            Object objH = c0698o.H();
            if (zF || objH == C0690k.f10683a) {
                objH = new H8.i(jI, 3);
                c0698o.e0(objH);
            }
            p171r0.f.a(rVarD, (c) objH, c0698o, 0);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new U5.b(i10, 1, rVar);
        }
    }
}
