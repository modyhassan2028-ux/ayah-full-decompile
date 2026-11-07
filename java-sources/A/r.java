package A;

/* JADX INFO: loaded from: classes.dex */
public final class r implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0042s f396a;

    public r(C0042s c0042s) {
        this.f396a = c0042s;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [y9.c, z9.k] */
    @Override // A.C0
    public final float a(float f3) {
        if (Float.isNaN(f3)) {
            return 0.0f;
        }
        C0042s c0042s = this.f396a;
        float fFloatValue = ((Number) c0042s.f405a.e(Float.valueOf(f3))).floatValue();
        c0042s.f409e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c0042s.f410f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
