package J0;

import H0.C0214m;

/* JADX INFO: loaded from: classes.dex */
public final class B extends j0 {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final N9.b0 f3875f0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public InterfaceC0302z f3876d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public A f3877e0;

    static {
        N9.b0 b0VarG = p180s0.F.g();
        b0VarG.e(p180s0.q.f21842e);
        b0VarG.k(1.0f);
        b0VarG.l(1);
        f3875f0 = b0VarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B(I i10, InterfaceC0302z interfaceC0302z) {
        super(i10);
        this.f3876d0 = interfaceC0302z;
        this.f3877e0 = i10.f3932y != null ? new A(this) : null;
        if ((((l0.q) interfaceC0302z).f19339r.f19341t & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // J0.j0
    public final Q C0() {
        return this.f3877e0;
    }

    @Override // J0.j0
    public final l0.q E0() {
        return ((l0.q) this.f3876d0).f19339r;
    }

    @Override // H0.H
    public final int H(int i10) {
        InterfaceC0302z interfaceC0302z = this.f3876d0;
        j0 j0Var = this.f4126D;
        p251z9.j.b(j0Var);
        return interfaceC0302z.d(this, j0Var, i10);
    }

    @Override // H0.H
    public final int N(int i10) {
        InterfaceC0302z interfaceC0302z = this.f3876d0;
        j0 j0Var = this.f4126D;
        p251z9.j.b(j0Var);
        return interfaceC0302z.a(this, j0Var, i10);
    }

    @Override // H0.H
    public final int P(int i10) {
        InterfaceC0302z interfaceC0302z = this.f3876d0;
        j0 j0Var = this.f4126D;
        p251z9.j.b(j0Var);
        return interfaceC0302z.f(this, j0Var, i10);
    }

    @Override // J0.j0
    public final void T0(p180s0.o oVar, p205v0.b bVar) {
        j0 j0Var = this.f4126D;
        p251z9.j.b(j0Var);
        j0Var.w0(oVar, bVar);
        if (L.a(this.f4125C).getShowLayoutBounds()) {
            long j = this.f3170t;
            oVar.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f3875f0);
        }
    }

    @Override // J0.j0, H0.U
    public final void V(long j, float f3, p205v0.b bVar) {
        U0(j, f3, null, bVar);
        d1();
    }

    @Override // H0.U
    public final void Y(long j, float f3, p241y9.c cVar) {
        U0(j, f3, cVar, null);
        d1();
    }

    @Override // H0.H
    public final H0.U a(long j) {
        a0(j);
        InterfaceC0302z interfaceC0302z = this.f3876d0;
        j0 j0Var = this.f4126D;
        p251z9.j.b(j0Var);
        W0(interfaceC0302z.e(this, j0Var, j));
        Q0();
        return this;
    }

    @Override // H0.H
    public final int d(int i10) {
        InterfaceC0302z interfaceC0302z = this.f3876d0;
        j0 j0Var = this.f4126D;
        p251z9.j.b(j0Var);
        return interfaceC0302z.c(this, j0Var, i10);
    }

    public final void d1() {
        if (this.f3969x) {
            return;
        }
        R0();
        n0().d();
        p251z9.j.b(this.f4126D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e1(InterfaceC0302z interfaceC0302z) {
        if (!interfaceC0302z.equals(this.f3876d0) && (((l0.q) interfaceC0302z).f19339r.f19341t & 512) != 0) {
            throw new ClassCastException();
        }
        this.f3876d0 = interfaceC0302z;
    }

    @Override // J0.P
    public final int h0(C0214m c0214m) {
        A a9 = this.f3877e0;
        if (a9 == null) {
            return AbstractC0283f.c(this, c0214m);
        }
        u.z zVar = a9.f3977H;
        int iD = zVar.d(c0214m);
        if (iD >= 0) {
            return zVar.f22786c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // J0.j0
    public final void y0() {
        if (this.f3877e0 == null) {
            this.f3877e0 = new A(this);
        }
    }
}
