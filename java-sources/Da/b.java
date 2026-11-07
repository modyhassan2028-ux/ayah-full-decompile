package Da;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1346r = 0;

    public /* synthetic */ b(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f1346r) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                r rVar = e.f1353h;
                ReentrantLock reentrantLock = e.j;
                reentrantLock.lock();
                try {
                    e eVarM = H8.e.m();
                    if (eVarM == e.f1354i) {
                        e.f1354i = null;
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (eVarM != null) {
                            eVarM.j();
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ b(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
