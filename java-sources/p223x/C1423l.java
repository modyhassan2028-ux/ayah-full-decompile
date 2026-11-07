package p223x;

/* JADX INFO: renamed from: x.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1423l extends AbstractC1427p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f24036a;

    public C1423l(float f3) {
        this.f24036a = f3;
    }

    @Override // p223x.AbstractC1427p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f24036a;
        }
        return 0.0f;
    }

    @Override // p223x.AbstractC1427p
    public final int b() {
        return 1;
    }

    @Override // p223x.AbstractC1427p
    public final AbstractC1427p c() {
        return new C1423l(0.0f);
    }

    @Override // p223x.AbstractC1427p
    public final void d() {
        this.f24036a = 0.0f;
    }

    @Override // p223x.AbstractC1427p
    public final void e(int i10, float f3) {
        if (i10 == 0) {
            this.f24036a = f3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1423l) && ((C1423l) obj).f24036a == this.f24036a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24036a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f24036a;
    }
}
