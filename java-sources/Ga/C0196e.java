package Ga;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.X;

/* JADX INFO: renamed from: Ga.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0196e implements Z.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f3011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f3012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f3013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f3014d;

    public C0196e(p241y9.a aVar, X x9, X x10, InterfaceC0402u interfaceC0402u) {
        this.f3011a = aVar;
        this.f3012b = x9;
        this.f3013c = x10;
        this.f3014d = interfaceC0402u;
    }

    @Override // Z.E
    public final void a() {
        X x9 = this.f3012b;
        if (((Boolean) x9.getValue()).booleanValue()) {
            B.b bVar = (B.b) this.f3013c.getValue();
            if (bVar != null) {
                AbstractC0405x.x(this.f3014d, null, new C0195d(bVar, null, 0), 3);
            }
            if (((Boolean) x9.getValue()).booleanValue()) {
                this.f3011a.invoke();
            }
            x9.setValue(Boolean.FALSE);
        }
    }
}
