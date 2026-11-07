package A;

import D.AbstractC0066i;
import D.C0076t;
import D.C0077u;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import K0.C0335b0;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.InterfaceC0771u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f63r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f64s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f65t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f66u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I0(Object obj, Object obj2, Object obj3, int i10) {
        super(2);
        this.f63r = i10;
        this.f64s = obj;
        this.f65t = obj2;
        this.f66u = obj3;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63r) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                p251z9.s sVar = (p251z9.s) this.f64s;
                float f3 = fFloatValue - sVar.f24883r;
                b1 b1Var = (b1) this.f65t;
                Z0 z10 = (Z0) this.f66u;
                long jH = b1Var.h(b1Var.d(f3));
                b1 b1Var2 = z10.f178a;
                sVar.f24883r += b1Var.d(b1Var.g(b1.a(b1Var2, b1Var2.j, jH, 1)));
                break;
            case 1:
                ((Number) obj2).intValue();
                H0.a0.a((H0.d0) this.f64s, (l0.r) this.f65t, (p241y9.e) this.f66u, (C0698o) obj, C0672b.y(9));
                break;
            case 2:
                ((Number) obj2).intValue();
                K.T.g((l0.r) this.f64s, (O.N) this.f65t, (p074h0.d) this.f66u, (C0698o) obj, C0672b.y(385));
                break;
            case 3:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0359n0.a((AndroidComposeView) this.f64s, (C0335b0) this.f65t, (p241y9.e) this.f66u, c0698o, 0);
                } else {
                    c0698o.N();
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                AbstractC0359n0.a((J0.r0) this.f64s, (C0335b0) this.f65t, (p241y9.e) this.f66u, (C0698o) obj, C0672b.y(1));
                break;
            case 5:
                C0698o c0698o2 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o2.x()) {
                    c0698o2.N();
                } else {
                    l0.r rVarE = p181s2.r.e(androidx.compose.foundation.layout.b.m(androidx.compose.foundation.layout.b.j((l0.r) this.f64s, 0.0f, W.J0.f8606d, 1), D.I.f891s), (p232y.j0) this.f65t);
                    p074h0.d dVar = (p074h0.d) this.f66u;
                    C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
                    int i10 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    l0.r rVarC = l0.a.c(c0698o2, rVarE);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0672b.v(c0698o2, c0076tA, C0287j.f4119f);
                    C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i10))) {
                        p123m2.c.y(i10, c0698o2, i10, c0285h);
                    }
                    C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                    dVar.d(C0077u.f1028a, c0698o2, 6);
                    c0698o2.p(true);
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                X.t.a((InterfaceC0771u) this.f64s, (p241y9.c) this.f65t, (p241y9.a) this.f66u, (C0698o) obj, C0672b.y(1));
                break;
            default:
                ((Number) obj2).intValue();
                Y2.a.d((l0.r) this.f64s, (List) this.f65t, (fa.a) this.f66u, (C0698o) obj, C0672b.y(1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(2);
        this.f63r = i11;
        this.f64s = obj;
        this.f65t = obj2;
        this.f66u = obj3;
    }
}
