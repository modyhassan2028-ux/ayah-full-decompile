package O9;

import N9.InterfaceC0415h;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    public h(InterfaceC0415h interfaceC0415h, p150o9.h hVar, int i10, M9.a aVar, int i11) {
        super((i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? M9.a.f5830r : aVar, interfaceC0415h, (i11 & 2) != 0 ? p150o9.i.f20380r : hVar);
    }

    @Override // O9.e
    public final e h(p150o9.h hVar, int i10, M9.a aVar) {
        return new h(i10, aVar, this.f6528u, hVar);
    }

    @Override // O9.e
    public final InterfaceC0415h i() {
        return this.f6528u;
    }

    @Override // O9.g
    public final Object k(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        Object objD = this.f6528u.d(interfaceC0416i, cVar);
        return objD == p161p9.a.f21156r ? objD : p110k9.y.f19095a;
    }
}
