package p223x;

import Z.C0672b;
import Z.C0681f0;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f24033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0681f0 f24034b = C0672b.r(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f24035c;

    public k0(q0 q0Var, v0 v0Var, String str) {
        this.f24035c = q0Var;
        this.f24033a = v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j0 a(c cVar, c cVar2) {
        C0681f0 c0681f0 = this.f24034b;
        j0 j0Var = (j0) c0681f0.getValue();
        q0 q0Var = this.f24035c;
        if (j0Var == null) {
            Object objE = cVar2.e(q0Var.f24065a.i());
            Object objE2 = cVar2.e(q0Var.f24065a.i());
            v0 v0Var = this.f24033a;
            AbstractC1427p abstractC1427p = (AbstractC1427p) v0Var.f24111a.e(objE2);
            abstractC1427p.d();
            n0 n0Var = new n0(q0Var, objE, abstractC1427p, v0Var);
            j0Var = new j0(this, n0Var, cVar, cVar2);
            c0681f0.setValue(j0Var);
            q0Var.f24072i.add(n0Var);
        }
        j0Var.f24025t = (k) cVar2;
        j0Var.f24024s = cVar;
        j0Var.b(q0Var.f());
        return j0Var;
    }
}
