package R9;

import P9.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7410z = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f7411r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f7412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f7413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f7414u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f7415v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7416w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7417x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f7418y;

    public a(c cVar, int i10) {
        this.f7418y = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f7411r = new m();
        this.f7412s = new v();
        this.f7413t = b.f7422u;
        this.nextParkedWorker = c.f7426B;
        int iNanoTime = (int) System.nanoTime();
        this.f7416w = iNanoTime == 0 ? 42 : iNanoTime;
        f(i10);
    }

    public final i a(boolean z10) {
        i iVarE;
        i iVarE2;
        long j;
        b bVar = this.f7413t;
        c cVar = this.f7418y;
        i iVar = null;
        m mVar = this.f7411r;
        b bVar2 = b.f7419r;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7428z;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f7451b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f7442s) {
                            int i10 = m.f7453d.get(mVar);
                            int i11 = m.f7452c.get(mVar);
                            while (i10 != i11 && m.f7454e.get(mVar) != 0) {
                                i11--;
                                i iVarC = mVar.c(i11, true);
                                if (iVarC != null) {
                                    iVar = iVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                iVar = iVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f7434w.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f7428z.compareAndSet(cVar, j, j - 4398046511104L));
            this.f7413t = bVar2;
        }
        if (z10) {
            boolean z11 = d(cVar.f7429r * 2) == 0;
            if (z11 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            i iVarB = (i) m.f7451b.getAndSet(mVar, null);
            if (iVarB == null) {
                iVarB = mVar.b();
            }
            if (iVarB != null) {
                return iVarB;
            }
            if (!z11 && (iVarE = e()) != null) {
                return iVarE;
            }
        } else {
            i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f7416w;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f7416w = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f7418y;
        if (iD == 0) {
            i iVar = (i) cVar.f7433v.d();
            return iVar != null ? iVar : (i) cVar.f7434w.d();
        }
        i iVar2 = (i) cVar.f7434w.d();
        return iVar2 != null ? iVar2 : (i) cVar.f7433v.d();
    }

    public final void f(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7418y.f7432u);
        sb.append("-worker-");
        sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f7413t;
        boolean z10 = bVar2 == b.f7419r;
        if (z10) {
            c.f7428z.addAndGet(this.f7418y, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f7413t = bVar;
        }
        return z10;
    }

    public final i i(int i10) {
        long j;
        i iVarC;
        long j10;
        long j11;
        i iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7428z;
        c cVar = this.f7418y;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i11 < 2) {
            return null;
        }
        int iD = d(i11);
        int i12 = 0;
        long jMin = Long.MAX_VALUE;
        while (i12 < i11) {
            iD++;
            if (iD > i11) {
                iD = 1;
            }
            a aVar = (a) cVar.f7435x.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f7411r;
                if (i10 != 3) {
                    mVar.getClass();
                    int i13 = m.f7453d.get(mVar);
                    int i14 = m.f7452c.get(mVar);
                    boolean z10 = i10 == 1;
                    while (true) {
                        if (i13 != i14) {
                            j = 0;
                            if (!z10 || m.f7454e.get(mVar) != 0) {
                                int i15 = i13 + 1;
                                iVarC = mVar.c(i13, z10);
                                if (iVarC != null) {
                                    break;
                                }
                                i13 = i15;
                            }
                        } else {
                            j = 0;
                        }
                        iVarC = iVar2;
                        break;
                    }
                } else {
                    iVarC = mVar.b();
                    j = 0;
                }
                v vVar = this.f7412s;
                if (iVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f7451b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j10 = -1;
                        } else {
                            j10 = -1;
                            if (((iVar3.f7442s ? 1 : 2) & i10) != 0) {
                                k.f7449f.getClass();
                                m mVar2 = mVar;
                                long jNanoTime = System.nanoTime() - iVar3.f7441r;
                                long j12 = k.f7445b;
                                if (jNanoTime < j12) {
                                    j11 = j12 - jNanoTime;
                                    iVar = null;
                                    break;
                                }
                                do {
                                    iVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar3, null)) {
                                        vVar.f24886r = iVar3;
                                        j11 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar2) == iVar3);
                                mVar = mVar2;
                                iVar2 = null;
                            }
                        }
                        j11 = -2;
                        iVar = iVar2;
                        break;
                    }
                } else {
                    vVar.f24886r = iVarC;
                    iVar = iVar2;
                    j11 = -1;
                    j10 = -1;
                }
                if (j11 == j10) {
                    i iVar4 = (i) vVar.f24886r;
                    vVar.f24886r = iVar;
                    return iVar4;
                }
                if (j11 > j) {
                    jMin = Math.min(jMin, j11);
                }
            }
            i12++;
            iVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f7415v = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (c.f7425A.get(this.f7418y) != 1) {
                    b bVar = this.f7413t;
                    b bVar2 = b.f7423v;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.f7417x);
                    if (iVarA != null) {
                        this.f7415v = 0L;
                        c cVar = this.f7418y;
                        this.f7414u = 0L;
                        if (this.f7413t == b.f7421t) {
                            this.f7413t = b.f7420s;
                        }
                        if (!iVarA.f7442s) {
                            try {
                                iVarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(b.f7420s) && !cVar.w() && !cVar.s(c.f7428z.get(cVar))) {
                            cVar.w();
                        }
                        try {
                            iVarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        c.f7428z.addAndGet(cVar, -2097152L);
                        if (this.f7413t == bVar2) {
                            break;
                        }
                        this.f7413t = b.f7422u;
                        break;
                    }
                    this.f7417x = false;
                    if (this.f7415v == 0) {
                        Object obj = this.nextParkedWorker;
                        t tVar = c.f7426B;
                        if (obj != tVar) {
                            f7410z.set(this, -1);
                            while (this.nextParkedWorker != c.f7426B) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7410z;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.f7418y;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f7425A;
                                if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                    break;
                                }
                                b bVar3 = this.f7413t;
                                b bVar4 = b.f7423v;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                h(b.f7421t);
                                Thread.interrupted();
                                if (this.f7414u == 0) {
                                    j = 2097151;
                                    this.f7414u = System.nanoTime() + this.f7418y.f7431t;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.f7418y.f7431t);
                                if (System.nanoTime() - this.f7414u >= 0) {
                                    this.f7414u = 0L;
                                    c cVar3 = this.f7418y;
                                    synchronized (cVar3.f7435x) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7428z;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j)) > cVar3.f7429r) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i10 = this.indexInArray;
                                                        f(0);
                                                        cVar3.n(this, i10, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j);
                                                        if (andDecrement != i10) {
                                                            Object objB = cVar3.f7435x.b(andDecrement);
                                                            p251z9.j.b(objB);
                                                            a aVar = (a) objB;
                                                            cVar3.f7435x.c(i10, aVar);
                                                            aVar.f(i10);
                                                            cVar3.n(aVar, andDecrement, i10);
                                                        }
                                                        cVar3.f7435x.c(andDecrement, null);
                                                        this.f7413t = bVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f7418y;
                            if (this.nextParkedWorker == tVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f7427y;
                                while (true) {
                                    long j10 = atomicLongFieldUpdater2.get(cVar4);
                                    int i11 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f7435x.b((int) (j10 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f7427y.compareAndSet(cVar5, j10, ((j10 + 2097152) & (-2097152)) | ((long) i11))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z10) {
                            h(b.f7421t);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f7415v);
                            this.f7415v = 0L;
                            break;
                        }
                        z10 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f7423v);
    }
}
