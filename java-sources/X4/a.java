package X4;

import D.AbstractC0060c;
import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0076t;
import D.P;
import D.U;
import D.W;
import D4.j;
import D4.l;
import F9.n;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import U0.L;
import W.AbstractC0542b2;
import W.AbstractC0614y;
import W.F2;
import W.G2;
import W.H2;
import W.Q;
import W.S;
import W.V0;
import Z.C0672b;
import Z.C0677d0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.X;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import com.google.android.gms.internal.measurement.B1;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.text.NumberFormat;
import l0.h;
import l0.o;
import l0.r;
import p110k9.y;
import p180s0.F;
import p232y.j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p074h0.d f9942a = new p074h0.d(-1107796021, new A5.d(15), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p074h0.d f9943b = new p074h0.d(-1518938316, new A5.d(16), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p074h0.d f9944c = new p074h0.d(-1924622255, new A5.d(17), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p074h0.d f9945d = new p074h0.d(-816071163, new j(22, 0), false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p074h0.d f9946e = new p074h0.d(-1295448442, new A5.d(18), false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p074h0.d f9947f = new p074h0.d(1769909888, new A5.d(19), false);
    public static final p074h0.d g = new p074h0.d(-1958523774, new A5.d(20), false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p074h0.d f9948h = new p074h0.d(-796802041, new j(23, 0), false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p074h0.d f9949i = new p074h0.d(1633948424, new j(24, 0), false);

    public static final void a(String str, p124m3.j jVar, r rVar, NumberFormat numberFormat, C0698o c0698o, int i10) {
        int i11;
        p251z9.j.e(str, "title");
        c0698o.V(78649288);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(jVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.i(numberFormat) ? 2048 : 1024;
        }
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            c0698o.P();
            if ((i10 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            M0 m10 = p005a4.e.f11187a;
            float f3 = 16;
            r rVarJ = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.a.a(rVar, ((p005a4.a) c0698o.k(m10)).g(), F.f21774a), 0.0f, f3, 1);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarJ);
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
            String str2 = numberFormat.format(Integer.valueOf(jVar.c()));
            p251z9.j.d(str2, "format(...)");
            b(str, str2, null, c0698o, i11 & 14);
            p015b4.f.d(jVar.f19590f, ((p005a4.a) c0698o.k(m10)).h(), ((p005a4.a) c0698o.k(m10)).g(), n.B(17), androidx.compose.foundation.layout.b.l(o.f19333a, f3, f3, 0.0f, 0.0f, 12), 1, c0698o, 199680, 0);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.e(str, jVar, rVar, numberFormat, i10, 1);
        }
    }

    public static final void b(String str, String str2, r rVar, C0698o c0698o, int i10) {
        int i11;
        String str3;
        r rVar2;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(str, "title");
        c0698o2.V(-1611705284);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0698o2.g(str) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o2.g(str2) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if (c0698o2.K(i12 & 1, (i12 & 147) != 146)) {
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
            int i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            o oVar = o.f19333a;
            r rVarC = l0.a.c(c0698o2, oVar);
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
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC, c0285h4);
            r rVarJ = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.f11826a, 16, 0.0f, 2);
            W wA = U.a(AbstractC0066i.f977a, l0.c.f19306A, c0698o2, 0);
            int i14 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
            r rVarC2 = l0.a.c(c0698o2, rVarJ);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, wA, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o2, i14, c0285h3);
            }
            C0672b.v(c0698o2, rVarC2, c0285h4);
            M0 m10 = H2.f8580a;
            L l10 = ((G2) c0698o2.k(m10)).g;
            long jB = n.B(17);
            M0 m11 = p005a4.e.f11187a;
            AbstractC0542b2.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, L.a(l10, ((p005a4.a) c0698o2.k(m11)).k(), jB, null, null, 0L, 0L, null, 16777212), c0698o, i12 & 14, 0, 65534);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o, new LayoutWeightElement(1.0f, true));
            str3 = str2;
            AbstractC0542b2.b(str3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, L.a(((G2) c0698o.k(m10)).f8564i, ((p005a4.a) c0698o.k(m11)).j(), n.B(17), null, null, 0L, 0L, null, 16777212), c0698o, (i12 >> 3) & 14, 0, 65534);
            c0698o2 = c0698o;
            c0698o2.p(true);
            c0698o2.p(true);
            rVar2 = oVar;
        } else {
            str3 = str2;
            c0698o2.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G4.c(str, str3, rVar2, i10);
        }
    }

    public static final void c(p241y9.a aVar, p241y9.a aVar2, C0698o c0698o, int i10) {
        int i11;
        p241y9.a aVar3;
        int i12;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(aVar, "onShowNewKhatmah");
        p251z9.j.e(aVar2, "onRestartKhatmah");
        c0698o2.V(-518746383);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0698o2.i(aVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o2.i(aVar2) ? 32 : 16;
        }
        int i13 = i11;
        if (c0698o2.K(i13 & 1, (i13 & 19) != 18)) {
            h hVar = l0.c.f19310E;
            float f3 = 32;
            o oVar = o.f19333a;
            r rVarJ = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f3, 1);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, hVar, c0698o2, 48);
            int i14 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarJ);
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
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o2, i14, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            String strM0 = p000a.a.m0(R.string.khatmah_completed_message, c0698o2);
            L lA = L.a(((G2) c0698o2.k(H2.f8580a)).f8563h, 0L, n.B(18), null, null, 0L, 0L, null, 16777213);
            M0 m10 = p005a4.e.f11187a;
            float f7 = 16;
            AbstractC0542b2.b(strM0, androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 0.0f, f7, 7), ((p005a4.a) c0698o2.k(m10)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, lA, c0698o, 48, 0, 65528);
            P p10 = S.f8804a;
            Q qA = S.a(((p005a4.a) c0698o.k(m10)).l(), 0L, c0698o, 14);
            r rVarJ2 = androidx.compose.foundation.layout.b.j(oVar, f3, 0.0f, 2);
            FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
            r rVarJ3 = androidx.compose.foundation.layout.b.j(rVarJ2.b(fillElement), 0.0f, f7, 1);
            boolean z10 = (i13 & 112) == 32;
            Object objH = c0698o.H();
            Z.S s10 = C0690k.f10683a;
            if (z10 || objH == s10) {
                objH = new A5.c(9, aVar2);
                c0698o.e0(objH);
            }
            V0.d((p241y9.a) objH, rVarJ3, false, null, qA, null, null, null, f9942a, c0698o, 805306416, 492);
            Q qA2 = S.a(((p005a4.a) c0698o.k(m10)).l(), 0L, c0698o, 14);
            r rVarB = androidx.compose.foundation.layout.b.j(oVar, f3, 0.0f, 2).b(fillElement);
            i12 = 4;
            boolean z11 = (i13 & 14) == 4;
            Object objH2 = c0698o.H();
            if (z11 || objH2 == s10) {
                aVar3 = aVar;
                objH2 = new A5.c(10, aVar3);
                c0698o.e0(objH2);
            } else {
                aVar3 = aVar;
            }
            V0.d((p241y9.a) objH2, rVarB, false, null, qA2, null, null, null, f9943b, c0698o, 805306416, 492);
            c0698o2 = c0698o;
            c0698o2.p(true);
        } else {
            aVar3 = aVar;
            i12 = 4;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new l(i10, i12, aVar3, aVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:110:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:115:0x0302  */
    /* JADX WARN: Code duplicated, block: B:116:0x0304  */
    /* JADX WARN: Code duplicated, block: B:119:0x0310 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0312  */
    /* JADX WARN: Code duplicated, block: B:123:0x034e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0350  */
    /* JADX WARN: Code duplicated, block: B:127:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0362  */
    /* JADX WARN: Code duplicated, block: B:133:0x039a  */
    /* JADX WARN: Code duplicated, block: B:135:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x01af  */
    /* JADX WARN: Code duplicated, block: B:78:0x01be  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x020d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0221  */
    /* JADX WARN: Code duplicated, block: B:95:0x0227  */
    /* JADX WARN: Code duplicated, block: B:96:0x0232  */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    /* JADX WARN: Code duplicated, block: B:99:0x024d  */
    public static final void d(p095j3.a aVar, T4.b bVar, p241y9.c cVar, p241y9.c cVar2, NumberFormat numberFormat, C0698o c0698o, int i10) {
        int i11;
        NumberFormat numberFormat2;
        NumberFormat numberFormat3;
        int i12;
        Z.S s10;
        int i13;
        M0 m10;
        Context context;
        long jBetween;
        int i14;
        String string;
        int i15;
        int i16;
        boolean z10;
        boolean zI;
        Object objH;
        Z.S s11;
        final p241y9.c cVar3;
        boolean z11;
        boolean z12;
        boolean zI2;
        Object objH2;
        boolean z13;
        boolean zI3;
        Object objH3;
        boolean z14;
        final T4.b bVar2 = bVar;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(aVar, "khatmah");
        int i17 = aVar.f18754d;
        p251z9.j.e(bVar2, "khatmahDayInfo");
        p124m3.j jVar = bVar2.f7785c;
        p124m3.j jVar2 = bVar2.f7784b;
        p251z9.j.e(cVar, "onJumpToAyah");
        p251z9.j.e(cVar2, "onKhatmahDayComplete");
        c0698o2.V(-296357955);
        if ((i10 & 6) == 0) {
            i11 = (c0698o2.i(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o2.i(bVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o2.i(cVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o2.i(cVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if (c0698o2.K(i11 & 1, (i11 & 9363) != 9362)) {
            c0698o2.P();
            if ((i10 & 1) == 0 || c0698o2.w()) {
                numberFormat3 = p125m4.b.f19615b;
                p251z9.j.d(numberFormat3, "getNumberFormatter(...)");
                i12 = i11 & (-57345);
            } else {
                c0698o2.N();
                i12 = i11 & (-57345);
                numberFormat3 = numberFormat;
            }
            int i18 = i12;
            c0698o2.q();
            Object objH4 = c0698o2.H();
            Z.S s12 = C0690k.f10683a;
            if (objH4 == s12) {
                objH4 = C0672b.r(Boolean.FALSE);
                c0698o2.e0(objH4);
            }
            X x9 = (X) objH4;
            Object objH5 = c0698o2.H();
            if (objH5 == s12) {
                objH5 = new C0677d0(0L);
                c0698o2.e0(objH5);
            }
            C0677d0 c0677d0 = (C0677d0) objH5;
            I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i19 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            o oVar = o.f19333a;
            r rVarC = l0.a.c(c0698o2, oVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o2, iD, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o2, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o2.f10720O) {
                s10 = s12;
            } else {
                s10 = s12;
                if (!p251z9.j.a(c0698o2.H(), Integer.valueOf(i19))) {
                }
                C0285h c0285h4 = C0287j.f4117d;
                C0672b.v(c0698o2, rVarC, c0285h4);
                C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19310E, c0698o2, 48);
                i13 = c0698o2.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
                r rVarC2 = l0.a.c(c0698o2, oVar);
                c0698o2.X();
                if (c0698o2.f10720O) {
                    c0698o2.l(c0286i);
                } else {
                    c0698o2.h0();
                }
                C0672b.v(c0698o2, c0076tA, c0285h);
                C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
                if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i13))) {
                    p123m2.c.y(i13, c0698o2, i13, c0285h3);
                }
                C0672b.v(c0698o2, rVarC2, c0285h4);
                m10 = AndroidCompositionLocals_androidKt.f12063b;
                context = (Context) c0698o2.k(m10);
                String str = numberFormat3.format(Integer.valueOf(i17 + 1));
                p251z9.j.d(str, "format(...)");
                String strN0 = p000a.a.n0(R.string.khatmah_day, new Object[]{str}, c0698o2);
                p251z9.j.e(context, "context");
                jBetween = (((long) i17) - ChronoUnit.DAYS.between(aVar.f18752b, LocalDate.now())) - ((long) aVar.f18753c);
                if (jBetween == -1) {
                    string = context.getString(R.string.yesterday);
                    p251z9.j.b(string);
                } else if (jBetween == 0) {
                    string = context.getString(R.string.today);
                    p251z9.j.b(string);
                } else if (jBetween == 1) {
                    string = context.getString(R.string.tomorrow);
                    p251z9.j.b(string);
                } else {
                    if (jBetween > 1) {
                        if (jBetween == 2) {
                            string = context.getString(R.string.in_two_days);
                            p251z9.j.b(string);
                        } else if (jBetween < 11) {
                            i14 = 1;
                            string = context.getString(R.string.in_few_days, Long.valueOf(jBetween));
                            p251z9.j.b(string);
                            i15 = 16;
                        } else {
                            string = context.getString(R.string.in_many_days, Long.valueOf(jBetween));
                            p251z9.j.b(string);
                        }
                    } else if (jBetween == -2) {
                        string = context.getString(R.string.two_days_ago);
                        p251z9.j.b(string);
                    } else {
                        if (jBetween < -11) {
                            i14 = 1;
                            string = context.getString(R.string.few_days_ago, Long.valueOf(-jBetween));
                            p251z9.j.b(string);
                        } else {
                            i14 = 1;
                            string = context.getString(R.string.many_days_ago, Long.valueOf(-jBetween));
                            p251z9.j.b(string);
                        }
                        i15 = 16;
                    }
                    float f3 = i15;
                    e(strN0, string, androidx.compose.foundation.layout.b.j(oVar, 0.0f, f3, i14), c0698o2, 384);
                    String str2 = context.getString(R.string.khatmah_range_from) + " " + jVar2.d(context);
                    String str3 = context.getString(R.string.khatmah_range_to) + " " + jVar.d(context);
                    i16 = i18 & 896;
                    if (i16 == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar2 = bVar;
                    zI = z10 | c0698o2.i(bVar2);
                    objH = c0698o2.H();
                    if (zI) {
                        s11 = s10;
                    } else {
                        s11 = s10;
                        if (objH == s11) {
                            cVar3 = cVar;
                            z11 = false;
                        }
                        Z.S s13 = s11;
                        a(str2, jVar2, androidx.compose.foundation.a.c(oVar, z11, null, (p241y9.a) objH, 7), numberFormat3, c0698o2, 0);
                        if (i16 == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zI2 = z12 | c0698o2.i(bVar2);
                        objH2 = c0698o2.H();
                        if (zI2 || objH2 == s13) {
                            final int i20 = 1;
                            objH2 = new p241y9.a() { // from class: X4.b
                                @Override // p241y9.a
                                public final Object invoke() {
                                    switch (i20) {
                                        case 0:
                                            cVar3.e(bVar2.f7784b);
                                            break;
                                        default:
                                            cVar3.e(bVar2.f7785c);
                                            break;
                                    }
                                    return y.f19095a;
                                }
                            };
                            c0698o2.e0(objH2);
                        }
                        a(str3, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), numberFormat3, c0698o2, 0);
                        NumberFormat numberFormat4 = numberFormat3;
                        P p10 = S.f8804a;
                        Q qA = S.a(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, c0698o2, 14);
                        r rVarJ = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f3, 1);
                        if ((i18 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zI3 = z13 | c0698o2.i(aVar);
                        objH3 = c0698o2.H();
                        if (zI3 || objH3 == s13) {
                            objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                            c0698o2.e0(objH3);
                        }
                        V0.d((p241y9.a) objH3, rVarJ, false, null, qA, null, null, null, f9944c, c0698o2, 805306416, 492);
                        c0698o2 = c0698o2;
                        c0698o2.p(true);
                        if (((Boolean) x9.getValue()).booleanValue()) {
                            c0698o2.T(225719240);
                            z14 = false;
                            Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o2.k(m10)), new c(x9), c0698o2, 0);
                        } else {
                            z14 = false;
                            c0698o2.T(221730315);
                        }
                        c0698o2.p(z14);
                        c0698o2.p(true);
                        numberFormat2 = numberFormat4;
                    }
                    cVar3 = cVar;
                    z11 = false;
                    final int i21 = z11 ? 1 : 0;
                    objH = new p241y9.a() { // from class: X4.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i21) {
                                case 0:
                                    cVar3.e(bVar2.f7784b);
                                    break;
                                default:
                                    cVar3.e(bVar2.f7785c);
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o2.e0(objH);
                    Z.S s14 = s11;
                    a(str2, jVar2, androidx.compose.foundation.a.c(oVar, z11, null, (p241y9.a) objH, 7), numberFormat3, c0698o2, 0);
                    if (i16 == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zI2 = z12 | c0698o2.i(bVar2);
                    objH2 = c0698o2.H();
                    if (zI2) {
                        final int i22 = 1;
                        objH2 = new p241y9.a() { // from class: X4.b
                            @Override // p241y9.a
                            public final Object invoke() {
                                switch (i22) {
                                    case 0:
                                        cVar3.e(bVar2.f7784b);
                                        break;
                                    default:
                                        cVar3.e(bVar2.f7785c);
                                        break;
                                }
                                return y.f19095a;
                            }
                        };
                        c0698o2.e0(objH2);
                    } else {
                        final int i23 = 1;
                        objH2 = new p241y9.a() { // from class: X4.b
                            @Override // p241y9.a
                            public final Object invoke() {
                                switch (i23) {
                                    case 0:
                                        cVar3.e(bVar2.f7784b);
                                        break;
                                    default:
                                        cVar3.e(bVar2.f7785c);
                                        break;
                                }
                                return y.f19095a;
                            }
                        };
                        c0698o2.e0(objH2);
                    }
                    a(str3, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), numberFormat3, c0698o2, 0);
                    NumberFormat numberFormat5 = numberFormat3;
                    P p11 = S.f8804a;
                    Q qA2 = S.a(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, c0698o2, 14);
                    r rVarJ2 = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f3, 1);
                    if ((i18 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zI3 = z13 | c0698o2.i(aVar);
                    objH3 = c0698o2.H();
                    if (zI3) {
                        objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                        c0698o2.e0(objH3);
                    } else {
                        objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                        c0698o2.e0(objH3);
                    }
                    V0.d((p241y9.a) objH3, rVarJ2, false, null, qA2, null, null, null, f9944c, c0698o2, 805306416, 492);
                    c0698o2 = c0698o2;
                    c0698o2.p(true);
                    if (((Boolean) x9.getValue()).booleanValue()) {
                        c0698o2.T(225719240);
                        z14 = false;
                        Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o2.k(m10)), new c(x9), c0698o2, 0);
                    } else {
                        z14 = false;
                        c0698o2.T(221730315);
                    }
                    c0698o2.p(z14);
                    c0698o2.p(true);
                    numberFormat2 = numberFormat5;
                }
                i15 = 16;
                i14 = 1;
                float f7 = i15;
                e(strN0, string, androidx.compose.foundation.layout.b.j(oVar, 0.0f, f7, i14), c0698o2, 384);
                String str4 = context.getString(R.string.khatmah_range_from) + " " + jVar2.d(context);
                String str5 = context.getString(R.string.khatmah_range_to) + " " + jVar.d(context);
                i16 = i18 & 896;
                if (i16 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar2 = bVar;
                zI = z10 | c0698o2.i(bVar2);
                objH = c0698o2.H();
                if (zI) {
                    s11 = s10;
                    if (objH == s11) {
                        cVar3 = cVar;
                        z11 = false;
                    }
                    Z.S s15 = s11;
                    a(str4, jVar2, androidx.compose.foundation.a.c(oVar, z11, null, (p241y9.a) objH, 7), numberFormat3, c0698o2, 0);
                    if (i16 == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zI2 = z12 | c0698o2.i(bVar2);
                    objH2 = c0698o2.H();
                    if (zI2) {
                        final int i24 = 1;
                        objH2 = new p241y9.a() { // from class: X4.b
                            @Override // p241y9.a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        cVar3.e(bVar2.f7784b);
                                        break;
                                    default:
                                        cVar3.e(bVar2.f7785c);
                                        break;
                                }
                                return y.f19095a;
                            }
                        };
                        c0698o2.e0(objH2);
                    } else {
                        final int i25 = 1;
                        objH2 = new p241y9.a() { // from class: X4.b
                            @Override // p241y9.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        cVar3.e(bVar2.f7784b);
                                        break;
                                    default:
                                        cVar3.e(bVar2.f7785c);
                                        break;
                                }
                                return y.f19095a;
                            }
                        };
                        c0698o2.e0(objH2);
                    }
                    a(str5, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), numberFormat3, c0698o2, 0);
                    NumberFormat numberFormat6 = numberFormat3;
                    P p12 = S.f8804a;
                    Q qA3 = S.a(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, c0698o2, 14);
                    r rVarJ3 = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f7, 1);
                    if ((i18 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zI3 = z13 | c0698o2.i(aVar);
                    objH3 = c0698o2.H();
                    if (zI3) {
                        objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                        c0698o2.e0(objH3);
                    } else {
                        objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                        c0698o2.e0(objH3);
                    }
                    V0.d((p241y9.a) objH3, rVarJ3, false, null, qA3, null, null, null, f9944c, c0698o2, 805306416, 492);
                    c0698o2 = c0698o2;
                    c0698o2.p(true);
                    if (((Boolean) x9.getValue()).booleanValue()) {
                        c0698o2.T(225719240);
                        z14 = false;
                        Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o2.k(m10)), new c(x9), c0698o2, 0);
                    } else {
                        z14 = false;
                        c0698o2.T(221730315);
                    }
                    c0698o2.p(z14);
                    c0698o2.p(true);
                    numberFormat2 = numberFormat6;
                } else {
                    s11 = s10;
                }
                cVar3 = cVar;
                z11 = false;
                final int i26 = z11 ? 1 : 0;
                objH = new p241y9.a() { // from class: X4.b
                    @Override // p241y9.a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                cVar3.e(bVar2.f7784b);
                                break;
                            default:
                                cVar3.e(bVar2.f7785c);
                                break;
                        }
                        return y.f19095a;
                    }
                };
                c0698o2.e0(objH);
                Z.S s16 = s11;
                a(str4, jVar2, androidx.compose.foundation.a.c(oVar, z11, null, (p241y9.a) objH, 7), numberFormat3, c0698o2, 0);
                if (i16 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zI2 = z12 | c0698o2.i(bVar2);
                objH2 = c0698o2.H();
                if (zI2) {
                    final int i27 = 1;
                    objH2 = new p241y9.a() { // from class: X4.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    cVar3.e(bVar2.f7784b);
                                    break;
                                default:
                                    cVar3.e(bVar2.f7785c);
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o2.e0(objH2);
                } else {
                    final int i28 = 1;
                    objH2 = new p241y9.a() { // from class: X4.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i28) {
                                case 0:
                                    cVar3.e(bVar2.f7784b);
                                    break;
                                default:
                                    cVar3.e(bVar2.f7785c);
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o2.e0(objH2);
                }
                a(str5, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), numberFormat3, c0698o2, 0);
                NumberFormat numberFormat7 = numberFormat3;
                P p13 = S.f8804a;
                Q qA4 = S.a(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, c0698o2, 14);
                r rVarJ4 = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f7, 1);
                if ((i18 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zI3 = z13 | c0698o2.i(aVar);
                objH3 = c0698o2.H();
                if (zI3) {
                    objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                    c0698o2.e0(objH3);
                } else {
                    objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                    c0698o2.e0(objH3);
                }
                V0.d((p241y9.a) objH3, rVarJ4, false, null, qA4, null, null, null, f9944c, c0698o2, 805306416, 492);
                c0698o2 = c0698o2;
                c0698o2.p(true);
                if (((Boolean) x9.getValue()).booleanValue()) {
                    c0698o2.T(225719240);
                    z14 = false;
                    Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o2.k(m10)), new c(x9), c0698o2, 0);
                } else {
                    z14 = false;
                    c0698o2.T(221730315);
                }
                c0698o2.p(z14);
                c0698o2.p(true);
                numberFormat2 = numberFormat7;
            }
            p123m2.c.y(i19, c0698o2, i19, c0285h3);
            C0285h c0285h5 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC, c0285h5);
            C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, l0.c.f19310E, c0698o2, 48);
            i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o2.m();
            r rVarC3 = l0.a.c(c0698o2, oVar);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, c0076tA2, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M3, c0285h2);
            if (c0698o2.f10720O) {
                p123m2.c.y(i13, c0698o2, i13, c0285h3);
            } else {
                p123m2.c.y(i13, c0698o2, i13, c0285h3);
            }
            C0672b.v(c0698o2, rVarC3, c0285h5);
            m10 = AndroidCompositionLocals_androidKt.f12063b;
            context = (Context) c0698o2.k(m10);
            String str6 = numberFormat3.format(Integer.valueOf(i17 + 1));
            p251z9.j.d(str6, "format(...)");
            String strN1 = p000a.a.n0(R.string.khatmah_day, new Object[]{str6}, c0698o2);
            p251z9.j.e(context, "context");
            jBetween = (((long) i17) - ChronoUnit.DAYS.between(aVar.f18752b, LocalDate.now())) - ((long) aVar.f18753c);
            if (jBetween == -1) {
                string = context.getString(R.string.yesterday);
                p251z9.j.b(string);
            } else if (jBetween == 0) {
                string = context.getString(R.string.today);
                p251z9.j.b(string);
            } else if (jBetween == 1) {
                string = context.getString(R.string.tomorrow);
                p251z9.j.b(string);
            } else {
                if (jBetween > 1) {
                    if (jBetween == 2) {
                        string = context.getString(R.string.in_two_days);
                        p251z9.j.b(string);
                    } else if (jBetween < 11) {
                        i14 = 1;
                        string = context.getString(R.string.in_few_days, Long.valueOf(jBetween));
                        p251z9.j.b(string);
                        i15 = 16;
                    } else {
                        string = context.getString(R.string.in_many_days, Long.valueOf(jBetween));
                        p251z9.j.b(string);
                    }
                } else if (jBetween == -2) {
                    string = context.getString(R.string.two_days_ago);
                    p251z9.j.b(string);
                } else {
                    if (jBetween < -11) {
                        i14 = 1;
                        string = context.getString(R.string.few_days_ago, Long.valueOf(-jBetween));
                        p251z9.j.b(string);
                    } else {
                        i14 = 1;
                        string = context.getString(R.string.many_days_ago, Long.valueOf(-jBetween));
                        p251z9.j.b(string);
                    }
                    i15 = 16;
                }
                float f10 = i15;
                e(strN1, string, androidx.compose.foundation.layout.b.j(oVar, 0.0f, f10, i14), c0698o2, 384);
                String str7 = context.getString(R.string.khatmah_range_from) + " " + jVar2.d(context);
                String str8 = context.getString(R.string.khatmah_range_to) + " " + jVar.d(context);
                i16 = i18 & 896;
                if (i16 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar2 = bVar;
                zI = z10 | c0698o2.i(bVar2);
                objH = c0698o2.H();
                if (zI) {
                    s11 = s10;
                    if (objH == s11) {
                        cVar3 = cVar;
                        z11 = false;
                    }
                    Z.S s17 = s11;
                    a(str7, jVar2, androidx.compose.foundation.a.c(oVar, z11, null, (p241y9.a) objH, 7), numberFormat3, c0698o2, 0);
                    if (i16 == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zI2 = z12 | c0698o2.i(bVar2);
                    objH2 = c0698o2.H();
                    if (zI2) {
                        final int i29 = 1;
                        objH2 = new p241y9.a() { // from class: X4.b
                            @Override // p241y9.a
                            public final Object invoke() {
                                switch (i29) {
                                    case 0:
                                        cVar3.e(bVar2.f7784b);
                                        break;
                                    default:
                                        cVar3.e(bVar2.f7785c);
                                        break;
                                }
                                return y.f19095a;
                            }
                        };
                        c0698o2.e0(objH2);
                    } else {
                        final int i210 = 1;
                        objH2 = new p241y9.a() { // from class: X4.b
                            @Override // p241y9.a
                            public final Object invoke() {
                                switch (i210) {
                                    case 0:
                                        cVar3.e(bVar2.f7784b);
                                        break;
                                    default:
                                        cVar3.e(bVar2.f7785c);
                                        break;
                                }
                                return y.f19095a;
                            }
                        };
                        c0698o2.e0(objH2);
                    }
                    a(str8, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), numberFormat3, c0698o2, 0);
                    NumberFormat numberFormat8 = numberFormat3;
                    P p14 = S.f8804a;
                    Q qA5 = S.a(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, c0698o2, 14);
                    r rVarJ5 = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f10, 1);
                    if ((i18 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zI3 = z13 | c0698o2.i(aVar);
                    objH3 = c0698o2.H();
                    if (zI3) {
                        objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                        c0698o2.e0(objH3);
                    } else {
                        objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                        c0698o2.e0(objH3);
                    }
                    V0.d((p241y9.a) objH3, rVarJ5, false, null, qA5, null, null, null, f9944c, c0698o2, 805306416, 492);
                    c0698o2 = c0698o2;
                    c0698o2.p(true);
                    if (((Boolean) x9.getValue()).booleanValue()) {
                        c0698o2.T(225719240);
                        z14 = false;
                        Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o2.k(m10)), new c(x9), c0698o2, 0);
                    } else {
                        z14 = false;
                        c0698o2.T(221730315);
                    }
                    c0698o2.p(z14);
                    c0698o2.p(true);
                    numberFormat2 = numberFormat8;
                } else {
                    s11 = s10;
                }
                cVar3 = cVar;
                z11 = false;
                final int i211 = z11 ? 1 : 0;
                objH = new p241y9.a() { // from class: X4.b
                    @Override // p241y9.a
                    public final Object invoke() {
                        switch (i211) {
                            case 0:
                                cVar3.e(bVar2.f7784b);
                                break;
                            default:
                                cVar3.e(bVar2.f7785c);
                                break;
                        }
                        return y.f19095a;
                    }
                };
                c0698o2.e0(objH);
                Z.S s18 = s11;
                a(str7, jVar2, androidx.compose.foundation.a.c(oVar, z11, null, (p241y9.a) objH, 7), numberFormat3, c0698o2, 0);
                if (i16 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zI2 = z12 | c0698o2.i(bVar2);
                objH2 = c0698o2.H();
                if (zI2) {
                    final int i212 = 1;
                    objH2 = new p241y9.a() { // from class: X4.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i212) {
                                case 0:
                                    cVar3.e(bVar2.f7784b);
                                    break;
                                default:
                                    cVar3.e(bVar2.f7785c);
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o2.e0(objH2);
                } else {
                    final int i213 = 1;
                    objH2 = new p241y9.a() { // from class: X4.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i213) {
                                case 0:
                                    cVar3.e(bVar2.f7784b);
                                    break;
                                default:
                                    cVar3.e(bVar2.f7785c);
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o2.e0(objH2);
                }
                a(str8, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), numberFormat3, c0698o2, 0);
                NumberFormat numberFormat9 = numberFormat3;
                P p15 = S.f8804a;
                Q qA6 = S.a(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, c0698o2, 14);
                r rVarJ6 = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f10, 1);
                if ((i18 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zI3 = z13 | c0698o2.i(aVar);
                objH3 = c0698o2.H();
                if (zI3) {
                    objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                    c0698o2.e0(objH3);
                } else {
                    objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                    c0698o2.e0(objH3);
                }
                V0.d((p241y9.a) objH3, rVarJ6, false, null, qA6, null, null, null, f9944c, c0698o2, 805306416, 492);
                c0698o2 = c0698o2;
                c0698o2.p(true);
                if (((Boolean) x9.getValue()).booleanValue()) {
                    c0698o2.T(225719240);
                    z14 = false;
                    Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o2.k(m10)), new c(x9), c0698o2, 0);
                } else {
                    z14 = false;
                    c0698o2.T(221730315);
                }
                c0698o2.p(z14);
                c0698o2.p(true);
                numberFormat2 = numberFormat9;
            }
            i15 = 16;
            i14 = 1;
            float f11 = i15;
            e(strN1, string, androidx.compose.foundation.layout.b.j(oVar, 0.0f, f11, i14), c0698o2, 384);
            String str9 = context.getString(R.string.khatmah_range_from) + " " + jVar2.d(context);
            String str10 = context.getString(R.string.khatmah_range_to) + " " + jVar.d(context);
            i16 = i18 & 896;
            if (i16 == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            bVar2 = bVar;
            zI = z10 | c0698o2.i(bVar2);
            objH = c0698o2.H();
            if (zI) {
                s11 = s10;
                if (objH == s11) {
                    cVar3 = cVar;
                    z11 = false;
                }
                Z.S s19 = s11;
                a(str9, jVar2, androidx.compose.foundation.a.c(oVar, z11, null, (p241y9.a) objH, 7), numberFormat3, c0698o2, 0);
                if (i16 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zI2 = z12 | c0698o2.i(bVar2);
                objH2 = c0698o2.H();
                if (zI2) {
                    final int i214 = 1;
                    objH2 = new p241y9.a() { // from class: X4.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i214) {
                                case 0:
                                    cVar3.e(bVar2.f7784b);
                                    break;
                                default:
                                    cVar3.e(bVar2.f7785c);
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o2.e0(objH2);
                } else {
                    final int i215 = 1;
                    objH2 = new p241y9.a() { // from class: X4.b
                        @Override // p241y9.a
                        public final Object invoke() {
                            switch (i215) {
                                case 0:
                                    cVar3.e(bVar2.f7784b);
                                    break;
                                default:
                                    cVar3.e(bVar2.f7785c);
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                    c0698o2.e0(objH2);
                }
                a(str10, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), numberFormat3, c0698o2, 0);
                NumberFormat numberFormat10 = numberFormat3;
                P p16 = S.f8804a;
                Q qA7 = S.a(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, c0698o2, 14);
                r rVarJ7 = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f11, 1);
                if ((i18 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zI3 = z13 | c0698o2.i(aVar);
                objH3 = c0698o2.H();
                if (zI3) {
                    objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                    c0698o2.e0(objH3);
                } else {
                    objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                    c0698o2.e0(objH3);
                }
                V0.d((p241y9.a) objH3, rVarJ7, false, null, qA7, null, null, null, f9944c, c0698o2, 805306416, 492);
                c0698o2 = c0698o2;
                c0698o2.p(true);
                if (((Boolean) x9.getValue()).booleanValue()) {
                    c0698o2.T(225719240);
                    z14 = false;
                    Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o2.k(m10)), new c(x9), c0698o2, 0);
                } else {
                    z14 = false;
                    c0698o2.T(221730315);
                }
                c0698o2.p(z14);
                c0698o2.p(true);
                numberFormat2 = numberFormat10;
            } else {
                s11 = s10;
            }
            cVar3 = cVar;
            z11 = false;
            final int i216 = z11 ? 1 : 0;
            objH = new p241y9.a() { // from class: X4.b
                @Override // p241y9.a
                public final Object invoke() {
                    switch (i216) {
                        case 0:
                            cVar3.e(bVar2.f7784b);
                            break;
                        default:
                            cVar3.e(bVar2.f7785c);
                            break;
                    }
                    return y.f19095a;
                }
            };
            c0698o2.e0(objH);
            Z.S s110 = s11;
            a(str9, jVar2, androidx.compose.foundation.a.c(oVar, z11, null, (p241y9.a) objH, 7), numberFormat3, c0698o2, 0);
            if (i16 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            zI2 = z12 | c0698o2.i(bVar2);
            objH2 = c0698o2.H();
            if (zI2) {
                final int i217 = 1;
                objH2 = new p241y9.a() { // from class: X4.b
                    @Override // p241y9.a
                    public final Object invoke() {
                        switch (i217) {
                            case 0:
                                cVar3.e(bVar2.f7784b);
                                break;
                            default:
                                cVar3.e(bVar2.f7785c);
                                break;
                        }
                        return y.f19095a;
                    }
                };
                c0698o2.e0(objH2);
            } else {
                final int i218 = 1;
                objH2 = new p241y9.a() { // from class: X4.b
                    @Override // p241y9.a
                    public final Object invoke() {
                        switch (i218) {
                            case 0:
                                cVar3.e(bVar2.f7784b);
                                break;
                            default:
                                cVar3.e(bVar2.f7785c);
                                break;
                        }
                        return y.f19095a;
                    }
                };
                c0698o2.e0(objH2);
            }
            a(str10, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), numberFormat3, c0698o2, 0);
            NumberFormat numberFormat11 = numberFormat3;
            P p17 = S.f8804a;
            Q qA8 = S.a(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, c0698o2, 14);
            r rVarJ8 = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f11, 1);
            if ((i18 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            zI3 = z13 | c0698o2.i(aVar);
            objH3 = c0698o2.H();
            if (zI3) {
                objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                c0698o2.e0(objH3);
            } else {
                objH3 = new P3.a(cVar2, aVar, c0677d0, x9);
                c0698o2.e0(objH3);
            }
            V0.d((p241y9.a) objH3, rVarJ8, false, null, qA8, null, null, null, f9944c, c0698o2, 805306416, 492);
            c0698o2 = c0698o2;
            c0698o2.p(true);
            if (((Boolean) x9.getValue()).booleanValue()) {
                c0698o2.T(225719240);
                z14 = false;
                Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o2.k(m10)), new c(x9), c0698o2, 0);
            } else {
                z14 = false;
                c0698o2.T(221730315);
            }
            c0698o2.p(z14);
            c0698o2.p(true);
            numberFormat2 = numberFormat11;
        } else {
            c0698o2.N();
            numberFormat2 = numberFormat;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G4.e(aVar, bVar2, cVar, cVar2, numberFormat2, i10);
        }
    }

    public static final void e(String str, String str2, r rVar, C0698o c0698o, int i10) {
        C0698o c0698o2 = c0698o;
        p251z9.j.e(str, "title");
        c0698o2.V(-535080932);
        int i11 = i10 | (c0698o2.g(str) ? 4 : 2) | (c0698o2.g(str2) ? 32 : 16);
        if (c0698o2.K(i11 & 1, (i11 & 147) != 146)) {
            r rVarJ = androidx.compose.foundation.layout.b.j(rVar.b(androidx.compose.foundation.layout.c.f11826a), 16, 0.0f, 2);
            W wA = U.a(AbstractC0066i.f977a, l0.c.f19306A, c0698o2, 0);
            int i12 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarJ);
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
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o2, i12, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            M0 m10 = H2.f8580a;
            L l10 = ((G2) c0698o2.k(m10)).g;
            long jB = n.B(17);
            M0 m11 = p005a4.e.f11187a;
            AbstractC0542b2.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, L.a(l10, ((p005a4.a) c0698o2.k(m11)).h(), jB, null, null, 0L, 0L, null, 16777212), c0698o, i11 & 14, 0, 65534);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o, new LayoutWeightElement(1.0f, true));
            AbstractC0542b2.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, L.a(((G2) c0698o.k(m10)).f8564i, ((p005a4.a) c0698o.k(m11)).j(), n.B(17), null, null, 0L, 0L, null, 16777212), c0698o, (i11 >> 3) & 14, 0, 65534);
            c0698o2 = c0698o;
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new d(str, str2, rVar, i10, 0);
        }
    }

    public static final void f(p241y9.a aVar, p095j3.c cVar, p241y9.e eVar, C0698o c0698o, int i10) {
        C0698o c0698o2 = c0698o;
        p251z9.j.e(aVar, "onDismiss");
        p251z9.j.e(cVar, "khatmahPlan");
        p251z9.j.e(eVar, "khatmahInfoFetcher");
        c0698o2.V(-538919534);
        int i11 = 4;
        int i12 = i10 | (c0698o2.e(R.string.all_days) ? 4 : 2) | (c0698o2.i(aVar) ? 32 : 16) | (c0698o2.e(cVar.ordinal()) ? 256 : 128) | (c0698o2.i(eVar) ? 2048 : 1024);
        byte b5 = 0;
        if (c0698o2.K(i12 & 1, (i12 & 1171) != 1170)) {
            FillElement fillElement = androidx.compose.foundation.layout.c.f11828c;
            M0 m10 = p005a4.e.f11187a;
            r rVarA = androidx.compose.foundation.a.a(fillElement, ((p005a4.a) c0698o2.k(m10)).d(), F.f21774a);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
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
            C0672b.v(c0698o2, c0076tA, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            float f3 = F2.f8543a;
            AbstractC0614y.b(p074h0.j.d(715225540, new j(25, b5), c0698o2), null, p074h0.j.d(-139313918, new A5.f(aVar, i11, b5), c0698o2), null, 0.0f, null, F2.a(((p005a4.a) c0698o2.k(m10)).d(), c0698o2), c0698o, 390, 186);
            int i14 = i12 >> 6;
            c0698o2 = c0698o;
            p017b7.g.D(cVar, eVar, p181s2.r.e(o.f19333a, p181s2.r.d(c0698o)), null, null, c0698o2, (i14 & 14) | 3072 | (i14 & 112), 16);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a(aVar, cVar, eVar, i10, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final T4.a aVar, final p241y9.c cVar, final p241y9.a aVar2, final p241y9.e eVar, final p241y9.c cVar2, final p241y9.a aVar3, final p241y9.c cVar3, p241y9.a aVar4, NumberFormat numberFormat, C0698o c0698o, final int i10) {
        final p241y9.a aVar5;
        final NumberFormat numberFormat2;
        NumberFormat numberFormat3;
        int i11;
        boolean z10;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(aVar, "khatmahInfo");
        p251z9.j.e(cVar, "onJumpToAyah");
        p251z9.j.e(aVar2, "onShowDayInfo");
        p251z9.j.e(eVar, "onToggleReminders");
        p251z9.j.e(cVar2, "onKhatmahDayComplete");
        p251z9.j.e(aVar3, "onShowNewKhatmah");
        p251z9.j.e(cVar3, "onRestartKhatmah");
        p251z9.j.e(aVar4, "onDeleteKhatmah");
        c0698o2.V(239832579);
        int i12 = (c0698o2.i(aVar) ? 4 : 2) | i10 | (c0698o2.i(cVar) ? 32 : 16);
        if ((i10 & 384) == 0) {
            i12 |= c0698o2.i(aVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0698o2.i(eVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o2.i(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0698o2.i(aVar3) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c0698o2.i(cVar3) ? 1048576 : 524288;
        }
        int i13 = i12 | (c0698o2.i(aVar4) ? 8388608 : 4194304) | 33554432;
        if (c0698o2.K(i13 & 1, (38347923 & i13) != 38347922)) {
            c0698o2.P();
            if ((i10 & 1) == 0 || c0698o2.w()) {
                numberFormat3 = p125m4.b.f19615b;
                p251z9.j.d(numberFormat3, "getNumberFormatter(...)");
                i11 = i13 & (-234881025);
            } else {
                c0698o2.N();
                i11 = i13 & (-234881025);
                numberFormat3 = numberFormat;
            }
            c0698o2.q();
            j0 j0VarD = p181s2.r.d(c0698o2);
            o oVar = o.f19333a;
            r rVarE = p181s2.r.e(oVar, j0VarD);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19310E, c0698o2, 48);
            int i14 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarE);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o2.X();
            int i15 = i11;
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, c0076tA, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o2, i14, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            B1.d(0, c0698o2);
            p095j3.a aVar6 = aVar.f7781a;
            p251z9.j.e(aVar6, "<this>");
            int i16 = aVar6.f18754d;
            int iB = aVar6.f18751a.b();
            Z.S s10 = C0690k.f10683a;
            if (i16 >= iB) {
                c0698o2.T(-23593399);
                boolean zI = ((i15 & 3670016) == 1048576) | c0698o2.i(aVar6);
                Object objH = c0698o2.H();
                if (zI || objH == s10) {
                    objH = new G4.f(11, cVar3, aVar6);
                    c0698o2.e0(objH);
                }
                c(aVar3, (p241y9.a) objH, c0698o2, (i15 >> 15) & 14);
                c0698o2.p(false);
            } else {
                c0698o2.T(-23445746);
                d(aVar6, (T4.b) aVar.f7782b.get(i16), cVar, cVar2, null, c0698o, ((i15 << 3) & 896) | ((i15 >> 3) & 7168));
                c0698o.p(false);
            }
            FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
            p000a.a.b(R.string.reminder, -1, fillElement, c0698o, 432, 0);
            k3.f fVar = new k3.f(k3.a.DAILY_READING);
            LocalTime localTime = aVar6.f18756f;
            boolean z11 = aVar6.f18755e;
            boolean z12 = (i15 & 7168) == 2048;
            Object objH2 = c0698o.H();
            int i17 = 6;
            if (z12 || objH2 == s10) {
                objH2 = new A4.f(i17, eVar);
                c0698o.e0(objH2);
            }
            DateTimeFormatter dateTimeFormatter = p125m4.b.f19616c;
            p251z9.j.d(dateTimeFormatter, "getTimeFormatter(...)");
            p015b4.f.k(localTime, z11, R.string.khatmah_daily_reading, null, fVar, (p241y9.f) objH2, dateTimeFormatter, c0698o, 3072);
            P p10 = S.f8804a;
            M0 m10 = p005a4.e.f11187a;
            float f3 = 16;
            NumberFormat numberFormat4 = numberFormat3;
            V0.d(aVar2, androidx.compose.foundation.layout.b.j(oVar, 0.0f, f3, 1).b(fillElement), false, null, S.a(((p005a4.a) c0698o.k(m10)).g(), 0L, c0698o, 14), null, null, null, p074h0.j.d(1484506717, new A4.d(3, numberFormat3, aVar6), c0698o), c0698o, ((i15 >> 6) & 14) | 805306416, 492);
            Object objH3 = c0698o.H();
            if (objH3 == s10) {
                objH3 = C0672b.r(Boolean.FALSE);
                c0698o.e0(objH3);
            }
            X x9 = (X) objH3;
            Q qA = S.a(((p005a4.a) c0698o.k(m10)).g(), 0L, c0698o, 14);
            r rVarB = androidx.compose.foundation.layout.b.j(oVar, 0.0f, f3, 1).b(fillElement);
            Object objH4 = c0698o.H();
            if (objH4 == s10) {
                objH4 = new A4.h(x9, 6);
                c0698o.e0(objH4);
            }
            V0.d((p241y9.a) objH4, rVarB, false, null, qA, null, null, null, f9946e, c0698o, 805306422, 492);
            c0698o2 = c0698o;
            if (((Boolean) x9.getValue()).booleanValue()) {
                c0698o2.T(-21293819);
                long jD = ((p005a4.a) c0698o2.k(m10)).d();
                Object objH5 = c0698o2.H();
                if (objH5 == s10) {
                    objH5 = new A4.h(x9, 7);
                    c0698o2.e0(objH5);
                }
                aVar5 = aVar4;
                z10 = false;
                V0.a((p241y9.a) objH5, p074h0.j.d(-1929869309, new I4.a(3, aVar5, x9), c0698o2), null, p074h0.j.d(-1363335675, new e(x9, 0 == true ? 1 : 0), c0698o2), f9948h, f9949i, null, jD, 0L, 0L, 0L, 0.0f, null, c0698o2, 1772598, 16020);
            } else {
                aVar5 = aVar4;
                z10 = false;
                c0698o2.T(-25890251);
            }
            c0698o2.p(z10);
            c0698o2.p(true);
            numberFormat2 = numberFormat4;
        } else {
            aVar5 = aVar4;
            c0698o2.N();
            numberFormat2 = numberFormat;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p241y9.e() { // from class: X4.f
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.g(aVar, cVar, aVar2, eVar, cVar2, aVar3, cVar3, aVar5, numberFormat2, (C0698o) obj, C0672b.y(i10 | 1));
                    return y.f19095a;
                }
            };
        }
    }
}
