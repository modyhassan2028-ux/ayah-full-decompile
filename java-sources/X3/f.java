package X3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9937a;

    public f(int i10) {
        this.f9937a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f9937a == ((f) obj).f9937a;
    }

    public final int hashCode() {
        return this.f9937a;
    }

    public final String toString() {
        return p245z2.a.B(this.f9937a, "HighlightAyah(ayahId=", ")");
    }
}
