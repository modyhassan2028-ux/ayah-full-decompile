package S6;

/* JADX INFO: loaded from: classes.dex */
public final class h extends UnsupportedOperationException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final R6.d f7513r;

    public h(R6.d dVar) {
        this.f7513r = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7513r));
    }
}
