package E4;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1879a;

    public n(int i10) {
        this.f1879a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f1879a == ((n) obj).f1879a;
    }

    public final int hashCode() {
        return this.f1879a;
    }

    public final String toString() {
        return p245z2.a.B(this.f1879a, "TafseerEvent(ayahId=", ")");
    }
}
