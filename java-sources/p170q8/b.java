package p170q8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000a.a;
import p118l7.o;
import p160p8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ExecutorService f21342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f21343s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o f21344t = a.E(null);

    public b(ExecutorService executorService) {
        this.f21342r = executorService;
    }

    public final o a(Runnable runnable) {
        o oVarC;
        synchronized (this.f21343s) {
            oVarC = this.f21344t.c(this.f21342r, new C6.b(25, runnable));
            this.f21344t = oVarC;
        }
        return oVarC;
    }

    public final o b(k kVar) {
        o oVarC;
        synchronized (this.f21343s) {
            oVarC = this.f21344t.c(this.f21342r, new C6.b(24, kVar));
            this.f21344t = oVarC;
        }
        return oVarC;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f21342r.execute(runnable);
    }
}
