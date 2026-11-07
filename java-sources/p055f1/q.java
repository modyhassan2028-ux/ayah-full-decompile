package p055f1;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f15921c = new q(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15923b;

    public q(float f3, float f7) {
        this.f15922a = f3;
        this.f15923b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f15922a == qVar.f15922a && this.f15923b == qVar.f15923b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15923b) + (Float.floatToIntBits(this.f15922a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f15922a);
        sb.append(", skewX=");
        return c.v(sb, this.f15923b, ')');
    }
}
