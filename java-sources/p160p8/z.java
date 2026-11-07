package p160p8;

import C6.b;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p118l7.l;
import p118l7.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f21155a;

    static {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new v(new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new u(executorServiceUnconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f21155a = executorServiceUnconfigurableExecutorService;
    }

    public static void a(o oVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        oVar.f19422b.f(new l(f21155a, new b(23, countDownLatch), new o(), 0));
        oVar.n();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (oVar.g()) {
            oVar.e();
        } else {
            if (oVar.f19424d) {
                throw new CancellationException("Task is already canceled");
            }
            if (!oVar.f()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(oVar.d());
        }
    }
}
