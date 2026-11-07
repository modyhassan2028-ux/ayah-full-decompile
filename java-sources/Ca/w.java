package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f869b;

    public w(long j, long j10) {
        this.f868a = j;
        this.f869b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f868a == wVar.f868a && this.f869b == wVar.f869b;
    }

    public final int hashCode() {
        return (((int) this.f868a) * 31) + ((int) this.f869b);
    }

    public final String toString() {
        return "Validity(notBefore=" + this.f868a + ", notAfter=" + this.f869b + ')';
    }
}
