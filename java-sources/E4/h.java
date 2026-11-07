package E4;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1872c;

    public h(int i10, int i11, int i12) {
        this.f1870a = i10;
        this.f1871b = i11;
        this.f1872c = i12;
    }

    @Override // E4.j
    public final int a() {
        return this.f1870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f1870a == hVar.f1870a && this.f1871b == hVar.f1871b && this.f1872c == hVar.f1872c;
    }

    public final int hashCode() {
        return (((this.f1870a * 31) + this.f1871b) * 31) + this.f1872c;
    }

    public final String toString() {
        return p245z2.a.E(p123m2.c.x("Share(ayahId=", this.f1870a, ", sura=", this.f1871b, ", ayah="), this.f1872c, ")");
    }
}
