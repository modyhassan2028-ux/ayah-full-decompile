package K9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends d0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5344w = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final E5.c f5345v;

    public Z(E5.c cVar) {
        this.f5345v = cVar;
    }

    @Override // K9.d0
    public final boolean k() {
        return true;
    }

    @Override // K9.d0
    public final void l(Throwable th) {
        if (f5344w.compareAndSet(this, 0, 1)) {
            this.f5345v.e(th);
        }
    }
}
