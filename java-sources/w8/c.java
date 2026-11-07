package w8;

import B6.f;
import E6.u;
import F2.x;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p085i0.n;
import p118l7.i;
import p160p8.z;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f23801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f23806f;
    public final ThreadPoolExecutor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f23807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f23808i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f23809k;

    public c(u uVar, x8.b bVar, n nVar) {
        double d5 = bVar.f24394d;
        double d9 = bVar.f24395e;
        long j = ((long) bVar.f24396f) * 1000;
        this.f23801a = d5;
        this.f23802b = d9;
        this.f23803c = j;
        this.f23807h = uVar;
        this.f23808i = nVar;
        this.f23804d = SystemClock.elapsedRealtime();
        int i10 = (int) d5;
        this.f23805e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f23806f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f23809k = 0L;
    }

    public final int a() {
        if (this.f23809k == 0) {
            this.f23809k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f23809k) / this.f23803c);
        int iMin = this.f23806f.size() == this.f23805e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.f23809k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final p160p8.b bVar, final i iVar) {
        String str = "Sending report through Google DataTransport: " + bVar.f21057b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z10 = SystemClock.elapsedRealtime() - this.f23804d < 2000;
        this.f23807h.x(new B6.a(bVar.f21056a, B6.c.f646t), new f() { // from class: w8.b
            @Override // B6.f
            public final void b(Exception exc) throws Throwable {
                i iVar2 = iVar;
                if (exc != null) {
                    iVar2.a(exc);
                    return;
                }
                if (z10) {
                    boolean z11 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new x(16, this.f23797r, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = z.f21155a;
                    boolean z12 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    z12 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z11) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = z12;
                    }
                }
                iVar2.b(bVar);
            }
        });
    }
}
