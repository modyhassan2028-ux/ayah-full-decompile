package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class o extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24264f;

    public o(float f3, float f7, float f10, float f11) {
        super(1);
        this.f24261c = f3;
        this.f24262d = f7;
        this.f24263e = f10;
        this.f24264f = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f24261c, oVar.f24261c) == 0 && Float.compare(this.f24262d, oVar.f24262d) == 0 && Float.compare(this.f24263e, oVar.f24263e) == 0 && Float.compare(this.f24264f, oVar.f24264f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24264f) + c.n(c.n(Float.floatToIntBits(this.f24261c) * 31, this.f24262d, 31), this.f24263e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f24261c);
        sb.append(", y1=");
        sb.append(this.f24262d);
        sb.append(", x2=");
        sb.append(this.f24263e);
        sb.append(", y2=");
        return c.v(sb, this.f24264f, ')');
    }
}
