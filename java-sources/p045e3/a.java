package p045e3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15757b;

    public a(int i10, boolean z10) {
        this.f15756a = i10;
        this.f15757b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15756a == aVar.f15756a && this.f15757b == aVar.f15757b;
    }

    public final int hashCode() {
        return (((this.f15756a * 31) + (this.f15757b ? 1231 : 1237)) * 31) + 1231;
    }

    public final String toString() {
        return "HighlightInfo(ayahId=" + this.f15756a + ", isHighlighted=" + this.f15757b + ", isForAudio=true)";
    }
}
