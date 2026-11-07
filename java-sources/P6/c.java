package P6;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WeakReference f6718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f6719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CountDownLatch f6720t = new CountDownLatch(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6721u = false;

    public c(a aVar, long j) {
        this.f6718r = new WeakReference(aVar);
        this.f6719s = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f6718r;
        try {
            if (this.f6720t.await(this.f6719s, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.f6721u = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f6721u = true;
            }
        }
    }
}
