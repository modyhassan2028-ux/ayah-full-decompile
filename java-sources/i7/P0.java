package i7;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f17065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y0 f17066t;

    public P0(Y0 y10, long j, int i10) {
        this.f17064r = i10;
        switch (i10) {
            case 1:
                this.f17065s = j;
                Objects.requireNonNull(y10);
                this.f17066t = y10;
                break;
            default:
                this.f17065s = j;
                Objects.requireNonNull(y10);
                this.f17066t = y10;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17064r) {
            case 0:
                C1023u0 c1023u0 = (C1023u0) this.f17066t.f16104r;
                C0985h0 c0985h0 = c1023u0.f17583v;
                C1023u0.k(c0985h0);
                C0979f0 c0979f0 = c0985h0.f17385B;
                long j = this.f17065s;
                c0979f0.b(j);
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17177D.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                Y0 y10 = this.f17066t;
                y10.o();
                y10.p();
                C1023u0 c1023u1 = (C1023u0) y10.f16104r;
                X x10 = c1023u1.f17584w;
                C1023u0.m(x10);
                x10.f17177D.a("Resetting analytics data (FE)");
                B1 b5 = c1023u1.f17586y;
                C1023u0.l(b5);
                b5.o();
                A1 a9 = b5.f16835w;
                a9.f16818c.c();
                ((C1023u0) a9.f16819d.f16104r).f17564B.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a9.f16816a = jElapsedRealtime;
                a9.f16817b = jElapsedRealtime;
                c1023u1.r().t();
                boolean z10 = !c1023u1.a();
                C0985h0 c0985h1 = c1023u1.f17583v;
                C1023u0.k(c0985h1);
                c0985h1.f17403w.b(this.f17065s);
                C1023u0 c1023u2 = (C1023u0) c0985h1.f16104r;
                C0985h0 c0985h2 = c1023u2.f17583v;
                C1023u0.k(c0985h2);
                if (!TextUtils.isEmpty(c0985h2.f17396M.j())) {
                    c0985h1.f17396M.k(null);
                }
                c0985h1.f17390G.b(0L);
                c0985h1.f17391H.b(0L);
                if (!c1023u2.f17582u.B()) {
                    c0985h1.x(z10);
                }
                c0985h1.f17397N.k(null);
                c0985h1.f17398O.b(0L);
                c0985h1.f17399P.P(null);
                C1021t1 c1021t1P = c1023u1.p();
                c1021t1P.o();
                c1021t1P.p();
                X1 x1E = c1021t1P.E(false);
                c1021t1P.A();
                ((C1023u0) c1021t1P.f16104r).o().s();
                c1021t1P.C(new RunnableC1007o1(c1021t1P, x1E, 0));
                C1023u0.l(b5);
                b5.f16834v.s();
                y10.f17227J = z10;
                c1023u1.p().s(new AtomicReference());
                break;
        }
    }
}
