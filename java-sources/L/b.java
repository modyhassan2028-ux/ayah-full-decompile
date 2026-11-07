package L;

import A.N;
import D0.C0096n;
import D0.EnumC0097o;
import D0.I;
import D0.O;
import J0.A0;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0279d;
import J0.C0292o;
import J0.w0;
import p162q0.e;
import p162q0.q;
import p162q0.s;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0291n implements w0, e, q {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p241y9.a f5426H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5427I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final O f5428J;

    public b(p241y9.a aVar) {
        this.f5426H = aVar;
        N n6 = new N(1, this);
        C0096n c0096n = I.f1055a;
        O o10 = new O(null, null, n6);
        v0(o10);
        this.f5428J = o10;
    }

    @Override // J0.w0
    public final void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        this.f5428J.C(c0096n, enumC0097o, j);
    }

    @Override // p162q0.e
    public final void D(s sVar) {
        this.f5427I = sVar.a();
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
        this.f5428J.R();
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
        C0292o c0292o = androidx.compose.foundation.text.handwriting.a.f11873a;
        p063g1.c cVar = AbstractC0283f.x(this).f3912P;
        c0292o.getClass();
        int i10 = A0.f3874b;
        return C0279d.c(cVar.E(c0292o.f4152a), cVar.E(c0292o.f4153b), cVar.E(c0292o.f4154c), cVar.E(c0292o.f4155d));
    }
}
