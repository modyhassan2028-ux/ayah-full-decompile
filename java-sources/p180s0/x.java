package p180s0;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21850a;

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f21850a == ((x) obj).f21850a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21850a;
    }

    public final String toString() {
        int i10 = this.f21850a;
        if (i10 == 0) {
            return "Argb8888";
        }
        if (i10 == 1) {
            return "Alpha8";
        }
        if (i10 == 2) {
            return "Rgb565";
        }
        if (i10 == 3) {
            return "F16";
        }
        return i10 == 4 ? "Gpu" : "Unknown";
    }
}
