package p224x0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class p extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24268f;

    public p(float f3, float f7, float f10, float f11) {
        super(2);
        this.f24265c = f3;
        this.f24266d = f7;
        this.f24267e = f10;
        this.f24268f = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f24265c, pVar.f24265c) == 0 && Float.compare(this.f24266d, pVar.f24266d) == 0 && Float.compare(this.f24267e, pVar.f24267e) == 0 && Float.compare(this.f24268f, pVar.f24268f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24268f) + c.n(c.n(Float.floatToIntBits(this.f24265c) * 31, this.f24266d, 31), this.f24267e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f24265c);
        sb.append(", y1=");
        sb.append(this.f24266d);
        sb.append(", x2=");
        sb.append(this.f24267e);
        sb.append(", y2=");
        return c.v(sb, this.f24268f, ')');
    }
}
