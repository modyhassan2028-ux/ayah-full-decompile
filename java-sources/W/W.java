package W;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8889e;

    public W(float f3, float f7, float f10, float f11, float f12) {
        this.f8885a = f3;
        this.f8886b = f7;
        this.f8887c = f10;
        this.f8888d = f11;
        this.f8889e = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof W)) {
            return false;
        }
        W w9 = (W) obj;
        return p063g1.f.a(this.f8885a, w9.f8885a) && p063g1.f.a(this.f8886b, w9.f8886b) && p063g1.f.a(this.f8887c, w9.f8887c) && p063g1.f.a(this.f8888d, w9.f8888d) && p063g1.f.a(this.f8889e, w9.f8889e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8889e) + p123m2.c.n(p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f8885a) * 31, this.f8886b, 31), this.f8887c, 31), this.f8888d, 31);
    }
}
