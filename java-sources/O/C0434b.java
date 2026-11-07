package O;

import D.AbstractC0060c;
import D.C0059b;
import D.W;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;

/* JADX INFO: renamed from: O.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0434b extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f6346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f6347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.r f6348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0444l f6349u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0434b(long j, boolean z10, l0.r rVar, InterfaceC0444l interfaceC0444l) {
        super(2);
        this.f6346r = j;
        this.f6347s = z10;
        this.f6348t = rVar;
        this.f6349u = interfaceC0444l;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = this.f6346r;
            Z.S s10 = C0690k.f10683a;
            InterfaceC0444l interfaceC0444l = this.f6349u;
            boolean z10 = this.f6347s;
            if (j != 9205357640488583168L) {
                c0698o.T(-837626688);
                C0059b c0059b = z10 ? AbstractC0060c.f942b : AbstractC0060c.f941a;
                l0.r rVarI = androidx.compose.foundation.layout.c.i(this.f6348t, p063g1.h.b(j), p063g1.h.a(j), 0.0f, 0.0f, 12);
                W wA = D.U.a(c0059b, l0.c.f19306A, c0698o, 0);
                int i10 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                l0.r rVarC = l0.a.c(c0698o, rVarI);
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
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i10))) {
                    p123m2.c.y(i10, c0698o, i10, c0285h);
                }
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                boolean zI = c0698o.i(interfaceC0444l);
                Object objH = c0698o.H();
                if (zI || objH == s10) {
                    objH = new C0433a(interfaceC0444l, 0);
                    c0698o.e0(objH);
                }
                B9.a.e(l0.o.f19333a, (p241y9.a) objH, z10, c0698o, 6);
                c0698o.p(true);
                c0698o.p(false);
            } else {
                c0698o.T(-836697680);
                boolean zI2 = c0698o.i(interfaceC0444l);
                Object objH2 = c0698o.H();
                if (zI2 || objH2 == s10) {
                    objH2 = new C0433a(interfaceC0444l, 1);
                    c0698o.e0(objH2);
                }
                B9.a.e(this.f6348t, (p241y9.a) objH2, z10, c0698o, 0);
                c0698o.p(false);
            }
        } else {
            c0698o.N();
        }
        return p110k9.y.f19095a;
    }
}
