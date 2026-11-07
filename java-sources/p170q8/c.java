package p170q8;

import H9.o;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import p000a.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f21347c;

    public c(ExecutorService executorService, ExecutorService executorService2) {
        j.e(executorService, "backgroundExecutorService");
        j.e(executorService2, "blockingExecutorService");
        this.f21345a = new b(executorService);
        this.f21346b = new b(executorService);
        a.E(null);
        this.f21347c = new b(executorService2);
    }

    public static final void a() {
        String name = Thread.currentThread().getName();
        j.d(name, "<get-threadName>(...)");
        if (o.V0(name, "Firebase Background Thread #")) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        String name = Thread.currentThread().getName();
        j.d(name, "<get-threadName>(...)");
        if (o.V0(name, "Firebase Blocking Thread #")) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
