package i7;

import j$.util.Objects;

/* JADX INFO: renamed from: i7.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1033x1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f17689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B1 f17690t;

    public RunnableC1033x1(B1 b5, long j, int i10) {
        this.f17688r = i10;
        switch (i10) {
            case 1:
                this.f17689s = j;
                Objects.requireNonNull(b5);
                this.f17690t = b5;
                break;
            default:
                this.f17689s = j;
                Objects.requireNonNull(b5);
                this.f17690t = b5;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17688r) {
            case 0:
                B1 b5 = this.f17690t;
                A1 a9 = b5.f16835w;
                b5.o();
                b5.s();
                C1023u0 c1023u0 = (C1023u0) b5.f16104r;
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                V v10 = x9.f17178E;
                long j = this.f17689s;
                v10.b(Long.valueOf(j), "Activity resumed, time");
                C0981g c0981g = c1023u0.f17582u;
                if (c0981g.y(null, G.f16919V0)) {
                    if (c0981g.C() || b5.f16833u) {
                        a9.f16819d.o();
                        a9.f16818c.c();
                        a9.f16816a = j;
                        a9.f16817b = j;
                    }
                } else if (c0981g.C()) {
                    a9.f16819d.o();
                    a9.f16818c.c();
                    a9.f16816a = j;
                    a9.f16817b = j;
                } else {
                    C0985h0 c0985h0 = c1023u0.f17583v;
                    C1023u0.k(c0985h0);
                    if (c0985h0.f17393J.a()) {
                        a9.f16819d.o();
                        a9.f16818c.c();
                        a9.f16816a = j;
                        a9.f16817b = j;
                    }
                }
                p085i0.n nVar = b5.f16836x;
                B1 b10 = (B1) nVar.f16734t;
                b10.o();
                C1023u0 c1023u1 = (C1023u0) b10.f16104r;
                RunnableC1036y1 runnableC1036y1 = (RunnableC1036y1) nVar.f16733s;
                if (runnableC1036y1 != null) {
                    b10.f16832t.removeCallbacks(runnableC1036y1);
                }
                C0985h0 c0985h1 = c1023u1.f17583v;
                Y0 y10 = c1023u1.f17566D;
                C1023u0.k(c0985h1);
                c0985h1.f17393J.b(false);
                b10.o();
                b10.f16833u = false;
                if (c1023u1.f17582u.y(null, G.f16917U0)) {
                    C1023u0.l(y10);
                    if (y10.f17222E) {
                        X x10 = c1023u1.f17584w;
                        C1023u0.m(x10);
                        x10.f17178E.a("Retrying trigger URI registration in foreground");
                        C1023u0.l(y10);
                        y10.N();
                    }
                }
                X4.c cVar = b5.f16834v;
                B1 b11 = (B1) cVar.f9953r;
                b11.o();
                C1023u0 c1023u2 = (C1023u0) b11.f16104r;
                if (c1023u2.a()) {
                    c1023u2.f17564B.getClass();
                    cVar.t(System.currentTimeMillis());
                    break;
                }
                break;
            default:
                B1 b12 = this.f17690t;
                b12.o();
                b12.s();
                C1023u0 c1023u3 = (C1023u0) b12.f16104r;
                X x11 = c1023u3.f17584w;
                C1023u0.m(x11);
                V v11 = x11.f17178E;
                long j10 = this.f17689s;
                v11.b(Long.valueOf(j10), "Activity paused, time");
                p085i0.n nVar2 = b12.f16836x;
                B1 b13 = (B1) nVar2.f16734t;
                ((C1023u0) b13.f16104r).f17564B.getClass();
                RunnableC1036y1 runnableC1036y2 = new RunnableC1036y1(nVar2, System.currentTimeMillis(), j10);
                nVar2.f16733s = runnableC1036y2;
                b13.f16832t.postDelayed(runnableC1036y2, 2000L);
                if (c1023u3.f17582u.C()) {
                    b12.f16835w.f16818c.c();
                }
                break;
        }
    }
}
