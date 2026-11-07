package P9;

import K9.AbstractC0399q;
import K9.AbstractC0407z;
import K9.B;
import K9.C0389g;
import K9.J;
import K9.s0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0399q implements B {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6780y = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f6781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC0399q f6782u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6783v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f6784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f6785x;

    /* JADX WARN: Multi-variable type inference failed */
    public h(AbstractC0399q abstractC0399q, int i10) {
        B b5 = abstractC0399q instanceof B ? (B) abstractC0399q : null;
        this.f6781t = b5 == null ? AbstractC0407z.f5419a : b5;
        this.f6782u = abstractC0399q;
        this.f6783v = i10;
        this.f6784w = new k();
        this.f6785x = new Object();
    }

    @Override // K9.B
    public final void H(long j, C0389g c0389g) {
        this.f6781t.H(j, c0389g);
    }

    @Override // K9.B
    public final J N(long j, s0 s0Var, p150o9.h hVar) {
        return this.f6781t.N(j, s0Var, hVar);
    }

    @Override // K9.AbstractC0399q
    public final void c0(p150o9.h hVar, Runnable runnable) {
        Runnable runnableG0;
        this.f6784w.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6780y;
        if (atomicIntegerFieldUpdater.get(this) >= this.f6783v || !h0() || (runnableG0 = g0()) == null) {
            return;
        }
        try {
            b.i(this.f6782u, this, new p039d8.a(6, this, runnableG0, false));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // K9.AbstractC0399q
    public final void d0(p150o9.h hVar, Runnable runnable) {
        Runnable runnableG0;
        this.f6784w.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6780y;
        if (atomicIntegerFieldUpdater.get(this) >= this.f6783v || !h0() || (runnableG0 = g0()) == null) {
            return;
        }
        try {
            this.f6782u.d0(this, new p039d8.a(6, this, runnableG0, false));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    public final Runnable g0() {
        while (true) {
            Runnable runnable = (Runnable) this.f6784w.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f6785x) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6780y;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f6784w.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean h0() {
        synchronized (this.f6785x) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6780y;
            if (atomicIntegerFieldUpdater.get(this) >= this.f6783v) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // K9.AbstractC0399q
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6782u);
        sb.append(".limitedParallelism(");
        return android.support.v4.media.session.p.A(sb, this.f6783v, ')');
    }
}
