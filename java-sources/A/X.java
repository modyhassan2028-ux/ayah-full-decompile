package A;

import K9.AbstractC0405x;

/* JADX INFO: loaded from: classes.dex */
public final class X extends T {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Y f165P;
    public EnumC0047u0 Q;
    public boolean R;
    public p241y9.f S;
    public p241y9.f T;
    public boolean U;

    @Override // A.T
    public final Object C0(S s10, S s11) {
        Object objC = this.f165P.c(new C0039q(s10, this, (p150o9.c) null, 2), s11);
        return objC == p161p9.a.f21156r ? objC : p110k9.y.f19095a;
    }

    @Override // A.T
    public final void D0(long j) {
        if (!this.f19338E || p251z9.j.a(this.S, V.f152a)) {
            return;
        }
        AbstractC0405x.x(h0(), null, new W(this, j, (p150o9.c) null, 0), 1);
    }

    @Override // A.T
    public final void E0(long j) {
        if (!this.f19338E || p251z9.j.a(this.T, V.f153b)) {
            return;
        }
        AbstractC0405x.x(h0(), null, new W(this, j, (p150o9.c) null, 1), 1);
    }

    @Override // A.T
    public final boolean F0() {
        return this.R;
    }
}
