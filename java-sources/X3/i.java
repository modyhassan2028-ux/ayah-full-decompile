package X3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9940a;

    public i(int i10) {
        this.f9940a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f9940a == ((i) obj).f9940a;
    }

    public final int hashCode() {
        return this.f9940a;
    }

    public final String toString() {
        return p245z2.a.B(this.f9940a, "SelectAyah(ayahId=", ")");
    }
}
