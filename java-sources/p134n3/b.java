package p134n3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19986b;

    public b(int i10, int i11) {
        this.f19985a = i10;
        this.f19986b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19985a == bVar.f19985a && this.f19986b == bVar.f19986b;
    }

    public final int hashCode() {
        return (this.f19985a * 31) + this.f19986b;
    }

    public final String toString() {
        return "ChapterHeader(pageNumber=" + this.f19985a + ", chapterNumber=" + this.f19986b + ")";
    }
}
