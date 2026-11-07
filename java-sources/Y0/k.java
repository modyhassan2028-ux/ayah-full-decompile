package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10357a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f10357a == ((k) obj).f10357a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10357a;
    }

    public final String toString() {
        int i10 = this.f10357a;
        if (i10 == 0) {
            return "None";
        }
        if (i10 == 1) {
            return "Weight";
        }
        if (i10 == 2) {
            return "Style";
        }
        return i10 == 65535 ? "All" : "Invalid";
    }
}
