package N9;

/* JADX INFO: renamed from: N9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0427u implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f6252t;

    public /* synthetic */ C0427u(InterfaceC0415h interfaceC0415h, int i10, int i11) {
        this.f6250r = i11;
        this.f6252t = interfaceC0415h;
        this.f6251s = i10;
    }

    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        switch (this.f6250r) {
            case 0:
                Object objD = this.f6252t.d(new C0429w(new p251z9.t(), this.f6251s, interfaceC0416i), cVar);
                return objD == p161p9.a.f21156r ? objD : p110k9.y.f19095a;
            default:
                Object objD2 = ((C0427u) this.f6252t).d(new G5.b(this.f6251s, 4, interfaceC0416i), cVar);
                return objD2 == p161p9.a.f21156r ? objD2 : p110k9.y.f19095a;
        }
    }
}
