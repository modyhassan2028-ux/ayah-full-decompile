package J0;

/* JADX INFO: renamed from: J0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0292o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4155d;

    public C0292o(float f3, float f7, float f10, float f11) {
        this.f4152a = f3;
        this.f4153b = f7;
        this.f4154c = f10;
        this.f4155d = f11;
        if (f3 < 0.0f) {
            G0.a.a("Left must be non-negative");
        }
        if (f7 < 0.0f) {
            G0.a.a("Top must be non-negative");
        }
        if (f10 < 0.0f) {
            G0.a.a("Right must be non-negative");
        }
        if (f11 >= 0.0f) {
            return;
        }
        G0.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292o)) {
            return false;
        }
        C0292o c0292o = (C0292o) obj;
        return p063g1.f.a(this.f4152a, c0292o.f4152a) && p063g1.f.a(this.f4153b, c0292o.f4153b) && p063g1.f.a(this.f4154c, c0292o.f4154c) && p063g1.f.a(this.f4155d, c0292o.f4155d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f4155d) + p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f4152a) * 31, this.f4153b, 31), this.f4154c, 31)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) p063g1.f.b(this.f4152a)) + ", top=" + ((Object) p063g1.f.b(this.f4153b)) + ", end=" + ((Object) p063g1.f.b(this.f4154c)) + ", bottom=" + ((Object) p063g1.f.b(this.f4155d)) + ", isLayoutDirectionAware=true)";
    }
}
