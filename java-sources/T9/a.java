package T9;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f7971r = new a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
