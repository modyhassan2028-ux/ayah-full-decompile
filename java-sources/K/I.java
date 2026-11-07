package K;

import A.V0;
import J0.AbstractC0283f;
import K9.AbstractC0405x;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class I implements PointerInputEventHandler {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4476r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f4477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4478t;

    public I(g0 g0Var, O.N n6) {
        this.f4477s = g0Var;
        this.f4478t = n6;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(D0.z zVar, p150o9.c cVar) {
        switch (this.f4476r) {
            case 0:
                Object objJ = AbstractC0405x.j(new G5.e(zVar, this.f4477s, (O.N) this.f4478t, (p150o9.c) null, 2), cVar);
                return objJ == p161p9.a.f21156r ? objJ : p110k9.y.f19095a;
            default:
                D0.O o10 = (D0.O) zVar;
                o10.getClass();
                Object objC = V0.c(zVar, new L.a((O8.c) this.f4478t, new G.a0(AbstractC0283f.x(o10).R), this.f4477s, null), cVar);
                return objC == p161p9.a.f21156r ? objC : p110k9.y.f19095a;
        }
    }

    public I(O8.c cVar, g0 g0Var) {
        this.f4478t = cVar;
        this.f4477s = g0Var;
    }
}
