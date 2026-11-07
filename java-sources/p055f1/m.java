package p055f1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15917a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Ltr";
        }
        if (i10 == 2) {
            return "Rtl";
        }
        if (i10 == 3) {
            return "Content";
        }
        if (i10 == 4) {
            return "ContentOrLtr";
        }
        if (i10 == 5) {
            return "ContentOrRtl";
        }
        return i10 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f15917a == ((m) obj).f15917a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15917a;
    }

    public final String toString() {
        return a(this.f15917a);
    }
}
