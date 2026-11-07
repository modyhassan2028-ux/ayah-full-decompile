package K;

import A.C0027k;
import A.C0053x0;
import A.U0;
import A.n1;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f4721r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z.X f4722s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.j f4723t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z.X f4724u;

    public m0(InterfaceC0402u interfaceC0402u, Z.X x9, B.j jVar, Z.X x10) {
        this.f4721r = interfaceC0402u;
        this.f4722s = x9;
        this.f4723t = jVar;
        this.f4724u = x10;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(D0.z zVar, p150o9.c cVar) {
        l0 l0Var = new l0(this.f4721r, this.f4722s, this.f4723t, null);
        U0 u8 = new U0(this.f4724u, 4);
        A.U u10 = n1.f346a;
        Object objJ = AbstractC0405x.j(new C0027k(zVar, l0Var, u8, new C0053x0(zVar), null), cVar);
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (objJ != aVar) {
            objJ = yVar;
        }
        return objJ == aVar ? objJ : yVar;
    }
}
