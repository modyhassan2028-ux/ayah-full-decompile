package W;

/* JADX INFO: renamed from: W.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0569i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9179f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9181i;
    public final long j;

    public C0569i1(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f9174a = j;
        this.f9175b = j10;
        this.f9176c = j11;
        this.f9177d = j12;
        this.f9178e = j13;
        this.f9179f = j14;
        this.g = j15;
        this.f9180h = j16;
        this.f9181i = j17;
        this.j = j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0569i1)) {
            return false;
        }
        C0569i1 c0569i1 = (C0569i1) obj;
        return p180s0.q.c(this.f9174a, c0569i1.f9174a) && p180s0.q.c(this.f9175b, c0569i1.f9175b) && p180s0.q.c(this.f9176c, c0569i1.f9176c) && p180s0.q.c(this.f9177d, c0569i1.f9177d) && p180s0.q.c(this.f9178e, c0569i1.f9178e) && p180s0.q.c(this.f9179f, c0569i1.f9179f) && p180s0.q.c(this.g, c0569i1.g) && p180s0.q.c(this.f9180h, c0569i1.f9180h) && p180s0.q.c(this.f9181i, c0569i1.f9181i) && p180s0.q.c(this.j, c0569i1.j);
    }

    public final int hashCode() {
        int i10 = p180s0.q.f21844h;
        return p110k9.t.a(this.j) + p123m2.c.o(p123m2.c.o(p123m2.c.o(p123m2.c.o(p123m2.c.o(p123m2.c.o(p123m2.c.o(p123m2.c.o(p110k9.t.a(this.f9174a) * 31, 31, this.f9175b), 31, this.f9176c), 31, this.f9177d), 31, this.f9178e), 31, this.f9179f), 31, this.g), 31, this.f9180h), 31, this.f9181i);
    }
}
