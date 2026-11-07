package N9;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6126r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h[] f6127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q9.i f6128t;

    /* JADX WARN: Multi-variable type inference failed */
    public P(InterfaceC0415h[] interfaceC0415hArr, p241y9.g gVar) {
        this.f6127s = interfaceC0415hArr;
        this.f6128t = (q9.i) gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q9.i, y9.g] */
    /* JADX WARN: Type inference failed for: r2v1, types: [q9.i, y9.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [q9.i, y9.i] */
    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        switch (this.f6126r) {
            case 0:
                Object objA = O9.c.a(interfaceC0416i, cVar, new O((p150o9.c) null, (p241y9.g) this.f6128t), this.f6127s);
                return objA == p161p9.a.f21156r ? objA : p110k9.y.f19095a;
            case 1:
                Object objA2 = O9.c.a(interfaceC0416i, cVar, new O((p150o9.c) null, (p241y9.h) this.f6128t), this.f6127s);
                return objA2 == p161p9.a.f21156r ? objA2 : p110k9.y.f19095a;
            default:
                Object objA3 = O9.c.a(interfaceC0416i, cVar, new O((p150o9.c) null, (p241y9.i) this.f6128t), this.f6127s);
                return objA3 == p161p9.a.f21156r ? objA3 : p110k9.y.f19095a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P(InterfaceC0415h[] interfaceC0415hArr, p241y9.h hVar) {
        this.f6127s = interfaceC0415hArr;
        this.f6128t = (q9.i) hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P(InterfaceC0415h[] interfaceC0415hArr, p241y9.i iVar) {
        this.f6127s = interfaceC0415hArr;
        this.f6128t = (q9.i) iVar;
    }
}
