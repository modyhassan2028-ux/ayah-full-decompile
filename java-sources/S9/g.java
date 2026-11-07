package S9;

import K9.AbstractC0405x;
import K9.C0389g;
import K9.InterfaceC0388f;
import K9.x0;
import P9.r;
import P9.t;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7537t = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7538u = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7539v = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7540w = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7541x = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A4.f f7543s;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i10, int i11) {
        this.f7542r = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(p123m2.c.r(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(p123m2.c.r(i10, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = i10 - i11;
        this.f7543s = new A4.f(5, this);
    }

    public final Object a(q9.c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i10;
        do {
            atomicIntegerFieldUpdater = f7541x;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i10 = this.f7542r;
        } while (andDecrement > i10);
        y yVar = y.f19095a;
        if (andDecrement <= 0) {
            C0389g c0389gR = AbstractC0405x.r(AbstractC0813f2.H(cVar));
            try {
                if (!c(c0389gR)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i10) {
                            if (andDecrement2 > 0) {
                                c0389gR.c(yVar, this.f7543s);
                                break;
                            }
                            if (c(c0389gR)) {
                                break;
                            }
                        }
                    }
                }
                Object objR = c0389gR.r();
                p161p9.a aVar = p161p9.a.f21156r;
                if (objR != aVar) {
                    objR = yVar;
                }
                if (objR == aVar) {
                    return objR;
                }
            } catch (Throwable th) {
                c0389gR.z();
                throw th;
            }
        }
        return yVar;
    }

    public final boolean c(x0 x0Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7539v;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f7540w.getAndIncrement(this);
        e eVar = e.f7535z;
        long j = andIncrement / ((long) i.f7549f);
        loop0: while (true) {
            objB = P9.b.b(jVar, j, eVar);
            if (!P9.b.e(objB)) {
                r rVarC = P9.b.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f6802c >= rVarC.f6802c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                            if (!rVar.e()) {
                                break loop0;
                            }
                            rVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rVar);
                    if (rVarC.e()) {
                        rVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        j jVar2 = (j) P9.b.c(objB);
        AtomicReferenceArray atomicReferenceArray = jVar2.f7550e;
        int i10 = (int) (andIncrement % ((long) i.f7549f));
        while (!atomicReferenceArray.compareAndSet(i10, null, x0Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                t tVar = i.f7545b;
                t tVar2 = i.f7546c;
                while (!atomicReferenceArray.compareAndSet(i10, tVar, tVar2)) {
                    if (atomicReferenceArray.get(i10) != tVar) {
                        return false;
                    }
                }
                ((InterfaceC0388f) x0Var).c(y.f19095a, this.f7543s);
                return true;
            }
        }
        x0Var.a(jVar2, i10);
        return true;
    }

    public final void d() {
        int i10;
        Object objB;
        boolean z10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7541x;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f7542r;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7537t;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f7538u.getAndIncrement(this);
            long j = andIncrement2 / ((long) i.f7549f);
            f fVar = f.f7536z;
            while (true) {
                objB = P9.b.b(jVar, j, fVar);
                if (!P9.b.e(objB)) {
                    r rVarC = P9.b.c(objB);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.f6802c >= rVarC.f6802c) {
                            break;
                        }
                        if (!rVarC.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                                if (!rVar.e()) {
                                    break;
                                }
                                rVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == rVar);
                        if (rVarC.e()) {
                            rVarC.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) P9.b.c(objB);
            AtomicReferenceArray atomicReferenceArray = jVar2.f7550e;
            jVar2.a();
            z10 = false;
            if (jVar2.f6802c <= j) {
                int i12 = (int) (andIncrement2 % ((long) i.f7549f));
                Object andSet = atomicReferenceArray.getAndSet(i12, i.f7545b);
                if (andSet == null) {
                    int i13 = i.f7544a;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            t tVar = i.f7545b;
                            t tVar2 = i.f7547d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i12, tVar, tVar2)) {
                                    z10 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i12) == tVar);
                            z10 = !z10;
                            break;
                        }
                        if (atomicReferenceArray.get(i12) == i.f7546c) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                } else if (andSet != i.f7548e) {
                    if (!(andSet instanceof InterfaceC0388f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0388f interfaceC0388f = (InterfaceC0388f) andSet;
                    t tVarJ = interfaceC0388f.j(y.f19095a, this.f7543s);
                    if (tVarJ != null) {
                        interfaceC0388f.l(tVarJ);
                        z10 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z10);
    }
}
