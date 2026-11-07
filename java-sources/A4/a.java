package A4;

import A.C0029l;
import D.AbstractC0060c;
import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0059b;
import D.C0076t;
import D.C0077u;
import D.M;
import D.Z;
import D.f0;
import D.h0;
import E4.t;
import E4.u;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K.V;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import O.U;
import U0.L;
import W.AbstractC0542b2;
import W.G2;
import W.H2;
import W.L1;
import W.P;
import W.P1;
import W.V0;
import W.W1;
import Z.C0672b;
import Z.C0675c0;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import Z.X;
import android.content.Context;
import com.ayah.R;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import io.realm.RealmFieldTypeConstants;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import l0.o;
import p110k9.y;
import p120l9.r;
import p162q0.p;
import p180s0.C1303l;
import p180s0.q;
import p232y.j0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f502u;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f499r = i10;
        this.f500s = obj;
        this.f501t = obj2;
        this.f502u = obj3;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f499r;
        int i11 = 5;
        o oVar = o.f19333a;
        S s10 = C0690k.f10683a;
        int i12 = 1;
        y yVar = y.f19095a;
        Object obj3 = this.f501t;
        Object obj4 = this.f502u;
        Object obj5 = this.f500s;
        switch (i10) {
            case 0:
                final AudioConfigWrapper audioConfigWrapper = (AudioConfigWrapper) obj5;
                final NumberFormat numberFormat = (NumberFormat) obj3;
                final Context context = (Context) obj4;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = AudioConfigWrapper.f13759u;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    C4.i audioConfigPresenter = audioConfigWrapper.getAudioConfigPresenter();
                    final X xK = C0672b.k(new C4.g(new C4.e(false ? 1 : 0, new C4.c(audioConfigPresenter.f752a.f20301c, false ? 1 : 0)), audioConfigPresenter, false ? 1 : 0), r.f19440r, null, c0698o, 48, 2);
                    final P p10 = V0.p(V0.q(390, 2, c0698o), c0698o, 2);
                    Object objH = c0698o.H();
                    if (objH == s10) {
                        objH = C0672b.r(B4.b.f618r);
                        c0698o.e0(objH);
                    }
                    final X x9 = (X) objH;
                    p005a4.e.a(false, p074h0.j.d(1772250120, new p241y9.e() { // from class: A4.b
                        @Override // p241y9.e
                        public final Object invoke(Object obj6, Object obj7) {
                            C0698o c0698o2 = (C0698o) obj6;
                            int iIntValue2 = ((Integer) obj7).intValue();
                            int i14 = AudioConfigWrapper.f13759u;
                            int i15 = 0;
                            if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                WeakHashMap weakHashMap = f0.f955u;
                                l0.r rVarA = h0.a(o.f19333a, new M(new Z(new Z(C0059b.f(c0698o2).g, C0059b.f(c0698o2).f960e), C0059b.f(c0698o2).f957b), 16 | AbstractC0060c.g));
                                I iD = AbstractC0071n.d(l0.c.f19313r, false);
                                int i16 = c0698o2.f10721P;
                                InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                                l0.r rVarC = l0.a.c(c0698o2, rVarA);
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
                                if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i16))) {
                                    p123m2.c.y(i16, c0698o2, i16, c0285h);
                                }
                                C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                                long jD = ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).d();
                                p074h0.d dVarD = p074h0.j.d(-1430495789, new c(xK, x9, audioConfigWrapper, numberFormat, 0), c0698o2);
                                P p11 = p10;
                                V0.b(dVarD, null, p11, 0, 0.0f, null, jD, 0L, 0.0f, 0.0f, null, false, null, 0L, 0L, p074h0.j.d(-448454979, new d(i15, p11, context), c0698o2), c0698o2, 3078, 64434);
                                c0698o2.p(true);
                            } else {
                                c0698o2.N();
                            }
                            return y.f19095a;
                        }
                    }, c0698o), c0698o, 48);
                }
                break;
            case 1:
                X x10 = (X) obj5;
                p241y9.c cVar = (p241y9.c) obj3;
                C0675c0 c0675c0 = (C0675c0) obj4;
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    String str = (String) x10.getValue();
                    V v10 = V.f4547e;
                    V v11 = new V(v10.f4548a, v10.f4549b, 3, v10.f4551d);
                    P1 p11 = P1.f8759a;
                    M0 m10 = p005a4.e.f11187a;
                    L1 l1C = P1.c(((p005a4.a) c0698o2.k(m10)).l(), ((p005a4.a) c0698o2.k(m10)).b(), ((p005a4.a) c0698o2.k(m10)).l(), ((p005a4.a) c0698o2.k(m10)).l(), 0L, c0698o2, 2147481326);
                    l0.r rVarN = androidx.compose.foundation.layout.c.n(androidx.compose.foundation.layout.b.j(oVar, 4, 0.0f, 2), 52);
                    boolean zG = c0698o2.g(cVar);
                    Object objH2 = c0698o2.H();
                    if (zG || objH2 == s10) {
                        objH2 = new A3.e(i11, c0675c0, cVar);
                        c0698o2.e0(objH2);
                    }
                    W1.b(str, (p241y9.c) objH2, rVarN, false, null, null, v11, null, 0, 0, null, l1C, c0698o2, 384);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                H4.a.a((u) obj5, (l0.r) obj3, (p241y9.c) obj4, (C0698o) obj, C0672b.y(433));
                break;
            case 3:
                t tVar = (t) obj5;
                NumberFormat numberFormat2 = (NumberFormat) obj3;
                p241y9.c cVar2 = (p241y9.c) obj4;
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c0698o3.N();
                } else {
                    if (tVar != null) {
                        c0698o3.T(1948602287);
                        p124m3.j jVar = tVar.f1884a;
                        C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o3, 0);
                        int i14 = c0698o3.f10721P;
                        InterfaceC0687i0 interfaceC0687i0M = c0698o3.m();
                        l0.r rVarC = l0.a.c(c0698o3, oVar);
                        InterfaceC0288k.f4142a.getClass();
                        C0286i c0286i = C0287j.f4115b;
                        c0698o3.X();
                        if (c0698o3.f10720O) {
                            c0698o3.l(c0286i);
                        } else {
                            c0698o3.h0();
                        }
                        C0672b.v(c0698o3, c0076tA, C0287j.f4119f);
                        C0672b.v(c0698o3, interfaceC0687i0M, C0287j.f4118e);
                        C0285h c0285h = C0287j.g;
                        if (c0698o3.f10720O || !p251z9.j.a(c0698o3.H(), Integer.valueOf(i14))) {
                            p123m2.c.y(i14, c0698o3, i14, c0285h);
                        }
                        C0672b.v(c0698o3, rVarC, C0287j.f4117d);
                        String strM0 = p000a.a.m0(R.string.end_of_page, c0698o3);
                        String str2 = numberFormat2.format(Integer.valueOf(jVar.c()));
                        p251z9.j.d(str2, "format(...)");
                        String strN0 = p000a.a.n0(R.string.page, new Object[]{str2}, c0698o3);
                        boolean zG2 = c0698o3.g(cVar2) | c0698o3.i(jVar);
                        Object objH3 = c0698o3.H();
                        Object obj6 = objH3;
                        if (zG2 || objH3 == s10) {
                            D4.h hVar = new D4.h(i12, jVar, cVar2);
                            c0698o3.e0(hVar);
                            obj6 = hVar;
                        }
                        p015b4.f.g(strM0, strN0, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) obj6, 7), c0698o3, 0);
                        String strM1 = p000a.a.m0(R.string.end_of_sura, c0698o3);
                        String strB = jVar.f19596n.b();
                        boolean zG3 = c0698o3.g(cVar2) | c0698o3.i(jVar);
                        Object objH4 = c0698o3.H();
                        Object obj7 = objH4;
                        if (zG3 || objH4 == s10) {
                            D4.h hVar2 = new D4.h(2, jVar, cVar2);
                            c0698o3.e0(hVar2);
                            obj7 = hVar2;
                        }
                        p015b4.f.g(strM1, strB, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) obj7, 7), c0698o3, 0);
                        String strM2 = p000a.a.m0(R.string.continuous_playback, c0698o3);
                        String strM3 = p000a.a.m0(R.string.infinity, c0698o3);
                        boolean zG4 = c0698o3.g(cVar2) | c0698o3.i(jVar);
                        Object objH5 = c0698o3.H();
                        Object obj8 = objH5;
                        if (zG4 || objH5 == s10) {
                            D4.h hVar3 = new D4.h(3, jVar, cVar2);
                            c0698o3.e0(hVar3);
                            obj8 = hVar3;
                        }
                        p015b4.f.g(strM2, strM3, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) obj8, 7), c0698o3, 0);
                        c0698o3.p(true);
                    } else {
                        c0698o3.T(1946036231);
                    }
                    c0698o3.p(false);
                }
                break;
            case 4:
                p pVar = (p) obj5;
                M3.a aVar = (M3.a) obj3;
                X x11 = (X) obj4;
                C0698o c0698o4 = (C0698o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!c0698o4.K(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c0698o4.N();
                } else {
                    C0076t c0076tA2 = D.r.a(AbstractC0066i.f979c, l0.c.f19310E, c0698o4, 48);
                    int i15 = c0698o4.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o4.m();
                    l0.r rVarC2 = l0.a.c(c0698o4, oVar);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i2 = C0287j.f4115b;
                    c0698o4.X();
                    if (c0698o4.f10720O) {
                        c0698o4.l(c0286i2);
                    } else {
                        c0698o4.h0();
                    }
                    C0672b.v(c0698o4, c0076tA2, C0287j.f4119f);
                    C0672b.v(c0698o4, interfaceC0687i0M2, C0287j.f4118e);
                    C0285h c0285h2 = C0287j.g;
                    if (c0698o4.f10720O || !p251z9.j.a(c0698o4.H(), Integer.valueOf(i15))) {
                        p123m2.c.y(i15, c0698o4, i15, c0285h2);
                    }
                    C0672b.v(c0698o4, rVarC2, C0287j.f4117d);
                    String strM4 = p000a.a.m0(R.string.bookmark_name, c0698o4);
                    L l10 = ((G2) c0698o4.k(H2.f8580a)).f8563h;
                    M0 m11 = p005a4.e.f11187a;
                    AbstractC0542b2.b(strM4, null, ((p005a4.a) c0698o4.k(m11)).m(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l10, c0698o4, 0, 0, 65530);
                    p181s2.o.b(F9.n.M(2131230844, c0698o4), p000a.a.m0(aVar.f5684u, c0698o4), androidx.compose.foundation.layout.b.h(oVar, 16), null, null, 0.0f, new C1303l(B9.a.j(aVar.f5681r, c0698o4), 5), c0698o4, 384, 56);
                    C0672b.a(O.V.f6342a.a(new U(((p005a4.a) c0698o4.k(m11)).l(), q.b(((p005a4.a) c0698o4.k(m11)).l(), 0.7f))), p074h0.j.d(481872755, new I4.a(i12, x11, pVar), c0698o4), c0698o4, 56);
                    c0698o4.p(true);
                    Object objH6 = c0698o4.H();
                    if (objH6 == s10) {
                        objH6 = new D3.b(pVar, null, 2);
                        c0698o4.e0(objH6);
                    }
                    C0672b.f(c0698o4, pVar, (p241y9.e) objH6);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                X4.a.f((p241y9.a) obj5, (p095j3.c) obj3, (p241y9.e) obj4, (C0698o) obj, C0672b.y(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                X5.a.d((p124m3.j) obj5, (l0.r) obj4, (NumberFormat) obj3, (C0698o) obj, C0672b.y(1));
                break;
            case 7:
                p095j3.c cVar3 = (p095j3.c) obj;
                int i16 = KhatmahWrapper.f13794v;
                p251z9.j.e(cVar3, "plan");
                AbstractC0405x.x((InterfaceC0402u) obj5, null, new C0029l((KhatmahWrapper) obj3, cVar3, (p095j3.b) obj2, (p241y9.c) obj4, null, 7), 3);
                break;
            case 8:
                ((Integer) obj2).getClass();
                p006a5.a.a((p047e5.b) obj5, (p241y9.c) obj3, (l0.r) obj4, (C0698o) obj, C0672b.y(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                p006a5.a.b((p047e5.c) obj5, (p106k4.a) obj3, (l0.r) obj4, (C0698o) obj, C0672b.y(385));
                break;
            case 10:
                ((Integer) obj2).getClass();
                p006a5.a.c((p047e5.d) obj5, (p106k4.a) obj3, (l0.r) obj4, (C0698o) obj, C0672b.y(385));
                break;
            case 11:
                ((Integer) obj2).getClass();
                p006a5.a.e((p047e5.f) obj5, (p241y9.c) obj3, (l0.r) obj4, (C0698o) obj, C0672b.y(385));
                break;
            case 12:
                ((Integer) obj2).getClass();
                p006a5.a.g((p047e5.h) obj5, (p106k4.a) obj3, (l0.r) obj4, (C0698o) obj, C0672b.y(385));
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                ((Integer) obj2).getClass();
                p181s2.r.a((p173r2.j) obj5, (p085i0.c) obj3, (p074h0.d) obj4, (C0698o) obj, C0672b.y(385));
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                AbstractC0405x.x((InterfaceC0402u) obj5, null, new V.l(fFloatValue, (p223x.X) obj3, (p173r2.j) obj4, (p150o9.c) null), 3);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                l0.r rVar = (l0.r) obj5;
                j0 j0Var = (j0) obj3;
                p074h0.d dVar = (p074h0.d) obj4;
                C0698o c0698o5 = (C0698o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!c0698o5.K(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c0698o5.N();
                } else {
                    l0.r rVarE = p181s2.r.e(androidx.compose.foundation.layout.b.m(androidx.compose.foundation.layout.b.j(rVar, 0.0f, p200u5.b.f22949a, 1), D.I.f891s), j0Var);
                    C0076t c0076tA3 = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o5, 0);
                    int i17 = c0698o5.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M3 = c0698o5.m();
                    l0.r rVarC3 = l0.a.c(c0698o5, rVarE);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i3 = C0287j.f4115b;
                    c0698o5.X();
                    if (c0698o5.f10720O) {
                        c0698o5.l(c0286i3);
                    } else {
                        c0698o5.h0();
                    }
                    C0672b.v(c0698o5, c0076tA3, C0287j.f4119f);
                    C0672b.v(c0698o5, interfaceC0687i0M3, C0287j.f4118e);
                    C0285h c0285h3 = C0287j.g;
                    if (c0698o5.f10720O || !p251z9.j.a(c0698o5.H(), Integer.valueOf(i17))) {
                        p123m2.c.y(i17, c0698o5, i17, c0285h3);
                    }
                    C0672b.v(c0698o5, rVarC3, C0287j.f4117d);
                    dVar.d(C0077u.f1028a, c0698o5, 6);
                    c0698o5.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                p229x5.a.a((p210v5.a) obj5, (l0.r) obj4, (NumberFormat) obj3, (C0698o) obj, C0672b.y(1));
                break;
        }
        return yVar;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f499r = i11;
        this.f500s = obj;
        this.f501t = obj2;
        this.f502u = obj3;
    }

    public /* synthetic */ a(Object obj, l0.r rVar, NumberFormat numberFormat, int i10, int i11) {
        this.f499r = i11;
        this.f500s = obj;
        this.f502u = rVar;
        this.f501t = numberFormat;
    }
}
