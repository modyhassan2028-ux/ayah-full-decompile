package W;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f8741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p196u0.g f8742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z.L0 f8743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z.L0 f8744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Z.L0 f8745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Z.L0 f8746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f8747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f8748y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(long j, p196u0.g gVar, p223x.D d5, p223x.D d9, p223x.D d10, p223x.D d11, float f3, long j10) {
        super(1);
        this.f8741r = j;
        this.f8742s = gVar;
        this.f8743t = d5;
        this.f8744u = d9;
        this.f8745v = d10;
        this.f8746w = d11;
        this.f8747x = f3;
        this.f8748y = j10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        float f3;
        p196u0.d dVar = (p196u0.d) obj;
        long j = this.f8741r;
        p196u0.g gVar = this.f8742s;
        T0.e(dVar, 0.0f, 360.0f, j, gVar);
        float fFloatValue = (((Number) this.f8743t.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.f8744u.getValue()).floatValue();
        Z.L0 l10 = this.f8745v;
        float fAbs = Math.abs(fFloatValue2 - ((Number) l10.getValue()).floatValue());
        float fFloatValue3 = ((Number) l10.getValue()).floatValue() + ((Number) this.f8746w.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (gVar.f22803d == 0) {
            f3 = 0.0f;
        } else {
            f3 = ((this.f8747x / (T0.f8826e / 2)) * 57.29578f) / 2.0f;
        }
        T0.e(dVar, fFloatValue3 + f3, Math.max(fAbs, 0.1f), this.f8748y, gVar);
        return p110k9.y.f19095a;
    }
}
