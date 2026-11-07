package Ga;

import A.C0033n;
import D0.C0096n;
import K9.InterfaceC0402u;
import W.L1;
import W.P1;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0707x;
import Z.S;
import Z.X;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: renamed from: Ga.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0199h extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3030r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3036x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199h(Object obj, p241y9.a aVar, boolean z10, C0194c c0194c, p241y9.c cVar, p241y9.e eVar) {
        super(3);
        this.f3032t = obj;
        this.f3033u = aVar;
        this.f3031s = z10;
        this.f3034v = c0194c;
        this.f3035w = cVar;
        this.f3036x = eVar;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        X x9;
        int i10 = this.f3030r;
        Object obj4 = this.f3036x;
        Object obj5 = this.f3035w;
        Object obj6 = this.f3034v;
        Object obj7 = this.f3033u;
        Object obj8 = this.f3032t;
        switch (i10) {
            case 0:
                p241y9.e eVar = (p241y9.e) obj4;
                p241y9.c cVar = (p241y9.c) obj5;
                C0194c c0194c = (C0194c) obj6;
                l0.r rVar = (l0.r) obj;
                C0698o c0698o = (C0698o) obj2;
                ((Number) obj3).intValue();
                p241y9.a aVar = (p241y9.a) obj7;
                p251z9.j.e(rVar, "$this$composed");
                c0698o.T(1321786060);
                Object objH = c0698o.H();
                S s10 = C0690k.f10683a;
                if (objH == s10) {
                    C0707x c0707x = new C0707x(C0672b.m(c0698o));
                    c0698o.e0(c0707x);
                    objH = c0707x;
                }
                InterfaceC0402u interfaceC0402u = ((C0707x) objH).f10851r;
                c0698o.T(-98757340);
                Object objH2 = c0698o.H();
                if (objH2 == s10) {
                    objH2 = C0672b.r(null);
                    c0698o.e0(objH2);
                }
                X x10 = (X) objH2;
                c0698o.p(false);
                c0698o.T(-98754771);
                Object objH3 = c0698o.H();
                if (objH3 == s10) {
                    objH3 = C0672b.r(Boolean.FALSE);
                    c0698o.e0(objH3);
                }
                X x11 = (X) objH3;
                c0698o.p(false);
                c0698o.T(-98752375);
                boolean zI = c0698o.i(interfaceC0402u) | c0698o.g(null) | c0698o.g(aVar);
                Object objH4 = c0698o.H();
                if (zI || objH4 == s10) {
                    x9 = x11;
                    C0033n c0033n = new C0033n(aVar, x9, x10, interfaceC0402u, 3);
                    x10 = x10;
                    c0698o.e0(c0033n);
                    objH4 = c0033n;
                } else {
                    x9 = x11;
                }
                c0698o.p(false);
                C0672b.d(obj8, (p241y9.c) objH4, c0698o);
                boolean z10 = this.f3031s;
                Boolean boolValueOf = Boolean.valueOf(z10);
                c0698o.T(-98737076);
                boolean zH = c0698o.h(z10) | c0698o.i(c0194c) | c0698o.i(interfaceC0402u) | c0698o.g(null) | c0698o.g(cVar) | c0698o.g(aVar) | c0698o.g(eVar);
                Object objH5 = c0698o.H();
                if (zH || objH5 == s10) {
                    C0198g c0198g = new C0198g(this.f3031s, c0194c, eVar, cVar, x9, interfaceC0402u, x10, aVar, null);
                    c0698o.e0(c0198g);
                    objH5 = c0198g;
                }
                c0698o.p(false);
                C0096n c0096n = D0.I.f1055a;
                l0.r rVarB = rVar.b(new SuspendPointerInputElement(obj8, boolValueOf, new D0.H((p241y9.e) objH5), 4));
                c0698o.p(false);
                return rVarB;
            default:
                p241y9.e eVar2 = (p241y9.e) obj;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0698o2.i(eVar2) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0698o2.x()) {
                    c0698o2.N();
                } else {
                    P1.f8759a.b((String) obj8, eVar2, this.f3031s, false, (W2.n) obj7, (B.j) obj6, (p180s0.J) obj5, (L1) obj4, null, null, c0698o2, (iIntValue << 3) & 112);
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199h(String str, boolean z10, W2.n nVar, B.j jVar, p180s0.J j, L1 l10) {
        super(3);
        this.f3032t = str;
        this.f3031s = z10;
        this.f3033u = nVar;
        this.f3034v = jVar;
        this.f3035w = j;
        this.f3036x = l10;
    }
}
