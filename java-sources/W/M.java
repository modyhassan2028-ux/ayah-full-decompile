package W;

import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0076t;
import D.C0077u;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.InterfaceC0402u;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f8681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0561g1 f8682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f8683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f8684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f8685v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(p241y9.e eVar, C0561g1 c0561g1, boolean z10, InterfaceC0402u interfaceC0402u, p074h0.d dVar) {
        super(2);
        this.f8681r = eVar;
        this.f8682s = c0561g1;
        this.f8683t = z10;
        this.f8684u = interfaceC0402u;
        this.f8685v = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        HorizontalAlignElement horizontalAlignElement;
        Object d5;
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i10 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, fillElement);
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
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i10))) {
                p123m2.c.y(i10, c0698o, i10, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            c0698o.T(-1168080147);
            p241y9.e eVar = this.f8681r;
            if (eVar != null) {
                String strC = X.t.c(R.string.m3c_bottom_sheet_collapse_description, c0698o);
                String strC2 = X.t.c(R.string.m3c_bottom_sheet_dismiss_description, c0698o);
                String strC3 = X.t.c(R.string.m3c_bottom_sheet_expand_description, c0698o);
                HorizontalAlignElement horizontalAlignElement2 = new HorizontalAlignElement(l0.c.f19310E);
                C0561g1 c0561g1 = this.f8682s;
                boolean zG = c0698o.g(c0561g1);
                boolean z12 = this.f8683t;
                boolean zH = zG | c0698o.h(z12) | c0698o.g(strC3);
                InterfaceC0402u interfaceC0402u = this.f8684u;
                boolean zI = zH | c0698o.i(interfaceC0402u) | c0698o.g(strC) | c0698o.g(strC2);
                Object objH = c0698o.H();
                if (zI || objH == C0690k.f10683a) {
                    horizontalAlignElement = horizontalAlignElement2;
                    d5 = new K.D(c0561g1, z12, strC3, strC, strC2, interfaceC0402u, 1);
                    c0698o.e0(d5);
                } else {
                    d5 = objH;
                    horizontalAlignElement = horizontalAlignElement2;
                }
                l0.r rVarA = R0.m.a(horizontalAlignElement, true, (p241y9.c) d5);
                H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
                int i11 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                l0.r rVarC2 = l0.a.c(c0698o, rVarA);
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, iD, c0285h);
                C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i11))) {
                    p123m2.c.y(i11, c0698o, i11, c0285h3);
                }
                C0672b.v(c0698o, rVarC2, c0285h4);
                z10 = false;
                eVar.invoke(c0698o, 0);
                z11 = true;
                c0698o.p(true);
            } else {
                z10 = false;
                z11 = true;
            }
            c0698o.p(z10);
            this.f8685v.d(C0077u.f1028a, c0698o, 6);
            c0698o.p(z11);
        }
        return p110k9.y.f19095a;
    }
}
