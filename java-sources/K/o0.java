package K;

import A.T0;
import Z.C0672b;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T0 f4736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z.C f4737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z.C f4738c;

    public o0(T0 t2, r0 r0Var) {
        this.f4736a = t2;
        this.f4737b = C0672b.o(new n0(r0Var, 1));
        this.f4738c = C0672b.o(new n0(r0Var, 0));
    }

    @Override // A.T0
    public final Object a(p232y.T t2, p241y9.e eVar, q9.c cVar) {
        return this.f4736a.a(t2, eVar, cVar);
    }

    @Override // A.T0
    public final boolean b() {
        return ((Boolean) this.f4738c.getValue()).booleanValue();
    }

    @Override // A.T0
    public final boolean c() {
        return this.f4736a.c();
    }

    @Override // A.T0
    public final boolean d() {
        return ((Boolean) this.f4737b.getValue()).booleanValue();
    }

    @Override // A.T0
    public final float e(float f3) {
        return this.f4736a.e(f3);
    }
}
