package p109k8;

import F2.x;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f19033e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f19034a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f19037d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f19035b = str;
        this.f19036c = i10;
        this.f19037d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f19033e.newThread(new x(this, runnable, 8));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f19035b + " Thread #" + this.f19034a.getAndIncrement());
        return threadNewThread;
    }
}
