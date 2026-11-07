package p152p0;

import B9.a;
import D0.C0086d;
import J0.AbstractC0283f;
import J0.InterfaceC0293p;
import J0.K;
import J0.n0;
import android.support.v4.media.session.p;
import l0.q;
import p063g1.m;
import p151p.C1256n;
import p241y9.c;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q implements n0, a, InterfaceC0293p {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final c f20806F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f20807G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public c f20808H;

    public b(c cVar, c cVar2) {
        this.f20806F = cVar;
        this.f20808H = cVar2;
        cVar.f20809r = this;
    }

    @Override // J0.n0
    public final void A() {
        v0();
    }

    @Override // J0.InterfaceC0293p
    public final void Y() {
        v0();
    }

    @Override // p152p0.a
    public final long b() {
        return a.d0(AbstractC0283f.v(this, 128).f3170t);
    }

    @Override // p152p0.a
    public final p063g1.c getDensity() {
        return AbstractC0283f.x(this).f3912P;
    }

    @Override // p152p0.a
    public final m getLayoutDirection() {
        return AbstractC0283f.x(this).Q;
    }

    @Override // l0.q
    public final void m0() {
        v0();
    }

    @Override // l0.q
    public final void o0() {
        v0();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [y9.c, z9.k] */
    @Override // J0.InterfaceC0293p
    public final void r(K k7) {
        boolean z10 = this.f20807G;
        c cVar = this.f20806F;
        if (!z10) {
            cVar.f20810s = null;
            AbstractC0283f.t(this, new C0086d(22, this, cVar));
            if (cVar.f20810s == null) {
                throw p.s("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f20807G = true;
        }
        C1256n c1256n = cVar.f20810s;
        j.b(c1256n);
        ((k) c1256n.f20747s).e(k7);
    }

    public final void v0() {
        this.f20807G = false;
        this.f20806F.f20810s = null;
        AbstractC0283f.m(this);
    }

    @Override // l0.q
    public final void n0() {
    }
}
