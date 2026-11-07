package p134n3;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20005b;

    public j(int i10, int i11) {
        this.f20004a = i10;
        this.f20005b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f20004a == jVar.f20004a && this.f20005b == jVar.f20005b;
    }

    public final int hashCode() {
        return (this.f20004a * 31) + this.f20005b;
    }

    public final String toString() {
        return "Emphasis(location=" + this.f20004a + ", length=" + this.f20005b + ")";
    }
}
