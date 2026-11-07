package F2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayDeque f2338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Runnable f2339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f2340v;

    public y(Executor executor) {
        this.f2336r = 0;
        p251z9.j.e(executor, "executor");
        this.f2340v = executor;
        this.f2338t = new ArrayDeque();
        this.f2337s = new Object();
    }

    private final void a(Runnable runnable) {
        p251z9.j.e(runnable, "command");
        synchronized (this.f2337s) {
            this.f2338t.offer(new x(0, runnable, this));
            if (this.f2339u == null) {
                b();
            }
        }
    }

    private final void c() {
        synchronized (this.f2337s) {
            Object objPoll = this.f2338t.poll();
            Runnable runnable = (Runnable) objPoll;
            this.f2339u = runnable;
            if (objPoll != null) {
                this.f2340v.execute(runnable);
            }
        }
    }

    public final void b() {
        switch (this.f2336r) {
            case 0:
                c();
                return;
            default:
                synchronized (this.f2337s) {
                    try {
                        Runnable runnable = (Runnable) this.f2338t.poll();
                        this.f2339u = runnable;
                        if (runnable != null) {
                            ((p070g8.c) this.f2340v).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2336r) {
            case 0:
                a(runnable);
                return;
            default:
                synchronized (this.f2337s) {
                    try {
                        this.f2338t.add(new x(this, runnable, 5));
                        if (this.f2339u == null) {
                            b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public y(p070g8.c cVar) {
        this.f2336r = 1;
        this.f2337s = new Object();
        this.f2338t = new ArrayDeque();
        this.f2340v = cVar;
    }
}
