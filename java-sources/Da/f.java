package Da;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements x {
    @Override // Da.x
    public final void Z(long j, h hVar) throws EOFException {
        hVar.skip(j);
    }

    @Override // Da.x
    public final A d() {
        return A.f1341d;
    }

    @Override // Da.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // Da.x, java.io.Flushable
    public final void flush() {
    }
}
