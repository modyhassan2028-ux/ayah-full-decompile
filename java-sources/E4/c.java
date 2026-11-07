package E4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1857a;

    public c(int i10) {
        this.f1857a = i10;
    }

    @Override // E4.j
    public final int a() {
        return this.f1857a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f1857a == ((c) obj).f1857a;
    }

    public final int hashCode() {
        return this.f1857a;
    }

    public final String toString() {
        return p245z2.a.B(this.f1857a, "CompleteKhatmahDay(ayahId=", ")");
    }
}
