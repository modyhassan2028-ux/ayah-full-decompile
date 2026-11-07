package p005a4;

import D.AbstractC0060c;
import D.AbstractC0066i;
import D.C0061d;
import D.U;
import D.W;
import F2.t;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.S;
import androidx.compose.foundation.layout.b;
import l0.a;
import l0.c;
import l0.i;
import l0.o;
import l0.r;
import p110k9.y;
import p241y9.e;
import p251z9.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f11185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f11186t;

    public /* synthetic */ d(p136n5.e eVar, boolean z10) {
        this.f11184r = 1;
        this.f11186t = eVar;
        this.f11185s = z10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        float f3;
        o oVar;
        o oVar2;
        o oVar3;
        C0698o c0698o;
        o oVar4;
        o oVar5;
        switch (this.f11184r) {
            case 0:
                ((Integer) obj2).getClass();
                e.a(this.f11185s, (p074h0.d) this.f11186t, (C0698o) obj, C0672b.y(49));
                break;
            case 1:
                p136n5.e eVar = (p136n5.e) this.f11186t;
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0061d c0061d = AbstractC0066i.g;
                    i iVar = c.f19307B;
                    r rVarJ = b.j(androidx.compose.foundation.layout.c.f11826a, 16, 0.0f, 2);
                    W wA = U.a(c0061d, iVar, c0698o2, 54);
                    int i10 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    r rVarC = a.c(c0698o2, rVarJ);
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
                    if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i10))) {
                        p123m2.c.y(i10, c0698o2, i10, c0285h);
                    }
                    C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                    boolean zI = c0698o2.i(eVar);
                    Object objH = c0698o2.H();
                    S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        t tVar = new t(0, eVar, p136n5.e.class, "onSettingsPressed", "onSettingsPressed()V", 0, 0, 9);
                        c0698o2.e0(tVar);
                        objH = tVar;
                    }
                    p241y9.a aVar = (p241y9.a) ((h) objH);
                    float f7 = 52;
                    o oVar6 = o.f19333a;
                    V0.h(aVar, androidx.compose.foundation.layout.c.n(oVar6, f7), false, null, p157p5.c.f20991a, c0698o2, 196656, 28);
                    boolean zI2 = c0698o2.i(eVar);
                    Object objH2 = c0698o2.H();
                    if (zI2 || objH2 == s10) {
                        f3 = f7;
                        oVar = oVar6;
                        t tVar2 = new t(0, eVar, p136n5.e.class, "onPreviousPressed", "onPreviousPressed()V", 0, 0, 10);
                        c0698o2.e0(tVar2);
                        objH2 = tVar2;
                    } else {
                        f3 = f7;
                        oVar = oVar6;
                    }
                    float f10 = f3;
                    o oVar7 = oVar;
                    V0.h((p241y9.a) ((h) objH2), androidx.compose.foundation.layout.c.n(oVar, f3), false, null, p157p5.c.f20992b, c0698o2, 196656, 28);
                    if (this.f11185s) {
                        c0698o2.T(-631280292);
                        boolean zI3 = c0698o2.i(eVar);
                        Object objH3 = c0698o2.H();
                        if (zI3 || objH3 == s10) {
                            oVar5 = oVar7;
                            t tVar3 = new t(0, eVar, p136n5.e.class, "onPlayPausePressed", "onPlayPausePressed()V", 0, 0, 11);
                            c0698o2.e0(tVar3);
                            objH3 = tVar3;
                        } else {
                            oVar5 = oVar7;
                        }
                        oVar3 = oVar5;
                        V0.h((p241y9.a) ((h) objH3), androidx.compose.foundation.layout.c.n(oVar5, f10), false, null, p157p5.c.f20993c, c0698o2, 196656, 28);
                        c0698o = c0698o2;
                        c0698o.p(false);
                    } else {
                        c0698o2.T(-630963937);
                        boolean zI4 = c0698o2.i(eVar);
                        Object objH4 = c0698o2.H();
                        if (zI4 || objH4 == s10) {
                            oVar2 = oVar7;
                            t tVar4 = new t(0, eVar, p136n5.e.class, "onPlayPausePressed", "onPlayPausePressed()V", 0, 0, 12);
                            c0698o2.e0(tVar4);
                            objH4 = tVar4;
                        } else {
                            oVar2 = oVar7;
                        }
                        oVar3 = oVar2;
                        V0.h((p241y9.a) ((h) objH4), androidx.compose.foundation.layout.c.n(oVar2, f10), false, null, p157p5.c.f20994d, c0698o2, 196656, 28);
                        c0698o = c0698o2;
                        c0698o.p(false);
                    }
                    boolean zI5 = c0698o.i(eVar);
                    Object objH5 = c0698o.H();
                    if (zI5 || objH5 == s10) {
                        oVar4 = oVar3;
                        t tVar5 = new t(0, eVar, p136n5.e.class, "onNextPressed", "onNextPressed()V", 0, 0, 13);
                        c0698o.e0(tVar5);
                        objH5 = tVar5;
                    } else {
                        oVar4 = oVar3;
                    }
                    C0698o c0698o3 = c0698o;
                    V0.h((p241y9.a) ((h) objH5), androidx.compose.foundation.layout.c.n(oVar4, f10), false, null, p157p5.c.f20995e, c0698o3, 196656, 28);
                    AbstractC0060c.a(c0698o3, androidx.compose.foundation.layout.c.n(oVar4, f10));
                    c0698o3.p(true);
                } else {
                    c0698o2.N();
                }
                return y.f19095a;
            default:
                ((Integer) obj2).getClass();
                p171r0.a.c(this.f11185s, (e) this.f11186t, (C0698o) obj, C0672b.y(1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ d(boolean z10, e eVar, int i10, int i11) {
        this.f11184r = i11;
        this.f11185s = z10;
        this.f11186t = eVar;
    }
}
