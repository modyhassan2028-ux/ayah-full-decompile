package p160p8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f21141b;

    public v() {
        this.f21140a = 1;
        this.f21141b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f21140a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new u(runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f21141b).getAndIncrement());
                return threadNewThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f21141b).getAndIncrement());
                return thread;
        }
    }

    public v(AtomicLong atomicLong) {
        this.f21140a = 0;
        this.f21141b = atomicLong;
    }
}
