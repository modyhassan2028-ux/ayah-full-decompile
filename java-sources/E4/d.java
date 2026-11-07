package E4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1859b;

    public d(int i10, boolean z10) {
        this.f1858a = i10;
        this.f1859b = z10;
    }

    @Override // E4.j
    public final int a() {
        return this.f1858a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1858a == dVar.f1858a && this.f1859b == dVar.f1859b;
    }

    public final int hashCode() {
        return (this.f1858a * 31) + (this.f1859b ? 1231 : 1237);
    }

    public final String toString() {
        return "Favorite(ayahId=" + this.f1858a + ", newStarredState=" + this.f1859b + ")";
    }
}
