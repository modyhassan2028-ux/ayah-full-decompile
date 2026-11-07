package E1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f1423s;

    public /* synthetic */ c(Handler handler, int i10) {
        this.f1422r = i10;
        this.f1423s = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1422r) {
            case 0:
                runnable.getClass();
                Handler handler = this.f1423s;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                this.f1423s.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler2 = this.f1423s;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }

    public c() {
        this.f1422r = 1;
        this.f1423s = new Handler(Looper.getMainLooper());
    }
}
