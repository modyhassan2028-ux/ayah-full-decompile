package H0;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3168r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3169s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3170t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3171u = W.f3176a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f3172v = 0;

    public U() {
        long j = 0;
        this.f3170t = (j & 4294967295L) | (j << 32);
    }

    public abstract int R(C0214m c0214m);

    public int S() {
        return (int) (this.f3170t & 4294967295L);
    }

    public int T() {
        return (int) (this.f3170t >> 32);
    }

    public final void U() {
        this.f3168r = B0.c.l((int) (this.f3170t >> 32), p063g1.a.j(this.f3171u), p063g1.a.h(this.f3171u));
        int iL = B0.c.l((int) (this.f3170t & 4294967295L), p063g1.a.i(this.f3171u), p063g1.a.g(this.f3171u));
        this.f3169s = iL;
        int i10 = this.f3168r;
        long j = this.f3170t;
        this.f3172v = (((long) ((i10 - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iL - ((int) (j & 4294967295L))) / 2)));
    }

    public void V(long j, float f3, p205v0.b bVar) {
        Y(j, f3, null);
    }

    public abstract void Y(long j, float f3, p241y9.c cVar);

    public final void Z(long j) {
        if (p063g1.l.a(this.f3170t, j)) {
            return;
        }
        this.f3170t = j;
        U();
    }

    public final void a0(long j) {
        if (p063g1.a.b(this.f3171u, j)) {
            return;
        }
        this.f3171u = j;
        U();
    }

    public /* synthetic */ Object i() {
        return null;
    }
}
