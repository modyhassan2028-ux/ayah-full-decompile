package Z0;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Choreographer f10888r;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10888r.postFrameCallback(new C2.f(runnable));
    }
}
