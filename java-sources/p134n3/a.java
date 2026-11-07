package p134n3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19984b;

    public a(int i10, int i11) {
        this.f19983a = i10;
        this.f19984b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19983a == aVar.f19983a && this.f19984b == aVar.f19984b;
    }

    public final int hashCode() {
        return (this.f19983a * 31) + this.f19984b;
    }

    public final String toString() {
        return "Basmalah(pageNumber=" + this.f19983a + ", chapterNumber=" + this.f19984b + ")";
    }
}
