package G4;

import D.AbstractC0066i;
import D.U;
import D.W;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.C0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.foundation.layout.VerticalAlignElement;
import com.ayah.R;
import l0.o;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2806r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f2808t;

    public /* synthetic */ d(int i10, int i11, p241y9.c cVar) {
        this.f2807s = i10;
        this.f2808t = cVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2806r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p241y9.c cVar = this.f2808t;
                    boolean zG = c0698o.g(cVar);
                    int i10 = this.f2807s;
                    boolean zE = zG | c0698o.e(i10);
                    Object objH = c0698o.H();
                    if (zE || objH == C0690k.f10683a) {
                        objH = new g(i10, 0, cVar);
                        c0698o.e0(objH);
                    }
                    float f3 = 16;
                    r rVarB = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.c(o.f19333a, false, null, (p241y9.a) objH, 7), f3, 8).b(androidx.compose.foundation.layout.c.f11826a);
                    W wA = U.a(AbstractC0066i.f977a, l0.c.f19306A, c0698o, 0);
                    int i11 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    r rVarC = l0.a.c(c0698o, rVarB);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, wA, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i11))) {
                        p123m2.c.y(i11, c0698o, i11, c0285h);
                    }
                    C0672b.v(c0698o, rVarC, C0287j.f4117d);
                    C0.a(F9.n.M(2131230915, c0698o), p000a.a.m0(R.string.library_subtitle, c0698o), androidx.compose.foundation.layout.b.l(new VerticalAlignElement(), 0.0f, 0.0f, f3, 0.0f, 11), ((p005a4.a) c0698o.k(p005a4.e.f11187a)).l(), c0698o, 0, 0);
                    p015b4.f.i(384, 2, c0698o, n.f2858d, p000a.a.m0(R.string.library_subtitle, c0698o), null);
                    c0698o.p(true);
                } else {
                    c0698o.N();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                p068g6.b.f(this.f2807s, this.f2808t, (C0698o) obj, C0672b.y(1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ d(p241y9.c cVar, int i10) {
        this.f2808t = cVar;
        this.f2807s = i10;
    }
}
