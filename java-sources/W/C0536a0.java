package W;

/* JADX INFO: renamed from: W.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0536a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8961e;

    public C0536a0(float f3, float f7, float f10, float f11, float f12, float f13) {
        this.f8957a = f3;
        this.f8958b = f7;
        this.f8959c = f10;
        this.f8960d = f11;
        this.f8961e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0536a0)) {
            return false;
        }
        C0536a0 c0536a0 = (C0536a0) obj;
        return p063g1.f.a(this.f8957a, c0536a0.f8957a) && p063g1.f.a(this.f8958b, c0536a0.f8958b) && p063g1.f.a(this.f8959c, c0536a0.f8959c) && p063g1.f.a(this.f8960d, c0536a0.f8960d) && p063g1.f.a(this.f8961e, c0536a0.f8961e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8961e) + p123m2.c.n(p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f8957a) * 31, this.f8958b, 31), this.f8959c, 31), this.f8960d, 31);
    }
}
