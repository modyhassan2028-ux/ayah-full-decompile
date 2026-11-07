package X3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9938a;

    public g(int i10) {
        this.f9938a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f9938a == ((g) obj).f9938a;
    }

    public final int hashCode() {
        return this.f9938a;
    }

    public final String toString() {
        return p245z2.a.B(this.f9938a, "HighlightSura(suraNumber=", ")");
    }
}
