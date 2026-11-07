package K9;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends P9.q {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ThreadLocal f5406v;

    /* JADX WARN: Illegal instructions before constructor call */
    public v0(p150o9.c cVar, p150o9.h hVar) {
        w0 w0Var = w0.f5407r;
        super(cVar, hVar.i(w0Var) == null ? hVar.L(w0Var) : hVar);
        this.f5406v = new ThreadLocal();
        if (cVar.getContext().i(p150o9.d.f20379r) instanceof AbstractC0399q) {
            return;
        }
        Object objN = P9.b.n(hVar, null);
        P9.b.g(hVar, objN);
        m0(hVar, objN);
    }

    @Override // P9.q
    public final void j0() {
        l0();
    }

    public final boolean k0() {
        boolean z10 = this.threadLocalIsSet && this.f5406v.get() == null;
        this.f5406v.remove();
        return !z10;
    }

    public final void l0() {
        if (this.threadLocalIsSet) {
            p110k9.j jVar = (p110k9.j) this.f5406v.get();
            if (jVar != null) {
                P9.b.g((p150o9.h) jVar.f19077r, jVar.f19078s);
            }
            this.f5406v.remove();
        }
    }

    public final void m0(p150o9.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f5406v.set(new p110k9.j(hVar, obj));
    }

    @Override // P9.q, K9.h0
    public final void o(Object obj) {
        l0();
        Object objA = AbstractC0405x.A(obj);
        p150o9.c cVar = this.f6800u;
        p150o9.h context = cVar.getContext();
        Object objN = P9.b.n(context, null);
        v0 v0VarH = objN != P9.b.f6767d ? AbstractC0405x.H(cVar, context, objN) : null;
        try {
            cVar.resumeWith(objA);
        } finally {
            if (v0VarH == null || v0VarH.k0()) {
                P9.b.g(context, objN);
            }
        }
    }
}
