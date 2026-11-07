package p246z4;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24811b;

    public b(long j, boolean z10) {
        this.f24810a = z10;
        this.f24811b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24810a == bVar.f24810a && this.f24811b == bVar.f24811b;
    }

    public final int hashCode() {
        int i10 = this.f24810a ? 1231 : 1237;
        long j = this.f24811b;
        return (i10 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Play(isRepeating=" + this.f24810a + ", currentSystemTimeInMillis=" + this.f24811b + ")";
    }
}
