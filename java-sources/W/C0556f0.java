package W;

import D0.C0096n;
import D0.EnumC0097o;
import H0.InterfaceC0219s;
import J0.AbstractC0291n;
import J0.InterfaceC0289l;
import J0.InterfaceC0301y;

/* JADX INFO: renamed from: W.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0556f0 extends AbstractC0291n implements J0.w0, InterfaceC0289l, InterfaceC0301y {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C0576l f9064H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9065I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f9066J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f9067K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f9068L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f9069M = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final D0.O f9070N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final D0.O f9071O;

    public C0556f0(C0576l c0576l, boolean z10, int i10) {
        this.f9064H = c0576l;
        this.f9065I = z10;
        this.f9066J = i10;
        p150o9.c cVar = null;
        C0548d0 c0548d0 = new C0548d0(this, cVar, 1);
        C0096n c0096n = D0.I.f1055a;
        D0.J j = D0.J.f1056r;
        D0.O o10 = new D0.O(null, null, j);
        o10.f1076H = c0548d0;
        v0(o10);
        this.f9070N = o10;
        C0548d0 c0548d1 = new C0548d0(this, cVar, 0);
        D0.O o11 = new D0.O(null, null, j);
        o11.f1076H = c0548d1;
        v0(o11);
        this.f9071O = o11;
    }

    @Override // J0.w0
    public final void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        this.f9070N.C(c0096n, enumC0097o, j);
        this.f9071O.C(c0096n, enumC0097o, j);
    }

    @Override // J0.InterfaceC0301y
    public final /* synthetic */ void G(InterfaceC0219s interfaceC0219s) {
    }

    @Override // J0.w0
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // J0.w0
    public final void P() {
        R();
    }

    @Override // J0.w0
    public final void R() {
        this.f9070N.R();
        this.f9071O.R();
    }

    @Override // J0.w0
    public final /* synthetic */ void a0() {
    }

    @Override // l0.q
    public final void m0() {
        R();
    }

    @Override // J0.w0
    public final long q() {
        return J0.A0.f3873a;
    }

    @Override // J0.InterfaceC0301y
    public final void s(long j) {
        this.f9069M = B9.a.y(j);
    }
}
