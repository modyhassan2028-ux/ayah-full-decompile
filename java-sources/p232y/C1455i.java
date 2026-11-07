package p232y;

import D0.C0086d;
import J0.AbstractC0283f;
import J0.InterfaceC0293p;
import J0.K;
import J0.n0;
import l0.q;
import p063g1.m;
import p123m2.c;
import p171r0.i;
import p180s0.F;
import p180s0.J;
import p196u0.b;
import p251z9.j;

/* JADX INFO: renamed from: y.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1455i extends q implements InterfaceC0293p, n0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f24521F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public J f24522G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f24523H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public m f24524I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public F f24525J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public J f24526K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public F f24527L;

    @Override // J0.n0
    public final void A() {
        this.f24523H = 9205357640488583168L;
        this.f24524I = null;
        this.f24525J = null;
        this.f24526K = null;
        AbstractC0283f.m(this);
    }

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    @Override // J0.InterfaceC0293p
    public final void r(K k7) {
        K k10;
        F f3;
        b bVar = k7.f3942r;
        if (this.f24522G != F.f21774a) {
            k10 = k7;
            if (i.a(bVar.f22795s.v(), this.f24523H) && k10.getLayoutDirection() == this.f24524I && j.a(this.f24526K, this.f24522G)) {
                f3 = this.f24525J;
                j.b(f3);
            } else {
                AbstractC0283f.t(this, new C0086d(25, this, k10));
                f3 = this.f24527L;
                this.f24527L = null;
            }
            this.f24525J = f3;
            this.f24523H = bVar.f22795s.v();
            this.f24524I = k10.getLayoutDirection();
            this.f24526K = this.f24522G;
            j.b(f3);
            if (!p180s0.q.c(this.f24521F, p180s0.q.g)) {
                F.l(k10, f3, this.f24521F);
            }
        } else if (p180s0.q.c(this.f24521F, p180s0.q.g)) {
            k10 = k7;
        } else {
            k10 = k7;
            c.k(k10, this.f24521F, 0L, 0L, 126);
        }
        k10.a();
    }
}
