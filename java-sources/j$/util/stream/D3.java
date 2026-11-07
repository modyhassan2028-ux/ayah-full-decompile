package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class D3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f18244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f18245b;

    public D3(Runnable runnable, Runnable runnable2) {
        this.f18244a = runnable;
        this.f18245b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18244a.run();
            this.f18245b.run();
        } catch (Throwable th) {
            try {
                this.f18245b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
