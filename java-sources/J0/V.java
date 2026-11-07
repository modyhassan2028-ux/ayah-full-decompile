package J0;

import A.M0;
import D0.C0086d;
import H0.C0214m;

/* JADX INFO: loaded from: classes.dex */
public final class V extends H0.U implements H0.H, InterfaceC0273a, InterfaceC0276b0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3989B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f3990C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f3991D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public p063g1.a f3992E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p241y9.c f3994G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p205v0.b f3995H;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f4000M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Object f4002O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f4003P;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final M f4004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4006y = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4007z = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public G f3988A = G.f3891t;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f3993F = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public S f3996I = S.f3980t;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final J f3997J = new J(this, 1);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final p011b0.e f3998K = new p011b0.e(new V[16]);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f3999L = true;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f4001N = true;

    public V(M m10) {
        this.f4004w = m10;
        this.f4002O = m10.f3958p.f4030J;
    }

    @Override // H0.H
    public final int H(int i10) {
        k0();
        Q qC0 = this.f4004w.a().C0();
        p251z9.j.b(qC0);
        return qC0.H(i10);
    }

    @Override // J0.InterfaceC0273a
    public final void L() {
        I.U(this.f4004w.f3945a, false, 7);
    }

    @Override // H0.H
    public final int N(int i10) {
        k0();
        Q qC0 = this.f4004w.a().C0();
        p251z9.j.b(qC0);
        return qC0.N(i10);
    }

    @Override // H0.H
    public final int P(int i10) {
        k0();
        Q qC0 = this.f4004w.a().C0();
        p251z9.j.b(qC0);
        return qC0.P(i10);
    }

    @Override // H0.U
    public final int R(C0214m c0214m) {
        M m10 = this.f4004w;
        I iU = m10.f3945a.u();
        E e10 = iU != null ? iU.f3915X.f3948d : null;
        E e11 = E.f3883s;
        J j = this.f3997J;
        if (e10 == e11) {
            j.f3936c = true;
        } else {
            I iU2 = m10.f3945a.u();
            if ((iU2 != null ? iU2.f3915X.f3948d : null) == E.f3885u) {
                j.f3937d = true;
            }
        }
        this.f3989B = true;
        Q qC0 = m10.a().C0();
        p251z9.j.b(qC0);
        int iR = qC0.R(c0214m);
        this.f3989B = false;
        return iR;
    }

    @Override // H0.U
    public final void V(long j, float f3, p205v0.b bVar) {
        m0(j, null, bVar);
    }

    @Override // H0.U
    public final void Y(long j, float f3, p241y9.c cVar) {
        m0(j, cVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // H0.H
    public final H0.U a(long j) {
        G g;
        M m10 = this.f4004w;
        I iU = m10.f3945a.u();
        if ((iU != null ? iU.f3915X.f3948d : null) == E.f3883s) {
            m10.f3946b = false;
        } else {
            I iU2 = m10.f3945a.u();
            if ((iU2 != null ? iU2.f3915X.f3948d : null) == E.f3885u) {
                m10.f3946b = false;
            }
        }
        I i10 = m10.f3945a;
        I iU3 = i10.u();
        if (iU3 != null) {
            M m11 = iU3.f3915X;
            if (this.f3988A != G.f3891t && !i10.f3913V) {
                G0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = m11.f3948d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                g = G.f3889r;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + m11.f3948d);
                }
                g = G.f3890s;
            }
            this.f3988A = g;
        } else {
            this.f3988A = G.f3891t;
        }
        I i11 = m10.f3945a;
        if (i11.T == G.f3891t) {
            i11.f();
        }
        n0(j);
        return this;
    }

    @Override // J0.InterfaceC0273a
    public final J c() {
        return this.f3997J;
    }

    @Override // H0.H
    public final int d(int i10) {
        k0();
        Q qC0 = this.f4004w.a().C0();
        p251z9.j.b(qC0);
        return qC0.d(i10);
    }

    @Override // J0.InterfaceC0273a
    public final void e(M0 m10) {
        p011b0.e eVarZ = this.f4004w.f3945a.z();
        Object[] objArr = eVarZ.f13125r;
        int i10 = eVarZ.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            V v10 = ((I) objArr[i11]).f3915X.f3959q;
            p251z9.j.b(v10);
            m10.e(v10);
        }
    }

    public final void h0(boolean z10) {
        M m10 = this.f4004w;
        if (z10 && m10.f3947c) {
            return;
        }
        if (z10 || m10.f3947c) {
            this.f3996I = S.f3980t;
            p011b0.e eVarZ = m10.f3945a.z();
            Object[] objArr = eVarZ.f13125r;
            int i10 = eVarZ.f13127t;
            for (int i11 = 0; i11 < i10; i11++) {
                V v10 = ((I) objArr[i11]).f3915X.f3959q;
                p251z9.j.b(v10);
                v10.h0(true);
            }
        }
    }

    @Override // H0.U, H0.H
    public final Object i() {
        return this.f4002O;
    }

    public final void i0() {
        S s10 = this.f3996I;
        M m10 = this.f4004w;
        boolean z10 = m10.f3947c;
        I i10 = m10.f3945a;
        S s11 = S.f3978r;
        if (z10) {
            this.f3996I = S.f3979s;
        } else {
            this.f3996I = s11;
        }
        if (s10 != s11 && m10.f3949e) {
            I.U(i10, true, 6);
        }
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            V v10 = i13.f3915X.f3959q;
            if (v10 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (v10.f4007z != Integer.MAX_VALUE) {
                v10.i0();
                I.X(i13);
            }
        }
    }

    public final void j0() {
        M m10 = this.f4004w;
        if (m10.f3957o > 0) {
            p011b0.e eVarZ = m10.f3945a.z();
            Object[] objArr = eVarZ.f13125r;
            int i10 = eVarZ.f13127t;
            for (int i11 = 0; i11 < i10; i11++) {
                I i12 = (I) objArr[i11];
                M m11 = i12.f3915X;
                if ((m11.f3955m || m11.f3956n) && !m11.f3950f) {
                    i12.T(false);
                }
                V v10 = m11.f3959q;
                if (v10 != null) {
                    v10.j0();
                }
            }
        }
    }

    public final void k0() {
        G g;
        M m10 = this.f4004w;
        I.U(m10.f3945a, false, 7);
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

    @Override // J0.InterfaceC0276b0
    public final void l(boolean z10) {
        Q qC0;
        M m10 = this.f4004w;
        Q qC1 = m10.a().C0();
        if (Boolean.valueOf(z10).equals(qC1 != null ? Boolean.valueOf(qC1.f3968w) : null) || (qC0 = m10.a().C0()) == null) {
            return;
        }
        qC0.f3968w = z10;
    }

    public final void l0() {
        E e10;
        this.f4003P = true;
        M m10 = this.f4004w;
        I iU = m10.f3945a.u();
        S s10 = this.f3996I;
        if ((s10 != S.f3978r && !m10.f3947c) || (s10 != S.f3979s && m10.f3947c)) {
            i0();
            if (this.f4005x && iU != null) {
                iU.T(false);
            }
        }
        if (iU != null) {
            M m11 = iU.f3915X;
            if (!this.f4005x && ((e10 = m11.f3948d) == E.f3884t || e10 == E.f3885u)) {
                if (this.f4007z != Integer.MAX_VALUE) {
                    G0.a.b("Place was called on a node which was placed already");
                }
                int i10 = m11.f3951h;
                this.f4007z = i10;
                m11.f3951h = i10 + 1;
            }
        } else {
            this.f4007z = 0;
        }
        r();
    }

    public final void m0(long j, p241y9.c cVar, p205v0.b bVar) {
        M m10 = this.f4004w;
        I i10 = m10.f3945a;
        I i11 = m10.f3945a;
        I iU = i10.u();
        E e10 = iU != null ? iU.f3915X.f3948d : null;
        E e11 = E.f3885u;
        if (e10 == e11) {
            m10.f3947c = false;
        }
        if (i11.f3924g0) {
            G0.a.a("place is called on a deactivated node");
        }
        m10.f3948d = e11;
        this.f3990C = true;
        this.f4003P = false;
        if (!p063g1.j.a(j, this.f3993F)) {
            if (m10.f3956n || m10.f3955m) {
                m10.f3950f = true;
            }
            j0();
        }
        r0 r0VarA = L.a(i11);
        if (m10.f3950f || !s()) {
            m10.f(false);
            this.f3997J.g = false;
            t0 snapshotObserver = r0VarA.getSnapshotObserver();
            U u8 = new U(this, r0VarA, j);
            snapshotObserver.getClass();
            if (i11.f3932y != null) {
                snapshotObserver.a(i11, snapshotObserver.g, u8);
            } else {
                snapshotObserver.a(i11, snapshotObserver.f4175f, u8);
            }
        } else {
            Q qC0 = m10.a().C0();
            p251z9.j.b(qC0);
            qC0.u0(p063g1.j.c(j, qC0.f3172v));
            l0();
        }
        this.f3993F = j;
        this.f3994G = cVar;
        this.f3995H = bVar;
        m10.f3948d = E.f3886v;
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: J0.V
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: J0.V
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final boolean n0(long r19) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.V.n0(long):boolean");
    }

    @Override // J0.InterfaceC0273a
    public final C0298v o() {
        return (C0298v) this.f4004w.f3945a.f3914W.f4064c;
    }

    @Override // J0.InterfaceC0273a
    public final InterfaceC0273a q() {
        M m10;
        I iU = this.f4004w.f3945a.u();
        if (iU == null || (m10 = iU.f3915X) == null) {
            return null;
        }
        return m10.f3959q;
    }

    @Override // J0.InterfaceC0273a
    public final void r() {
        this.f4000M = true;
        J j = this.f3997J;
        j.h();
        M m10 = this.f4004w;
        boolean z10 = m10.f3950f;
        I i10 = m10.f3945a;
        if (z10) {
            p011b0.e eVarZ = i10.z();
            Object[] objArr = eVarZ.f13125r;
            int i11 = eVarZ.f13127t;
            for (int i12 = 0; i12 < i11; i12++) {
                I i13 = (I) objArr[i12];
                M m11 = i13.f3915X;
                if (m11.f3949e && i13.s() == G.f3889r) {
                    V v10 = m11.f3959q;
                    p251z9.j.b(v10);
                    V v11 = m11.f3959q;
                    p063g1.a aVar = v11 != null ? v11.f3992E : null;
                    p251z9.j.b(aVar);
                    if (v10.n0(aVar.f16246a)) {
                        I.U(i10, false, 7);
                    }
                }
            }
        }
        C0297u c0297u = o().f4179e0;
        p251z9.j.b(c0297u);
        if (m10.g || (!this.f3989B && !c0297u.f3970y && m10.f3950f)) {
            m10.f3950f = false;
            E e10 = m10.f3948d;
            m10.f3948d = E.f3885u;
            r0 r0VarA = L.a(i10);
            m10.g(false);
            t0 snapshotObserver = r0VarA.getSnapshotObserver();
            C0086d c0086d = new C0086d(7, this, c0297u);
            snapshotObserver.getClass();
            if (i10.f3932y != null) {
                snapshotObserver.a(i10, snapshotObserver.f4176h, c0086d);
            } else {
                snapshotObserver.a(i10, snapshotObserver.f4174e, c0086d);
            }
            m10.f3948d = e10;
            if (m10.f3955m && c0297u.f3970y) {
                requestLayout();
            }
            m10.g = false;
        }
        if (j.f3937d) {
            j.f3938e = true;
        }
        if (j.f3935b && j.e()) {
            j.g();
        }
        this.f4000M = false;
    }

    @Override // J0.InterfaceC0273a
    public final void requestLayout() {
        this.f4004w.f3945a.T(false);
    }

    @Override // J0.InterfaceC0273a
    public final boolean s() {
        return this.f3996I != S.f3980t;
    }
}
