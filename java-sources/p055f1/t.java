package p055f1;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f15928c = new t(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f15929d = new t(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15931b;

    public t(int i10, boolean z10) {
        this.f15930a = i10;
        this.f15931b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f15930a == tVar.f15930a && this.f15931b == tVar.f15931b;
    }

    public final int hashCode() {
        return (this.f15930a * 31) + (this.f15931b ? 1231 : 1237);
    }

    public final String toString() {
        if (equals(f15928c)) {
            return "TextMotion.Static";
        }
        return equals(f15929d) ? "TextMotion.Animated" : "Invalid";
    }
}
