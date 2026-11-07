package P3;

import A4.h;
import D.AbstractC0066i;
import D.C0059b;
import D.C0076t;
import D.U;
import D.W;
import F9.n;
import G9.m;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.AbstractC0542b2;
import W.C0;
import W.C1;
import W.G2;
import W.H2;
import W.V0;
import W.W0;
import W.X0;
import Y0.l;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import Z.X;
import Z0.y;
import android.content.Context;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import l0.i;
import l0.o;
import l0.r;
import p151p.C1256n;
import p162q0.p;
import p180s0.C1303l;
import p180s0.L;
import p180s0.q;
import p224x0.C1441e;
import p224x0.C1442f;
import p224x0.G;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p074h0.d f6630a = new p074h0.d(2034103921, new A5.d(10), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p074h0.d f6631b = new p074h0.d(1843471194, new A5.d(11), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p074h0.d f6632c = new p074h0.d(-429149660, new A5.d(12), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p074h0.d f6633d = new p074h0.d(-1113379965, new A5.d(13), false);

    public static final void a(String str, M3.a aVar, p241y9.e eVar, r rVar, C0698o c0698o, int i10) {
        r rVar2;
        boolean z10;
        C0698o c0698o2 = c0698o;
        j.e(str, "currentBookmarkName");
        j.e(eVar, "onBookmarkRenamed");
        c0698o2.V(53667259);
        int i11 = i10 | (c0698o2.g(str) ? 4 : 2) | (c0698o2.e(aVar.ordinal()) ? 32 : 16) | (c0698o2.i(eVar) ? 256 : 128) | 3072;
        if (c0698o2.K(i11 & 1, (i11 & 1171) != 1170)) {
            Object objH = c0698o2.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new p();
                c0698o2.e0(objH);
            }
            p pVar = (p) objH;
            Object objH2 = c0698o2.H();
            if (objH2 == s10) {
                objH2 = C0672b.r(Boolean.FALSE);
                c0698o2.e0(objH2);
            }
            X x9 = (X) objH2;
            C1442f c1442fB = B9.a.f653b;
            if (c1442fB == null) {
                C1441e c1441e = new C1441e("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i12 = G.f24154a;
                L l10 = new L(q.f21839b);
                C1256n c1256n = new C1256n(13);
                ArrayList arrayList = (ArrayList) c1256n.f20747s;
                c1256n.j(11.0f, 7.0f);
                c1256n.d(2.0f);
                c1256n.o(2.0f);
                c1256n.d(-2.0f);
                c1256n.a();
                c1256n.j(11.0f, 11.0f);
                c1256n.d(2.0f);
                c1256n.o(6.0f);
                c1256n.d(-2.0f);
                c1256n.a();
                c1256n.j(12.0f, 2.0f);
                c1256n.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                c1256n.m(4.48f, 10.0f, 10.0f, 10.0f);
                c1256n.m(10.0f, -4.48f, 10.0f, -10.0f);
                arrayList.add(new p224x0.p(17.52f, 2.0f, 12.0f, 2.0f));
                c1256n.a();
                c1256n.j(12.0f, 20.0f);
                c1256n.c(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                c1256n.m(3.59f, -8.0f, 8.0f, -8.0f);
                c1256n.m(8.0f, 3.59f, 8.0f, 8.0f);
                c1256n.m(-3.59f, 8.0f, -8.0f, 8.0f);
                c1256n.a();
                C1441e.a(c1441e, arrayList, l10);
                c1442fB = c1441e.b();
                B9.a.f653b = c1442fB;
            }
            C1442f c1442f = c1442fB;
            M0 m10 = p005a4.e.f11187a;
            long jL = ((p005a4.a) c0698o2.k(m10)).l();
            Object objH3 = c0698o2.H();
            if (objH3 == s10) {
                objH3 = new B.j();
                c0698o2.e0(objH3);
            }
            B.j jVar = (B.j) objH3;
            X0 x0B = W0.b(24);
            R0.g gVar = new R0.g(0);
            Object objH4 = c0698o2.H();
            if (objH4 == s10) {
                objH4 = new h(x9, 2);
                c0698o2.e0(objH4);
            }
            o oVar = o.f19333a;
            C0.b(c1442f, null, androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.b(oVar, jVar, x0B, false, gVar, (p241y9.a) objH4, 12), 16), jL, c0698o2, 48, 0);
            if (((Boolean) x9.getValue()).booleanValue()) {
                c0698o2.T(1074262780);
                Object objH5 = c0698o2.H();
                if (objH5 == s10) {
                    objH5 = C0672b.r(new y(0L, 6, str));
                    c0698o2.e0(objH5);
                }
                X x10 = (X) objH5;
                long jD = ((p005a4.a) c0698o2.k(m10)).d();
                Object objH6 = c0698o2.H();
                if (objH6 == s10) {
                    objH6 = new h(x9, 3);
                    c0698o2.e0(objH6);
                }
                p074h0.d dVarD = p074h0.j.d(1085953678, new M4.a(aVar, x9, x10, eVar), c0698o2);
                p074h0.d dVarD2 = p074h0.j.d(1526821097, new A4.a(pVar, aVar, x10, 4), c0698o2);
                z10 = false;
                V0.a((p241y9.a) objH6, dVarD, null, null, null, dVarD2, null, jD, 0L, 0L, 0L, 0.0f, null, c0698o2, 1572918, 16060);
                c0698o2 = c0698o2;
            } else {
                z10 = false;
                c0698o2.T(1071591975);
            }
            c0698o2.p(z10);
            rVar2 = oVar;
        } else {
            c0698o2.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new M4.a(str, aVar, eVar, rVar2, i10, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0148  */
    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:105:0x016e  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:115:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01db  */
    /* JADX WARN: Code duplicated, block: B:120:0x01df  */
    /* JADX WARN: Code duplicated, block: B:123:0x027e  */
    /* JADX WARN: Code duplicated, block: B:126:0x028e  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:136:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:142:0x0376  */
    /* JADX WARN: Code duplicated, block: B:144:0x037c  */
    /* JADX WARN: Code duplicated, block: B:147:0x038c  */
    /* JADX WARN: Code duplicated, block: B:149:0x039a  */
    /* JADX WARN: Code duplicated, block: B:154:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:161:0x0416  */
    /* JADX WARN: Code duplicated, block: B:163:0x0425  */
    /* JADX WARN: Code duplicated, block: B:165:0x042b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0439  */
    /* JADX WARN: Code duplicated, block: B:168:0x043f  */
    /* JADX WARN: Code duplicated, block: B:169:0x044e  */
    /* JADX WARN: Code duplicated, block: B:171:0x056f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0582  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x0116  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x0142  */
    public static final void b(N3.b bVar, r rVar, boolean z10, boolean z11, p241y9.c cVar, p241y9.e eVar, Locale locale, NumberFormat numberFormat, C0698o c0698o, final int i10, final int i11) {
        r rVar2;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Locale locale2;
        int i22;
        int i23;
        int i24;
        boolean z14;
        final p241y9.c cVar2;
        final Locale locale3;
        final r rVar3;
        final boolean z15;
        final boolean z16;
        final p241y9.e eVar2;
        final NumberFormat numberFormat2;
        C0699o0 c0699o0R;
        int i25;
        o oVar;
        S s10;
        p241y9.c cVar3;
        p241y9.e eVar3;
        p241y9.c cVar4;
        r rVar4;
        p241y9.e eVar4;
        Locale locale4;
        boolean z17;
        boolean z18;
        NumberFormat numberFormat3;
        Object objH;
        Object objH2;
        int i26;
        C0286i c0286i;
        C0285h c0285h;
        p241y9.e eVar5;
        int i27;
        Locale locale5;
        String strM0;
        int i28;
        C0285h c0285h2;
        C0285h c0285h3;
        int i29;
        Context context;
        Date date;
        boolean zI;
        Object objH3;
        boolean z19;
        p241y9.c cVar5;
        long jUntil;
        String str;
        final N3.b bVar2 = bVar;
        C0698o c0698o2 = c0698o;
        M3.a aVar = bVar2.f6006f;
        int i30 = aVar.f5684u;
        c0698o2.V(449135981);
        int i31 = (c0698o2.g(bVar2) ? 4 : 2) | i10;
        int i32 = i11 & 2;
        if (i32 != 0) {
            i12 = i31 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i12 = i31 | (c0698o2.g(rVar2) ? 32 : 16);
        }
        int i33 = i11 & 4;
        if (i33 == 0) {
            if ((i10 & 384) == 0) {
                z12 = z10;
                i12 |= c0698o2.h(z12) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                i15 = i12 | 3072;
                z13 = z11;
            } else {
                z13 = z11;
                if (c0698o2.h(z13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i15 = i12 | i14;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                i18 = i15 | 24576;
            } else {
                if (c0698o2.i(cVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i18 = i15 | i17;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i21 = i18 | 196608;
            } else {
                if (c0698o2.i(eVar)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i21 = i18 | i20;
            }
            locale2 = locale;
            if ((i11 & 64) == 0 || !c0698o2.i(locale2)) {
                i22 = 524288;
            } else {
                i22 = 1048576;
            }
            i23 = i21 | i22 | (((i11 & 128) == 0 || !c0698o2.i(numberFormat)) ? 4194304 : 8388608);
            i24 = i23;
            if ((i23 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0698o2.K(i24 & 1, z14)) {
                c0698o2.P();
                i25 = i10 & 1;
                oVar = o.f19333a;
                s10 = C0690k.f10683a;
                if (i25 != 0 || c0698o2.w()) {
                    if (i32 != 0) {
                        rVar2 = oVar;
                    }
                    if (i33 != 0) {
                        z12 = true;
                    }
                    if (i13 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        objH2 = c0698o2.H();
                        if (objH2 == s10) {
                            objH2 = new m(4);
                            c0698o2.e0(objH2);
                        }
                        cVar3 = (p241y9.c) objH2;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i19 != 0) {
                        objH = c0698o2.H();
                        if (objH == s10) {
                            objH = new D4.j(12, (byte) 0);
                            c0698o2.e0(objH);
                        }
                        eVar3 = (p241y9.e) objH;
                    } else {
                        eVar3 = eVar;
                    }
                    if ((i11 & 64) != 0) {
                        locale2 = Locale.getDefault();
                        j.d(locale2, "getDefault(...)");
                        i24 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        NumberFormat numberFormat4 = p125m4.b.f19615b;
                        j.d(numberFormat4, "getNumberFormatter(...)");
                        i24 &= -29360129;
                        p241y9.e eVar6 = eVar3;
                        cVar4 = cVar3;
                        rVar4 = rVar2;
                        eVar4 = eVar6;
                        z17 = z12;
                        numberFormat3 = numberFormat4;
                        locale4 = locale2;
                        z18 = z13;
                    } else {
                        p241y9.e eVar7 = eVar3;
                        cVar4 = cVar3;
                        rVar4 = rVar2;
                        eVar4 = eVar7;
                        locale4 = locale2;
                        z17 = z12;
                        z18 = z13;
                    }
                    c0698o2.q();
                    C0059b c0059b = AbstractC0066i.f977a;
                    i iVar = l0.c.f19306A;
                    W wA = U.a(c0059b, iVar, c0698o2, 0);
                    i26 = c0698o2.f10721P;
                    boolean z20 = z18;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    r rVarC = l0.a.c(c0698o2, rVar4);
                    InterfaceC0288k.f4142a.getClass();
                    c0286i = C0287j.f4115b;
                    c0698o2.X();
                    r rVar5 = rVar4;
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0285h c0285h4 = C0287j.f4119f;
                    C0672b.v(c0698o2, wA, c0285h4);
                    C0285h c0285h5 = C0287j.f4118e;
                    C0672b.v(c0698o2, interfaceC0687i0M, c0285h5);
                    c0285h = C0287j.g;
                    if (c0698o2.f10720O) {
                        eVar5 = eVar4;
                    } else {
                        eVar5 = eVar4;
                        if (!j.a(c0698o2.H(), Integer.valueOf(i26))) {
                        }
                        C0285h c0285h6 = C0287j.f4117d;
                        C0672b.v(c0698o2, rVarC, c0285h6);
                        if (bVar2.f6001a > -1) {
                            i27 = 2131230843;
                        } else {
                            i27 = 2131230845;
                        }
                        VerticalAlignElement verticalAlignElement = new VerticalAlignElement();
                        p074h0.d dVarD = p074h0.j.d(-2088789327, new A4.d(2, cVar4, bVar2), c0698o2);
                        int i34 = 1572870 | ((i24 >> 6) & 112);
                        int i35 = i27;
                        D.X x9 = D.X.f924a;
                        NumberFormat numberFormat5 = numberFormat3;
                        locale5 = locale4;
                        p241y9.e eVar8 = eVar5;
                        p241y9.c cVar6 = cVar4;
                        androidx.compose.animation.b.b(x9, z20, verticalAlignElement, null, null, null, dVarD, c0698o2, i34, 28);
                        androidx.compose.animation.b.b(x9, !z20, new VerticalAlignElement(), null, null, null, f6631b, c0698o, 1572870, 28);
                        float f3 = 16;
                        p181s2.o.b(n.M(i35, c0698o), p000a.a.m0(i30, c0698o), androidx.compose.foundation.layout.b.l(new VerticalAlignElement(), 0.0f, f3, f3, f3, 1), null, null, 0.0f, new C1303l(B9.a.j(aVar.f5681r, c0698o), 5), c0698o, 0, 56);
                        if (z17) {
                            i30 = aVar.f5685v;
                        }
                        strM0 = bVar2.f6005e;
                        c0698o.T(-150024769);
                        if (strM0.length() == 0) {
                            strM0 = p000a.a.m0(i30, c0698o);
                        }
                        c0698o.p(false);
                        r rVarJ = androidx.compose.foundation.layout.b.j(p245z2.a.J(oVar), 0.0f, f3, 1);
                        C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                        i28 = c0698o.f10721P;
                        InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                        r rVarC2 = l0.a.c(c0698o, rVarJ);
                        c0698o.X();
                        if (c0698o.f10720O) {
                            c0698o.l(c0286i);
                        } else {
                            c0698o.h0();
                        }
                        C0672b.v(c0698o, c0076tA, c0285h4);
                        C0672b.v(c0698o, interfaceC0687i0M2, c0285h5);
                        if (c0698o.f10720O && j.a(c0698o.H(), Integer.valueOf(i28))) {
                            c0285h2 = c0285h;
                        } else {
                            c0285h2 = c0285h;
                            p123m2.c.y(i28, c0698o, i28, c0285h2);
                        }
                        C0672b.v(c0698o, rVarC2, c0285h6);
                        M0 m10 = p005a4.e.f11187a;
                        long jK = ((p005a4.a) c0698o.k(m10)).k();
                        M0 m11 = H2.f8580a;
                        c0285h3 = c0285h2;
                        AbstractC0542b2.b(strM0, null, jK, n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(m11)).f8566l, c0698o, 199680, 0, 65490);
                        String str2 = strM0;
                        W wA2 = U.a(c0059b, iVar, c0698o, 0);
                        i29 = c0698o.f10721P;
                        InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
                        r rVarC3 = l0.a.c(c0698o, oVar);
                        c0698o.X();
                        if (c0698o.f10720O) {
                            c0698o.l(c0286i);
                        } else {
                            c0698o.h0();
                        }
                        C0672b.v(c0698o, wA2, c0285h4);
                        C0672b.v(c0698o, interfaceC0687i0M3, c0285h5);
                        if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i29))) {
                            p123m2.c.y(i29, c0698o, i29, c0285h3);
                        }
                        C0672b.v(c0698o, rVarC3, c0285h6);
                        context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                        date = new Date(bVar.g);
                        zI = c0698o.i(context);
                        objH3 = c0698o.H();
                        if (!zI || objH3 == s10) {
                            z19 = true;
                            objH3 = new A4.i(context, 1);
                            c0698o.e0(objH3);
                        } else {
                            z19 = true;
                        }
                        cVar5 = (p241y9.c) objH3;
                        j.e(locale5, "locale");
                        j.e(cVar5, "fetchResource");
                        Instant instantNow = Instant.now();
                        j.d(instantNow, "now(...)");
                        jUntil = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()).f().until(LocalDateTime.ofInstant(instantNow, ZoneId.systemDefault()).f(), ChronoUnit.DAYS);
                        if (jUntil == 0) {
                            str = DateFormat.getTimeInstance(3, locale5).format(date);
                            j.b(str);
                        } else if (jUntil == 1) {
                            str = (String) cVar5.e(Integer.valueOf(R.string.yesterday));
                        } else if (jUntil <= 7) {
                            str = new SimpleDateFormat("EEEE", locale5).format(date);
                            j.b(str);
                        } else {
                            str = DateFormat.getDateInstance(3, locale5).format(date);
                            j.b(str);
                        }
                        String str3 = str;
                        long jK2 = ((p005a4.a) c0698o.k(m10)).k();
                        r rVarL = androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 8, 0.0f, 11);
                        U0.L l10 = ((G2) c0698o.k(m11)).f8569o;
                        long jB = n.B(14);
                        l lVar = l.f10360u;
                        boolean z21 = z19;
                        bVar2 = bVar;
                        AbstractC0542b2.b(str3, rVarL, jK2, jB, lVar, null, 0L, null, 0L, 0, false, 0, 0, l10, c0698o, 199728, 0, 65488);
                        String str4 = p000a.a.l0(R.array.sura_names, c0698o)[bVar2.f6002b - (z21 ? 1 : 0)];
                        String str5 = numberFormat5.format(Integer.valueOf(bVar2.f6003c));
                        String str6 = numberFormat5.format(Integer.valueOf(bVar2.f6004d));
                        j.b(str5);
                        j.b(str6);
                        Object[] objArr = new Object[3];
                        objArr[0] = str4;
                        objArr[z21 ? 1 : 0] = str5;
                        objArr[2] = str6;
                        AbstractC0542b2.b(p000a.a.n0(R.string.bookmark_info_format, objArr, c0698o), null, ((p005a4.a) c0698o.k(m10)).h(), n.B(14), lVar, null, 0L, null, 0L, 0, false, 1, 0, ((G2) c0698o.k(m11)).f8569o, c0698o, 199680, 3072, 57298);
                        c0698o2 = c0698o;
                        c0698o2.p(z21);
                        c0698o2.p(z21);
                        androidx.compose.animation.b.b(x9, z20, new VerticalAlignElement(), null, null, null, p074h0.j.d(-332445127, new H4.g(str2, bVar2, eVar8, z21 ? 1 : 0), c0698o2), c0698o2, i34, 28);
                        c0698o2.p(z21);
                        rVar3 = rVar5;
                        z16 = z20;
                        eVar2 = eVar8;
                        z15 = z17;
                        cVar2 = cVar6;
                        numberFormat2 = numberFormat5;
                        locale3 = locale5;
                    }
                    p123m2.c.y(i26, c0698o2, i26, c0285h);
                    C0285h c0285h7 = C0287j.f4117d;
                    C0672b.v(c0698o2, rVarC, c0285h7);
                    if (bVar2.f6001a > -1) {
                        i27 = 2131230843;
                    } else {
                        i27 = 2131230845;
                    }
                    VerticalAlignElement verticalAlignElement2 = new VerticalAlignElement();
                    p074h0.d dVarD2 = p074h0.j.d(-2088789327, new A4.d(2, cVar4, bVar2), c0698o2);
                    int i36 = 1572870 | ((i24 >> 6) & 112);
                    int i37 = i27;
                    D.X x10 = D.X.f924a;
                    NumberFormat numberFormat6 = numberFormat3;
                    locale5 = locale4;
                    p241y9.e eVar9 = eVar5;
                    p241y9.c cVar7 = cVar4;
                    androidx.compose.animation.b.b(x10, z20, verticalAlignElement2, null, null, null, dVarD2, c0698o2, i36, 28);
                    androidx.compose.animation.b.b(x10, !z20, new VerticalAlignElement(), null, null, null, f6631b, c0698o, 1572870, 28);
                    float f7 = 16;
                    p181s2.o.b(n.M(i37, c0698o), p000a.a.m0(i30, c0698o), androidx.compose.foundation.layout.b.l(new VerticalAlignElement(), 0.0f, f7, f7, f7, 1), null, null, 0.0f, new C1303l(B9.a.j(aVar.f5681r, c0698o), 5), c0698o, 0, 56);
                    if (z17) {
                        i30 = aVar.f5685v;
                    }
                    strM0 = bVar2.f6005e;
                    c0698o.T(-150024769);
                    if (strM0.length() == 0) {
                        strM0 = p000a.a.m0(i30, c0698o);
                    }
                    c0698o.p(false);
                    r rVarJ2 = androidx.compose.foundation.layout.b.j(p245z2.a.J(oVar), 0.0f, f7, 1);
                    C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                    i28 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M4 = c0698o.m();
                    r rVarC4 = l0.a.c(c0698o, rVarJ2);
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, c0076tA2, c0285h4);
                    C0672b.v(c0698o, interfaceC0687i0M4, c0285h5);
                    if (c0698o.f10720O) {
                        c0285h2 = c0285h;
                        p123m2.c.y(i28, c0698o, i28, c0285h2);
                    } else {
                        c0285h2 = c0285h;
                        p123m2.c.y(i28, c0698o, i28, c0285h2);
                    }
                    C0672b.v(c0698o, rVarC4, c0285h7);
                    M0 m12 = p005a4.e.f11187a;
                    long jK3 = ((p005a4.a) c0698o.k(m12)).k();
                    M0 m13 = H2.f8580a;
                    c0285h3 = c0285h2;
                    AbstractC0542b2.b(strM0, null, jK3, n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(m13)).f8566l, c0698o, 199680, 0, 65490);
                    String str7 = strM0;
                    W wA3 = U.a(c0059b, iVar, c0698o, 0);
                    i29 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M5 = c0698o.m();
                    r rVarC5 = l0.a.c(c0698o, oVar);
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, wA3, c0285h4);
                    C0672b.v(c0698o, interfaceC0687i0M5, c0285h5);
                    if (c0698o.f10720O) {
                        p123m2.c.y(i29, c0698o, i29, c0285h3);
                    } else {
                        p123m2.c.y(i29, c0698o, i29, c0285h3);
                    }
                    C0672b.v(c0698o, rVarC5, c0285h7);
                    context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                    date = new Date(bVar.g);
                    zI = c0698o.i(context);
                    objH3 = c0698o.H();
                    if (zI) {
                        z19 = true;
                        objH3 = new A4.i(context, 1);
                        c0698o.e0(objH3);
                    } else {
                        z19 = true;
                        objH3 = new A4.i(context, 1);
                        c0698o.e0(objH3);
                    }
                    cVar5 = (p241y9.c) objH3;
                    j.e(locale5, "locale");
                    j.e(cVar5, "fetchResource");
                    Instant instantNow2 = Instant.now();
                    j.d(instantNow2, "now(...)");
                    jUntil = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()).f().until(LocalDateTime.ofInstant(instantNow2, ZoneId.systemDefault()).f(), ChronoUnit.DAYS);
                    if (jUntil == 0) {
                        str = DateFormat.getTimeInstance(3, locale5).format(date);
                        j.b(str);
                    } else if (jUntil == 1) {
                        str = (String) cVar5.e(Integer.valueOf(R.string.yesterday));
                    } else if (jUntil <= 7) {
                        str = new SimpleDateFormat("EEEE", locale5).format(date);
                        j.b(str);
                    } else {
                        str = DateFormat.getDateInstance(3, locale5).format(date);
                        j.b(str);
                    }
                    String str8 = str;
                    long jK4 = ((p005a4.a) c0698o.k(m12)).k();
                    r rVarL2 = androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 8, 0.0f, 11);
                    U0.L l11 = ((G2) c0698o.k(m13)).f8569o;
                    long jB2 = n.B(14);
                    l lVar2 = l.f10360u;
                    boolean z22 = z19;
                    bVar2 = bVar;
                    AbstractC0542b2.b(str8, rVarL2, jK4, jB2, lVar2, null, 0L, null, 0L, 0, false, 0, 0, l11, c0698o, 199728, 0, 65488);
                    String str9 = p000a.a.l0(R.array.sura_names, c0698o)[bVar2.f6002b - (z22 ? 1 : 0)];
                    String str10 = numberFormat6.format(Integer.valueOf(bVar2.f6003c));
                    String str11 = numberFormat6.format(Integer.valueOf(bVar2.f6004d));
                    j.b(str10);
                    j.b(str11);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = str9;
                    objArr2[z22 ? 1 : 0] = str10;
                    objArr2[2] = str11;
                    AbstractC0542b2.b(p000a.a.n0(R.string.bookmark_info_format, objArr2, c0698o), null, ((p005a4.a) c0698o.k(m12)).h(), n.B(14), lVar2, null, 0L, null, 0L, 0, false, 1, 0, ((G2) c0698o.k(m13)).f8569o, c0698o, 199680, 3072, 57298);
                    c0698o2 = c0698o;
                    c0698o2.p(z22);
                    c0698o2.p(z22);
                    androidx.compose.animation.b.b(x10, z20, new VerticalAlignElement(), null, null, null, p074h0.j.d(-332445127, new H4.g(str7, bVar2, eVar9, z22 ? 1 : 0), c0698o2), c0698o2, i36, 28);
                    c0698o2.p(z22);
                    rVar3 = rVar5;
                    z16 = z20;
                    eVar2 = eVar9;
                    z15 = z17;
                    cVar2 = cVar7;
                    numberFormat2 = numberFormat6;
                    locale3 = locale5;
                } else {
                    c0698o2.N();
                    if ((i11 & 64) != 0) {
                        i24 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i24 &= -29360129;
                    }
                    cVar4 = cVar;
                    locale4 = locale2;
                    rVar4 = rVar2;
                    z17 = z12;
                    z18 = z13;
                    eVar4 = eVar;
                }
                numberFormat3 = numberFormat;
                c0698o2.q();
                C0059b c0059b2 = AbstractC0066i.f977a;
                i iVar2 = l0.c.f19306A;
                W wA4 = U.a(c0059b2, iVar2, c0698o2, 0);
                i26 = c0698o2.f10721P;
                boolean z23 = z18;
                InterfaceC0687i0 interfaceC0687i0M6 = c0698o2.m();
                r rVarC6 = l0.a.c(c0698o2, rVar4);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o2.X();
                r rVar6 = rVar4;
                if (c0698o2.f10720O) {
                    c0698o2.l(c0286i);
                } else {
                    c0698o2.h0();
                }
                C0285h c0285h8 = C0287j.f4119f;
                C0672b.v(c0698o2, wA4, c0285h8);
                C0285h c0285h9 = C0287j.f4118e;
                C0672b.v(c0698o2, interfaceC0687i0M6, c0285h9);
                c0285h = C0287j.g;
                if (c0698o2.f10720O) {
                    eVar5 = eVar4;
                    if (!j.a(c0698o2.H(), Integer.valueOf(i26))) {
                    }
                    C0285h c0285h10 = C0287j.f4117d;
                    C0672b.v(c0698o2, rVarC6, c0285h10);
                    if (bVar2.f6001a > -1) {
                        i27 = 2131230843;
                    } else {
                        i27 = 2131230845;
                    }
                    VerticalAlignElement verticalAlignElement3 = new VerticalAlignElement();
                    p074h0.d dVarD3 = p074h0.j.d(-2088789327, new A4.d(2, cVar4, bVar2), c0698o2);
                    int i38 = 1572870 | ((i24 >> 6) & 112);
                    int i39 = i27;
                    D.X x11 = D.X.f924a;
                    NumberFormat numberFormat7 = numberFormat3;
                    locale5 = locale4;
                    p241y9.e eVar10 = eVar5;
                    p241y9.c cVar8 = cVar4;
                    androidx.compose.animation.b.b(x11, z23, verticalAlignElement3, null, null, null, dVarD3, c0698o2, i38, 28);
                    androidx.compose.animation.b.b(x11, !z23, new VerticalAlignElement(), null, null, null, f6631b, c0698o, 1572870, 28);
                    float f10 = 16;
                    p181s2.o.b(n.M(i39, c0698o), p000a.a.m0(i30, c0698o), androidx.compose.foundation.layout.b.l(new VerticalAlignElement(), 0.0f, f10, f10, f10, 1), null, null, 0.0f, new C1303l(B9.a.j(aVar.f5681r, c0698o), 5), c0698o, 0, 56);
                    if (z17) {
                        i30 = aVar.f5685v;
                    }
                    strM0 = bVar2.f6005e;
                    c0698o.T(-150024769);
                    if (strM0.length() == 0) {
                        strM0 = p000a.a.m0(i30, c0698o);
                    }
                    c0698o.p(false);
                    r rVarJ3 = androidx.compose.foundation.layout.b.j(p245z2.a.J(oVar), 0.0f, f10, 1);
                    C0076t c0076tA3 = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                    i28 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M7 = c0698o.m();
                    r rVarC7 = l0.a.c(c0698o, rVarJ3);
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, c0076tA3, c0285h8);
                    C0672b.v(c0698o, interfaceC0687i0M7, c0285h9);
                    if (c0698o.f10720O) {
                        c0285h2 = c0285h;
                        p123m2.c.y(i28, c0698o, i28, c0285h2);
                    } else {
                        c0285h2 = c0285h;
                        p123m2.c.y(i28, c0698o, i28, c0285h2);
                    }
                    C0672b.v(c0698o, rVarC7, c0285h10);
                    M0 m14 = p005a4.e.f11187a;
                    long jK5 = ((p005a4.a) c0698o.k(m14)).k();
                    M0 m15 = H2.f8580a;
                    c0285h3 = c0285h2;
                    AbstractC0542b2.b(strM0, null, jK5, n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(m15)).f8566l, c0698o, 199680, 0, 65490);
                    String str12 = strM0;
                    W wA5 = U.a(c0059b2, iVar2, c0698o, 0);
                    i29 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M8 = c0698o.m();
                    r rVarC8 = l0.a.c(c0698o, oVar);
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, wA5, c0285h8);
                    C0672b.v(c0698o, interfaceC0687i0M8, c0285h9);
                    if (c0698o.f10720O) {
                        p123m2.c.y(i29, c0698o, i29, c0285h3);
                    } else {
                        p123m2.c.y(i29, c0698o, i29, c0285h3);
                    }
                    C0672b.v(c0698o, rVarC8, c0285h10);
                    context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                    date = new Date(bVar.g);
                    zI = c0698o.i(context);
                    objH3 = c0698o.H();
                    if (zI) {
                        z19 = true;
                        objH3 = new A4.i(context, 1);
                        c0698o.e0(objH3);
                    } else {
                        z19 = true;
                        objH3 = new A4.i(context, 1);
                        c0698o.e0(objH3);
                    }
                    cVar5 = (p241y9.c) objH3;
                    j.e(locale5, "locale");
                    j.e(cVar5, "fetchResource");
                    Instant instantNow3 = Instant.now();
                    j.d(instantNow3, "now(...)");
                    jUntil = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()).f().until(LocalDateTime.ofInstant(instantNow3, ZoneId.systemDefault()).f(), ChronoUnit.DAYS);
                    if (jUntil == 0) {
                        str = DateFormat.getTimeInstance(3, locale5).format(date);
                        j.b(str);
                    } else if (jUntil == 1) {
                        str = (String) cVar5.e(Integer.valueOf(R.string.yesterday));
                    } else if (jUntil <= 7) {
                        str = new SimpleDateFormat("EEEE", locale5).format(date);
                        j.b(str);
                    } else {
                        str = DateFormat.getDateInstance(3, locale5).format(date);
                        j.b(str);
                    }
                    String str13 = str;
                    long jK6 = ((p005a4.a) c0698o.k(m14)).k();
                    r rVarL3 = androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 8, 0.0f, 11);
                    U0.L l12 = ((G2) c0698o.k(m15)).f8569o;
                    long jB3 = n.B(14);
                    l lVar3 = l.f10360u;
                    boolean z24 = z19;
                    bVar2 = bVar;
                    AbstractC0542b2.b(str13, rVarL3, jK6, jB3, lVar3, null, 0L, null, 0L, 0, false, 0, 0, l12, c0698o, 199728, 0, 65488);
                    String str14 = p000a.a.l0(R.array.sura_names, c0698o)[bVar2.f6002b - (z24 ? 1 : 0)];
                    String str15 = numberFormat7.format(Integer.valueOf(bVar2.f6003c));
                    String str16 = numberFormat7.format(Integer.valueOf(bVar2.f6004d));
                    j.b(str15);
                    j.b(str16);
                    Object[] objArr3 = new Object[3];
                    objArr3[0] = str14;
                    objArr3[z24 ? 1 : 0] = str15;
                    objArr3[2] = str16;
                    AbstractC0542b2.b(p000a.a.n0(R.string.bookmark_info_format, objArr3, c0698o), null, ((p005a4.a) c0698o.k(m14)).h(), n.B(14), lVar3, null, 0L, null, 0L, 0, false, 1, 0, ((G2) c0698o.k(m15)).f8569o, c0698o, 199680, 3072, 57298);
                    c0698o2 = c0698o;
                    c0698o2.p(z24);
                    c0698o2.p(z24);
                    androidx.compose.animation.b.b(x11, z23, new VerticalAlignElement(), null, null, null, p074h0.j.d(-332445127, new H4.g(str12, bVar2, eVar10, z24 ? 1 : 0), c0698o2), c0698o2, i38, 28);
                    c0698o2.p(z24);
                    rVar3 = rVar6;
                    z16 = z23;
                    eVar2 = eVar10;
                    z15 = z17;
                    cVar2 = cVar8;
                    numberFormat2 = numberFormat7;
                    locale3 = locale5;
                } else {
                    eVar5 = eVar4;
                }
                p123m2.c.y(i26, c0698o2, i26, c0285h);
                C0285h c0285h11 = C0287j.f4117d;
                C0672b.v(c0698o2, rVarC6, c0285h11);
                if (bVar2.f6001a > -1) {
                    i27 = 2131230843;
                } else {
                    i27 = 2131230845;
                }
                VerticalAlignElement verticalAlignElement4 = new VerticalAlignElement();
                p074h0.d dVarD4 = p074h0.j.d(-2088789327, new A4.d(2, cVar4, bVar2), c0698o2);
                int i310 = 1572870 | ((i24 >> 6) & 112);
                int i311 = i27;
                D.X x12 = D.X.f924a;
                NumberFormat numberFormat8 = numberFormat3;
                locale5 = locale4;
                p241y9.e eVar11 = eVar5;
                p241y9.c cVar9 = cVar4;
                androidx.compose.animation.b.b(x12, z23, verticalAlignElement4, null, null, null, dVarD4, c0698o2, i310, 28);
                androidx.compose.animation.b.b(x12, !z23, new VerticalAlignElement(), null, null, null, f6631b, c0698o, 1572870, 28);
                float f11 = 16;
                p181s2.o.b(n.M(i311, c0698o), p000a.a.m0(i30, c0698o), androidx.compose.foundation.layout.b.l(new VerticalAlignElement(), 0.0f, f11, f11, f11, 1), null, null, 0.0f, new C1303l(B9.a.j(aVar.f5681r, c0698o), 5), c0698o, 0, 56);
                if (z17) {
                    i30 = aVar.f5685v;
                }
                strM0 = bVar2.f6005e;
                c0698o.T(-150024769);
                if (strM0.length() == 0) {
                    strM0 = p000a.a.m0(i30, c0698o);
                }
                c0698o.p(false);
                r rVarJ4 = androidx.compose.foundation.layout.b.j(p245z2.a.J(oVar), 0.0f, f11, 1);
                C0076t c0076tA4 = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                i28 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M9 = c0698o.m();
                r rVarC9 = l0.a.c(c0698o, rVarJ4);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0076tA4, c0285h8);
                C0672b.v(c0698o, interfaceC0687i0M9, c0285h9);
                if (c0698o.f10720O) {
                    c0285h2 = c0285h;
                    p123m2.c.y(i28, c0698o, i28, c0285h2);
                } else {
                    c0285h2 = c0285h;
                    p123m2.c.y(i28, c0698o, i28, c0285h2);
                }
                C0672b.v(c0698o, rVarC9, c0285h11);
                M0 m16 = p005a4.e.f11187a;
                long jK7 = ((p005a4.a) c0698o.k(m16)).k();
                M0 m17 = H2.f8580a;
                c0285h3 = c0285h2;
                AbstractC0542b2.b(strM0, null, jK7, n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(m17)).f8566l, c0698o, 199680, 0, 65490);
                String str17 = strM0;
                W wA6 = U.a(c0059b2, iVar2, c0698o, 0);
                i29 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M10 = c0698o.m();
                r rVarC10 = l0.a.c(c0698o, oVar);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, wA6, c0285h8);
                C0672b.v(c0698o, interfaceC0687i0M10, c0285h9);
                if (c0698o.f10720O) {
                    p123m2.c.y(i29, c0698o, i29, c0285h3);
                } else {
                    p123m2.c.y(i29, c0698o, i29, c0285h3);
                }
                C0672b.v(c0698o, rVarC10, c0285h11);
                context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                date = new Date(bVar.g);
                zI = c0698o.i(context);
                objH3 = c0698o.H();
                if (zI) {
                    z19 = true;
                    objH3 = new A4.i(context, 1);
                    c0698o.e0(objH3);
                } else {
                    z19 = true;
                    objH3 = new A4.i(context, 1);
                    c0698o.e0(objH3);
                }
                cVar5 = (p241y9.c) objH3;
                j.e(locale5, "locale");
                j.e(cVar5, "fetchResource");
                Instant instantNow4 = Instant.now();
                j.d(instantNow4, "now(...)");
                jUntil = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()).f().until(LocalDateTime.ofInstant(instantNow4, ZoneId.systemDefault()).f(), ChronoUnit.DAYS);
                if (jUntil == 0) {
                    str = DateFormat.getTimeInstance(3, locale5).format(date);
                    j.b(str);
                } else if (jUntil == 1) {
                    str = (String) cVar5.e(Integer.valueOf(R.string.yesterday));
                } else if (jUntil <= 7) {
                    str = new SimpleDateFormat("EEEE", locale5).format(date);
                    j.b(str);
                } else {
                    str = DateFormat.getDateInstance(3, locale5).format(date);
                    j.b(str);
                }
                String str18 = str;
                long jK8 = ((p005a4.a) c0698o.k(m16)).k();
                r rVarL4 = androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 8, 0.0f, 11);
                U0.L l13 = ((G2) c0698o.k(m17)).f8569o;
                long jB4 = n.B(14);
                l lVar4 = l.f10360u;
                boolean z25 = z19;
                bVar2 = bVar;
                AbstractC0542b2.b(str18, rVarL4, jK8, jB4, lVar4, null, 0L, null, 0L, 0, false, 0, 0, l13, c0698o, 199728, 0, 65488);
                String str19 = p000a.a.l0(R.array.sura_names, c0698o)[bVar2.f6002b - (z25 ? 1 : 0)];
                String str110 = numberFormat8.format(Integer.valueOf(bVar2.f6003c));
                String str111 = numberFormat8.format(Integer.valueOf(bVar2.f6004d));
                j.b(str110);
                j.b(str111);
                Object[] objArr4 = new Object[3];
                objArr4[0] = str19;
                objArr4[z25 ? 1 : 0] = str110;
                objArr4[2] = str111;
                AbstractC0542b2.b(p000a.a.n0(R.string.bookmark_info_format, objArr4, c0698o), null, ((p005a4.a) c0698o.k(m16)).h(), n.B(14), lVar4, null, 0L, null, 0L, 0, false, 1, 0, ((G2) c0698o.k(m17)).f8569o, c0698o, 199680, 3072, 57298);
                c0698o2 = c0698o;
                c0698o2.p(z25);
                c0698o2.p(z25);
                androidx.compose.animation.b.b(x12, z23, new VerticalAlignElement(), null, null, null, p074h0.j.d(-332445127, new H4.g(str17, bVar2, eVar11, z25 ? 1 : 0), c0698o2), c0698o2, i310, 28);
                c0698o2.p(z25);
                rVar3 = rVar6;
                z16 = z23;
                eVar2 = eVar11;
                z15 = z17;
                cVar2 = cVar9;
                numberFormat2 = numberFormat8;
                locale3 = locale5;
            } else {
                c0698o2.N();
                cVar2 = cVar;
                locale3 = locale2;
                rVar3 = rVar2;
                z15 = z12;
                z16 = z13;
                eVar2 = eVar;
                numberFormat2 = numberFormat;
            }
            c0699o0R = c0698o2.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new p241y9.e() { // from class: P3.b
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        e.b(bVar2, rVar3, z15, z16, cVar2, eVar2, locale3, numberFormat2, (C0698o) obj, C0672b.y(i10 | 1), i11);
                        return p110k9.y.f19095a;
                    }
                };
            }
        }
        i12 |= 384;
        z12 = z10;
        i13 = i11 & 8;
        if (i13 != 0) {
            i15 = i12 | 3072;
            z13 = z11;
        } else {
            z13 = z11;
            if (c0698o2.h(z13)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i15 = i12 | i14;
        }
        i16 = i11 & 16;
        if (i16 != 0) {
            i18 = i15 | 24576;
        } else {
            if (c0698o2.i(cVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i18 = i15 | i17;
        }
        i19 = i11 & 32;
        if (i19 != 0) {
            i21 = i18 | 196608;
        } else {
            if (c0698o2.i(eVar)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i21 = i18 | i20;
        }
        locale2 = locale;
        if ((i11 & 64) == 0) {
            i22 = 524288;
        } else {
            i22 = 524288;
        }
        i23 = i21 | i22 | (((i11 & 128) == 0 || !c0698o2.i(numberFormat)) ? 4194304 : 8388608);
        i24 = i23;
        if ((i23 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0698o2.K(i24 & 1, z14)) {
            c0698o2.P();
            i25 = i10 & 1;
            oVar = o.f19333a;
            s10 = C0690k.f10683a;
            if (i25 != 0) {
                if (i32 != 0) {
                    rVar2 = oVar;
                }
                if (i33 != 0) {
                    z12 = true;
                }
                if (i13 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    objH2 = c0698o2.H();
                    if (objH2 == s10) {
                        objH2 = new m(4);
                        c0698o2.e0(objH2);
                    }
                    cVar3 = (p241y9.c) objH2;
                } else {
                    cVar3 = cVar;
                }
                if (i19 != 0) {
                    objH = c0698o2.H();
                    if (objH == s10) {
                        objH = new D4.j(12, (byte) 0);
                        c0698o2.e0(objH);
                    }
                    eVar3 = (p241y9.e) objH;
                } else {
                    eVar3 = eVar;
                }
                if ((i11 & 64) != 0) {
                    locale2 = Locale.getDefault();
                    j.d(locale2, "getDefault(...)");
                    i24 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    NumberFormat numberFormat9 = p125m4.b.f19615b;
                    j.d(numberFormat9, "getNumberFormatter(...)");
                    i24 &= -29360129;
                    p241y9.e eVar12 = eVar3;
                    cVar4 = cVar3;
                    rVar4 = rVar2;
                    eVar4 = eVar12;
                    z17 = z12;
                    numberFormat3 = numberFormat9;
                    locale4 = locale2;
                    z18 = z13;
                } else {
                    p241y9.e eVar13 = eVar3;
                    cVar4 = cVar3;
                    rVar4 = rVar2;
                    eVar4 = eVar13;
                    locale4 = locale2;
                    z17 = z12;
                    z18 = z13;
                    numberFormat3 = numberFormat;
                }
            } else {
                if (i32 != 0) {
                    rVar2 = oVar;
                }
                if (i33 != 0) {
                    z12 = true;
                }
                if (i13 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    objH2 = c0698o2.H();
                    if (objH2 == s10) {
                        objH2 = new m(4);
                        c0698o2.e0(objH2);
                    }
                    cVar3 = (p241y9.c) objH2;
                } else {
                    cVar3 = cVar;
                }
                if (i19 != 0) {
                    objH = c0698o2.H();
                    if (objH == s10) {
                        objH = new D4.j(12, (byte) 0);
                        c0698o2.e0(objH);
                    }
                    eVar3 = (p241y9.e) objH;
                } else {
                    eVar3 = eVar;
                }
                if ((i11 & 64) != 0) {
                    locale2 = Locale.getDefault();
                    j.d(locale2, "getDefault(...)");
                    i24 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    NumberFormat numberFormat10 = p125m4.b.f19615b;
                    j.d(numberFormat10, "getNumberFormatter(...)");
                    i24 &= -29360129;
                    p241y9.e eVar14 = eVar3;
                    cVar4 = cVar3;
                    rVar4 = rVar2;
                    eVar4 = eVar14;
                    z17 = z12;
                    numberFormat3 = numberFormat10;
                    locale4 = locale2;
                    z18 = z13;
                } else {
                    p241y9.e eVar15 = eVar3;
                    cVar4 = cVar3;
                    rVar4 = rVar2;
                    eVar4 = eVar15;
                    locale4 = locale2;
                    z17 = z12;
                    z18 = z13;
                    numberFormat3 = numberFormat;
                }
            }
            c0698o2.q();
            C0059b c0059b3 = AbstractC0066i.f977a;
            i iVar3 = l0.c.f19306A;
            W wA7 = U.a(c0059b3, iVar3, c0698o2, 0);
            i26 = c0698o2.f10721P;
            boolean z26 = z18;
            InterfaceC0687i0 interfaceC0687i0M11 = c0698o2.m();
            r rVarC11 = l0.a.c(c0698o2, rVar4);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o2.X();
            r rVar7 = rVar4;
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0285h c0285h12 = C0287j.f4119f;
            C0672b.v(c0698o2, wA7, c0285h12);
            C0285h c0285h13 = C0287j.f4118e;
            C0672b.v(c0698o2, interfaceC0687i0M11, c0285h13);
            c0285h = C0287j.g;
            if (c0698o2.f10720O) {
                eVar5 = eVar4;
                if (!j.a(c0698o2.H(), Integer.valueOf(i26))) {
                }
                C0285h c0285h14 = C0287j.f4117d;
                C0672b.v(c0698o2, rVarC11, c0285h14);
                if (bVar2.f6001a > -1) {
                    i27 = 2131230843;
                } else {
                    i27 = 2131230845;
                }
                VerticalAlignElement verticalAlignElement5 = new VerticalAlignElement();
                p074h0.d dVarD5 = p074h0.j.d(-2088789327, new A4.d(2, cVar4, bVar2), c0698o2);
                int i312 = 1572870 | ((i24 >> 6) & 112);
                int i313 = i27;
                D.X x13 = D.X.f924a;
                NumberFormat numberFormat11 = numberFormat3;
                locale5 = locale4;
                p241y9.e eVar16 = eVar5;
                p241y9.c cVar10 = cVar4;
                androidx.compose.animation.b.b(x13, z26, verticalAlignElement5, null, null, null, dVarD5, c0698o2, i312, 28);
                androidx.compose.animation.b.b(x13, !z26, new VerticalAlignElement(), null, null, null, f6631b, c0698o, 1572870, 28);
                float f12 = 16;
                p181s2.o.b(n.M(i313, c0698o), p000a.a.m0(i30, c0698o), androidx.compose.foundation.layout.b.l(new VerticalAlignElement(), 0.0f, f12, f12, f12, 1), null, null, 0.0f, new C1303l(B9.a.j(aVar.f5681r, c0698o), 5), c0698o, 0, 56);
                if (z17) {
                    i30 = aVar.f5685v;
                }
                strM0 = bVar2.f6005e;
                c0698o.T(-150024769);
                if (strM0.length() == 0) {
                    strM0 = p000a.a.m0(i30, c0698o);
                }
                c0698o.p(false);
                r rVarJ5 = androidx.compose.foundation.layout.b.j(p245z2.a.J(oVar), 0.0f, f12, 1);
                C0076t c0076tA5 = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                i28 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M12 = c0698o.m();
                r rVarC12 = l0.a.c(c0698o, rVarJ5);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0076tA5, c0285h12);
                C0672b.v(c0698o, interfaceC0687i0M12, c0285h13);
                if (c0698o.f10720O) {
                    c0285h2 = c0285h;
                    p123m2.c.y(i28, c0698o, i28, c0285h2);
                } else {
                    c0285h2 = c0285h;
                    p123m2.c.y(i28, c0698o, i28, c0285h2);
                }
                C0672b.v(c0698o, rVarC12, c0285h14);
                M0 m18 = p005a4.e.f11187a;
                long jK9 = ((p005a4.a) c0698o.k(m18)).k();
                M0 m19 = H2.f8580a;
                c0285h3 = c0285h2;
                AbstractC0542b2.b(strM0, null, jK9, n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(m19)).f8566l, c0698o, 199680, 0, 65490);
                String str112 = strM0;
                W wA8 = U.a(c0059b3, iVar3, c0698o, 0);
                i29 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M13 = c0698o.m();
                r rVarC13 = l0.a.c(c0698o, oVar);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, wA8, c0285h12);
                C0672b.v(c0698o, interfaceC0687i0M13, c0285h13);
                if (c0698o.f10720O) {
                    p123m2.c.y(i29, c0698o, i29, c0285h3);
                } else {
                    p123m2.c.y(i29, c0698o, i29, c0285h3);
                }
                C0672b.v(c0698o, rVarC13, c0285h14);
                context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                date = new Date(bVar.g);
                zI = c0698o.i(context);
                objH3 = c0698o.H();
                if (zI) {
                    z19 = true;
                    objH3 = new A4.i(context, 1);
                    c0698o.e0(objH3);
                } else {
                    z19 = true;
                    objH3 = new A4.i(context, 1);
                    c0698o.e0(objH3);
                }
                cVar5 = (p241y9.c) objH3;
                j.e(locale5, "locale");
                j.e(cVar5, "fetchResource");
                Instant instantNow5 = Instant.now();
                j.d(instantNow5, "now(...)");
                jUntil = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()).f().until(LocalDateTime.ofInstant(instantNow5, ZoneId.systemDefault()).f(), ChronoUnit.DAYS);
                if (jUntil == 0) {
                    str = DateFormat.getTimeInstance(3, locale5).format(date);
                    j.b(str);
                } else if (jUntil == 1) {
                    str = (String) cVar5.e(Integer.valueOf(R.string.yesterday));
                } else if (jUntil <= 7) {
                    str = new SimpleDateFormat("EEEE", locale5).format(date);
                    j.b(str);
                } else {
                    str = DateFormat.getDateInstance(3, locale5).format(date);
                    j.b(str);
                }
                String str113 = str;
                long jK10 = ((p005a4.a) c0698o.k(m18)).k();
                r rVarL5 = androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 8, 0.0f, 11);
                U0.L l14 = ((G2) c0698o.k(m19)).f8569o;
                long jB5 = n.B(14);
                l lVar5 = l.f10360u;
                boolean z27 = z19;
                bVar2 = bVar;
                AbstractC0542b2.b(str113, rVarL5, jK10, jB5, lVar5, null, 0L, null, 0L, 0, false, 0, 0, l14, c0698o, 199728, 0, 65488);
                String str114 = p000a.a.l0(R.array.sura_names, c0698o)[bVar2.f6002b - (z27 ? 1 : 0)];
                String str115 = numberFormat11.format(Integer.valueOf(bVar2.f6003c));
                String str116 = numberFormat11.format(Integer.valueOf(bVar2.f6004d));
                j.b(str115);
                j.b(str116);
                Object[] objArr5 = new Object[3];
                objArr5[0] = str114;
                objArr5[z27 ? 1 : 0] = str115;
                objArr5[2] = str116;
                AbstractC0542b2.b(p000a.a.n0(R.string.bookmark_info_format, objArr5, c0698o), null, ((p005a4.a) c0698o.k(m18)).h(), n.B(14), lVar5, null, 0L, null, 0L, 0, false, 1, 0, ((G2) c0698o.k(m19)).f8569o, c0698o, 199680, 3072, 57298);
                c0698o2 = c0698o;
                c0698o2.p(z27);
                c0698o2.p(z27);
                androidx.compose.animation.b.b(x13, z26, new VerticalAlignElement(), null, null, null, p074h0.j.d(-332445127, new H4.g(str112, bVar2, eVar16, z27 ? 1 : 0), c0698o2), c0698o2, i312, 28);
                c0698o2.p(z27);
                rVar3 = rVar7;
                z16 = z26;
                eVar2 = eVar16;
                z15 = z17;
                cVar2 = cVar10;
                numberFormat2 = numberFormat11;
                locale3 = locale5;
            } else {
                eVar5 = eVar4;
            }
            p123m2.c.y(i26, c0698o2, i26, c0285h);
            C0285h c0285h15 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC11, c0285h15);
            if (bVar2.f6001a > -1) {
                i27 = 2131230843;
            } else {
                i27 = 2131230845;
            }
            VerticalAlignElement verticalAlignElement6 = new VerticalAlignElement();
            p074h0.d dVarD6 = p074h0.j.d(-2088789327, new A4.d(2, cVar4, bVar2), c0698o2);
            int i314 = 1572870 | ((i24 >> 6) & 112);
            int i315 = i27;
            D.X x14 = D.X.f924a;
            NumberFormat numberFormat12 = numberFormat3;
            locale5 = locale4;
            p241y9.e eVar17 = eVar5;
            p241y9.c cVar11 = cVar4;
            androidx.compose.animation.b.b(x14, z26, verticalAlignElement6, null, null, null, dVarD6, c0698o2, i314, 28);
            androidx.compose.animation.b.b(x14, !z26, new VerticalAlignElement(), null, null, null, f6631b, c0698o, 1572870, 28);
            float f13 = 16;
            p181s2.o.b(n.M(i315, c0698o), p000a.a.m0(i30, c0698o), androidx.compose.foundation.layout.b.l(new VerticalAlignElement(), 0.0f, f13, f13, f13, 1), null, null, 0.0f, new C1303l(B9.a.j(aVar.f5681r, c0698o), 5), c0698o, 0, 56);
            if (z17) {
                i30 = aVar.f5685v;
            }
            strM0 = bVar2.f6005e;
            c0698o.T(-150024769);
            if (strM0.length() == 0) {
                strM0 = p000a.a.m0(i30, c0698o);
            }
            c0698o.p(false);
            r rVarJ6 = androidx.compose.foundation.layout.b.j(p245z2.a.J(oVar), 0.0f, f13, 1);
            C0076t c0076tA6 = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            i28 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M14 = c0698o.m();
            r rVarC14 = l0.a.c(c0698o, rVarJ6);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA6, c0285h12);
            C0672b.v(c0698o, interfaceC0687i0M14, c0285h13);
            if (c0698o.f10720O) {
                c0285h2 = c0285h;
                p123m2.c.y(i28, c0698o, i28, c0285h2);
            } else {
                c0285h2 = c0285h;
                p123m2.c.y(i28, c0698o, i28, c0285h2);
            }
            C0672b.v(c0698o, rVarC14, c0285h15);
            M0 m110 = p005a4.e.f11187a;
            long jK11 = ((p005a4.a) c0698o.k(m110)).k();
            M0 m111 = H2.f8580a;
            c0285h3 = c0285h2;
            AbstractC0542b2.b(strM0, null, jK11, n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(m111)).f8566l, c0698o, 199680, 0, 65490);
            String str117 = strM0;
            W wA9 = U.a(c0059b3, iVar3, c0698o, 0);
            i29 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M15 = c0698o.m();
            r rVarC15 = l0.a.c(c0698o, oVar);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, wA9, c0285h12);
            C0672b.v(c0698o, interfaceC0687i0M15, c0285h13);
            if (c0698o.f10720O) {
                p123m2.c.y(i29, c0698o, i29, c0285h3);
            } else {
                p123m2.c.y(i29, c0698o, i29, c0285h3);
            }
            C0672b.v(c0698o, rVarC15, c0285h15);
            context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            date = new Date(bVar.g);
            zI = c0698o.i(context);
            objH3 = c0698o.H();
            if (zI) {
                z19 = true;
                objH3 = new A4.i(context, 1);
                c0698o.e0(objH3);
            } else {
                z19 = true;
                objH3 = new A4.i(context, 1);
                c0698o.e0(objH3);
            }
            cVar5 = (p241y9.c) objH3;
            j.e(locale5, "locale");
            j.e(cVar5, "fetchResource");
            Instant instantNow6 = Instant.now();
            j.d(instantNow6, "now(...)");
            jUntil = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()).f().until(LocalDateTime.ofInstant(instantNow6, ZoneId.systemDefault()).f(), ChronoUnit.DAYS);
            if (jUntil == 0) {
                str = DateFormat.getTimeInstance(3, locale5).format(date);
                j.b(str);
            } else if (jUntil == 1) {
                str = (String) cVar5.e(Integer.valueOf(R.string.yesterday));
            } else if (jUntil <= 7) {
                str = new SimpleDateFormat("EEEE", locale5).format(date);
                j.b(str);
            } else {
                str = DateFormat.getDateInstance(3, locale5).format(date);
                j.b(str);
            }
            String str118 = str;
            long jK12 = ((p005a4.a) c0698o.k(m110)).k();
            r rVarL6 = androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 8, 0.0f, 11);
            U0.L l15 = ((G2) c0698o.k(m111)).f8569o;
            long jB6 = n.B(14);
            l lVar6 = l.f10360u;
            boolean z28 = z19;
            bVar2 = bVar;
            AbstractC0542b2.b(str118, rVarL6, jK12, jB6, lVar6, null, 0L, null, 0L, 0, false, 0, 0, l15, c0698o, 199728, 0, 65488);
            String str119 = p000a.a.l0(R.array.sura_names, c0698o)[bVar2.f6002b - (z28 ? 1 : 0)];
            String str1110 = numberFormat12.format(Integer.valueOf(bVar2.f6003c));
            String str1111 = numberFormat12.format(Integer.valueOf(bVar2.f6004d));
            j.b(str1110);
            j.b(str1111);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str119;
            objArr6[z28 ? 1 : 0] = str1110;
            objArr6[2] = str1111;
            AbstractC0542b2.b(p000a.a.n0(R.string.bookmark_info_format, objArr6, c0698o), null, ((p005a4.a) c0698o.k(m110)).h(), n.B(14), lVar6, null, 0L, null, 0L, 0, false, 1, 0, ((G2) c0698o.k(m111)).f8569o, c0698o, 199680, 3072, 57298);
            c0698o2 = c0698o;
            c0698o2.p(z28);
            c0698o2.p(z28);
            androidx.compose.animation.b.b(x14, z26, new VerticalAlignElement(), null, null, null, p074h0.j.d(-332445127, new H4.g(str117, bVar2, eVar17, z28 ? 1 : 0), c0698o2), c0698o2, i314, 28);
            c0698o2.p(z28);
            rVar3 = rVar7;
            z16 = z26;
            eVar2 = eVar17;
            z15 = z17;
            cVar2 = cVar11;
            numberFormat2 = numberFormat12;
            locale3 = locale5;
        } else {
            c0698o2.N();
            cVar2 = cVar;
            locale3 = locale2;
            rVar3 = rVar2;
            z15 = z12;
            z16 = z13;
            eVar2 = eVar;
            numberFormat2 = numberFormat;
        }
        c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p241y9.e() { // from class: P3.b
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.b(bVar2, rVar3, z15, z16, cVar2, eVar2, locale3, numberFormat2, (C0698o) obj, C0672b.y(i10 | 1), i11);
                    return p110k9.y.f19095a;
                }
            };
        }
    }

    public static final void c(final C4.e eVar, final p241y9.c cVar, final r rVar, p241y9.c cVar2, p241y9.c cVar3, p241y9.e eVar2, boolean z10, C0698o c0698o, final int i10, final int i11) {
        final p241y9.c cVar4;
        int i12;
        p241y9.c cVar5;
        int i13;
        p241y9.e eVar3;
        int i14;
        boolean z11;
        int i15;
        final p241y9.c cVar6;
        final p241y9.e eVar4;
        final boolean z12;
        p241y9.c cVar7;
        j.e(cVar, "onBookmarkClicked");
        c0698o.V(-884064782);
        int i16 = i10 | (c0698o.i(eVar) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16);
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 = i16 | 3072;
            cVar4 = cVar2;
        } else {
            cVar4 = cVar2;
            i12 = i16 | (c0698o.i(cVar4) ? 2048 : 1024);
        }
        int i18 = i11 & 16;
        if (i18 != 0) {
            i13 = i12 | 24576;
            cVar5 = cVar3;
        } else {
            cVar5 = cVar3;
            i13 = i12 | (c0698o.i(cVar5) ? 16384 : 8192);
        }
        int i19 = i11 & 32;
        if (i19 != 0) {
            i14 = i13 | 196608;
            eVar3 = eVar2;
        } else {
            eVar3 = eVar2;
            i14 = i13 | (c0698o.i(eVar3) ? 131072 : 65536);
        }
        int i20 = i11 & 64;
        if (i20 != 0) {
            i15 = i14 | 1572864;
            z11 = z10;
        } else {
            z11 = z10;
            i15 = i14 | (c0698o.h(z11) ? 1048576 : 524288);
        }
        if (c0698o.K(i15 & 1, (599187 & i15) != 599186)) {
            p241y9.c cVar8 = i17 != 0 ? null : cVar4;
            S s10 = C0690k.f10683a;
            if (i18 != 0) {
                Object objH = c0698o.H();
                if (objH == s10) {
                    objH = new m(5);
                    c0698o.e0(objH);
                }
                cVar7 = (p241y9.c) objH;
            } else {
                cVar7 = cVar5;
            }
            if (i19 != 0) {
                Object objH2 = c0698o.H();
                if (objH2 == s10) {
                    objH2 = new D4.j(13, (byte) 0);
                    c0698o.e0(objH2);
                }
                eVar3 = (p241y9.e) objH2;
            }
            boolean z13 = i20 != 0 ? false : z11;
            Locale localeA = p125m4.b.a();
            p241y9.e eVar5 = eVar3;
            p241y9.c cVar9 = cVar8;
            p241y9.c cVar10 = cVar7;
            C1.a(rVar.b(androidx.compose.foundation.layout.c.f11826a), null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).d(), 0L, 0.0f, 0.0f, null, p074h0.j.d(-2028733939, new c(C0672b.k(eVar, p120l9.r.f19440r, null, c0698o, (i15 & 14) | 48, 2), z13, cVar, localeA, cVar10, eVar5, cVar9, 0), c0698o), c0698o, 12582912, 122);
            cVar4 = cVar9;
            cVar6 = cVar10;
            eVar4 = eVar5;
            z12 = z13;
        } else {
            c0698o.N();
            cVar6 = cVar5;
            eVar4 = eVar3;
            z12 = z11;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p241y9.e(cVar, rVar, cVar4, cVar6, eVar4, z12, i10, i11) { // from class: P3.d

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ p241y9.c f6623s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ r f6624t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ p241y9.c f6625u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ p241y9.c f6626v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ p241y9.e f6627w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ boolean f6628x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ int f6629y;

                {
                    this.f6629y = i11;
                }

                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = C0672b.y(385);
                    e.c(this.f6622r, this.f6623s, this.f6624t, this.f6625u, this.f6626v, this.f6627w, this.f6628x, (C0698o) obj, iY, this.f6629y);
                    return p110k9.y.f19095a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void d(final N3.c cVar, r rVar, p241y9.e eVar, boolean z10, boolean z11, C0698o c0698o, final int i10, final int i11) {
        r rVar2;
        int i12;
        p241y9.e eVar2;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        final r rVar3;
        final p241y9.e eVar3;
        final boolean z15;
        final boolean z16;
        C0699o0 c0699o0R;
        r rVar4;
        int i16;
        String strM0;
        Object objH;
        M3.a aVar = cVar.f6008b;
        int i17 = aVar.f5684u;
        c0698o.V(-396330419);
        int i18 = (c0698o.g(cVar) ? 4 : 2) | i10;
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 = i18 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i12 = i18 | (c0698o.g(rVar2) ? 32 : 16);
        }
        int i20 = i11 & 4;
        if (i20 != 0) {
            i13 = i12 | 384;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            i13 = i12 | (c0698o.i(eVar2) ? 256 : 128);
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i14 = i13 | 3072;
            z12 = z10;
        } else {
            z12 = z10;
            i14 = i13 | (c0698o.h(z12) ? 2048 : 1024);
        }
        int i22 = i11 & 16;
        if (i22 == 0) {
            if ((i10 & 24576) == 0) {
                z13 = z11;
                i14 |= c0698o.h(z13) ? 16384 : 8192;
            }
            i15 = i14;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0698o.K(i15 & 1, z14)) {
                if (i19 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                if (i20 != 0) {
                    objH = c0698o.H();
                    if (objH == C0690k.f10683a) {
                        objH = new D4.j(14, (byte) 0);
                        c0698o.e0(objH);
                    }
                    eVar2 = (p241y9.e) objH;
                }
                if (i21 != 0) {
                    z12 = false;
                }
                if (i22 != 0) {
                    z13 = true;
                }
                if (z13) {
                    i16 = aVar.f5685v;
                } else {
                    i16 = i17;
                }
                strM0 = cVar.f6007a;
                c0698o.T(1378571267);
                if (strM0.length() == 0) {
                    strM0 = p000a.a.m0(i16, c0698o);
                }
                c0698o.p(false);
                String str = strM0;
                p241y9.e eVar4 = eVar2;
                boolean z17 = z12;
                r rVar5 = rVar4;
                p015b4.f.n(str, p000a.a.m0(i17, c0698o), B9.a.j(aVar.f5681r, c0698o), rVar5, p074h0.j.d(-698439860, new f(0, z12), c0698o), p074h0.j.d(-1382670165, new I4.d(z17, str, cVar, eVar4, 1), c0698o), c0698o, ((i15 << 9) & 57344) | 1769472, 0);
                rVar3 = rVar5;
                eVar3 = eVar4;
                z15 = z17;
            } else {
                c0698o.N();
                rVar3 = rVar2;
                eVar3 = eVar2;
                z15 = z12;
            }
            z16 = z13;
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new p241y9.e() { // from class: P3.g
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        e.d(cVar, rVar3, eVar3, z15, z16, (C0698o) obj, C0672b.y(i10 | 1), i11);
                        return p110k9.y.f19095a;
                    }
                };
            }
        }
        i14 |= 24576;
        z13 = z11;
        i15 = i14;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0698o.K(i15 & 1, z14)) {
            if (i19 != 0) {
                rVar4 = o.f19333a;
            } else {
                rVar4 = rVar2;
            }
            if (i20 != 0) {
                objH = c0698o.H();
                if (objH == C0690k.f10683a) {
                    objH = new D4.j(14, (byte) 0);
                    c0698o.e0(objH);
                }
                eVar2 = (p241y9.e) objH;
            }
            if (i21 != 0) {
                z12 = false;
            }
            if (i22 != 0) {
                z13 = true;
            }
            if (z13) {
                i16 = aVar.f5685v;
            } else {
                i16 = i17;
            }
            strM0 = cVar.f6007a;
            c0698o.T(1378571267);
            if (strM0.length() == 0) {
                strM0 = p000a.a.m0(i16, c0698o);
            }
            c0698o.p(false);
            String str2 = strM0;
            p241y9.e eVar5 = eVar2;
            boolean z18 = z12;
            r rVar6 = rVar4;
            p015b4.f.n(str2, p000a.a.m0(i17, c0698o), B9.a.j(aVar.f5681r, c0698o), rVar6, p074h0.j.d(-698439860, new f(0, z12), c0698o), p074h0.j.d(-1382670165, new I4.d(z18, str2, cVar, eVar5, 1), c0698o), c0698o, ((i15 << 9) & 57344) | 1769472, 0);
            rVar3 = rVar6;
            eVar3 = eVar5;
            z15 = z18;
        } else {
            c0698o.N();
            rVar3 = rVar2;
            eVar3 = eVar2;
            z15 = z12;
        }
        z16 = z13;
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p241y9.e() { // from class: P3.g
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.d(cVar, rVar3, eVar3, z15, z16, (C0698o) obj, C0672b.y(i10 | 1), i11);
                    return p110k9.y.f19095a;
                }
            };
        }
    }
}
