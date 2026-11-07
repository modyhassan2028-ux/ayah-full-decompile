package i7;

import j$.util.Objects;

/* JADX INFO: renamed from: i7.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1004n1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X1 f17485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f17486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1021t1 f17487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V6.a f17488v;

    public /* synthetic */ RunnableC1004n1(C1021t1 c1021t1, X1 x9, boolean z10, V6.a aVar, int i10) {
        this.f17484r = i10;
        this.f17485s = x9;
        this.f17486t = z10;
        this.f17488v = aVar;
        this.f17487u = c1021t1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f17484r) {
            case 0:
                C1021t1 c1021t1 = this.f17487u;
                J j = c1021t1.f17552u;
                if (j != null) {
                    c1021t1.G(j, this.f17486t ? null : (S1) this.f17488v, this.f17485s);
                    c1021t1.B();
                } else {
                    X x9 = ((C1023u0) c1021t1.f16104r).f17584w;
                    C1023u0.m(x9);
                    x9.f17182w.a("Discarding data. Failed to set user property");
                }
                break;
            case 1:
                C1021t1 c1021t2 = this.f17487u;
                J j10 = c1021t2.f17552u;
                if (j10 != null) {
                    c1021t2.G(j10, this.f17486t ? null : (C1022u) this.f17488v, this.f17485s);
                    c1021t2.B();
                } else {
                    X x10 = ((C1023u0) c1021t2.f16104r).f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.a("Discarding data. Failed to send event to service");
                }
                break;
            default:
                C1021t1 c1021t3 = this.f17487u;
                J j11 = c1021t3.f17552u;
                if (j11 != null) {
                    c1021t3.G(j11, this.f17486t ? null : (C0975e) this.f17488v, this.f17485s);
                    c1021t3.B();
                } else {
                    X x11 = ((C1023u0) c1021t3.f16104r).f17584w;
                    C1023u0.m(x11);
                    x11.f17182w.a("Discarding data. Failed to send conditional user property to service");
                }
                break;
        }
    }

    public RunnableC1004n1(C1021t1 c1021t1, X1 x9, boolean z10, C0975e c0975e) {
        this.f17484r = 2;
        this.f17485s = x9;
        this.f17486t = z10;
        this.f17488v = c0975e;
        Objects.requireNonNull(c1021t1);
        this.f17487u = c1021t1;
    }
}
