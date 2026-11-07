package z3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24793b;

    public h(int i10, boolean z10) {
        this.f24792a = i10;
        this.f24793b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f24792a == hVar.f24792a && this.f24793b == hVar.f24793b;
    }

    public final int hashCode() {
        return (this.f24792a * 31) + (this.f24793b ? 1231 : 1237);
    }

    public final String toString() {
        return "SelectedAyah(ayahId=" + this.f24792a + ", isProgrammatic=" + this.f24793b + ")";
    }
}
