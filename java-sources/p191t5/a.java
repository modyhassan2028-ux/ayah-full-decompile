package p191t5;

import A4.h;
import B9.a;
import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0061d;
import D.C0076t;
import D.U;
import D.W;
import D4.l;
import F9.n;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import W.AbstractC0537a1;
import W.AbstractC0542b2;
import W.AbstractC0568i0;
import W.C0;
import W.C0560g0;
import W.C0569i1;
import W.C0578l1;
import W.C0604u1;
import W.G2;
import W.H2;
import W.V0;
import W.Z0;
import W4.e;
import Z.C0672b;
import Z.C0673b0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import Z.X;
import java.io.IOException;
import java.util.List;
import l0.i;
import l0.o;
import l0.r;
import org.xmlpull.v1.XmlPullParserException;
import p063g1.m;
import p068g6.c;
import p074h0.d;
import p110k9.y;
import p171r0.f;
import p180s0.q;
import p215w0.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f22605a = new d(1820230329, new p026c5.a(22), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f22606b = new d(-1081058715, new c(1), false);

    public static final void a(int i10, List list, p241y9.c cVar, p241y9.a aVar, p241y9.c cVar2, p241y9.a aVar2, C0698o c0698o, int i11) throws XmlPullParserException, IOException {
        int i12;
        C0698o c0698o2 = c0698o;
        j.e(cVar, "numberFormatter");
        j.e(aVar, "onJumpBackPressed");
        j.e(cVar2, "onPageSelected");
        j.e(aVar2, "onPageSettingsPressed");
        c0698o2.V(809805176);
        if ((i11 & 6) == 0) {
            i12 = (c0698o2.e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0698o2.i(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0698o2.i(cVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0698o2.i(aVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c0698o2.i(cVar2) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i12 |= c0698o2.i(aVar2) ? 131072 : 65536;
        }
        int i13 = i12;
        if (c0698o2.K(i13 & 1, (74899 & i13) != 74898)) {
            Object objH = c0698o2.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.r(Boolean.FALSE);
                c0698o2.e0(objH);
            }
            X x9 = (X) objH;
            i iVar = l0.c.f19307B;
            C0061d c0061d = AbstractC0066i.g;
            o oVar = o.f19333a;
            r rVarB = androidx.compose.foundation.layout.c.d(oVar, 56).b(androidx.compose.foundation.layout.c.f11826a);
            W wA = U.a(c0061d, iVar, c0698o2, 54);
            int i14 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarB);
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
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o2, i14, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC, c0285h4);
            I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i15 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
            r rVarC2 = l0.a.c(c0698o2, oVar);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, iD, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o2, i15, c0285h3);
            }
            C0672b.v(c0698o2, rVarC2, c0285h4);
            Object objH2 = c0698o2.H();
            if (objH2 == s10) {
                objH2 = new h(x9, 12);
                c0698o2.e0(objH2);
            }
            int i16 = i13 >> 3;
            int i17 = i16 & 112;
            c(i10, cVar, aVar, (p241y9.a) objH2, c0698o2, (i13 & 14) | 3072 | i17 | (i16 & 896));
            c0698o2 = c0698o2;
            boolean zBooleanValue = ((Boolean) x9.getValue()).booleanValue();
            Object objH3 = c0698o2.H();
            if (objH3 == s10) {
                objH3 = new h(x9, 13);
                c0698o2.e0(objH3);
            }
            d(list, cVar, zBooleanValue, cVar2, (p241y9.a) objH3, c0698o2, (i16 & 14) | 24576 | i17 | (i16 & 7168));
            c0698o2.p(true);
            V0.h(aVar2, null, false, null, f22605a, c0698o2, ((i13 >> 15) & 14) | 196608, 30);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e(i10, list, cVar, aVar, cVar2, aVar2, i11);
        }
    }

    public static final void b(final C0604u1 c0604u1, r rVar, C0698o c0698o, int i10) {
        int i11;
        r rVar2;
        j.e(c0604u1, "sliderState");
        E9.a aVar = c0604u1.f9403t;
        float f3 = aVar.f1994b;
        float f7 = aVar.f1993a;
        c0698o.V(-1058850880);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0698o.g(c0604u1) : c0698o.i(c0604u1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        boolean z10 = true;
        if (c0698o.K(i12 & 1, (i12 & 19) != 18)) {
            M0 m10 = p005a4.e.f11187a;
            final long jE = ((p005a4.a) c0698o.k(m10)).e();
            final long jE2 = ((p005a4.a) c0698o.k(m10)).e();
            final long jE3 = ((p005a4.a) c0698o.k(m10)).e();
            final long jE4 = ((p005a4.a) c0698o.k(m10)).e();
            float fK = B0.c.k(c0604u1.f9404u.g(), f7, f3);
            float f10 = f3 - f7;
            final float fK2 = B0.c.k(f10 == 0.0f ? 0.0f : (fK - f7) / f10, 0.0f, 1.0f);
            r rVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f11826a, 20);
            if ((i12 & 14) != 4 && ((i12 & 8) == 0 || !c0698o.i(c0604u1))) {
                z10 = false;
            }
            boolean zD = c0698o.d(fK2) | z10 | c0698o.f(jE) | c0698o.f(jE2) | c0698o.f(jE3) | c0698o.f(jE4);
            Object objH = c0698o.H();
            if (zD || objH == C0690k.f10683a) {
                p241y9.c cVar = new p241y9.c() { // from class: t5.c
                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        float[] fArr;
                        c cVar2 = this;
                        p196u0.d dVar = (p196u0.d) obj;
                        j.e(dVar, "$this$Canvas");
                        int i13 = c0604u1.f9401r;
                        int i14 = 0;
                        if (i13 == 0) {
                            fArr = new float[0];
                        } else {
                            int i15 = i13 + 2;
                            float[] fArr2 = new float[i15];
                            for (int i16 = 0; i16 < i15; i16++) {
                                fArr2[i16] = i16 / (i13 + 1);
                            }
                            fArr = fArr2;
                        }
                        boolean z11 = dVar.getLayoutDirection() == m.f16262s;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.I() & 4294967295L)))) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.I() & 4294967295L)))) & 4294967295L);
                        if (z11) {
                            jFloatToRawIntBits = jFloatToRawIntBits2;
                        }
                        if (z11) {
                            jFloatToRawIntBits2 = jFloatToRawIntBits;
                        }
                        float fW = dVar.w((float) 2.0d);
                        float fW2 = dVar.w(20);
                        dVar.W(jE, jFloatToRawIntBits, jFloatToRawIntBits2, (240 & 8) != 0 ? 0.0f : fW2, (240 & 16) != 0 ? 0 : 1, 3);
                        long j = jFloatToRawIntBits;
                        long j10 = jFloatToRawIntBits2;
                        int i17 = (int) (j >> 32);
                        float fIntBitsToFloat = Float.intBitsToFloat(i17);
                        int i18 = (int) (j10 >> 32);
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i18) - Float.intBitsToFloat(i17);
                        float f11 = fK2;
                        dVar.W(jE2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.I() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat(i18) - Float.intBitsToFloat(i17)) * 0.0f) + Float.intBitsToFloat(i17))) << 32), (((long) Float.floatToRawIntBits((fIntBitsToFloat2 * f11) + fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.I() & 4294967295L)))) & 4294967295L), (240 & 8) != 0 ? 0.0f : fW2, (240 & 16) != 0 ? 0 : 1, 3);
                        int length = fArr.length;
                        while (i14 < length) {
                            float f12 = fArr[i14];
                            long j11 = (f12 > f11 || f12 < 0.0f) ? jE3 : jE4;
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (((((long) Float.floatToRawIntBits(a.L(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j10 >> 32)), f12))) << 32) | (((long) Float.floatToRawIntBits(a.L(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f12))) & 4294967295L)) >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.I() & 4294967295L)))) & 4294967295L);
                            dVar = dVar;
                            p123m2.c.e(dVar, j11, fW / 2.0f, jFloatToRawIntBits3, 0, 120);
                            i14++;
                            cVar2 = this;
                        }
                        return y.f19095a;
                    }
                };
                c0698o.e0(cVar);
                objH = cVar;
            }
            f.a(rVarD, (p241y9.c) objH, c0698o, 0);
            rVar2 = o.f19333a;
        } else {
            c0698o.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new l(i10, 7, c0604u1, rVar2);
        }
    }

    public static final void c(int i10, p241y9.c cVar, p241y9.a aVar, p241y9.a aVar2, C0698o c0698o, int i11) throws XmlPullParserException, IOException {
        int i12;
        boolean z10;
        C0698o c0698o2 = c0698o;
        j.e(cVar, "numberFormatter");
        j.e(aVar, "onJumpBackPressed");
        j.e(aVar2, "onShowPageJumpDetails");
        c0698o2.V(784532973);
        if ((i11 & 6) == 0) {
            i12 = (c0698o2.e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0698o2.i(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0698o2.i(aVar) ? 256 : 128;
        }
        if (c0698o2.K(i12 & 1, (i12 & 1171) != 1170)) {
            C0061d c0061d = AbstractC0066i.f981e;
            l0.h hVar = l0.c.f19310E;
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objH = c0698o2.H();
            S s10 = C0690k.f10683a;
            if (z11 || objH == s10) {
                objH = new A5.c(14, aVar);
                c0698o2.e0(objH);
            }
            r rVarC = androidx.compose.foundation.a.c(o.f19333a, false, null, (p241y9.a) objH, 7);
            boolean z12 = i13 == 256;
            Object objH2 = c0698o2.H();
            if (z12 || objH2 == s10) {
                objH2 = new A5.c(15, aVar);
                c0698o2.e0(objH2);
            }
            r rVarN = androidx.compose.foundation.layout.c.n(l0.a.a(rVarC, new androidx.compose.foundation.d(aVar2, (p241y9.a) objH2)), 56);
            C0076t c0076tA = D.r.a(c0061d, hVar, c0698o2, 54);
            int i14 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC2 = l0.a.c(c0698o2, rVarN);
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
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o2, i14, c0285h);
            }
            C0672b.v(c0698o2, rVarC2, C0287j.f4117d);
            if (i10 > -1) {
                c0698o2.T(-1676215936);
                b bVarM = n.M(2131230911, c0698o2);
                M0 m10 = p005a4.e.f11187a;
                C0.a(bVarM, null, null, ((p005a4.a) c0698o2.k(m10)).l(), c0698o2, 48, 4);
                z10 = false;
                AbstractC0542b2.b((String) cVar.e(Integer.valueOf(i10)), null, ((p005a4.a) c0698o2.k(m10)).l(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).f8566l, c0698o, 0, 0, 65530);
                c0698o2 = c0698o;
            } else {
                z10 = false;
                c0698o2.T(-1677495957);
            }
            c0698o2.p(z10);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p015b4.h(i10, cVar, aVar, aVar2, i11);
        }
    }

    public static final void d(final List list, final p241y9.c cVar, final boolean z10, final p241y9.c cVar2, final p241y9.a aVar, C0698o c0698o, final int i10) {
        int i11;
        j.e(cVar, "numberFormatter");
        j.e(cVar2, "onPageSelected");
        j.e(aVar, "onDismiss");
        c0698o.V(-1534994649);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.h(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.i(cVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(aVar) ? 16384 : 8192;
        }
        int i12 = i11;
        if (c0698o.K(i12 & 1, (i12 & 9363) != 9362)) {
            f.b(z10, aVar, null, (((long) Float.floatToRawIntBits(8)) << 32) | (((long) Float.floatToRawIntBits(0)) & 4294967295L), null, null, ((Z0) c0698o.k(AbstractC0537a1.f8962a)).f8937d, ((q) ((p005a4.a) c0698o.k(p005a4.e.f11187a)).f11179t.getValue()).f21845a, 0.0f, 0.0f, p074h0.j.d(-978459410, new A4.c(list, aVar, cVar2, cVar, 4), c0698o), c0698o, ((i12 >> 6) & 14) | 3072 | ((i12 >> 9) & 112));
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p241y9.e() { // from class: t5.b
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a.d(list, cVar, z10, cVar2, aVar, (C0698o) obj, C0672b.y(i10 | 1));
                    return y.f19095a;
                }
            };
        }
    }

    public static final void e(p124m3.j jVar, p241y9.c cVar, C0698o c0698o, int i10) {
        C0698o c0698o2;
        j.e(cVar, "numberFormatter");
        c0698o.V(1708329947);
        int i11 = (c0698o.i(jVar) ? 4 : 2) | i10 | (c0698o.i(cVar) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            c0698o2 = c0698o;
            V0.e(androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.n(o.f19333a, 264), 72), 0.0f, 0.0f, 0.0f, 8, 7), null, V0.m(((q) ((p005a4.a) c0698o.k(p005a4.e.f11187a)).f11163b.getValue()).f21845a, c0698o), null, null, p074h0.j.d(-794012083, new A4.d(7, jVar, cVar), c0698o), c0698o2, 196614, 26);
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I4.a(i10, 14, jVar, cVar);
        }
    }

    public static final void f(int i10, p241y9.c cVar, p241y9.c cVar2, C0698o c0698o, int i11) {
        int i12;
        j.e(cVar, "onSlidePositionChanged");
        j.e(cVar2, "onSlidePositionStopped");
        c0698o.V(249235970);
        if ((i11 & 6) == 0) {
            i12 = (c0698o.e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0698o.i(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0698o.i(cVar2) ? 256 : 128;
        }
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new B.j();
                c0698o.e0(objH);
            }
            B.j jVar = (B.j) objH;
            C0578l1 c0578l1 = C0578l1.f9234a;
            M0 m10 = p005a4.e.f11187a;
            long jL = ((p005a4.a) c0698o.k(m10)).l();
            long jE = ((p005a4.a) c0698o.k(m10)).e();
            long jE2 = ((p005a4.a) c0698o.k(m10)).e();
            long jE3 = ((p005a4.a) c0698o.k(m10)).e();
            long jE4 = ((p005a4.a) c0698o.k(m10)).e();
            long jE5 = ((p005a4.a) c0698o.k(m10)).e();
            long jE6 = ((p005a4.a) c0698o.k(m10)).e();
            long j = q.g;
            C0569i1 c0569i1B = C0578l1.b((C0560g0) c0698o.k(AbstractC0568i0.f9172a));
            if (jL == 16) {
                jL = c0569i1B.f9174a;
            }
            long j10 = jL;
            if (jE == 16) {
                jE = c0569i1B.f9175b;
            }
            C0569i1 c0569i1 = new C0569i1(j10, jE, jE2 != 16 ? jE2 : c0569i1B.f9176c, jE3 != 16 ? jE3 : c0569i1B.f9177d, jE6 != 16 ? jE6 : c0569i1B.f9178e, j != 16 ? j : c0569i1B.f9179f, jE5 != 16 ? jE5 : c0569i1B.g, j != 16 ? j : c0569i1B.f9180h, jE4 != 16 ? jE4 : c0569i1B.f9181i, j != 16 ? j : c0569i1B.j);
            boolean z10 = (i12 & 14) == 4;
            Object objH2 = c0698o.H();
            if (z10 || objH2 == s10) {
                C0673b0 c0673b0 = new C0673b0(i10);
                c0698o.e0(c0673b0);
                objH2 = c0673b0;
            }
            C0672b.a(AbstractC0359n0.f5123n.a(m.f16262s), p074h0.j.d(-554812094, new D4.c((C0673b0) objH2, cVar, cVar2, c0569i1, jVar, 6), c0698o), c0698o, 56);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.n(i10, cVar, cVar2, i11, 1);
        }
    }
}
