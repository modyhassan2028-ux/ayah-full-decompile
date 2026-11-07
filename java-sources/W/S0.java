package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.r f8808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f8809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f8810t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8811u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f8812v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(l0.r rVar, long j, long j10, int i10, float f3, int i11) {
        super(2);
        this.f8808r = rVar;
        this.f8809s = j;
        this.f8810t = j10;
        this.f8811u = i10;
        this.f8812v = f3;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = C0672b.y(7);
        T0.c(this.f8808r, this.f8809s, this.f8810t, this.f8811u, this.f8812v, (C0698o) obj, iY);
        return p110k9.y.f19095a;
    }
}
