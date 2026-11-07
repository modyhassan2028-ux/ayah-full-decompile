package p063g1;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f16252r;

    public static final boolean a(float f3, float f7) {
        return Float.compare(f3, f7) == 0;
    }

    public static String b(float f3) {
        if (Float.isNaN(f3)) {
            return "Dp.Unspecified";
        }
        return f3 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f16252r, ((f) obj).f16252r);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f16252r, ((f) obj).f16252r) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16252r);
    }

    public final String toString() {
        return b(this.f16252r);
    }
}
