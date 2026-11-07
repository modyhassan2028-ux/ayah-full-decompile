package J0;

import D.C0081y;

/* JADX INFO: renamed from: J0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0275b extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0277c f4051s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0275b(C0277c c0277c, int i10) {
        super(0);
        this.f4050r = i10;
        this.f4051s = c0277c;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f4050r) {
            case 0:
                this.f4051s.x0();
                break;
            default:
                C0277c c0277c = this.f4051s;
                l0.p pVar = c0277c.f4052F;
                p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                D.F f3 = (D.F) pVar;
                f3.getClass();
                D.d0 d0Var = (D.d0) c0277c.Z(D.h0.f976a);
                D.d0 d0Var2 = f3.f881a;
                f3.f882b.setValue(new C0081y(d0Var2, d0Var));
                f3.f883c.setValue(new D.Z(d0Var, d0Var2));
                break;
        }
        return p110k9.y.f19095a;
    }
}
