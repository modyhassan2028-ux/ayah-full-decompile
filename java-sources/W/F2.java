package W;

import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public abstract class F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8543a = Y.v.f10256a;

    static {
        int i10 = Y.u.f10255a;
        int i11 = Y.t.f10254a;
    }

    public static E2 a(long j, C0698o c0698o) {
        long j10 = p180s0.q.g;
        C0560g0 c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
        E2 e10 = c0560g0.f9110O;
        if (e10 == null) {
            float f3 = Y.v.f10256a;
            E2 e11 = new E2(AbstractC0568i0.c(c0560g0, 35), AbstractC0568i0.c(c0560g0, Y.v.f10260e), AbstractC0568i0.c(c0560g0, Y.v.f10259d), AbstractC0568i0.c(c0560g0, Y.v.f10257b), AbstractC0568i0.c(c0560g0, Y.v.f10261f));
            c0560g0.f9110O = e11;
            e10 = e11;
        }
        long j11 = j != 16 ? j : e10.f8529a;
        long j12 = j10 != 16 ? j10 : e10.f8530b;
        long j13 = j10 != 16 ? j10 : e10.f8531c;
        long j14 = j10 != 16 ? j10 : e10.f8532d;
        if (j10 == 16) {
            j10 = e10.f8533e;
        }
        return new E2(j11, j12, j13, j14, j10);
    }
}
