package R9;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f7438u;

    static {
        int i10 = k.f7446c;
        int i11 = k.f7447d;
        long j = k.f7448e;
        String str = k.f7444a;
        e eVar = new e();
        eVar.f7440t = new c(i10, i11, j, str);
        f7438u = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // K9.AbstractC0399q
    public final String toString() {
        return "Dispatchers.Default";
    }
}
