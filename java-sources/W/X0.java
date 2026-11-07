package W;

import J0.InterfaceC0290m;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class X0 implements p232y.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8906c;

    public X0(boolean z10, float f3, long j) {
        this.f8904a = z10;
        this.f8905b = f3;
        this.f8906c = j;
    }

    @Override // p232y.J
    public final p232y.K a(B.j jVar, C0698o c0698o) {
        c0698o.T(1257603829);
        c0698o.p(false);
        return p232y.D.f24417t;
    }

    @Override // p232y.O
    public final InterfaceC0290m b(B.j jVar) {
        return new C0600t0(jVar, this.f8904a, this.f8905b, new C0594r0(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x9 = (X0) obj;
        if (this.f8904a == x9.f8904a && p063g1.f.a(this.f8905b, x9.f8905b)) {
            return p180s0.q.c(this.f8906c, x9.f8906c);
        }
        return false;
    }

    @Override // p232y.O
    public final int hashCode() {
        int iN = p123m2.c.n((this.f8904a ? 1231 : 1237) * 31, this.f8905b, 961);
        int i10 = p180s0.q.f21844h;
        return p110k9.t.a(this.f8906c) + iN;
    }
}
