package K9;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: K9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0406y extends Q implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final RunnableC0406y f5416A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final long f5417B;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l10;
        RunnableC0406y runnableC0406y = new RunnableC0406y();
        f5416A = runnableC0406y;
        runnableC0406y.j0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f5417B = timeUnit.toNanos(l10.longValue());
    }

    @Override // K9.Q, K9.B
    public final J N(long j, s0 s0Var, p150o9.h hVar) {
        long j10 = 0;
        if (j > 0) {
            j10 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j10 >= 4611686018427387903L) {
            return l0.f5378r;
        }
        long jNanoTime = System.nanoTime();
        N n6 = new N(j10 + jNanoTime, s0Var);
        r0(jNanoTime, n6);
        return n6;
    }

    @Override // K9.S
    public final Thread i0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f5416A.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // K9.S
    public final void m0(long j, O o10) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // K9.Q
    public final void n0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n0(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        q0.f5390a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    _thread = null;
                    s0();
                    if (q0()) {
                        return;
                    }
                    i0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jK0 = k0();
                    if (jK0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f5417B + jNanoTime;
                        }
                        long j10 = j - jNanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            s0();
                            if (q0()) {
                                return;
                            }
                            i0();
                            return;
                        }
                        if (jK0 > j10) {
                            jK0 = j10;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jK0 > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            s0();
                            if (q0()) {
                                return;
                            }
                            i0();
                            return;
                        }
                        LockSupport.parkNanos(this, jK0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            s0();
            if (!q0()) {
                i0();
            }
            throw th;
        }
    }

    public final synchronized void s0() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            Q.f5333x.set(this, null);
            Q.f5334y.set(this, null);
            notifyAll();
        }
    }

    @Override // K9.Q, K9.S
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // K9.AbstractC0399q
    public final String toString() {
        return "DefaultExecutor";
    }
}
