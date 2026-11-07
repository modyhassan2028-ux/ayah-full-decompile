package F1;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Thread {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2181r;

    public m(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f2181r = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2181r);
        super.run();
    }
}
