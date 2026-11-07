package Z5;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11006b;

    public a(int i10, boolean z10) {
        this.f11005a = i10;
        this.f11006b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11005a == aVar.f11005a && this.f11006b == aVar.f11006b;
    }

    public final int hashCode() {
        return (this.f11005a * 31) + (this.f11006b ? 1231 : 1237);
    }

    public final String toString() {
        return "BookProgressCallback(progress=" + this.f11005a + ", isIndeterminate=" + this.f11006b + ")";
    }
}
