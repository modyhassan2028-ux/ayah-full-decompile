package l0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19324a;

    public h(float f3) {
        this.f19324a = f3;
    }

    @Override // l0.d
    public final int a(int i10, int i11, p063g1.m mVar) {
        float f3 = (i11 - i10) / 2.0f;
        p063g1.m mVar2 = p063g1.m.f16261r;
        float f7 = this.f19324a;
        if (mVar != mVar2) {
            f7 *= -1;
        }
        return Math.round((1 + f7) * f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f19324a, ((h) obj).f19324a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19324a);
    }

    public final String toString() {
        return p123m2.c.v(new StringBuilder("Horizontal(bias="), this.f19324a, ')');
    }
}
