package p015b4;

import A4.i;
import A5.b;
import D.AbstractC0060c;
import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0076t;
import D.U;
import D.W;
import D.X;
import F9.n;
import H0.I;
import H9.v;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import J0.K;
import K0.AbstractC0359n0;
import W.AbstractC0542b2;
import W.C0;
import W.C1;
import W.G2;
import W.H2;
import W.J1;
import W.V0;
import Y0.l;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import k3.h;
import l0.c;
import l0.o;
import l0.r;
import org.xmlpull.v1.XmlPullParserException;
import p063g1.m;
import p074h0.d;
import p110k9.y;
import p151p.C1256n;
import p180s0.C1303l;
import p180s0.F;
import p180s0.L;
import p180s0.q;
import p180s0.z;
import p224x0.C1441e;
import p224x0.C1442f;
import p224x0.G;
import p241y9.a;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f13263a = new d(2069654052, new A5.d(22), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f13264b = new d(-821444058, new A5.d(23), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f13265c = new d(-687557972, new A5.d(24), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f13266d = new d(135417877, new A5.d(25), false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f13267e = new d(-795465963, new A5.d(26), false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f13268f = new d(-160309181, new A5.d(27), false);
    public static final d g = new d(-1103782194, new A5.d(28), false);

    public static final void a(final String str, final String str2, final r rVar, int i10, C0698o c0698o, final int i11, final int i12) {
        int i13;
        final int i14;
        j.e(str, "codePoints");
        j.e(str2, "subtitleText");
        c0698o.V(-2130549737);
        if ((i11 & 6) == 0) {
            i13 = (c0698o.g(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0698o.g(str2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c0698o.g(rVar) ? 256 : 128;
        }
        int i15 = i12 & 8;
        if (i15 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= c0698o.e(i10) ? 2048 : 1024;
        }
        if (c0698o.K(i13 & 1, (i13 & 1171) != 1170)) {
            int i16 = i15 != 0 ? Integer.MAX_VALUE : i10;
            int i17 = i13 >> 3;
            i((i17 & 112) | (i17 & 14) | 384, 0, c0698o, p074h0.j.d(-1338101514, new b(i16, 2, str), c0698o), str2, rVar);
            i14 = i16;
        } else {
            c0698o.N();
            i14 = i10;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e() { // from class: b4.a
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f.a(str, str2, rVar, i14, (C0698o) obj, C0672b.y(i11 | 1), i12);
                    return y.f19095a;
                }
            };
        }
    }

    public static final void b(String str, String str2, a aVar, a aVar2, C0698o c0698o, int i10) {
        j.e(str, "title");
        j.e(str2, "text");
        j.e(aVar, "onConfirmation");
        j.e(aVar2, "onDismiss");
        c0698o.V(-121090977);
        int i11 = i10 | (c0698o.g(str) ? 4 : 2) | (c0698o.g(str2) ? 32 : 16) | (c0698o.i(aVar) ? 256 : 128) | (c0698o.i(aVar2) ? 2048 : 1024);
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            V0.a(aVar2, p074h0.j.d(-1776428377, new A5.f(aVar, 5, (byte) 0), c0698o), null, p074h0.j.d(-372559191, new A5.f(aVar2, 6, (byte) 0), c0698o), p074h0.j.d(1031309995, new N4.d(str, 1), c0698o), p074h0.j.d(1733244588, new N4.d(str2, 2), c0698o), null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).a(), 0L, 0L, 0L, 0.0f, null, c0698o, ((i11 >> 9) & 14) | 1772592, 16020);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new M4.a(str, str2, aVar, aVar2, i10, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x0189  */
    /* JADX WARN: Code duplicated, block: B:61:0x0198  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void c(final p124m3.j jVar, final r rVar, boolean z10, final boolean z11, C0698o c0698o, final int i10, final int i11) {
        boolean z12;
        boolean z13;
        final boolean z14;
        C0699o0 c0699o0R;
        M0 m10;
        int i12;
        C0286i c0286i;
        C0285h c0285h;
        int i13;
        String strD;
        C0698o c0698o2;
        C1442f c1442fB;
        int i14;
        C0698o c0698o3 = c0698o;
        c0698o3.V(1042751179);
        int i15 = (c0698o3.i(jVar) ? 4 : 2) | i10 | (c0698o3.g(rVar) ? 32 : 16);
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 384) == 0) {
                z12 = z10;
                i15 |= c0698o3.h(z12) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if (c0698o3.h(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i15 |= i14;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0698o3.K(i15 & 1, z13)) {
                if (i16 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                m10 = p005a4.e.f11187a;
                r rVarH = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.a(rVar, ((p005a4.a) c0698o3.k(m10)).g(), F.f21774a), 16);
                C0076t c0076tA = D.r.a(AbstractC0066i.f979c, c.f19309D, c0698o3, 0);
                i12 = c0698o3.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o3.m();
                r rVarC = l0.a.c(c0698o3, rVarH);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o3.X();
                if (c0698o3.f10720O) {
                    c0698o3.l(c0286i);
                } else {
                    c0698o3.h0();
                }
                C0285h c0285h2 = C0287j.f4119f;
                C0672b.v(c0698o3, c0076tA, c0285h2);
                C0285h c0285h3 = C0287j.f4118e;
                C0672b.v(c0698o3, interfaceC0687i0M, c0285h3);
                c0285h = C0287j.g;
                if (c0698o3.f10720O || !j.a(c0698o3.H(), Integer.valueOf(i12))) {
                    p123m2.c.y(i12, c0698o3, i12, c0285h);
                }
                C0285h c0285h4 = C0287j.f4117d;
                C0672b.v(c0698o3, rVarC, c0285h4);
                r rVarL = androidx.compose.foundation.layout.b.l(o.f19333a, 0.0f, 0.0f, 0.0f, 8, 7);
                W wA = U.a(AbstractC0066i.f977a, c.f19306A, c0698o3, 0);
                i13 = c0698o3.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o3.m();
                r rVarC2 = l0.a.c(c0698o3, rVarL);
                c0698o3.X();
                if (c0698o3.f10720O) {
                    c0698o3.l(c0286i);
                } else {
                    c0698o3.h0();
                }
                C0672b.v(c0698o3, wA, c0285h2);
                C0672b.v(c0698o3, interfaceC0687i0M2, c0285h3);
                if (c0698o3.f10720O || !j.a(c0698o3.H(), Integer.valueOf(i13))) {
                    p123m2.c.y(i13, c0698o3, i13, c0285h);
                }
                C0672b.v(c0698o3, rVarC2, c0285h4);
                strD = jVar.d((Context) c0698o3.k(AndroidCompositionLocals_androidKt.f12063b));
                AbstractC0542b2.b(strD, null, ((p005a4.a) c0698o3.k(m10)).m(), n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o3.k(H2.f8580a)).g, c0698o, 199680, 0, 65490);
                c0698o2 = c0698o;
                if (1.0f <= 0.0d) {
                    E.a.a("invalid weight; must be greater than zero");
                }
                AbstractC0060c.a(c0698o2, new LayoutWeightElement(1.0f, true));
                if (z14) {
                    c0698o2.T(-1802628328);
                    String str = p125m4.b.f19615b.format(Integer.valueOf(jVar.f19586b));
                    j.d(str, "format(...)");
                    AbstractC0542b2.b(str, null, ((p005a4.a) c0698o2.k(m10)).j(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o, 0, 0, 131066);
                    c0698o2 = c0698o;
                    c0698o2.p(false);
                } else {
                    if (z11) {
                        c0698o2.T(-1802517844);
                        c1442fB = B1.f13997c;
                        if (c1442fB == null) {
                            C1441e c1441e = new C1441e("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i17 = G.f24154a;
                            L l10 = new L(q.f21839b);
                            C1256n c1256n = new C1256n(13);
                            c1256n.j(9.0f, 16.17f);
                            c1256n.e(5.53f, 12.7f);
                            c1256n.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                            c1256n.c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                            c1256n.f(4.18f, 4.18f);
                            c1256n.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                            c1256n.e(20.29f, 7.71f);
                            c1256n.c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                            c1256n.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                            c1256n.e(9.0f, 16.17f);
                            c1256n.a();
                            C1441e.a(c1441e, (ArrayList) c1256n.f20747s, l10);
                            c1442fB = c1441e.b();
                            B1.f13997c = c1442fB;
                        }
                        C0.b(c1442fB, strD, null, ((p005a4.a) c0698o2.k(m10)).l(), c0698o2, 0, 4);
                    } else {
                        c0698o2.T(-1804154799);
                    }
                    c0698o2.p(false);
                }
                c0698o2.p(true);
                d(jVar.f19590f, ((p005a4.a) c0698o2.k(m10)).h(), ((p005a4.a) c0698o2.k(m10)).g(), n.B(20), null, 1, c0698o, 199680, 16);
                c0698o3 = c0698o;
                c0698o3.p(true);
            } else {
                c0698o3.N();
                z14 = z12;
            }
            c0699o0R = c0698o3.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new e() { // from class: b4.b
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        f.c(jVar, rVar, z14, z11, (C0698o) obj, C0672b.y(i10 | 1), i11);
                        return y.f19095a;
                    }
                };
            }
        }
        i15 |= 384;
        z12 = z10;
        if ((i10 & 3072) == 0) {
            if (c0698o3.h(z11)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i15 |= i14;
        }
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0698o3.K(i15 & 1, z13)) {
            if (i16 != 0) {
                z14 = false;
            } else {
                z14 = z12;
            }
            m10 = p005a4.e.f11187a;
            r rVarH2 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.a(rVar, ((p005a4.a) c0698o3.k(m10)).g(), F.f21774a), 16);
            C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, c.f19309D, c0698o3, 0);
            i12 = c0698o3.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o3.m();
            r rVarC3 = l0.a.c(c0698o3, rVarH2);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o3.X();
            if (c0698o3.f10720O) {
                c0698o3.l(c0286i);
            } else {
                c0698o3.h0();
            }
            C0285h c0285h5 = C0287j.f4119f;
            C0672b.v(c0698o3, c0076tA2, c0285h5);
            C0285h c0285h6 = C0287j.f4118e;
            C0672b.v(c0698o3, interfaceC0687i0M3, c0285h6);
            c0285h = C0287j.g;
            if (c0698o3.f10720O) {
                p123m2.c.y(i12, c0698o3, i12, c0285h);
            } else {
                p123m2.c.y(i12, c0698o3, i12, c0285h);
            }
            C0285h c0285h7 = C0287j.f4117d;
            C0672b.v(c0698o3, rVarC3, c0285h7);
            r rVarL2 = androidx.compose.foundation.layout.b.l(o.f19333a, 0.0f, 0.0f, 0.0f, 8, 7);
            W wA2 = U.a(AbstractC0066i.f977a, c.f19306A, c0698o3, 0);
            i13 = c0698o3.f10721P;
            InterfaceC0687i0 interfaceC0687i0M4 = c0698o3.m();
            r rVarC4 = l0.a.c(c0698o3, rVarL2);
            c0698o3.X();
            if (c0698o3.f10720O) {
                c0698o3.l(c0286i);
            } else {
                c0698o3.h0();
            }
            C0672b.v(c0698o3, wA2, c0285h5);
            C0672b.v(c0698o3, interfaceC0687i0M4, c0285h6);
            if (c0698o3.f10720O) {
                p123m2.c.y(i13, c0698o3, i13, c0285h);
            } else {
                p123m2.c.y(i13, c0698o3, i13, c0285h);
            }
            C0672b.v(c0698o3, rVarC4, c0285h7);
            strD = jVar.d((Context) c0698o3.k(AndroidCompositionLocals_androidKt.f12063b));
            AbstractC0542b2.b(strD, null, ((p005a4.a) c0698o3.k(m10)).m(), n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o3.k(H2.f8580a)).g, c0698o, 199680, 0, 65490);
            c0698o2 = c0698o;
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o2, new LayoutWeightElement(1.0f, true));
            if (z14) {
                c0698o2.T(-1802628328);
                String str2 = p125m4.b.f19615b.format(Integer.valueOf(jVar.f19586b));
                j.d(str2, "format(...)");
                AbstractC0542b2.b(str2, null, ((p005a4.a) c0698o2.k(m10)).j(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o, 0, 0, 131066);
                c0698o2 = c0698o;
                c0698o2.p(false);
            } else {
                if (z11) {
                    c0698o2.T(-1802517844);
                    c1442fB = B1.f13997c;
                    if (c1442fB == null) {
                        C1441e c1441e2 = new C1441e("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i18 = G.f24154a;
                        L l11 = new L(q.f21839b);
                        C1256n c1256n2 = new C1256n(13);
                        c1256n2.j(9.0f, 16.17f);
                        c1256n2.e(5.53f, 12.7f);
                        c1256n2.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        c1256n2.c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        c1256n2.f(4.18f, 4.18f);
                        c1256n2.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        c1256n2.e(20.29f, 7.71f);
                        c1256n2.c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        c1256n2.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        c1256n2.e(9.0f, 16.17f);
                        c1256n2.a();
                        C1441e.a(c1441e2, (ArrayList) c1256n2.f20747s, l11);
                        c1442fB = c1441e2.b();
                        B1.f13997c = c1442fB;
                    }
                    C0.b(c1442fB, strD, null, ((p005a4.a) c0698o2.k(m10)).l(), c0698o2, 0, 4);
                } else {
                    c0698o2.T(-1804154799);
                }
                c0698o2.p(false);
            }
            c0698o2.p(true);
            d(jVar.f19590f, ((p005a4.a) c0698o2.k(m10)).h(), ((p005a4.a) c0698o2.k(m10)).g(), n.B(20), null, 1, c0698o, 199680, 16);
            c0698o3 = c0698o;
            c0698o3.p(true);
        } else {
            c0698o3.N();
            z14 = z12;
        }
        c0699o0R = c0698o3.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e() { // from class: b4.b
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f.c(jVar, rVar, z14, z11, (C0698o) obj, C0672b.y(i10 | 1), i11);
                    return y.f19095a;
                }
            };
        }
    }

    public static final void d(final String str, final long j, final long j10, final long j11, r rVar, final int i10, C0698o c0698o, final int i11, final int i12) {
        r rVar2;
        int i13;
        final r rVar3;
        j.e(str, "codePoints");
        c0698o.V(-2013118135);
        int i14 = i11 | (c0698o.g(str) ? 4 : 2) | (c0698o.f(j) ? 32 : 16) | (c0698o.f(j10) ? 256 : 128);
        int i15 = i12 & 16;
        if (i15 != 0) {
            i13 = i14 | 24576;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = i14 | (c0698o.g(rVar2) ? 16384 : 8192);
        }
        if ((i11 & 196608) == 0) {
            i13 |= c0698o.e(i10) ? 131072 : 65536;
        }
        if (c0698o.K(i13 & 1, (74899 & i13) != 74898)) {
            final r rVar4 = i15 != 0 ? o.f19333a : rVar2;
            C0672b.a(AbstractC0359n0.f5123n.a(m.f16262s), p074h0.j.d(-497912311, new e() { // from class: b4.d
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    boolean z10;
                    C0698o c0698o2 = (C0698o) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                        I iD = AbstractC0071n.d(c.f19313r, false);
                        int i16 = c0698o2.f10721P;
                        InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                        r rVarC = l0.a.c(c0698o2, rVar4);
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
                        if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i16))) {
                            p123m2.c.y(i16, c0698o2, i16, c0285h);
                        }
                        C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                        String strP0 = v.P0(str, "\uea78", "");
                        U0.L l10 = ((G2) c0698o2.k(H2.f8580a)).g;
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(((Context) c0698o2.k(AndroidCompositionLocals_androidKt.f12063b)).getAssets(), "hafs_smart_08.ttf");
                        j.d(typefaceCreateFromAsset, "createFromAsset(...)");
                        Y0.o oVar = new Y0.o(new X4.c(typefaceCreateFromAsset));
                        long j12 = j11;
                        n.j(j12);
                        long jL = n.L(1095216660480L & j12, p063g1.o.c(j12) * 2.0f);
                        FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
                        long j13 = j;
                        int i17 = i10;
                        AbstractC0542b2.b(strP0, fillElement, j13, j12, null, oVar, 0L, null, jL, 0, false, i17, 0, l10, c0698o2, 48, 0, 56240);
                        M0 m10 = AbstractC0359n0.f5118h;
                        final float fW = ((p063g1.c) c0698o2.k(m10)).w(Y2.a.h0(c0698o2).getDimension(R.dimen.end_ayah_overlay_gradient_width) / ((p063g1.c) c0698o2.k(m10)).getDensity());
                        if (i17 == 1) {
                            c0698o2.T(-459817882);
                            r rVarB = androidx.compose.foundation.layout.a.f11825a.b();
                            final long j14 = j10;
                            boolean zF = c0698o2.f(j14) | c0698o2.d(fW);
                            Object objH = c0698o2.H();
                            if (zF || objH == C0690k.f10683a) {
                                objH = new p241y9.c() { // from class: b4.c
                                    @Override // p241y9.c
                                    public final Object e(Object obj3) {
                                        K k7 = (K) obj3;
                                        j.e(k7, "$this$drawWithContent");
                                        long j15 = j14;
                                        p123m2.c.j(k7, new z(p120l9.l.S(new q[]{new q(j15), new q(q.b(j15, 0.0f))}), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fW)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f)))), 0L, 0L, 0.0f, null, 126);
                                        return y.f19095a;
                                    }
                                };
                                c0698o2.e0(objH);
                            }
                            AbstractC0060c.a(c0698o2, androidx.compose.ui.draw.a.c(rVarB, (p241y9.c) objH));
                            z10 = false;
                        } else {
                            z10 = false;
                            c0698o2.T(-461671341);
                        }
                        c0698o2.p(z10);
                        c0698o2.p(true);
                    } else {
                        c0698o2.N();
                    }
                    return y.f19095a;
                }
            }, c0698o), c0698o, 56);
            rVar3 = rVar4;
        } else {
            c0698o.N();
            rVar3 = rVar2;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e() { // from class: b4.e
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f.d(str, j, j10, j11, rVar3, i10, (C0698o) obj, C0672b.y(i11 | 1), i12);
                    return y.f19095a;
                }
            };
        }
    }

    public static final void e(boolean z10, int i10, String str, d dVar, C0698o c0698o, int i11) {
        j.e(str, "emptyString");
        c0698o.V(-1644445970);
        int i12 = i11 | (c0698o.h(z10) ? 4 : 2) | (c0698o.e(i10) ? 32 : 16) | (c0698o.g(str) ? 256 : 128);
        if (c0698o.K(i12 & 1, (i12 & 1171) != 1170)) {
            C1.a(androidx.compose.foundation.layout.c.f11828c, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).d(), 0L, 0.0f, 0.0f, null, p074h0.j.d(-633435255, new g(z10, dVar, i10, str), c0698o), c0698o, 12582918, 122);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new g(z10, i10, str, dVar, i11);
        }
    }

    public static final void f(int i10, int i11, C0698o c0698o, d dVar, String str, r rVar) {
        int i12;
        String str2;
        int i13;
        d dVar2;
        C0698o c0698o2 = c0698o;
        c0698o2.V(-2094019702);
        if ((i10 & 6) == 0) {
            i12 = (c0698o2.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i13 = i12 | 48;
            str2 = str;
        } else {
            str2 = str;
            i13 = i12 | (c0698o2.g(str2) ? 32 : 16);
        }
        if (c0698o2.K(i13 & 1, (i13 & 147) != 146)) {
            String str3 = i14 != 0 ? "" : str2;
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, c.f19309D, c0698o2, 0);
            int i15 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVar);
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
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o2, i15, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            if (str3.length() > 0) {
                c0698o2.T(786976263);
                h(str3, null, 0L, c0698o2, (i13 >> 3) & 14, 6);
            } else {
                c0698o2.T(786464174);
            }
            c0698o2.p(false);
            dVar2 = dVar;
            V0.e(null, null, V0.m(((p005a4.a) c0698o2.k(p005a4.e.f11187a)).g(), c0698o2), null, null, p074h0.j.d(1291328162, new A4.f(7, dVar2), c0698o2), c0698o, 196608, 27);
            c0698o2 = c0698o;
            c0698o2.p(true);
            str2 = str3;
        } else {
            dVar2 = dVar;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new h(rVar, str2, dVar2, i10, i11);
        }
    }

    public static final void g(String str, String str2, r rVar, C0698o c0698o, int i10) {
        C0698o c0698o2 = c0698o;
        j.e(str, "title");
        j.e(str2, "description");
        c0698o2.V(-1017124730);
        int i11 = i10 | (c0698o2.g(str) ? 4 : 2) | (c0698o2.g(str2) ? 32 : 16) | (c0698o2.g(rVar) ? 256 : 128);
        if (c0698o2.K(i11 & 1, (i11 & 147) != 146)) {
            M0 m10 = p005a4.e.f11187a;
            r rVarH = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.a(rVar, ((p005a4.a) c0698o2.k(m10)).g(), F.f21774a), 16);
            W wA = U.a(AbstractC0066i.f977a, c.f19306A, c0698o2, 0);
            int i12 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarH);
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
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o2, i12, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            AbstractC0542b2.b(str, null, ((p005a4.a) c0698o2.k(m10)).m(), n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).g, c0698o, (i11 & 14) | 199680, 0, 65490);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o, new LayoutWeightElement(1.0f, true));
            AbstractC0542b2.b(str2, null, ((p005a4.a) c0698o.k(m10)).j(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o, (i11 >> 3) & 14, 0, 131066);
            c0698o2 = c0698o;
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new X4.d(str, str2, rVar, i10, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void h(final String str, r rVar, long j, C0698o c0698o, final int i10, final int i11) {
        int i12;
        r rVar2;
        boolean z10;
        final long j10;
        final r rVar3;
        C0699o0 c0699o0R;
        r rVar4;
        long j11;
        j.e(str, "text");
        c0698o.V(-1432060554);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.g(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 48) == 0) {
                rVar2 = rVar;
                i12 |= c0698o.g(rVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i12 |= 128;
            }
            if ((i12 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o.K(i12 & 1, z10)) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i13 != 0) {
                        rVar4 = o.f19333a;
                    } else {
                        rVar4 = rVar2;
                    }
                    j11 = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).j();
                } else {
                    c0698o.N();
                    rVar4 = rVar2;
                    j11 = j;
                }
                c0698o.q();
                String upperCase = str.toUpperCase(Locale.ROOT);
                j.d(upperCase, "toUpperCase(...)");
                AbstractC0542b2.b(upperCase, androidx.compose.foundation.layout.b.j(rVar4, 0.0f, 8, 1).b(androidx.compose.foundation.layout.c.f11826a), j11, n.B(15), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).f8563h, c0698o, 199680, 0, 65488);
                rVar3 = rVar4;
                j10 = j11;
            } else {
                c0698o.N();
                j10 = j;
                rVar3 = rVar2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new e() { // from class: b4.i
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        f.h(str, rVar3, j10, (C0698o) obj, C0672b.y(i10 | 1), i11);
                        return y.f19095a;
                    }
                };
            }
        }
        i12 |= 48;
        rVar2 = rVar;
        if ((i10 & 384) == 0) {
            i12 |= 128;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o.K(i12 & 1, z10)) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                j11 = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).j();
            } else {
                if (i13 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                j11 = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).j();
            }
            c0698o.q();
            String upperCase2 = str.toUpperCase(Locale.ROOT);
            j.d(upperCase2, "toUpperCase(...)");
            AbstractC0542b2.b(upperCase2, androidx.compose.foundation.layout.b.j(rVar4, 0.0f, 8, 1).b(androidx.compose.foundation.layout.c.f11826a), j11, n.B(15), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).f8563h, c0698o, 199680, 0, 65488);
            rVar3 = rVar4;
            j10 = j11;
        } else {
            c0698o.N();
            j10 = j;
            rVar3 = rVar2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e() { // from class: b4.i
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f.h(str, rVar3, j10, (C0698o) obj, C0672b.y(i10 | 1), i11);
                    return y.f19095a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void i(int i10, int i11, C0698o c0698o, d dVar, String str, r rVar) {
        int i12;
        r rVar2;
        boolean z10;
        r rVar3;
        C0699o0 c0699o0R;
        r rVar4;
        int i13;
        C0286i c0286i;
        C0285h c0285h;
        int i14;
        j.e(str, "subtitleText");
        c0698o.V(1166863892);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.g(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                rVar2 = rVar;
                i12 |= c0698o.g(rVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if (c0698o.i(dVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o.K(i12 & 1, z10)) {
                if (i15 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                r rVarB = rVar4.b(androidx.compose.foundation.layout.c.f11826a);
                C0076t c0076tA = D.r.a(AbstractC0066i.f979c, c.f19309D, c0698o, 0);
                i13 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                r rVarC = l0.a.c(c0698o, rVarB);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0076tA, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                c0285h = C0287j.g;
                if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i13))) {
                    p123m2.c.y(i13, c0698o, i13, c0285h);
                }
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                dVar.invoke(c0698o, Integer.valueOf((i12 >> 6) & 14));
                AbstractC0542b2.b(str, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).h(), n.B(12), l.f10359t, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).f8564i, c0698o, (i12 & 14) | 199680, 0, 65490);
                c0698o.p(true);
                rVar3 = rVar4;
            } else {
                c0698o.N();
                rVar3 = rVar2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new h(str, rVar3, dVar, i10, i11);
            }
        }
        i12 |= 48;
        rVar2 = rVar;
        if ((i10 & 384) == 0) {
            if (c0698o.i(dVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o.K(i12 & 1, z10)) {
            if (i15 != 0) {
                rVar4 = o.f19333a;
            } else {
                rVar4 = rVar2;
            }
            r rVarB2 = rVar4.b(androidx.compose.foundation.layout.c.f11826a);
            C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, c.f19309D, c0698o, 0);
            i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            r rVarC2 = l0.a.c(c0698o, rVarB2);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA2, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M2, C0287j.f4118e);
            c0285h = C0287j.g;
            if (c0698o.f10720O) {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            } else {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            }
            C0672b.v(c0698o, rVarC2, C0287j.f4117d);
            dVar.invoke(c0698o, Integer.valueOf((i12 >> 6) & 14));
            AbstractC0542b2.b(str, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).h(), n.B(12), l.f10359t, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).f8564i, c0698o, (i12 & 14) | 199680, 0, 65490);
            c0698o.p(true);
            rVar3 = rVar4;
        } else {
            c0698o.N();
            rVar3 = rVar2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new h(str, rVar3, dVar, i10, i11);
        }
    }

    public static final void j(int i10, int i11, C0698o c0698o) {
        c0698o.V(287536220);
        int i12 = (c0698o.e(i10) ? 4 : 2) | i11;
        if (c0698o.K(i12 & 1, (i12 & 3) != 2)) {
            float f3 = 16;
            AbstractC0542b2.b(p000a.a.m0(i10, c0698o), androidx.compose.foundation.layout.b.k(androidx.compose.foundation.layout.c.f11826a, f3, 32, f3, f3), ((p005a4.a) c0698o.k(p005a4.e.f11187a)).m(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, U0.L.a(((G2) c0698o.k(H2.f8580a)).g, 0L, n.B(24), null, null, 0L, 0L, null, 16777213), c0698o, 0, 0, 65528);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new N4.a(i10, i11, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0235  */
    /* JADX WARN: Code duplicated, block: B:108:0x026a A[LOOP:1: B:106:0x0264->B:108:0x026a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0283  */
    /* JADX WARN: Code duplicated, block: B:112:0x028b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0291  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:127:0x030a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0386  */
    /* JADX WARN: Code duplicated, block: B:132:0x038a  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:146:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0159  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0182  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x021a  */
    public static final void k(final LocalTime localTime, final boolean z10, int i10, k3.j jVar, h hVar, final p241y9.f fVar, DateTimeFormatter dateTimeFormatter, C0698o c0698o, int i11) {
        k3.j jVar2;
        p241y9.f fVar2;
        S s10;
        int i12;
        String str;
        boolean z11;
        boolean zI;
        Object objH;
        Context context;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Iterator it;
        boolean zIsEmpty;
        int iIntValue;
        ArrayList arrayList2;
        int size;
        int i13;
        String strL0;
        Integer num;
        Integer num2;
        final h hVar2 = hVar;
        j.e(hVar2, "reminderIdentifier");
        j.e(fVar, "onToggleReminders");
        c0698o.V(-206467251);
        int i14 = (i11 & 6) == 0 ? (c0698o.i(localTime) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= c0698o.h(z10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= c0698o.e(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= c0698o.i(jVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= c0698o.i(hVar2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i14 |= c0698o.i(fVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i14 |= c0698o.i(dateTimeFormatter) ? 1048576 : 524288;
        }
        if (c0698o.K(i14 & 1, (599187 & i14) != 599186)) {
            FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
            M0 m10 = p005a4.e.f11187a;
            r rVarA = androidx.compose.foundation.a.a(fillElement, ((p005a4.a) c0698o.k(m10)).g(), F.f21774a);
            int i15 = 458752 & i14;
            boolean zI2 = (i15 == 131072) | c0698o.i(hVar2) | ((i14 & 112) == 32) | c0698o.i(localTime);
            Object objH2 = c0698o.H();
            S s11 = C0690k.f10683a;
            if (zI2 || objH2 == s11) {
                objH2 = new a() { // from class: b4.j
                    @Override // p241y9.a
                    public final Object invoke() {
                        LocalTime localTime2 = localTime;
                        fVar.d(hVar2, Boolean.valueOf(z10), localTime2);
                        return y.f19095a;
                    }
                };
                c0698o.e0(objH2);
            }
            r rVarH = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.c(rVarA, z10, null, (a) objH2, 6), 16);
            W wA = U.a(AbstractC0066i.f977a, c.f19307B, c0698o, 48);
            int i16 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarH);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o, wA, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            int i17 = i14;
            if (c0698o.f10720O) {
                s10 = s11;
            } else {
                s10 = s11;
                if (!j.a(c0698o.H(), Integer.valueOf(i16))) {
                }
                C0285h c0285h4 = C0287j.f4117d;
                C0672b.v(c0698o, rVarC, c0285h4);
                if (1.0f <= 0.0d) {
                    E.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C0076t c0076tA = D.r.a(AbstractC0066i.f979c, c.f19309D, c0698o, 0);
                i12 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                r rVarC2 = l0.a.c(c0698o, layoutWeightElement);
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
                S s12 = s10;
                AbstractC0542b2.b(p000a.a.m0(i10, c0698o), null, ((p005a4.a) c0698o.k(m10)).k(), n.B(17), null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).g, c0698o, 3072, 0, 65522);
                str = localTime.format(dateTimeFormatter);
                if (jVar != null) {
                    c0698o.T(-1552867747);
                    context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                    j.e(context, "context");
                    jVar2 = jVar;
                    if (jVar2.equals(k3.j.f18978k)) {
                        strL0 = context.getString(R.string.every_day);
                        j.b(strL0);
                    } else {
                        Map map = (Map) jVar2.f18985h.getValue();
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        arrayList = new ArrayList(linkedHashMap.size());
                        it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add((String) ((Map.Entry) it.next()).getKey());
                        }
                        zIsEmpty = arrayList.isEmpty();
                        iIntValue = R.string.never;
                        if (zIsEmpty) {
                            strL0 = context.getString(R.string.never);
                            j.b(strL0);
                        } else if (arrayList.size() == 1) {
                            num2 = (Integer) ((Map) jVar2.f18986i.getValue()).get(p120l9.m.f0(arrayList));
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            }
                            strL0 = context.getString(iIntValue);
                            j.b(strL0);
                        } else {
                            arrayList2 = new ArrayList();
                            size = arrayList.size();
                            i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                num = (Integer) ((Map) jVar2.j.getValue()).get((String) obj);
                                if (num != null) {
                                    arrayList2.add(num);
                                }
                            }
                            strL0 = p120l9.m.l0(arrayList2, " ", null, null, new i(context, 3), 30);
                        }
                    }
                    str = str + "  " + strL0;
                    c0698o.p(false);
                } else {
                    jVar2 = jVar;
                    c0698o.T(-1552782311);
                    c0698o.p(false);
                }
                String str2 = str;
                j.b(str2);
                U0.L l10 = ((G2) c0698o.k(H2.f8580a)).f8563h;
                M0 m11 = p005a4.e.f11187a;
                AbstractC0542b2.b(str2, null, ((p005a4.a) c0698o.k(m11)).h(), n.B(12), null, null, 0L, null, 0L, 0, false, 0, 0, l10, c0698o, 3072, 0, 65522);
                c0698o.p(true);
                J1 j1O = V0.o(((p005a4.a) c0698o.k(m11)).l(), q.b(((p005a4.a) c0698o.k(m11)).l(), 0.54f), 0L, 0L, c0698o, 65532);
                if (i15 == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hVar2 = hVar;
                zI = c0698o.i(hVar2) | z11 | c0698o.i(localTime);
                objH = c0698o.H();
                if (!zI || objH == s12) {
                    fVar2 = fVar;
                    objH = new Ca.h(fVar2, hVar2, localTime, 6);
                    c0698o.e0(objH);
                } else {
                    fVar2 = fVar;
                }
                androidx.compose.material3.a.a(z10, (p241y9.c) objH, null, false, j1O, c0698o, (i17 >> 3) & 14);
                c0698o.p(true);
            }
            p123m2.c.y(i16, c0698o, i16, c0285h3);
            C0285h c0285h5 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h5);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, c.f19309D, c0698o, 0);
            i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
            r rVarC3 = l0.a.c(c0698o, layoutWeightElement2);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA2, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M3, c0285h2);
            if (c0698o.f10720O) {
                p123m2.c.y(i12, c0698o, i12, c0285h3);
            } else {
                p123m2.c.y(i12, c0698o, i12, c0285h3);
            }
            C0672b.v(c0698o, rVarC3, c0285h5);
            S s13 = s10;
            AbstractC0542b2.b(p000a.a.m0(i10, c0698o), null, ((p005a4.a) c0698o.k(m10)).k(), n.B(17), null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).g, c0698o, 3072, 0, 65522);
            str = localTime.format(dateTimeFormatter);
            if (jVar != null) {
                c0698o.T(-1552867747);
                context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
                j.e(context, "context");
                jVar2 = jVar;
                if (jVar2.equals(k3.j.f18978k)) {
                    strL0 = context.getString(R.string.every_day);
                    j.b(strL0);
                } else {
                    Map map2 = (Map) jVar2.f18985h.getValue();
                    linkedHashMap = new LinkedHashMap();
                    while (r6.hasNext()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList = new ArrayList(linkedHashMap.size());
                    it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Map.Entry) it.next()).getKey());
                    }
                    zIsEmpty = arrayList.isEmpty();
                    iIntValue = R.string.never;
                    if (zIsEmpty) {
                        strL0 = context.getString(R.string.never);
                        j.b(strL0);
                    } else if (arrayList.size() == 1) {
                        num2 = (Integer) ((Map) jVar2.f18986i.getValue()).get(p120l9.m.f0(arrayList));
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        }
                        strL0 = context.getString(iIntValue);
                        j.b(strL0);
                    } else {
                        arrayList2 = new ArrayList();
                        size = arrayList.size();
                        i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            num = (Integer) ((Map) jVar2.j.getValue()).get((String) obj2);
                            if (num != null) {
                                arrayList2.add(num);
                            }
                        }
                        strL0 = p120l9.m.l0(arrayList2, " ", null, null, new i(context, 3), 30);
                    }
                }
                str = str + "  " + strL0;
                c0698o.p(false);
            } else {
                jVar2 = jVar;
                c0698o.T(-1552782311);
                c0698o.p(false);
            }
            String str3 = str;
            j.b(str3);
            U0.L l11 = ((G2) c0698o.k(H2.f8580a)).f8563h;
            M0 m12 = p005a4.e.f11187a;
            AbstractC0542b2.b(str3, null, ((p005a4.a) c0698o.k(m12)).h(), n.B(12), null, null, 0L, null, 0L, 0, false, 0, 0, l11, c0698o, 3072, 0, 65522);
            c0698o.p(true);
            J1 j1O2 = V0.o(((p005a4.a) c0698o.k(m12)).l(), q.b(((p005a4.a) c0698o.k(m12)).l(), 0.54f), 0L, 0L, c0698o, 65532);
            if (i15 == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2 = hVar;
            zI = c0698o.i(hVar2) | z11 | c0698o.i(localTime);
            objH = c0698o.H();
            if (zI) {
                fVar2 = fVar;
                objH = new Ca.h(fVar2, hVar2, localTime, 6);
                c0698o.e0(objH);
            } else {
                fVar2 = fVar;
                objH = new Ca.h(fVar2, hVar2, localTime, 6);
                c0698o.e0(objH);
            }
            androidx.compose.material3.a.a(z10, (p241y9.c) objH, null, false, j1O2, c0698o, (i17 >> 3) & 14);
            c0698o.p(true);
        } else {
            jVar2 = jVar;
            fVar2 = fVar;
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G4.l(localTime, z10, i10, jVar2, hVar2, fVar2, dateTimeFormatter, i11);
        }
    }

    public static final void l(String str, LocalTime localTime, a aVar, p241y9.c cVar, C0698o c0698o, int i10) {
        j.e(localTime, "initialTime");
        j.e(aVar, "onCancel");
        j.e(cVar, "onConfirm");
        c0698o.V(1964646449);
        int i11 = i10 | 6 | (c0698o.i(localTime) ? 32 : 16) | (c0698o.i(cVar) ? 2048 : 1024);
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            AbstractC0813f2.a(aVar, new p104k1.n(3), p074h0.j.d(1718593032, new k(localTime, aVar, cVar, 0), c0698o), c0698o, 438);
            str = "";
        } else {
            c0698o.N();
        }
        String str2 = str;
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new M4.a(str2, localTime, aVar, cVar, i10, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void m(String str, r rVar, p241y9.f fVar, d dVar, C0698o c0698o, int i10, int i11) {
        int i12;
        p241y9.f fVar2;
        boolean z10;
        p241y9.f fVar3;
        C0699o0 c0699o0R;
        p241y9.f fVar4;
        int i13;
        C0286i c0286i;
        C0285h c0285h;
        int i14;
        C0698o c0698o2 = c0698o;
        j.e(str, "title");
        c0698o2.V(-1705527267);
        if ((i10 & 6) == 0) {
            i12 = (c0698o2.g(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o2.g(rVar) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 384) == 0) {
                fVar2 = fVar;
                i12 |= c0698o2.i(fVar2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if (c0698o2.i(dVar)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o2.K(i12 & 1, z10)) {
                if (i15 != 0) {
                    fVar4 = g;
                } else {
                    fVar4 = fVar2;
                }
                r rVarB = rVar.b(androidx.compose.foundation.layout.c.f11826a);
                W wA = U.a(AbstractC0066i.f977a, c.f19306A, c0698o2, 0);
                i13 = c0698o2.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                r rVarC = l0.a.c(c0698o2, rVarB);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o2.X();
                if (c0698o2.f10720O) {
                    c0698o2.l(c0286i);
                } else {
                    c0698o2.h0();
                }
                C0672b.v(c0698o2, wA, C0287j.f4119f);
                C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                c0285h = C0287j.g;
                if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i13))) {
                    p123m2.c.y(i13, c0698o2, i13, c0285h);
                }
                C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                Integer numValueOf = Integer.valueOf(6 | ((i12 >> 6) & 112));
                X x9 = X.f924a;
                dVar.d(x9, c0698o2, numValueOf);
                AbstractC0542b2.b(str, androidx.compose.foundation.layout.b.j(p245z2.a.J(new VerticalAlignElement()), 0.0f, 16, 1), ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).k(), n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).g, c0698o, (i12 & 14) | 199680, 0, 65488);
                c0698o2 = c0698o;
                fVar3 = fVar4;
                fVar3.d(x9, c0698o2, Integer.valueOf(6 | ((i12 >> 3) & 112)));
                c0698o2.p(true);
            } else {
                c0698o2.N();
                fVar3 = fVar2;
            }
            c0699o0R = c0698o2.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new W4.b(str, rVar, fVar3, dVar, i10, i11);
            }
        }
        i12 |= 384;
        fVar2 = fVar;
        if ((i10 & 3072) == 0) {
            if (c0698o2.i(dVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o2.K(i12 & 1, z10)) {
            if (i15 != 0) {
                fVar4 = g;
            } else {
                fVar4 = fVar2;
            }
            r rVarB2 = rVar.b(androidx.compose.foundation.layout.c.f11826a);
            W wA2 = U.a(AbstractC0066i.f977a, c.f19306A, c0698o2, 0);
            i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
            r rVarC2 = l0.a.c(c0698o2, rVarB2);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, wA2, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M2, C0287j.f4118e);
            c0285h = C0287j.g;
            if (c0698o2.f10720O) {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            } else {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            }
            C0672b.v(c0698o2, rVarC2, C0287j.f4117d);
            Integer numValueOf2 = Integer.valueOf(6 | ((i12 >> 6) & 112));
            X x10 = X.f924a;
            dVar.d(x10, c0698o2, numValueOf2);
            AbstractC0542b2.b(str, androidx.compose.foundation.layout.b.j(p245z2.a.J(new VerticalAlignElement()), 0.0f, 16, 1), ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).k(), n.B(18), l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).g, c0698o, (i12 & 14) | 199680, 0, 65488);
            c0698o2 = c0698o;
            fVar3 = fVar4;
            fVar3.d(x10, c0698o2, Integer.valueOf(6 | ((i12 >> 3) & 112)));
            c0698o2.p(true);
        } else {
            c0698o2.N();
            fVar3 = fVar2;
        }
        c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new W4.b(str, rVar, fVar3, dVar, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void n(final String str, final String str2, final long j, final r rVar, p241y9.f fVar, p241y9.f fVar2, C0698o c0698o, final int i10, final int i11) {
        int i12;
        p241y9.f fVar3;
        int i13;
        p241y9.f fVar4;
        int i14;
        boolean z10;
        final p241y9.f fVar5;
        final p241y9.f fVar6;
        C0699o0 c0699o0R;
        final p241y9.f fVar7;
        j.e(str, "title");
        j.e(str2, "contentDescription");
        c0698o.V(-1968591148);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.g(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.g(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o.e(2131230845) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0698o.f(j) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.g(rVar) ? 16384 : 8192;
        }
        int i15 = i11 & 32;
        if (i15 == 0) {
            if ((196608 & i10) == 0) {
                fVar3 = fVar;
                i12 |= c0698o.i(fVar3) ? 131072 : 65536;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                if ((1572864 & i10) == 0) {
                    fVar4 = fVar2;
                    if (c0698o.i(fVar4)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
                if ((599187 & i12) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0698o.K(i12 & 1, z10)) {
                    if (i15 != 0) {
                        fVar7 = f13267e;
                    } else {
                        fVar7 = fVar3;
                    }
                    if (i13 != 0) {
                        fVar6 = f13268f;
                    } else {
                        fVar6 = fVar4;
                    }
                    m(str, rVar, fVar6, p074h0.j.d(1791058773, new p241y9.f() { // from class: b4.l
                        @Override // p241y9.f
                        public final Object d(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
                            X x9 = (X) obj;
                            C0698o c0698o2 = (C0698o) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            j.e(x9, "$this$TitleImageRow");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= c0698o2.g(x9) ? 4 : 2;
                            }
                            if (c0698o2.K(iIntValue & 1, (iIntValue & 19) != 18)) {
                                fVar7.d(x9, c0698o2, Integer.valueOf(iIntValue & 14));
                                p181s2.o.b(n.M(2131230845, c0698o2), str2, androidx.compose.foundation.layout.b.j(new VerticalAlignElement(), 16, 0.0f, 2), null, null, 0.0f, new C1303l(j, 5), c0698o2, 0, 56);
                            } else {
                                c0698o2.N();
                            }
                            return y.f19095a;
                        }
                    }, c0698o), c0698o, (i12 & 14) | 3072 | ((i12 >> 9) & 112) | ((i12 >> 12) & 896), 0);
                    fVar5 = fVar7;
                } else {
                    c0698o.N();
                    fVar5 = fVar3;
                    fVar6 = fVar4;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new e() { // from class: b4.m
                        @Override // p241y9.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            f.n(str, str2, j, rVar, fVar5, fVar6, (C0698o) obj, C0672b.y(i10 | 1), i11);
                            return y.f19095a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            fVar4 = fVar2;
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o.K(i12 & 1, z10)) {
                if (i15 != 0) {
                    fVar7 = f13267e;
                } else {
                    fVar7 = fVar3;
                }
                if (i13 != 0) {
                    fVar6 = f13268f;
                } else {
                    fVar6 = fVar4;
                }
                m(str, rVar, fVar6, p074h0.j.d(1791058773, new p241y9.f() { // from class: b4.l
                    @Override // p241y9.f
                    public final Object d(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
                        X x9 = (X) obj;
                        C0698o c0698o2 = (C0698o) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        j.e(x9, "$this$TitleImageRow");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= c0698o2.g(x9) ? 4 : 2;
                        }
                        if (c0698o2.K(iIntValue & 1, (iIntValue & 19) != 18)) {
                            fVar7.d(x9, c0698o2, Integer.valueOf(iIntValue & 14));
                            p181s2.o.b(n.M(2131230845, c0698o2), str2, androidx.compose.foundation.layout.b.j(new VerticalAlignElement(), 16, 0.0f, 2), null, null, 0.0f, new C1303l(j, 5), c0698o2, 0, 56);
                        } else {
                            c0698o2.N();
                        }
                        return y.f19095a;
                    }
                }, c0698o), c0698o, (i12 & 14) | 3072 | ((i12 >> 9) & 112) | ((i12 >> 12) & 896), 0);
                fVar5 = fVar7;
            } else {
                c0698o.N();
                fVar5 = fVar3;
                fVar6 = fVar4;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new e() { // from class: b4.m
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        f.n(str, str2, j, rVar, fVar5, fVar6, (C0698o) obj, C0672b.y(i10 | 1), i11);
                        return y.f19095a;
                    }
                };
            }
        }
        i12 |= 196608;
        fVar3 = fVar;
        i13 = i11 & 64;
        if (i13 != 0) {
            if ((1572864 & i10) == 0) {
                fVar4 = fVar2;
                if (c0698o.i(fVar4)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o.K(i12 & 1, z10)) {
                if (i15 != 0) {
                    fVar7 = f13267e;
                } else {
                    fVar7 = fVar3;
                }
                if (i13 != 0) {
                    fVar6 = f13268f;
                } else {
                    fVar6 = fVar4;
                }
                m(str, rVar, fVar6, p074h0.j.d(1791058773, new p241y9.f() { // from class: b4.l
                    @Override // p241y9.f
                    public final Object d(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
                        X x9 = (X) obj;
                        C0698o c0698o2 = (C0698o) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        j.e(x9, "$this$TitleImageRow");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= c0698o2.g(x9) ? 4 : 2;
                        }
                        if (c0698o2.K(iIntValue & 1, (iIntValue & 19) != 18)) {
                            fVar7.d(x9, c0698o2, Integer.valueOf(iIntValue & 14));
                            p181s2.o.b(n.M(2131230845, c0698o2), str2, androidx.compose.foundation.layout.b.j(new VerticalAlignElement(), 16, 0.0f, 2), null, null, 0.0f, new C1303l(j, 5), c0698o2, 0, 56);
                        } else {
                            c0698o2.N();
                        }
                        return y.f19095a;
                    }
                }, c0698o), c0698o, (i12 & 14) | 3072 | ((i12 >> 9) & 112) | ((i12 >> 12) & 896), 0);
                fVar5 = fVar7;
            } else {
                c0698o.N();
                fVar5 = fVar3;
                fVar6 = fVar4;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new e() { // from class: b4.m
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        f.n(str, str2, j, rVar, fVar5, fVar6, (C0698o) obj, C0672b.y(i10 | 1), i11);
                        return y.f19095a;
                    }
                };
            }
        }
        i12 |= 1572864;
        fVar4 = fVar2;
        if ((599187 & i12) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o.K(i12 & 1, z10)) {
            if (i15 != 0) {
                fVar7 = f13267e;
            } else {
                fVar7 = fVar3;
            }
            if (i13 != 0) {
                fVar6 = f13268f;
            } else {
                fVar6 = fVar4;
            }
            m(str, rVar, fVar6, p074h0.j.d(1791058773, new p241y9.f() { // from class: b4.l
                @Override // p241y9.f
                public final Object d(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
                    X x9 = (X) obj;
                    C0698o c0698o2 = (C0698o) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    j.e(x9, "$this$TitleImageRow");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= c0698o2.g(x9) ? 4 : 2;
                    }
                    if (c0698o2.K(iIntValue & 1, (iIntValue & 19) != 18)) {
                        fVar7.d(x9, c0698o2, Integer.valueOf(iIntValue & 14));
                        p181s2.o.b(n.M(2131230845, c0698o2), str2, androidx.compose.foundation.layout.b.j(new VerticalAlignElement(), 16, 0.0f, 2), null, null, 0.0f, new C1303l(j, 5), c0698o2, 0, 56);
                    } else {
                        c0698o2.N();
                    }
                    return y.f19095a;
                }
            }, c0698o), c0698o, (i12 & 14) | 3072 | ((i12 >> 9) & 112) | ((i12 >> 12) & 896), 0);
            fVar5 = fVar7;
        } else {
            c0698o.N();
            fVar5 = fVar3;
            fVar6 = fVar4;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e() { // from class: b4.m
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f.n(str, str2, j, rVar, fVar5, fVar6, (C0698o) obj, C0672b.y(i10 | 1), i11);
                    return y.f19095a;
                }
            };
        }
    }
}
