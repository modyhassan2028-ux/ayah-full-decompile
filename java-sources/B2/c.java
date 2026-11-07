package B2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f591r;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f591r) {
            case 0:
                runnable.run();
                break;
            default:
                q.a.S().f21181i.j.execute(runnable);
                break;
        }
    }
}
