package M;

import J0.AbstractC0283f;
import K.W;
import K0.C0363p0;
import K0.X0;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f5600s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i10) {
        super(0);
        this.f5599r = i10;
        this.f5600s = gVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f5599r) {
            case 0:
                AbstractC0283f.u(this.f5600s);
                return y.f19095a;
            case 1:
                this.f5600s.f5608M.d();
                return Boolean.TRUE;
            case 2:
                this.f5600s.f5608M.m();
                return Boolean.TRUE;
            case 3:
                g gVar = this.f5600s;
                gVar.f5605J.f4573w.e(new Z0.j(gVar.f5609N.f10933e));
                return Boolean.TRUE;
            case 4:
                g gVar2 = this.f5600s;
                W w9 = gVar2.f5605J;
                p162q0.p pVar = gVar2.f5610O;
                if (w9.b()) {
                    X0 x9 = w9.f4555c;
                    if (x9 != null) {
                        ((C0363p0) x9).b();
                    }
                } else {
                    p162q0.p.b(pVar);
                }
                return Boolean.TRUE;
            case 5:
                this.f5600s.f5608M.f(true);
                return Boolean.TRUE;
            case 6:
                this.f5600s.f5608M.b(true);
                return Boolean.TRUE;
            default:
                AbstractC0283f.u(this.f5600s);
                return y.f19095a;
        }
    }
}
