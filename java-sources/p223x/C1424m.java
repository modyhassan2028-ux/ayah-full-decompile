package p223x;

/* JADX INFO: renamed from: x.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1424m extends AbstractC1427p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f24037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24038b;

    public C1424m(float f3, float f7) {
        this.f24037a = f3;
        this.f24038b = f7;
    }

    @Override // p223x.AbstractC1427p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f24037a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f24038b;
    }

    @Override // p223x.AbstractC1427p
    public final int b() {
        return 2;
    }

    @Override // p223x.AbstractC1427p
    public final AbstractC1427p c() {
        return new C1424m(0.0f, 0.0f);
    }

    @Override // p223x.AbstractC1427p
    public final void d() {
        this.f24037a = 0.0f;
        this.f24038b = 0.0f;
    }

    @Override // p223x.AbstractC1427p
    public final void e(int i10, float f3) {
        if (i10 == 0) {
            this.f24037a = f3;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f24038b = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1424m)) {
            return false;
        }
        C1424m c1424m = (C1424m) obj;
        return c1424m.f24037a == this.f24037a && c1424m.f24038b == this.f24038b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24038b) + (Float.floatToIntBits(this.f24037a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f24037a + ", v2 = " + this.f24038b;
    }
}
