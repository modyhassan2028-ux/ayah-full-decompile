package W;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f8686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f8688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f8689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f8690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p196u0.g f8691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f8692x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(p241y9.a aVar, int i10, float f3, float f7, long j, p196u0.g gVar, long j10) {
        super(1);
        this.f8686r = aVar;
        this.f8687s = i10;
        this.f8688t = f3;
        this.f8689u = f7;
        this.f8690v = j;
        this.f8691w = gVar;
        this.f8692x = j10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p196u0.d dVar = (p196u0.d) obj;
        float fFloatValue = ((Number) this.f8686r.invoke()).floatValue() * 360.0f;
        int i10 = this.f8687s;
        float f3 = this.f8688t;
        if (i10 != 0 && p171r0.i.b(dVar.b()) <= p171r0.i.d(dVar.b())) {
            f3 += this.f8689u;
        }
        float fD0 = (f3 / ((float) (((double) dVar.d0(p171r0.i.d(dVar.b()))) * 3.141592653589793d))) * 360.0f;
        float fMin = Math.min(fFloatValue, fD0) + 270.0f + fFloatValue;
        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fD0) * 2);
        long j = this.f8690v;
        p196u0.g gVar = this.f8691w;
        T0.e(dVar, fMin, fMin2, j, gVar);
        T0.e(dVar, 270.0f, fFloatValue, this.f8692x, gVar);
        return p110k9.y.f19095a;
    }
}
