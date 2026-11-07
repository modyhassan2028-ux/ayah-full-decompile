package G;

import android.os.Trace;
import com.google.android.gms.internal.measurement.B1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements K {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f2680A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f2681B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f2682C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.r f2683D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f2685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Aa.a f2686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public H0.b0 f2687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c0 f2691y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2692z;

    public d0(android.support.v4.media.session.r rVar, int i10, long j, Aa.a aVar) {
        this.f2683D = rVar;
        this.f2684r = i10;
        this.f2685s = j;
        this.f2686t = aVar;
        int i11 = I9.d.f3864b;
        this.f2682C = System.nanoTime() - I9.d.f3863a;
    }

    public final boolean a(C0167a c0167a) {
        long j;
        long j10;
        long j11;
        long j12 = c0167a.f2652a;
        android.support.v4.media.session.r rVar = this.f2683D;
        F.i iVar = (F.i) ((B) rVar.f11364s).f2565b.invoke();
        if (this.f2689w) {
            return false;
        }
        int iB = iVar.b();
        int i10 = this.f2684r;
        if (i10 < 0 || i10 >= iB) {
            return false;
        }
        Object objA = iVar.a(i10);
        this.f2680A = Math.max(0L, j12 - System.nanoTime());
        int i11 = I9.d.f3864b;
        this.f2682C = System.nanoTime() - I9.d.f3863a;
        this.f2681B = 0L;
        H0.b0 b0Var = this.f2687u;
        Aa.a aVar = this.f2686t;
        if (b0Var != null) {
            j12 = j12;
            j = 0;
        } else {
            j = 0;
            long j13 = this.f2680A;
            long j14 = aVar.u(objA).f2669a;
            if ((!this.f2692z || j13 <= 0) && j14 >= j13) {
                return true;
            }
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                if (this.f2687u != null) {
                    C.a.a("Request was already composed!");
                }
                Object objC = iVar.c(i10);
                this.f2687u = ((H0.d0) rVar.f11365t).a().g(objC, ((B) rVar.f11364s).a(i10, objC, objA));
                Trace.endSection();
                e();
                long j15 = this.f2681B;
                C0169c c0169c = (C0169c) aVar.f554r;
                long j16 = c0169c.f2669a;
                if (j16 == 0) {
                    j10 = j15;
                } else {
                    long j17 = 4;
                    j10 = (j15 / j17) + ((j16 / j17) * ((long) 3));
                    c0169c = c0169c;
                }
                c0169c.f2669a = j10;
                C0169c c0169cU = aVar.u(objA);
                long j18 = c0169cU.f2669a;
                if (j18 != 0) {
                    long j19 = 4;
                    j15 = (j15 / j19) + ((j18 / j19) * ((long) 3));
                }
                c0169cU.f2669a = j15;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!this.f2692z) {
            if (!this.f2690x) {
                if (this.f2680A <= j) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    this.f2691y = d();
                    this.f2690x = true;
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            c0 c0Var = this.f2691y;
            if (c0Var != null) {
                List[] listArr = (List[]) c0Var.f2674d;
                int i12 = c0Var.f2671a;
                List list = (List) c0Var.f2673c;
                if (i12 < list.size()) {
                    if (((d0) c0Var.f2675e).f2689w) {
                        C.a.c("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (c0Var.f2671a < list.size()) {
                        try {
                            if (listArr[c0Var.f2671a] == null) {
                                long j20 = j;
                                if (Math.max(j20, j12 - System.nanoTime()) <= j20) {
                                    Trace.endSection();
                                    return true;
                                }
                                int i13 = c0Var.f2671a;
                                L l10 = (L) list.get(i13);
                                F.v vVar = l10.f2597a;
                                J j21 = new J(l10);
                                vVar.e(j21);
                                listArr[i13] = j21.f2595a;
                            }
                            List list2 = listArr[c0Var.f2671a];
                            p251z9.j.b(list2);
                            while (c0Var.f2672b < list2.size()) {
                                if (((d0) list2.get(c0Var.f2672b)).a(c0167a)) {
                                    Trace.endSection();
                                    return true;
                                }
                                c0Var.f2672b++;
                            }
                            c0Var.f2672b = 0;
                            c0Var.f2671a++;
                            j = 0;
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    Trace.endSection();
                }
            }
            e();
        }
        if (this.f2688v) {
            return false;
        }
        long j22 = this.f2685s;
        int i14 = (int) (3 & j22);
        int i15 = (((i14 & 2) >> 1) * 3) + ((i14 & 1) << 1);
        int i16 = (((int) (j22 >> 33)) & ((1 << (i15 + 13)) - 1)) - 1;
        if (((((1 << (18 - i15)) - 1) & ((int) (j22 >> (i15 + 46)))) - 1 == 0) || (i16 == 0)) {
            return false;
        }
        long j23 = this.f2680A;
        long j24 = aVar.u(objA).f2670b;
        if ((!this.f2692z || j23 <= 0) && j24 >= j23) {
            return true;
        }
        Trace.beginSection("compose:lazy:prefetch:measure");
        try {
            c(j22);
            Trace.endSection();
            e();
            long j25 = this.f2681B;
            C0169c c0169c2 = (C0169c) aVar.f554r;
            long j26 = c0169c2.f2670b;
            if (j26 == 0) {
                j11 = j25;
            } else {
                long j27 = 4;
                j11 = (j25 / j27) + ((j26 / j27) * ((long) 3));
            }
            c0169c2.f2670b = j11;
            C0169c c0169cU2 = aVar.u(objA);
            long j28 = c0169cU2.f2670b;
            if (j28 != 0) {
                long j29 = 4;
                j25 = (j25 / j29) + ((j28 / j29) * ((long) 3));
            }
            c0169cU2.f2670b = j25;
            return false;
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    @Override // G.K
    public final void b() {
        this.f2692z = true;
    }

    public final void c(long j) {
        if (this.f2689w) {
            C.a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f2688v) {
            C.a.a("Request was already measured!");
        }
        this.f2688v = true;
        H0.b0 b0Var = this.f2687u;
        if (b0Var == null) {
            C.a.b("performComposition() must be called before performMeasure()");
            throw new A6.a();
        }
        int iC = b0Var.c();
        for (int i10 = 0; i10 < iC; i10++) {
            b0Var.d(j, i10);
        }
    }

    @Override // G.K
    public final void cancel() {
        if (this.f2689w) {
            return;
        }
        this.f2689w = true;
        H0.b0 b0Var = this.f2687u;
        if (b0Var != null) {
            b0Var.a();
        }
        this.f2687u = null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Cloneable, java.util.List[]] */
    public final c0 d() {
        H0.b0 b0Var = this.f2687u;
        if (b0Var == null) {
            C.a.b("Should precompose before resolving nested prefetch states");
            throw new A6.a();
        }
        p251z9.v vVar = new p251z9.v();
        b0Var.b(new C0.h(vVar, 2));
        List list = (List) vVar.f24886r;
        if (list == null) {
            return null;
        }
        c0 c0Var = new c0();
        c0Var.f2675e = this;
        c0Var.f2673c = list;
        c0Var.f2674d = new List[list.size()];
        if (list.isEmpty()) {
            C.a.a("NestedPrefetchController shouldn't be created with no states");
        }
        return c0Var;
    }

    public final void e() {
        long j;
        int i10 = I9.d.f3864b;
        long jNanoTime = System.nanoTime() - I9.d.f3863a;
        long j10 = this.f2682C;
        I9.c cVar = I9.c.NANOSECONDS;
        p251z9.j.e(cVar, "unit");
        long jT0 = 0;
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j10) {
                int i11 = I9.a.f3852u;
            } else {
                jT0 = I9.a.h(j10 < 0 ? I9.a.f3851t : I9.a.f3850s);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jT0 = jNanoTime < 0 ? I9.a.f3851t : I9.a.f3850s;
        } else {
            long j11 = jNanoTime - j10;
            if (((~(j11 ^ j10)) & (j11 ^ jNanoTime)) < 0) {
                I9.c cVar2 = I9.c.MILLISECONDS;
                if (cVar.compareTo(cVar2) < 0) {
                    long jR = B1.r(1L, cVar2, cVar);
                    long j12 = (jNanoTime / jR) - (j10 / jR);
                    long j13 = (jNanoTime % jR) - (j10 % jR);
                    int i12 = I9.a.f3852u;
                    jT0 = I9.a.f(p017b7.g.t0(j12, cVar2), p017b7.g.t0(j13, cVar));
                } else {
                    jT0 = I9.a.h(j11 < 0 ? I9.a.f3851t : I9.a.f3850s);
                }
            } else {
                jT0 = p017b7.g.t0(j11, cVar);
            }
        }
        long j14 = jT0 >> 1;
        int i13 = I9.a.f3852u;
        if ((1 & ((int) jT0)) == 0) {
            j = j14;
        } else if (j14 > 9223372036854L) {
            j = Long.MAX_VALUE;
        } else {
            j = j14 < -9223372036854L ? Long.MIN_VALUE : j14 * ((long) 1000000);
        }
        this.f2681B = j;
        this.f2680A -= j;
        this.f2682C = jNanoTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f2684r);
        sb.append(", constraints = ");
        sb.append((Object) p063g1.a.k(this.f2685s));
        sb.append(", isComposed = ");
        sb.append(this.f2687u != null);
        sb.append(", isMeasured = ");
        sb.append(this.f2688v);
        sb.append(", isCanceled = ");
        sb.append(this.f2689w);
        sb.append(" }");
        return sb.toString();
    }
}
