package X;

/* JADX INFO: loaded from: classes.dex */
public final class O implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.f f9720a;

    public O(l0.f fVar) {
        this.f9720a = fVar;
    }

    @Override // X.G
    public final int a(p063g1.k kVar, long j, int i10, p063g1.m mVar) {
        int i11 = (int) (j >> 32);
        if (i10 >= i11) {
            return Math.round((1 + (mVar != p063g1.m.f16261r ? 0.0f * (-1) : 0.0f)) * ((i11 - i10) / 2.0f));
        }
        return B0.c.l(this.f9720a.a(i10, i11, mVar), 0, i11 - i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O) && this.f9720a.equals(((O) obj).f9720a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9720a.f19322a) * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f9720a + ", margin=0)";
    }
}
