package Z;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: renamed from: Z.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0707x implements t0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0402u f10851r;

    public C0707x(InterfaceC0402u interfaceC0402u) {
        this.f10851r = interfaceC0402u;
    }

    @Override // Z.t0
    public final void c() {
        InterfaceC0402u interfaceC0402u = this.f10851r;
        if (interfaceC0402u instanceof v0) {
            ((v0) interfaceC0402u).a();
        } else {
            AbstractC0405x.h(interfaceC0402u, new H(1));
        }
    }

    @Override // Z.t0
    public final void d() {
        InterfaceC0402u interfaceC0402u = this.f10851r;
        if (interfaceC0402u instanceof v0) {
            ((v0) interfaceC0402u).a();
        } else {
            AbstractC0405x.h(interfaceC0402u, new H(1));
        }
    }

    @Override // Z.t0
    public final void b() {
    }
}
