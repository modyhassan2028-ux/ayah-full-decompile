package N9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T implements V, InterfaceC0415h, O9.p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y f6129r;

    public T(Y y10) {
        this.f6129r = y10;
    }

    @Override // N9.V
    public final List a() {
        return this.f6129r.a();
    }

    @Override // O9.p
    public final InterfaceC0415h c(p150o9.h hVar, int i10, M9.a aVar) {
        return AbstractC0419l.t(this, hVar, i10, aVar);
    }

    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) throws Throwable {
        this.f6129r.d(interfaceC0416i, cVar);
        return p161p9.a.f21156r;
    }
}
