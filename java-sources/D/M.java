package D;

/* JADX INFO: loaded from: classes.dex */
public final class M implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f899b;

    public M(d0 d0Var, int i10) {
        this.f898a = d0Var;
        this.f899b = i10;
    }

    @Override // D.d0
    public final int a(H0.K k7) {
        if ((this.f899b & 16) != 0) {
            return this.f898a.a(k7);
        }
        return 0;
    }

    @Override // D.d0
    public final int b(H0.K k7) {
        if ((this.f899b & 32) != 0) {
            return this.f898a.b(k7);
        }
        return 0;
    }

    @Override // D.d0
    public final int c(H0.K k7, p063g1.m mVar) {
        if (((mVar == p063g1.m.f16261r ? 4 : 1) & this.f899b) != 0) {
            return this.f898a.c(k7, mVar);
        }
        return 0;
    }

    @Override // D.d0
    public final int d(H0.K k7, p063g1.m mVar) {
        if (((mVar == p063g1.m.f16261r ? 8 : 2) & this.f899b) != 0) {
            return this.f898a.d(k7, mVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return p251z9.j.a(this.f898a, m10.f898a) && this.f899b == m10.f899b;
    }

    public final int hashCode() {
        return (this.f898a.hashCode() * 31) + this.f899b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f898a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i10 = this.f899b;
        int i11 = AbstractC0060c.f943c;
        if ((i10 & i11) == i11) {
            AbstractC0060c.g("Start", sb3);
        }
        int i12 = AbstractC0060c.f945e;
        if ((i10 & i12) == i12) {
            AbstractC0060c.g("Left", sb3);
        }
        if ((i10 & 16) == 16) {
            AbstractC0060c.g("Top", sb3);
        }
        int i13 = AbstractC0060c.f944d;
        if ((i10 & i13) == i13) {
            AbstractC0060c.g("End", sb3);
        }
        int i14 = AbstractC0060c.f946f;
        if ((i10 & i14) == i14) {
            AbstractC0060c.g("Right", sb3);
        }
        if ((i10 & 32) == 32) {
            AbstractC0060c.g("Bottom", sb3);
        }
        String string = sb3.toString();
        p251z9.j.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
