package Da;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface x extends Closeable, Flushable {
    void Z(long j, h hVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    A d();

    void flush();
}
