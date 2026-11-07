package p055f1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15898a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Hyphens.None";
        }
        if (i10 == 2) {
            return "Hyphens.Auto";
        }
        return i10 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f15898a == ((d) obj).f15898a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15898a;
    }

    public final String toString() {
        return a(this.f15898a);
    }
}
