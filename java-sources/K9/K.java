package K9;

/* JADX INFO: loaded from: classes.dex */
public final class K extends d0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5324v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f5325w;

    public /* synthetic */ K(int i10, Object obj) {
        this.f5324v = i10;
        this.f5325w = obj;
    }

    @Override // K9.d0
    public final boolean k() {
        switch (this.f5324v) {
        }
        return false;
    }

    @Override // K9.d0
    public final void l(Throwable th) {
        switch (this.f5324v) {
            case 0:
                ((J) this.f5325w).a();
                break;
            case 1:
                ((p241y9.c) this.f5325w).e(th);
                break;
            default:
                e0 e0Var = (e0) this.f5325w;
                Object obj = h0.f5371r.get(j());
                if (!(obj instanceof C0397o)) {
                    e0Var.resumeWith(AbstractC0405x.G(obj));
                } else {
                    e0Var.resumeWith(p110k9.a.b(((C0397o) obj).f5385a));
                }
                break;
        }
    }
}
