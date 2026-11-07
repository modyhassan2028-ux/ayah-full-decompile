package G;

import D.AbstractC0066i;
import D.C0076t;
import D.C0077u;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.AbstractC0567i;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f2651s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(p074h0.d dVar) {
        super(2);
        this.f2650r = 2;
        this.f2651s = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2650r;
        p110k9.y yVar = p110k9.y.f19095a;
        p074h0.d dVar = this.f2651s;
        switch (i10) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0190y.c(dVar, (C0698o) obj, C0672b.y(7));
                break;
            case 1:
                ((Number) obj2).intValue();
                float f3 = AbstractC0567i.f9166a;
                float f7 = AbstractC0567i.f9166a;
                AbstractC0567i.b(dVar, (C0698o) obj, C0672b.y(439));
                break;
            default:
                C0698o c0698o = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
                    c0698o.N();
                } else {
                    C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                    int i11 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    l0.r rVarC = l0.a.c(c0698o, l0.o.f19333a);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, c0076tA, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i11))) {
                        p123m2.c.y(i11, c0698o, i11, c0285h);
                    }
                    C0672b.v(c0698o, rVarC, C0287j.f4117d);
                    dVar.d(C0077u.f1028a, c0698o, 6);
                    c0698o.p(true);
                }
                break;
        }
        return yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(p074h0.d dVar, int i10, int i11) {
        super(2);
        this.f2650r = i11;
        switch (i11) {
            case 1:
                float f3 = AbstractC0567i.f9166a;
                float f7 = AbstractC0567i.f9166a;
                this.f2651s = dVar;
                super(2);
                break;
            default:
                this.f2651s = dVar;
                break;
        }
    }
}
