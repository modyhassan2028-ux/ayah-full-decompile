package i7;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: i7.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1014r0 extends C0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AtomicLong f17530B = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Semaphore f17531A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1012q0 f17532t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1012q0 f17533u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final PriorityBlockingQueue f17534v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedBlockingQueue f17535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1006o0 f17536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1006o0 f17537y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f17538z;

    public C1014r0(C1023u0 c1023u0) {
        super(c1023u0);
        this.f17538z = new Object();
        this.f17531A = new Semaphore(2);
        this.f17534v = new PriorityBlockingQueue();
        this.f17535w = new LinkedBlockingQueue();
        this.f17536x = new C1006o0(this, "Thread death: Uncaught exception on worker thread");
        this.f17537y = new C1006o0(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(Runnable runnable) {
        q();
        C1009p0 c1009p0 = new C1009p0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f17538z) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f17535w;
                linkedBlockingQueue.add(c1009p0);
                C1012q0 c1012q0 = this.f17533u;
                if (c1012q0 == null) {
                    C1012q0 c1012q1 = new C1012q0(this, "Measurement Network", linkedBlockingQueue);
                    this.f17533u = c1012q1;
                    c1012q1.setUncaughtExceptionHandler(this.f17537y);
                    this.f17533u.start();
                } else {
                    c1012q0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(C1009p0 c1009p0) {
        synchronized (this.f17538z) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f17534v;
                priorityBlockingQueue.add(c1009p0);
                C1012q0 c1012q0 = this.f17532t;
                if (c1012q0 == null) {
                    C1012q0 c1012q1 = new C1012q0(this, "Measurement Worker", priorityBlockingQueue);
                    this.f17532t = c1012q1;
                    c1012q1.setUncaughtExceptionHandler(this.f17536x);
                    this.f17532t.start();
                } else {
                    c1012q0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p056f2.AbstractC0939l
    public final void o() {
        if (Thread.currentThread() != this.f17532t) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // i7.C0
    public final boolean p() {
        return false;
    }

    public final void s() {
        if (Thread.currentThread() != this.f17533u) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void t() {
        if (Thread.currentThread() == this.f17532t) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean u() {
        return Thread.currentThread() == this.f17532t;
    }

    public final C1009p0 v(Callable callable) {
        q();
        C1009p0 c1009p0 = new C1009p0(this, callable, false);
        if (Thread.currentThread() != this.f17532t) {
            B(c1009p0);
            return c1009p0;
        }
        if (!this.f17534v.isEmpty()) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.a("Callable skipped the worker queue.");
        }
        c1009p0.run();
        return c1009p0;
    }

    public final C1009p0 w(Callable callable) {
        q();
        C1009p0 c1009p0 = new C1009p0(this, callable, true);
        if (Thread.currentThread() == this.f17532t) {
            c1009p0.run();
            return c1009p0;
        }
        B(c1009p0);
        return c1009p0;
    }

    public final void x(Runnable runnable) {
        q();
        U6.y.f(runnable);
        B(new C1009p0(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object y(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C1014r0 c1014r0 = ((C1023u0) this.f16104r).f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                X x9 = ((C1023u0) this.f16104r).f17584w;
                C1023u0.m(x9);
                V v10 = x9.f17185z;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                v10.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            X x10 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x10);
            x10.f17185z.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void z(Runnable runnable) {
        q();
        B(new C1009p0(this, runnable, true, "Task exception on worker thread"));
    }
}
