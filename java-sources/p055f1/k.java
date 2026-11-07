package p055f1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15912a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Left";
        }
        if (i10 == 2) {
            return "Right";
        }
        if (i10 == 3) {
            return "Center";
        }
        if (i10 == 4) {
            return "Justify";
        }
        if (i10 == 5) {
            return "Start";
        }
        if (i10 == 6) {
            return "End";
        }
        return i10 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f15912a == ((k) obj).f15912a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15912a;
    }

    public final String toString() {
        return a(this.f15912a);
    }
}
