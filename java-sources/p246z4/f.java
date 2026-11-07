package p246z4;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24817a;

    public f(long j) {
        this.f24817a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f24817a == ((f) obj).f24817a;
    }

    public final int hashCode() {
        long j = this.f24817a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "UpdateStatus(currentSystemTimeInMillis=" + this.f24817a + ")";
    }
}
