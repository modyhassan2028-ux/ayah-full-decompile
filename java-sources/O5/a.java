package O5;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6493a;

    public a(int i10) {
        this.f6493a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6493a == ((a) obj).f6493a;
    }

    public final int hashCode() {
        return this.f6493a;
    }

    public final String toString() {
        return p245z2.a.B(this.f6493a, "JuzRow(juzNumber=", ")");
    }
}
