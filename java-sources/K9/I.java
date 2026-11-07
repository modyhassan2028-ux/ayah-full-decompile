package K9;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class I implements J {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ScheduledFuture f5323r;

    public I(ScheduledFuture scheduledFuture) {
        this.f5323r = scheduledFuture;
    }

    @Override // K9.J
    public final void a() {
        this.f5323r.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f5323r + ']';
    }
}
