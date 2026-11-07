package R9;

import K9.AbstractC0405x;
import P9.p;
import P9.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f7431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f7432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f7433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f7434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f7435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7427y = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7428z = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7425A = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final t f7426B = new t("NOT_IN_STACK", 0);

    public c(int i10, int i11, long j, String str) {
        this.f7429r = i10;
        this.f7430s = i11;
        this.f7431t = j;
        this.f7432u = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(p245z2.a.B(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(p245z2.a.B(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f7433v = new f();
        this.f7434w = new f();
        this.f7435x = new p((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
    }

    public static /* synthetic */ void i(c cVar, Runnable runnable, int i10) {
        cVar.e(runnable, false, (i10 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f7435x) {
            try {
                if (f7425A.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7428z;
                long j = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j & 2097151);
                int i11 = i10 - ((int) ((j & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f7429r) {
                    return 0;
                }
                if (i10 >= this.f7430s) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f7435x.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i12);
                this.f7435x.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i10;
        i iVarA;
        if (f7425A.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !p251z9.j.a(aVar.f7418y, this)) {
                aVar = null;
            }
            synchronized (this.f7435x) {
                i10 = (int) (f7428z.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f7435x.b(i11);
                    p251z9.j.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f7411r;
                        f fVar = this.f7434w;
                        mVar.getClass();
                        i iVar = (i) m.f7451b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            i iVarB = mVar.b();
                            if (iVarB == null) {
                                break;
                            } else {
                                fVar.a(iVarB);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f7434w.b();
            this.f7433v.b();
            while (true) {
                if (aVar != null) {
                    iVarA = aVar.a(true);
                    if (iVarA == null) {
                        iVarA = (i) this.f7433v.d();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (i) this.f7433v.d();
                    if (iVarA == null && (iVarA = (i) this.f7434w.d()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f7423v);
            }
            f7427y.set(this, 0L);
            f7428z.set(this, 0L);
        }
    }

    public final void e(Runnable runnable, boolean z10, boolean z11) {
        i jVar;
        b bVar;
        k.f7449f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f7441r = jNanoTime;
            jVar.f7442s = z10;
        } else {
            jVar = new j(runnable, jNanoTime, z10);
        }
        boolean z12 = jVar.f7442s;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7428z;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !p251z9.j.a(aVar.f7418y, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f7413t) != b.f7423v && (jVar.f7442s || bVar != b.f7420s)) {
            aVar.f7417x = true;
            m mVar = aVar.f7411r;
            if (z11) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f7451b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f7442s ? this.f7434w.a(jVar) : this.f7433v.a(jVar))) {
                throw new RejectedExecutionException(android.support.v4.media.session.p.B(new StringBuilder(), this.f7432u, " was terminated"));
            }
        }
        if (z12) {
            if (w() || s(jAddAndGet)) {
                return;
            }
            w();
            return;
        }
        if (w() || s(atomicLongFieldUpdater.get(this))) {
            return;
        }
        w();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(this, runnable, 6);
    }

    public final void n(a aVar, int i10, int i11) {
        while (true) {
            long j = f7427y.get(this);
            int i12 = (int) (2097151 & j);
            long j10 = (2097152 + j) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f7426B) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f7427y.compareAndSet(this, j, ((long) i12) | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean s(long j) {
        int i10 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f7429r;
        if (i10 < i11) {
            int iB = b();
            if (iB == 1 && i11 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f7435x;
        int iA = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) pVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f7411r;
                mVar.getClass();
                int i16 = m.f7451b.get(mVar) != null ? (m.f7452c.get(mVar) - m.f7453d.get(mVar)) + 1 : m.f7452c.get(mVar) - m.f7453d.get(mVar);
                int iOrdinal = aVar.f7413t.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new A6.a();
                    }
                    i14++;
                }
            }
        }
        long j = f7428z.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f7432u);
        sb4.append('@');
        sb4.append(AbstractC0405x.p(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f7429r;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.f7430s);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f7433v.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f7434w.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean w() {
        t tVar;
        int iB;
        while (true) {
            long j = f7427y.get(this);
            a aVar = (a) this.f7435x.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    tVar = f7426B;
                    if (objC == tVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (f7427y.compareAndSet(this, j, ((long) iB) | j10)) {
                        aVar.g(tVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f7410z.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
