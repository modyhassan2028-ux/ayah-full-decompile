package M;

import Z0.InterfaceC0716g;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0716g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0716g[] f5616a;

    public j(InterfaceC0716g[] interfaceC0716gArr) {
        this.f5616a = interfaceC0716gArr;
    }

    @Override // Z0.InterfaceC0716g
    public final void a(Z0.h hVar) {
        for (InterfaceC0716g interfaceC0716g : this.f5616a) {
            interfaceC0716g.a(hVar);
        }
    }
}
