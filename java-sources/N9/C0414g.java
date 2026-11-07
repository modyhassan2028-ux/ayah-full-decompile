package N9;

import java.io.Serializable;

/* JADX INFO: renamed from: N9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0414g implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0415h f6183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p241y9.c f6184s;

    public C0414g(InterfaceC0415h interfaceC0415h, p241y9.c cVar) {
        this.f6183r = interfaceC0415h;
        this.f6184s = cVar;
    }

    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        p251z9.v vVar = new p251z9.v();
        vVar.f24886r = O9.c.f6518b;
        Object objD = this.f6183r.d(new H2.i((Object) this, (Serializable) vVar, interfaceC0416i, 2), cVar);
        return objD == p161p9.a.f21156r ? objD : p110k9.y.f19095a;
    }
}
