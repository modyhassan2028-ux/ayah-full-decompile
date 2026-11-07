package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24274f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f24276i;

    public r(float f3, float f7, float f10, boolean z10, boolean z11, float f11, float f12) {
        super(3);
        this.f24271c = f3;
        this.f24272d = f7;
        this.f24273e = f10;
        this.f24274f = z10;
        this.g = z11;
        this.f24275h = f11;
        this.f24276i = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f24271c, rVar.f24271c) == 0 && Float.compare(this.f24272d, rVar.f24272d) == 0 && Float.compare(this.f24273e, rVar.f24273e) == 0 && this.f24274f == rVar.f24274f && this.g == rVar.g && Float.compare(this.f24275h, rVar.f24275h) == 0 && Float.compare(this.f24276i, rVar.f24276i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24276i) + c.n((((c.n(c.n(Float.floatToIntBits(this.f24271c) * 31, this.f24272d, 31), this.f24273e, 31) + (this.f24274f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31, this.f24275h, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f24271c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f24272d);
        sb.append(", theta=");
        sb.append(this.f24273e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f24274f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.f24275h);
        sb.append(", arcStartDy=");
        return c.v(sb, this.f24276i, ')');
    }
}
