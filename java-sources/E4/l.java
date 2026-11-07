package E4;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1875a;

    public l(int i10) {
        this.f1875a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f1875a == ((l) obj).f1875a;
    }

    public final int hashCode() {
        return this.f1875a;
    }

    public final String toString() {
        return p245z2.a.B(this.f1875a, "NoteEvent(ayahId=", ")");
    }
}
