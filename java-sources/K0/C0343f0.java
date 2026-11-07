package K0;

import D0.C0086d;
import android.view.ViewGroup;

/* JADX INFO: renamed from: K0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0343f0 extends l0.q implements O0.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ViewGroup f5072F;

    @Override // O0.a
    public final Object o(J0.j0 j0Var, C0086d c0086d, q9.c cVar) {
        long jG = j0Var.G(0L);
        p171r0.e eVar = (p171r0.e) c0086d.invoke();
        p171r0.e eVarH = eVar != null ? eVar.h(jG) : null;
        if (eVarH != null) {
            this.f5072F.requestRectangleOnScreen(p180s0.F.s(eVarH), false);
        }
        return p110k9.y.f19095a;
    }
}
