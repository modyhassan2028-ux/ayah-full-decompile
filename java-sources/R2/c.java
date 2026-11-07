package R2;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface c extends Closeable {
    a U();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
