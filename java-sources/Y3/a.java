package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p050e8.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10389e;

    public a(int i10) {
        this.f10389e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f10389e == ((a) obj).f10389e;
    }

    public final int hashCode() {
        return this.f10389e;
    }

    public final String toString() {
        return p245z2.a.B(this.f10389e, "Bookmarked(color=", ")");
    }
}
