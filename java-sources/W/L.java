package W;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f8633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0561g1 f8634t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(InterfaceC0402u interfaceC0402u, C0561g1 c0561g1, int i10) {
        super(0);
        this.f8632r = i10;
        this.f8633s = interfaceC0402u;
        this.f8634t = c0561g1;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f8632r) {
            case 0:
                AbstractC0405x.x(this.f8633s, null, new K(this.f8634t, null, 0), 3);
                break;
            case 1:
                AbstractC0405x.x(this.f8633s, null, new K(this.f8634t, null, 1), 3);
                break;
            default:
                AbstractC0405x.x(this.f8633s, null, new K(this.f8634t, null, 2), 3);
                break;
        }
        return Boolean.TRUE;
    }
}
