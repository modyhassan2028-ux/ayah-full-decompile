package K9;

/* JADX INFO: renamed from: K9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0393k extends d0 implements InterfaceC0392j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h0 f5376v;

    public C0393k(h0 h0Var) {
        this.f5376v = h0Var;
    }

    @Override // K9.InterfaceC0392j
    public final boolean c(Throwable th) {
        return j().v(th);
    }

    @Override // K9.d0
    public final boolean k() {
        return true;
    }

    @Override // K9.d0
    public final void l(Throwable th) {
        this.f5376v.q(j());
    }
}
