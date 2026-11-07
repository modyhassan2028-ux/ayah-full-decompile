package p246z4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24816a;

    public e(long j) {
        this.f24816a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f24816a == ((e) obj).f24816a;
    }

    public final int hashCode() {
        long j = this.f24816a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Stop(currentSystemTimeInMillis=" + this.f24816a + ")";
    }
}
