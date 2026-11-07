package W;

import Z.C0690k;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u.s f9219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0576l f9220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f9221t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(u.s sVar, C0576l c0576l, boolean z10) {
        super(2);
        this.f9219r = sVar;
        this.f9220s = c0576l;
        this.f9221t = z10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        l0.o oVar;
        C0576l c0576l;
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            c0698o.T(1547046870);
            u.s sVar = this.f9219r;
            int i10 = sVar.f22758b;
            int i11 = 0;
            while (true) {
                oVar = l0.o.f19333a;
                c0576l = this.f9220s;
                if (i11 >= i10) {
                    break;
                }
                int iC = (!c0576l.f9222a.d() || c0576l.f9222a.c() == 1) ? sVar.c(i11) : sVar.c(i11) % 12;
                boolean zE = c0698o.e(i11);
                Object objH = c0698o.H();
                if (zE || objH == C0690k.f10683a) {
                    objH = new F.v(i11, 2);
                    c0698o.e0(objH);
                }
                A2.m(R0.m.a(oVar, false, (p241y9.c) objH), c0576l, iC, this.f9221t, c0698o, 0);
                i11++;
            }
            c0698o.p(false);
            if (c0576l.f9222a.c() == 0 && c0576l.f9222a.d()) {
                A2.l(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.j(androidx.compose.ui.layout.a.c(oVar, E0.f8524s), Y.s.f10234a), p180s0.q.f21843f, J.e.f3871a), A2.f8453b, p074h0.j.d(-205464413, new j2(c0576l, this.f9221t), c0698o), c0698o, 432);
            }
        }
        return p110k9.y.f19095a;
    }
}
