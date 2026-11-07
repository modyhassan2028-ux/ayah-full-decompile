package p055f1;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15927a;

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f15927a == ((s) obj).f15927a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15927a;
    }

    public final String toString() {
        int i10 = this.f15927a;
        if (i10 == 1) {
            return "Linearity.Linear";
        }
        if (i10 == 2) {
            return "Linearity.FontHinting";
        }
        return i10 == 3 ? "Linearity.None" : "Invalid";
    }
}
