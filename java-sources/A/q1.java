package A;

import W.C0550d2;
import p180s0.C1297f;
import p180s0.C1303l;
import p223x.C1411c;
import p223x.C1420i;
import p223x.C1423l;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f395u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(float f3, Object obj, Object obj2, int i10) {
        super(1);
        this.f392r = i10;
        this.f393s = f3;
        this.f394t = obj;
        this.f395u = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091 A[PHI: r2
      0x0091: PHI (r2v23 float) = (r2v19 float), (r2v27 float) binds: [B:28:0x00a6, B:21:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        float fFloatValue;
        switch (this.f392r) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                r1 r1Var = (r1) this.f394t;
                if (r1Var.f401b == Long.MIN_VALUE) {
                    r1Var.f401b = jLongValue;
                }
                float f3 = r1Var.f404e;
                C1423l c1423l = new C1423l(f3);
                float f7 = this.f393s;
                C1423l c1423l2 = r1.f399f;
                long jI = f7 == 0.0f ? r1Var.f400a.i(new C1423l(f3), c1423l2, r1Var.f402c) : B9.a.W((jLongValue - r1Var.f401b) / f7);
                float f10 = ((C1423l) r1Var.f400a.l(jI, c1423l, c1423l2, r1Var.f402c)).f24036a;
                r1Var.f402c = (C1423l) r1Var.f400a.e(jI, c1423l, c1423l2, r1Var.f402c);
                r1Var.f401b = jLongValue;
                float f11 = r1Var.f404e - f10;
                r1Var.f404e = f10;
                ((p241y9.c) this.f395u).e(Float.valueOf(f11));
                return p110k9.y.f19095a;
            case 1:
                C1420i c1420i = (C1420i) obj;
                p251z9.s sVar = (p251z9.s) this.f394t;
                float f12 = this.f393s;
                float f13 = 0.0f;
                if (f12 > 0.0f) {
                    fFloatValue = ((Number) c1420i.f24011e.getValue()).floatValue();
                    if (fFloatValue <= f12) {
                        f12 = fFloatValue;
                    }
                    f13 = f12;
                } else if (f12 < 0.0f) {
                    fFloatValue = ((Number) c1420i.f24011e.getValue()).floatValue();
                    if (fFloatValue >= f12) {
                        f12 = fFloatValue;
                    }
                    f13 = f12;
                }
                float f14 = f13 - sVar.f24883r;
                if (f14 != ((C0) ((X0) this.f395u).f167b).a(f14) || f13 != ((Number) c1420i.f24011e.getValue()).floatValue()) {
                    c1420i.a();
                }
                sVar.f24883r += f14;
                return p110k9.y.f19095a;
            case 2:
                J0.K k7 = (J0.K) obj;
                k7.a();
                float f15 = this.f393s;
                C1297f c1297f = (C1297f) this.f394t;
                C1303l c1303l = (C1303l) this.f395u;
                p196u0.b bVar = k7.f3942r;
                p074h0.i iVar = bVar.f22795s;
                long jV = iVar.v();
                iVar.p().q();
                try {
                    p151p.V v10 = (p151p.V) iVar.f16422s;
                    v10.x(f15, 0.0f);
                    v10.v(0L, 45.0f);
                    bVar.d(c1297f, c1303l);
                    return p110k9.y.f19095a;
                } finally {
                    iVar.p().n();
                    iVar.J(jV);
                }
            default:
                H0.T t2 = (H0.T) obj;
                H0.U u8 = (H0.U) this.f394t;
                C1411c c1411c = ((C0550d2) this.f395u).f9030I;
                H0.T.g(t2, u8, (int) (c1411c != null ? ((Number) c1411c.d()).floatValue() : this.f393s), 0);
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, float f3, p241y9.c cVar) {
        super(1);
        this.f392r = 0;
        this.f394t = r1Var;
        this.f393s = f3;
        this.f395u = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(H0.U u8, C0550d2 c0550d2, float f3) {
        super(1);
        this.f392r = 3;
        this.f394t = u8;
        this.f395u = c0550d2;
        this.f393s = f3;
    }
}
