package p187t0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22580b;

    public s(float f3, float f7) {
        this.f22579a = f3;
        this.f22580b = f7;
    }

    public final float[] a() {
        float f3 = this.f22579a;
        float f7 = this.f22580b;
        return new float[]{f3 / f7, 1.0f, ((1.0f - f3) - f7) / f7};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f22579a, sVar.f22579a) == 0 && Float.compare(this.f22580b, sVar.f22580b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22580b) + (Float.floatToIntBits(this.f22579a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f22579a);
        sb.append(", y=");
        return c.v(sb, this.f22580b, ')');
    }
}
