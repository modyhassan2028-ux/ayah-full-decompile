package p109k8;

import E6.r;
import U6.y;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p039d8.a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f19057w = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Executor f19058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayDeque f19059s = new ArrayDeque();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19060t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f19061u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f19062v = new a(this);

    public i(Executor executor) {
        y.f(executor);
        this.f19058r = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.f(runnable);
        synchronized (this.f19059s) {
            int i10 = this.f19060t;
            if (i10 != 4 && i10 != 3) {
                long j = this.f19061u;
                r rVar = new r(runnable, 1);
                this.f19059s.add(rVar);
                this.f19060t = 2;
                try {
                    this.f19058r.execute(this.f19062v);
                    if (this.f19060t != 2) {
                        return;
                    }
                    synchronized (this.f19059s) {
                        try {
                            if (this.f19061u == j && this.f19060t == 2) {
                                this.f19060t = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f19059s) {
                        try {
                            int i11 = this.f19060t;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f19059s.removeLastOccurrence(rVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f19059s.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f19058r + "}";
    }
}
