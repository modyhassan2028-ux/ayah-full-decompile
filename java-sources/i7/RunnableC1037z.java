package i7;

import j$.util.Objects;

/* JADX INFO: renamed from: i7.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1037z implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17699r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f17700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E f17701t;

    public RunnableC1037z(A a9, long j) {
        this.f17700s = j;
        Objects.requireNonNull(a9);
        this.f17701t = a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17699r) {
            case 0:
                ((A) this.f17701t).u(this.f17700s);
                break;
            default:
                C0992j1 c0992j1 = (C0992j1) this.f17701t;
                A a9 = ((C1023u0) c0992j1.f16104r).f17567E;
                C1023u0.j(a9);
                a9.r(this.f17700s);
                c0992j1.f17430v = null;
                break;
        }
    }

    public RunnableC1037z(C0992j1 c0992j1, long j) {
        this.f17700s = j;
        Objects.requireNonNull(c0992j1);
        this.f17701t = c0992j1;
    }
}
