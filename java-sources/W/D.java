package W;

import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f8485A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f8486B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f8487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f8488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f8489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f8490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p180s0.J f8491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f8492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f8493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f8494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f8495z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(P p10, float f3, float f7, boolean z10, p180s0.J j, long j10, long j11, float f10, float f11, p241y9.e eVar, p074h0.d dVar) {
        super(2);
        this.f8487r = p10;
        this.f8488s = f3;
        this.f8489t = f7;
        this.f8490u = z10;
        this.f8491v = j;
        this.f8492w = j10;
        this.f8493x = j11;
        this.f8494y = f10;
        this.f8495z = f11;
        this.f8485A = eVar;
        this.f8486B = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            V0.l(this.f8487r.f8750a, this.f8488s, this.f8489t, this.f8490u, this.f8491v, this.f8492w, this.f8493x, this.f8494y, this.f8495z, this.f8485A, this.f8486B, c0698o, 0, 0);
        }
        return p110k9.y.f19095a;
    }
}
