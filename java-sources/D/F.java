package D;

import H0.InterfaceC0221u;
import Z.C0672b;
import Z.C0681f0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0221u, l0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0681f0 f882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0681f0 f883c;

    public F(d0 d0Var) {
        this.f881a = d0Var;
        this.f882b = C0672b.r(d0Var);
        this.f883c = C0672b.r(d0Var);
    }

    @Override // H0.InterfaceC0221u
    public final /* synthetic */ int a(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.f(this, p10, h7, i10);
    }

    @Override // l0.r
    public final /* synthetic */ l0.r b(l0.r rVar) {
        return android.support.v4.media.session.p.d(this, rVar);
    }

    @Override // H0.InterfaceC0221u
    public final /* synthetic */ int c(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.c(this, p10, h7, i10);
    }

    @Override // H0.InterfaceC0221u
    public final /* synthetic */ int d(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.l(this, p10, h7, i10);
    }

    @Override // H0.InterfaceC0221u
    public final H0.J e(H0.K k7, H0.H h7, long j) {
        C0681f0 c0681f0 = this.f882b;
        int iD = ((d0) c0681f0.getValue()).d(k7, k7.getLayoutDirection());
        int iA = ((d0) c0681f0.getValue()).a(k7);
        int iC = ((d0) c0681f0.getValue()).c(k7, k7.getLayoutDirection()) + iD;
        int iB = ((d0) c0681f0.getValue()).b(k7) + iA;
        H0.U uA = h7.a(p063g1.b.i(-iC, -iB, j));
        return k7.g0(p063g1.b.g(j, uA.f3168r + iC), p063g1.b.f(j, uA.f3169s + iB), p120l9.s.f19441r, new E(uA, iD, iA, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return p251z9.j.a(((F) obj).f881a, this.f881a);
        }
        return false;
    }

    @Override // H0.InterfaceC0221u
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.i(this, p10, h7, i10);
    }

    @Override // l0.r
    public final boolean g(p241y9.c cVar) {
        return ((Boolean) cVar.e(this)).booleanValue();
    }

    @Override // l0.r
    public final Object h(Object obj, p241y9.e eVar) {
        return eVar.invoke(obj, this);
    }

    public final int hashCode() {
        return this.f881a.hashCode();
    }
}
