package W;

/* JADX INFO: loaded from: classes.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8479a;

    public final boolean equals(Object obj) {
        if (obj instanceof B2) {
            return this.f8479a == ((B2) obj).f8479a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8479a;
    }

    public final String toString() {
        int i10 = this.f8479a;
        if (i10 == 0) {
            return "Hour";
        }
        return i10 == 1 ? "Minute" : "";
    }
}
