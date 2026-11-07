package J0;

import K0.C0371u;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f4011a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4014d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p063g1.a f4018i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M.k f4012b = new M.k(22);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M.k f4015e = new M.k(25);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p011b0.e f4016f = new p011b0.e(new I[16]);
    public final long g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p011b0.e f4017h = new p011b0.e(new W[16]);

    public X(I i10) {
        this.f4011a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean b(I i10, p063g1.a aVar) {
        boolean zN0;
        I i11 = i10.f3932y;
        M m10 = i10.f3915X;
        if (i11 == null) {
            return false;
        }
        if (aVar == null) {
            V v10 = m10.f3959q;
            p063g1.a aVar2 = v10 != null ? v10.f3992E : null;
            if (aVar2 == null || i11 == null) {
                zN0 = false;
            } else {
                p251z9.j.b(v10);
                zN0 = v10.n0(aVar2.f16246a);
            }
        } else if (i11 != null) {
            V v11 = m10.f3959q;
            p251z9.j.b(v11);
            zN0 = v11.n0(aVar.f16246a);
        } else {
            zN0 = false;
        }
        I iU = i10.u();
        if (zN0 && iU != null) {
            if (iU.f3932y == null) {
                I.W(iU, false, 3);
                return zN0;
            }
            if (i10.s() == G.f3889r) {
                I.U(iU, false, 3);
                return zN0;
            }
            if (i10.s() == G.f3890s) {
                iU.T(false);
            }
        }
        return zN0;
    }

    public static boolean c(I i10, p063g1.a aVar) {
        boolean zO = aVar != null ? i10.O(aVar) : I.P(i10);
        I iU = i10.u();
        if (zO && iU != null) {
            G g = i10.f3915X.f3958p.f4023C;
            if (g == G.f3889r) {
                I.W(iU, false, 3);
                return zO;
            }
            if (g == G.f3890s) {
                iU.V(false);
            }
        }
        return zO;
    }

    public static boolean h(I i10) {
        if (!i10.r()) {
            return false;
        }
        do {
            if (!i(i10)) {
                I iU = i10.u();
                if ((iU != null ? iU.f3915X.f3948d : null) != E.f3882r) {
                    return false;
                }
            }
            i10 = i10.u();
            if (i10 == null) {
                return false;
            }
        } while (!i10.I());
        return true;
    }

    public static boolean i(I i10) {
        Z z10 = i10.f3915X.f3958p;
        return z10.f4023C == G.f3889r || z10.f4036P.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10) {
        Object[] objArr;
        M.k kVar = this.f4015e;
        if (z10) {
            p011b0.e eVar = (p011b0.e) kVar.f5618s;
            eVar.g();
            I i10 = this.f4011a;
            eVar.b(i10);
            i10.f3923f0 = true;
        }
        p011b0.e eVar2 = (p011b0.e) kVar.f5618s;
        eVar2.o(p0.f4157b);
        int i11 = eVar2.f13127t;
        I[] iArr = (I[]) kVar.f5619t;
        if (iArr == null || iArr.length < i11) {
            objArr = iArr;
            objArr = new I[Math.max(16, i11)];
        }
        objArr = iArr;
        kVar.f5619t = null;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = eVar2.f13125r[i12];
        }
        eVar2.g();
        for (int i13 = i11 - 1; -1 < i13; i13--) {
            I i14 = objArr[i13];
            p251z9.j.b(i14);
            if (i14.f3923f0) {
                M.k.m(i14);
            }
        }
        kVar.f5619t = objArr;
    }

    public final void d() {
        p011b0.e eVar = this.f4017h;
        int i10 = eVar.f13127t;
        if (i10 != 0) {
            Object[] objArr = eVar.f13125r;
            for (int i11 = 0; i11 < i10; i11++) {
                W w9 = (W) objArr[i11];
                I i12 = w9.f4008a;
                boolean z10 = w9.f4010c;
                I i13 = w9.f4008a;
                if (i12.H()) {
                    if (w9.f4009b) {
                        I.U(i13, z10, 2);
                    } else {
                        I.W(i13, z10, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(I i10) {
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            if (p251z9.j.a(i13.J(), Boolean.TRUE) && !i13.f3924g0) {
                if (((D0) ((p248z6.c) this.f4012b.f5618s).f24847s).contains(i13)) {
                    i13.K();
                }
                e(i13);
            }
        }
    }

    public final void f(I i10, boolean z10) {
        if (!this.f4013c) {
            G0.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? i10.f3915X.f3949e : i10.r()) {
            G0.a.a("node not yet measured");
        }
        g(i10, z10);
    }

    public final void g(I i10, boolean z10) {
        V v10;
        J j;
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            if ((!z10 && i(i13)) || (z10 && (i13.s() == G.f3889r || ((v10 = i13.f3915X.f3959q) != null && (j = v10.f3997J) != null && j.e())))) {
                boolean zS = AbstractC0283f.s(i13);
                M m10 = i13.f3915X;
                if (zS && !z10) {
                    if (m10.f3949e && ((D0) ((p248z6.c) this.f4012b.f5618s).f24847s).contains(i13)) {
                        m(i13, true, false);
                    } else {
                        f(i13, true);
                    }
                }
                if (z10 ? m10.f3949e : i13.r()) {
                    m(i13, z10, false);
                }
                if (!(z10 ? m10.f3949e : i13.r())) {
                    g(i13, z10);
                }
            }
        }
        if (z10 ? i10.f3915X.f3949e : i10.r()) {
            m(i10, z10, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(C0371u c0371u) {
        boolean z10;
        l0.q qVar;
        ?? F10;
        I i10;
        M.k kVar = this.f4012b;
        I i11 = this.f4011a;
        if (!i11.H()) {
            G0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!i11.I()) {
            G0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f4013c) {
            G0.a.a("performMeasureAndLayout called during measure layout");
        }
        int i12 = 0;
        if (this.f4018i != null) {
            this.f4013c = true;
            this.f4014d = true;
            try {
                if (kVar.y()) {
                    z10 = false;
                    while (true) {
                        boolean zY = kVar.y();
                        p248z6.c cVar = (p248z6.c) kVar.f5618s;
                        if (!zY) {
                            break;
                        }
                        boolean zIsEmpty = ((D0) cVar.f24847s).isEmpty();
                        boolean z11 = !zIsEmpty;
                        if (zIsEmpty) {
                            p248z6.c cVar2 = (p248z6.c) kVar.f5619t;
                            I i13 = (I) ((D0) cVar2.f24847s).first();
                            cVar2.K(i13);
                            i10 = i13;
                        } else {
                            i10 = (I) ((D0) cVar.f24847s).first();
                            cVar.K(i10);
                        }
                        boolean zM = m(i10, z11, true);
                        if (i10 == i11 && zM) {
                            z10 = true;
                        }
                    }
                    if (c0371u != null) {
                        c0371u.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f4013c = false;
                this.f4014d = false;
            } catch (Throwable th) {
                this.f4013c = false;
                this.f4014d = false;
                throw th;
            }
        } else {
            z10 = false;
        }
        p011b0.e eVar = this.f4016f;
        Object[] objArr = eVar.f13125r;
        int i14 = eVar.f13127t;
        int i15 = 0;
        while (i15 < i14) {
            C0280d0 c0280d0 = ((I) objArr[i15]).f3914W;
            C0298v c0298v = (C0298v) c0280d0.f4064c;
            boolean zG = k0.g(128);
            if (zG) {
                qVar = c0298v.f4178d0;
            } else {
                qVar = c0298v.f4178d0.f19343v;
                if (qVar == null) {
                }
                i15++;
                i12 = 0;
            }
            p180s0.G g = j0.f4120Y;
            l0.q qVarG0 = c0298v.G0(zG);
            while (qVarG0 != null && (qVarG0.f19342u & 128) != 0) {
                if ((qVarG0.f19341t & 128) != 0) {
                    ?? r13 = qVarG0;
                    ?? eVar2 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof InterfaceC0301y) {
                            ((InterfaceC0301y) r13).G((C0298v) c0280d0.f4064c);
                        } else {
                            if ((r13.f19341t & 128) != 0 && (r13 instanceof AbstractC0291n)) {
                                l0.q qVar2 = ((AbstractC0291n) r13).f4151G;
                                while (qVar2 != null) {
                                    if ((qVar2.f19341t & 128) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            F10 = r13;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            F10 = qVar2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new p011b0.e(new l0.q[16]);
                                            }
                                            if (F10 != 0) {
                                                eVar2.b(F10);
                                                F10 = 0;
                                            }
                                            eVar2.b(qVar2);
                                        }
                                    } else {
                                        F10 = r13;
                                        eVar2 = eVar2;
                                    }
                                    qVar2 = qVar2.f19344w;
                                    F10 = F10;
                                    eVar2 = eVar2;
                                }
                                if (i12 == 1) {
                                    F10 = r13;
                                    eVar2 = eVar2;
                                }
                            }
                            i12 = 0;
                            r13 = F10;
                            eVar2 = eVar2;
                        }
                        F10 = r13;
                        eVar2 = eVar2;
                        F10 = AbstractC0283f.f(eVar2);
                        i12 = 0;
                        r13 = F10;
                        eVar2 = eVar2;
                    }
                }
                if (qVarG0 == qVar) {
                    break;
                }
                qVarG0 = qVarG0.f19344w;
                i12 = 0;
            }
            i15++;
            i12 = 0;
        }
        eVar.g();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [J0.I, java.lang.Object] */
    public final void k(I i10, long j) {
        l0.q qVar;
        ?? F10;
        if (i10.f3924g0) {
            return;
        }
        I i11 = this.f4011a;
        if (i10.equals(i11)) {
            G0.a.a("measureAndLayout called on root");
        }
        if (!i11.H()) {
            G0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!i11.I()) {
            G0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f4013c) {
            G0.a.a("performMeasureAndLayout called during measure layout");
        }
        int i12 = 0;
        if (this.f4018i != null) {
            this.f4013c = true;
            this.f4014d = false;
            try {
                M.k kVar = this.f4012b;
                ((p248z6.c) kVar.f5618s).K(i10);
                ((p248z6.c) kVar.f5619t).K(i10);
                if ((b(i10, new p063g1.a(j)) || i10.f3915X.f3950f) && p251z9.j.a(i10.J(), Boolean.TRUE)) {
                    i10.K();
                }
                e(i10);
                c(i10, new p063g1.a(j));
                if (i10.q() && i10.I()) {
                    i10.S();
                    ((p011b0.e) this.f4015e.f5618s).b(i10);
                    i10.f3923f0 = true;
                }
                d();
                this.f4013c = false;
                this.f4014d = false;
            } catch (Throwable th) {
                this.f4013c = false;
                this.f4014d = false;
                throw th;
            }
        }
        p011b0.e eVar = this.f4016f;
        Object[] objArr = eVar.f13125r;
        int i13 = eVar.f13127t;
        int i14 = 0;
        while (i14 < i13) {
            C0280d0 c0280d0 = ((I) objArr[i14]).f3914W;
            C0298v c0298v = (C0298v) c0280d0.f4064c;
            boolean zG = k0.g(128);
            if (zG) {
                qVar = c0298v.f4178d0;
            } else {
                qVar = c0298v.f4178d0.f19343v;
                if (qVar == null) {
                }
                i14++;
                i12 = 0;
            }
            p180s0.G g = j0.f4120Y;
            l0.q qVarG0 = c0298v.G0(zG);
            while (qVarG0 != null && (qVarG0.f19342u & 128) != 0) {
                if ((qVarG0.f19341t & 128) != 0) {
                    ?? r12 = qVarG0;
                    ?? eVar2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof InterfaceC0301y) {
                            ((InterfaceC0301y) r12).G((C0298v) c0280d0.f4064c);
                        } else {
                            if ((r12.f19341t & 128) != 0 && (r12 instanceof AbstractC0291n)) {
                                l0.q qVar2 = ((AbstractC0291n) r12).f4151G;
                                int i15 = i12;
                                while (qVar2 != null) {
                                    if ((qVar2.f19341t & 128) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            F10 = r12;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            F10 = qVar2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new p011b0.e(new l0.q[16]);
                                            }
                                            if (F10 != 0) {
                                                eVar2.b(F10);
                                                F10 = 0;
                                            }
                                            eVar2.b(qVar2);
                                        }
                                    } else {
                                        F10 = r12;
                                        eVar2 = eVar2;
                                    }
                                    qVar2 = qVar2.f19344w;
                                    F10 = F10;
                                    eVar2 = eVar2;
                                }
                                if (i15 == 1) {
                                    F10 = r12;
                                    eVar2 = eVar2;
                                }
                            }
                            i12 = 0;
                            r12 = F10;
                            eVar2 = eVar2;
                        }
                        F10 = r12;
                        eVar2 = eVar2;
                        F10 = AbstractC0283f.f(eVar2);
                        i12 = 0;
                        r12 = F10;
                        eVar2 = eVar2;
                    }
                }
                if (qVarG0 == qVar) {
                    break;
                }
                qVarG0 = qVarG0.f19344w;
                i12 = 0;
            }
            i14++;
            i12 = 0;
        }
        eVar.g();
    }

    public final void l() {
        M.k kVar = this.f4012b;
        if (kVar.y()) {
            I i10 = this.f4011a;
            if (!i10.H()) {
                G0.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!i10.I()) {
                G0.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f4013c) {
                G0.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f4018i != null) {
                this.f4013c = true;
                this.f4014d = false;
                try {
                    if (!((D0) ((p248z6.c) kVar.f5618s).f24847s).isEmpty()) {
                        if (i10.f3932y != null) {
                            o(i10, true);
                        } else {
                            n(i10);
                        }
                    }
                    o(i10, false);
                } finally {
                    this.f4013c = false;
                    this.f4014d = false;
                }
            }
        }
    }

    public final boolean m(I i10, boolean z10, boolean z11) {
        p063g1.a aVar;
        boolean zB;
        H0.T placementScope;
        C0298v c0298v;
        I iU;
        V v10;
        J j;
        V v11;
        J j10;
        boolean z12 = i10.f3924g0;
        M m10 = i10.f3915X;
        if (z12 || (!i10.I() && !m10.f3958p.f4032L && !h(i10) && !p251z9.j.a(i10.J(), Boolean.TRUE) && ((!m10.f3949e || (i10.s() != G.f3889r && ((v11 = m10.f3959q) == null || (j10 = v11.f3997J) == null || !j10.e()))) && !m10.f3958p.f4036P.e() && ((v10 = m10.f3959q) == null || (j = v10.f3997J) == null || !j.e())))) {
            return false;
        }
        I i11 = this.f4011a;
        if (i10 == i11) {
            aVar = this.f4018i;
            p251z9.j.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            zB = m10.f3949e ? b(i10, aVar) : false;
            if (z11 && ((zB || m10.f3950f) && p251z9.j.a(i10.J(), Boolean.TRUE))) {
                i10.K();
            }
        } else {
            boolean zC = i10.r() ? c(i10, aVar) : false;
            if (z11 && i10.q() && (i10 == i11 || ((iU = i10.u()) != null && iU.I() && m10.f3958p.f4032L))) {
                if (i10 == i11) {
                    if (i10.T == G.f3891t) {
                        i10.g();
                    }
                    I iU2 = i10.u();
                    if (iU2 == null || (c0298v = (C0298v) iU2.f3914W.f4064c) == null || (placementScope = c0298v.f3971z) == null) {
                        placementScope = L.a(i10).getPlacementScope();
                    }
                    H0.T.g(placementScope, m10.f3958p, 0, 0);
                } else {
                    i10.S();
                }
                ((p011b0.e) this.f4015e.f5618s).b(i10);
                i10.f3923f0 = true;
                L.a(i10).getRectManager().d(i10);
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(I i10) {
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            if (i(i13)) {
                if (AbstractC0283f.s(i13)) {
                    o(i13, true);
                } else {
                    n(i13);
                }
            }
        }
    }

    public final void o(I i10, boolean z10) {
        p063g1.a aVar;
        if (i10.f3924g0) {
            return;
        }
        if (i10 == this.f4011a) {
            aVar = this.f4018i;
            p251z9.j.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            b(i10, aVar);
        } else {
            c(i10, aVar);
        }
    }

    public final boolean p(I i10, boolean z10) {
        int iOrdinal = i10.f3915X.f3948d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f4017h.b(new W(i10, false, z10));
            } else {
                if (iOrdinal != 4) {
                    throw new A6.a();
                }
                if (!i10.r() || z10) {
                    i10.f3915X.f3958p.f4033M = true;
                    if (!i10.f3924g0 && (i10.I() || h(i10))) {
                        I iU = i10.u();
                        if (iU == null || !iU.r()) {
                            this.f4012b.f(i10, false);
                        }
                        if (!this.f4014d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        p063g1.a aVar = this.f4018i;
        if (aVar == null ? false : p063g1.a.b(aVar.f16246a, j)) {
            return;
        }
        if (this.f4013c) {
            G0.a.a("updateRootConstraints called while measuring");
        }
        this.f4018i = new p063g1.a(j);
        I i10 = this.f4011a;
        I i11 = i10.f3932y;
        M m10 = i10.f3915X;
        if (i11 != null) {
            m10.f3949e = true;
        }
        m10.f3958p.f4033M = true;
        this.f4012b.f(i10, i11 != null);
    }
}
