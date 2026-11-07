package p232y;

import A.C0040q0;
import B.j;
import J0.InterfaceC0293p;
import J0.K;
import K9.AbstractC0405x;
import l0.q;
import p150o9.c;
import p196u0.b;

/* JADX INFO: renamed from: y.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1467v extends q implements InterfaceC0293p {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final j f24590F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f24591G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f24592H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f24593I;

    public C1467v(j jVar) {
        this.f24590F = jVar;
    }

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    @Override // l0.q
    public final void l0() {
        AbstractC0405x.x(h0(), null, new C0040q0(this, (c) null, 23), 3);
    }

    @Override // J0.InterfaceC0293p
    public final void r(K k7) {
        k7.a();
        b bVar = k7.f3942r;
        if (this.f24591G) {
            p123m2.c.k(k7, p180s0.q.b(p180s0.q.f21839b, 0.3f), 0L, bVar.f22795s.v(), 122);
        } else if (this.f24592H || this.f24593I) {
            p123m2.c.k(k7, p180s0.q.b(p180s0.q.f21839b, 0.1f), 0L, bVar.f22795s.v(), 122);
        }
    }
}
