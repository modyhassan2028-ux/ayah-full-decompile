package J3;

import N9.InterfaceC0415h;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f4255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f4256t;

    public /* synthetic */ h(InterfaceC0415h interfaceC0415h, j jVar, int i10) {
        this.f4254r = i10;
        this.f4255s = interfaceC0415h;
        this.f4256t = jVar;
    }

    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        switch (this.f4254r) {
            case 0:
                Object objD = this.f4255s.d(new g(interfaceC0416i, this.f4256t, 0), cVar);
                return objD == p161p9.a.f21156r ? objD : p110k9.y.f19095a;
            default:
                Object objD2 = this.f4255s.d(new g(interfaceC0416i, this.f4256t, 1), cVar);
                return objD2 == p161p9.a.f21156r ? objD2 : p110k9.y.f19095a;
        }
    }
}
