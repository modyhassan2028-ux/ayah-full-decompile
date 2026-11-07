package p134n3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20003b;

    public h(int i10, int i11) {
        this.f20002a = i10;
        this.f20003b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20002a == hVar.f20002a && this.f20003b == hVar.f20003b;
    }

    public final int hashCode() {
        return (this.f20002a * 31) + this.f20003b;
    }

    public final String toString() {
        return "Verse(pageNumber=" + this.f20002a + ", verseId=" + this.f20003b + ")";
    }
}
