package K;

import K0.C0363p0;
import K0.X0;
import Z.C0681f0;
import Z.L0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4461r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f4462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4463t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4465v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4466w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(W w9, p162q0.p pVar, boolean z10, O.N n6, Z0.s sVar) {
        super(1);
        this.f4463t = w9;
        this.f4464u = pVar;
        this.f4462s = z10;
        this.f4465v = n6;
        this.f4466w = sVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        float fFloatValue;
        switch (this.f4461r) {
            case 0:
                long j = ((p171r0.c) obj).f21387a;
                W w9 = (W) this.f4463t;
                p162q0.p pVar = (p162q0.p) this.f4464u;
                if (w9.b()) {
                    X0 x9 = w9.f4555c;
                    if (x9 != null) {
                        ((C0363p0) x9).b();
                    }
                } else {
                    p162q0.p.b(pVar);
                }
                if (w9.b() && this.f4462s) {
                    if (w9.a() != L.f4485s) {
                        t0 t0VarD = w9.d();
                        if (t0VarD != null) {
                            Z0.s sVar = (Z0.s) this.f4466w;
                            L5.c cVar = w9.f4556d;
                            B b5 = w9.f4572v;
                            int iA = sVar.a(t0VarD.b(j, true));
                            b5.e(Z0.y.a((Z0.y) cVar.f5532s, null, va.g.e(iA, iA), 5));
                            if (w9.f4553a.f4632a.f8060s.length() > 0) {
                                w9.f4561k.setValue(L.f4486t);
                            }
                        }
                    } else {
                        ((O.N) this.f4465v).e(new p171r0.c(j));
                    }
                }
                break;
            default:
                p180s0.G g = (p180s0.G) obj;
                L0 l10 = (L0) this.f4465v;
                C0681f0 c0681f0 = ((p223x.I) this.f4463t).f23856t;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                boolean z10 = this.f4462s;
                if (z10) {
                    fFloatValue = ((Boolean) c0681f0.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) l10.getValue()).floatValue();
                }
                g.e(fFloatValue);
                if (!z10) {
                    fFloatValue2 = ((Number) l10.getValue()).floatValue();
                } else if (((Boolean) c0681f0.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                g.f(fFloatValue2);
                if (!z10) {
                    fFloatValue3 = ((Number) ((L0) this.f4466w).getValue()).floatValue();
                } else if (!((Boolean) c0681f0.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                g.a(fFloatValue3);
                g.l(((p180s0.M) ((Z.X) this.f4464u).getValue()).f21816a);
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(boolean z10, p223x.I i10, Z.X x9, p223x.n0 n0Var, p223x.n0 n0Var2) {
        super(1);
        this.f4462s = z10;
        this.f4463t = i10;
        this.f4464u = x9;
        this.f4465v = n0Var;
        this.f4466w = n0Var2;
    }
}
