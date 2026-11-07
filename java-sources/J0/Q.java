package J0;

import H0.InterfaceC0219s;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q extends P implements H0.H {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final j0 f3972C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinkedHashMap f3974E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public H0.J f3976G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final u.z f3977H;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f3973D = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final H0.G f3975F = new H0.G(this);

    public Q(j0 j0Var) {
        this.f3972C = j0Var;
        u.z zVar = u.J.f22695a;
        this.f3977H = new u.z();
    }

    public static final void s0(Q q10, H0.J j) {
        p110k9.y yVar;
        LinkedHashMap linkedHashMap;
        if (j != null) {
            q10.Z((((long) j.a()) & 4294967295L) | (((long) j.b()) << 32));
            yVar = p110k9.y.f19095a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            q10.Z(0L);
        }
        if (!p251z9.j.a(q10.f3976G, j) && j != null && ((((linkedHashMap = q10.f3974E) != null && !linkedHashMap.isEmpty()) || !j.c().isEmpty()) && !p251z9.j.a(j.c(), q10.f3974E))) {
            V v10 = q10.f3972C.f4125C.f3915X.f3959q;
            p251z9.j.b(v10);
            v10.f3997J.f();
            LinkedHashMap linkedHashMap2 = q10.f3974E;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                q10.f3974E = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(j.c());
        }
        q10.f3976G = j;
    }

    @Override // H0.U
    public final void Y(long j, float f3, p241y9.c cVar) {
        u0(j);
        if (this.f3969x) {
            return;
        }
        t0();
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f3972C.getDensity();
    }

    @Override // H0.InterfaceC0215n
    public final p063g1.m getLayoutDirection() {
        return this.f3972C.f4125C.Q;
    }

    @Override // H0.U, H0.H
    public final Object i() {
        return this.f3972C.i();
    }

    @Override // J0.P
    public final P j0() {
        j0 j0Var = this.f3972C.f4126D;
        if (j0Var != null) {
            return j0Var.C0();
        }
        return null;
    }

    @Override // J0.P
    public final InterfaceC0219s k0() {
        return this.f3975F;
    }

    @Override // J0.P
    public final boolean l0() {
        return this.f3976G != null;
    }

    @Override // J0.P
    public final I m0() {
        return this.f3972C.f4125C;
    }

    @Override // p063g1.c
    public final float n() {
        return this.f3972C.n();
    }

    @Override // J0.P
    public final H0.J n0() {
        H0.J j = this.f3976G;
        if (j != null) {
            return j;
        }
        throw android.support.v4.media.session.p.s("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // J0.P
    public final P o0() {
        j0 j0Var = this.f3972C.f4127E;
        if (j0Var != null) {
            return j0Var.C0();
        }
        return null;
    }

    @Override // J0.P
    public final long p0() {
        return this.f3973D;
    }

    @Override // J0.P
    public final void r0() {
        Y(this.f3973D, 0.0f, null);
    }

    @Override // J0.P, H0.InterfaceC0215n
    public final boolean t() {
        return true;
    }

    public void t0() {
        n0().d();
    }

    public final void u0(long j) {
        if (!p063g1.j.a(this.f3973D, j)) {
            this.f3973D = j;
            j0 j0Var = this.f3972C;
            V v10 = j0Var.f4125C.f3915X.f3959q;
            if (v10 != null) {
                v10.j0();
            }
            P.q0(j0Var);
        }
        if (this.f3970y) {
            return;
        }
        i0(new v0(n0(), this));
    }

    public final long v0(Q q10, boolean z10) {
        long jC = 0;
        Q qC0 = this;
        while (!qC0.equals(q10)) {
            if (!qC0.f3968w || !z10) {
                jC = p063g1.j.c(jC, qC0.f3973D);
            }
            j0 j0Var = qC0.f3972C.f4127E;
            p251z9.j.b(j0Var);
            qC0 = j0Var.C0();
            p251z9.j.b(qC0);
        }
        return jC;
    }
}
