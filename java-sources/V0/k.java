package V0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8373c;

    public k(int i10, int i11, boolean z10) {
        this.f8371a = i10;
        this.f8372b = i11;
        this.f8373c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f8371a == kVar.f8371a && this.f8372b == kVar.f8372b && this.f8373c == kVar.f8373c;
    }

    public final int hashCode() {
        return (((this.f8371a * 31) + this.f8372b) * 31) + (this.f8373c ? 1231 : 1237);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f8371a + ", end=" + this.f8372b + ", isRtl=" + this.f8373c + ')';
    }
}
