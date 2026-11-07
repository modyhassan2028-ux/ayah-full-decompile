package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class x extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24294f;

    public x(float f3, float f7, float f10, float f11) {
        super(2);
        this.f24291c = f3;
        this.f24292d = f7;
        this.f24293e = f10;
        this.f24294f = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f24291c, xVar.f24291c) == 0 && Float.compare(this.f24292d, xVar.f24292d) == 0 && Float.compare(this.f24293e, xVar.f24293e) == 0 && Float.compare(this.f24294f, xVar.f24294f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24294f) + c.n(c.n(Float.floatToIntBits(this.f24291c) * 31, this.f24292d, 31), this.f24293e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f24291c);
        sb.append(", dy1=");
        sb.append(this.f24292d);
        sb.append(", dx2=");
        sb.append(this.f24293e);
        sb.append(", dy2=");
        return c.v(sb, this.f24294f, ')');
    }
}
