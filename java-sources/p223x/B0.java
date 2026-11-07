package p223x;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements x0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z0 f23817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f23818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f23819t;

    public B0(z0 z0Var, long j) {
        this.f23817r = z0Var;
        this.f23818s = ((long) (z0Var.r() + z0Var.k())) * 1000000;
        this.f23819t = j * 1000000;
    }

    public final long a(long j) {
        long j10 = j + this.f23819t;
        if (j10 <= 0) {
            return 0L;
        }
        long j11 = this.f23818s;
        return j10 - ((j10 / j11) * j11);
    }

    public final AbstractC1427p b(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        long j10 = this.f23819t;
        long j11 = j + j10;
        long j12 = this.f23818s;
        return j11 > j12 ? this.f23817r.e(j12 - j10, abstractC1427p, abstractC1427p3, abstractC1427p2) : abstractC1427p2;
    }

    @Override // p223x.x0
    public final boolean d() {
        return true;
    }

    @Override // p223x.x0
    public final AbstractC1427p e(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return this.f23817r.e(a(j), abstractC1427p, abstractC1427p2, b(j, abstractC1427p, abstractC1427p3, abstractC1427p2));
    }

    @Override // p223x.x0
    public final long i(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return Long.MAX_VALUE;
    }

    @Override // p223x.x0
    public final AbstractC1427p l(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return this.f23817r.l(a(j), abstractC1427p, abstractC1427p2, b(j, abstractC1427p, abstractC1427p3, abstractC1427p2));
    }

    @Override // p223x.x0
    public final AbstractC1427p s(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return e(Long.MAX_VALUE, abstractC1427p, abstractC1427p2, abstractC1427p3);
    }
}
