package J0;

import A.C0041r0;
import D0.InterfaceC0091i;
import H0.C0214m;
import H0.InterfaceC0219s;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends P implements H0.H, InterfaceC0219s, s0 {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final p180s0.G f4120Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final C0300x f4121Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final float[] f4122a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final C0279d f4123b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final C0279d f4124c0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final I f4125C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public j0 f4126D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public j0 f4127E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f4128F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f4129G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p241y9.c f4130H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public p063g1.c f4131I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p063g1.m f4132J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public H0.J f4134L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public u.z f4135M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f4137O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public p171r0.b f4138P;
    public C0300x Q;
    public p205v0.b R;
    public p180s0.o S;
    public A.K T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f4139V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public q0 f4140W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public p205v0.b f4141X;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f4133K = 0.8f;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f4136N = 0;
    public final g0 U = new g0(this, 1);

    static {
        p180s0.G g = new p180s0.G();
        g.f21788s = 1.0f;
        g.f21789t = 1.0f;
        g.f21790u = 1.0f;
        long j = p180s0.w.f21849a;
        g.f21794y = j;
        g.f21795z = j;
        g.f21779B = 8.0f;
        g.f21780C = p180s0.M.f21814b;
        g.f21781D = p180s0.F.f21774a;
        g.f21783F = 9205357640488583168L;
        g.f21784G = p050e8.b.a();
        g.f21785H = p063g1.m.f16261r;
        f4120Y = g;
        f4121Z = new C0300x();
        f4122a0 = p180s0.A.a();
        f4123b0 = new C0279d(1);
        f4124c0 = new C0279d(2);
    }

    public j0(I i10) {
        this.f4125C = i10;
        this.f4131I = i10.f3912P;
        this.f4132J = i10.Q;
    }

    public static j0 X0(InterfaceC0219s interfaceC0219s) {
        j0 j0Var;
        H0.G g = interfaceC0219s instanceof H0.G ? (H0.G) interfaceC0219s : null;
        if (g != null && (j0Var = g.f3155r.f3972C) != null) {
            return j0Var;
        }
        p251z9.j.c(interfaceC0219s, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (j0) interfaceC0219s;
    }

    @Override // H0.InterfaceC0219s
    public final long A(long j) {
        if (!E0().f19338E) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return N0(H0.a0.d(this), ((AndroidComposeView) L.a(this.f4125C)).M(j));
    }

    public final long A0(long j) {
        long j10 = this.f4136N;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j10 >> 32)))) << 32);
        q0 q0Var = this.f4140W;
        return q0Var != null ? q0Var.a(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    @Override // H0.InterfaceC0219s
    public final long B(InterfaceC0219s interfaceC0219s, long j) {
        return N0(interfaceC0219s, j);
    }

    public final p241y9.e B0() {
        A.K k7 = this.T;
        if (k7 != null) {
            return k7;
        }
        A.K k10 = new A.K(6, this, new g0(this, 0));
        this.T = k10;
        return k10;
    }

    @Override // H0.InterfaceC0219s
    public final boolean C() {
        return E0().f19338E;
    }

    public abstract Q C0();

    @Override // H0.InterfaceC0219s
    public final void D(float[] fArr) {
        r0 r0VarA = L.a(this.f4125C);
        j0 j0VarX0 = X0(H0.a0.d(this));
        Z0(j0VarX0, fArr);
        if (r0VarA instanceof InterfaceC0091i) {
            ((AndroidComposeView) ((InterfaceC0091i) r0VarA)).v(fArr);
            return;
        }
        if (!j0VarX0.E0().f19338E) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long jX = ((AndroidComposeView) L.a(j0VarX0.f4125C)).x(j0VarX0.G(0L));
        if ((9223372034707292159L & jX) != 9205357640488583168L) {
            p180s0.A.f(fArr, Float.intBitsToFloat((int) (jX >> 32)), Float.intBitsToFloat((int) (jX & 4294967295L)));
        }
    }

    public final long D0() {
        return this.f4131I.M(this.f4125C.R.g());
    }

    public abstract l0.q E0();

    @Override // H0.InterfaceC0219s
    public final long F() {
        return this.f3170t;
    }

    public final l0.q F0(int i10) {
        boolean zG = k0.g(i10);
        l0.q qVarE0 = E0();
        if (!zG && (qVarE0 = qVarE0.f19343v) == null) {
            return null;
        }
        for (l0.q qVarG0 = G0(zG); qVarG0 != null && (qVarG0.f19342u & i10) != 0; qVarG0 = qVarG0.f19344w) {
            if ((qVarG0.f19341t & i10) != 0) {
                return qVarG0;
            }
            if (qVarG0 == qVarE0) {
                return null;
            }
        }
        return null;
    }

    @Override // H0.InterfaceC0219s
    public final long G(long j) {
        if (!E0().f19338E) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        P0();
        for (j0 j0Var = this; j0Var != null; j0Var = j0Var.f4127E) {
            q0 q0Var = j0Var.f4140W;
            if (q0Var != null) {
                j = q0Var.a(j, false);
            }
            j = va.g.G(j, j0Var.f4136N);
        }
        return j;
    }

    public final l0.q G0(boolean z10) {
        l0.q qVarE0;
        C0280d0 c0280d0 = this.f4125C.f3914W;
        if (((j0) c0280d0.f4065d) == this) {
            return (l0.q) c0280d0.f4067f;
        }
        if (!z10) {
            j0 j0Var = this.f4127E;
            if (j0Var != null) {
                return j0Var.E0();
            }
            return null;
        }
        j0 j0Var2 = this.f4127E;
        if (j0Var2 == null || (qVarE0 = j0Var2.E0()) == null) {
            return null;
        }
        return qVarE0.f19344w;
    }

    public final void H0(l0.q qVar, C0279d c0279d, long j, C0296t c0296t, int i10, boolean z10) {
        if (qVar == null) {
            K0(c0279d, j, c0296t, i10, z10);
            return;
        }
        int i11 = c0296t.f4169t;
        u.A a9 = c0296t.f4167r;
        c0296t.c(i11 + 1, a9.f22651b);
        c0296t.f4169t++;
        a9.a(qVar);
        c0296t.f4168s.a(AbstractC0283f.a(-1.0f, z10, false));
        H0(AbstractC0283f.e(qVar, c0279d.b()), c0279d, j, c0296t, i10, z10);
        c0296t.f4169t = i11;
    }

    public final void I0(l0.q qVar, C0279d c0279d, long j, C0296t c0296t, int i10, boolean z10, float f3) {
        if (qVar == null) {
            K0(c0279d, j, c0296t, i10, z10);
            return;
        }
        int i11 = c0296t.f4169t;
        u.A a9 = c0296t.f4167r;
        c0296t.c(i11 + 1, a9.f22651b);
        c0296t.f4169t++;
        a9.a(qVar);
        c0296t.f4168s.a(AbstractC0283f.a(f3, z10, false));
        S0(AbstractC0283f.e(qVar, c0279d.b()), c0279d, j, c0296t, i10, z10, f3, true);
        c0296t.f4169t = i11;
    }

    @Override // H0.InterfaceC0219s
    public final p171r0.e J(InterfaceC0219s interfaceC0219s, boolean z10) {
        if (!E0().f19338E) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC0219s.C()) {
            G0.a.b("LayoutCoordinates " + interfaceC0219s + " is not attached!");
        }
        j0 j0VarX0 = X0(interfaceC0219s);
        j0VarX0.P0();
        j0 j0VarZ0 = z0(j0VarX0);
        p171r0.b bVar = this.f4138P;
        if (bVar == null) {
            bVar = new p171r0.b();
            this.f4138P = bVar;
        }
        bVar.f21383a = 0.0f;
        bVar.f21384b = 0.0f;
        bVar.f21385c = (int) (interfaceC0219s.F() >> 32);
        bVar.f21386d = (int) (interfaceC0219s.F() & 4294967295L);
        while (j0VarX0 != j0VarZ0) {
            j0VarX0.V0(bVar, z10, false);
            if (bVar.b()) {
                return p171r0.e.f21388e;
            }
            j0VarX0 = j0VarX0.f4127E;
            p251z9.j.b(j0VarX0);
        }
        s0(j0VarZ0, bVar, z10);
        return new p171r0.e(bVar.f21383a, bVar.f21384b, bVar.f21385c, bVar.f21386d);
    }

    public final void J0(C0279d c0279d, long j, C0296t c0296t, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        l0.q qVarF0 = F0(c0279d.b());
        if (!c1(j)) {
            if (i10 == 1) {
                float fV0 = v0(j, D0());
                if ((Float.floatToRawIntBits(fV0) & Integer.MAX_VALUE) < 2139095040) {
                    if (c0296t.f4169t != AbstractC0813f2.E(c0296t)) {
                        if (AbstractC0283f.h(c0296t.b(), AbstractC0283f.a(fV0, false, false)) <= 0) {
                            return;
                        }
                    }
                    I0(qVarF0, c0279d, j, c0296t, i10, false, fV0);
                    return;
                }
                return;
            }
            return;
        }
        if (qVarF0 == null) {
            K0(c0279d, j, c0296t, i10, z10);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < T() && fIntBitsToFloat2 < S()) {
            H0(qVarF0, c0279d, j, c0296t, i10, z10);
            return;
        }
        float fV1 = i10 == 1 ? v0(j, D0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fV1) & Integer.MAX_VALUE) < 2139095040) {
            if (c0296t.f4169t != AbstractC0813f2.E(c0296t)) {
                z11 = z10;
                if (AbstractC0283f.h(c0296t.b(), AbstractC0283f.a(fV1, z11, false)) > 0) {
                }
                S0(qVarF0, c0279d, j, c0296t, i10, z11, fV1, z12);
            }
            z11 = z10;
            z12 = true;
            S0(qVarF0, c0279d, j, c0296t, i10, z11, fV1, z12);
        }
        z11 = z10;
        z12 = false;
        S0(qVarF0, c0279d, j, c0296t, i10, z11, fV1, z12);
    }

    public void K0(C0279d c0279d, long j, C0296t c0296t, int i10, boolean z10) {
        j0 j0Var = this.f4126D;
        if (j0Var != null) {
            j0Var.J0(c0279d, j0Var.A0(j), c0296t, i10, z10);
        }
    }

    public final void L0() {
        q0 q0Var = this.f4140W;
        if (q0Var != null) {
            q0Var.invalidate();
            return;
        }
        j0 j0Var = this.f4127E;
        if (j0Var != null) {
            j0Var.L0();
        }
    }

    public final boolean M0() {
        if (this.f4140W != null && this.f4133K <= 0.0f) {
            return true;
        }
        j0 j0Var = this.f4127E;
        if (j0Var != null) {
            return j0Var.M0();
        }
        return false;
    }

    public final long N0(InterfaceC0219s interfaceC0219s, long j) {
        if (interfaceC0219s instanceof H0.G) {
            H0.G g = (H0.G) interfaceC0219s;
            g.f3155r.f3972C.P0();
            return g.b(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        j0 j0VarX0 = X0(interfaceC0219s);
        j0VarX0.P0();
        j0 j0VarZ0 = z0(j0VarX0);
        while (j0VarX0 != j0VarZ0) {
            q0 q0Var = j0VarX0.f4140W;
            if (q0Var != null) {
                j = q0Var.a(j, false);
            }
            j = va.g.G(j, j0VarX0.f4136N);
            j0VarX0 = j0VarX0.f4127E;
            p251z9.j.b(j0VarX0);
        }
        return t0(j0VarZ0, j);
    }

    public final void O0() {
        if (this.f4140W != null || this.f4130H == null) {
            return;
        }
        q0 q0VarU = p245z2.a.u(L.a(this.f4125C), B0(), this.U, this.f4141X, false, 8);
        q0VarU.d(this.f3170t);
        q0VarU.g(this.f4136N);
        q0VarU.invalidate();
        this.f4140W = q0VarU;
    }

    public final void P0() {
        M m10 = this.f4125C.f3915X;
        E e10 = m10.f3945a.f3915X.f3948d;
        E e11 = E.f3884t;
        E e12 = E.f3885u;
        if (e10 == e11 || e10 == e12) {
            if (m10.f3958p.S) {
                m10.e(true);
            } else {
                m10.d(true);
            }
        }
        if (e10 == e12) {
            V v10 = m10.f3959q;
            if (v10 == null || !v10.f4000M) {
                m10.f(true);
            } else {
                m10.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void Q0() {
        l0.q qVarE0;
        boolean zG = k0.g(128);
        l0.q qVarG0 = G0(zG);
        if (qVarG0 == null || (qVarG0.f19339r.f19342u & 128) == 0) {
            return;
        }
        p093j0.i iVarC = p093j0.s.c();
        p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
        p093j0.i iVarD = p093j0.s.d(iVarC);
        try {
            if (!zG) {
                qVarE0 = E0().f19343v;
                if (qVarE0 == null) {
                }
                p093j0.s.g(iVarC, iVarD, cVarE);
            }
            qVarE0 = E0();
            for (l0.q qVarG1 = G0(zG); qVarG1 != null && (qVarG1.f19342u & 128) != 0; qVarG1 = qVarG1.f19344w) {
                if ((qVarG1.f19341t & 128) != 0) {
                    ?? F10 = qVarG1;
                    ?? eVar = 0;
                    while (F10 != 0) {
                        if (F10 instanceof InterfaceC0301y) {
                            ((InterfaceC0301y) F10).s(this.f3170t);
                        } else if ((F10.f19341t & 128) != 0 && (F10 instanceof AbstractC0291n)) {
                            l0.q qVar = ((AbstractC0291n) F10).f4151G;
                            int i10 = 0;
                            F10 = F10;
                            eVar = eVar;
                            while (qVar != null) {
                                if ((qVar.f19341t & 128) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        eVar = eVar;
                                        F10 = qVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new p011b0.e(new l0.q[16]);
                                        }
                                        if (F10 != 0) {
                                            eVar.b(F10);
                                            F10 = 0;
                                        }
                                        eVar.b(qVar);
                                    }
                                }
                                qVar = qVar.f19344w;
                                F10 = F10;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        F10 = AbstractC0283f.f(eVar);
                    }
                }
                if (qVarG1 == qVarE0) {
                    break;
                }
            }
            p093j0.s.g(iVarC, iVarD, cVarE);
        } catch (Throwable th) {
            p093j0.s.g(iVarC, iVarD, cVarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void R0() {
        boolean zG = k0.g(128);
        l0.q qVarE0 = E0();
        if (!zG && (qVarE0 = qVarE0.f19343v) == null) {
            return;
        }
        for (l0.q qVarG0 = G0(zG); qVarG0 != null && (qVarG0.f19342u & 128) != 0; qVarG0 = qVarG0.f19344w) {
            if ((qVarG0.f19341t & 128) != 0) {
                ?? F10 = qVarG0;
                ?? eVar = 0;
                while (F10 != 0) {
                    if (F10 instanceof InterfaceC0301y) {
                        ((InterfaceC0301y) F10).G(this);
                    } else if ((F10.f19341t & 128) != 0 && (F10 instanceof AbstractC0291n)) {
                        l0.q qVar = ((AbstractC0291n) F10).f4151G;
                        int i10 = 0;
                        F10 = F10;
                        eVar = eVar;
                        while (qVar != null) {
                            if ((qVar.f19341t & 128) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    eVar = eVar;
                                    F10 = qVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new p011b0.e(new l0.q[16]);
                                    }
                                    if (F10 != 0) {
                                        eVar.b(F10);
                                        F10 = 0;
                                    }
                                    eVar.b(qVar);
                                }
                            }
                            qVar = qVar.f19344w;
                            F10 = F10;
                            eVar = eVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    F10 = AbstractC0283f.f(eVar);
                }
            }
            if (qVarG0 == qVarE0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x018d A[PHI: r5
      0x018d: PHI (r5v3 ??) = (r5v1 ??), (r5v1 ??), (r5v5 ??) binds: [B:50:0x0159, B:52:0x015d, B:66:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v17, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void S0(l0.q qVar, C0279d c0279d, long j, C0296t c0296t, int i10, boolean z10, float f3, boolean z11) {
        ?? F10;
        if (qVar == null) {
            K0(c0279d, j, c0296t, i10, z10);
            return;
        }
        int i11 = i10;
        if (i11 == 3 || i11 == 4) {
            ?? r10 = qVar;
            ?? eVar = 0;
            while (r10 != 0) {
                if (r10 instanceof w0) {
                    long jQ = ((w0) r10).q();
                    int i12 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i12);
                    I i13 = this.f4125C;
                    p063g1.m mVar = i13.Q;
                    int i14 = A0.f3874b;
                    long j10 = Long.MIN_VALUE & jQ;
                    p063g1.m mVar2 = p063g1.m.f16261r;
                    if (fIntBitsToFloat < (-((j10 == 0 || mVar == mVar2) ? C0279d.a(jQ, 0) : C0279d.a(jQ, 2)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i12) >= T() + ((j10 == 0 || i13.Q == mVar2) ? C0279d.a(jQ, 2) : C0279d.a(jQ, 0))) {
                        break;
                    }
                    int i15 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i15) < (-C0279d.a(jQ, 1))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i15) >= C0279d.a(jQ, 3) + S()) {
                        break;
                    }
                    h0 h0Var = new h0(this, qVar, c0279d, j, c0296t, i11, z10, f3, z11);
                    u.v vVar = c0296t.f4168s;
                    u.A a9 = c0296t.f4167r;
                    if (c0296t.f4169t == AbstractC0813f2.E(c0296t)) {
                        int i16 = c0296t.f4169t;
                        c0296t.c(i16 + 1, a9.f22651b);
                        c0296t.f4169t++;
                        a9.a(qVar);
                        vVar.a(AbstractC0283f.a(0.0f, z10, true));
                        h0Var.invoke();
                        c0296t.f4169t = i16;
                        return;
                    }
                    long jB = c0296t.b();
                    int i17 = c0296t.f4169t;
                    if (!AbstractC0283f.p(jB)) {
                        if (AbstractC0283f.l(jB) > 0.0f) {
                            int i18 = c0296t.f4169t;
                            c0296t.c(i18 + 1, a9.f22651b);
                            c0296t.f4169t++;
                            a9.a(qVar);
                            vVar.a(AbstractC0283f.a(0.0f, z10, true));
                            h0Var.invoke();
                            c0296t.f4169t = i18;
                            return;
                        }
                        return;
                    }
                    int iE = AbstractC0813f2.E(c0296t);
                    c0296t.f4169t = iE;
                    c0296t.c(iE + 1, a9.f22651b);
                    c0296t.f4169t++;
                    a9.a(qVar);
                    vVar.a(AbstractC0283f.a(0.0f, z10, true));
                    h0Var.invoke();
                    c0296t.f4169t = iE;
                    if (AbstractC0283f.l(c0296t.b()) < 0.0f) {
                        c0296t.c(i17 + 1, c0296t.f4169t + 1);
                    }
                    c0296t.f4169t = i17;
                    return;
                }
                if ((r10.f19341t & 16) == 0 || !(r10 instanceof AbstractC0291n)) {
                    F10 = r10;
                    eVar = eVar;
                    F10 = AbstractC0283f.f(eVar);
                } else {
                    l0.q qVar2 = ((AbstractC0291n) r10).f4151G;
                    int i19 = 0;
                    while (qVar2 != null) {
                        if ((qVar2.f19341t & 16) != 0) {
                            i19++;
                            if (i19 == 1) {
                                F10 = r10;
                                eVar = eVar;
                                eVar = eVar;
                                F10 = qVar2;
                            } else {
                                if (eVar == 0) {
                                    eVar = new p011b0.e(new l0.q[16]);
                                }
                                if (F10 != 0) {
                                    eVar.b(F10);
                                    F10 = 0;
                                }
                                eVar.b(qVar2);
                            }
                        } else {
                            F10 = r10;
                            eVar = eVar;
                        }
                        qVar2 = qVar2.f19344w;
                        F10 = F10;
                        eVar = eVar;
                    }
                    if (i19 == 1) {
                        F10 = r10;
                        eVar = eVar;
                    } else {
                        F10 = r10;
                        eVar = eVar;
                        F10 = AbstractC0283f.f(eVar);
                    }
                }
                i11 = i10;
                r10 = F10;
                eVar = eVar;
            }
        }
        if (z11) {
            I0(qVar, c0279d, j, c0296t, i10, z10, f3);
            return;
        }
        switch (c0279d.f4061r) {
            case 1:
                ?? eVar2 = 0;
                ?? F11 = qVar;
                while (F11 != 0) {
                    if (F11 instanceof w0) {
                        ((w0) F11).a0();
                    } else if ((F11.f19341t & 16) != 0 && (F11 instanceof AbstractC0291n)) {
                        l0.q qVar3 = ((AbstractC0291n) F11).f4151G;
                        int i20 = 0;
                        while (qVar3 != null) {
                            if ((qVar3.f19341t & 16) != 0) {
                                i20++;
                                if (i20 == 1) {
                                    F11 = F11;
                                    eVar2 = eVar2;
                                    eVar2 = eVar2;
                                    F11 = qVar3;
                                } else {
                                    if (eVar2 == 0) {
                                        eVar2 = new p011b0.e(new l0.q[16]);
                                    }
                                    if (F11 != 0) {
                                        eVar2.b(F11);
                                        F11 = 0;
                                    }
                                    eVar2.b(qVar3);
                                }
                            } else {
                                F11 = F11;
                                eVar2 = eVar2;
                            }
                            qVar3 = qVar3.f19344w;
                            F11 = F11;
                            eVar2 = eVar2;
                        }
                        if (i20 == 1) {
                            F11 = F11;
                            eVar2 = eVar2;
                        } else {
                            F11 = F11;
                            eVar2 = eVar2;
                        }
                    }
                    F11 = AbstractC0283f.f(eVar2);
                }
                break;
        }
        S0(AbstractC0283f.e(qVar, c0279d.b()), c0279d, j, c0296t, i10, z10, f3, false);
    }

    public abstract void T0(p180s0.o oVar, p205v0.b bVar);

    public final void U0(long j, float f3, p241y9.c cVar, p205v0.b bVar) {
        I i10 = this.f4125C;
        if (bVar != null) {
            if (cVar != null) {
                G0.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f4141X != bVar) {
                this.f4141X = null;
                a1(null, false);
                this.f4141X = bVar;
            }
            if (this.f4140W == null) {
                r0 r0VarA = L.a(i10);
                p241y9.e eVarB0 = B0();
                g0 g0Var = this.U;
                q0 q0VarU = p245z2.a.u(r0VarA, eVarB0, g0Var, bVar, false, 8);
                q0VarU.d(this.f3170t);
                q0VarU.g(j);
                this.f4140W = q0VarU;
                i10.f3918a0 = true;
                g0Var.invoke();
            }
        } else {
            if (this.f4141X != null) {
                this.f4141X = null;
                a1(null, false);
            }
            a1(cVar, false);
        }
        if (!p063g1.j.a(this.f4136N, j)) {
            this.f4136N = j;
            i10.f3915X.f3958p.k0();
            q0 q0Var = this.f4140W;
            if (q0Var != null) {
                q0Var.g(j);
            } else {
                j0 j0Var = this.f4127E;
                if (j0Var != null) {
                    j0Var.L0();
                }
            }
            P.q0(this);
            r0 r0Var = i10.f3901E;
            if (r0Var != null) {
                ((AndroidComposeView) r0Var).E(i10);
            }
        }
        this.f4137O = f3;
        if (this.f3970y) {
            return;
        }
        i0(new v0(n0(), this));
    }

    @Override // H0.U
    public abstract void V(long j, float f3, p205v0.b bVar);

    public final void V0(p171r0.b bVar, boolean z10, boolean z11) {
        q0 q0Var = this.f4140W;
        if (q0Var != null) {
            if (this.f4129G) {
                if (z11) {
                    long jD0 = D0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jD0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD0 & 4294967295L)) / 2.0f;
                    long j = this.f3170t;
                    bVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z10) {
                    long j10 = this.f3170t;
                    bVar.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            q0Var.i(bVar, false);
        }
        long j11 = this.f4136N;
        float f3 = (int) (j11 >> 32);
        bVar.f21383a += f3;
        bVar.f21385c += f3;
        float f7 = (int) (j11 & 4294967295L);
        bVar.f21384b += f7;
        bVar.f21386d += f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [b0.e] */
    public final void W0(H0.J j) {
        j0 j0Var;
        H0.J j10 = this.f4134L;
        if (j != j10) {
            this.f4134L = j;
            I i10 = this.f4125C;
            int i11 = 0;
            if (j10 == null || j.b() != j10.b() || j.a() != j10.a()) {
                int iB = j.b();
                int iA = j.a();
                q0 q0Var = this.f4140W;
                if (q0Var != null) {
                    q0Var.d((((long) iB) << 32) | (((long) iA) & 4294967295L));
                } else if (i10.I() && (j0Var = this.f4127E) != null) {
                    j0Var.L0();
                }
                Z((((long) iA) & 4294967295L) | (((long) iB) << 32));
                if (this.f4130H != null) {
                    b1(false);
                }
                boolean zG = k0.g(4);
                l0.q qVarE0 = E0();
                if (zG || (qVarE0 = qVarE0.f19343v) != null) {
                    for (l0.q qVarG0 = G0(zG); qVarG0 != null && (qVarG0.f19342u & 4) != 0; qVarG0 = qVarG0.f19344w) {
                        if ((qVarG0.f19341t & 4) != 0) {
                            ?? F10 = qVarG0;
                            ?? eVar = 0;
                            while (F10 != 0) {
                                if (F10 instanceof InterfaceC0293p) {
                                    ((InterfaceC0293p) F10).Y();
                                } else if ((F10.f19341t & 4) != 0 && (F10 instanceof AbstractC0291n)) {
                                    l0.q qVar = ((AbstractC0291n) F10).f4151G;
                                    int i12 = 0;
                                    F10 = F10;
                                    eVar = eVar;
                                    while (qVar != null) {
                                        if ((qVar.f19341t & 4) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                eVar = eVar;
                                                F10 = qVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p011b0.e(new l0.q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar.b(F10);
                                                    F10 = 0;
                                                }
                                                eVar.b(qVar);
                                            }
                                        }
                                        qVar = qVar.f19344w;
                                        F10 = F10;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                F10 = AbstractC0283f.f(eVar);
                            }
                        }
                        if (qVarG0 == qVarE0) {
                            break;
                        }
                    }
                }
                r0 r0Var = i10.f3901E;
                if (r0Var != null) {
                    ((AndroidComposeView) r0Var).E(i10);
                }
            }
            u.z zVar = this.f4135M;
            if ((zVar == null || zVar.f22788e == 0) && j.c().isEmpty()) {
                return;
            }
            u.z zVar2 = this.f4135M;
            Map mapC = j.c();
            if (zVar2 != null && zVar2.f22788e == mapC.size()) {
                Object[] objArr = zVar2.f22785b;
                int[] iArr = zVar2.f22786c;
                long[] jArr = zVar2.f22784a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i13 = 0;
                loop0: while (true) {
                    long j11 = jArr[i13];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = i11; i15 < i14; i15++) {
                            if ((255 & j11) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr[i16];
                                int i17 = iArr[i16];
                                Integer num = (Integer) mapC.get((C0214m) obj);
                                if (num == null || num.intValue() != i17) {
                                    break loop0;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i14 != 8) {
                            return;
                        }
                    }
                    if (i13 == length) {
                        return;
                    }
                    i13++;
                    i11 = 0;
                }
            }
            i10.f3915X.f3958p.f4036P.f();
            u.z zVar3 = this.f4135M;
            if (zVar3 == null) {
                u.z zVar4 = u.J.f22695a;
                zVar3 = new u.z();
                this.f4135M = zVar3;
            }
            zVar3.a();
            for (Map.Entry entry : j.c().entrySet()) {
                zVar3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void Y0(j0 j0Var, float[] fArr) {
        if (p251z9.j.a(j0Var, this)) {
            return;
        }
        j0 j0Var2 = this.f4127E;
        p251z9.j.b(j0Var2);
        j0Var2.Y0(j0Var, fArr);
        if (!p063g1.j.a(this.f4136N, 0L)) {
            float[] fArr2 = f4122a0;
            p180s0.A.d(fArr2);
            long j = this.f4136N;
            p180s0.A.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            p180s0.A.e(fArr, fArr2);
        }
        q0 q0Var = this.f4140W;
        if (q0Var != null) {
            q0Var.f(fArr);
        }
    }

    public final void Z0(j0 j0Var, float[] fArr) {
        j0 j0Var2 = this;
        while (!j0Var2.equals(j0Var)) {
            q0 q0Var = j0Var2.f4140W;
            if (q0Var != null) {
                q0Var.e(fArr);
            }
            long j = j0Var2.f4136N;
            if (!p063g1.j.a(j, 0L)) {
                float[] fArr2 = f4122a0;
                p180s0.A.d(fArr2);
                p180s0.A.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                p180s0.A.e(fArr, fArr2);
            }
            j0Var2 = j0Var2.f4127E;
            p251z9.j.b(j0Var2);
        }
    }

    public final void a1(p241y9.c cVar, boolean z10) {
        r0 r0Var;
        if (cVar != null && this.f4141X != null) {
            G0.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        I i10 = this.f4125C;
        boolean z11 = (!z10 && this.f4130H == cVar && p251z9.j.a(this.f4131I, i10.f3912P) && this.f4132J == i10.Q) ? false : true;
        this.f4131I = i10.f3912P;
        this.f4132J = i10.Q;
        boolean zH = i10.H();
        g0 g0Var = this.U;
        if (!zH || cVar == null) {
            this.f4130H = null;
            q0 q0Var = this.f4140W;
            if (q0Var != null) {
                q0Var.destroy();
                i10.f3918a0 = true;
                g0Var.invoke();
                if (E0().f19338E && i10.I() && (r0Var = i10.f3901E) != null) {
                    ((AndroidComposeView) r0Var).E(i10);
                }
            }
            this.f4140W = null;
            this.f4139V = false;
            return;
        }
        this.f4130H = cVar;
        if (this.f4140W != null) {
            if (z11 && b1(true)) {
                L.a(i10).getRectManager().e(i10);
                return;
            }
            return;
        }
        q0 q0VarU = p245z2.a.u(L.a(i10), B0(), g0Var, null, i10.f3931x, 4);
        q0VarU.d(this.f3170t);
        q0VarU.g(this.f4136N);
        this.f4140W = q0VarU;
        b1(true);
        i10.f3918a0 = true;
        g0Var.invoke();
    }

    public final boolean b1(boolean z10) {
        r0 r0Var;
        boolean z11 = false;
        if (this.f4141X == null) {
            q0 q0Var = this.f4140W;
            if (q0Var != null) {
                p241y9.c cVar = this.f4130H;
                if (cVar == null) {
                    throw android.support.v4.media.session.p.s("updateLayerParameters requires a non-null layerBlock");
                }
                p180s0.G g = f4120Y;
                g.e(1.0f);
                g.f(1.0f);
                g.a(1.0f);
                g.m(0.0f);
                g.o(0.0f);
                g.h(0.0f);
                long j = p180s0.w.f21849a;
                g.c(j);
                g.j(j);
                if (g.f21778A != 0.0f) {
                    g.f21787r |= 1024;
                    g.f21778A = 0.0f;
                }
                if (g.f21779B != 8.0f) {
                    g.f21787r |= 2048;
                    g.f21779B = 8.0f;
                }
                g.l(p180s0.M.f21814b);
                g.i(p180s0.F.f21774a);
                g.d(false);
                g.f21783F = 9205357640488583168L;
                g.f21786I = null;
                g.f21787r = 0;
                I i10 = this.f4125C;
                g.f21784G = i10.f3912P;
                g.f21785H = i10.Q;
                g.f21783F = B9.a.d0(this.f3170t);
                L.a(i10).getSnapshotObserver().a(this, C0281e.f4077v, new C0041r0(10, cVar));
                C0300x c0300x = this.Q;
                if (c0300x == null) {
                    c0300x = new C0300x();
                    this.Q = c0300x;
                }
                C0300x c0300x2 = f4121Z;
                c0300x2.getClass();
                c0300x2.f4184a = c0300x.f4184a;
                c0300x2.f4185b = c0300x.f4185b;
                c0300x2.f4186c = c0300x.f4186c;
                c0300x2.f4187d = c0300x.f4187d;
                c0300x2.f4188e = c0300x.f4188e;
                c0300x2.f4189f = c0300x.f4189f;
                c0300x2.g = c0300x.g;
                c0300x.f4184a = g.f21788s;
                c0300x.f4185b = g.f21789t;
                c0300x.f4186c = g.f21791v;
                c0300x.f4187d = g.f21792w;
                c0300x.f4188e = g.f21778A;
                c0300x.f4189f = g.f21779B;
                c0300x.g = g.f21780C;
                q0Var.k(g);
                boolean z12 = this.f4129G;
                this.f4129G = g.f21782E;
                this.f4133K = g.f21790u;
                if (c0300x2.f4184a == c0300x.f4184a && c0300x2.f4185b == c0300x.f4185b && c0300x2.f4186c == c0300x.f4186c && c0300x2.f4187d == c0300x.f4187d && c0300x2.f4188e == c0300x.f4188e && c0300x2.f4189f == c0300x.f4189f && p180s0.M.a(c0300x2.g, c0300x.g)) {
                    z11 = true;
                }
                boolean z13 = !z11;
                if (z10 && ((!z11 || z12 != this.f4129G) && (r0Var = i10.f3901E) != null)) {
                    ((AndroidComposeView) r0Var).E(i10);
                }
                return z13;
            }
            if (this.f4130H != null) {
                G0.a.b("null layer with a non-null layerBlock");
                return false;
            }
        }
        return false;
    }

    public final boolean c1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        q0 q0Var = this.f4140W;
        return q0Var == null || !this.f4129G || q0Var.j(j);
    }

    @Override // H0.InterfaceC0219s
    public final long f(long j) {
        if (!E0().f19338E) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC0219s interfaceC0219sD = H0.a0.d(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) L.a(this.f4125C);
        androidComposeView.I();
        return N0(interfaceC0219sD, p171r0.c.g(p180s0.A.b(j, androidComposeView.f12037l0), interfaceC0219sD.G(0L)));
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f4125C.f3912P.getDensity();
    }

    @Override // H0.InterfaceC0215n
    public final p063g1.m getLayoutDirection() {
        return this.f4125C.Q;
    }

    @Override // H0.InterfaceC0219s
    public final long h(long j) {
        long jG = G(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) L.a(this.f4125C);
        androidComposeView.I();
        return p180s0.A.b(jG, androidComposeView.f12036k0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // H0.U, H0.H
    public final Object i() {
        I i10 = this.f4125C;
        if (!i10.f3914W.g(64)) {
            return null;
        }
        E0();
        Object objI = null;
        for (l0.q qVar = (z0) i10.f3914W.f4066e; qVar != null; qVar = qVar.f19343v) {
            if ((qVar.f19341t & 64) != 0) {
                ?? F10 = qVar;
                ?? eVar = 0;
                while (F10 != 0) {
                    if (F10 instanceof u0) {
                        objI = ((u0) F10).i(i10.f3912P, objI);
                    } else if ((F10.f19341t & 64) != 0 && (F10 instanceof AbstractC0291n)) {
                        l0.q qVar2 = ((AbstractC0291n) F10).f4151G;
                        int i11 = 0;
                        F10 = F10;
                        eVar = eVar;
                        while (qVar2 != null) {
                            if ((qVar2.f19341t & 64) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    eVar = eVar;
                                    F10 = qVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new p011b0.e(new l0.q[16]);
                                    }
                                    if (F10 != 0) {
                                        eVar.b(F10);
                                        F10 = 0;
                                    }
                                    eVar.b(qVar2);
                                }
                            }
                            qVar2 = qVar2.f19344w;
                            F10 = F10;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                        }
                    }
                    F10 = AbstractC0283f.f(eVar);
                }
            }
        }
        return objI;
    }

    @Override // H0.InterfaceC0219s
    public final InterfaceC0219s j() {
        if (!E0().f19338E) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        P0();
        return ((j0) this.f4125C.f3914W.f4065d).f4127E;
    }

    @Override // J0.P
    public final P j0() {
        return this.f4126D;
    }

    @Override // J0.P
    public final boolean l0() {
        return this.f4134L != null;
    }

    @Override // H0.InterfaceC0219s
    public final void m(InterfaceC0219s interfaceC0219s, float[] fArr) {
        j0 j0VarX0 = X0(interfaceC0219s);
        j0VarX0.P0();
        j0 j0VarZ0 = z0(j0VarX0);
        p180s0.A.d(fArr);
        j0VarX0.Z0(j0VarZ0, fArr);
        Y0(j0VarZ0, fArr);
    }

    @Override // J0.P
    public final I m0() {
        return this.f4125C;
    }

    @Override // p063g1.c
    public final float n() {
        return this.f4125C.f3912P.n();
    }

    @Override // J0.P
    public final H0.J n0() {
        H0.J j = this.f4134L;
        if (j != null) {
            return j;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // J0.P
    public final P o0() {
        return this.f4127E;
    }

    @Override // H0.InterfaceC0219s
    public final InterfaceC0219s p() {
        if (!E0().f19338E) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        P0();
        return this.f4127E;
    }

    @Override // J0.P
    public final long p0() {
        return this.f4136N;
    }

    @Override // J0.P
    public final void r0() {
        p205v0.b bVar = this.f4141X;
        if (bVar != null) {
            V(this.f4136N, this.f4137O, bVar);
        } else {
            Y(this.f4136N, this.f4137O, this.f4130H);
        }
    }

    public final void s0(j0 j0Var, p171r0.b bVar, boolean z10) {
        if (j0Var == this) {
            return;
        }
        j0 j0Var2 = this.f4127E;
        if (j0Var2 != null) {
            j0Var2.s0(j0Var, bVar, z10);
        }
        long j = this.f4136N;
        float f3 = (int) (j >> 32);
        bVar.f21383a -= f3;
        bVar.f21385c -= f3;
        float f7 = (int) (j & 4294967295L);
        bVar.f21384b -= f7;
        bVar.f21386d -= f7;
        q0 q0Var = this.f4140W;
        if (q0Var != null) {
            q0Var.i(bVar, true);
            if (this.f4129G && z10) {
                long j10 = this.f3170t;
                bVar.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }
    }

    public final long t0(j0 j0Var, long j) {
        if (j0Var == this) {
            return j;
        }
        j0 j0Var2 = this.f4127E;
        return (j0Var2 == null || p251z9.j.a(j0Var, j0Var2)) ? A0(j) : A0(j0Var2.t0(j0Var, j));
    }

    public final long u0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - T();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - S();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float v0(long j, long j10) {
        if (T() >= Float.intBitsToFloat((int) (j10 >> 32)) && S() >= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jU0 = u0(j10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jU0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - T());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - S()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i10 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i10) <= fIntBitsToFloat) {
                int i11 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i11) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i10);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void w0(p180s0.o oVar, p205v0.b bVar) {
        q0 q0Var = this.f4140W;
        if (q0Var != null) {
            q0Var.b(oVar, bVar);
            return;
        }
        long j = this.f4136N;
        float f3 = (int) (j >> 32);
        float f7 = (int) (j & 4294967295L);
        oVar.m(f3, f7);
        x0(oVar, bVar);
        oVar.m(-f3, -f7);
    }

    @Override // J0.s0
    public final boolean x() {
        return (this.f4140W == null || this.f4128F || !this.f4125C.H()) ? false : true;
    }

    public final void x0(p180s0.o oVar, p205v0.b bVar) {
        p180s0.o oVar2;
        p205v0.b bVar2;
        l0.q qVarF0 = F0(4);
        if (qVarF0 == null) {
            T0(oVar, bVar);
            return;
        }
        I i10 = this.f4125C;
        i10.getClass();
        K sharedDrawScope = L.a(i10).getSharedDrawScope();
        long jD0 = B9.a.d0(this.f3170t);
        sharedDrawScope.getClass();
        p011b0.e eVar = null;
        while (qVarF0 != null) {
            if (qVarF0 instanceof InterfaceC0293p) {
                oVar2 = oVar;
                bVar2 = bVar;
                sharedDrawScope.c(oVar2, jD0, this, (InterfaceC0293p) qVarF0, bVar2);
            } else {
                oVar2 = oVar;
                bVar2 = bVar;
                if ((qVarF0.f19341t & 4) != 0 && (qVarF0 instanceof AbstractC0291n)) {
                    int i11 = 0;
                    for (l0.q qVar = ((AbstractC0291n) qVarF0).f4151G; qVar != null; qVar = qVar.f19344w) {
                        if ((qVar.f19341t & 4) != 0) {
                            i11++;
                            if (i11 == 1) {
                                qVarF0 = qVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new p011b0.e(new l0.q[16]);
                                }
                                if (qVarF0 != null) {
                                    eVar.b(qVarF0);
                                    qVarF0 = null;
                                }
                                eVar.b(qVar);
                            }
                        }
                    }
                    if (i11 == 1) {
                    }
                }
                oVar = oVar2;
                bVar = bVar2;
            }
            qVarF0 = AbstractC0283f.f(eVar);
            oVar = oVar2;
            bVar = bVar2;
        }
    }

    public abstract void y0();

    public final j0 z0(j0 j0Var) {
        I iU = j0Var.f4125C;
        I i10 = this.f4125C;
        if (iU == i10) {
            l0.q qVarE0 = j0Var.E0();
            l0.q qVarE1 = E0();
            if (!qVarE1.f19339r.f19338E) {
                G0.a.b("visitLocalAncestors called on an unattached node");
            }
            for (l0.q qVar = qVarE1.f19339r.f19343v; qVar != null; qVar = qVar.f19343v) {
                if ((qVar.f19341t & 2) != 0 && qVar == qVarE0) {
                    return j0Var;
                }
            }
            return this;
        }
        while (iU.f3903G > i10.f3903G) {
            iU = iU.u();
            p251z9.j.b(iU);
        }
        I iU2 = i10;
        while (iU2.f3903G > iU.f3903G) {
            iU2 = iU2.u();
            p251z9.j.b(iU2);
        }
        while (iU != iU2) {
            iU = iU.u();
            iU2 = iU2.u();
            if (iU == null || iU2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (iU2 != i10) {
            if (iU != j0Var.f4125C) {
                return (C0298v) iU.f3914W.f4064c;
            }
            return j0Var;
        }
        return this;
    }

    @Override // J0.P
    public final InterfaceC0219s k0() {
        return this;
    }
}
