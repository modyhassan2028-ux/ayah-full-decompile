package W;

import D.AbstractC0071n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: renamed from: W.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0551e extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f9035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f9036t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0551e(p241y9.e eVar, p074h0.d dVar, int i10) {
        super(2);
        this.f9034r = i10;
        this.f9035s = eVar;
        this.f9036t = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9034r;
        p110k9.y yVar = p110k9.y.f19095a;
        p074h0.d dVar = this.f9036t;
        p241y9.e eVar = this.f9035s;
        int i11 = 0;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
                    c0698o.N();
                } else {
                    c0698o.T(1497073862);
                    if (eVar != null) {
                        eVar.invoke(c0698o, 0);
                    }
                    c0698o.p(false);
                    dVar.invoke(c0698o, 0);
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o2.x()) {
                    c0698o2.N();
                } else {
                    float f3 = AbstractC0567i.f9166a;
                    AbstractC0567i.b(p074h0.j.d(1887135077, new C0551e(eVar, dVar, i11), c0698o2), c0698o2, 438);
                }
                break;
            default:
                C0698o c0698o3 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o3.x()) {
                    c0698o3.N();
                } else {
                    if (1.0f <= 0.0d) {
                        E.a.a("invalid weight; must be greater than zero");
                    }
                    l0.r rVarL = androidx.compose.foundation.layout.b.l(new LayoutWeightElement(1.0f, true), 0, 0.0f, eVar != null ? J0.f8605c : 0, 0.0f, 10);
                    H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
                    int i12 = c0698o3.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o3.m();
                    l0.r rVarC = l0.a.c(c0698o3, rVarL);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o3.X();
                    if (c0698o3.f10720O) {
                        c0698o3.l(c0286i);
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
                    dVar.invoke(c0698o3, 0);
                    c0698o3.p(true);
                }
                break;
        }
        return yVar;
    }
}
