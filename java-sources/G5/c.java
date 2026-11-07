package G5;

import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C4.c f2868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2869t;

    public /* synthetic */ c(C4.c cVar, int i10, int i11) {
        this.f2867r = i11;
        this.f2868s = cVar;
        this.f2869t = i10;
    }

    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        switch (this.f2867r) {
            case 0:
                Object objD = this.f2868s.d(new b(this.f2869t, 0, interfaceC0416i), cVar);
                return objD == p161p9.a.f21156r ? objD : y.f19095a;
            case 1:
                Object objD2 = this.f2868s.d(new b(this.f2869t, 1, interfaceC0416i), cVar);
                return objD2 == p161p9.a.f21156r ? objD2 : y.f19095a;
            case 2:
                Object objD3 = this.f2868s.d(new b(this.f2869t, 2, interfaceC0416i), cVar);
                return objD3 == p161p9.a.f21156r ? objD3 : y.f19095a;
            default:
                Object objD4 = this.f2868s.d(new b(this.f2869t, 3, interfaceC0416i), cVar);
                return objD4 == p161p9.a.f21156r ? objD4 : y.f19095a;
        }
    }
}
