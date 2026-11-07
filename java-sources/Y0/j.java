package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10356a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f10356a == ((j) obj).f10356a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10356a;
    }

    public final String toString() {
        int i10 = this.f10356a;
        if (i10 == 0) {
            return "Normal";
        }
        return i10 == 1 ? "Italic" : "Invalid";
    }
}
