package A4;

import D.AbstractC0060c;
import D.AbstractC0066i;
import D.C0076t;
import D.C0077u;
import D.U;
import D.W;
import F.C0153b;
import F2.t;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import W.AbstractC0542b2;
import W.C0;
import W.C0569i1;
import W.C0578l1;
import W.C0604u1;
import W.EnumC0565h1;
import W.G2;
import W.H2;
import W.P;
import W.W0;
import W.X0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import Z.X;
import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.ayah.R;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import java.io.IOException;
import java.text.NumberFormat;
import l0.o;
import l0.r;
import org.xmlpull.v1.XmlPullParserException;
import p110k9.y;
import p180s0.F;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f516t;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f514r = i10;
        this.f515s = obj;
        this.f516t = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        int i10 = this.f514r;
        S s10 = C0690k.f10683a;
        y yVar = y.f19095a;
        Object obj4 = this.f516t;
        Object obj5 = this.f515s;
        Object[] objArr = 0;
        switch (i10) {
            case 0:
                P p10 = (P) obj5;
                Context context = (Context) obj4;
                C0698o c0698o = (C0698o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i11 = AudioConfigWrapper.f13759u;
                p251z9.j.e((D.P) obj, "it");
                if (c0698o.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objH = c0698o.H();
                    if (objH == s10) {
                        objH = C0672b.m(c0698o);
                        c0698o.e0(objH);
                    }
                    InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH;
                    Object objH2 = c0698o.H();
                    if (objH2 == s10) {
                        objH2 = C0672b.r(Boolean.FALSE);
                        c0698o.e0(objH2);
                    }
                    X x9 = (X) objH2;
                    boolean zG = c0698o.g(p10);
                    Object objH3 = c0698o.H();
                    p150o9.c cVar = null;
                    if (zG || objH3 == s10) {
                        objH3 = new j(p10, x9, null, 0);
                        c0698o.e0(objH3);
                    }
                    C0672b.f(c0698o, yVar, (p241y9.e) objH3);
                    if (((Boolean) x9.getValue()).booleanValue() && p10.f8750a.b() == EnumC0565h1.f9160t) {
                        c0698o.T(1721460054);
                        boolean zI = c0698o.i(interfaceC0402u) | c0698o.g(p10) | c0698o.i(context);
                        Object objH4 = c0698o.H();
                        if (zI || objH4 == s10) {
                            l lVar = new l(interfaceC0402u, context, p10, cVar, 0);
                            c0698o.e0(lVar);
                            objH4 = lVar;
                        }
                        C0672b.f(c0698o, yVar, (p241y9.e) objH4);
                    } else {
                        c0698o.T(1715700037);
                    }
                    c0698o.p(false);
                    boolean zI2 = c0698o.i(context);
                    Object objH5 = c0698o.H();
                    if (zI2 || objH5 == s10) {
                        objH5 = new i(context, objArr == true ? 1 : 0);
                        c0698o.e0(objH5);
                    }
                    C0672b.d(yVar, (p241y9.c) objH5, c0698o);
                } else {
                    c0698o.N();
                }
                return yVar;
            case 1:
                AyahMenuWrapper ayahMenuWrapper = (AyahMenuWrapper) obj5;
                InterfaceC0402u interfaceC0402u2 = (InterfaceC0402u) obj4;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i12 = AyahMenuWrapper.f13763v;
                p251z9.j.e((C0077u) obj, "$this$BottomSheetScaffold");
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    F4.d presenter = ayahMenuWrapper.getPresenter();
                    p124m3.j jVar = ayahMenuWrapper.f13764t;
                    presenter.getClass();
                    p251z9.j.e(jVar, "verseDao");
                    N9.P p11 = new N9.P(new InterfaceC0415h[]{presenter.f2376b.f22894b, presenter.f2379e.f22587b, presenter.f2378d.f22896b}, new F4.b(jVar, presenter, null));
                    O3.d dVar = ayahMenuWrapper.getPresenter().f2381h;
                    C4.e eVar = new C4.e(10, new C4.e(9, new C4.g(dVar.f6469a.f22892c, dVar, 8)));
                    NumberFormat numberFormat = p125m4.b.f19615b;
                    p251z9.j.d(numberFormat, "getNumberFormatter(...)");
                    C4.c cVar2 = ayahMenuWrapper.getPresenter().f2389q;
                    F4.d presenter2 = ayahMenuWrapper.getPresenter();
                    presenter2.getClass();
                    E4.a aVar = new E4.a(jVar.f19585a, jVar.f19595m, jVar.f19586b, jVar.c(), jVar.f19596n.f19537m, false, false, false, F4.d.a((p077h3.e) presenter2.f2382i.f22928e.getValue()));
                    r rVarA = androidx.compose.foundation.a.a(o.f19333a, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).d(), F.f21774a);
                    boolean zI3 = c0698o2.i(ayahMenuWrapper);
                    Object objH6 = c0698o2.H();
                    if (zI3 || objH6 == s10) {
                        objH6 = new E5.a(5, ayahMenuWrapper);
                        c0698o2.e0(objH6);
                    }
                    p241y9.c cVar3 = (p241y9.c) objH6;
                    boolean zI4 = c0698o2.i(interfaceC0402u2) | c0698o2.i(ayahMenuWrapper);
                    Object objH7 = c0698o2.H();
                    if (zI4 || objH7 == s10) {
                        objH7 = new A3.e(8, interfaceC0402u2, ayahMenuWrapper);
                        c0698o2.e0(objH7);
                    }
                    G4.n.a(p11, eVar, cVar2, aVar, cVar3, (p241y9.c) objH7, rVarA, numberFormat, c0698o2, 0);
                } else {
                    c0698o2.N();
                }
                return yVar;
            case 2:
                p241y9.c cVar4 = (p241y9.c) obj5;
                N3.b bVar = (N3.b) obj4;
                C0698o c0698o3 = (C0698o) obj2;
                ((Integer) obj3).getClass();
                p251z9.j.e((p214w.r) obj, "$this$AnimatedVisibility");
                p215w0.b bVarM = F9.n.M(2131230930, c0698o3);
                long j = B9.a.j(R.color.red_bookmark, c0698o3);
                Object objH8 = c0698o3.H();
                if (objH8 == s10) {
                    objH8 = new B.j();
                    c0698o3.e0(objH8);
                }
                B.j jVar2 = (B.j) objH8;
                X0 x0B = W0.b(24);
                R0.g gVar = new R0.g(0);
                boolean zG2 = c0698o3.g(cVar4) | c0698o3.g(bVar);
                Object objH9 = c0698o3.H();
                if (zG2 || objH9 == s10) {
                    objH9 = new G4.f(7, cVar4, bVar);
                    c0698o3.e0(objH9);
                }
                C0.a(bVarM, null, androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.b(o.f19333a, jVar2, x0B, false, gVar, (p241y9.a) objH9, 12), 16), j, c0698o3, 48, 0);
                return yVar;
            case 3:
                NumberFormat numberFormat2 = (NumberFormat) obj5;
                p095j3.a aVar2 = (p095j3.a) obj4;
                C0698o c0698o4 = (C0698o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                p251z9.j.e((D.X) obj, "$this$Button");
                if (c0698o4.K(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    r rVarJ = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.f11826a, 0.0f, 8, 1);
                    W wA = U.a(AbstractC0066i.f977a, l0.c.f19306A, c0698o4, 0);
                    int i13 = c0698o4.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o4.m();
                    r rVarC = l0.a.c(c0698o4, rVarJ);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o4.X();
                    if (c0698o4.f10720O) {
                        c0698o4.l(c0286i);
                    } else {
                        c0698o4.h0();
                    }
                    C0672b.v(c0698o4, wA, C0287j.f4119f);
                    C0672b.v(c0698o4, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o4.f10720O || !p251z9.j.a(c0698o4.H(), Integer.valueOf(i13))) {
                        p123m2.c.y(i13, c0698o4, i13, c0285h);
                    }
                    C0672b.v(c0698o4, rVarC, C0287j.f4117d);
                    String strM0 = p000a.a.m0(R.string.all_days, c0698o4);
                    M0 m10 = p005a4.e.f11187a;
                    AbstractC0542b2.b(strM0, null, ((p005a4.a) c0698o4.k(m10)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o4, 0, 0, 131066);
                    if (1.0f <= 0.0d) {
                        E.a.a("invalid weight; must be greater than zero");
                    }
                    AbstractC0060c.a(c0698o4, new LayoutWeightElement(1.0f, true));
                    String str = numberFormat2.format(Integer.valueOf(aVar2.f18751a.b()));
                    p251z9.j.d(str, "format(...)");
                    AbstractC0542b2.b(str, null, ((p005a4.a) c0698o4.k(m10)).j(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o4, 0, 0, 131066);
                    c0698o4.p(true);
                } else {
                    c0698o4.N();
                }
                return yVar;
            case 4:
                V5.a aVar3 = (V5.a) obj5;
                p241y9.e eVar2 = (p241y9.e) obj4;
                C0698o c0698o5 = (C0698o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                p251z9.j.e((C0153b) obj, "$this$item");
                if (c0698o5.K(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    X5.a.a(aVar3, eVar2, c0698o5, 0);
                } else {
                    c0698o5.N();
                }
                return yVar;
            case 5:
                p048e6.b bVar2 = (p048e6.b) obj5;
                p241y9.c cVar5 = (p241y9.c) obj4;
                C0698o c0698o6 = (C0698o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                p251z9.j.e((C0077u) obj, "$this$Card");
                if (c0698o6.K(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o6, 0);
                    int i14 = c0698o6.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o6.m();
                    o oVar = o.f19333a;
                    r rVarC2 = l0.a.c(c0698o6, oVar);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i2 = C0287j.f4115b;
                    c0698o6.X();
                    if (c0698o6.f10720O) {
                        c0698o6.l(c0286i2);
                    } else {
                        c0698o6.h0();
                    }
                    C0672b.v(c0698o6, c0076tA, C0287j.f4119f);
                    C0672b.v(c0698o6, interfaceC0687i0M2, C0287j.f4118e);
                    C0285h c0285h2 = C0287j.g;
                    if (c0698o6.f10720O || !p251z9.j.a(c0698o6.H(), Integer.valueOf(i14))) {
                        p123m2.c.y(i14, c0698o6, i14, c0285h2);
                    }
                    C0672b.v(c0698o6, rVarC2, C0287j.f4117d);
                    float f3 = 15;
                    AbstractC0060c.a(c0698o6, androidx.compose.foundation.layout.b.l(oVar, 0.0f, f3, 0.0f, 0.0f, 13));
                    c0698o6.T(-41753011);
                    for (p048e6.e eVar3 : bVar2.f15826a) {
                        if (eVar3 instanceof p048e6.c) {
                            c0698o6.T(-1911990562);
                            p068g6.b.e(((p048e6.c) eVar3).f15827a, c0698o6, 0);
                            c0698o6.p(false);
                        } else {
                            if (!(eVar3 instanceof p048e6.d)) {
                                c0698o6.T(-1912002468);
                                c0698o6.p(false);
                                throw new A6.a();
                            }
                            c0698o6.T(857942821);
                            p068g6.b.g(androidx.compose.foundation.layout.b.l(oVar, 0.0f, 8, 0.0f, 0.0f, 13), c0698o6, 6);
                            p068g6.b.f(((p048e6.d) eVar3).f15828a, cVar5, c0698o6, 0);
                            c0698o6.p(false);
                        }
                    }
                    c0698o6.p(false);
                    AbstractC0060c.a(c0698o6, androidx.compose.foundation.layout.b.l(oVar, 0.0f, 0.0f, 0.0f, f3, 7));
                    c0698o6.p(true);
                } else {
                    c0698o6.N();
                }
                return yVar;
            case 6:
                p136n5.d dVar2 = (p136n5.d) obj5;
                p136n5.e eVar4 = (p136n5.e) obj4;
                C0698o c0698o7 = (C0698o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                p251z9.j.e((C0077u) obj, "$this$Card");
                if (!c0698o7.K(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    c0698o7.N();
                } else if (dVar2 instanceof p136n5.b) {
                    c0698o7.T(-87352934);
                    String strA = ((p136n5.b) dVar2).f20012a.a();
                    boolean zI5 = c0698o7.i(eVar4);
                    Object objH10 = c0698o7.H();
                    if (zI5 || objH10 == s10) {
                        t tVar = new t(0, eVar4, p136n5.e.class, "onReciterPressed", "onReciterPressed()V", 0, 0, 15);
                        c0698o7.e0(tVar);
                        objH10 = tVar;
                    }
                    p241y9.a aVar4 = (p241y9.a) ((p251z9.h) objH10);
                    boolean zI6 = c0698o7.i(eVar4);
                    Object objH11 = c0698o7.H();
                    if (zI6 || objH11 == s10) {
                        t tVar2 = new t(0, eVar4, p136n5.e.class, "onStartPlaybackPressed", "onStartPlaybackPressed()V", 0, 0, 16);
                        c0698o7.e0(tVar2);
                        objH11 = tVar2;
                    }
                    p157p5.c.d(strA, aVar4, (p241y9.a) ((p251z9.h) objH11), c0698o7, 0);
                    c0698o7.p(false);
                } else {
                    if (!(dVar2 instanceof p136n5.a) && !(dVar2 instanceof p136n5.c)) {
                        c0698o7.T(689916860);
                        c0698o7.p(false);
                        throw new A6.a();
                    }
                    c0698o7.T(-87053629);
                    p157p5.c.f(dVar2, eVar4, c0698o7, 0);
                    c0698o7.p(false);
                }
                return yVar;
            case 7:
                p124m3.j jVar3 = (p124m3.j) obj5;
                p241y9.c cVar6 = (p241y9.c) obj4;
                C0698o c0698o8 = (C0698o) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                p251z9.j.e((C0077u) obj, "$this$Card");
                if (c0698o8.K(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    l0.h hVar = l0.c.f19310E;
                    r rVarJ2 = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.f11826a, 0.0f, 8, 1);
                    C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, hVar, c0698o8, 48);
                    int i15 = c0698o8.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M3 = c0698o8.m();
                    r rVarC3 = l0.a.c(c0698o8, rVarJ2);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i3 = C0287j.f4115b;
                    c0698o8.X();
                    if (c0698o8.f10720O) {
                        c0698o8.l(c0286i3);
                    } else {
                        c0698o8.h0();
                    }
                    C0672b.v(c0698o8, c0076tA2, C0287j.f4119f);
                    C0672b.v(c0698o8, interfaceC0687i0M3, C0287j.f4118e);
                    C0285h c0285h3 = C0287j.g;
                    if (c0698o8.f10720O || !p251z9.j.a(c0698o8.H(), Integer.valueOf(i15))) {
                        p123m2.c.y(i15, c0698o8, i15, c0285h3);
                    }
                    C0672b.v(c0698o8, rVarC3, C0287j.f4117d);
                    String strB = jVar3.f19596n.b();
                    M0 m11 = p005a4.e.f11187a;
                    long jM = ((p005a4.a) c0698o8.k(m11)).m();
                    M0 m12 = H2.f8580a;
                    AbstractC0542b2.b(strB, null, jM, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o8.k(m12)).g, c0698o8, 0, 0, 65530);
                    AbstractC0542b2.b(p000a.a.n0(R.string.page, new Object[]{cVar6.e(Integer.valueOf(jVar3.c()))}, c0698o8), null, ((p005a4.a) c0698o8.k(m11)).m(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o8.k(m12)).f8564i, c0698o8, 0, 0, 65530);
                    c0698o8.p(true);
                } else {
                    c0698o8.N();
                }
                return yVar;
            case 8:
                B.j jVar4 = (B.j) obj5;
                C0569i1 c0569i1 = (C0569i1) obj4;
                C0698o c0698o9 = (C0698o) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                p251z9.j.e((C0604u1) obj, "it");
                if (c0698o9.K(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    C0578l1.f9234a.a(jVar4, null, c0569i1, false, u0.b(40, 20), c0698o9, 221190, 10);
                } else {
                    c0698o9.N();
                }
                return yVar;
            default:
                p210v5.b bVar3 = (p210v5.b) obj5;
                p241y9.e eVar5 = (p241y9.e) obj4;
                C0698o c0698o10 = (C0698o) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                p251z9.j.e((C0153b) obj, "$this$item");
                if (c0698o10.K(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p229x5.a.b(bVar3, eVar5, c0698o10, 0);
                } else {
                    c0698o10.N();
                }
                return yVar;
        }
    }
}
