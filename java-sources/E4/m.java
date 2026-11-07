package E4;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1878c;

    public m(int i10, int i11, int i12) {
        this.f1876a = i10;
        this.f1877b = i11;
        this.f1878c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1876a == mVar.f1876a && this.f1877b == mVar.f1877b && this.f1878c == mVar.f1878c;
    }

    public final int hashCode() {
        return (((this.f1876a * 31) + this.f1877b) * 31) + this.f1878c;
    }

    public final String toString() {
        return p245z2.a.E(p123m2.c.x("ShareEvent(ayahId=", this.f1876a, ", sura=", this.f1877b, ", ayah="), this.f1878c, ")");
    }
}
