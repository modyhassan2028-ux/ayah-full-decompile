package D;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f931b;

    public Z(d0 d0Var, d0 d0Var2) {
        this.f930a = d0Var;
        this.f931b = d0Var2;
    }

    @Override // D.d0
    public final int a(H0.K k7) {
        return Math.max(this.f930a.a(k7), this.f931b.a(k7));
    }

    @Override // D.d0
    public final int b(H0.K k7) {
        return Math.max(this.f930a.b(k7), this.f931b.b(k7));
    }

    @Override // D.d0
    public final int c(H0.K k7, p063g1.m mVar) {
        return Math.max(this.f930a.c(k7, mVar), this.f931b.c(k7, mVar));
    }

    @Override // D.d0
    public final int d(H0.K k7, p063g1.m mVar) {
        return Math.max(this.f930a.d(k7, mVar), this.f931b.d(k7, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return p251z9.j.a(z10.f930a, this.f930a) && p251z9.j.a(z10.f931b, this.f931b);
    }

    public final int hashCode() {
        return (this.f931b.hashCode() * 31) + this.f930a.hashCode();
    }

    public final String toString() {
        return "(" + this.f930a + " ∪ " + this.f931b + ')';
    }
}
