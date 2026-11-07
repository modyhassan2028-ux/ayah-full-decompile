package p246z4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24813b;

    public c(long j, int i10) {
        this.f24812a = i10;
        this.f24813b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24812a == cVar.f24812a && this.f24813b == cVar.f24813b;
    }

    public final int hashCode() {
        int i10 = this.f24812a * 31;
        long j = this.f24813b;
        return i10 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SeekBackward(timestamp=" + this.f24812a + ", currentSystemTimeInMillis=" + this.f24813b + ")";
    }
}
