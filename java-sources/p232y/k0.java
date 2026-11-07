package p232y;

import A.C0037p;
import A.EnumC0047u0;
import A.S0;
import A.T0;
import B.j;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.InterfaceC0289l;
import J0.InterfaceC0290m;
import J0.n0;
import W.C0557f1;
import l0.q;
import p063g1.m;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends AbstractC0291n implements InterfaceC0289l, n0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public T0 f24549H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public EnumC0047u0 f24550I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f24551J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0037p f24552K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public j f24553L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f24554M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C1452f f24555N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public S0 f24556O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public InterfaceC0290m f24557P;
    public C1453g Q;
    public C1452f R;
    public boolean S;

    @Override // J0.n0
    public final void A() {
        C1453g c1453g = (C1453g) AbstractC0283f.i(this, Y.f24465a);
        if (p251z9.j.a(c1453g, this.Q)) {
            return;
        }
        this.Q = c1453g;
        this.R = null;
        InterfaceC0290m interfaceC0290m = this.f24557P;
        if (interfaceC0290m != null) {
            w0(interfaceC0290m);
        }
        this.f24557P = null;
        y0();
        S0 s10 = this.f24556O;
        if (s10 != null) {
            T0 t2 = this.f24549H;
            s10.H0(this.f24552K, this.f24550I, t2, this.f24553L, this.f24554M ? this.R : this.f24555N, this.f24551J, this.S);
        }
    }

    public final void A0(C0037p c0037p, EnumC0047u0 enumC0047u0, T0 t2, j jVar, C1452f c1452f, boolean z10, boolean z11) {
        boolean z12;
        this.f24549H = t2;
        this.f24550I = enumC0047u0;
        boolean z13 = true;
        if (this.f24554M != z10) {
            this.f24554M = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        if (p251z9.j.a(this.f24555N, c1452f)) {
            z13 = false;
        } else {
            this.f24555N = c1452f;
        }
        if (z12 || (z13 && !z10)) {
            InterfaceC0290m interfaceC0290m = this.f24557P;
            if (interfaceC0290m != null) {
                w0(interfaceC0290m);
            }
            this.f24557P = null;
            y0();
        }
        this.f24551J = z11;
        this.f24552K = c0037p;
        this.f24553L = jVar;
        boolean zZ0 = z0();
        this.S = zZ0;
        S0 s10 = this.f24556O;
        if (s10 != null) {
            s10.H0(c0037p, enumC0047u0, t2, jVar, this.f24554M ? this.R : this.f24555N, z11, zZ0);
        }
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // l0.q
    public final void l0() {
        this.S = z0();
        y0();
        if (this.f24556O == null) {
            S0 s10 = new S0(this.f24552K, this.f24550I, this.f24549H, this.f24553L, this.f24554M ? this.R : this.f24555N, this.f24551J, this.S);
            v0(s10);
            this.f24556O = s10;
        }
    }

    @Override // l0.q
    public final void n0() {
        InterfaceC0290m interfaceC0290m = this.f24557P;
        if (interfaceC0290m != null) {
            w0(interfaceC0290m);
        }
    }

    @Override // l0.q
    public final void o0() {
        boolean zZ0 = z0();
        if (this.S != zZ0) {
            this.S = zZ0;
            T0 t2 = this.f24549H;
            EnumC0047u0 enumC0047u0 = this.f24550I;
            boolean z10 = this.f24554M;
            A0(this.f24552K, enumC0047u0, t2, this.f24553L, z10 ? this.R : this.f24555N, z10, this.f24551J);
        }
    }

    public final void y0() {
        InterfaceC0290m interfaceC0290m = this.f24557P;
        if (interfaceC0290m != null) {
            if (((q) interfaceC0290m).f19339r.f19338E) {
                return;
            }
            v0(interfaceC0290m);
            return;
        }
        if (this.f24554M) {
            AbstractC0283f.t(this, new C0557f1(23, this));
        }
        C1452f c1452f = this.f24554M ? this.R : this.f24555N;
        if (c1452f != null) {
            AbstractC0291n abstractC0291n = c1452f.f24510i;
            if (abstractC0291n.f19339r.f19338E) {
                return;
            }
            v0(abstractC0291n);
            this.f24557P = abstractC0291n;
        }
    }

    public final boolean z0() {
        return (this.f19338E ? AbstractC0283f.x(this).Q : m.f16261r) != m.f16262s || this.f24550I == EnumC0047u0.f424r;
    }
}
