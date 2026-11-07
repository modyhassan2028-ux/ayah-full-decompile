package p223x;

import Z.L0;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements L0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0 f24023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f24024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f24025t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k0 f24026u;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(k0 k0Var, n0 n0Var, c cVar, c cVar2) {
        this.f24026u = k0Var;
        this.f24023r = n0Var;
        this.f24024s = cVar;
        this.f24025t = (k) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r1v5, types: [y9.c, z9.k] */
    public final void b(l0 l0Var) {
        Object objE = this.f24025t.e(l0Var.c());
        boolean zG = this.f24026u.f24035c.g();
        n0 n0Var = this.f24023r;
        if (zG) {
            n0Var.f(this.f24025t.e(l0Var.a()), objE, (InterfaceC1435y) this.f24024s.e(l0Var));
        } else {
            n0Var.g(objE, (InterfaceC1435y) this.f24024s.e(l0Var));
        }
    }

    @Override // Z.L0
    public final Object getValue() {
        b(this.f24026u.f24035c.f());
        return this.f24023r.f24044A.getValue();
    }
}
