package W;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f8785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z.L0 f8786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f8787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Z.L0 f8788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f8789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Z.L0 f8790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Z.L0 f8791y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(int i10, float f3, p223x.D d5, long j, p223x.D d9, long j10, p223x.D d10, p223x.D d11) {
        super(1);
        this.f8784r = i10;
        this.f8785s = f3;
        this.f8786t = d5;
        this.f8787u = j;
        this.f8788v = d9;
        this.f8789w = j10;
        this.f8790x = d10;
        this.f8791y = d11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p196u0.d dVar = (p196u0.d) obj;
        float fB = p171r0.i.b(dVar.b());
        int i10 = this.f8784r;
        float fD0 = this.f8785s;
        if (i10 != 0 && p171r0.i.b(dVar.b()) <= p171r0.i.d(dVar.b())) {
            fD0 += dVar.d0(fB);
        }
        float fD1 = fD0 / dVar.d0(p171r0.i.d(dVar.b()));
        Z.L0 l10 = this.f8786t;
        if (((Number) l10.getValue()).floatValue() < 1.0f - fD1) {
            T0.d(dVar, ((Number) l10.getValue()).floatValue() > 0.0f ? ((Number) l10.getValue()).floatValue() + fD1 : 0.0f, 1.0f, this.f8787u, fB, this.f8784r);
        }
        float fFloatValue = ((Number) l10.getValue()).floatValue();
        Z.L0 l11 = this.f8788v;
        if (fFloatValue - ((Number) l11.getValue()).floatValue() > 0.0f) {
            T0.d(dVar, ((Number) l10.getValue()).floatValue(), ((Number) l11.getValue()).floatValue(), this.f8789w, fB, this.f8784r);
        }
        float fFloatValue2 = ((Number) l11.getValue()).floatValue();
        Z.L0 l12 = this.f8790x;
        if (fFloatValue2 > fD1) {
            T0.d(dVar, ((Number) l12.getValue()).floatValue() > 0.0f ? ((Number) l12.getValue()).floatValue() + fD1 : 0.0f, ((Number) l11.getValue()).floatValue() < 1.0f ? ((Number) l11.getValue()).floatValue() - fD1 : 1.0f, this.f8787u, fB, this.f8784r);
        }
        float fFloatValue3 = ((Number) l12.getValue()).floatValue();
        Z.L0 l13 = this.f8791y;
        if (fFloatValue3 - ((Number) l13.getValue()).floatValue() > 0.0f) {
            T0.d(dVar, ((Number) l12.getValue()).floatValue(), ((Number) l13.getValue()).floatValue(), this.f8789w, fB, this.f8784r);
        }
        if (((Number) l13.getValue()).floatValue() > fD1) {
            T0.d(dVar, 0.0f, ((Number) l13.getValue()).floatValue() < 1.0f ? ((Number) l13.getValue()).floatValue() - fD1 : 1.0f, this.f8787u, fB, this.f8784r);
        }
        return p110k9.y.f19095a;
    }
}
