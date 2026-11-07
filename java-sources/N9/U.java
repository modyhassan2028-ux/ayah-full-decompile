package N9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U implements i0, InterfaceC0415h, O9.p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0 f6130r;

    public U(S s10) {
        this.f6130r = s10;
    }

    @Override // N9.V
    public final List a() {
        return this.f6130r.a();
    }

    @Override // O9.p
    public final InterfaceC0415h c(p150o9.h hVar, int i10, M9.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != M9.a.f5831s) ? AbstractC0419l.t(this, hVar, i10, aVar) : this;
    }

    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        return this.f6130r.d(interfaceC0416i, cVar);
    }

    @Override // N9.i0
    public final Object getValue() {
        return this.f6130r.getValue();
    }
}
