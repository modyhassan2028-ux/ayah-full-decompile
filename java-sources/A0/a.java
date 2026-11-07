package A0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f458a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f458a == ((a) obj).f458a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f458a;
    }

    public final String toString() {
        int i10 = this.f458a;
        if (i10 == 1) {
            return "Touch";
        }
        return i10 == 2 ? "Keyboard" : "Error";
    }
}
