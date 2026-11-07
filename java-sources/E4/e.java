package E4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1860a;

    public e(int i10) {
        this.f1860a = i10;
    }

    @Override // E4.j
    public final int a() {
        return this.f1860a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f1860a == ((e) obj).f1860a;
    }

    public final int hashCode() {
        return this.f1860a;
    }

    public final String toString() {
        return p245z2.a.B(this.f1860a, "Note(ayahId=", ")");
    }
}
