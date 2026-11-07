package W;

import A.C0040q0;
import J0.InterfaceC0302z;
import K9.AbstractC0405x;
import p223x.C1411c;

/* JADX INFO: renamed from: W.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0550d2 extends l0.q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public B.j f9027F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9028G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9029H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1411c f9030I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1411c f9031J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f9032K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f9033L;

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int a(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.h(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int c(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.e(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int d(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.n(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final H0.J e(H0.K k7, H0.H h7, long j) {
        float f3;
        boolean z10 = (h7.d(p063g1.a.h(j)) == 0 || h7.N(p063g1.a.g(j)) == 0) ? false : true;
        if (this.f9029H) {
            f3 = Y.q.f10227a;
        } else {
            f3 = (z10 || this.f9028G) ? androidx.compose.material3.a.f11919a : androidx.compose.material3.a.f11920b;
        }
        float fW = k7.w(f3);
        C1411c c1411c = this.f9031J;
        int iFloatValue = (int) (c1411c != null ? ((Number) c1411c.d()).floatValue() : fW);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            p063g1.i.a("width and height must be >= 0");
        }
        H0.U uA = h7.a(p063g1.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fW2 = k7.w((androidx.compose.material3.a.f11922d - k7.d0(fW)) / 2.0f);
        float fW3 = k7.w((androidx.compose.material3.a.f11921c - androidx.compose.material3.a.f11919a) - androidx.compose.material3.a.f11923e);
        boolean z11 = this.f9029H;
        if (z11 && this.f9028G) {
            fW2 = fW3 - k7.w(Y.q.f10231e);
        } else if (z11 && !this.f9028G) {
            fW2 = k7.w(Y.q.f10231e);
        } else if (this.f9028G) {
            fW2 = fW3;
        }
        C1411c c1411c2 = this.f9031J;
        Float f7 = c1411c2 != null ? (Float) c1411c2.f23945e.getValue() : null;
        if (f7 == null || f7.floatValue() != fW) {
            AbstractC0405x.x(h0(), null, new C0546c2(this, fW, null, 0), 3);
        }
        C1411c c1411c3 = this.f9030I;
        Float f10 = c1411c3 != null ? (Float) c1411c3.f23945e.getValue() : null;
        if (f10 == null || f10.floatValue() != fW2) {
            AbstractC0405x.x(h0(), null, new C0546c2(this, fW2, null, 1), 3);
        }
        if (Float.isNaN(this.f9033L) && Float.isNaN(this.f9032K)) {
            this.f9033L = fW;
            this.f9032K = fW2;
        }
        return k7.g0(iFloatValue, iFloatValue, p120l9.s.f19441r, new A.q1(uA, this, fW2));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // l0.q
    public final void l0() {
        AbstractC0405x.x(h0(), null, new C0040q0(this, (p150o9.c) null, 15), 3);
    }
}
