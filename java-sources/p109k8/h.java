package p109k8;

import Z0.B;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p112l1.a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p112l1.h implements ScheduledFuture {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ScheduledFuture f19056y;

    public h(g gVar) {
        this.f19056y = gVar.a(new B(16, this));
    }

    @Override // p112l1.h
    public final void c() {
        ScheduledFuture scheduledFuture = this.f19056y;
        Object obj = this.f19371r;
        scheduledFuture.cancel((obj instanceof a) && ((a) obj).f19353a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f19056y.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f19056y.getDelay(timeUnit);
    }
}
