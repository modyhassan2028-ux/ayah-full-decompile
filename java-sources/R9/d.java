package R9;

import K9.AbstractC0399q;
import K9.T;
import P9.u;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends T implements Executor {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f7436t = new d();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC0399q f7437u;

    static {
        l lVar = l.f7450t;
        int i10 = u.f6806a;
        if (64 >= i10) {
            i10 = 64;
        }
        f7437u = lVar.f0(P9.b.l("kotlinx.coroutines.io.parallelism", i10, 12));
    }

    @Override // K9.AbstractC0399q
    public final void c0(p150o9.h hVar, Runnable runnable) {
        f7437u.c0(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // K9.AbstractC0399q
    public final void d0(p150o9.h hVar, Runnable runnable) {
        f7437u.d0(hVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c0(p150o9.i.f20380r, runnable);
    }

    @Override // K9.AbstractC0399q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
