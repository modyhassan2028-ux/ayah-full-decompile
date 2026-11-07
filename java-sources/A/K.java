package A;

import D.AbstractC0066i;
import G.AbstractC0190y;
import H0.C0224x;
import J0.C0281e;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.A2;
import W.AbstractC0542b2;
import W.C0554e2;
import W.C2;
import W.G2;
import Z.AbstractC0700p;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.window.PopupLayout;
import io.realm.RealmFieldTypeConstants;
import p001a0.C0718b;
import p001a0.C0725i;
import p207v2.C1369g;
import p207v2.EnumC1375m;

/* JADX INFO: loaded from: classes.dex */
public final class K extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f83r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f84s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f85t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i10, int i11, Object obj, Object obj2) {
        super(2);
        this.f83r = i11;
        this.f84s = obj;
        this.f85t = obj2;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int iF;
        int i10;
        int i11 = this.f83r;
        l0.o oVar = l0.o.f19333a;
        Z.S s10 = C0690k.f10683a;
        int i12 = 6;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj3 = this.f85t;
        Object obj4 = this.f84s;
        switch (i11) {
            case 0:
                long j = ((p171r0.c) obj2).f21387a;
                p017b7.g.H((E0.d) obj4, (D0.v) obj);
                M9.e eVar = ((T) obj3).f145L;
                if (eVar != null) {
                    eVar.k(new C0046u(j));
                }
                return yVar;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                p251z9.s sVar = (p251z9.s) obj4;
                float f3 = sVar.f24883r;
                sVar.f24883r = ((C0) obj3).a(fFloatValue - f3) + f3;
                return yVar;
            case 2:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                G.B b5 = (G.B) obj4;
                G.A a9 = (G.A) obj3;
                Object obj5 = a9.f2559a;
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    F.i iVar = (F.i) b5.f2565b.invoke();
                    int iF2 = a9.f2561c;
                    if ((iF2 >= iVar.b() || !iVar.c(iF2).equals(obj5)) && (iF2 = iVar.f2057d.f(obj5)) != -1) {
                        a9.f2561c = iF2;
                    }
                    int i13 = iF2;
                    if (i13 != -1) {
                        c0698o.T(-660404355);
                        AbstractC0190y.d(iVar, b5.f2564a, i13, obj5, c0698o, 0);
                        c0698o.p(false);
                    } else {
                        c0698o.T(-660169871);
                        c0698o.p(false);
                    }
                    boolean zI = c0698o.i(a9);
                    Object objH = c0698o.H();
                    if (zI || objH == s10) {
                        objH = new M0(i12, a9);
                        c0698o.e0(objH);
                    }
                    C0672b.d(obj5, (p241y9.c) objH, c0698o);
                } else {
                    c0698o.N();
                }
                return yVar;
            case 3:
                return (H0.J) ((p241y9.e) obj3).invoke(new G.F((G.B) obj4, (H0.e0) obj), new p063g1.a(((p063g1.a) obj2).f16246a));
            case 4:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((p074h0.d) obj4).d((G.Y) obj3, c0698o2, 0);
                } else {
                    c0698o2.N();
                }
                return yVar;
            case 5:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Boolean bool = (Boolean) ((C0224x) obj4).f3230f.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    p241y9.e eVar2 = (p241y9.e) obj3;
                    c0698o3.W(bool);
                    boolean zH = c0698o3.h(zBooleanValue);
                    if (zBooleanValue) {
                        eVar2.invoke(c0698o3, 0);
                    } else {
                        if (c0698o3.f10730k != 0) {
                            AbstractC0700p.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!c0698o3.f10720O) {
                            if (zH) {
                                Z.w0 w0Var = c0698o3.f10711F;
                                int i14 = w0Var.g;
                                int i15 = w0Var.f10845h;
                                C0718b c0718b = c0698o3.f10717L;
                                c0718b.getClass();
                                c0718b.d(false);
                                c0718b.f11088b.f11086i.W(C0725i.f11103c);
                                AbstractC0700p.a(i14, i15, c0698o3.f10737r);
                                c0698o3.f10711F.q();
                            } else {
                                c0698o3.M();
                            }
                        }
                    }
                    if (c0698o3.f10743x && c0698o3.f10711F.f10846i == c0698o3.f10744y) {
                        c0698o3.f10744y = -1;
                        c0698o3.f10743x = false;
                    }
                    c0698o3.p(false);
                } else {
                    c0698o3.N();
                }
                return yVar;
            case 6:
                p180s0.o oVar2 = (p180s0.o) obj;
                p205v0.b bVar = (p205v0.b) obj2;
                J0.j0 j0Var = (J0.j0) obj4;
                J0.I i16 = j0Var.f4125C;
                if (i16.I()) {
                    j0Var.S = oVar2;
                    j0Var.R = bVar;
                    J0.t0 snapshotObserver = J0.L.a(i16).getSnapshotObserver();
                    p180s0.G g = J0.j0.f4120Y;
                    snapshotObserver.a(j0Var, C0281e.f4076u, (J0.g0) obj3);
                    j0Var.f4139V = false;
                } else {
                    j0Var.f4139V = true;
                }
                return yVar;
            case 7:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((AndroidComposeView) obj4, (p241y9.e) obj3, (C0698o) obj, C0672b.y(1));
                return yVar;
            case 8:
                C0698o c0698o4 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o4.x()) {
                    c0698o4.N();
                } else {
                    ((p241y9.f) obj4).d(((W.P) obj3).f8751b, c0698o4, 0);
                }
                return yVar;
            case 9:
                C0698o c0698o5 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o5.x()) {
                    c0698o5.N();
                } else {
                    l0.r rVarG = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.a(oVar, W.S.f8806c, W.S.f8807d), (D.P) obj4);
                    p241y9.f fVar = (p241y9.f) obj3;
                    D.W wA = D.U.a(AbstractC0066i.f981e, l0.c.f19307B, c0698o5, 54);
                    int i17 = c0698o5.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o5.m();
                    l0.r rVarC = l0.a.c(c0698o5, rVarG);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o5.X();
                    if (c0698o5.f10720O) {
                        c0698o5.l(c0286i);
                    } else {
                        c0698o5.h0();
                    }
                    C0672b.v(c0698o5, wA, C0287j.f4119f);
                    C0672b.v(c0698o5, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o5.f10720O || !p251z9.j.a(c0698o5.H(), Integer.valueOf(i17))) {
                        p123m2.c.y(i17, c0698o5, i17, c0285h);
                    }
                    C0672b.v(c0698o5, rVarC, C0287j.f4117d);
                    fVar.d(D.X.f924a, c0698o5, 6);
                    c0698o5.p(true);
                }
                return yVar;
            case 10:
                C0698o c0698o6 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o6.x()) {
                    c0698o6.N();
                } else {
                    AbstractC0542b2.a(((G2) obj4).j, (p074h0.d) obj3, c0698o6, 0);
                }
                return yVar;
            case 11:
                C0698o c0698o7 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o7.x()) {
                    c0698o7.N();
                } else {
                    C2 c10 = (C2) obj4;
                    C0554e2 c0554e2 = (C0554e2) obj3;
                    D.W wA2 = D.U.a(AbstractC0066i.f977a, l0.c.f19306A, c0698o7, 0);
                    int i18 = c0698o7.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o7.m();
                    l0.r rVarC2 = l0.a.c(c0698o7, oVar);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i2 = C0287j.f4115b;
                    c0698o7.X();
                    if (c0698o7.f10720O) {
                        c0698o7.l(c0286i2);
                    } else {
                        c0698o7.h0();
                    }
                    C0672b.v(c0698o7, wA2, C0287j.f4119f);
                    C0672b.v(c0698o7, interfaceC0687i0M2, C0287j.f4118e);
                    C0285h c0285h2 = C0287j.g;
                    if (c0698o7.f10720O || !p251z9.j.a(c0698o7.H(), Integer.valueOf(i18))) {
                        p123m2.c.y(i18, c0698o7, i18, c0285h2);
                    }
                    C0672b.v(c0698o7, rVarC2, C0287j.f4117d);
                    float f7 = Y.s.f10242k;
                    float f10 = Y.s.j;
                    l0.r rVarK = androidx.compose.foundation.layout.c.k(oVar, f7, f10);
                    if (c10.d()) {
                        iF = c10.f() % 24;
                    } else {
                        if (c10.f() % 12 == 0) {
                            i10 = 12;
                        } else {
                            iF = c10.i() ? c10.f() - 12 : c10.f();
                        }
                        A2.o(rVarK, i10, c10, 0, c0554e2, c0698o7, 3078);
                        A2.n(androidx.compose.foundation.layout.c.k(oVar, A2.f8456e, Y.s.f10240h), c0698o7, 6);
                        A2.o(androidx.compose.foundation.layout.c.k(oVar, f7, f10), c10.g(), c10, 1, c0554e2, c0698o7, 3078);
                        c0698o7.p(true);
                    }
                    i10 = iF;
                    A2.o(rVarK, i10, c10, 0, c0554e2, c0698o7, 3078);
                    A2.n(androidx.compose.foundation.layout.c.k(oVar, A2.f8456e, Y.s.f10240h), c0698o7, 6);
                    A2.o(androidx.compose.foundation.layout.c.k(oVar, f7, f10), c10.g(), c10, 1, c0554e2, c0698o7, 3078);
                    c0698o7.p(true);
                }
                return yVar;
            case 12:
                float fFloatValue2 = ((Number) obj).floatValue();
                float fFloatValue3 = ((Number) obj2).floatValue();
                X.s sVar2 = ((X.q) obj4).f9771a;
                sVar2.f9782i.h(fFloatValue2);
                sVar2.j.h(fFloatValue3);
                ((p251z9.s) obj3).f24883r = fFloatValue2;
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                C0698o c0698o8 = (C0698o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                PopupLayout popupLayout = (PopupLayout) obj4;
                if (c0698o8.K(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement(p104k1.b.f18899v, false);
                    boolean zI2 = c0698o8.i(popupLayout);
                    Object objH2 = c0698o8.H();
                    if (zI2 || objH2 == s10) {
                        objH2 = new p104k1.g(popupLayout, 1);
                        c0698o8.e0(objH2);
                    }
                    l0.r rVarE = androidx.compose.ui.layout.a.e(appendedSemanticsElement, (p241y9.c) objH2);
                    float f11 = popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f11 != 1.0f) {
                        rVarE = androidx.compose.ui.graphics.a.b(rVarE, 0.0f, 0.0f, f11, 0.0f, 0.0f, null, true, 126971);
                    }
                    p241y9.e eVar3 = (p241y9.e) ((Z.X) obj3).getValue();
                    p104k1.d dVar = p104k1.d.f18908c;
                    int i19 = c0698o8.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M3 = c0698o8.m();
                    l0.r rVarC3 = l0.a.c(c0698o8, rVarE);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i3 = C0287j.f4115b;
                    c0698o8.X();
                    if (c0698o8.f10720O) {
                        c0698o8.l(c0286i3);
                    } else {
                        c0698o8.h0();
                    }
                    C0672b.v(c0698o8, dVar, C0287j.f4119f);
                    C0672b.v(c0698o8, interfaceC0687i0M3, C0287j.f4118e);
                    C0285h c0285h3 = C0287j.g;
                    if (c0698o8.f10720O || !p251z9.j.a(c0698o8.H(), Integer.valueOf(i19))) {
                        p123m2.c.y(i19, c0698o8, i19, c0285h3);
                    }
                    C0672b.v(c0698o8, rVarC3, C0287j.f4117d);
                    eVar3.invoke(c0698o8, 0);
                    c0698o8.p(true);
                } else {
                    c0698o8.N();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                int iIntValue5 = ((Number) obj).intValue();
                R0.p pVar = (R0.p) obj2;
                p131n0.c cVar = (p131n0.c) obj3;
                if (!((K0.V0) obj4).f5027b.b(pVar.g)) {
                    cVar.k(iIntValue5, pVar);
                    cVar.f19809y.k(yVar);
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                C1369g c1369g = (C1369g) obj;
                C1369g c1369g2 = (C1369g) obj2;
                p207v2.n0 n0Var = (p207v2.n0) obj3;
                p251z9.j.e(c1369g, "prependHint");
                p251z9.j.e(c1369g2, "appendHint");
                if (((EnumC1375m) obj4) == EnumC1375m.f23269s) {
                    c1369g.f23233a = n0Var;
                    if (n0Var != null) {
                        c1369g.f23234b.g(n0Var);
                    }
                } else {
                    c1369g2.f23233a = n0Var;
                    if (n0Var != null) {
                        c1369g2.f23234b.g(n0Var);
                    }
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                ((Number) obj2).intValue();
                ((p242z.e) obj4).a((p242z.a) obj3, (C0698o) obj, C0672b.y(1));
                return yVar;
            case 17:
                ((Number) obj2).intValue();
                p242z.k.a((p242z.a) obj4, (p074h0.d) obj3, (C0698o) obj, C0672b.y(385));
                return yVar;
            default:
                C0698o c0698o9 = (C0698o) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (c0698o9.K(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p242z.a aVar = (p242z.a) obj4;
                    p242z.k.a(aVar, p074h0.j.d(1156688164, new M(7, (C0023i) obj3, aVar), c0698o9), c0698o9, 384);
                } else {
                    c0698o9.N();
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i10, Object obj, Object obj2) {
        super(2);
        this.f83r = i10;
        this.f84s = obj;
        this.f85t = obj2;
    }
}
