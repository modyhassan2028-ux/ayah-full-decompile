package K;

import D.AbstractC0071n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;

/* JADX INFO: renamed from: K.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0305a extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f4583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.r f4584s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0305a(long j, l0.r rVar) {
        super(2);
        this.f4583r = j;
        this.f4584s = rVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = this.f4583r;
            if (j != 9205357640488583168L) {
                c0698o.T(1828931592);
                l0.r rVarI = androidx.compose.foundation.layout.c.i(this.f4584s, p063g1.h.b(j), p063g1.h.a(j), 0.0f, 0.0f, 12);
                H0.I iD = AbstractC0071n.d(l0.c.f19314s, false);
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
                C0672b.v(c0698o, iD, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                C0285h c0285h = C0287j.g;
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i10))) {
                    p123m2.c.y(i10, c0698o, i10, c0285h);
                }
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                AbstractC0312f.b(0, 1, c0698o, null);
                c0698o.p(true);
                c0698o.p(false);
            } else {
                c0698o.T(1829298756);
                AbstractC0312f.b(0, 0, c0698o, this.f4584s);
                c0698o.p(false);
            }
        } else {
            c0698o.N();
        }
        return p110k9.y.f19095a;
    }
}
