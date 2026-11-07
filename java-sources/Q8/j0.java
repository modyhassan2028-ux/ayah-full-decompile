package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7031c;

    public /* synthetic */ j0(int i10, long j, long j10, long j11) {
        if (1 != (i10 & 1)) {
            Y9.M.e(i10, 1, h0.f7009a.d());
            throw null;
        }
        this.f7029a = j;
        this.f7030b = (i10 & 2) == 0 ? ((long) 1000) * j : j10;
        if ((i10 & 4) == 0) {
            this.f7031c = j / ((long) 1000);
        } else {
            this.f7031c = j11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f7029a == ((j0) obj).f7029a;
    }

    public final int hashCode() {
        long j = this.f7029a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.f7029a + ')';
    }

    public j0(long j) {
        this.f7029a = j;
        long j10 = 1000;
        this.f7030b = j * j10;
        this.f7031c = j / j10;
    }
}
