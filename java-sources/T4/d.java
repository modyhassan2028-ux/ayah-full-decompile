package T4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7791b;

    public d(int i10, int i11) {
        this.f7790a = i10;
        this.f7791b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7790a == dVar.f7790a && this.f7791b == dVar.f7791b;
    }

    public final int hashCode() {
        return (this.f7790a * 31) + this.f7791b;
    }

    public final String toString() {
        return "Header(titleResource=" + this.f7790a + ", subtitleResource=" + this.f7791b + ")";
    }
}
