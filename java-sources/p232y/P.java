package p232y;

import H0.InterfaceC0219s;
import p110k9.y;
import p171r0.c;
import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class P extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q f24441s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(Q q10, int i10) {
        super(0);
        this.f24440r = i10;
        this.f24441s = q10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f24440r) {
            case 0:
                InterfaceC0219s interfaceC0219s = (InterfaceC0219s) this.f24441s.f24448L.getValue();
                return new c(interfaceC0219s != null ? interfaceC0219s.G(0L) : 9205357640488583168L);
            case 1:
                return new c(this.f24441s.f24450N);
            default:
                this.f24441s.x0();
                return y.f19095a;
        }
    }
}
