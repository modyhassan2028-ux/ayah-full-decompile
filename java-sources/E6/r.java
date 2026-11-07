package E6;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f1953s;

    public /* synthetic */ r(Runnable runnable, int i10) {
        this.f1952r = i10;
        this.f1953s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1952r) {
            case 0:
                try {
                    this.f1953s.run();
                } catch (Exception e10) {
                    Y2.a.w("Executor", "Background execution failure.", e10);
                    return;
                }
                break;
            default:
                this.f1953s.run();
                break;
        }
    }

    public String toString() {
        switch (this.f1952r) {
            case 1:
                return this.f1953s.toString();
            default:
                return super.toString();
        }
    }
}
