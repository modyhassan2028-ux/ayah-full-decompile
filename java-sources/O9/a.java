package O9;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient Object f6512r;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f6512r = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
