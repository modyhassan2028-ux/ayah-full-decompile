package W;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f8497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f8498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f8499t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(float f3, boolean z10, boolean z11) {
        super(1);
        this.f8497r = z10;
        this.f8498s = z11;
        this.f8499t = f3;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        X.u uVar = (X.u) obj;
        uVar.a(I1.f8597t, 0.0f);
        boolean z10 = this.f8497r;
        boolean z11 = this.f8498s;
        float f3 = this.f8499t;
        if (z10) {
            uVar.a(I1.f8595r, z11 ? -f3 : f3);
        }
        if (!z11) {
            f3 = -f3;
        }
        uVar.a(I1.f8596s, f3);
        return p110k9.y.f19095a;
    }
}
