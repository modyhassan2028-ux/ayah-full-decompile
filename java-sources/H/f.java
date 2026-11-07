package H;

import A.C0025j;
import A.C0031m;
import D0.C0086d;
import H0.InterfaceC0219s;
import J0.AbstractC0283f;
import J0.InterfaceC0301y;
import J0.j0;
import K9.AbstractC0405x;
import l0.q;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q implements O0.a, InterfaceC0301y {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0031m f3126F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f3127G;

    public static final p171r0.e v0(f fVar, j0 j0Var, C0086d c0086d) {
        p171r0.e eVar;
        if (fVar.f19338E && fVar.f3127G) {
            j0 j0VarW = AbstractC0283f.w(fVar);
            if (!j0Var.E0().f19338E) {
                j0Var = null;
            }
            if (j0Var != null && (eVar = (p171r0.e) c0086d.invoke()) != null) {
                p171r0.e eVarJ = j0VarW.J(j0Var, false);
                return eVar.h((((long) Float.floatToRawIntBits(eVarJ.f21390b)) & 4294967295L) | (((long) Float.floatToRawIntBits(eVarJ.f21389a)) << 32));
            }
        }
        return null;
    }

    @Override // J0.InterfaceC0301y
    public final void G(InterfaceC0219s interfaceC0219s) {
        this.f3127G = true;
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // O0.a
    public final Object o(j0 j0Var, C0086d c0086d, q9.c cVar) {
        Object objJ = AbstractC0405x.j(new e(this, j0Var, c0086d, new C0025j(this, j0Var, c0086d, 2), null), cVar);
        return objJ == p161p9.a.f21156r ? objJ : y.f19095a;
    }

    @Override // J0.InterfaceC0301y
    public final /* synthetic */ void s(long j) {
    }
}
