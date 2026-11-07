package J0;

import A.M0;
import H0.C0214m;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends H0.U implements H0.H, InterfaceC0273a, InterfaceC0276b0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f4021A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4022B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f4024D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p241y9.c f4026F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p205v0.b f4027G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f4028H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Object f4030J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f4031K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f4032L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f4033M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f4034N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f4035O;
    public boolean S;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f4038W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f4039X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public p241y9.c f4040Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public p205v0.b f4041Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f4043b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f4045d0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final M f4046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4048y = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4049z = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public G f4023C = G.f3891t;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f4025E = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f4029I = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final J f4036P = new J(this, 0);
    public final p011b0.e Q = new p011b0.e(new Z[16]);
    public boolean R = true;
    public long T = p063g1.b.b(0, 0, 15);
    public final Y U = new Y(this, 1);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Y f4037V = new Y(this, 0);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f4042a0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Y f4044c0 = new Y(this, 2);

    public Z(M m10) {
        this.f4046w = m10;
    }

    @Override // H0.H
    public final int H(int i10) {
        M m10 = this.f4046w;
        if (!AbstractC0283f.s(m10.f3945a)) {
            l0();
            return m10.a().H(i10);
        }
        V v10 = m10.f3959q;
        p251z9.j.b(v10);
        return v10.H(i10);
    }

    @Override // J0.InterfaceC0273a
    public final void L() {
        I.W(this.f4046w.f3945a, false, 7);
    }

    @Override // H0.H
    public final int N(int i10) {
        M m10 = this.f4046w;
        if (!AbstractC0283f.s(m10.f3945a)) {
            l0();
            return m10.a().N(i10);
        }
        V v10 = m10.f3959q;
        p251z9.j.b(v10);
        return v10.N(i10);
    }

    @Override // H0.H
    public final int P(int i10) {
        M m10 = this.f4046w;
        if (!AbstractC0283f.s(m10.f3945a)) {
            l0();
            return m10.a().P(i10);
        }
        V v10 = m10.f3959q;
        p251z9.j.b(v10);
        return v10.P(i10);
    }

    @Override // H0.U
    public final int R(C0214m c0214m) {
        M m10 = this.f4046w;
        I iU = m10.f3945a.u();
        E e10 = iU != null ? iU.f3915X.f3948d : null;
        E e11 = E.f3882r;
        J j = this.f4036P;
        if (e10 == e11) {
            j.f3936c = true;
        } else {
            I iU2 = m10.f3945a.u();
            if ((iU2 != null ? iU2.f3915X.f3948d : null) == E.f3884t) {
                j.f3937d = true;
            }
        }
        this.f4024D = true;
        int iR = m10.a().R(c0214m);
        this.f4024D = false;
        return iR;
    }

    @Override // H0.U
    public final int S() {
        return this.f4046w.a().S();
    }

    @Override // H0.U
    public final int T() {
        return this.f4046w.a().T();
    }

    @Override // H0.U
    public final void V(long j, float f3, p205v0.b bVar) {
        o0(j, f3, null, bVar);
    }

    @Override // H0.U
    public final void Y(long j, float f3, p241y9.c cVar) {
        o0(j, f3, cVar, null);
    }

    @Override // H0.H
    public final H0.U a(long j) {
        G g;
        M m10 = this.f4046w;
        I i10 = m10.f3945a;
        G g10 = i10.T;
        G g11 = G.f3891t;
        if (g10 == g11) {
            i10.f();
        }
        if (AbstractC0283f.s(m10.f3945a)) {
            V v10 = m10.f3959q;
            p251z9.j.b(v10);
            v10.f3988A = g11;
            v10.a(j);
        }
        I i11 = m10.f3945a;
        I iU = i11.u();
        if (iU != null) {
            M m11 = iU.f3915X;
            if (this.f4023C != g11 && !i11.f3913V) {
                G0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = m11.f3948d.ordinal();
            if (iOrdinal == 0) {
                g = G.f3889r;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + m11.f3948d);
                }
                g = G.f3890s;
            }
            this.f4023C = g;
        } else {
            this.f4023C = g11;
        }
        p0(j);
        return this;
    }

    @Override // J0.InterfaceC0273a
    public final J c() {
        return this.f4036P;
    }

    @Override // H0.H
    public final int d(int i10) {
        M m10 = this.f4046w;
        if (!AbstractC0283f.s(m10.f3945a)) {
            l0();
            return m10.a().d(i10);
        }
        V v10 = m10.f3959q;
        p251z9.j.b(v10);
        return v10.d(i10);
    }

    @Override // J0.InterfaceC0273a
    public final void e(M0 m10) {
        p011b0.e eVarZ = this.f4046w.f3945a.z();
        Object[] objArr = eVarZ.f13125r;
        int i10 = eVarZ.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            m10.e(((I) objArr[i11]).f3915X.f3958p);
        }
    }

    public final List h0() {
        M m10 = this.f4046w;
        m10.f3945a.e0();
        boolean z10 = this.R;
        p011b0.e eVar = this.Q;
        if (!z10) {
            return eVar.f();
        }
        I i10 = m10.f3945a;
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            if (eVar.f13127t <= i12) {
                eVar.b(i13.f3915X.f3958p);
            } else {
                Z z11 = i13.f3915X.f3958p;
                Object[] objArr2 = eVar.f13125r;
                Object obj = objArr2[i12];
                objArr2[i12] = z11;
            }
        }
        eVar.m(((p011b0.b) i10.o()).f13119r.f13127t, eVar.f13127t);
        this.R = false;
        return eVar.f();
    }

    @Override // H0.U, H0.H
    public final Object i() {
        return this.f4030J;
    }

    public final void i0() {
        boolean z10 = this.f4031K;
        this.f4031K = true;
        I i10 = this.f4046w.f3945a;
        C0280d0 c0280d0 = i10.f3914W;
        if (!z10) {
            ((C0298v) c0280d0.f4064c).R0();
            if (i10.r()) {
                I.W(i10, true, 6);
            } else if (i10.f3915X.f3949e) {
                I.U(i10, true, 6);
            }
        }
        j0 j0Var = ((C0298v) c0280d0.f4064c).f4126D;
        for (j0 j0Var2 = (j0) c0280d0.f4065d; !p251z9.j.a(j0Var2, j0Var) && j0Var2 != null; j0Var2 = j0Var2.f4126D) {
            if (j0Var2.f4139V) {
                j0Var2.L0();
            }
        }
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            if (i13.v() != Integer.MAX_VALUE) {
                i13.f3915X.f3958p.i0();
                I.X(i13);
            }
        }
    }

    public final void j0() {
        if (this.f4031K) {
            this.f4031K = false;
            M m10 = this.f4046w;
            C0280d0 c0280d0 = m10.f3945a.f3914W;
            j0 j0Var = ((C0298v) c0280d0.f4064c).f4126D;
            for (j0 j0Var2 = (j0) c0280d0.f4065d; !p251z9.j.a(j0Var2, j0Var) && j0Var2 != null; j0Var2 = j0Var2.f4126D) {
                l0.q qVarG0 = j0Var2.G0(k0.g(1048576));
                if (qVarG0 != null && (qVarG0.f19339r.f19342u & 1048576) != 0) {
                    boolean zG = k0.g(1048576);
                    l0.q qVarE0 = j0Var2.E0();
                    if (zG || (qVarE0 = qVarE0.f19343v) != null) {
                        for (l0.q qVarG1 = j0Var2.G0(zG); qVarG1 != null && (qVarG1.f19342u & 1048576) != 0; qVarG1 = qVarG1.f19344w) {
                            if ((qVarG1.f19341t & 1048576) != 0) {
                                l0.q qVarF = qVarG1;
                                p011b0.e eVar = null;
                                while (qVarF != null) {
                                    if ((qVarF.f19341t & 1048576) != 0 && (qVarF instanceof AbstractC0291n)) {
                                        int i10 = 0;
                                        for (l0.q qVar = ((AbstractC0291n) qVarF).f4151G; qVar != null; qVar = qVar.f19344w) {
                                            if ((qVar.f19341t & 1048576) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    qVarF = qVar;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new p011b0.e(new l0.q[16]);
                                                    }
                                                    if (qVarF != null) {
                                                        eVar.b(qVarF);
                                                        qVarF = null;
                                                    }
                                                    eVar.b(qVar);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    qVarF = AbstractC0283f.f(eVar);
                                }
                            }
                            if (qVarG1 == qVarE0) {
                                break;
                            }
                        }
                    }
                }
                if (j0Var2.f4140W != null) {
                    if (j0Var2.f4141X != null) {
                        j0Var2.f4141X = null;
                    }
                    j0Var2.a1(null, false);
                    j0Var2.f4125C.V(false);
                }
            }
            p011b0.e eVarZ = m10.f3945a.z();
            Object[] objArr = eVarZ.f13125r;
            int i11 = eVarZ.f13127t;
            for (int i12 = 0; i12 < i11; i12++) {
                ((I) objArr[i12]).f3915X.f3958p.j0();
            }
        }
    }

    public final void k0() {
        M m10 = this.f4046w;
        if (m10.f3954l > 0) {
            p011b0.e eVarZ = m10.f3945a.z();
            Object[] objArr = eVarZ.f13125r;
            int i10 = eVarZ.f13127t;
            for (int i11 = 0; i11 < i10; i11++) {
                I i12 = (I) objArr[i11];
                M m11 = i12.f3915X;
                boolean z10 = m11.j;
                Z z11 = m11.f3958p;
                if ((z10 || m11.f3953k) && !z11.f4034N) {
                    i12.V(false);
                }
                z11.k0();
            }
        }
    }

    @Override // J0.InterfaceC0276b0
    public final void l(boolean z10) {
        M m10 = this.f4046w;
        if (z10 != m10.a().f3968w) {
            m10.a().f3968w = z10;
            this.f4045d0 = true;
        }
    }

    public final void l0() {
        G g;
        M m10 = this.f4046w;
        I.W(m10.f3945a, false, 7);
        I i10 = m10.f3945a;
        I iU = i10.u();
        if (iU == null || i10.T != G.f3891t) {
            return;
        }
        int iOrdinal = iU.f3915X.f3948d.ordinal();
        if (iOrdinal != 0) {
            g = iOrdinal != 2 ? iU.T : G.f3890s;
        } else {
            g = G.f3889r;
        }
        i10.T = g;
    }

    public final void m0() {
        this.f4039X = true;
        M m10 = this.f4046w;
        I iU = m10.f3945a.u();
        float f3 = o().f4137O;
        I i10 = m10.f3945a;
        C0280d0 c0280d0 = i10.f3914W;
        C0298v c0298v = (C0298v) c0280d0.f4064c;
        for (j0 j0Var = (j0) c0280d0.f4065d; j0Var != c0298v; j0Var = j0Var.f4126D) {
            p251z9.j.c(j0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f3 += ((B) j0Var).f4137O;
        }
        if (f3 != this.f4038W) {
            this.f4038W = f3;
            if (iU != null) {
                iU.N();
            }
            if (iU != null) {
                iU.C();
            }
        }
        if (this.f4031K) {
            ((C0298v) i10.f3914W.f4064c).R0();
        } else {
            if (iU != null) {
                iU.C();
            }
            i0();
            if (this.f4047x && iU != null) {
                iU.V(false);
            }
        }
        if (iU != null) {
            M m11 = iU.f3915X;
            if (!this.f4047x && m11.f3948d == E.f3884t) {
                if (this.f4049z != Integer.MAX_VALUE) {
                    G0.a.b("Place was called on a node which was placed already");
                }
                int i11 = m11.f3952i;
                this.f4049z = i11;
                m11.f3952i = i11 + 1;
            }
        } else {
            this.f4049z = 0;
        }
        r();
    }

    public final void n0(long j, float f3, p241y9.c cVar, p205v0.b bVar) {
        M m10 = this.f4046w;
        I i10 = m10.f3945a;
        I i11 = m10.f3945a;
        if (i10.f3924g0) {
            G0.a.a("place is called on a deactivated node");
        }
        m10.f3948d = E.f3884t;
        boolean z10 = !this.f4022B;
        this.f4025E = j;
        this.f4028H = f3;
        this.f4026F = cVar;
        this.f4027G = bVar;
        this.f4022B = true;
        this.f4039X = false;
        r0 r0VarA = L.a(i11);
        r0VarA.getRectManager().f(i11, j, z10);
        if (this.f4034N || !this.f4031K) {
            this.f4036P.g = false;
            m10.d(false);
            this.f4040Y = cVar;
            this.f4042a0 = j;
            this.f4043b0 = f3;
            this.f4041Z = bVar;
            t0 snapshotObserver = r0VarA.getSnapshotObserver();
            snapshotObserver.a(i11, snapshotObserver.f4175f, this.f4044c0);
        } else {
            j0 j0VarA = m10.a();
            j0VarA.U0(p063g1.j.c(j, j0VarA.f3172v), f3, cVar, bVar);
            m0();
        }
        m10.f3948d = E.f3886v;
    }

    @Override // J0.InterfaceC0273a
    public final C0298v o() {
        return (C0298v) this.f4046w.f3945a.f3914W.f4064c;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    public final void o0(long j, float f3, p241y9.c cVar, p205v0.b bVar) {
        boolean z10;
        H0.T placementScope;
        boolean z11;
        this.f4032L = true;
        boolean zA = p063g1.j.a(j, this.f4025E);
        M m10 = this.f4046w;
        if (!zA || this.f4045d0) {
            if (m10.f3953k || m10.j || this.f4045d0) {
                this.f4034N = true;
                this.f4045d0 = false;
            }
            k0();
        }
        V v10 = m10.f3959q;
        I i10 = m10.f3945a;
        if (v10 != null) {
            M m11 = v10.f4004w;
            if (AbstractC0283f.s(m11.f3945a)) {
                z11 = true;
            } else {
                if (v10.f3996I == S.f3980t && !m11.f3946b) {
                    m11.f3947c = true;
                }
                z11 = m11.f3947c;
            }
            if (z11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            j0 j0Var = m10.a().f4127E;
            if (j0Var == null || (placementScope = j0Var.f3971z) == null) {
                placementScope = L.a(i10).getPlacementScope();
            }
            V v11 = m10.f3959q;
            p251z9.j.b(v11);
            I iU = i10.u();
            if (iU != null) {
                iU.f3915X.f3951h = 0;
            }
            v11.f4007z = Integer.MAX_VALUE;
            placementScope.d(v11, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
        }
        V v12 = m10.f3959q;
        if ((v12 == null || v12.f3990C) ? false : true) {
            G0.a.b("Error: Placement happened before lookahead.");
        }
        n0(j, f3, cVar, bVar);
    }

    public final boolean p0(long j) {
        M m10 = this.f4046w;
        I i10 = m10.f3945a;
        I i11 = m10.f3945a;
        if (i10.f3924g0) {
            G0.a.a("measure is called on a deactivated node");
        }
        r0 r0VarA = L.a(i11);
        I iU = i11.u();
        boolean z10 = true;
        i11.f3913V = i11.f3913V || (iU != null && iU.f3913V);
        if (!i11.r() && p063g1.a.b(this.f3171u, j)) {
            ((AndroidComposeView) r0VarA).m(i11, false);
            i11.Y();
            return false;
        }
        this.f4036P.f3939f = false;
        p011b0.e eVarZ = i11.z();
        Object[] objArr = eVarZ.f13125r;
        int i12 = eVarZ.f13127t;
        for (int i13 = 0; i13 < i12; i13++) {
            ((I) objArr[i13]).f3915X.f3958p.f4036P.f3936c = false;
        }
        this.f4021A = true;
        long j10 = m10.a().f3170t;
        a0(j);
        E e10 = m10.f3948d;
        E e11 = E.f3886v;
        if (e10 != e11) {
            G0.a.b("layout state is not idle before measure starts");
        }
        this.T = j;
        E e12 = E.f3882r;
        m10.f3948d = e12;
        this.f4033M = false;
        t0 snapshotObserver = L.a(i11).getSnapshotObserver();
        snapshotObserver.a(i11, snapshotObserver.f4172c, this.U);
        if (m10.f3948d == e12) {
            this.f4034N = true;
            this.f4035O = true;
            m10.f3948d = e11;
        }
        if (p063g1.l.a(m10.a().f3170t, j10) && m10.a().f3168r == this.f3168r && m10.a().f3169s == this.f3169s) {
            z10 = false;
        }
        Z((((long) m10.a().f3169s) & 4294967295L) | (((long) m10.a().f3168r) << 32));
        return z10;
    }

    @Override // J0.InterfaceC0273a
    public final InterfaceC0273a q() {
        M m10;
        I iU = this.f4046w.f3945a.u();
        if (iU == null || (m10 = iU.f3915X) == null) {
            return null;
        }
        return m10.f3958p;
    }

    @Override // J0.InterfaceC0273a
    public final void r() {
        this.S = true;
        J j = this.f4036P;
        j.h();
        boolean z10 = this.f4034N;
        M m10 = this.f4046w;
        if (z10) {
            p011b0.e eVarZ = m10.f3945a.z();
            Object[] objArr = eVarZ.f13125r;
            int i10 = eVarZ.f13127t;
            for (int i11 = 0; i11 < i10; i11++) {
                I i12 = (I) objArr[i11];
                if (i12.r() && i12.f3915X.f3958p.f4023C == G.f3889r && I.P(i12)) {
                    I.W(m10.f3945a, false, 7);
                }
            }
        }
        if (this.f4035O || (!this.f4024D && !o().f3970y && this.f4034N)) {
            this.f4034N = false;
            E e10 = m10.f3948d;
            m10.f3948d = E.f3884t;
            m10.e(false);
            I i13 = m10.f3945a;
            t0 snapshotObserver = L.a(i13).getSnapshotObserver();
            snapshotObserver.a(i13, snapshotObserver.f4174e, this.f4037V);
            m10.f3948d = e10;
            if (o().f3970y && m10.j) {
                requestLayout();
            }
            this.f4035O = false;
        }
        if (j.f3937d) {
            j.f3938e = true;
        }
        if (j.f3935b && j.e()) {
            j.g();
        }
        this.S = false;
    }

    @Override // J0.InterfaceC0273a
    public final void requestLayout() {
        this.f4046w.f3945a.V(false);
    }

    @Override // J0.InterfaceC0273a
    public final boolean s() {
        return this.f4031K;
    }
}
