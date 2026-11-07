package H2;

import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import N9.O;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f3283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3284t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3285u;

    public /* synthetic */ j(InterfaceC0415h interfaceC0415h, Object obj, Object obj2, int i10) {
        this.f3282r = i10;
        this.f3283s = interfaceC0415h;
        this.f3284t = obj;
        this.f3285u = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [q9.i, y9.f] */
    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) throws Throwable {
        int i10 = this.f3282r;
        int i11 = 1;
        int i12 = 0;
        y yVar = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        Object obj = this.f3285u;
        Object obj2 = this.f3284t;
        InterfaceC0415h interfaceC0415h = this.f3283s;
        switch (i10) {
            case 0:
                Object objD = interfaceC0415h.d(new i(interfaceC0416i, (F2.u) obj2, (p241y9.c) obj, i12), cVar);
                return objD == aVar ? objD : yVar;
            case 1:
                Object objD2 = interfaceC0415h.d(new i(interfaceC0416i, (X1.e) obj2, obj, i11), cVar);
                return objD2 == aVar ? objD2 : yVar;
            default:
                Object objA = O9.c.a(interfaceC0416i, cVar, new O((p241y9.f) obj, (p150o9.c) null), new InterfaceC0415h[]{interfaceC0415h, (InterfaceC0415h) obj2});
                return objA == aVar ? objA : yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(InterfaceC0415h interfaceC0415h, InterfaceC0415h interfaceC0415h2, p241y9.f fVar) {
        this.f3282r = 2;
        this.f3283s = interfaceC0415h;
        this.f3284t = interfaceC0415h2;
        this.f3285u = (q9.i) fVar;
    }
}
