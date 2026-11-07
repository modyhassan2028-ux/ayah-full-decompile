package O;

import A.V0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: O.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0453v implements PointerInputEventHandler {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f6421s;

    public /* synthetic */ C0453v(p241y9.c cVar, int i10) {
        this.f6420r = i10;
        this.f6421s = cVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(D0.z zVar, p150o9.c cVar) {
        switch (this.f6420r) {
            case 0:
                Object objV0 = ((D0.O) zVar).v0(new C0452u(0, null, this.f6421s), cVar);
                return objV0 == p161p9.a.f21156r ? objV0 : p110k9.y.f19095a;
            default:
                Object objC = V0.c(zVar, new C0452u(1, null, this.f6421s), cVar);
                p110k9.y yVar = p110k9.y.f19095a;
                p161p9.a aVar = p161p9.a.f21156r;
                if (objC != aVar) {
                    objC = yVar;
                }
                return objC == aVar ? objC : yVar;
        }
    }
}
