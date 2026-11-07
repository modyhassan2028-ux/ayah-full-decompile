package p198u3;

import B.f;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import p110k9.y;
import p150o9.c;
import p161p9.a;
import p174r3.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f22885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f22886t;

    public /* synthetic */ b(InterfaceC0415h interfaceC0415h, d dVar, int i10) {
        this.f22884r = i10;
        this.f22885s = interfaceC0415h;
        this.f22886t = dVar;
    }

    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, c cVar) {
        switch (this.f22884r) {
            case 0:
                Object objD = this.f22885s.d(new f(29, interfaceC0416i, this.f22886t), cVar);
                return objD == a.f21156r ? objD : y.f19095a;
            default:
                Object objD2 = this.f22885s.d(new j(interfaceC0416i, this.f22886t, 4), cVar);
                return objD2 == a.f21156r ? objD2 : y.f19095a;
        }
    }
}
