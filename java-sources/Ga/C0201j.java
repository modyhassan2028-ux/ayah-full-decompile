package Ga;

import A.C0023i;
import A.C0034n0;
import A.C0040q0;
import A.R0;
import D0.C0086d;
import K.W;
import K0.AbstractC0359n0;
import K0.B0;
import K0.f1;
import K9.InterfaceC0402u;
import U0.C0515g;
import U0.K;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0707x;
import Z.S;
import Z.X;
import p180s0.L;
import p214w.C1395h;
import p214w.C1401n;
import p214w.C1405s;

/* JADX INFO: renamed from: Ga.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201j extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3044v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0201j(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(3);
        this.f3040r = i10;
        this.f3041s = obj;
        this.f3042t = obj2;
        this.f3043u = obj3;
        this.f3044v = obj4;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        Object objC;
        switch (this.f3040r) {
            case 0:
                p241y9.c cVar = (p241y9.c) this.f3043u;
                l0.r rVar = (l0.r) obj;
                C0698o c0698o = (C0698o) obj2;
                ((Number) obj3).intValue();
                p241y9.a aVar = (p241y9.a) this.f3044v;
                k kVar = (k) this.f3041s;
                p251z9.j.e(rVar, "$this$composed");
                c0698o.T(231415144);
                c0698o.T(-1020117123);
                Object objH = c0698o.H();
                S s10 = C0690k.f10683a;
                if (objH == s10) {
                    objH = C0672b.r(new p171r0.c(0L));
                    c0698o.e0(objH);
                }
                X x9 = (X) objH;
                c0698o.p(false);
                c0698o.T(-1020114978);
                Object objH2 = c0698o.H();
                if (objH2 == s10) {
                    objH2 = C0672b.r(new p063g1.l(0L));
                    c0698o.e0(objH2);
                }
                X x10 = (X) objH2;
                c0698o.p(false);
                Object objH3 = c0698o.H();
                if (objH3 == s10) {
                    C0707x c0707x = new C0707x(C0672b.m(c0698o));
                    c0698o.e0(c0707x);
                    objH3 = c0707x;
                }
                InterfaceC0402u interfaceC0402u = ((C0707x) objH3).f10851r;
                c0698o.T(-1020110864);
                Object objH4 = c0698o.H();
                if (objH4 == s10) {
                    objH4 = new C0200i(x9, x10, 0);
                    c0698o.e0(objH4);
                }
                c0698o.p(false);
                l0.r rVarD = androidx.compose.ui.layout.a.d(rVar, (p241y9.c) objH4);
                A a9 = kVar.f3045a;
                Object obj4 = kVar.f3046b;
                a9.getClass();
                p251z9.j.e(obj4, "key");
                boolean z10 = ((Boolean) C0672b.o(new C0086d(3, obj4, a9)).getValue()).booleanValue() || !((Boolean) kVar.f3045a.f2961k.getValue()).booleanValue();
                C0194c c0194c = (C0194c) this.f3042t;
                c0698o.T(-1020096561);
                boolean zI = c0698o.i(interfaceC0402u) | c0698o.g(kVar) | c0698o.g(cVar);
                k kVar2 = (k) this.f3041s;
                Object objH5 = c0698o.H();
                if (zI || objH5 == s10) {
                    C0034n0 c0034n0 = new C0034n0(interfaceC0402u, cVar, kVar2, x9, x10, 1);
                    c0698o.e0(c0034n0);
                    objH5 = c0034n0;
                }
                p241y9.c cVar2 = (p241y9.c) objH5;
                c0698o.p(false);
                c0698o.T(-1020079808);
                boolean zG = c0698o.g(kVar) | c0698o.g(aVar);
                Object objH6 = c0698o.H();
                if (zG || objH6 == s10) {
                    objH6 = new C0086d(2, kVar, aVar);
                    c0698o.e0(objH6);
                }
                p241y9.a aVar2 = (p241y9.a) objH6;
                c0698o.p(false);
                c0698o.T(-1020075619);
                boolean zG2 = c0698o.g(kVar);
                Object objH7 = c0698o.H();
                if (zG2 || objH7 == s10) {
                    objH7 = new R0(4, kVar);
                    c0698o.e0(objH7);
                }
                p241y9.e eVar = (p241y9.e) objH7;
                c0698o.p(false);
                p251z9.j.e(rVarD, "<this>");
                p251z9.j.e(cVar2, "onDragStarted");
                p251z9.j.e(aVar2, "onDragStopped");
                p251z9.j.e(eVar, "onDrag");
                l0.r rVarA = l0.a.a(rVarD, new C0199h(a9, aVar2, z10, c0194c, cVar2, eVar));
                c0698o.p(false);
                return rVarA;
            case 1:
                l0.r rVar2 = (l0.r) obj;
                C0698o c0698o2 = (C0698o) obj2;
                ((Number) obj3).intValue();
                W w9 = (W) this.f3042t;
                L l10 = (L) this.f3041s;
                Z0.y yVar = (Z0.y) this.f3043u;
                c0698o2.T(-84507373);
                boolean zBooleanValue = ((Boolean) c0698o2.k(AbstractC0359n0.f5132w)).booleanValue();
                boolean zH = c0698o2.h(zBooleanValue);
                Object objH8 = c0698o2.H();
                S s11 = C0690k.f10683a;
                if (zH || objH8 == s11) {
                    objH8 = new M.h(zBooleanValue);
                    c0698o2.e0(objH8);
                }
                M.h hVar = (M.h) objH8;
                boolean z11 = l10.f21813e != 16;
                if (((Boolean) ((B0) ((f1) c0698o2.k(AbstractC0359n0.f5129t))).f4872a.getValue()).booleanValue() && w9.b() && K.b(yVar.f10954b) && z11) {
                    c0698o2.T(808460990);
                    C0515g c0515g = yVar.f10953a;
                    K k7 = new K(yVar.f10954b);
                    boolean zI2 = c0698o2.i(hVar);
                    Object objH9 = c0698o2.H();
                    if (zI2 || objH9 == s11) {
                        objH9 = new C0040q0(hVar, (p150o9.c) null, 8);
                        c0698o2.e0(objH9);
                    }
                    C0672b.g(c0515g, k7, (p241y9.e) objH9, c0698o2);
                    boolean zG3 = c0698o2.g(yVar) | c0698o2.i(hVar) | c0698o2.i((Z0.s) this.f3044v) | c0698o2.i(w9) | c0698o2.g(l10);
                    Z0.s sVar = (Z0.s) this.f3044v;
                    Z0.y yVar2 = (Z0.y) this.f3043u;
                    Object objH10 = c0698o2.H();
                    if (zG3 || objH10 == s11) {
                        C0034n0 c0034n1 = new C0034n0(hVar, sVar, yVar2, w9, l10, 2);
                        c0698o2.e0(c0034n1);
                        objH10 = c0034n1;
                    }
                    objC = androidx.compose.ui.draw.a.c(rVar2, (p241y9.c) objH10);
                    c0698o2.p(false);
                } else {
                    c0698o2.T(810474750);
                    c0698o2.p(false);
                    objC = l0.o.f19333a;
                }
                c0698o2.p(false);
                return objC;
            default:
                p214w.r rVar3 = (p214w.r) obj;
                C0698o c0698o3 = (C0698o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                p093j0.r rVar4 = (p093j0.r) this.f3041s;
                C1401n c1401n = (C1401n) this.f3043u;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c0698o3.g(rVar3) : c0698o3.i(rVar3) ? 4 : 2;
                }
                if (c0698o3.K(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zG4 = c0698o3.g(rVar4);
                    Object obj5 = this.f3042t;
                    boolean zI3 = zG4 | c0698o3.i(obj5) | c0698o3.i(c1401n);
                    Object objH11 = c0698o3.H();
                    S s12 = C0690k.f10683a;
                    if (zI3 || objH11 == s12) {
                        objH11 = new C0023i(rVar4, obj5, c1401n, 21);
                        c0698o3.e0(objH11);
                    }
                    C0672b.d(rVar3, (p241y9.c) objH11, c0698o3);
                    u.E e10 = c1401n.f23520d;
                    p251z9.j.c(rVar3, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                    e10.l(obj5, ((C1405s) rVar3).f23534a);
                    Object objH12 = c0698o3.H();
                    if (objH12 == s12) {
                        objH12 = new C1395h();
                        c0698o3.e0(objH12);
                    }
                    ((p074h0.d) this.f3044v).i((C1395h) objH12, obj5, c0698o3, 0);
                } else {
                    c0698o3.N();
                }
                return p110k9.y.f19095a;
        }
    }
}
