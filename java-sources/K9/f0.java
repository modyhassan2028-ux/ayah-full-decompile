package K9;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h0 f5357v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g0 f5358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0393k f5359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f5360y;

    public f0(h0 h0Var, g0 g0Var, C0393k c0393k, Object obj) {
        this.f5357v = h0Var;
        this.f5358w = g0Var;
        this.f5359x = c0393k;
        this.f5360y = obj;
    }

    @Override // K9.d0
    public final boolean k() {
        return false;
    }

    @Override // K9.d0
    public final void l(Throwable th) {
        C0393k c0393k = this.f5359x;
        C0393k c0393kT = h0.T(c0393k);
        h0 h0Var = this.f5357v;
        g0 g0Var = this.f5358w;
        Object obj = this.f5360y;
        if (c0393kT == null || !h0Var.f0(g0Var, c0393kT, obj)) {
            g0Var.f5369r.e(new P9.i(2), 2);
            C0393k c0393kT2 = h0.T(c0393k);
            if (c0393kT2 == null || !h0Var.f0(g0Var, c0393kT2, obj)) {
                h0Var.m(h0Var.z(g0Var, obj));
            }
        }
    }
}
