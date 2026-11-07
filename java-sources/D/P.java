package D;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f911d;

    public P(float f3, float f7, float f10, float f11) {
        this.f908a = f3;
        this.f909b = f7;
        this.f910c = f10;
        this.f911d = f11;
        if (!((f3 >= 0.0f) & (f7 >= 0.0f) & (f10 >= 0.0f)) || !(f11 >= 0.0f)) {
            E.a.a("Padding must be non-negative");
        }
    }

    public final float a(p063g1.m mVar) {
        return mVar == p063g1.m.f16261r ? this.f908a : this.f910c;
    }

    public final float b(p063g1.m mVar) {
        return mVar == p063g1.m.f16261r ? this.f910c : this.f908a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return p063g1.f.a(this.f908a, p10.f908a) && p063g1.f.a(this.f909b, p10.f909b) && p063g1.f.a(this.f910c, p10.f910c) && p063g1.f.a(this.f911d, p10.f911d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f911d) + p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f908a) * 31, this.f909b, 31), this.f910c, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) p063g1.f.b(this.f908a)) + ", top=" + ((Object) p063g1.f.b(this.f909b)) + ", end=" + ((Object) p063g1.f.b(this.f910c)) + ", bottom=" + ((Object) p063g1.f.b(this.f911d)) + ')';
    }
}
