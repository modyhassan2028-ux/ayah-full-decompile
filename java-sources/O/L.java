package O;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f6305s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(N n6, int i10) {
        super(0);
        this.f6304r = i10;
        this.f6305s = n6;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [y9.a, z9.k] */
    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f6304r) {
            case 0:
                ?? r10 = this.f6305s.g;
                if (r10 != 0) {
                    r10.invoke();
                }
                break;
            case 1:
                N n6 = this.f6305s;
                InterfaceC0402u interfaceC0402u = n6.f6315i;
                if (interfaceC0402u != null) {
                    AbstractC0405x.x(interfaceC0402u, null, new M(n6, null, 0), 1);
                }
                n6.l();
                break;
            case 2:
                N n10 = this.f6305s;
                InterfaceC0402u interfaceC0402u2 = n10.f6315i;
                if (interfaceC0402u2 != null) {
                    AbstractC0405x.x(interfaceC0402u2, null, new M(n10, null, 1), 1);
                }
                n10.l();
                break;
            case 3:
                N n11 = this.f6305s;
                InterfaceC0402u interfaceC0402u3 = n11.f6315i;
                if (interfaceC0402u3 != null) {
                    AbstractC0405x.x(interfaceC0402u3, null, new M(n11, null, 2), 1);
                }
                n11.l();
                break;
            default:
                this.f6305s.n();
                break;
        }
        return p110k9.y.f19095a;
    }
}
