package X1;

import N9.InterfaceC0415h;
import T1.InterfaceC0491h;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0491h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0491h f9849a;

    public d(InterfaceC0491h interfaceC0491h) {
        this.f9849a = interfaceC0491h;
    }

    @Override // T1.InterfaceC0491h
    public final Object a(p241y9.e eVar, p150o9.c cVar) {
        return this.f9849a.a(new c(eVar, null, 0), cVar);
    }

    @Override // T1.InterfaceC0491h
    public final InterfaceC0415h b() {
        return this.f9849a.b();
    }
}
