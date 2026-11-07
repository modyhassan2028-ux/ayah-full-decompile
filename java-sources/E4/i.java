package E4;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1873a;

    public i(int i10) {
        this.f1873a = i10;
    }

    @Override // E4.j
    public final int a() {
        return this.f1873a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f1873a == ((i) obj).f1873a;
    }

    public final int hashCode() {
        return this.f1873a;
    }

    public final String toString() {
        return p245z2.a.B(this.f1873a, "Tafseer(ayahId=", ")");
    }
}
