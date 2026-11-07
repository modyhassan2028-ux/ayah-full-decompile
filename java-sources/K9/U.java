package K9;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class U extends T implements B {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Executor f5340t;

    public U(Executor executor) {
        Method method;
        this.f5340t = executor;
        Method method2 = P9.a.f6763a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = P9.a.f6763a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // K9.B
    public final void H(long j, C0389g c0389g) {
        Executor executor = this.f5340t;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            p039d8.a aVar = new p039d8.a(5, this, c0389g);
            p150o9.h hVar = c0389g.f5365v;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(aVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a0 a0Var = (a0) hVar.i(r.f5392s);
                if (a0Var != null) {
                    a0Var.e(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0389g.v(new C0387e(0, scheduledFutureSchedule));
        } else {
            RunnableC0406y.f5416A.H(j, c0389g);
        }
    }

    @Override // K9.B
    public final J N(long j, s0 s0Var, p150o9.h hVar) {
        Executor executor = this.f5340t;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(s0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a0 a0Var = (a0) hVar.i(r.f5392s);
                if (a0Var != null) {
                    a0Var.e(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new I(scheduledFutureSchedule) : RunnableC0406y.f5416A.N(j, s0Var, hVar);
    }

    @Override // K9.AbstractC0399q
    public final void c0(p150o9.h hVar, Runnable runnable) {
        try {
            this.f5340t.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            a0 a0Var = (a0) hVar.i(r.f5392s);
            if (a0Var != null) {
                a0Var.e(cancellationException);
            }
            R9.e eVar = H.f5322a;
            R9.d.f7436t.c0(hVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f5340t;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof U) && ((U) obj).f5340t == this.f5340t;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5340t);
    }

    @Override // K9.AbstractC0399q
    public final String toString() {
        return this.f5340t.toString();
    }
}
