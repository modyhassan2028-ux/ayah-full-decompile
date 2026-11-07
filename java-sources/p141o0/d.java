package p141o0;

import A.C0023i;
import B0.c;
import B9.a;
import H0.InterfaceC0219s;
import J0.AbstractC0283f;
import J0.C0;
import J0.InterfaceC0301y;
import Z0.B;
import l0.q;
import p251z9.j;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q implements C0, InterfaceC0301y {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public d f20211F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public d f20212G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f20213H;

    @Override // J0.InterfaceC0301y
    public final /* synthetic */ void G(InterfaceC0219s interfaceC0219s) {
    }

    @Override // l0.q
    public final void n0() {
        this.f20212G = null;
        this.f20211F = null;
    }

    @Override // J0.C0
    public final Object p() {
        return c.f20210a;
    }

    @Override // J0.InterfaceC0301y
    public final void s(long j) {
        this.f20213H = j;
    }

    public final boolean v0(B b5) {
        d dVar = this.f20211F;
        if (dVar != null) {
            return dVar.v0(b5);
        }
        d dVar2 = this.f20212G;
        if (dVar2 != null) {
            return dVar2.v0(b5);
        }
        return false;
    }

    public final void w0(B b5) {
        d dVar = this.f20212G;
        if (dVar != null) {
            dVar.w0(b5);
            return;
        }
        d dVar2 = this.f20211F;
        if (dVar2 != null) {
            dVar2.w0(b5);
        }
    }

    public final void x0(B b5) {
        d dVar = this.f20212G;
        if (dVar != null) {
            dVar.x0(b5);
        }
        d dVar2 = this.f20211F;
        if (dVar2 != null) {
            dVar2.x0(b5);
        }
        this.f20211F = null;
    }

    public final void y0(B b5) {
        C0 c10;
        d dVar;
        d dVar2 = this.f20211F;
        if (dVar2 == null || !c.b(dVar2, a.E(b5))) {
            if (this.f19339r.f19338E) {
                v vVar = new v();
                AbstractC0283f.B(this, new C0023i(vVar, this, b5, 18));
                c10 = (C0) vVar.f24886r;
            } else {
                c10 = null;
            }
            dVar = (d) c10;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            dVar.w0(b5);
            dVar.y0(b5);
            d dVar3 = this.f20212G;
            if (dVar3 != null) {
                dVar3.x0(b5);
            }
        } else if (dVar == null && dVar2 != null) {
            d dVar4 = this.f20212G;
            if (dVar4 != null) {
                dVar4.w0(b5);
                dVar4.y0(b5);
            }
            dVar2.x0(b5);
        } else if (!j.a(dVar, dVar2)) {
            if (dVar != null) {
                dVar.w0(b5);
                dVar.y0(b5);
            }
            if (dVar2 != null) {
                dVar2.x0(b5);
            }
        } else if (dVar != null) {
            dVar.y0(b5);
        } else {
            d dVar5 = this.f20212G;
            if (dVar5 != null) {
                dVar5.y0(b5);
            }
        }
        this.f20211F = dVar;
    }

    public final void z0(B b5) {
        d dVar = this.f20212G;
        if (dVar != null) {
            dVar.z0(b5);
            return;
        }
        d dVar2 = this.f20211F;
        if (dVar2 != null) {
            dVar2.z0(b5);
        }
    }
}
