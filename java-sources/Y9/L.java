package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class L implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10468a = p110k9.a.c(p110k9.h.f19074r, new Ba.b(this));

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        p251z9.j.e(obj, "value");
        nVar.a(d()).t(d());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        W9.f fVarD = d();
        X9.a aVarD = bVar.d(fVarD);
        int iH = aVarD.h(d());
        if (iH != -1) {
            throw new U9.d(p123m2.c.r(iH, "Unexpected index "));
        }
        aVarD.t(fVarD);
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k9.g] */
    @Override // U9.a
    public final W9.f d() {
        return (W9.f) this.f10468a.getValue();
    }
}
