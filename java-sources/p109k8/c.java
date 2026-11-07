package p109k8;

import Z0.B;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f19042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Runnable f19043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f19044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f19045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f19046w;

    public /* synthetic */ c(f fVar, Runnable runnable, long j, long j10, TimeUnit timeUnit, int i10) {
        this.f19041r = i10;
        this.f19042s = fVar;
        this.f19043t = runnable;
        this.f19044u = j;
        this.f19045v = j10;
        this.f19046w = timeUnit;
    }

    @Override // p109k8.g
    public final ScheduledFuture a(B b5) {
        switch (this.f19041r) {
            case 0:
                f fVar = this.f19042s;
                return fVar.f19055s.scheduleAtFixedRate(new d(fVar, this.f19043t, b5, 0), this.f19044u, this.f19045v, this.f19046w);
            default:
                f fVar2 = this.f19042s;
                return fVar2.f19055s.scheduleWithFixedDelay(new d(fVar2, this.f19043t, b5, 2), this.f19044u, this.f19045v, this.f19046w);
        }
    }
}
