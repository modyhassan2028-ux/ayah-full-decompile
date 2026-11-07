package A;

import D.AbstractC0071n;
import J0.C0285h;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import W.C0557f1;
import W.C0615y0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import java.util.ArrayList;
import p223x.AbstractC1413d;
import p223x.AbstractC1434x;
import p223x.C1411c;
import p223x.C1422k;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f94r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f95s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f96t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i10, Object obj, Object obj2) {
        super(3);
        this.f94r = i10;
        this.f95s = obj;
        this.f96t = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v50, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r6v0, types: [y9.c, z9.k] */
    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) throws Throwable {
        C1411c c1411c;
        Object obj4;
        Typeface typeface;
        switch (this.f94r) {
            case 0:
                D0.v vVar = (D0.v) obj;
                D0.v vVar2 = (D0.v) obj2;
                long j = ((p171r0.c) obj3).f21387a;
                T t2 = (T) this.f95s;
                if (((Boolean) t2.f142I.e(vVar)).booleanValue()) {
                    if (!t2.f147N) {
                        if (t2.f145L == null) {
                            t2.f145L = p185s8.u0.a(Integer.MAX_VALUE, 6, null);
                        }
                        t2.f147N = true;
                        AbstractC0405x.x(t2.h0(), null, new S(t2, null), 3);
                    }
                    p017b7.g.H((E0.d) this.f96t, vVar);
                    long jG = p171r0.c.g(vVar2.f1134c, j);
                    M9.e eVar = t2.f145L;
                    if (eVar != null) {
                        eVar.k(new C0048v(jG));
                    }
                }
                return p110k9.y.f19095a;
            case 1:
                C0698o c0698o = (C0698o) obj2;
                ((Number) obj3).intValue();
                B.j jVar = (B.j) this.f96t;
                c0698o.T(-102778667);
                Object objH = c0698o.H();
                Z.S s10 = C0690k.f10683a;
                if (objH == s10) {
                    objH = C0672b.m(c0698o);
                    c0698o.e0(objH);
                }
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH;
                Object objH2 = c0698o.H();
                if (objH2 == s10) {
                    objH2 = C0672b.r(null);
                    c0698o.e0(objH2);
                }
                Z.X x9 = (Z.X) objH2;
                Z.X xU = C0672b.u((p241y9.c) this.f95s, c0698o);
                boolean zG = c0698o.g(jVar);
                Object objH3 = c0698o.H();
                if (zG || objH3 == s10) {
                    objH3 = new C0007a(12, x9, jVar);
                    c0698o.e0(objH3);
                }
                C0672b.d(jVar, (p241y9.c) objH3, c0698o);
                boolean zI = c0698o.i(interfaceC0402u) | c0698o.g(jVar) | c0698o.g(xU);
                Object objH4 = c0698o.H();
                if (zI || objH4 == s10) {
                    objH4 = new K.m0(interfaceC0402u, x9, jVar, xU);
                    c0698o.e0(objH4);
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(jVar, null, (PointerInputEventHandler) objH4, 6);
                c0698o.p(false);
                return suspendPointerInputElement;
            case 2:
                C0698o c0698o2 = (C0698o) obj2;
                ((Number) obj3).intValue();
                c0698o2.T(759876635);
                p241y9.a aVar = (p241y9.a) this.f95s;
                Object objH5 = c0698o2.H();
                Z.S s11 = C0690k.f10683a;
                if (objH5 == s11) {
                    objH5 = C0672b.o(aVar);
                    c0698o2.e0(objH5);
                }
                Z.L0 l10 = (Z.L0) objH5;
                Object objH6 = c0698o2.H();
                if (objH6 == s11) {
                    objH6 = new C1411c(new p171r0.c(((p171r0.c) l10.getValue()).f21387a), O.B.f6274b, new p171r0.c(O.B.f6275c), 8);
                    c0698o2.e0(objH6);
                }
                C1411c c1411c2 = (C1411c) objH6;
                boolean zI2 = c0698o2.i(c1411c2);
                Object objH7 = c0698o2.H();
                if (zI2 || objH7 == s11) {
                    objH7 = new C0039q(l10, c1411c2, (p150o9.c) null, 16);
                    c0698o2.e0(objH7);
                }
                C0672b.f(c0698o2, p110k9.y.f19095a, (p241y9.e) objH7);
                C1422k c1422k = c1411c2.f23943c;
                p241y9.c cVar = (p241y9.c) this.f96t;
                boolean zG2 = c0698o2.g(c1422k);
                Object objH8 = c0698o2.H();
                if (zG2 || objH8 == s11) {
                    objH8 = new O.A(c1422k, 0);
                    c0698o2.e0(objH8);
                }
                l0.r rVar = (l0.r) cVar.e((p241y9.a) objH8);
                c0698o2.p(false);
                return rVar;
            case 3:
                p241y9.e eVar2 = (p241y9.e) obj;
                C0698o c0698o3 = (C0698o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                Object obj5 = (C0615y0) this.f96t;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0698o3.i(eVar2) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0698o3.x()) {
                    c0698o3.N();
                } else {
                    ArrayList arrayList = (ArrayList) this.f95s;
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj6 = arrayList.get(i10);
                        if (obj6 != null) {
                            arrayList2.add(obj6);
                        }
                    }
                    int i11 = arrayList2.size() != 1 ? 75 : 0;
                    Object u0Var = new p223x.u0(150, i11, AbstractC1434x.f24124d);
                    p150o9.c cVar2 = null;
                    boolean zG3 = c0698o3.g(null) | c0698o3.i(obj5);
                    Object objH9 = c0698o3.H();
                    Object obj7 = C0690k.f10683a;
                    if (zG3 || objH9 == obj7) {
                        objH9 = new C0557f1(2, obj5);
                        c0698o3.e0(objH9);
                    }
                    Object obj8 = (p241y9.a) objH9;
                    Object objH10 = c0698o3.H();
                    if (objH10 == obj7) {
                        objH10 = AbstractC1413d.a(0.0f);
                        c0698o3.e0(objH10);
                    }
                    C1411c c1411c3 = (C1411c) objH10;
                    Boolean bool = Boolean.TRUE;
                    boolean zI3 = c0698o3.i(c1411c3) | c0698o3.h(true) | c0698o3.i(u0Var) | c0698o3.g(obj8);
                    Object objH11 = c0698o3.H();
                    if (zI3 || objH11 == obj7) {
                        c1411c = c1411c3;
                        obj4 = obj7;
                        Object c0039q = new C0039q(c1411c, u0Var, obj8, cVar2, 27);
                        c0698o3.e0(c0039q);
                        objH11 = c0039q;
                    } else {
                        c1411c = c1411c3;
                        obj4 = obj7;
                    }
                    C0672b.f(c0698o3, bool, (p241y9.e) objH11);
                    C1422k c1422k2 = c1411c.f23943c;
                    Object u0Var2 = new p223x.u0(150, i11, AbstractC1434x.f24121a);
                    Object objH12 = c0698o3.H();
                    if (objH12 == obj4) {
                        objH12 = AbstractC1413d.a(0.8f);
                        c0698o3.e0(objH12);
                    }
                    C1411c c1411c4 = (C1411c) objH12;
                    boolean zI4 = c0698o3.i(c1411c4) | c0698o3.h(true) | c0698o3.i(u0Var2);
                    Object objH13 = c0698o3.H();
                    if (zI4 || objH13 == obj4) {
                        objH13 = new O9.y(c1411c4, u0Var2, cVar2, 14);
                        c0698o3.e0(objH13);
                    }
                    C0672b.f(c0698o3, bool, (p241y9.e) objH13);
                    C1422k c1422k3 = c1411c4.f23943c;
                    l0.r rVarB = androidx.compose.ui.graphics.a.b(l0.o.f19333a, ((Number) c1422k3.f24028s.getValue()).floatValue(), ((Number) c1422k3.f24028s.getValue()).floatValue(), ((Number) c1422k2.f24028s.getValue()).floatValue(), 0.0f, 0.0f, null, false, 131064);
                    boolean zG4 = c0698o3.g(null);
                    Object objH14 = c0698o3.H();
                    if (zG4 || objH14 == obj4) {
                        objH14 = new W.O(1, 9);
                        c0698o3.e0(objH14);
                    }
                    l0.r rVarA = R0.m.a(rVarB, false, (p241y9.c) objH14);
                    H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
                    int i12 = c0698o3.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o3.m();
                    l0.r rVarC = l0.a.c(c0698o3, rVarA);
                    InterfaceC0288k.f4142a.getClass();
                    p241y9.a aVar2 = C0287j.f4115b;
                    c0698o3.X();
                    if (c0698o3.f10720O) {
                        c0698o3.l(aVar2);
                    } else {
                        c0698o3.h0();
                    }
                    C0672b.v(c0698o3, iD, C0287j.f4119f);
                    C0672b.v(c0698o3, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o3.f10720O || !p251z9.j.a(c0698o3.H(), Integer.valueOf(i12))) {
                        p123m2.c.y(i12, c0698o3, i12, c0285h);
                    }
                    C0672b.v(c0698o3, rVarC, C0287j.f4117d);
                    eVar2.invoke(c0698o3, Integer.valueOf(iIntValue & 14));
                    c0698o3.p(true);
                }
                return p110k9.y.f19095a;
            case 4:
                U0.C c10 = (U0.C) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                int iIntValue3 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) this.f95s;
                F.f fVar = (F.f) this.f96t;
                Y0.e eVar3 = c10.f7999f;
                Y0.l lVar = c10.f7996c;
                if (lVar == null) {
                    lVar = Y0.l.f10359t;
                }
                Y0.j jVar2 = c10.f7997d;
                int i13 = jVar2 != null ? jVar2.f10356a : 0;
                Y0.k kVar = c10.f7998e;
                int i14 = kVar != null ? kVar.f10357a : 65535;
                p022c1.c cVar3 = (p022c1.c) fVar.f2049s;
                Y0.t tVarB = ((Y0.f) cVar3.f13422e).b(eVar3, lVar, i13, i14);
                if (tVarB instanceof Y0.t) {
                    Object obj9 = tVarB.f10372r;
                    p251z9.j.c(obj9, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj9;
                } else {
                    android.support.v4.media.session.r rVar2 = new android.support.v4.media.session.r(tVarB, cVar3.j);
                    cVar3.j = rVar2;
                    Object obj10 = rVar2.f11366u;
                    p251z9.j.c(obj10, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj10;
                }
                spannable.setSpan(new X0.b(1, typeface), iIntValue2, iIntValue3, 33);
                return p110k9.y.f19095a;
            case 5:
                C0698o c0698o4 = (C0698o) obj2;
                ((Number) obj3).intValue();
                c0698o4.T(-353972293);
                p232y.K kA = ((p232y.J) this.f95s).a((B.j) this.f96t, c0698o4);
                boolean zG5 = c0698o4.g(kA);
                Object objH15 = c0698o4.H();
                if (zG5 || objH15 == C0690k.f10683a) {
                    objH15 = new p232y.M(kA);
                    c0698o4.e0(objH15);
                }
                p232y.M m10 = (p232y.M) objH15;
                c0698o4.p(false);
                return m10;
            case 6:
                p242z.a aVar3 = (p242z.a) obj;
                C0698o c0698o5 = (C0698o) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c0698o5.g(aVar3) ? 4 : 2;
                }
                if (c0698o5.K(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    String str = (String) ((R0) this.f95s).invoke(c0698o5, 0);
                    if (H9.o.e1(str)) {
                        C.a.c("Label must not be blank");
                    }
                    p242z.k.b(str, aVar3, (p251z9.k) this.f96t, c0698o5, (iIntValue4 << 6) & 896);
                } else {
                    c0698o5.N();
                }
                return p110k9.y.f19095a;
            default:
                C0698o c0698o6 = (C0698o) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (c0698o6.K(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    Object objH16 = c0698o6.H();
                    if (objH16 == C0690k.f10683a) {
                        objH16 = new p242z.e();
                        c0698o6.e0(objH16);
                    }
                    p242z.e eVar4 = (p242z.e) objH16;
                    C0023i c0023i = (C0023i) this.f95s;
                    p242z.a aVar4 = (p242z.a) this.f96t;
                    eVar4.f24729a.clear();
                    c0023i.e(eVar4);
                    eVar4.a(aVar4, c0698o6, 0);
                } else {
                    c0698o6.N();
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(R0 r10, p241y9.a aVar) {
        super(3);
        this.f94r = 6;
        this.f95s = r10;
        this.f96t = (p251z9.k) aVar;
    }
}
