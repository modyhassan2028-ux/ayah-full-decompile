package p055f1;

import p002a1.a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f15901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f15902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f15903d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15904a;

    static {
        a(0.0f);
        a(0.5f);
        f15901b = 0.5f;
        a(-1.0f);
        f15902c = -1.0f;
        a(1.0f);
        f15903d = 1.0f;
    }

    public static void a(float f3) {
        if ((0.0f > f3 || f3 > 1.0f) && f3 != -1.0f) {
            a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f3) {
        if (f3 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f3 == f15901b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f3 == f15902c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f3 == f15903d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f15904a, ((f) obj).f15904a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15904a);
    }

    public final String toString() {
        return b(this.f15904a);
    }
}
