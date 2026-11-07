package A;

import K9.AbstractC0405x;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p232y.AbstractC1450d;
import p232y.C1452f;

/* JADX INFO: loaded from: classes.dex */
public final class N implements PointerInputEventHandler {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f99r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f100s;

    public /* synthetic */ N(int i10, Object obj) {
        this.f99r = i10;
        this.f100s = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(D0.z zVar, p150o9.c cVar) {
        switch (this.f99r) {
            case 0:
                E0.d dVar = new E0.d();
                T t2 = (T) this.f100s;
                Object objJ = AbstractC0405x.j(new J(t2, zVar, new M(0, t2, dVar), new C0023i(dVar, zVar, t2, 1), new L(t2, 0), new L(t2, 1), new K(0, dVar, t2), null), cVar);
                return objJ == p161p9.a.f21156r ? objJ : p110k9.y.f19095a;
            case 1:
                Object objC = V0.c(zVar, new L.a((L.b) this.f100s, null), cVar);
                return objC == p161p9.a.f21156r ? objC : p110k9.y.f19095a;
            case 2:
                Object objJ2 = AbstractC0405x.j(new A4.l(zVar, (K.g0) this.f100s, (p150o9.c) null, 4), cVar);
                p110k9.y yVar = p110k9.y.f19095a;
                p161p9.a aVar = p161p9.a.f21156r;
                if (objJ2 != aVar) {
                    objJ2 = yVar;
                }
                return objJ2 == aVar ? objJ2 : yVar;
            case 3:
                Object objZ0 = ((AbstractC1450d) this.f100s).z0(zVar, cVar);
                return objZ0 == p161p9.a.f21156r ? objZ0 : p110k9.y.f19095a;
            default:
                Object objC2 = V0.c(zVar, new I1.W((C1452f) this.f100s, null, 1), cVar);
                return objC2 == p161p9.a.f21156r ? objC2 : p110k9.y.f19095a;
        }
    }
}
