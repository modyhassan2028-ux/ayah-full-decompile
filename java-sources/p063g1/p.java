package p063g1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16268a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f16268a == ((p) obj).f16268a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16268a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f16268a;
        if (a(j, 0L)) {
            return "Unspecified";
        }
        if (a(j, 4294967296L)) {
            return "Sp";
        }
        return a(j, 8589934592L) ? "Em" : "Invalid";
    }
}
