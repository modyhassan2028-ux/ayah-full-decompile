package W;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8933d;

    public Z(long j, long j10, long j11, long j12) {
        this.f8930a = j;
        this.f8931b = j10;
        this.f8932c = j11;
        this.f8933d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return p180s0.q.c(this.f8930a, z10.f8930a) && p180s0.q.c(this.f8931b, z10.f8931b) && p180s0.q.c(this.f8932c, z10.f8932c) && p180s0.q.c(this.f8933d, z10.f8933d);
    }

    public final int hashCode() {
        int i10 = p180s0.q.f21844h;
        return p110k9.t.a(this.f8933d) + p123m2.c.o(p123m2.c.o(p110k9.t.a(this.f8930a) * 31, 31, this.f8931b), 31, this.f8932c);
    }
}
