package K9;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: K9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0385c extends AbstractC0383a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Thread f5349u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final S f5350v;

    public C0385c(p150o9.h hVar, Thread thread, S s10) {
        super(hVar, true);
        this.f5349u = thread;
        this.f5350v = s10;
    }

    @Override // K9.h0
    public final void m(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f5349u;
        if (p251z9.j.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
