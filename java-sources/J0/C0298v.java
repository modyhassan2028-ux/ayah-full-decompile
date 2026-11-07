package J0;

import H0.C0214m;

/* JADX INFO: renamed from: J0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0298v extends j0 {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final N9.b0 f4177f0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final z0 f4178d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C0297u f4179e0;

    static {
        N9.b0 b0VarG = p180s0.F.g();
        b0VarG.e(p180s0.q.f21841d);
        b0VarG.k(1.0f);
        b0VarG.l(1);
        f4177f0 = b0VarG;
    }

    public C0298v(I i10) {
        super(i10);
        z0 z0Var = new z0();
        z0Var.f19342u = 0;
        this.f4178d0 = z0Var;
        z0Var.f19346y = this;
        this.f4179e0 = i10.f3932y != null ? new C0297u(this) : null;
    }

    @Override // J0.j0
    public final Q C0() {
        return this.f4179e0;
    }

    @Override // J0.j0
    public final l0.q E0() {
        return this.f4178d0;
    }

    @Override // H0.H
    public final int H(int i10) {
        M.k kVarT = this.f4125C.t();
        H0.I iT = kVarT.t();
        I i11 = (I) kVarT.f5618s;
        return iT.b((j0) i11.f3914W.f4065d, i11.n(), i10);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // J0.j0
    public final void K0(C0279d c0279d, long j, C0296t c0296t, int i10, boolean z10) {
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        Object[] objArr;
        int i12;
        I i13;
        I i14;
        long jB;
        long j10 = j;
        C0296t c0296t2 = c0296t;
        int i15 = c0279d.f4061r;
        I i16 = this.f4125C;
        switch (i15) {
            case 1:
                z11 = true;
                break;
            default:
                R0.j jVarW = i16.w();
                z11 = !(jVarW != null && jVarW.f7111u);
                break;
        }
        if (z11) {
            if (c1(j10)) {
                i11 = i10;
                z12 = z10;
                z13 = true;
            } else {
                i11 = i10;
                if (i11 == 1 && (Float.floatToRawIntBits(v0(j10, D0())) & Integer.MAX_VALUE) < 2139095040) {
                    z13 = true;
                    z12 = false;
                }
            }
            if (z13) {
                int i17 = c0296t2.f4169t;
                p011b0.e eVarY = i16.y();
                objArr = eVarY.f13125r;
                i12 = eVarY.f13127t - 1;
                while (i12 >= 0) {
                    i13 = (I) objArr[i12];
                    if (i13.I()) {
                        switch (c0279d.f4061r) {
                            case 1:
                                i13.A(j10, c0296t2, i11, z12);
                                i14 = i13;
                                break;
                            default:
                                C0280d0 c0280d0 = i13.f3914W;
                                ((j0) c0280d0.f4065d).J0(j0.f4124c0, ((j0) c0280d0.f4065d).A0(j10), c0296t2, 1, z12);
                                c0296t2 = c0296t;
                                i14 = i13;
                                break;
                        }
                        jB = c0296t2.b();
                        if (AbstractC0283f.l(jB) < 0.0f && AbstractC0283f.q(jB) && !AbstractC0283f.p(jB)) {
                            j0 j0Var = (j0) i14.f3914W.f4065d;
                            j0Var.getClass();
                            l0.q qVarG0 = j0Var.G0(k0.g(16));
                            if (qVarG0 != null && qVarG0.f19338E) {
                                if (!qVarG0.f19339r.f19338E) {
                                    G0.a.b("visitLocalDescendants called on an unattached node");
                                }
                                l0.q qVar = qVarG0.f19339r;
                                if ((qVar.f19342u & 16) != 0) {
                                    while (true) {
                                        if (qVar != null) {
                                            if ((qVar.f19341t & 16) != 0) {
                                                ?? F10 = qVar;
                                                ?? eVar = 0;
                                                while (F10 != 0) {
                                                    if (F10 instanceof w0) {
                                                        if (((w0) F10).J()) {
                                                            c0296t2.f4169t = c0296t2.f4167r.f22651b - 1;
                                                            break;
                                                        }
                                                    } else if ((F10.f19341t & 16) != 0 && (F10 instanceof AbstractC0291n)) {
                                                        l0.q qVar2 = ((AbstractC0291n) F10).f4151G;
                                                        int i18 = 0;
                                                        while (qVar2 != null) {
                                                            if ((qVar2.f19341t & 16) != 0) {
                                                                i18++;
                                                                if (i18 == 1) {
                                                                    F10 = F10;
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
                                                                F10 = F10;
                                                                eVar = eVar;
                                                            }
                                                            qVar2 = qVar2.f19344w;
                                                            F10 = F10;
                                                            eVar = eVar;
                                                        }
                                                        if (i18 == 1) {
                                                            F10 = F10;
                                                            eVar = eVar;
                                                        } else {
                                                            F10 = F10;
                                                            eVar = eVar;
                                                        }
                                                    }
                                                    F10 = AbstractC0283f.f(eVar);
                                                }
                                            }
                                            qVar = qVar.f19344w;
                                        }
                                    }
                                }
                            }
                            c0296t2.f4169t = i17;
                        }
                    }
                    i12--;
                    j10 = j;
                    i11 = i10;
                }
                c0296t2.f4169t = i17;
            }
        }
        i11 = i10;
        z12 = z10;
        z13 = false;
        if (z13) {
            int i19 = c0296t2.f4169t;
            p011b0.e eVarY2 = i16.y();
            objArr = eVarY2.f13125r;
            i12 = eVarY2.f13127t - 1;
            while (i12 >= 0) {
                i13 = (I) objArr[i12];
                if (i13.I()) {
                    switch (c0279d.f4061r) {
                        case 1:
                            i13.A(j10, c0296t2, i11, z12);
                            i14 = i13;
                            break;
                        default:
                            C0280d0 c0280d1 = i13.f3914W;
                            ((j0) c0280d1.f4065d).J0(j0.f4124c0, ((j0) c0280d1.f4065d).A0(j10), c0296t2, 1, z12);
                            c0296t2 = c0296t;
                            i14 = i13;
                            break;
                    }
                    jB = c0296t2.b();
                    if (AbstractC0283f.l(jB) < 0.0f) {
                        continue;
                    }
                }
                i12--;
                j10 = j;
                i11 = i10;
            }
            c0296t2.f4169t = i19;
        }
    }

    @Override // H0.H
    public final int N(int i10) {
        M.k kVarT = this.f4125C.t();
        H0.I iT = kVarT.t();
        I i11 = (I) kVarT.f5618s;
        return iT.e((j0) i11.f3914W.f4065d, i11.n(), i10);
    }

    @Override // H0.H
    public final int P(int i10) {
        M.k kVarT = this.f4125C.t();
        H0.I iT = kVarT.t();
        I i11 = (I) kVarT.f5618s;
        return iT.c((j0) i11.f3914W.f4065d, i11.n(), i10);
    }

    @Override // J0.j0
    public final void T0(p180s0.o oVar, p205v0.b bVar) {
        I i10 = this.f4125C;
        r0 r0VarA = L.a(i10);
        p011b0.e eVarY = i10.y();
        Object[] objArr = eVarY.f13125r;
        int i11 = eVarY.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            if (i13.I()) {
                i13.j(oVar, bVar);
            }
        }
        if (r0VarA.getShowLayoutBounds()) {
            long j = this.f3170t;
            oVar.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f4177f0);
        }
    }

    @Override // J0.j0, H0.U
    public final void V(long j, float f3, p205v0.b bVar) {
        U0(j, f3, null, bVar);
        if (this.f3969x) {
            return;
        }
        this.f4125C.f3915X.f3958p.m0();
    }

    @Override // H0.U
    public final void Y(long j, float f3, p241y9.c cVar) {
        U0(j, f3, cVar, null);
        if (this.f3969x) {
            return;
        }
        this.f4125C.f3915X.f3958p.m0();
    }

    @Override // H0.H
    public final H0.U a(long j) {
        a0(j);
        I i10 = this.f4125C;
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            ((I) objArr[i12]).f3915X.f3958p.f4023C = G.f3891t;
        }
        W0(i10.f3910N.a(this, i10.n(), j));
        Q0();
        return this;
    }

    @Override // H0.H
    public final int d(int i10) {
        M.k kVarT = this.f4125C.t();
        H0.I iT = kVarT.t();
        I i11 = (I) kVarT.f5618s;
        return iT.i((j0) i11.f3914W.f4065d, i11.n(), i10);
    }

    @Override // J0.P
    public final int h0(C0214m c0214m) {
        C0297u c0297u = this.f4179e0;
        if (c0297u != null) {
            return c0297u.h0(c0214m);
        }
        Z z10 = this.f4125C.f3915X.f3958p;
        J j = z10.f4036P;
        if (!z10.f4024D) {
            if (z10.f4046w.f3948d == E.f3882r) {
                j.f3939f = true;
                if (j.f3935b) {
                    z10.f4034N = true;
                    z10.f4035O = true;
                }
            } else {
                j.g = true;
            }
        }
        z10.o().f3970y = true;
        z10.r();
        z10.o().f3970y = false;
        Integer num = (Integer) j.f3941i.get(c0214m);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // J0.j0
    public final void y0() {
        if (this.f4179e0 == null) {
            this.f4179e0 = new C0297u(this);
        }
    }
}
