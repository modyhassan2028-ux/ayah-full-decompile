package D0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends CancellationException {
    public p(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(u.f1131c);
        return this;
    }
}
