package i7;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: i7.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1013q1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f17519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1018s1 f17520t;

    public /* synthetic */ RunnableC1013q1(ServiceConnectionC1018s1 serviceConnectionC1018s1, J j, int i10) {
        this.f17518r = i10;
        this.f17519s = j;
        this.f17520t = serviceConnectionC1018s1;
    }

    private final void a() {
        ServiceConnectionC1018s1 serviceConnectionC1018s1 = this.f17520t;
        synchronized (serviceConnectionC1018s1) {
            try {
                serviceConnectionC1018s1.f17545a = false;
                C1021t1 c1021t1 = serviceConnectionC1018s1.f17547c;
                if (!c1021t1.F()) {
                    X x9 = ((C1023u0) c1021t1.f16104r).f17584w;
                    C1023u0.m(x9);
                    x9.f17178E.a("Connected to service");
                    J j = this.f17519s;
                    c1021t1.o();
                    c1021t1.f17552u = j;
                    c1021t1.B();
                    c1021t1.D();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17518r) {
            case 0:
                a();
                return;
            default:
                ServiceConnectionC1018s1 serviceConnectionC1018s1 = this.f17520t;
                synchronized (serviceConnectionC1018s1) {
                    try {
                        serviceConnectionC1018s1.f17545a = false;
                        C1021t1 c1021t1 = serviceConnectionC1018s1.f17547c;
                        if (!c1021t1.F()) {
                            X x9 = ((C1023u0) c1021t1.f16104r).f17584w;
                            C1023u0.m(x9);
                            x9.f17177D.a("Connected to remote service");
                            J j = this.f17519s;
                            c1021t1.o();
                            c1021t1.f17552u = j;
                            c1021t1.B();
                            c1021t1.D();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                C1021t1 c1021t2 = this.f17520t.f17547c;
                ScheduledExecutorService scheduledExecutorService = c1021t2.f17555x;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    c1021t2.f17555x = null;
                    return;
                }
                return;
        }
    }
}
