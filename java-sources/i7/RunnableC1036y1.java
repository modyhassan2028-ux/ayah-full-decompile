package i7;

import E2.RunnableC0147v;
import j$.util.Objects;

/* JADX INFO: renamed from: i7.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1036y1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f17696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f17697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p085i0.n f17698t;

    public RunnableC1036y1(p085i0.n nVar, long j, long j10) {
        Objects.requireNonNull(nVar);
        this.f17698t = nVar;
        this.f17696r = j;
        this.f17697s = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1014r0 c1014r0 = ((C1023u0) ((B1) this.f17698t.f16734t).f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new RunnableC0147v(19, this));
    }
}
