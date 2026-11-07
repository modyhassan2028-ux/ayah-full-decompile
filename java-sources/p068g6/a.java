package p068g6;

import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0076t;
import F9.n;
import H0.I;
import H8.i;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import U0.L;
import W.AbstractC0542b2;
import W.G2;
import W.H2;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.M0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.c;
import java.text.NumberFormat;
import l0.o;
import l0.r;
import p110k9.y;
import p171r0.f;
import p180s0.F;
import p180s0.q;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16313r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f16314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f16315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ NumberFormat f16316u;

    public /* synthetic */ a(String str, int i10, NumberFormat numberFormat, int i11) {
        this.f16314s = str;
        this.f16315t = i10;
        this.f16316u = numberFormat;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16313r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o oVar = o.f19333a;
                    r rVarD = c.d(c.n(oVar, 108), 86);
                    C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                    int i10 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    r rVarC = l0.a.c(c0698o, rVarD);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0285h c0285h = C0287j.f4119f;
                    C0672b.v(c0698o, c0076tA, c0285h);
                    C0285h c0285h2 = C0287j.f4118e;
                    C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
                    C0285h c0285h3 = C0287j.g;
                    if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i10))) {
                        p123m2.c.y(i10, c0698o, i10, c0285h3);
                    }
                    C0285h c0285h4 = C0287j.f4117d;
                    C0672b.v(c0698o, rVarC, c0285h4);
                    FillElement fillElement = c.f11826a;
                    r rVarD2 = c.d(fillElement, 32);
                    M0 m10 = p005a4.e.f11187a;
                    r rVarB = androidx.compose.foundation.a.a(rVarD2, ((q) ((p005a4.a) c0698o.k(m10)).f11164c.getValue()).f21845a, F.f21774a).b(new HorizontalAlignElement(l0.c.f19310E));
                    l0.j jVar = l0.c.f19313r;
                    I iD = AbstractC0071n.d(jVar, false);
                    int i11 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                    r rVarC2 = l0.a.c(c0698o, rVarB);
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, iD, c0285h);
                    C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
                    if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i11))) {
                        p123m2.c.y(i11, c0698o, i11, c0285h3);
                    }
                    C0672b.v(c0698o, rVarC2, c0285h4);
                    long jH = ((p005a4.a) c0698o.k(m10)).h();
                    M0 m11 = H2.f8580a;
                    L lA = L.a(((G2) c0698o.k(m11)).g, 0L, n.B(14), null, null, 0L, 0L, null, 16777213);
                    l0.j jVar2 = l0.c.f19317v;
                    androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f11825a;
                    AbstractC0542b2.b(this.f16314s, aVar.a(oVar, jVar2), jH, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, lA, c0698o, 0, 0, 65528);
                    c0698o.p(true);
                    long jI = ((p005a4.a) c0698o.k(m10)).i();
                    r rVarD3 = c.d(fillElement, 1);
                    boolean zF = c0698o.f(jI);
                    Object objH = c0698o.H();
                    if (zF || objH == C0690k.f10683a) {
                        objH = new i(jI, 2);
                        c0698o.e0(objH);
                    }
                    f.a(rVarD3, (p241y9.c) objH, c0698o, 6);
                    FillElement fillElement2 = c.f11828c;
                    I iD2 = AbstractC0071n.d(jVar, false);
                    int i12 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
                    r rVarC3 = l0.a.c(c0698o, fillElement2);
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, iD2, c0285h);
                    C0672b.v(c0698o, interfaceC0687i0M3, c0285h2);
                    if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i12))) {
                        p123m2.c.y(i12, c0698o, i12, c0285h3);
                    }
                    C0672b.v(c0698o, rVarC3, c0285h4);
                    String str = this.f16316u.format(Integer.valueOf(this.f16315t));
                    j.d(str, "format(...)");
                    AbstractC0542b2.b(str, aVar.a(oVar, jVar2), ((p005a4.a) c0698o.k(m10)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, L.a(((G2) c0698o.k(m11)).g, 0L, n.B(32), null, null, 0L, 0L, null, 16777213), c0698o, 0, 0, 65528);
                    c0698o.p(true);
                    c0698o.p(true);
                } else {
                    c0698o.N();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b.a(this.f16314s, this.f16315t, this.f16316u, (C0698o) obj, C0672b.y(1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ a(String str, NumberFormat numberFormat, int i10) {
        this.f16314s = str;
        this.f16316u = numberFormat;
        this.f16315t = i10;
    }
}
