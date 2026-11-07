package W;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8577f;

    public H0(long j, long j10, long j11, long j12, long j13, long j14) {
        this.f8572a = j;
        this.f8573b = j10;
        this.f8574c = j11;
        this.f8575d = j12;
        this.f8576e = j13;
        this.f8577f = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H0)) {
            return false;
        }
        H0 h7 = (H0) obj;
        return p180s0.q.c(this.f8572a, h7.f8572a) && p180s0.q.c(this.f8573b, h7.f8573b) && p180s0.q.c(this.f8574c, h7.f8574c) && p180s0.q.c(this.f8575d, h7.f8575d) && p180s0.q.c(this.f8576e, h7.f8576e) && p180s0.q.c(this.f8577f, h7.f8577f);
    }

    public final int hashCode() {
        int i10 = p180s0.q.f21844h;
        return p110k9.t.a(this.f8577f) + p123m2.c.o(p123m2.c.o(p123m2.c.o(p123m2.c.o(p110k9.t.a(this.f8572a) * 31, 31, this.f8573b), 31, this.f8574c), 31, this.f8575d), 31, this.f8576e);
    }
}
