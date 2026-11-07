package p160p8;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21138r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f21139s;

    public u(Runnable runnable) {
        this.f21139s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        switch (this.f21138r) {
            case 0:
                ((Runnable) this.f21139s).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) this.f21139s;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", null);
                    }
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", null);
                        }
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", null);
                    }
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }

    public u(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f21139s = executorService;
    }
}
