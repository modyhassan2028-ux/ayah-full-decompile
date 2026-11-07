package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24254f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24255h;

    public k(float f3, float f7, float f10, float f11, float f12, float f13) {
        super(2);
        this.f24251c = f3;
        this.f24252d = f7;
        this.f24253e = f10;
        this.f24254f = f11;
        this.g = f12;
        this.f24255h = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f24251c, kVar.f24251c) == 0 && Float.compare(this.f24252d, kVar.f24252d) == 0 && Float.compare(this.f24253e, kVar.f24253e) == 0 && Float.compare(this.f24254f, kVar.f24254f) == 0 && Float.compare(this.g, kVar.g) == 0 && Float.compare(this.f24255h, kVar.f24255h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24255h) + c.n(c.n(c.n(c.n(Float.floatToIntBits(this.f24251c) * 31, this.f24252d, 31), this.f24253e, 31), this.f24254f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f24251c);
        sb.append(", y1=");
        sb.append(this.f24252d);
        sb.append(", x2=");
        sb.append(this.f24253e);
        sb.append(", y2=");
        sb.append(this.f24254f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return c.v(sb, this.f24255h, ')');
    }
}
