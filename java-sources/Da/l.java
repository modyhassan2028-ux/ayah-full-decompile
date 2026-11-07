package Da;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f1367r;

    public l(y yVar) {
        p251z9.j.e(yVar, "delegate");
        this.f1367r = yVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1367r.close();
    }

    @Override // Da.y
    public final A d() {
        return this.f1367r.d();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f1367r + ')';
    }
}
