package D4;

import A.C0039q;
import D.AbstractC0060c;
import D.AbstractC0066i;
import D.C0076t;
import D.P;
import D.U;
import D.W;
import F.A;
import F.D;
import G.a0;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.InterfaceC0402u;
import O.V;
import W.AbstractC0542b2;
import W.AbstractC0614y;
import W.C0;
import W.F2;
import W.G2;
import W.H2;
import W.J1;
import W.Q;
import W.V0;
import Z.C0672b;
import Z.C0675c0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import Z.X;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import i7.B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l0.r;
import p110k9.y;
import p151p.C1256n;
import p180s0.F;
import p180s0.L;
import p180s0.q;
import p224x0.C1441e;
import p224x0.C1442f;
import p224x0.G;
import u.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p074h0.d f1205a = new p074h0.d(178104324, new j(0, 0), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p074h0.d f1206b = new p074h0.d(-592324341, new j(1, 0), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p074h0.d f1207c = new p074h0.d(2129363562, new j(2, 0), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p074h0.d f1208d = new p074h0.d(-367176083, new A5.d(2), false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p074h0.d f1209e = new p074h0.d(-1781909930, new A5.d(3), false);

    public static final void a(B4.a aVar, p241y9.c cVar, final p241y9.f fVar, final p241y9.c cVar2, r rVar, C0698o c0698o, int i10) {
        r rVar2;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(cVar, "numberFormatter");
        p251z9.j.e(fVar, "onRepeatChanged");
        p251z9.j.e(cVar2, "onAyahRangeSelection");
        c0698o2.V(-1088182538);
        int i11 = i10 | (c0698o2.i(aVar) ? 4 : 2) | (c0698o2.i(fVar) ? 256 : 128) | 24576;
        final int i12 = 0;
        if (c0698o2.K(i11 & 1, (i11 & 9363) != 9362)) {
            FillElement fillElement = androidx.compose.foundation.layout.c.f11828c;
            M0 m10 = p005a4.e.f11187a;
            r rVarE = p181s2.r.e(androidx.compose.foundation.a.a(fillElement, ((p005a4.a) c0698o2.k(m10)).d(), F.f21774a), p181s2.r.d(c0698o2));
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
            int i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarE);
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
            AbstractC0614y.b(f1205a, null, null, null, 0.0f, null, F2.a(((p005a4.a) c0698o2.k(m10)).g(), c0698o2), c0698o, 6, 190);
            c0698o2 = c0698o;
            float f7 = 8;
            l0.o oVar = l0.o.f19333a;
            f(R.string.range, 48, c0698o2, androidx.compose.foundation.layout.b.l(oVar, 0.0f, f7, 0.0f, 0.0f, 13));
            p124m3.j jVar = aVar.f614a;
            Object objH = c0698o2.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new p241y9.a() { // from class: D4.a
                    @Override // p241y9.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                cVar2.e(B4.b.f619s);
                                break;
                            default:
                                cVar2.e(B4.b.f620t);
                                break;
                        }
                        return y.f19095a;
                    }
                };
                c0698o2.e0(objH);
            }
            c(R.string.from, jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH, 7), c0698o2, 0);
            p124m3.j jVar2 = aVar.f615b;
            Object objH2 = c0698o2.H();
            if (objH2 == s10) {
                final int i14 = 1;
                objH2 = new p241y9.a() { // from class: D4.a
                    @Override // p241y9.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                cVar2.e(B4.b.f619s);
                                break;
                            default:
                                cVar2.e(B4.b.f620t);
                                break;
                        }
                        return y.f19095a;
                    }
                };
                c0698o2.e0(objH2);
            }
            c(R.string.to, jVar2, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), c0698o2, 0);
            f(R.string.repeat, 48, c0698o2, androidx.compose.foundation.layout.b.l(oVar, 0.0f, f7, 0.0f, 0.0f, 13));
            int i15 = aVar.f616c;
            int i16 = i11 & 896;
            boolean z10 = i16 == 256;
            Object objH3 = c0698o2.H();
            if (z10 || objH3 == s10) {
                objH3 = new p241y9.e() { // from class: D4.b
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = i12;
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        Integer num = (Integer) obj2;
                        num.intValue();
                        switch (i17) {
                            case 0:
                                fVar.d(B4.c.f622r, bool, num);
                                break;
                            default:
                                fVar.d(B4.c.f623s, bool, num);
                                break;
                        }
                        return y.f19095a;
                    }
                };
                c0698o2.e0(objH3);
            }
            e(R.string.range_repeat, i15, cVar, (p241y9.e) objH3, c0698o2, 384);
            int i17 = aVar.f617d;
            boolean z11 = i16 == 256;
            Object objH4 = c0698o2.H();
            if (z11 || objH4 == s10) {
                final int i18 = 1;
                objH4 = new p241y9.e() { // from class: D4.b
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i19 = i18;
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        Integer num = (Integer) obj2;
                        num.intValue();
                        switch (i19) {
                            case 0:
                                fVar.d(B4.c.f622r, bool, num);
                                break;
                            default:
                                fVar.d(B4.c.f623s, bool, num);
                                break;
                        }
                        return y.f19095a;
                    }
                };
                c0698o2.e0(objH4);
            }
            e(R.string.verse_repeat, i17, cVar, (p241y9.e) objH4, c0698o2, 384);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o2, new LayoutWeightElement(1.0f, true));
            c0698o2.p(true);
            rVar2 = oVar;
        } else {
            c0698o2.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new c(aVar, cVar, fVar, cVar2, rVar2, i10);
        }
    }

    public static final void b(C4.e eVar, final int i10, final p241y9.c cVar, p241y9.a aVar, r rVar, C0698o c0698o, int i11) {
        r rVar2;
        Object c0039q;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(cVar, "onAyahSelected");
        p251z9.j.e(aVar, "onDismissed");
        c0698o2.V(1831336957);
        int i12 = i11 | (c0698o2.i(eVar) ? 4 : 2) | (c0698o2.e(i10) ? 32 : 16) | (c0698o2.i(cVar) ? 256 : 128) | 24576;
        boolean z10 = true;
        if (c0698o2.K(i12 & 1, (i12 & 9363) != 9362)) {
            final X xK = C0672b.k(eVar, p120l9.r.f19440r, null, c0698o2, (i12 & 14) | 48, 2);
            M0 m10 = p005a4.e.f11187a;
            long jD = ((p005a4.a) c0698o2.k(m10)).d();
            B b5 = F.f21774a;
            l0.o oVar = l0.o.f19333a;
            r rVarA = androidx.compose.foundation.a.a(oVar, jD, b5);
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
            p074h0.d dVarD = p074h0.j.d(310596237, new A5.f(aVar, 1, (byte) 0), c0698o2);
            float f3 = F2.f8543a;
            boolean z11 = false;
            AbstractC0614y.b(f1206b, null, dVarD, null, 0.0f, null, F2.a(((p005a4.a) c0698o2.k(m10)).g(), c0698o2), c0698o, 390, 186);
            A a9 = D.a(c0698o);
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.m(c0698o);
                c0698o.e0(objH);
            }
            InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH;
            int i14 = i12 & 112;
            boolean zG = c0698o.g(xK) | (i14 == 32) | ((i12 & 896) == 256);
            Object objH2 = c0698o.H();
            if (zG || objH2 == s10) {
                objH2 = new p241y9.c() { // from class: D4.d
                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        F.h hVar = (F.h) obj;
                        p251z9.j.e(hVar, "$this$LazyColumn");
                        List<p124m3.j> list = (List) xK.getValue();
                        p124m3.j jVar = (p124m3.j) p120l9.m.g0(list);
                        if (jVar != null) {
                            p074h0.d dVar = new p074h0.d(1294656907, new f(0, jVar), true);
                            a0 a0Var = hVar.f2052a;
                            s sVar = hVar.f2053b;
                            if (sVar == null) {
                                sVar = new s();
                                hVar.f2053b = sVar;
                            }
                            sVar.a(a0Var.f2654b);
                            hVar.a(null, null, new p074h0.d(1491981087, new F.g(dVar, a0Var.f2654b), true));
                        }
                        for (p124m3.j jVar2 : list) {
                            hVar.a(Integer.valueOf(jVar2.f19585a), "ayahRow", new p074h0.d(-2143802536, new g(i10, jVar2, cVar), true));
                        }
                        return y.f19095a;
                    }
                };
                c0698o.e0(objH2);
            }
            B9.a.c(0, 509, null, null, null, a9, c0698o, null, null, null, (p241y9.c) objH2, false);
            c0698o2 = c0698o;
            if (((Collection) xK.getValue()).isEmpty()) {
                z11 = false;
                z10 = true;
                c0698o2.T(1742950363);
            } else {
                c0698o2.T(1746359619);
                boolean zG2 = c0698o2.g(xK) | (i14 == 32) | c0698o2.i(interfaceC0402u) | c0698o2.g(a9);
                Object objH3 = c0698o2.H();
                if (zG2 || objH3 == s10) {
                    c0039q = new C0039q(xK, interfaceC0402u, i10, a9, null, 8);
                    c0698o2.e0(c0039q);
                } else {
                    c0039q = objH3;
                }
                C0672b.f(c0698o2, y.f19095a, (p241y9.e) c0039q);
            }
            c0698o2.p(z11);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o2, new LayoutWeightElement(1.0f, z10));
            c0698o2.p(z10);
            rVar2 = oVar;
        } else {
            c0698o2.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e(eVar, i10, cVar, aVar, rVar2, i11);
        }
    }

    public static final void c(int i10, p124m3.j jVar, r rVar, C0698o c0698o, int i11) {
        int i12 = i10;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(jVar, "verse");
        c0698o2.V(1385314115);
        int i13 = i11 | (c0698o2.e(i12) ? 4 : 2) | (c0698o2.i(jVar) ? 32 : 16) | (c0698o2.g(rVar) ? 256 : 128);
        if (c0698o2.K(i13 & 1, (i13 & 147) != 146)) {
            l0.i iVar = l0.c.f19307B;
            M0 m10 = p005a4.e.f11187a;
            float f3 = 8;
            r rVarK = androidx.compose.foundation.layout.b.k(androidx.compose.foundation.a.a(rVar, ((p005a4.a) c0698o2.k(m10)).g(), F.f21774a).b(androidx.compose.foundation.layout.c.f11826a), 16, f3, 24, f3);
            W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
            int i14 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarK);
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
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o2, i14, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC, c0285h4);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
            int i15 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
            r rVarC2 = l0.a.c(c0698o2, layoutWeightElement);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, c0076tA, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o2, i15, c0285h3);
            }
            C0672b.v(c0698o2, rVarC2, c0285h4);
            String strM0 = p000a.a.m0(i12, c0698o2);
            M0 m11 = H2.f8580a;
            AbstractC0542b2.b(strM0, null, ((p005a4.a) c0698o2.k(m10)).m(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(m11)).j, c0698o, 0, 0, 65530);
            AbstractC0542b2.b(jVar.d((Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b)), null, ((p005a4.a) c0698o.k(m10)).h(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(m11)).f8565k, c0698o, 0, 0, 65530);
            c0698o2 = c0698o;
            c0698o2.p(true);
            C1442f c1442fB = B0.c.f586a;
            if (c1442fB == null) {
                C1441e c1441e = new C1441e("AutoMirrored.Rounded.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i16 = G.f24154a;
                L l10 = new L(q.f21839b);
                C1256n c1256n = new C1256n(13);
                c1256n.j(9.29f, 15.88f);
                c1256n.e(13.17f, 12.0f);
                c1256n.e(9.29f, 8.12f);
                c1256n.c(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
                c1256n.c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
                c1256n.f(4.59f, 4.59f);
                c1256n.c(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
                c1256n.e(10.7f, 17.3f);
                c1256n.c(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
                c1256n.c(-0.38f, -0.39f, -0.39f, -1.03f, 0.0f, -1.42f);
                c1256n.a();
                C1441e.a(c1441e, (ArrayList) c1256n.f20747s, l10);
                c1442fB = c1441e.b();
                B0.c.f586a = c1442fB;
            }
            C1442f c1442f = c1442fB;
            i12 = i10;
            C0.b(c1442f, p000a.a.m0(i12, c0698o2), null, ((p005a4.a) c0698o2.k(m10)).c(), c0698o2, 0, 4);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new l(i12, jVar, rVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x027a  */
    /* JADX WARN: Code duplicated, block: B:74:0x027c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0293  */
    /* JADX WARN: Code duplicated, block: B:82:0x029f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(int i10, p241y9.c cVar, final p241y9.c cVar2, C0698o c0698o, int i11) {
        int i12;
        S s10;
        final List list;
        final int i13;
        final List list2;
        int i14;
        int i15;
        Object objH;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(cVar, "numberFormatter");
        p251z9.j.e(cVar2, "onRepeatValueChanged");
        c0698o2.V(-1504914941);
        if ((i11 & 6) == 0) {
            i12 = (c0698o2.e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0698o2.i(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0698o2.i(cVar2) ? 256 : 128;
        }
        if (c0698o2.K(i12 & 1, (i12 & 147) != 146)) {
            List listS = p120l9.l.S(new Integer[]{2, 3, 4, 5, 10, 99});
            Object objH2 = c0698o2.H();
            S s11 = C0690k.f10683a;
            if (objH2 == s11) {
                objH2 = new C0675c0(i10);
                c0698o2.e0(objH2);
            }
            final C0675c0 c0675c0 = (C0675c0) objH2;
            boolean zE = c0698o2.e(c0675c0.g());
            Object objH3 = c0698o2.H();
            if (zE || objH3 == s11) {
                objH3 = c0675c0.g() >= 99 ? C0672b.r("∞") : C0672b.r(cVar.e(Integer.valueOf(c0675c0.g())));
                c0698o2.e0(objH3);
            }
            X x9 = (X) objH3;
            l0.i iVar = l0.c.f19307B;
            M0 m10 = p005a4.e.f11187a;
            float f3 = 8;
            r rVarK = androidx.compose.foundation.layout.b.k(androidx.compose.foundation.a.a(l0.o.f19333a, ((p005a4.a) c0698o2.k(m10)).g(), F.f21774a).b(androidx.compose.foundation.layout.c.f11826a), 16, f3, 24, f3);
            W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
            int i16 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarK);
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
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i16))) {
                p123m2.c.y(i16, c0698o2, i16, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            int i17 = i12;
            AbstractC0542b2.b(p000a.a.m0(R.string.repetitions, c0698o2), null, ((p005a4.a) c0698o2.k(m10)).m(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).j, c0698o, 0, 0, 65530);
            c0698o2 = c0698o;
            C0672b.a(V.f6342a.a(new O.U(((p005a4.a) c0698o2.k(m10)).l(), q.b(((p005a4.a) c0698o2.k(m10)).l(), 0.5f))), p074h0.j.d(277443935, new A4.a(x9, cVar2, c0675c0, 1), c0698o2), c0698o2, 56);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o2, new LayoutWeightElement(1.0f, true));
            boolean z10 = c0675c0.g() > 2;
            P p10 = W.S.f8804a;
            Q qC = W.S.c(((p005a4.a) c0698o2.k(m10)).b(), 0L, c0698o2, 14);
            int i18 = i17 & 896;
            boolean z11 = i18 == 256;
            Object objH4 = c0698o2.H();
            if (z11) {
                s10 = s11;
            } else {
                s10 = s11;
                if (objH4 != s10) {
                    list = listS;
                    i13 = 0;
                }
                S s12 = s10;
                list2 = list;
                i14 = i13;
                V0.i((p241y9.a) objH4, null, z10, null, qC, null, null, f1208d, c0698o2, 805306368, 490);
                if (c0675c0.g() < 99) {
                    i15 = 1;
                } else {
                    i15 = i14;
                }
                Q qC2 = W.S.c(((p005a4.a) c0698o2.k(m10)).b(), 0L, c0698o2, 14);
                if (i18 == 256) {
                    i14 = 1;
                }
                objH = c0698o2.H();
                if (i14 == 0 || objH == s12) {
                    final int i19 = 1;
                    objH = new p241y9.a() { // from class: D4.m
                        /* JADX WARN: Code duplicated, block: B:13:0x002a  */
                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.Object, still in use, count: 2, list:
                              (r1v10 java.lang.Object) from 0x0026: PHI (r1 I:??) = (r1v7 java.lang.Object), (r1v10 java.lang.Object) binds: [B:10:0x0025, B:26:0x0026] A[DONT_GENERATE, DONT_INLINE]
                              (r1v10 java.lang.Object) from 0x0018: CHECK_CAST (java.lang.Number) (r1v10 java.lang.Object)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                            */
                        @Override // p241y9.a
                        public final java.lang.Object invoke() {
                            /*
                                r5 = this;
                                int r0 = r4
                                switch(r0) {
                                    case 0: goto L39;
                                    default: goto L5;
                                }
                            L5:
                                java.util.List r0 = r1
                                java.util.Iterator r0 = r0.iterator()
                            Lb:
                                boolean r1 = r0.hasNext()
                                Z.c0 r2 = r2
                                if (r1 == 0) goto L25
                                java.lang.Object r1 = r0.next()
                                r3 = r1
                                java.lang.Number r3 = (java.lang.Number) r3
                                int r3 = r3.intValue()
                                int r4 = r2.g()
                                if (r3 <= r4) goto Lb
                                goto L26
                            L25:
                                r1 = 0
                            L26:
                                java.lang.Integer r1 = (java.lang.Integer) r1
                                if (r1 == 0) goto L36
                                int r0 = r1.intValue()
                                r2.h(r0)
                                y9.c r0 = r3
                                r0.e(r1)
                            L36:
                                k9.y r0 = p110k9.y.f19095a
                                return r0
                            L39:
                                java.util.List r0 = r1
                                int r1 = r0.size()
                                java.util.ListIterator r0 = r0.listIterator(r1)
                            L43:
                                boolean r1 = r0.hasPrevious()
                                if (r1 == 0) goto L6e
                                java.lang.Object r1 = r0.previous()
                                java.lang.Number r1 = (java.lang.Number) r1
                                int r2 = r1.intValue()
                                Z.c0 r3 = r2
                                int r4 = r3.g()
                                if (r2 >= r4) goto L43
                                int r0 = r1.intValue()
                                r3.h(r0)
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                y9.c r1 = r3
                                r1.e(r0)
                                k9.y r0 = p110k9.y.f19095a
                                return r0
                            L6e:
                                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                                java.lang.String r1 = "List contains no element matching the predicate."
                                r0.<init>(r1)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: D4.m.invoke():java.lang.Object");
                        }
                    };
                    c0698o2.e0(objH);
                }
                V0.i((p241y9.a) objH, null, i15, null, qC2, null, null, f1209e, c0698o2, 805306368, 490);
                c0698o2.p(true);
            }
            list = listS;
            i13 = 0;
            objH4 = new p241y9.a() { // from class: D4.m
                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.Object, still in use, count: 2, list:
                      (r1v10 java.lang.Object) from 0x0026: PHI (r1 I:??) = (r1v7 java.lang.Object), (r1v10 java.lang.Object) binds: [B:10:0x0025, B:26:0x0026] A[DONT_GENERATE, DONT_INLINE]
                      (r1v10 java.lang.Object) from 0x0018: CHECK_CAST (java.lang.Number) (r1v10 java.lang.Object)
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                    */
                @Override // p241y9.a
                public final java.lang.Object invoke() {
                    /*
                        r5 = this;
                        int r0 = r4
                        switch(r0) {
                            case 0: goto L39;
                            default: goto L5;
                        }
                    L5:
                        java.util.List r0 = r1
                        java.util.Iterator r0 = r0.iterator()
                    Lb:
                        boolean r1 = r0.hasNext()
                        Z.c0 r2 = r2
                        if (r1 == 0) goto L25
                        java.lang.Object r1 = r0.next()
                        r3 = r1
                        java.lang.Number r3 = (java.lang.Number) r3
                        int r3 = r3.intValue()
                        int r4 = r2.g()
                        if (r3 <= r4) goto Lb
                        goto L26
                    L25:
                        r1 = 0
                    L26:
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        if (r1 == 0) goto L36
                        int r0 = r1.intValue()
                        r2.h(r0)
                        y9.c r0 = r3
                        r0.e(r1)
                    L36:
                        k9.y r0 = p110k9.y.f19095a
                        return r0
                    L39:
                        java.util.List r0 = r1
                        int r1 = r0.size()
                        java.util.ListIterator r0 = r0.listIterator(r1)
                    L43:
                        boolean r1 = r0.hasPrevious()
                        if (r1 == 0) goto L6e
                        java.lang.Object r1 = r0.previous()
                        java.lang.Number r1 = (java.lang.Number) r1
                        int r2 = r1.intValue()
                        Z.c0 r3 = r2
                        int r4 = r3.g()
                        if (r2 >= r4) goto L43
                        int r0 = r1.intValue()
                        r3.h(r0)
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        y9.c r1 = r3
                        r1.e(r0)
                        k9.y r0 = p110k9.y.f19095a
                        return r0
                    L6e:
                        java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                        java.lang.String r1 = "List contains no element matching the predicate."
                        r0.<init>(r1)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: D4.m.invoke():java.lang.Object");
                }
            };
            c0698o2.e0(objH4);
            S s13 = s10;
            list2 = list;
            i14 = i13;
            V0.i((p241y9.a) objH4, null, z10, null, qC, null, null, f1208d, c0698o2, 805306368, 490);
            if (c0675c0.g() < 99) {
                i15 = 1;
            } else {
                i15 = i14;
            }
            Q qC3 = W.S.c(((p005a4.a) c0698o2.k(m10)).b(), 0L, c0698o2, 14);
            if (i18 == 256) {
                i14 = 1;
            }
            objH = c0698o2.H();
            if (i14 == 0) {
                final int i110 = 1;
                objH = new p241y9.a() { // from class: D4.m
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.Object, still in use, count: 2, list:
                          (r1v10 java.lang.Object) from 0x0026: PHI (r1 I:??) = (r1v7 java.lang.Object), (r1v10 java.lang.Object) binds: [B:10:0x0025, B:26:0x0026] A[DONT_GENERATE, DONT_INLINE]
                          (r1v10 java.lang.Object) from 0x0018: CHECK_CAST (java.lang.Number) (r1v10 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        */
                    @Override // p241y9.a
                    public final java.lang.Object invoke() {
                        /*
                            r5 = this;
                            int r0 = r4
                            switch(r0) {
                                case 0: goto L39;
                                default: goto L5;
                            }
                        L5:
                            java.util.List r0 = r1
                            java.util.Iterator r0 = r0.iterator()
                        Lb:
                            boolean r1 = r0.hasNext()
                            Z.c0 r2 = r2
                            if (r1 == 0) goto L25
                            java.lang.Object r1 = r0.next()
                            r3 = r1
                            java.lang.Number r3 = (java.lang.Number) r3
                            int r3 = r3.intValue()
                            int r4 = r2.g()
                            if (r3 <= r4) goto Lb
                            goto L26
                        L25:
                            r1 = 0
                        L26:
                            java.lang.Integer r1 = (java.lang.Integer) r1
                            if (r1 == 0) goto L36
                            int r0 = r1.intValue()
                            r2.h(r0)
                            y9.c r0 = r3
                            r0.e(r1)
                        L36:
                            k9.y r0 = p110k9.y.f19095a
                            return r0
                        L39:
                            java.util.List r0 = r1
                            int r1 = r0.size()
                            java.util.ListIterator r0 = r0.listIterator(r1)
                        L43:
                            boolean r1 = r0.hasPrevious()
                            if (r1 == 0) goto L6e
                            java.lang.Object r1 = r0.previous()
                            java.lang.Number r1 = (java.lang.Number) r1
                            int r2 = r1.intValue()
                            Z.c0 r3 = r2
                            int r4 = r3.g()
                            if (r2 >= r4) goto L43
                            int r0 = r1.intValue()
                            r3.h(r0)
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                            y9.c r1 = r3
                            r1.e(r0)
                            k9.y r0 = p110k9.y.f19095a
                            return r0
                        L6e:
                            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                            java.lang.String r1 = "List contains no element matching the predicate."
                            r0.<init>(r1)
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: D4.m.invoke():java.lang.Object");
                    }
                };
                c0698o2.e0(objH);
            } else {
                final int i111 = 1;
                objH = new p241y9.a() { // from class: D4.m
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.Object, still in use, count: 2, list:
                          (r1v10 java.lang.Object) from 0x0026: PHI (r1 I:??) = (r1v7 java.lang.Object), (r1v10 java.lang.Object) binds: [B:10:0x0025, B:26:0x0026] A[DONT_GENERATE, DONT_INLINE]
                          (r1v10 java.lang.Object) from 0x0018: CHECK_CAST (java.lang.Number) (r1v10 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        */
                    @Override // p241y9.a
                    public final java.lang.Object invoke() {
                        /*
                            r5 = this;
                            int r0 = r4
                            switch(r0) {
                                case 0: goto L39;
                                default: goto L5;
                            }
                        L5:
                            java.util.List r0 = r1
                            java.util.Iterator r0 = r0.iterator()
                        Lb:
                            boolean r1 = r0.hasNext()
                            Z.c0 r2 = r2
                            if (r1 == 0) goto L25
                            java.lang.Object r1 = r0.next()
                            r3 = r1
                            java.lang.Number r3 = (java.lang.Number) r3
                            int r3 = r3.intValue()
                            int r4 = r2.g()
                            if (r3 <= r4) goto Lb
                            goto L26
                        L25:
                            r1 = 0
                        L26:
                            java.lang.Integer r1 = (java.lang.Integer) r1
                            if (r1 == 0) goto L36
                            int r0 = r1.intValue()
                            r2.h(r0)
                            y9.c r0 = r3
                            r0.e(r1)
                        L36:
                            k9.y r0 = p110k9.y.f19095a
                            return r0
                        L39:
                            java.util.List r0 = r1
                            int r1 = r0.size()
                            java.util.ListIterator r0 = r0.listIterator(r1)
                        L43:
                            boolean r1 = r0.hasPrevious()
                            if (r1 == 0) goto L6e
                            java.lang.Object r1 = r0.previous()
                            java.lang.Number r1 = (java.lang.Number) r1
                            int r2 = r1.intValue()
                            Z.c0 r3 = r2
                            int r4 = r3.g()
                            if (r2 >= r4) goto L43
                            int r0 = r1.intValue()
                            r3.h(r0)
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                            y9.c r1 = r3
                            r1.e(r0)
                            k9.y r0 = p110k9.y.f19095a
                            return r0
                        L6e:
                            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                            java.lang.String r1 = "List contains no element matching the predicate."
                            r0.<init>(r1)
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: D4.m.invoke():java.lang.Object");
                    }
                };
                c0698o2.e0(objH);
            }
            V0.i((p241y9.a) objH, null, i15, null, qC3, null, null, f1209e, c0698o2, 805306368, 490);
            c0698o2.p(true);
        } else {
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new n(i10, cVar, cVar2, i11, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0216  */
    /* JADX WARN: Code duplicated, block: B:73:0x0218  */
    /* JADX WARN: Code duplicated, block: B:79:0x0227  */
    /* JADX WARN: Code duplicated, block: B:82:0x024c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0258  */
    /* JADX WARN: Code duplicated, block: B:85:0x025a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0263  */
    /* JADX WARN: Code duplicated, block: B:92:0x027d  */
    public static final void e(int i10, int i11, p241y9.c cVar, p241y9.e eVar, C0698o c0698o, int i12) {
        int i13;
        p241y9.e eVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        Object objH;
        boolean z11;
        boolean z12;
        Object objH2;
        p241y9.c cVar2 = cVar;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(cVar2, "numberFormatter");
        p251z9.j.e(eVar, "onRepeatValueChanged");
        c0698o2.V(1186802553);
        if ((i12 & 6) == 0) {
            i13 = (c0698o2.e(i10) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c0698o2.e(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= c0698o2.i(cVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c0698o2.i(eVar) ? 2048 : 1024;
        }
        if (c0698o2.K(i13 & 1, (i13 & 1171) != 1170)) {
            Object objH3 = c0698o2.H();
            S s10 = C0690k.f10683a;
            if (objH3 == s10) {
                objH3 = new C0675c0(i11);
                c0698o2.e0(objH3);
            }
            C0675c0 c0675c0 = (C0675c0) objH3;
            Object objH4 = c0698o2.H();
            if (objH4 == s10) {
                objH4 = C0672b.r(Boolean.valueOf(i11 != 1));
                c0698o2.e0(objH4);
            }
            X x9 = (X) objH4;
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
            int i18 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            l0.o oVar = l0.o.f19333a;
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
            if (c0698o2.f10720O) {
                i14 = i13;
            } else {
                i14 = i13;
                if (!p251z9.j.a(c0698o2.H(), Integer.valueOf(i18))) {
                }
                C0285h c0285h4 = C0287j.f4117d;
                C0672b.v(c0698o2, rVarC, c0285h4);
                l0.i iVar = l0.c.f19307B;
                M0 m10 = p005a4.e.f11187a;
                float f3 = 8;
                r rVarK = androidx.compose.foundation.layout.b.k(androidx.compose.foundation.a.a(oVar, ((p005a4.a) c0698o2.k(m10)).g(), F.f21774a).b(androidx.compose.foundation.layout.c.f11826a), 16, f3, 24, f3);
                W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                i15 = c0698o2.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
                r rVarC2 = l0.a.c(c0698o2, rVarK);
                c0698o2.X();
                if (c0698o2.f10720O) {
                    c0698o2.l(c0286i);
                } else {
                    c0698o2.h0();
                }
                C0672b.v(c0698o2, wA, c0285h);
                C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
                if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i15))) {
                    p123m2.c.y(i15, c0698o2, i15, c0285h3);
                }
                C0672b.v(c0698o2, rVarC2, c0285h4);
                i16 = i14;
                AbstractC0542b2.b(p000a.a.m0(i10, c0698o2), null, ((p005a4.a) c0698o2.k(m10)).m(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).j, c0698o, 0, 0, 65530);
                if (1.0f <= 0.0d) {
                    E.a.a("invalid weight; must be greater than zero");
                }
                AbstractC0060c.a(c0698o, new LayoutWeightElement(1.0f, true));
                boolean zBooleanValue = ((Boolean) x9.getValue()).booleanValue();
                J1 j1O = V0.o(((p005a4.a) c0698o.k(m10)).l(), q.b(((p005a4.a) c0698o.k(m10)).l(), 0.54f), ((p005a4.a) c0698o.k(m10)).b(), q.b(((p005a4.a) c0698o.k(m10)).b(), 0.54f), c0698o, 65484);
                c0698o2 = c0698o;
                i17 = i16 & 7168;
                if (i17 == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objH = c0698o2.H();
                if (!z10 || objH == s10) {
                    eVar2 = eVar;
                    objH = new Ca.h(c0675c0, x9, eVar2, 1);
                    c0698o2.e0(objH);
                } else {
                    eVar2 = eVar;
                }
                androidx.compose.material3.a.a(zBooleanValue, (p241y9.c) objH, null, false, j1O, c0698o2, 0);
                c0698o2.p(true);
                if (((Boolean) x9.getValue()).booleanValue()) {
                    c0698o2.T(1560584784);
                    int iG = c0675c0.g();
                    if (i17 == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objH2 = c0698o2.H();
                    if (z12 || objH2 == s10) {
                        objH2 = new Ca.h(c0675c0, eVar2, x9, 2);
                        c0698o2.e0(objH2);
                    }
                    cVar2 = cVar;
                    d(iG, cVar2, (p241y9.c) objH2, c0698o2, (i16 >> 3) & 112);
                    z11 = false;
                } else {
                    cVar2 = cVar;
                    z11 = false;
                    c0698o2.T(1558073567);
                }
                c0698o2.p(z11);
                c0698o2.p(true);
            }
            p123m2.c.y(i18, c0698o2, i18, c0285h3);
            C0285h c0285h5 = C0287j.f4117d;
            C0672b.v(c0698o2, rVarC, c0285h5);
            l0.i iVar2 = l0.c.f19307B;
            M0 m11 = p005a4.e.f11187a;
            float f7 = 8;
            r rVarK2 = androidx.compose.foundation.layout.b.k(androidx.compose.foundation.a.a(oVar, ((p005a4.a) c0698o2.k(m11)).g(), F.f21774a).b(androidx.compose.foundation.layout.c.f11826a), 16, f7, 24, f7);
            W wA2 = U.a(AbstractC0066i.f977a, iVar2, c0698o2, 48);
            i15 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o2.m();
            r rVarC3 = l0.a.c(c0698o2, rVarK2);
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, wA2, c0285h);
            C0672b.v(c0698o2, interfaceC0687i0M3, c0285h2);
            if (c0698o2.f10720O) {
                p123m2.c.y(i15, c0698o2, i15, c0285h3);
            } else {
                p123m2.c.y(i15, c0698o2, i15, c0285h3);
            }
            C0672b.v(c0698o2, rVarC3, c0285h5);
            i16 = i14;
            AbstractC0542b2.b(p000a.a.m0(i10, c0698o2), null, ((p005a4.a) c0698o2.k(m11)).m(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).j, c0698o, 0, 0, 65530);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            AbstractC0060c.a(c0698o, new LayoutWeightElement(1.0f, true));
            boolean zBooleanValue2 = ((Boolean) x9.getValue()).booleanValue();
            J1 j1O2 = V0.o(((p005a4.a) c0698o.k(m11)).l(), q.b(((p005a4.a) c0698o.k(m11)).l(), 0.54f), ((p005a4.a) c0698o.k(m11)).b(), q.b(((p005a4.a) c0698o.k(m11)).b(), 0.54f), c0698o, 65484);
            c0698o2 = c0698o;
            i17 = i16 & 7168;
            if (i17 == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            objH = c0698o2.H();
            if (z10) {
                eVar2 = eVar;
                objH = new Ca.h(c0675c0, x9, eVar2, 1);
                c0698o2.e0(objH);
            } else {
                eVar2 = eVar;
                objH = new Ca.h(c0675c0, x9, eVar2, 1);
                c0698o2.e0(objH);
            }
            androidx.compose.material3.a.a(zBooleanValue2, (p241y9.c) objH, null, false, j1O2, c0698o2, 0);
            c0698o2.p(true);
            if (((Boolean) x9.getValue()).booleanValue()) {
                c0698o2.T(1560584784);
                int iG2 = c0675c0.g();
                if (i17 == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objH2 = c0698o2.H();
                if (z12) {
                    objH2 = new Ca.h(c0675c0, eVar2, x9, 2);
                    c0698o2.e0(objH2);
                } else {
                    objH2 = new Ca.h(c0675c0, eVar2, x9, 2);
                    c0698o2.e0(objH2);
                }
                cVar2 = cVar;
                d(iG2, cVar2, (p241y9.c) objH2, c0698o2, (i16 >> 3) & 112);
                z11 = false;
            } else {
                cVar2 = cVar;
                z11 = false;
                c0698o2.T(1558073567);
            }
            c0698o2.p(z11);
            c0698o2.p(true);
        } else {
            eVar2 = eVar;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new o(i10, i11, cVar2, eVar2, i12);
        }
    }

    public static final void f(int i10, int i11, C0698o c0698o, r rVar) {
        c0698o.V(-525372848);
        int i12 = (c0698o.e(i10) ? 4 : 2) | i11;
        if (c0698o.K(i12 & 1, (i12 & 19) != 18)) {
            AbstractC0542b2.b(p000a.a.m0(i10, c0698o), androidx.compose.foundation.layout.b.i(rVar, 16, 8), ((p005a4.a) c0698o.k(p005a4.e.f11187a)).m(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).g, c0698o, 0, 0, 65528);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A5.b(i10, i11, rVar);
        }
    }
}
