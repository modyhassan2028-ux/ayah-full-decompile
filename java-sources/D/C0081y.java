package D;

/* JADX INFO: renamed from: D.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0081y implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f1035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f1036b;

    public C0081y(d0 d0Var, d0 d0Var2) {
        this.f1035a = d0Var;
        this.f1036b = d0Var2;
    }

    @Override // D.d0
    public final int a(H0.K k7) {
        int iA = this.f1035a.a(k7) - this.f1036b.a(k7);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // D.d0
    public final int b(H0.K k7) {
        int iB = this.f1035a.b(k7) - this.f1036b.b(k7);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // D.d0
    public final int c(H0.K k7, p063g1.m mVar) {
        int iC = this.f1035a.c(k7, mVar) - this.f1036b.c(k7, mVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // D.d0
    public final int d(H0.K k7, p063g1.m mVar) {
        int iD = this.f1035a.d(k7, mVar) - this.f1036b.d(k7, mVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0081y)) {
            return false;
        }
        C0081y c0081y = (C0081y) obj;
        return p251z9.j.a(c0081y.f1035a, this.f1035a) && p251z9.j.a(c0081y.f1036b, this.f1036b);
    }

    public final int hashCode() {
        return this.f1036b.hashCode() + (this.f1035a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f1035a + " - " + this.f1036b + ')';
    }
}
