package W;

/* JADX INFO: renamed from: W.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0618z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9475d;

    public C0618z0(long j, long j10, long j11, long j12) {
        this.f9472a = j;
        this.f9473b = j10;
        this.f9474c = j11;
        this.f9475d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0618z0)) {
            return false;
        }
        C0618z0 c0618z0 = (C0618z0) obj;
        return p180s0.q.c(this.f9472a, c0618z0.f9472a) && p180s0.q.c(this.f9473b, c0618z0.f9473b) && p180s0.q.c(this.f9474c, c0618z0.f9474c) && p180s0.q.c(this.f9475d, c0618z0.f9475d);
    }

    public final int hashCode() {
        int i10 = p180s0.q.f21844h;
        return p110k9.t.a(this.f9475d) + p123m2.c.o(p123m2.c.o(p110k9.t.a(this.f9472a) * 31, 31, this.f9473b), 31, this.f9474c);
    }
}
