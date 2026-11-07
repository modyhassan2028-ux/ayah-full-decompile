package P9;

/* JADX INFO: loaded from: classes.dex */
public final class f extends RuntimeException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient p150o9.h f6774r;

    public f(p150o9.h hVar) {
        this.f6774r = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f6774r);
    }
}
