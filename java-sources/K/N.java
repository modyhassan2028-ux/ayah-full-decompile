package K;

import H0.InterfaceC0221u;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC0221u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f4491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z0.F f4493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p241y9.a f4494d;

    public N(r0 r0Var, int i10, Z0.F f3, p241y9.a aVar) {
        this.f4491a = r0Var;
        this.f4492b = i10;
        this.f4493c = f3;
        this.f4494d = aVar;
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
        long j10;
        if (h7.N(p063g1.a.g(j)) < p063g1.a.h(j)) {
            j10 = j;
        } else {
            j10 = j;
            j = p063g1.a.a(j10, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        H0.U uA = h7.a(j);
        int iMin = Math.min(uA.f3168r, p063g1.a.h(j10));
        return k7.g0(iMin, uA.f3169s, p120l9.s.f19441r, new D.V(k7, this, uA, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        return p251z9.j.a(this.f4491a, n6.f4491a) && this.f4492b == n6.f4492b && p251z9.j.a(this.f4493c, n6.f4493c) && p251z9.j.a(this.f4494d, n6.f4494d);
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
        return this.f4494d.hashCode() + ((this.f4493c.hashCode() + (((this.f4491a.hashCode() * 31) + this.f4492b) * 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f4491a + ", cursorOffset=" + this.f4492b + ", transformedText=" + this.f4493c + ", textLayoutResultProvider=" + this.f4494d + ')';
    }
}
