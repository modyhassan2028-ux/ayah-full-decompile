package O9;

import K9.AbstractC0405x;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class k extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q9.i f6539v;

    /* JADX WARN: Multi-variable type inference failed */
    public k(p241y9.f fVar, InterfaceC0415h interfaceC0415h, p150o9.h hVar, int i10, M9.a aVar) {
        super(i10, aVar, interfaceC0415h, hVar);
        this.f6539v = (q9.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [q9.i, y9.f] */
    @Override // O9.e
    public final e h(p150o9.h hVar, int i10, M9.a aVar) {
        return new k(this.f6539v, this.f6528u, hVar, i10, aVar);
    }

    @Override // O9.g
    public final Object k(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        Object objJ = AbstractC0405x.j(new i(this, interfaceC0416i, null), cVar);
        return objJ == p161p9.a.f21156r ? objJ : p110k9.y.f19095a;
    }
}
