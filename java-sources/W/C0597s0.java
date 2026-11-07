package W;

import J0.AbstractC0283f;

/* JADX INFO: renamed from: W.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0597s0 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0600t0 f9353s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0597s0(C0600t0 c0600t0, int i10) {
        super(0);
        this.f9352r = i10;
        this.f9353s = c0600t0;
    }

    @Override // p241y9.a
    public final Object invoke() {
        V.e eVar;
        int i10 = this.f9352r;
        C0600t0 c0600t0 = this.f9353s;
        switch (i10) {
            case 0:
                U0 u8 = (U0) AbstractC0283f.i(c0600t0, W0.f8891b);
                return (u8 == null || (eVar = u8.f8849b) == null) ? V0.f8870a : eVar;
            default:
                if (((U0) AbstractC0283f.i(c0600t0, W0.f8891b)) == null) {
                    V.b bVar = c0600t0.f9372L;
                    if (bVar != null) {
                        c0600t0.w0(bVar);
                    }
                } else if (c0600t0.f9372L == null) {
                    int i11 = 0;
                    C0594r0 c0594r0 = new C0594r0(i11, c0600t0);
                    C0597s0 c0597s0 = new C0597s0(c0600t0, i11);
                    B.j jVar = c0600t0.f9368H;
                    boolean z10 = c0600t0.f9369I;
                    float f3 = c0600t0.f9370J;
                    p223x.u0 u0Var = V.h.f8352a;
                    V.b bVar2 = new V.b(jVar, z10, f3, c0594r0, c0597s0);
                    c0600t0.v0(bVar2);
                    c0600t0.f9372L = bVar2;
                }
                return p110k9.y.f19095a;
        }
    }
}
