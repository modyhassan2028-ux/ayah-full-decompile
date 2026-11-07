package K9;

/* JADX INFO: loaded from: classes.dex */
public final class D extends Exception {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Throwable f5319r;

    public D(Throwable th, AbstractC0399q abstractC0399q, p150o9.h hVar) {
        super("Coroutine dispatcher " + abstractC0399q + " threw an exception, context = " + hVar, th);
        this.f5319r = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5319r;
    }
}
