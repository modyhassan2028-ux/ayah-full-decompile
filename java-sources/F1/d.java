package F1;

import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import io.realm.internal.async.RealmThreadPoolExecutor;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ LocaleList a(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan b(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ void c(RealmThreadPoolExecutor realmThreadPoolExecutor) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || realmThreadPoolExecutor != ForkJoinPool.commonPool()) && !(zIsTerminated = realmThreadPoolExecutor.isTerminated())) {
            realmThreadPoolExecutor.shutdown();
            boolean z10 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = realmThreadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        realmThreadPoolExecutor.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void d(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z10 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        executorService.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void e(p109k8.f fVar) {
        if ((Build.VERSION.SDK_INT <= 23 || fVar != ForkJoinPool.commonPool()) && !fVar.f19054r.isTerminated()) {
            fVar.shutdown();
            throw null;
        }
    }
}
