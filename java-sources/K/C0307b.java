package K;

import O.InterfaceC0444l;
import W.G2;
import W.H2;
import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: K.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0307b extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4587r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f4588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4590u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0307b(long j, D.P p10, p241y9.f fVar) {
        super(2);
        this.f4588s = j;
        this.f4589t = p10;
        this.f4590u = fVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4587r) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC0444l interfaceC0444l = (InterfaceC0444l) this.f4589t;
                l0.r rVar = (l0.r) this.f4590u;
                AbstractC0312f.a(interfaceC0444l, rVar, this.f4588s, (C0698o) obj, C0672b.y(1));
                break;
            default:
                C0698o c0698o = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
                    c0698o.N();
                } else {
                    X.t.b(this.f4588s, ((G2) c0698o.k(H2.f8580a)).f8567m, p074h0.j.d(1327513942, new A.K(9, (D.P) this.f4589t, (p241y9.f) this.f4590u), c0698o), c0698o, 384);
                }
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0307b(InterfaceC0444l interfaceC0444l, l0.r rVar, long j, int i10) {
        super(2);
        this.f4589t = interfaceC0444l;
        this.f4590u = rVar;
        this.f4588s = j;
    }
}
