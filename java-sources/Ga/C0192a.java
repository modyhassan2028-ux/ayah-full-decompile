package Ga;

/* JADX INFO: renamed from: Ga.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0192a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3005d;

    public C0192a(float f3, float f7, float f10, float f11) {
        this.f3002a = f3;
        this.f3003b = f7;
        this.f3004c = f10;
        this.f3005d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0192a)) {
            return false;
        }
        C0192a c0192a = (C0192a) obj;
        return Float.compare(this.f3002a, c0192a.f3002a) == 0 && Float.compare(this.f3003b, c0192a.f3003b) == 0 && Float.compare(this.f3004c, c0192a.f3004c) == 0 && Float.compare(this.f3005d, c0192a.f3005d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3005d) + p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f3002a) * 31, this.f3003b, 31), this.f3004c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsolutePixelPadding(start=");
        sb.append(this.f3002a);
        sb.append(", end=");
        sb.append(this.f3003b);
        sb.append(", top=");
        sb.append(this.f3004c);
        sb.append(", bottom=");
        return p123m2.c.v(sb, this.f3005d, ')');
    }
}
