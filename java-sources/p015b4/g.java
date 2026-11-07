package p015b4;

import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0076t;
import D.r;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.AbstractC0542b2;
import W.G2;
import W.H2;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import l0.a;
import p055f1.k;
import p074h0.d;
import p110k9.y;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13269r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f13270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f13271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f13272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f13273v;

    public /* synthetic */ g(boolean z10, int i10, String str, d dVar, int i11) {
        this.f13270s = z10;
        this.f13271t = i10;
        this.f13272u = str;
        this.f13273v = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13269r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else if (this.f13270s) {
                    c0698o.T(1416648727);
                    FillElement fillElement = c.f11828c;
                    C0076t c0076tA = r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                    int i10 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    l0.r rVarC = a.c(c0698o, fillElement);
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
                    f.j(this.f13271t, 0, c0698o);
                    I iD = AbstractC0071n.d(l0.c.f19317v, false);
                    int i11 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                    l0.r rVarC2 = a.c(c0698o, fillElement);
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
                    AbstractC0542b2.b(this.f13272u, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).j(), 0L, null, null, 0L, new k(3), 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).f8563h, c0698o, 0, 0, 65018);
                    c0698o.p(true);
                    c0698o.p(true);
                    c0698o.p(false);
                } else {
                    c0698o.T(1417057090);
                    this.f13273v.invoke(c0698o, 0);
                    c0698o.p(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                f.e(this.f13270s, this.f13271t, this.f13272u, this.f13273v, (C0698o) obj, C0672b.y(3073));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ g(boolean z10, d dVar, int i10, String str) {
        this.f13270s = z10;
        this.f13273v = dVar;
        this.f13271t = i10;
        this.f13272u = str;
    }
}
