package K;

import H0.InterfaceC0221u;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements InterfaceC0221u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f4441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z0.F f4443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p241y9.a f4444d;

    public B0(r0 r0Var, int i10, Z0.F f3, p241y9.a aVar) {
        this.f4441a = r0Var;
        this.f4442b = i10;
        this.f4443c = f3;
        this.f4444d = aVar;
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
        H0.U uA = h7.a(p063g1.a.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(uA.f3169s, p063g1.a.g(j));
        return k7.g0(uA.f3168r, iMin, p120l9.s.f19441r, new D.V(k7, this, uA, iMin, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b5 = (B0) obj;
        return p251z9.j.a(this.f4441a, b5.f4441a) && this.f4442b == b5.f4442b && p251z9.j.a(this.f4443c, b5.f4443c) && p251z9.j.a(this.f4444d, b5.f4444d);
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
        return this.f4444d.hashCode() + ((this.f4443c.hashCode() + (((this.f4441a.hashCode() * 31) + this.f4442b) * 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f4441a + ", cursorOffset=" + this.f4442b + ", transformedText=" + this.f4443c + ", textLayoutResultProvider=" + this.f4444d + ')';
    }
}
