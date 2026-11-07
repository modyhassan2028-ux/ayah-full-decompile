package P9;

import K9.m0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends c implements m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6801d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6802c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j, r rVar, int i10) {
        super(rVar);
        this.f6802c = j;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // P9.c
    public final boolean c() {
        return f6801d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f6801d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i10, p150o9.h hVar);

    public final void h() {
        if (f6801d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f6801d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
