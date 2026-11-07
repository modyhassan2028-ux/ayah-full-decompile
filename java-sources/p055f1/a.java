package p055f1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15894a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f15894a, ((a) obj).f15894a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15894a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f15894a + ')';
    }
}
