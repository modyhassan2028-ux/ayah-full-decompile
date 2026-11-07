package p223x;

import p251z9.j;

/* JADX INFO: renamed from: x.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1412c0 implements x0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0 f23949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f23950s;

    public C1412c0(x0 x0Var, long j) {
        this.f23949r = x0Var;
        this.f23950s = j;
    }

    @Override // p223x.x0
    public final boolean d() {
        return this.f23949r.d();
    }

    @Override // p223x.x0
    public final AbstractC1427p e(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        long j10 = this.f23950s;
        return j < j10 ? abstractC1427p3 : this.f23949r.e(j - j10, abstractC1427p, abstractC1427p2, abstractC1427p3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1412c0)) {
            return false;
        }
        C1412c0 c1412c0 = (C1412c0) obj;
        return c1412c0.f23950s == this.f23950s && j.a(c1412c0.f23949r, this.f23949r);
    }

    public final int hashCode() {
        int iHashCode = this.f23949r.hashCode() * 31;
        long j = this.f23950s;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @Override // p223x.x0
    public final long i(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return this.f23949r.i(abstractC1427p, abstractC1427p2, abstractC1427p3) + this.f23950s;
    }

    @Override // p223x.x0
    public final AbstractC1427p l(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        long j10 = this.f23950s;
        return j < j10 ? abstractC1427p : this.f23949r.l(j - j10, abstractC1427p, abstractC1427p2, abstractC1427p3);
    }

    @Override // p223x.x0
    public final AbstractC1427p s(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return e(i(abstractC1427p, abstractC1427p2, abstractC1427p3), abstractC1427p, abstractC1427p2, abstractC1427p3);
    }
}
