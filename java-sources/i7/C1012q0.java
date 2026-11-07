package i7;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: i7.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1012q0 extends Thread {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f17514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BlockingQueue f17515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17516t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1014r0 f17517u;

    public C1012q0(C1014r0 c1014r0, String str, BlockingQueue blockingQueue) {
        this.f17517u = c1014r0;
        U6.y.f(blockingQueue);
        this.f17514r = new Object();
        this.f17515s = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f17514r;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        C1014r0 c1014r0 = this.f17517u;
        synchronized (c1014r0.f17538z) {
            try {
                if (!this.f17516t) {
                    c1014r0.f17531A.release();
                    c1014r0.f17538z.notifyAll();
                    if (this == c1014r0.f17532t) {
                        c1014r0.f17532t = null;
                    } else if (this == c1014r0.f17533u) {
                        c1014r0.f17533u = null;
                    } else {
                        X x9 = ((C1023u0) c1014r0.f16104r).f17584w;
                        C1023u0.m(x9);
                        x9.f17182w.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f17516t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f17517u.f17531A.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                X x9 = ((C1023u0) this.f17517u.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17185z.b(e10, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f17515s;
                C1009p0 c1009p0 = (C1009p0) blockingQueue.poll();
                if (c1009p0 != null) {
                    Process.setThreadPriority(true != c1009p0.f17503s ? 10 : threadPriority);
                    c1009p0.run();
                } else {
                    Object obj = this.f17514r;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f17517u.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                X x10 = ((C1023u0) this.f17517u.f16104r).f17584w;
                                C1023u0.m(x10);
                                x10.f17185z.b(e11, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f17517u.f17538z) {
                        if (this.f17515s.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
