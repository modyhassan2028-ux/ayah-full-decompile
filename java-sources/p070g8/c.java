package p070g8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ c f16333s = new c(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16334r;

    public /* synthetic */ c(int i10) {
        this.f16334r = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16334r) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
