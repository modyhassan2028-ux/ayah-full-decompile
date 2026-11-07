package p104k1;

import A.C0034n0;
import A.K;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K.x0;
import K0.AbstractC0359n0;
import O9.y;
import X.L;
import Z.C0672b;
import Z.C0690k;
import Z.C0694m;
import Z.C0698o;
import Z.C0699o0;
import Z.C0709z;
import Z.InterfaceC0687i0;
import Z.S;
import Z.X;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.PopupLayout;
import java.util.UUID;
import l0.o;
import l0.r;
import p063g1.c;
import p063g1.m;
import p074h0.d;
import p241y9.a;
import p241y9.e;
import p251z9.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0709z f18923a = new C0709z(c.f18904t);

    /* JADX WARN: Code duplicated, block: B:102:0x023c  */
    /* JADX WARN: Code duplicated, block: B:104:0x024a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0256  */
    /* JADX WARN: Code duplicated, block: B:109:0x0261  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    /* JADX WARN: Code duplicated, block: B:67:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:94:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0202  */
    /* JADX WARN: Code duplicated, block: B:98:0x0225  */
    /* JADX WARN: Code duplicated, block: B:99:0x0229  */
    public static final void a(s sVar, a aVar, t tVar, d dVar, C0698o c0698o, int i10, int i11) {
        int i12;
        a aVar2;
        int i13;
        boolean z10;
        C0698o c0698o2;
        a aVar3;
        C0699o0 c0699o0R;
        a aVar4;
        View view;
        c cVar;
        String str;
        m mVar;
        C0694m c0694mT;
        X xU;
        UUID uuid;
        Object objH;
        S s10;
        C0698o c0698o3;
        String str2;
        PopupLayout popupLayout;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        boolean zG;
        Object objH2;
        S s11;
        Object c0034n0;
        boolean z13;
        PopupLayout popupLayout2;
        m mVar2;
        boolean z14;
        boolean z15;
        boolean zG2;
        Object objH3;
        boolean z16;
        Object objH4;
        boolean zI;
        Object objH5;
        boolean zI2;
        Object objH6;
        boolean zI3;
        Object objH7;
        int i16;
        C0286i c0286i;
        C0285h c0285h;
        int i17;
        int i18;
        s sVar2 = sVar;
        c0698o.V(-830247068);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.g(sVar2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                aVar2 = aVar;
                i12 |= c0698o.i(aVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if (c0698o.g(tVar)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i12 |= i18;
            }
            if ((i10 & 3072) == 0) {
                if (c0698o.i(dVar)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i12 |= i17;
            }
            i13 = i12;
            if ((i13 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o.K(i13 & 1, z10)) {
                if (i19 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                view = (View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f);
                cVar = (c) c0698o.k(AbstractC0359n0.f5118h);
                str = (String) c0698o.k(f18923a);
                mVar = (m) c0698o.k(AbstractC0359n0.f5123n);
                c0694mT = C0672b.t(c0698o);
                xU = C0672b.u(dVar, c0698o);
                uuid = (UUID) g.H(new Object[0], null, c.f18905u, c0698o, 3072, 6);
                objH = c0698o.H();
                s10 = C0690k.f10683a;
                if (objH == s10) {
                    c0698o3 = c0698o;
                    PopupLayout popupLayout3 = new PopupLayout(aVar4, tVar, str, view, cVar, sVar, uuid);
                    str2 = str;
                    sVar2 = sVar;
                    popupLayout3.setContent(c0694mT, new d(1302892335, new K(13, popupLayout3, xU), true));
                    c0698o3.e0(popupLayout3);
                    objH = popupLayout3;
                } else {
                    c0698o3 = c0698o;
                    str2 = str;
                    sVar2 = sVar;
                }
                popupLayout = (PopupLayout) objH;
                boolean zI4 = c0698o3.i(popupLayout);
                i14 = i13 & 112;
                if (i14 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z17 = zI4 | z11;
                i15 = i13 & 896;
                if (i15 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zG = z17 | z12 | c0698o3.g(str2) | c0698o3.g(mVar);
                objH2 = c0698o3.H();
                if (zG) {
                    s11 = s10;
                } else {
                    s11 = s10;
                    if (objH2 == s11) {
                        c0034n0 = objH2;
                        mVar2 = mVar;
                        z13 = false;
                        aVar3 = aVar4;
                        popupLayout2 = popupLayout;
                        c0698o2 = c0698o3;
                    }
                    C0672b.d(popupLayout2, (p241y9.c) c0034n0, c0698o2);
                    boolean zI5 = c0698o2.i(popupLayout2);
                    if (i14 == 32) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    boolean z18 = z14 | zI5;
                    if (i15 == 256) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    zG2 = z18 | z15 | c0698o2.g(str2) | c0698o2.g(mVar2);
                    objH3 = c0698o2.H();
                    if (zG2 || objH3 == s11) {
                        e eVar = new e(popupLayout2, aVar3, tVar, str2, mVar2);
                        c0698o2.e0(eVar);
                        objH3 = eVar;
                    }
                    C0672b.h((a) objH3, c0698o2);
                    boolean zI6 = c0698o2.i(popupLayout2);
                    if ((i13 & 14) == 4) {
                        z13 = true;
                    }
                    z16 = zI6 | z13;
                    objH4 = c0698o2.H();
                    if (z16 || objH4 == s11) {
                        objH4 = new L(11, popupLayout2, sVar2);
                        c0698o2.e0(objH4);
                    }
                    C0672b.d(sVar2, (p241y9.c) objH4, c0698o2);
                    zI = c0698o2.i(popupLayout2);
                    objH5 = c0698o2.H();
                    if (zI || objH5 == s11) {
                        objH5 = new y(popupLayout2, (p150o9.c) null, 24);
                        c0698o2.e0(objH5);
                    }
                    C0672b.f(c0698o2, popupLayout2, (e) objH5);
                    zI2 = c0698o2.i(popupLayout2);
                    objH6 = c0698o2.H();
                    if (zI2 || objH6 == s11) {
                        objH6 = new g(popupLayout2, 0);
                        c0698o2.e0(objH6);
                    }
                    r rVarD = androidx.compose.ui.layout.a.d(o.f19333a, (p241y9.c) objH6);
                    zI3 = c0698o2.i(popupLayout2) | c0698o2.g(mVar2);
                    objH7 = c0698o2.H();
                    if (zI3 || objH7 == s11) {
                        objH7 = new x0(2, popupLayout2, mVar2);
                        c0698o2.e0(objH7);
                    }
                    I i20 = (I) objH7;
                    i16 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    r rVarC = l0.a.c(c0698o2, rVarD);
                    InterfaceC0288k.f4142a.getClass();
                    c0286i = C0287j.f4115b;
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0672b.v(c0698o2, i20, C0287j.f4119f);
                    C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                    c0285h = C0287j.g;
                    if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i16))) {
                        p123m2.c.y(i16, c0698o2, i16, c0285h);
                    }
                    C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                    c0698o2.p(true);
                }
                z13 = false;
                aVar3 = aVar4;
                popupLayout2 = popupLayout;
                c0698o2 = c0698o3;
                c0034n0 = new C0034n0(popupLayout2, aVar3, tVar, str2, mVar, 5);
                mVar2 = mVar;
                c0698o2.e0(c0034n0);
                C0672b.d(popupLayout2, (p241y9.c) c0034n0, c0698o2);
                boolean zI7 = c0698o2.i(popupLayout2);
                if (i14 == 32) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                boolean z19 = z14 | zI7;
                if (i15 == 256) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                zG2 = z19 | z15 | c0698o2.g(str2) | c0698o2.g(mVar2);
                objH3 = c0698o2.H();
                if (zG2) {
                    e eVar2 = new e(popupLayout2, aVar3, tVar, str2, mVar2);
                    c0698o2.e0(eVar2);
                    objH3 = eVar2;
                } else {
                    e eVar3 = new e(popupLayout2, aVar3, tVar, str2, mVar2);
                    c0698o2.e0(eVar3);
                    objH3 = eVar3;
                }
                C0672b.h((a) objH3, c0698o2);
                boolean zI8 = c0698o2.i(popupLayout2);
                if ((i13 & 14) == 4) {
                    z13 = true;
                }
                z16 = zI8 | z13;
                objH4 = c0698o2.H();
                if (z16) {
                    objH4 = new L(11, popupLayout2, sVar2);
                    c0698o2.e0(objH4);
                } else {
                    objH4 = new L(11, popupLayout2, sVar2);
                    c0698o2.e0(objH4);
                }
                C0672b.d(sVar2, (p241y9.c) objH4, c0698o2);
                zI = c0698o2.i(popupLayout2);
                objH5 = c0698o2.H();
                if (zI) {
                    objH5 = new y(popupLayout2, (p150o9.c) null, 24);
                    c0698o2.e0(objH5);
                } else {
                    objH5 = new y(popupLayout2, (p150o9.c) null, 24);
                    c0698o2.e0(objH5);
                }
                C0672b.f(c0698o2, popupLayout2, (e) objH5);
                zI2 = c0698o2.i(popupLayout2);
                objH6 = c0698o2.H();
                if (zI2) {
                    objH6 = new g(popupLayout2, 0);
                    c0698o2.e0(objH6);
                } else {
                    objH6 = new g(popupLayout2, 0);
                    c0698o2.e0(objH6);
                }
                r rVarD2 = androidx.compose.ui.layout.a.d(o.f19333a, (p241y9.c) objH6);
                zI3 = c0698o2.i(popupLayout2) | c0698o2.g(mVar2);
                objH7 = c0698o2.H();
                if (zI3) {
                    objH7 = new x0(2, popupLayout2, mVar2);
                    c0698o2.e0(objH7);
                } else {
                    objH7 = new x0(2, popupLayout2, mVar2);
                    c0698o2.e0(objH7);
                }
                I i21 = (I) objH7;
                i16 = c0698o2.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
                r rVarC2 = l0.a.c(c0698o2, rVarD2);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o2.X();
                if (c0698o2.f10720O) {
                    c0698o2.l(c0286i);
                } else {
                    c0698o2.h0();
                }
                C0672b.v(c0698o2, i21, C0287j.f4119f);
                C0672b.v(c0698o2, interfaceC0687i0M2, C0287j.f4118e);
                c0285h = C0287j.g;
                if (c0698o2.f10720O) {
                    p123m2.c.y(i16, c0698o2, i16, c0285h);
                } else {
                    p123m2.c.y(i16, c0698o2, i16, c0285h);
                }
                C0672b.v(c0698o2, rVarC2, C0287j.f4117d);
                c0698o2.p(true);
            } else {
                c0698o2 = c0698o;
                c0698o2.N();
                aVar3 = aVar2;
            }
            c0699o0R = c0698o2.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new h(sVar2, aVar3, tVar, dVar, i10, i11);
            }
        }
        i12 |= 48;
        aVar2 = aVar;
        if ((i10 & 384) == 0) {
            if (c0698o.g(tVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (c0698o.i(dVar)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
        }
        i13 = i12;
        if ((i13 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o.K(i13 & 1, z10)) {
            if (i19 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            view = (View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f);
            cVar = (c) c0698o.k(AbstractC0359n0.f5118h);
            str = (String) c0698o.k(f18923a);
            mVar = (m) c0698o.k(AbstractC0359n0.f5123n);
            c0694mT = C0672b.t(c0698o);
            xU = C0672b.u(dVar, c0698o);
            uuid = (UUID) g.H(new Object[0], null, c.f18905u, c0698o, 3072, 6);
            objH = c0698o.H();
            s10 = C0690k.f10683a;
            if (objH == s10) {
                c0698o3 = c0698o;
                PopupLayout popupLayout4 = new PopupLayout(aVar4, tVar, str, view, cVar, sVar, uuid);
                str2 = str;
                sVar2 = sVar;
                popupLayout4.setContent(c0694mT, new d(1302892335, new K(13, popupLayout4, xU), true));
                c0698o3.e0(popupLayout4);
                objH = popupLayout4;
            } else {
                c0698o3 = c0698o;
                str2 = str;
                sVar2 = sVar;
            }
            popupLayout = (PopupLayout) objH;
            boolean zI9 = c0698o3.i(popupLayout);
            i14 = i13 & 112;
            if (i14 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z110 = zI9 | z11;
            i15 = i13 & 896;
            if (i15 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            zG = z110 | z12 | c0698o3.g(str2) | c0698o3.g(mVar);
            objH2 = c0698o3.H();
            if (zG) {
                s11 = s10;
                if (objH2 == s11) {
                    c0034n0 = objH2;
                    mVar2 = mVar;
                    z13 = false;
                    aVar3 = aVar4;
                    popupLayout2 = popupLayout;
                    c0698o2 = c0698o3;
                }
                C0672b.d(popupLayout2, (p241y9.c) c0034n0, c0698o2);
                boolean zI10 = c0698o2.i(popupLayout2);
                if (i14 == 32) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                boolean z111 = z14 | zI10;
                if (i15 == 256) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                zG2 = z111 | z15 | c0698o2.g(str2) | c0698o2.g(mVar2);
                objH3 = c0698o2.H();
                if (zG2) {
                    e eVar4 = new e(popupLayout2, aVar3, tVar, str2, mVar2);
                    c0698o2.e0(eVar4);
                    objH3 = eVar4;
                } else {
                    e eVar5 = new e(popupLayout2, aVar3, tVar, str2, mVar2);
                    c0698o2.e0(eVar5);
                    objH3 = eVar5;
                }
                C0672b.h((a) objH3, c0698o2);
                boolean zI11 = c0698o2.i(popupLayout2);
                if ((i13 & 14) == 4) {
                    z13 = true;
                }
                z16 = zI11 | z13;
                objH4 = c0698o2.H();
                if (z16) {
                    objH4 = new L(11, popupLayout2, sVar2);
                    c0698o2.e0(objH4);
                } else {
                    objH4 = new L(11, popupLayout2, sVar2);
                    c0698o2.e0(objH4);
                }
                C0672b.d(sVar2, (p241y9.c) objH4, c0698o2);
                zI = c0698o2.i(popupLayout2);
                objH5 = c0698o2.H();
                if (zI) {
                    objH5 = new y(popupLayout2, (p150o9.c) null, 24);
                    c0698o2.e0(objH5);
                } else {
                    objH5 = new y(popupLayout2, (p150o9.c) null, 24);
                    c0698o2.e0(objH5);
                }
                C0672b.f(c0698o2, popupLayout2, (e) objH5);
                zI2 = c0698o2.i(popupLayout2);
                objH6 = c0698o2.H();
                if (zI2) {
                    objH6 = new g(popupLayout2, 0);
                    c0698o2.e0(objH6);
                } else {
                    objH6 = new g(popupLayout2, 0);
                    c0698o2.e0(objH6);
                }
                r rVarD3 = androidx.compose.ui.layout.a.d(o.f19333a, (p241y9.c) objH6);
                zI3 = c0698o2.i(popupLayout2) | c0698o2.g(mVar2);
                objH7 = c0698o2.H();
                if (zI3) {
                    objH7 = new x0(2, popupLayout2, mVar2);
                    c0698o2.e0(objH7);
                } else {
                    objH7 = new x0(2, popupLayout2, mVar2);
                    c0698o2.e0(objH7);
                }
                I i22 = (I) objH7;
                i16 = c0698o2.f10721P;
                InterfaceC0687i0 interfaceC0687i0M3 = c0698o2.m();
                r rVarC3 = l0.a.c(c0698o2, rVarD3);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o2.X();
                if (c0698o2.f10720O) {
                    c0698o2.l(c0286i);
                } else {
                    c0698o2.h0();
                }
                C0672b.v(c0698o2, i22, C0287j.f4119f);
                C0672b.v(c0698o2, interfaceC0687i0M3, C0287j.f4118e);
                c0285h = C0287j.g;
                if (c0698o2.f10720O) {
                    p123m2.c.y(i16, c0698o2, i16, c0285h);
                } else {
                    p123m2.c.y(i16, c0698o2, i16, c0285h);
                }
                C0672b.v(c0698o2, rVarC3, C0287j.f4117d);
                c0698o2.p(true);
            } else {
                s11 = s10;
            }
            z13 = false;
            aVar3 = aVar4;
            popupLayout2 = popupLayout;
            c0698o2 = c0698o3;
            c0034n0 = new C0034n0(popupLayout2, aVar3, tVar, str2, mVar, 5);
            mVar2 = mVar;
            c0698o2.e0(c0034n0);
            C0672b.d(popupLayout2, (p241y9.c) c0034n0, c0698o2);
            boolean zI12 = c0698o2.i(popupLayout2);
            if (i14 == 32) {
                z14 = true;
            } else {
                z14 = z13;
            }
            boolean z112 = z14 | zI12;
            if (i15 == 256) {
                z15 = true;
            } else {
                z15 = z13;
            }
            zG2 = z112 | z15 | c0698o2.g(str2) | c0698o2.g(mVar2);
            objH3 = c0698o2.H();
            if (zG2) {
                e eVar6 = new e(popupLayout2, aVar3, tVar, str2, mVar2);
                c0698o2.e0(eVar6);
                objH3 = eVar6;
            } else {
                e eVar7 = new e(popupLayout2, aVar3, tVar, str2, mVar2);
                c0698o2.e0(eVar7);
                objH3 = eVar7;
            }
            C0672b.h((a) objH3, c0698o2);
            boolean zI13 = c0698o2.i(popupLayout2);
            if ((i13 & 14) == 4) {
                z13 = true;
            }
            z16 = zI13 | z13;
            objH4 = c0698o2.H();
            if (z16) {
                objH4 = new L(11, popupLayout2, sVar2);
                c0698o2.e0(objH4);
            } else {
                objH4 = new L(11, popupLayout2, sVar2);
                c0698o2.e0(objH4);
            }
            C0672b.d(sVar2, (p241y9.c) objH4, c0698o2);
            zI = c0698o2.i(popupLayout2);
            objH5 = c0698o2.H();
            if (zI) {
                objH5 = new y(popupLayout2, (p150o9.c) null, 24);
                c0698o2.e0(objH5);
            } else {
                objH5 = new y(popupLayout2, (p150o9.c) null, 24);
                c0698o2.e0(objH5);
            }
            C0672b.f(c0698o2, popupLayout2, (e) objH5);
            zI2 = c0698o2.i(popupLayout2);
            objH6 = c0698o2.H();
            if (zI2) {
                objH6 = new g(popupLayout2, 0);
                c0698o2.e0(objH6);
            } else {
                objH6 = new g(popupLayout2, 0);
                c0698o2.e0(objH6);
            }
            r rVarD4 = androidx.compose.ui.layout.a.d(o.f19333a, (p241y9.c) objH6);
            zI3 = c0698o2.i(popupLayout2) | c0698o2.g(mVar2);
            objH7 = c0698o2.H();
            if (zI3) {
                objH7 = new x0(2, popupLayout2, mVar2);
                c0698o2.e0(objH7);
            } else {
                objH7 = new x0(2, popupLayout2, mVar2);
                c0698o2.e0(objH7);
            }
            I i23 = (I) objH7;
            i16 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M4 = c0698o2.m();
            r rVarC4 = l0.a.c(c0698o2, rVarD4);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, i23, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M4, C0287j.f4118e);
            c0285h = C0287j.g;
            if (c0698o2.f10720O) {
                p123m2.c.y(i16, c0698o2, i16, c0285h);
            } else {
                p123m2.c.y(i16, c0698o2, i16, c0285h);
            }
            C0672b.v(c0698o2, rVarC4, C0287j.f4117d);
            c0698o2.p(true);
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
            aVar3 = aVar2;
        }
        c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new h(sVar2, aVar3, tVar, dVar, i10, i11);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
