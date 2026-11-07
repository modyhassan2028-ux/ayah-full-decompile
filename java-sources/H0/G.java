package H0;

import J0.j0;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0219s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final J0.Q f3155r;

    public G(J0.Q q10) {
        this.f3155r = q10;
    }

    @Override // H0.InterfaceC0219s
    public final long A(long j) {
        return p171r0.c.h(this.f3155r.f3972C.A(j), a());
    }

    @Override // H0.InterfaceC0219s
    public final long B(InterfaceC0219s interfaceC0219s, long j) {
        return b(interfaceC0219s, j);
    }

    @Override // H0.InterfaceC0219s
    public final boolean C() {
        return this.f3155r.f3972C.E0().f19338E;
    }

    @Override // H0.InterfaceC0219s
    public final void D(float[] fArr) {
        this.f3155r.f3972C.D(fArr);
    }

    @Override // H0.InterfaceC0219s
    public final long F() {
        J0.Q q10 = this.f3155r;
        return (((long) q10.f3168r) << 32) | (((long) q10.f3169s) & 4294967295L);
    }

    @Override // H0.InterfaceC0219s
    public final long G(long j) {
        return this.f3155r.f3972C.G(p171r0.c.h(j, a()));
    }

    @Override // H0.InterfaceC0219s
    public final p171r0.e J(InterfaceC0219s interfaceC0219s, boolean z10) {
        return this.f3155r.f3972C.J(interfaceC0219s, z10);
    }

    public final long a() {
        J0.Q q10 = this.f3155r;
        J0.Q qE = a0.e(q10);
        return p171r0.c.g(b(qE.f3975F, 0L), q10.f3972C.N0(qE.f3972C, 0L));
    }

    public final long b(InterfaceC0219s interfaceC0219s, long j) {
        boolean z10 = interfaceC0219s instanceof G;
        J0.Q q10 = this.f3155r;
        if (!z10) {
            J0.Q qE = a0.e(q10);
            InterfaceC0219s interfaceC0219s2 = qE.f3972C;
            long jB = b(qE.f3975F, j);
            long j10 = qE.f3973D;
            long jG = p171r0.c.g(jB, (4294967295L & ((long) Float.floatToRawIntBits((int) (j10 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
            InterfaceC0219s interfaceC0219sP = interfaceC0219s2.p();
            if (interfaceC0219sP != null) {
                interfaceC0219s2 = interfaceC0219sP;
            }
            return p171r0.c.h(jG, ((j0) interfaceC0219s2).N0(interfaceC0219s, 0L));
        }
        J0.Q q11 = ((G) interfaceC0219s).f3155r;
        j0 j0Var = q11.f3972C;
        j0Var.P0();
        J0.Q qC0 = q10.f3972C.z0(j0Var).C0();
        if (qC0 != null) {
            long jB2 = p063g1.j.b(p063g1.j.c(q11.v0(qC0, false), va.g.L(j)), q10.v0(qC0, false));
            return (((long) Float.floatToRawIntBits((int) (jB2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L);
        }
        J0.Q qE2 = a0.e(q11);
        long jC = p063g1.j.c(p063g1.j.c(q11.v0(qE2, false), qE2.f3973D), va.g.L(j));
        J0.Q qE3 = a0.e(q10);
        long jB3 = p063g1.j.b(jC, p063g1.j.c(q10.v0(qE3, false), qE3.f3973D));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB3 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB3 & 4294967295L))) & 4294967295L;
        j0 j0Var2 = qE3.f3972C.f4127E;
        p251z9.j.b(j0Var2);
        j0 j0Var3 = qE2.f3972C.f4127E;
        p251z9.j.b(j0Var3);
        return j0Var2.N0(j0Var3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // H0.InterfaceC0219s
    public final long f(long j) {
        return p171r0.c.h(this.f3155r.f3972C.f(j), a());
    }

    @Override // H0.InterfaceC0219s
    public final long h(long j) {
        return this.f3155r.f3972C.h(p171r0.c.h(j, a()));
    }

    @Override // H0.InterfaceC0219s
    public final InterfaceC0219s j() {
        J0.Q qC0;
        if (!C()) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        j0 j0Var = ((j0) this.f3155r.f3972C.f4125C.f3914W.f4065d).f4127E;
        if (j0Var == null || (qC0 = j0Var.C0()) == null) {
            return null;
        }
        return qC0.f3975F;
    }

    @Override // H0.InterfaceC0219s
    public final void m(InterfaceC0219s interfaceC0219s, float[] fArr) {
        this.f3155r.f3972C.m(interfaceC0219s, fArr);
    }

    @Override // H0.InterfaceC0219s
    public final InterfaceC0219s p() {
        J0.Q qC0;
        if (!C()) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        j0 j0Var = this.f3155r.f3972C.f4127E;
        if (j0Var == null || (qC0 = j0Var.C0()) == null) {
            return null;
        }
        return qC0.f3975F;
    }
}
