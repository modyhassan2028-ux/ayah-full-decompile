package Ga;

import H0.InterfaceC0219s;
import H0.a0;
import Z.X;

/* JADX INFO: renamed from: Ga.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0200i extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f3038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f3039t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0200i(X x9, X x10, int i10) {
        super(1);
        this.f3037r = i10;
        this.f3038s = x9;
        this.f3039t = x10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f3037r) {
            case 0:
                InterfaceC0219s interfaceC0219s = (InterfaceC0219s) obj;
                p251z9.j.e(interfaceC0219s, "it");
                this.f3038s.setValue(new p171r0.c(interfaceC0219s.G(0L)));
                this.f3039t.setValue(new p063g1.l(interfaceC0219s.F()));
                break;
            default:
                InterfaceC0219s interfaceC0219s2 = (InterfaceC0219s) obj;
                InterfaceC0219s interfaceC0219sP = interfaceC0219s2.p();
                this.f3038s.setValue(new p063g1.j(interfaceC0219sP != null ? B9.a.y(interfaceC0219sP.F()) : 0L));
                this.f3039t.setValue(new p171r0.c(a0.b(interfaceC0219s2).b()));
                break;
        }
        return p110k9.y.f19095a;
    }
}
