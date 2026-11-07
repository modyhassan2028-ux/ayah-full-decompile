package W;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8767d;

    public Q(long j, long j10, long j11, long j12) {
        this.f8764a = j;
        this.f8765b = j10;
        this.f8766c = j11;
        this.f8767d = j12;
    }

    public final Q a(long j, long j10, long j11, long j12) {
        if (j == 16) {
            j = this.f8764a;
        }
        return new Q(j, j10 != 16 ? j10 : this.f8765b, j11 != 16 ? j11 : this.f8766c, j12 != 16 ? j12 : this.f8767d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return p180s0.q.c(this.f8764a, q10.f8764a) && p180s0.q.c(this.f8765b, q10.f8765b) && p180s0.q.c(this.f8766c, q10.f8766c) && p180s0.q.c(this.f8767d, q10.f8767d);
    }

    public final int hashCode() {
        int i10 = p180s0.q.f21844h;
        return p110k9.t.a(this.f8767d) + p123m2.c.o(p123m2.c.o(p110k9.t.a(this.f8764a) * 31, 31, this.f8765b), 31, this.f8766c);
    }
}
