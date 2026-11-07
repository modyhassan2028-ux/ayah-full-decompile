package K9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q extends S implements B {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5333x = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5334y = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5335z = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // K9.B
    public final void H(long j, C0389g c0389g) {
        long j10 = 0;
        if (j > 0) {
            j10 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j10 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            M m10 = new M(this, j10 + jNanoTime, c0389g);
            r0(jNanoTime, m10);
            c0389g.v(new C0387e(2, m10));
        }
    }

    @Override // K9.B
    public J N(long j, s0 s0Var, p150o9.h hVar) {
        return AbstractC0407z.f5419a.N(j, s0Var, hVar);
    }

    @Override // K9.AbstractC0399q
    public final void c0(p150o9.h hVar, Runnable runnable) {
        n0(runnable);
    }

    @Override // K9.S
    public final long k0() {
        Runnable runnable;
        O o10;
        P9.t tVar = AbstractC0405x.f5410c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5333x;
        if (!l0()) {
            o0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof P9.m) {
                        P9.m mVar = (P9.m) obj;
                        Object objD = mVar.d();
                        if (objD != P9.m.g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        P9.m mVarC = mVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != tVar) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            p120l9.k kVar = this.f5339v;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof P9.m) {
                        long j = P9.m.f6793f.get((P9.m) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == tVar) {
                        return Long.MAX_VALUE;
                    }
                }
                P p10 = (P) f5334y.get(this);
                if (p10 != null) {
                    synchronized (p10) {
                        O[] oArr = p10.f6812a;
                        o10 = oArr != null ? oArr[0] : null;
                    }
                    if (o10 != null) {
                        long jNanoTime = o10.f5330r - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void n0(Runnable runnable) {
        o0();
        if (!p0(runnable)) {
            RunnableC0406y.f5416A.n0(runnable);
            return;
        }
        Thread threadI0 = i0();
        if (Thread.currentThread() != threadI0) {
            LockSupport.unpark(threadI0);
        }
    }

    public final void o0() {
        O oC;
        P p10 = (P) f5334y.get(this);
        if (p10 == null || P9.x.f6811b.get(p10) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (p10) {
                try {
                    O[] oArr = p10.f6812a;
                    oC = null;
                    O o10 = oArr != null ? oArr[0] : null;
                    if (o10 != null) {
                        oC = ((jNanoTime - o10.f5330r) > 0L ? 1 : ((jNanoTime - o10.f5330r) == 0L ? 0 : -1)) >= 0 ? p0(o10) : false ? p10.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (oC != null);
    }

    public final boolean p0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5333x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f5335z.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof P9.m)) {
                if (obj == AbstractC0405x.f5410c) {
                    return false;
                }
                P9.m mVar = new P9.m(8, true);
                mVar.a((Runnable) obj);
                mVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            P9.m mVar2 = (P9.m) obj;
            int iA = mVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                P9.m mVarC = mVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean q0() {
        Object obj;
        long j;
        p120l9.k kVar = this.f5339v;
        if (kVar != null ? kVar.isEmpty() : true) {
            P p10 = (P) f5334y.get(this);
            if (p10 == null) {
                obj = f5333x.get(this);
                if (obj != null) {
                    if (obj instanceof P9.m) {
                        j = P9.m.f6793f.get((P9.m) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC0405x.f5410c) {
                    }
                }
                return true;
            }
            if (P9.x.f6811b.get(p10) == 0) {
                obj = f5333x.get(this);
                if (obj != null) {
                    if (obj instanceof P9.m) {
                        j = P9.m.f6793f.get((P9.m) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC0405x.f5410c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void r0(long j, O o10) {
        int iD;
        Thread threadI0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5334y;
        O o11 = null;
        if (f5335z.get(this) == 1) {
            iD = 1;
        } else {
            P p10 = (P) atomicReferenceFieldUpdater.get(this);
            if (p10 == null) {
                P p11 = new P();
                p11.f5332c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, p11) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                p251z9.j.b(obj);
                p10 = (P) obj;
            }
            iD = o10.d(j, p10, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                m0(j, o10);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        P p12 = (P) atomicReferenceFieldUpdater.get(this);
        if (p12 != null) {
            synchronized (p12) {
                O[] oArr = p12.f6812a;
                o11 = oArr != null ? oArr[0] : null;
            }
        }
        if (o11 != o10 || Thread.currentThread() == (threadI0 = i0())) {
            return;
        }
        LockSupport.unpark(threadI0);
    }

    @Override // K9.S
    public void shutdown() {
        O oC;
        q0.f5390a.set(null);
        f5335z.set(this, 1);
        P9.t tVar = AbstractC0405x.f5410c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5333x;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof P9.m) {
                ((P9.m) obj).b();
                break;
            } else {
                if (obj == tVar) {
                    break;
                }
                P9.m mVar = new P9.m(8, true);
                mVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (k0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            P p10 = (P) f5334y.get(this);
            if (p10 == null) {
                return;
            }
            synchronized (p10) {
                oC = P9.x.f6811b.get(p10) > 0 ? p10.c(0) : null;
            }
            if (oC == null) {
                return;
            } else {
                m0(jNanoTime, oC);
            }
        }
    }
}
