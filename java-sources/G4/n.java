package G4;

import D.AbstractC0060c;
import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0076t;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import N9.InterfaceC0415h;
import N9.P;
import W.AbstractC0614y;
import W.F2;
import W.Q;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.S;
import Z.X;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import java.text.NumberFormat;
import l0.o;
import l0.r;
import p110k9.y;
import p214w.C1395h;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p074h0.d f2855a = new p074h0.d(1455118670, new A5.d(4), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p074h0.d f2856b = new p074h0.d(-2100246259, new A5.d(5), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p074h0.d f2857c = new p074h0.d(-1791945354, new A5.d(6), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p074h0.d f2858d = new p074h0.d(271552706, new D4.j(3, (byte) 0), false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p074h0.d f2859e = new p074h0.d(80883487, new D4.j(4, (byte) 0), false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p074h0.d f2860f = new p074h0.d(-483340981, new D4.j(5, (byte) 0), false);
    public static final p074h0.d g = new p074h0.d(-1301844151, new D4.j(6, (byte) 0), false);

    public static final void a(P p10, final C4.e eVar, final InterfaceC0415h interfaceC0415h, E4.a aVar, final p241y9.c cVar, final p241y9.c cVar2, r rVar, final NumberFormat numberFormat, C0698o c0698o, int i10) {
        C0698o c0698o2;
        p251z9.j.e(interfaceC0415h, "playUntilDetails");
        p251z9.j.e(cVar, "ayahOperationsHandler");
        p251z9.j.e(cVar2, "onPlayUntilChanged");
        c0698o.V(387128735);
        int i11 = i10 | (c0698o.i(p10) ? 4 : 2) | (c0698o.i(eVar) ? 32 : 16) | (c0698o.i(interfaceC0415h) ? 256 : 128) | (c0698o.g(aVar) ? 2048 : 1024) | (c0698o.i(cVar) ? 16384 : 8192) | (c0698o.i(cVar2) ? 131072 : 65536) | (c0698o.g(rVar) ? 1048576 : 524288) | (c0698o.i(numberFormat) ? 8388608 : 4194304);
        if (c0698o.K(i11 & 1, (4793491 & i11) != 4793490)) {
            c0698o.P();
            if ((i10 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            int i12 = i11 >> 6;
            X xK = C0672b.k(p10, aVar, null, c0698o, (i11 & 14) | (i12 & 112), 2);
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.r(Boolean.FALSE);
                c0698o.e0(objH);
            }
            final X x9 = (X) objH;
            Object objH2 = c0698o.H();
            if (objH2 == s10) {
                objH2 = C0672b.r(Boolean.FALSE);
                c0698o.e0(objH2);
            }
            final X x10 = (X) objH2;
            final E4.a aVar2 = (E4.a) xK.getValue();
            r rVarB = rVar.b(androidx.compose.foundation.layout.c.f11828c);
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarB);
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
            boolean z10 = ((Boolean) x9.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue();
            r rVarL = androidx.compose.foundation.layout.b.l(o.f19333a, 0.0f, 0.0f, 0.0f, 16, 7);
            Object objH3 = c0698o.H();
            if (objH3 == s10) {
                objH3 = new f(1, x10, x9);
                c0698o.e0(objH3);
            }
            c(aVar2, cVar, (p241y9.a) objH3, rVarL, z10, numberFormat, c0698o, ((i11 >> 9) & 112) | 3456 | (i12 & 458752), 0);
            c0698o2 = c0698o;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) x9.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue());
            Object objH4 = c0698o2.H();
            if (objH4 == s10) {
                objH4 = new A3.e(6, x9, x10);
                c0698o2.e0(objH4);
            }
            androidx.compose.animation.a.a(boolValueOf, null, (p241y9.c) objH4, null, "menuExpandCollapse", null, p074h0.j.d(-1087651240, new p241y9.g() { // from class: G4.h
                @Override // p241y9.g
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    C0698o c0698o3 = (C0698o) obj3;
                    ((Integer) obj4).getClass();
                    p251z9.j.e((C1395h) obj, "$this$AnimatedContent");
                    E4.a aVar3 = aVar2;
                    p241y9.c cVar3 = cVar;
                    X x11 = x9;
                    X x12 = x10;
                    S s11 = C0690k.f10683a;
                    if (zBooleanValue) {
                        c0698o3.T(-984463017);
                        if (((Boolean) x11.getValue()).booleanValue()) {
                            c0698o3.T(-984432792);
                            boolean zG = c0698o3.g(cVar3) | c0698o3.i(aVar3);
                            Object objH5 = c0698o3.H();
                            if (zG || objH5 == s11) {
                                objH5 = new A3.e(7, cVar3, aVar3);
                                c0698o3.e0(objH5);
                            }
                            p241y9.c cVar4 = (p241y9.c) objH5;
                            r rVarJ = androidx.compose.foundation.layout.b.j(o.f19333a, 16, 0.0f, 2);
                            boolean zG2 = c0698o3.g(cVar4);
                            Object objH6 = c0698o3.H();
                            if (zG2 || objH6 == s11) {
                                objH6 = new j(cVar4, 0);
                                c0698o3.e0(objH6);
                            }
                            p241y9.c cVar5 = (p241y9.c) objH6;
                            boolean zG3 = c0698o3.g(cVar4);
                            Object objH7 = c0698o3.H();
                            if (zG3 || objH7 == s11) {
                                objH7 = new j(cVar4, 1);
                                c0698o3.e0(objH7);
                            }
                            P3.e.c(eVar, cVar5, rVarJ, (p241y9.c) objH7, null, null, false, c0698o3, 384, 112);
                            c0698o3 = c0698o3;
                            c0698o3.p(false);
                        } else {
                            if (((Boolean) x12.getValue()).booleanValue()) {
                                c0698o3.T(-983748281);
                                H4.a.b(interfaceC0415h, cVar3, cVar2, null, numberFormat, c0698o3, 0);
                            } else {
                                c0698o3.T(-988424662);
                            }
                            c0698o3.p(false);
                        }
                        c0698o3.p(false);
                    } else {
                        c0698o3.T(-984772211);
                        Object objH8 = c0698o3.H();
                        if (objH8 == s11) {
                            objH8 = new A4.h(x11, 1);
                            c0698o3.e0(objH8);
                        }
                        p241y9.a aVar4 = (p241y9.a) objH8;
                        Object objH9 = c0698o3.H();
                        if (objH9 == s11) {
                            objH9 = new A4.g(x12, 1);
                            c0698o3.e0(objH9);
                        }
                        n.b(aVar3, cVar3, aVar4, (p241y9.c) objH9, null, c0698o3, 3456);
                        c0698o3.p(false);
                    }
                    return y.f19095a;
                }
            }, c0698o2), c0698o2, 1597824);
            c0698o2.p(true);
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new i(p10, eVar, interfaceC0415h, aVar, cVar, cVar2, rVar, numberFormat, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x0151  */
    /* JADX WARN: Code duplicated, block: B:47:0x0153  */
    /* JADX WARN: Code duplicated, block: B:53:0x0164  */
    /* JADX WARN: Code duplicated, block: B:56:0x0195  */
    /* JADX WARN: Code duplicated, block: B:59:0x0215  */
    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:64:0x023d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0265  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static final void b(E4.a aVar, p241y9.c cVar, p241y9.a aVar2, p241y9.c cVar2, r rVar, C0698o c0698o, int i10) {
        p241y9.c cVar3;
        r rVar2;
        C0698o c0698o2;
        int i11;
        X x9;
        int i12;
        int i13;
        ?? r10;
        C0698o c0698o3;
        float f3;
        boolean z10;
        boolean zE;
        Object objH;
        boolean z11;
        C0698o c0698o4 = c0698o;
        p251z9.j.e(cVar, "ayahOperationHandler");
        p251z9.j.e(aVar2, "onBookmarksClickedHandler");
        p251z9.j.e(cVar2, "onPlayToClickedHandler");
        c0698o4.V(-896931897);
        int i14 = i10 | (c0698o4.g(aVar) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i14 |= c0698o4.i(cVar) ? 32 : 16;
        }
        int i15 = i14 | 24576;
        if (c0698o4.K(i15 & 1, (i15 & 9363) != 9362)) {
            Object objH2 = c0698o4.H();
            Object obj = C0690k.f10683a;
            if (objH2 == obj) {
                objH2 = C0672b.r(Boolean.FALSE);
                c0698o4.e0(objH2);
            }
            X x10 = (X) objH2;
            I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i16 = c0698o4.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o4.m();
            o oVar = o.f19333a;
            r rVarC = l0.a.c(c0698o4, oVar);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar3 = C0287j.f4115b;
            c0698o4.X();
            if (c0698o4.f10720O) {
                c0698o4.l(aVar3);
            } else {
                c0698o4.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o4, iD, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o4, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o4.f10720O) {
                i11 = i15;
            } else {
                i11 = i15;
                if (!p251z9.j.a(c0698o4.H(), Integer.valueOf(i16))) {
                }
                C0285h c0285h4 = C0287j.f4117d;
                C0672b.v(c0698o4, rVarC, c0285h4);
                r rVarE = p181s2.r.e(oVar, p181s2.r.d(c0698o4));
                x9 = x10;
                C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o4, 0);
                i12 = c0698o4.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o4.m();
                r rVarC2 = l0.a.c(c0698o4, rVarE);
                c0698o4.X();
                if (c0698o4.f10720O) {
                    c0698o4.l(aVar3);
                } else {
                    c0698o4.h0();
                }
                C0672b.v(c0698o4, c0076tA, c0285h);
                C0672b.v(c0698o4, interfaceC0687i0M2, c0285h2);
                if (c0698o4.f10720O || !p251z9.j.a(c0698o4.H(), Integer.valueOf(i12))) {
                    p123m2.c.y(i12, c0698o4, i12, c0285h3);
                }
                C0672b.v(c0698o4, rVarC2, c0285h4);
                i13 = aVar.f1845a;
                if (aVar.f1851h) {
                    c0698o4.T(843809642);
                    D.P p10 = W.S.f8804a;
                    Q qA = W.S.a(0L, ((p005a4.a) c0698o4.k(p005a4.e.f11187a)).l(), c0698o, 13);
                    r rVarL = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.b.j(oVar, 32, 0.0f, 2).b(androidx.compose.foundation.layout.c.f11826a), 0.0f, 0.0f, 0.0f, 16, 7);
                    if ((i11 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zE = z10 | c0698o.e(i13);
                    objH = c0698o.H();
                    if (!zE || objH == obj) {
                        z11 = false;
                        objH = new a(i13, 0, cVar, x9);
                        c0698o.e0(objH);
                    } else {
                        z11 = false;
                    }
                    x9 = x9;
                    r10 = z11;
                    V0.d((p241y9.a) objH, rVarL, false, null, qA, null, null, null, f2855a, c0698o, 805306416, 492);
                    c0698o3 = c0698o;
                } else {
                    r10 = 0;
                    c0698o4.T(840734783);
                    c0698o3 = c0698o4;
                }
                c0698o3.p(r10);
                float f7 = 8;
                f3 = 16;
                p015b4.f.f(384, 2, c0698o3, p074h0.j.d(-23784275, new c(aVar, cVar, i13, aVar2), c0698o3), null, androidx.compose.foundation.layout.b.l(oVar, f3, 0.0f, f3, f7, 2));
                cVar3 = cVar2;
                p015b4.f.f(384, 2, c0698o3, p074h0.j.d(-35645788, new c(cVar, i13, aVar, cVar3), c0698o3), null, androidx.compose.foundation.layout.b.i(oVar, f3, f7));
                p015b4.f.f(384, 2, c0698o3, p074h0.j.d(133605797, new d(cVar, i13), c0698o3), null, androidx.compose.foundation.layout.b.i(oVar, f3, f7));
                p015b4.f.f(384, 2, c0698o3, p074h0.j.d(302857382, new D4.l(cVar, i13, aVar), c0698o3), null, androidx.compose.foundation.layout.b.i(oVar, f3, f7));
                if (aVar.f1852i instanceof N3.c) {
                    c0698o3.T(850724068);
                    AbstractC0060c.a(c0698o3, androidx.compose.foundation.layout.c.d(oVar, f3));
                } else {
                    c0698o3.T(840734783);
                }
                c0698o3.p(r10);
                c0698o3.p(true);
                if (((Boolean) x9.getValue()).booleanValue()) {
                    c0698o3.T(1347213618);
                    Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o3.k(AndroidCompositionLocals_androidKt.f12063b)), new p248z6.c(10, x9), c0698o3, r10);
                } else {
                    c0698o3.T(1337117941);
                }
                c0698o3.p(r10);
                c0698o3.p(true);
                rVar2 = oVar;
                c0698o2 = c0698o3;
            }
            p123m2.c.y(i16, c0698o4, i16, c0285h3);
            C0285h c0285h5 = C0287j.f4117d;
            C0672b.v(c0698o4, rVarC, c0285h5);
            r rVarE2 = p181s2.r.e(oVar, p181s2.r.d(c0698o4));
            x9 = x10;
            C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o4, 0);
            i12 = c0698o4.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o4.m();
            r rVarC3 = l0.a.c(c0698o4, rVarE2);
            c0698o4.X();
            if (c0698o4.f10720O) {
                c0698o4.l(aVar3);
            } else {
                c0698o4.h0();
            }
            C0672b.v(c0698o4, c0076tA2, c0285h);
            C0672b.v(c0698o4, interfaceC0687i0M3, c0285h2);
            if (c0698o4.f10720O) {
                p123m2.c.y(i12, c0698o4, i12, c0285h3);
            } else {
                p123m2.c.y(i12, c0698o4, i12, c0285h3);
            }
            C0672b.v(c0698o4, rVarC3, c0285h5);
            i13 = aVar.f1845a;
            if (aVar.f1851h) {
                c0698o4.T(843809642);
                D.P p11 = W.S.f8804a;
                Q qA2 = W.S.a(0L, ((p005a4.a) c0698o4.k(p005a4.e.f11187a)).l(), c0698o, 13);
                r rVarL2 = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.b.j(oVar, 32, 0.0f, 2).b(androidx.compose.foundation.layout.c.f11826a), 0.0f, 0.0f, 0.0f, 16, 7);
                if ((i11 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zE = z10 | c0698o.e(i13);
                objH = c0698o.H();
                if (zE) {
                    z11 = false;
                    objH = new a(i13, 0, cVar, x9);
                    c0698o.e0(objH);
                } else {
                    z11 = false;
                    objH = new a(i13, 0, cVar, x9);
                    c0698o.e0(objH);
                }
                x9 = x9;
                r10 = z11;
                V0.d((p241y9.a) objH, rVarL2, false, null, qA2, null, null, null, f2855a, c0698o, 805306416, 492);
                c0698o3 = c0698o;
            } else {
                r10 = 0;
                c0698o4.T(840734783);
                c0698o3 = c0698o4;
            }
            c0698o3.p(r10);
            float f10 = 8;
            f3 = 16;
            p015b4.f.f(384, 2, c0698o3, p074h0.j.d(-23784275, new c(aVar, cVar, i13, aVar2), c0698o3), null, androidx.compose.foundation.layout.b.l(oVar, f3, 0.0f, f3, f10, 2));
            cVar3 = cVar2;
            p015b4.f.f(384, 2, c0698o3, p074h0.j.d(-35645788, new c(cVar, i13, aVar, cVar3), c0698o3), null, androidx.compose.foundation.layout.b.i(oVar, f3, f10));
            p015b4.f.f(384, 2, c0698o3, p074h0.j.d(133605797, new d(cVar, i13), c0698o3), null, androidx.compose.foundation.layout.b.i(oVar, f3, f10));
            p015b4.f.f(384, 2, c0698o3, p074h0.j.d(302857382, new D4.l(cVar, i13, aVar), c0698o3), null, androidx.compose.foundation.layout.b.i(oVar, f3, f10));
            if (aVar.f1852i instanceof N3.c) {
                c0698o3.T(850724068);
                AbstractC0060c.a(c0698o3, androidx.compose.foundation.layout.c.d(oVar, f3));
            } else {
                c0698o3.T(840734783);
            }
            c0698o3.p(r10);
            c0698o3.p(true);
            if (((Boolean) x9.getValue()).booleanValue()) {
                c0698o3.T(1347213618);
                Y2.a.d(androidx.compose.foundation.layout.a.f11825a.b(), B9.a.t((Context) c0698o3.k(AndroidCompositionLocals_androidKt.f12063b)), new p248z6.c(10, x9), c0698o3, r10);
            } else {
                c0698o3.T(1337117941);
            }
            c0698o3.p(r10);
            c0698o3.p(true);
            rVar2 = oVar;
            c0698o2 = c0698o3;
        } else {
            cVar3 = cVar2;
            c0698o4.N();
            rVar2 = rVar;
            c0698o2 = c0698o4;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e(aVar, cVar, aVar2, cVar3, rVar2, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2 A[PHI: r4 r7
      0x00d2: PHI (r4v19 int) = (r4v12 int), (r4v21 int) binds: [B:76:0x00dd, B:70:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r7v8 l0.r) = (r7v5 l0.r), (r7v10 l0.r) binds: [B:76:0x00dd, B:70:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x016a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0175  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void c(E4.a aVar, p241y9.c cVar, p241y9.a aVar2, r rVar, boolean z10, NumberFormat numberFormat, C0698o c0698o, int i10, int i11) {
        int i12;
        r rVar2;
        NumberFormat numberFormat2;
        boolean z11;
        r rVar3;
        NumberFormat numberFormat3;
        C0699o0 c0699o0R;
        r rVar4;
        int i13;
        NumberFormat numberFormat4;
        p074h0.d dVarD;
        int i14;
        p251z9.j.e(aVar, "ayahDetailsModel");
        p251z9.j.e(cVar, "onAyahOperationHandler");
        p251z9.j.e(aVar2, "onBackPressHandler");
        c0698o.V(1764593838);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0698o.g(aVar) : c0698o.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o.i(aVar2) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 3072) == 0) {
                rVar2 = rVar;
                i12 |= c0698o.g(rVar2) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                if (c0698o.h(z10)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    numberFormat2 = numberFormat;
                    int i16 = c0698o.i(numberFormat2) ? 131072 : 65536;
                    i12 |= i16;
                } else {
                    numberFormat2 = numberFormat;
                }
                i12 |= i16;
            } else {
                numberFormat2 = numberFormat;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0698o.K(i12 & 1, z11)) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i15 != 0) {
                        rVar4 = o.f19333a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i11 & 32) != 0) {
                        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                        p251z9.j.d(integerInstance, "getIntegerInstance(...)");
                        i13 = i12 & (-458753);
                        numberFormat4 = integerInstance;
                    }
                    c0698o.q();
                    int i17 = aVar.f1845a;
                    String str = p000a.a.l0(R.array.sura_names, c0698o)[aVar.f1846b - 1];
                    String str2 = numberFormat4.format(Integer.valueOf(aVar.f1847c));
                    if (z10) {
                        c0698o.T(-1384055862);
                        dVarD = p074h0.j.d(-1072191358, new A5.f(aVar2, 2, (byte) 0), c0698o);
                        c0698o.p(false);
                    } else {
                        c0698o.T(-1383763160);
                        c0698o.p(false);
                        dVarD = f2860f;
                    }
                    float f3 = F2.f8543a;
                    AbstractC0614y.b(p074h0.j.d(-1836472718, new k(0, str, str2), c0698o), rVar4, dVarD, p074h0.j.d(-1938491235, new D4.g(cVar, i17, aVar), c0698o), 0.0f, null, F2.a(((p005a4.a) c0698o.k(p005a4.e.f11187a)).g(), c0698o), c0698o, ((i13 >> 6) & 112) | 3078, 176);
                    numberFormat3 = numberFormat4;
                    rVar3 = rVar4;
                } else {
                    c0698o.N();
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    rVar4 = rVar2;
                }
                i13 = i12;
                numberFormat4 = numberFormat2;
                c0698o.q();
                int i18 = aVar.f1845a;
                String str3 = p000a.a.l0(R.array.sura_names, c0698o)[aVar.f1846b - 1];
                String str4 = numberFormat4.format(Integer.valueOf(aVar.f1847c));
                if (z10) {
                    c0698o.T(-1384055862);
                    dVarD = p074h0.j.d(-1072191358, new A5.f(aVar2, 2, (byte) 0), c0698o);
                    c0698o.p(false);
                } else {
                    c0698o.T(-1383763160);
                    c0698o.p(false);
                    dVarD = f2860f;
                }
                float f7 = F2.f8543a;
                AbstractC0614y.b(p074h0.j.d(-1836472718, new k(0, str3, str4), c0698o), rVar4, dVarD, p074h0.j.d(-1938491235, new D4.g(cVar, i18, aVar), c0698o), 0.0f, null, F2.a(((p005a4.a) c0698o.k(p005a4.e.f11187a)).g(), c0698o), c0698o, ((i13 >> 6) & 112) | 3078, 176);
                numberFormat3 = numberFormat4;
                rVar3 = rVar4;
            } else {
                c0698o.N();
                rVar3 = rVar2;
                numberFormat3 = numberFormat2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new l(aVar, cVar, aVar2, rVar3, z10, numberFormat3, i10, i11);
            }
        }
        i12 |= 3072;
        rVar2 = rVar;
        if ((i10 & 24576) == 0) {
            if (c0698o.h(z10)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                numberFormat2 = numberFormat;
                if (c0698o.i(numberFormat2)) {
                }
                i12 |= i16;
            } else {
                numberFormat2 = numberFormat;
            }
            i12 |= i16;
        } else {
            numberFormat2 = numberFormat;
        }
        if ((74899 & i12) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0698o.K(i12 & 1, z11)) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                if ((i11 & 32) != 0) {
                    NumberFormat integerInstance2 = NumberFormat.getIntegerInstance();
                    p251z9.j.d(integerInstance2, "getIntegerInstance(...)");
                    i13 = i12 & (-458753);
                    numberFormat4 = integerInstance2;
                } else {
                    i13 = i12;
                    numberFormat4 = numberFormat2;
                }
            } else {
                if (i15 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                if ((i11 & 32) != 0) {
                    NumberFormat integerInstance3 = NumberFormat.getIntegerInstance();
                    p251z9.j.d(integerInstance3, "getIntegerInstance(...)");
                    i13 = i12 & (-458753);
                    numberFormat4 = integerInstance3;
                } else {
                    i13 = i12;
                    numberFormat4 = numberFormat2;
                }
            }
            c0698o.q();
            int i19 = aVar.f1845a;
            String str5 = p000a.a.l0(R.array.sura_names, c0698o)[aVar.f1846b - 1];
            String str6 = numberFormat4.format(Integer.valueOf(aVar.f1847c));
            if (z10) {
                c0698o.T(-1384055862);
                dVarD = p074h0.j.d(-1072191358, new A5.f(aVar2, 2, (byte) 0), c0698o);
                c0698o.p(false);
            } else {
                c0698o.T(-1383763160);
                c0698o.p(false);
                dVarD = f2860f;
            }
            float f10 = F2.f8543a;
            AbstractC0614y.b(p074h0.j.d(-1836472718, new k(0, str5, str6), c0698o), rVar4, dVarD, p074h0.j.d(-1938491235, new D4.g(cVar, i19, aVar), c0698o), 0.0f, null, F2.a(((p005a4.a) c0698o.k(p005a4.e.f11187a)).g(), c0698o), c0698o, ((i13 >> 6) & 112) | 3078, 176);
            numberFormat3 = numberFormat4;
            rVar3 = rVar4;
        } else {
            c0698o.N();
            rVar3 = rVar2;
            numberFormat3 = numberFormat2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new l(aVar, cVar, aVar2, rVar3, z10, numberFormat3, i10, i11);
        }
    }
}
