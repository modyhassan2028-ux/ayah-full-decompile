package p246z4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24815b;

    public d(long j, int i10) {
        this.f24814a = i10;
        this.f24815b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f24814a == dVar.f24814a && this.f24815b == dVar.f24815b;
    }

    public final int hashCode() {
        int i10 = this.f24814a * 31;
        long j = this.f24815b;
        return i10 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SeekForward(timestamp=" + this.f24814a + ", currentSystemTimeInMillis=" + this.f24815b + ")";
    }
}
