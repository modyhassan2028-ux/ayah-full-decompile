package J0;

import p180s0.C1297f;
import p180s0.C1303l;

/* JADX INFO: loaded from: classes.dex */
public final class K implements p196u0.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p196u0.b f3942r = new p196u0.b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC0293p f3943s;

    @Override // p063g1.c
    public final int E(float f3) {
        p196u0.b bVar = this.f3942r;
        bVar.getClass();
        return android.support.v4.media.session.p.c(bVar, f3);
    }

    @Override // p196u0.d
    public final long I() {
        return this.f3942r.I();
    }

    @Override // p196u0.d
    public final void K(long j, int i10, long j10, float f3) {
        this.f3942r.K(j, i10, j10, f3);
    }

    @Override // p063g1.c
    public final long M(long j) {
        p196u0.b bVar = this.f3942r;
        bVar.getClass();
        return android.support.v4.media.session.p.h(j, bVar);
    }

    @Override // p196u0.d
    public final void O(p180s0.E e10, p180s0.F f3, float f7, p196u0.c cVar, int i10) {
        this.f3942r.O(e10, f3, f7, cVar, i10);
    }

    @Override // p063g1.c
    public final float Q(long j) {
        p196u0.b bVar = this.f3942r;
        bVar.getClass();
        return android.support.v4.media.session.p.g(j, bVar);
    }

    @Override // p196u0.d
    public final void W(long j, long j10, long j11, float f3, int i10, int i11) {
        this.f3942r.W(j, j10, j11, f3, i10, i11);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return this.f3942r.X(f3);
    }

    public final void a() {
        p196u0.b bVar = this.f3942r;
        p180s0.o oVarP = bVar.f22795s.p();
        InterfaceC0290m interfaceC0290m = this.f3943s;
        if (interfaceC0290m == null) {
            throw android.support.v4.media.session.p.s("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        l0.q qVar = (l0.q) interfaceC0290m;
        l0.q qVarF = qVar.f19339r.f19344w;
        if (qVarF != null && (qVarF.f19342u & 4) != 0) {
            while (true) {
                if (qVarF != null) {
                    int i10 = qVarF.f19341t;
                    if ((i10 & 2) == 0) {
                        if ((i10 & 4) != 0) {
                            break;
                        } else {
                            qVarF = qVarF.f19344w;
                        }
                    }
                }
                qVarF = null;
                break;
            }
        } else {
            qVarF = null;
            break;
        }
        if (qVarF == null) {
            j0 j0VarV = AbstractC0283f.v(interfaceC0290m, 4);
            if (j0VarV.E0() == qVar.f19339r) {
                j0VarV = j0VarV.f4126D;
                p251z9.j.b(j0VarV);
            }
            j0VarV.T0(oVarP, (p205v0.b) bVar.f22795s.f16423t);
            return;
        }
        p011b0.e eVar = null;
        while (qVarF != null) {
            if (qVarF instanceof InterfaceC0293p) {
                InterfaceC0293p interfaceC0293p = (InterfaceC0293p) qVarF;
                p205v0.b bVar2 = (p205v0.b) bVar.f22795s.f16423t;
                j0 j0VarV2 = AbstractC0283f.v(interfaceC0293p, 4);
                long jD0 = B9.a.d0(j0VarV2.f3170t);
                I i11 = j0VarV2.f4125C;
                i11.getClass();
                L.a(i11).getSharedDrawScope().c(oVarP, jD0, j0VarV2, interfaceC0293p, bVar2);
            } else if ((qVarF.f19341t & 4) != 0 && (qVarF instanceof AbstractC0291n)) {
                int i12 = 0;
                for (l0.q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                    if ((qVar2.f19341t & 4) != 0) {
                        i12++;
                        if (i12 == 1) {
                            qVarF = qVar2;
                        } else {
                            if (eVar == null) {
                                eVar = new p011b0.e(new l0.q[16]);
                            }
                            if (qVarF != null) {
                                eVar.b(qVarF);
                                qVarF = null;
                            }
                            eVar.b(qVar2);
                        }
                    }
                }
                if (i12 == 1) {
                }
            }
            qVarF = AbstractC0283f.f(eVar);
        }
    }

    @Override // p196u0.d
    public final long b() {
        return this.f3942r.f22795s.v();
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return this.f3942r.b0(i10);
    }

    public final void c(p180s0.o oVar, long j, j0 j0Var, InterfaceC0293p interfaceC0293p, p205v0.b bVar) {
        InterfaceC0293p interfaceC0293p2 = this.f3943s;
        this.f3943s = interfaceC0293p;
        p063g1.m mVar = j0Var.f4125C.Q;
        p196u0.b bVar2 = this.f3942r;
        p074h0.i iVar = bVar2.f22795s;
        p196u0.a aVar = ((p196u0.b) iVar.f16424u).f22794r;
        p063g1.c cVar = aVar.f22790a;
        p063g1.m mVar2 = aVar.f22791b;
        p180s0.o oVarP = iVar.p();
        p074h0.i iVar2 = bVar2.f22795s;
        long jV = iVar2.v();
        p205v0.b bVar3 = (p205v0.b) iVar2.f16423t;
        iVar2.H(j0Var);
        iVar2.I(mVar);
        iVar2.G(oVar);
        iVar2.J(j);
        iVar2.f16423t = bVar;
        oVar.q();
        try {
            interfaceC0293p.r(this);
            oVar.n();
            iVar2.H(cVar);
            iVar2.I(mVar2);
            iVar2.G(oVarP);
            iVar2.J(jV);
            iVar2.f16423t = bVar3;
            this.f3943s = interfaceC0293p2;
        } catch (Throwable th) {
            oVar.n();
            iVar2.H(cVar);
            iVar2.I(mVar2);
            iVar2.G(oVarP);
            iVar2.J(jV);
            iVar2.f16423t = bVar3;
            throw th;
        }
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / this.f3942r.getDensity();
    }

    @Override // p196u0.d
    public final void e0(long j, float f3, float f7, boolean z10, long j10, long j11, p196u0.c cVar) {
        this.f3942r.e0(j, f3, f7, z10, j10, j11, cVar);
    }

    @Override // p196u0.d
    public final void f0(int i10, long j, long j10, long j11) {
        this.f3942r.f0(i10, j, j10, j11);
    }

    @Override // p196u0.d
    public final void g(C1297f c1297f, long j, long j10, long j11, float f3, C1303l c1303l, int i10) {
        this.f3942r.g(c1297f, j, j10, j11, f3, c1303l, i10);
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f3942r.getDensity();
    }

    @Override // p196u0.d
    public final p063g1.m getLayoutDirection() {
        return this.f3942r.f22794r.f22791b;
    }

    @Override // p196u0.d
    public final void k(p180s0.E e10, long j) {
        this.f3942r.k(e10, j);
    }

    @Override // p063g1.c
    public final float n() {
        return this.f3942r.n();
    }

    @Override // p196u0.d
    public final void u(long j, long j10, long j11, long j12) {
        this.f3942r.u(j, j10, j11, j12);
    }

    @Override // p063g1.c
    public final long v(long j) {
        p196u0.b bVar = this.f3942r;
        bVar.getClass();
        return android.support.v4.media.session.p.f(j, bVar);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return this.f3942r.getDensity() * f3;
    }

    @Override // p196u0.d
    public final p074h0.i y() {
        return this.f3942r.f22795s;
    }

    @Override // p063g1.c
    public final float z(long j) {
        p196u0.b bVar = this.f3942r;
        bVar.getClass();
        return android.support.v4.media.session.p.e(j, bVar);
    }
}
