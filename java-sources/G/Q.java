package G;

import A.C0;
import A.X0;
import p223x.C1420i;
import p223x.C1422k;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ p251z9.v f2618A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X0 f2619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f2621t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p251z9.s f2622u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p251z9.r f2623v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f2625x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p251z9.t f2626y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2627z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(X0 x9, int i10, float f3, p251z9.s sVar, p251z9.r rVar, boolean z10, float f7, p251z9.t tVar, int i11, p251z9.v vVar) {
        super(1);
        this.f2619r = x9;
        this.f2620s = i10;
        this.f2621t = f3;
        this.f2622u = sVar;
        this.f2623v = rVar;
        this.f2624w = z10;
        this.f2625x = f7;
        this.f2626y = tVar;
        this.f2627z = i11;
        this.f2618A = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r2
      0x002a: PHI (r2v16 float) = (r2v7 float), (r2v20 float) binds: [B:11:0x003a, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        float fFloatValue;
        C1420i c1420i = (C1420i) obj;
        X0 x9 = this.f2619r;
        int i10 = this.f2620s;
        boolean zC = S.c(x9, i10);
        p251z9.r rVar = this.f2623v;
        boolean z10 = this.f2624w;
        if (!zC) {
            float f3 = this.f2621t;
            if (f3 > 0.0f) {
                fFloatValue = ((Number) c1420i.f24011e.getValue()).floatValue();
                if (fFloatValue <= f3) {
                    f3 = fFloatValue;
                }
            } else {
                fFloatValue = ((Number) c1420i.f24011e.getValue()).floatValue();
                if (fFloatValue >= f3) {
                    f3 = fFloatValue;
                }
            }
            p251z9.s sVar = this.f2622u;
            float f7 = f3 - sVar.f24883r;
            F.A a9 = (F.A) x9.f168c;
            float fA = ((C0) x9.f167b).a(f7);
            if (S.c(x9, i10) || S.a(z10, x9, i10)) {
                if (S.a(z10, x9, i10)) {
                    ((F.A) x9.f168c).j(i10, 0, true);
                    rVar.f24882r = false;
                    c1420i.a();
                } else if (S.c(x9, i10)) {
                    throw new C0176j(p245z2.a.t(x9, i10), (C1422k) this.f2618A.f24886r);
                }
            } else if (f7 == fA) {
                sVar.f24883r += f7;
                float f10 = this.f2625x;
                if (z10) {
                    if (((Number) c1420i.f24011e.getValue()).floatValue() > f10) {
                        c1420i.a();
                    }
                } else if (((Number) c1420i.f24011e.getValue()).floatValue() < (-f10)) {
                    c1420i.a();
                }
                int i11 = this.f2627z;
                p251z9.t tVar = this.f2626y;
                if (z10) {
                    if (tVar.f24884r >= 2 && i10 - x9.c() > i11) {
                        a9.j(i10 - i11, 0, true);
                    }
                } else if (tVar.f24884r >= 2 && x9.b() - i10 > i11) {
                    a9.j(i11 + i10, 0, true);
                }
                if (S.a(z10, x9, i10)) {
                    ((F.A) x9.f168c).j(i10, 0, true);
                    rVar.f24882r = false;
                    c1420i.a();
                } else if (S.c(x9, i10)) {
                    throw new C0176j(p245z2.a.t(x9, i10), (C1422k) this.f2618A.f24886r);
                }
            } else {
                c1420i.a();
                rVar.f24882r = false;
            }
        } else if (S.a(z10, x9, i10)) {
            ((F.A) x9.f168c).j(i10, 0, true);
            rVar.f24882r = false;
            c1420i.a();
        } else if (S.c(x9, i10)) {
            throw new C0176j(p245z2.a.t(x9, i10), (C1422k) this.f2618A.f24886r);
        }
        return p110k9.y.f19095a;
    }
}
