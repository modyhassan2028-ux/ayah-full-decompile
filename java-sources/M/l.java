package M;

import J0.InterfaceC0289l;
import J0.InterfaceC0290m;
import J0.InterfaceC0294q;
import J0.j0;
import K.W;
import O.N;
import Z.C0672b;
import Z.C0681f0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends l0.q implements InterfaceC0289l, InterfaceC0294q, InterfaceC0290m {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public c f5620F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public W f5621G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public N f5622H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0681f0 f5623I = C0672b.r(null);

    public l(c cVar, W w9, N n6) {
        this.f5620F = cVar;
        this.f5621G = w9;
        this.f5622H = n6;
    }

    @Override // J0.InterfaceC0294q
    public final void H(j0 j0Var) {
        this.f5623I.setValue(j0Var);
    }

    @Override // l0.q
    public final void l0() {
        c cVar = this.f5620F;
        if (cVar.f5592a != null) {
            C.a.c("Expected textInputModifierNode to be null");
        }
        cVar.f5592a = this;
    }

    @Override // l0.q
    public final void n0() {
        this.f5620F.k(this);
    }
}
