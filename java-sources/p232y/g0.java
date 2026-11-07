package p232y;

import A.EnumC0047u0;
import F9.f;
import H0.H;
import H0.J;
import H0.K;
import H0.U;
import J0.InterfaceC0302z;
import J0.P;
import J0.y0;
import R0.h;
import R0.j;
import R0.s;
import R0.u;
import R0.v;
import Z.C0675c0;
import Z.C0697n0;
import l0.q;
import p063g1.a;
import p093j0.i;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends q implements InterfaceC0302z, y0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public j0 f24517F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f24518G;

    @Override // J0.y0
    public final void L(j jVar) {
        u.g(jVar);
        h hVar = new h(new f0(this, 0), new f0(this, 1));
        if (this.f24518G) {
            v vVar = s.f7173t;
            f fVar = u.f7181a[11];
            vVar.a(jVar, hVar);
        } else {
            v vVar2 = s.f7172s;
            f fVar2 = u.f7181a[10];
            vVar2.a(jVar, hVar);
        }
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // J0.InterfaceC0302z
    public final int a(P p10, H h7, int i10) {
        if (this.f24518G) {
            i10 = Integer.MAX_VALUE;
        }
        return h7.N(i10);
    }

    @Override // J0.InterfaceC0302z
    public final int c(P p10, H h7, int i10) {
        if (!this.f24518G) {
            i10 = Integer.MAX_VALUE;
        }
        return h7.d(i10);
    }

    @Override // J0.InterfaceC0302z
    public final int d(P p10, H h7, int i10) {
        if (this.f24518G) {
            i10 = Integer.MAX_VALUE;
        }
        return h7.H(i10);
    }

    @Override // J0.InterfaceC0302z
    public final J e(K k7, H h7, long j) {
        p171r0.h.b(j, this.f24518G ? EnumC0047u0.f424r : EnumC0047u0.f425s);
        U uA = h7.a(a.a(j, 0, this.f24518G ? a.h(j) : Integer.MAX_VALUE, 0, this.f24518G ? Integer.MAX_VALUE : a.g(j), 5));
        int i10 = uA.f3168r;
        int iH = a.h(j);
        if (i10 > iH) {
            i10 = iH;
        }
        int i11 = uA.f3169s;
        int iG = a.g(j);
        if (i11 > iG) {
            i11 = iG;
        }
        int i12 = uA.f3169s - i11;
        int i13 = uA.f3168r - i10;
        if (!this.f24518G) {
            i12 = i13;
        }
        j0 j0Var = this.f24517F;
        C0675c0 c0675c0 = j0Var.f24538d;
        C0675c0 c0675c1 = j0Var.f24535a;
        c0675c0.h(i12);
        i iVarC = p093j0.s.c();
        c cVarE = iVarC != null ? iVarC.e() : null;
        i iVarD = p093j0.s.d(iVarC);
        try {
            if (c0675c1.g() > i12) {
                c0675c1.h(i12);
            }
            p093j0.s.g(iVarC, iVarD, cVarE);
            this.f24517F.f24536b.h(this.f24518G ? i11 : i10);
            return k7.g0(i10, i11, p120l9.s.f19441r, new C0697n0(i12, 1, this, uA));
        } catch (Throwable th) {
            p093j0.s.g(iVarC, iVarD, cVarE);
            throw th;
        }
    }

    @Override // J0.InterfaceC0302z
    public final int f(P p10, H h7, int i10) {
        if (!this.f24518G) {
            i10 = Integer.MAX_VALUE;
        }
        return h7.P(i10);
    }
}
