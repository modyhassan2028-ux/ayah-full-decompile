package S2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends RuntimeException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f7475r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Throwable f7476s;

    public d(e eVar, Throwable th) {
        super(th);
        this.f7475r = eVar;
        this.f7476s = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f7476s;
    }
}
