package H4;

import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0077u;
import D.U;
import D.W;
import E4.t;
import F.A;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import U0.L;
import W.AbstractC0542b2;
import W.AbstractC0591q;
import W.G2;
import W.H2;
import W.V0;
import Y0.l;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.L0;
import Z.S;
import Z.X;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import l0.h;
import l0.o;
import l0.r;
import p047e5.g;
import p110k9.y;
import p241y9.a;
import p241y9.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3368r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Serializable f3369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3375y;

    public /* synthetic */ e(t tVar, NumberFormat numberFormat, p241y9.c cVar, p217w2.b bVar, p217w2.b bVar2, X x9, p241y9.c cVar2) {
        this.f3370t = tVar;
        this.f3369s = numberFormat;
        this.f3371u = cVar;
        this.f3373w = bVar;
        this.f3374x = bVar2;
        this.f3375y = x9;
        this.f3372v = cVar2;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        switch (this.f3368r) {
            case 0:
                t tVar = (t) this.f3370t;
                NumberFormat numberFormat = (NumberFormat) this.f3369s;
                p241y9.c cVar = (p241y9.c) this.f3371u;
                p217w2.b bVar = (p217w2.b) this.f3373w;
                p217w2.b bVar2 = (p217w2.b) this.f3374x;
                X x9 = (X) this.f3375y;
                p241y9.c cVar2 = (p241y9.c) this.f3372v;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h hVar = l0.c.f19310E;
                    boolean zI = c0698o.i(tVar) | c0698o.i(numberFormat) | c0698o.g(cVar) | c0698o.i(bVar) | c0698o.i(bVar2);
                    Object objH = c0698o.H();
                    S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        f fVar = new f(tVar, bVar, bVar2, numberFormat, cVar, x9, 0);
                        c0698o.e0(fVar);
                        objH = fVar;
                    }
                    B9.a.c(196608, 479, null, null, null, null, c0698o, hVar, null, null, (p241y9.c) objH, false);
                    Object value = x9.getValue();
                    boolean zG = c0698o.g(cVar2);
                    Object objH2 = c0698o.H();
                    if (zG || objH2 == s10) {
                        objH2 = new B2.d(cVar2, x9, null, 4);
                        c0698o.e0(objH2);
                    }
                    C0672b.f(c0698o, value, (p241y9.e) objH2);
                } else {
                    c0698o.N();
                }
                break;
            case 1:
                A a9 = (A) this.f3370t;
                L0 l10 = (L0) this.f3371u;
                String[] strArr = (String[]) this.f3372v;
                List list = (List) this.f3373w;
                NumberFormat numberFormat2 = (NumberFormat) this.f3369s;
                p241y9.e eVar = (p241y9.e) this.f3374x;
                p241y9.e eVar2 = (p241y9.e) this.f3375y;
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    I iD = AbstractC0071n.d(l0.c.f19313r, false);
                    int i10 = c0698o2.f10721P;
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
                    C0672b.v(c0698o2, iD, C0287j.f4119f);
                    C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i10))) {
                        p123m2.c.y(i10, c0698o2, i10, c0285h);
                    }
                    C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                    boolean zG2 = c0698o2.g(l10) | c0698o2.i(strArr) | c0698o2.i(list) | c0698o2.i(numberFormat2) | c0698o2.g(eVar) | c0698o2.g(eVar2);
                    Object objH3 = c0698o2.H();
                    if (zG2 || objH3 == C0690k.f10683a) {
                        f fVar2 = new f(l10, strArr, list, numberFormat2, eVar, eVar2, 1);
                        c0698o2.e0(fVar2);
                        objH3 = fVar2;
                    }
                    B9.a.c(0, 509, null, null, null, a9, c0698o2, null, null, null, (p241y9.c) objH3, false);
                    p050e8.b.g(a9, androidx.compose.foundation.layout.a.f11825a.a(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.n(oVar, 8), 1.0f), l0.c.f19315t), c0698o2, 0);
                    c0698o2.p(true);
                } else {
                    c0698o2.N();
                }
                break;
            default:
                r rVar = (r) this.f3370t;
                String str = (String) this.f3369s;
                final p047e5.g gVar = (p047e5.g) this.f3371u;
                final List list2 = (List) this.f3372v;
                final p241y9.f fVar3 = (p241y9.f) this.f3373w;
                final X x10 = (X) this.f3375y;
                final p241y9.f fVar4 = (p241y9.f) this.f3374x;
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float f3 = 10;
                    r rVarI = androidx.compose.foundation.layout.b.i(rVar.b(androidx.compose.foundation.layout.c.f11826a), f3, f3);
                    W wA = U.a(AbstractC0066i.f977a, l0.c.f19307B, c0698o3, 48);
                    int i11 = c0698o3.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o3.m();
                    r rVarC2 = l0.a.c(c0698o3, rVarI);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i2 = C0287j.f4115b;
                    c0698o3.X();
                    if (c0698o3.f10720O) {
                        c0698o3.l(c0286i2);
                    } else {
                        c0698o3.h0();
                    }
                    C0285h c0285h2 = C0287j.f4119f;
                    C0672b.v(c0698o3, wA, c0285h2);
                    C0285h c0285h3 = C0287j.f4118e;
                    C0672b.v(c0698o3, interfaceC0687i0M2, c0285h3);
                    C0285h c0285h4 = C0287j.g;
                    if (c0698o3.f10720O || !j.a(c0698o3.H(), Integer.valueOf(i11))) {
                        p123m2.c.y(i11, c0698o3, i11, c0285h4);
                    }
                    C0285h c0285h5 = C0287j.f4117d;
                    C0672b.v(c0698o3, rVarC2, c0285h5);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    j.d(upperCase, "toUpperCase(...)");
                    if (1.0f <= 0.0d) {
                        E.a.a("invalid weight; must be greater than zero");
                    }
                    boolean z11 = false;
                    AbstractC0542b2.b(upperCase, new LayoutWeightElement(1.0f, true), ((p005a4.a) c0698o3.k(p005a4.e.f11187a)).h(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, L.a(((G2) c0698o3.k(H2.f8580a)).f8567m, 0L, 0L, l.f10359t, null, 0L, 0L, null, 16777211), c0698o3, 0, 0, 65528);
                    C0698o c0698o4 = c0698o3;
                    if (gVar.f15812c) {
                        z10 = true;
                        c0698o4.T(1132425624);
                    } else {
                        c0698o4.T(1135351714);
                        I iD2 = AbstractC0071n.d(l0.c.f19313r, false);
                        int i12 = c0698o4.f10721P;
                        InterfaceC0687i0 interfaceC0687i0M3 = c0698o4.m();
                        o oVar2 = o.f19333a;
                        r rVarC3 = l0.a.c(c0698o4, oVar2);
                        c0698o4.X();
                        if (c0698o4.f10720O) {
                            c0698o4.l(c0286i2);
                        } else {
                            c0698o4.h0();
                        }
                        C0672b.v(c0698o4, iD2, c0285h2);
                        C0672b.v(c0698o4, interfaceC0687i0M3, c0285h3);
                        if (c0698o4.f10720O || !j.a(c0698o4.H(), Integer.valueOf(i12))) {
                            p123m2.c.y(i12, c0698o4, i12, c0285h4);
                        }
                        C0672b.v(c0698o4, rVarC3, c0285h5);
                        r rVarJ = androidx.compose.foundation.layout.c.j(oVar2, 36);
                        boolean zI2 = c0698o4.i(gVar) | c0698o4.i(list2) | c0698o4.g(fVar3);
                        Object objH4 = c0698o4.H();
                        S s11 = C0690k.f10683a;
                        if (zI2 || objH4 == s11) {
                            objH4 = new p006a5.c(gVar, list2, fVar3, x10);
                            c0698o4.e0(objH4);
                        }
                        V0.h((p241y9.a) objH4, rVarJ, false, null, p006a5.a.f11188a, c0698o4, 196656, 28);
                        boolean zBooleanValue = ((Boolean) x10.getValue()).booleanValue();
                        Object objH5 = c0698o4.H();
                        if (objH5 == s11) {
                            objH5 = new A4.h(x10, 11);
                            c0698o4.e0(objH5);
                        }
                        AbstractC0591q.a(zBooleanValue, (p241y9.a) objH5, null, 0L, null, null, null, 0L, 0.0f, 0.0f, p074h0.j.d(204890640, new p241y9.f() { // from class: a5.d
                            @Override // p241y9.f
                            public final Object d(Object obj3, Object obj4, Object obj5) {
                                Object cVar3;
                                C0698o c0698o5 = (C0698o) obj4;
                                int iIntValue4 = ((Integer) obj5).intValue();
                                j.e((C0077u) obj3, "$this$DropdownMenu");
                                if (c0698o5.K(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    List list3 = list2;
                                    boolean zI3 = c0698o5.i(list3);
                                    g gVar2 = gVar;
                                    boolean zI4 = zI3 | c0698o5.i(gVar2);
                                    f fVar5 = fVar3;
                                    boolean zG3 = zI4 | c0698o5.g(fVar5);
                                    Object objH6 = c0698o5.H();
                                    X x11 = x10;
                                    S s12 = C0690k.f10683a;
                                    if (zG3 || objH6 == s12) {
                                        cVar3 = new c(list3, fVar5, gVar2, x11, 1);
                                        c0698o5.e0(cVar3);
                                    } else {
                                        cVar3 = objH6;
                                    }
                                    AbstractC0591q.b(a.f11189b, (a) cVar3, null, null, false, null, null, c0698o5, 6, 508);
                                    boolean zI5 = c0698o5.i(list3) | c0698o5.i(gVar2);
                                    f fVar6 = fVar4;
                                    boolean zG4 = zI5 | c0698o5.g(fVar6);
                                    Object objH7 = c0698o5.H();
                                    if (zG4 || objH7 == s12) {
                                        c cVar4 = new c(list3, fVar6, gVar2, x11, 2);
                                        c0698o5.e0(cVar4);
                                        objH7 = cVar4;
                                    }
                                    AbstractC0591q.b(a.f11190c, (a) objH7, null, null, false, null, null, c0698o5, 6, 508);
                                } else {
                                    c0698o5.N();
                                }
                                return y.f19095a;
                            }
                        }, c0698o4), c0698o4, 48);
                        c0698o4 = c0698o4;
                        z10 = true;
                        c0698o4.p(true);
                        z11 = false;
                    }
                    c0698o4.p(z11);
                    c0698o4.p(z10);
                } else {
                    c0698o3.N();
                }
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ e(A a9, X x9, String[] strArr, List list, NumberFormat numberFormat, p241y9.e eVar, p241y9.e eVar2) {
        this.f3370t = a9;
        this.f3371u = x9;
        this.f3372v = strArr;
        this.f3373w = list;
        this.f3369s = numberFormat;
        this.f3374x = eVar;
        this.f3375y = eVar2;
    }

    public /* synthetic */ e(r rVar, String str, p047e5.g gVar, List list, p241y9.f fVar, X x9, p241y9.f fVar2) {
        this.f3370t = rVar;
        this.f3369s = str;
        this.f3371u = gVar;
        this.f3372v = list;
        this.f3373w = fVar;
        this.f3375y = x9;
        this.f3374x = fVar2;
    }
}
