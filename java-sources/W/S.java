package W;

import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D.P f8804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D.P f8805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f8807d;

    static {
        float f3 = 24;
        float f7 = 8;
        f8804a = new D.P(f3, f7, f3, f7);
        float f10 = 16;
        androidx.compose.foundation.layout.b.a(f10, f7, f3, f7);
        float f11 = 12;
        f8805b = new D.P(f11, f7, f11, f7);
        androidx.compose.foundation.layout.b.a(f11, f7, f10, f7);
        f8806c = 58;
        f8807d = 40;
        float f12 = Y.e.f10149a;
    }

    public static Q a(long j, long j10, C0698o c0698o, int i10) {
        Q q10;
        long j11 = (i10 & 1) != 0 ? p180s0.q.g : j;
        long j12 = (i10 & 2) != 0 ? p180s0.q.g : j10;
        long j13 = p180s0.q.g;
        C0560g0 c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
        Q q11 = c0560g0.f9106K;
        if (q11 == null) {
            float f3 = Y.e.f10149a;
            Q q12 = new Q(AbstractC0568i0.c(c0560g0, 26), AbstractC0568i0.c(c0560g0, Y.e.f10155h), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.e.f10151c), 0.12f), p180s0.q.b(AbstractC0568i0.c(c0560g0, Y.e.f10153e), 0.38f));
            c0560g0.f9106K = q12;
            q10 = q12;
        } else {
            q10 = q11;
        }
        return q10.a(j11, j12, j13, j13);
    }

    public static Q b(C0560g0 c0560g0) {
        Q q10 = c0560g0.f9108M;
        if (q10 != null) {
            return q10;
        }
        long j = p180s0.q.f21843f;
        Q q11 = new Q(j, AbstractC0568i0.c(c0560g0, 26), j, p180s0.q.b(AbstractC0568i0.c(c0560g0, 18), 0.38f));
        c0560g0.f9108M = q11;
        return q11;
    }

    public static Q c(long j, long j10, C0698o c0698o, int i10) {
        Q q10;
        long j11 = (i10 & 2) != 0 ? p180s0.q.g : j10;
        long j12 = p180s0.q.g;
        C0560g0 c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
        Q q11 = c0560g0.f9107L;
        if (q11 == null) {
            long j13 = p180s0.q.f21843f;
            float f3 = Y.j.f10177a;
            Q q12 = new Q(j13, AbstractC0568i0.c(c0560g0, 26), j13, p180s0.q.b(AbstractC0568i0.c(c0560g0, 18), 0.38f));
            c0560g0.f9107L = q12;
            q10 = q12;
        } else {
            q10 = q11;
        }
        return q10.a(j, j11, j12, j12);
    }

    public static Q d(long j, long j10, C0698o c0698o, int i10) {
        if ((i10 & 1) != 0) {
            j = p180s0.q.g;
        }
        long j11 = j;
        long j12 = p180s0.q.g;
        return b((C0560g0) c0698o.k(AbstractC0568i0.f9172a)).a(j11, j10, j12, j12);
    }
}
