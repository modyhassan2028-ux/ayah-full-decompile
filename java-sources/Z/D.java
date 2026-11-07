package Z;

/* JADX INFO: loaded from: classes.dex */
public final class D implements t0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p241y9.c f10592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E f10593s;

    public D(p241y9.c cVar) {
        this.f10592r = cVar;
    }

    @Override // Z.t0
    public final void b() {
        this.f10593s = (E) this.f10592r.e(C0672b.f10651b);
    }

    @Override // Z.t0
    public final void d() {
        E e10 = this.f10593s;
        if (e10 != null) {
            e10.a();
        }
        this.f10593s = null;
    }

    @Override // Z.t0
    public final void c() {
    }
}
