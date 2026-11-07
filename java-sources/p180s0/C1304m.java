package p180s0;

import H0.H;
import H0.J;
import H0.K;
import H0.U;
import J0.InterfaceC0302z;
import J0.P;
import X.L;
import l0.q;
import p120l9.s;
import p241y9.c;
import p245z2.a;

/* JADX INFO: renamed from: s0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1304m extends q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public c f21837F;

    public C1304m(c cVar) {
        this.f21837F = cVar;
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int a(P p10, H h7, int i10) {
        return a.h(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int c(P p10, H h7, int i10) {
        return a.e(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int d(P p10, H h7, int i10) {
        return a.n(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final J e(K k7, H h7, long j) {
        U uA = h7.a(j);
        return k7.g0(uA.f3168r, uA.f3169s, s.f19441r, new L(13, uA, this));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(P p10, H h7, int i10) {
        return a.k(this, p10, h7, i10);
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f21837F + ')';
    }
}
