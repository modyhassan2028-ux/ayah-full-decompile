package W;

/* JADX INFO: loaded from: classes.dex */
public final class E2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8533e;

    public E2(long j, long j10, long j11, long j12, long j13) {
        this.f8529a = j;
        this.f8530b = j10;
        this.f8531c = j11;
        this.f8532d = j12;
        this.f8533e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof E2)) {
            return false;
        }
        E2 e10 = (E2) obj;
        return p180s0.q.c(this.f8529a, e10.f8529a) && p180s0.q.c(this.f8530b, e10.f8530b) && p180s0.q.c(this.f8531c, e10.f8531c) && p180s0.q.c(this.f8532d, e10.f8532d) && p180s0.q.c(this.f8533e, e10.f8533e);
    }

    public final int hashCode() {
        int i10 = p180s0.q.f21844h;
        return p110k9.t.a(this.f8533e) + p123m2.c.o(p123m2.c.o(p123m2.c.o(p110k9.t.a(this.f8529a) * 31, 31, this.f8530b), 31, this.f8531c), 31, this.f8532d);
    }
}
