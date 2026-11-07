package p232y;

import A.C0040q0;
import A.E;
import B9.a;
import J0.AbstractC0283f;
import J0.InterfaceC0293p;
import J0.InterfaceC0294q;
import J0.K;
import J0.j0;
import J0.n0;
import J0.y0;
import K9.AbstractC0405x;
import M9.e;
import O.S;
import R0.j;
import Z.C;
import Z.C0672b;
import Z.C0681f0;
import Z.X;
import android.view.View;
import l0.q;
import p063g1.c;
import p063g1.h;
import p063g1.l;
import p110k9.y;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends q implements InterfaceC0294q, InterfaceC0293p, y0, n0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public E f24442F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public S f24443G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public a0 f24444H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public View f24445I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public c f24446J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Z f24447K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C f24449M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public l f24451O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public e f24452P;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0681f0 f24448L = new C0681f0(null, Z.S.f10640t);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f24450N = 9205357640488583168L;

    public Q(E e10, S s10, a0 a0Var) {
        this.f24442F = e10;
        this.f24443G = s10;
        this.f24444H = a0Var;
    }

    @Override // J0.n0
    public final void A() {
        AbstractC0283f.t(this, new P(this, 2));
    }

    @Override // J0.InterfaceC0294q
    public final void H(j0 j0Var) {
        this.f24448L.setValue(j0Var);
    }

    @Override // J0.y0
    public final void L(j jVar) {
        jVar.e(S.f24453a, new P(this, 1));
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    @Override // l0.q
    public final void l0() {
        A();
        this.f24452P = u0.a(0, 7, null);
        AbstractC0405x.x(h0(), null, new C0040q0(this, (p150o9.c) null, 25), 1);
    }

    @Override // l0.q
    public final void n0() {
        Z z10 = this.f24447K;
        if (z10 != null) {
            ((b0) z10).b();
        }
        this.f24447K = null;
    }

    @Override // J0.InterfaceC0293p
    public final void r(K k7) {
        k7.a();
        e eVar = this.f24452P;
        if (eVar != null) {
            eVar.k(y.f19095a);
        }
    }

    public final long v0() {
        if (this.f24449M == null) {
            this.f24449M = C0672b.o(new P(this, 0));
        }
        C c10 = this.f24449M;
        if (c10 != null) {
            return ((p171r0.c) c10.getValue()).f21387a;
        }
        return 9205357640488583168L;
    }

    public final void w0() {
        Z z10 = this.f24447K;
        if (z10 != null) {
            ((b0) z10).b();
        }
        View viewZ = this.f24445I;
        if (viewZ == null) {
            viewZ = AbstractC0283f.z(this);
        }
        this.f24445I = viewZ;
        c cVar = this.f24446J;
        if (cVar == null) {
            cVar = AbstractC0283f.x(this).f3912P;
        }
        this.f24446J = cVar;
        this.f24447K = this.f24444H.b(viewZ, cVar);
        y0();
    }

    public final void x0() {
        c cVar = this.f24446J;
        if (cVar == null) {
            cVar = AbstractC0283f.x(this).f3912P;
            this.f24446J = cVar;
        }
        long j = ((p171r0.c) this.f24442F.e(cVar)).f21387a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & v0()) == 9205357640488583168L) {
            this.f24450N = 9205357640488583168L;
            Z z10 = this.f24447K;
            if (z10 != null) {
                ((b0) z10).b();
                return;
            }
            return;
        }
        this.f24450N = p171r0.c.h(v0(), j);
        if (this.f24447K == null) {
            w0();
        }
        Z z11 = this.f24447K;
        if (z11 != null) {
            z11.a(this.f24450N, 9205357640488583168L);
        }
        y0();
    }

    public final void y0() {
        c cVar;
        Z z10 = this.f24447K;
        if (z10 == null || (cVar = this.f24446J) == null) {
            return;
        }
        b0 b0Var = (b0) z10;
        long jC = b0Var.c();
        l lVar = this.f24451O;
        if (p123m2.c.D(lVar) && jC == lVar.f16260a) {
            return;
        }
        S s10 = this.f24443G;
        long jV = cVar.v(a.d0(b0Var.c()));
        X x9 = s10.f6338t;
        c cVar2 = s10.f6337s;
        x9.setValue(new l((((long) cVar2.E(h.b(jV))) << 32) | (((long) cVar2.E(h.a(jV))) & 4294967295L)));
        this.f24451O = new l(b0Var.c());
    }
}
