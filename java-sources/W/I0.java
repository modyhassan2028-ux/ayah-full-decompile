package W;

import Z.C0672b;
import Z.C0698o;
import Z.C0709z;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8590r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f8591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8593u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8594v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(H0 h7, boolean z10, p241y9.e eVar, p074h0.d dVar) {
        super(2);
        this.f8592t = h7;
        this.f8591s = z10;
        this.f8593u = eVar;
        this.f8594v = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8590r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                p241y9.e eVar = (p241y9.e) this.f8593u;
                H0 h7 = (H0) this.f8592t;
                if ((iIntValue & 3) == 2 && c0698o.x()) {
                    c0698o.N();
                } else {
                    c0698o.T(1264683960);
                    c0698o.p(false);
                    C0709z c0709z = AbstractC0592q0.f9328a;
                    boolean z10 = this.f8591s;
                    C0672b.a(c0709z.a(new p180s0.q(z10 ? h7.f8572a : h7.f8575d)), p074h0.j.d(-1728894036, new C0551e(eVar, (p074h0.d) this.f8594v, 2), c0698o), c0698o, 56);
                    if (eVar != null) {
                        C0672b.a(c0709z.a(new p180s0.q(z10 ? h7.f8574c : h7.f8577f)), p074h0.j.d(580312062, new C0539b(eVar, 2), c0698o), c0698o, 56);
                    }
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o2.x()) {
                    c0698o2.N();
                } else {
                    P1.f8759a.a(this.f8591s, (B.j) this.f8592t, l0.o.f19333a, (L1) this.f8593u, (p180s0.J) this.f8594v, c0698o2, 114822144);
                }
                break;
            default:
                C0698o c0698o3 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o3.x()) {
                    c0698o3.N();
                } else {
                    C0672b.a(AbstractC0592q0.f9328a.a(new p180s0.q(((C0554e2) this.f8592t).f9047f)), p074h0.j.d(1992872400, new k2((u.s) this.f8593u, (C0576l) this.f8594v, this.f8591s), c0698o3), c0698o3, 56);
                }
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(C0554e2 c0554e2, u.s sVar, C0576l c0576l, boolean z10) {
        super(2);
        this.f8592t = c0554e2;
        this.f8593u = sVar;
        this.f8594v = c0576l;
        this.f8591s = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(boolean z10, B.j jVar, L1 l10, p180s0.J j) {
        super(2);
        this.f8591s = z10;
        this.f8592t = jVar;
        this.f8593u = l10;
        this.f8594v = j;
    }
}
