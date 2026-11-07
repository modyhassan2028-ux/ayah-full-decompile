package M9;

import K9.AbstractC0405x;
import K9.C0389g;
import K9.InterfaceC0388f;
import K9.x0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public class e implements i {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5852r;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5844s = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5845t = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5846u = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5847v = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5848w = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5849x = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5850y = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5851z = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5843A = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");

    public e(int i10) {
        this.f5852r = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        m mVar = g.f5854a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f5846u.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (z()) {
            mVar2 = g.f5854a;
            p251z9.j.c(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f5870s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object C(e eVar, q9.c cVar) {
        c cVar2;
        m mVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f5839t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f5839t = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(eVar, cVar);
            }
        } else {
            cVar2 = new c(eVar, cVar);
        }
        c cVar3 = cVar2;
        Object obj = cVar3.f5837r;
        int i11 = cVar3.f5839t;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            return ((l) obj).f5876a;
        }
        p110k9.a.e(obj);
        m mVar2 = (m) f5849x.get(eVar);
        while (!eVar.w()) {
            long andIncrement = f5845t.getAndIncrement(eVar);
            long j = g.f5855b;
            long j10 = andIncrement / j;
            int i12 = (int) (andIncrement % j);
            if (mVar2.f6802c != j10) {
                m mVarP = eVar.p(j10, mVar2);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            } else {
                mVar = mVar2;
            }
            e eVar2 = eVar;
            Object objH = eVar2.H(mVar, i12, andIncrement, null);
            if (objH == g.f5864m) {
                throw new IllegalStateException("unexpected");
            }
            if (objH != g.f5866o) {
                if (objH != g.f5865n) {
                    mVar.a();
                    return objH;
                }
                cVar3.f5839t = 1;
                Object objD = eVar2.D(mVar, i12, andIncrement, cVar3);
                p161p9.a aVar = p161p9.a.f21156r;
                return objD == aVar ? aVar : objD;
            }
            if (andIncrement < eVar2.t()) {
                mVar.a();
            }
            mVar2 = mVar;
            eVar = eVar2;
        }
        return new j(eVar.q());
    }

    public static boolean G(Object obj) {
        if (obj instanceof InterfaceC0388f) {
            return g.a((InterfaceC0388f) obj, y.f19095a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final m b(e eVar, long j, m mVar) {
        Object objB;
        e eVar2;
        m mVar2 = g.f5854a;
        f fVar = f.f5853z;
        loop0: while (true) {
            objB = P9.b.b(mVar, j, fVar);
            if (!P9.b.e(objB)) {
                P9.r rVarC = P9.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5848w;
                    P9.r rVar = (P9.r) atomicReferenceFieldUpdater.get(eVar);
                    if (rVar.f6802c >= rVarC.f6802c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(eVar, rVar, rVarC)) {
                            if (!rVar.e()) {
                                break loop0;
                            }
                            rVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(eVar) == rVar);
                    if (rVarC.e()) {
                        rVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = P9.b.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5845t;
        if (zE) {
            eVar.x();
            if (mVar.f6802c * ((long) g.f5855b) < atomicLongFieldUpdater.get(eVar)) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) P9.b.c(objB);
            long j10 = mVar3.f6802c;
            if (j10 <= j) {
                return mVar3;
            }
            long j11 = ((long) g.f5855b) * j10;
            while (true) {
                long j12 = f5844s.get(eVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (f5844s.compareAndSet(eVar2, j12, (((long) ((int) (j12 >> 60))) << 60) + j13)) {
                    break;
                }
                eVar = eVar2;
            }
            if (j10 * ((long) g.f5855b) < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.a();
            }
        }
        return null;
    }

    public static final void c(e eVar, Object obj, C0389g c0389g) {
        c0389g.resumeWith(p110k9.a.b(eVar.s()));
    }

    public static final int h(e eVar, m mVar, int i10, Object obj, long j, Object obj2, boolean z10) {
        mVar.m(i10, obj);
        if (z10) {
            return eVar.I(mVar, i10, obj, j, obj2, z10);
        }
        Object objK = mVar.k(i10);
        if (objK == null) {
            if (eVar.i(j)) {
                if (mVar.j(i10, null, g.f5857d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof x0) {
            mVar.m(i10, null);
            if (eVar.F(objK, obj)) {
                mVar.n(i10, g.f5861i);
                return 0;
            }
            P9.t tVar = g.f5862k;
            if (mVar.f5878f.getAndSet((i10 * 2) + 1, tVar) == tVar) {
                return 5;
            }
            mVar.l(i10, true);
            return 5;
        }
        return eVar.I(mVar, i10, obj, j, obj2, z10);
    }

    public static void u(e eVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5847v;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A(long j, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.f6802c < j && (mVar3 = (m) mVar.b()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.c() || (mVar2 = (m) mVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5850y;
                    P9.r rVar = (P9.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f6802c >= mVar.f6802c) {
                        return;
                    }
                    if (!mVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, mVar)) {
                            if (rVar.e()) {
                                rVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rVar);
                    if (mVar.e()) {
                        mVar.d();
                    }
                }
            } else {
                mVar = mVar2;
            }
        }
    }

    public final Object B(Object obj, p150o9.c cVar) {
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar));
        c0389g.s();
        c0389g.resumeWith(p110k9.a.b(s()));
        Object objR = c0389g.r();
        return objR == p161p9.a.f21156r ? objR : y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object D(m mVar, int i10, long j, q9.c cVar) {
        d dVar;
        m mVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f5842t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f5842t = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objR = dVar.f5840r;
        int i12 = dVar.f5842t;
        if (i12 == 0) {
            p110k9.a.e(objR);
            dVar.f5842t = 1;
            C0389g c0389gR = AbstractC0405x.r(AbstractC0813f2.H(dVar));
            try {
                t tVar = new t(c0389gR);
                Object objH = H(mVar, i10, j, tVar);
                if (objH == g.f5864m) {
                    tVar.a(mVar, i10);
                } else if (objH == g.f5866o) {
                    if (j < t()) {
                        mVar.a();
                    }
                    m mVar3 = (m) f5849x.get(this);
                    while (true) {
                        if (w()) {
                            c0389gR.resumeWith(new l(new j(q())));
                            break;
                        }
                        long andIncrement = f5845t.getAndIncrement(this);
                        long j10 = g.f5855b;
                        long j11 = andIncrement / j10;
                        int i13 = (int) (andIncrement % j10);
                        if (mVar3.f6802c != j11) {
                            m mVarP = p(j11, mVar3);
                            if (mVarP != null) {
                                mVar2 = mVarP;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        Object objH2 = H(mVar2, i13, andIncrement, tVar);
                        m mVar4 = mVar2;
                        if (objH2 == g.f5864m) {
                            tVar.a(mVar4, i13);
                            break;
                        }
                        if (objH2 != g.f5866o) {
                            if (objH2 == g.f5865n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar4.a();
                            c0389gR.c(new l(objH2), null);
                            break;
                        }
                        if (andIncrement < t()) {
                            mVar4.a();
                        }
                        mVar3 = mVar4;
                    }
                } else {
                    mVar.a();
                    c0389gR.c(new l(objH), null);
                }
                objR = c0389gR.r();
                p161p9.a aVar = p161p9.a.f21156r;
                if (objR == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                c0389gR.z();
                throw th;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(objR);
        }
        return ((l) objR).f5876a;
    }

    public final void E(x0 x0Var, boolean z10) {
        if (x0Var instanceof InterfaceC0388f) {
            ((p150o9.c) x0Var).resumeWith(p110k9.a.b(z10 ? r() : s()));
            return;
        }
        if (x0Var instanceof t) {
            ((t) x0Var).f5884r.resumeWith(new l(new j(q())));
            return;
        }
        if (!(x0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + x0Var).toString());
        }
        b bVar = (b) x0Var;
        C0389g c0389g = bVar.f5835s;
        p251z9.j.b(c0389g);
        bVar.f5835s = null;
        bVar.f5834r = g.f5863l;
        Throwable thQ = bVar.f5836t.q();
        if (thQ == null) {
            c0389g.resumeWith(Boolean.FALSE);
        } else {
            c0389g.resumeWith(p110k9.a.b(thQ));
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof t) {
            return g.a(((t) obj).f5884r, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof InterfaceC0388f) {
                return g.a((InterfaceC0388f) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        b bVar = (b) obj;
        C0389g c0389g = bVar.f5835s;
        p251z9.j.b(c0389g);
        bVar.f5835s = null;
        bVar.f5834r = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f5836t.getClass();
        return g.a(c0389g, bool, null);
    }

    public final Object H(m mVar, int i10, long j, Object obj) {
        Object objK = mVar.k(i10);
        AtomicReferenceArray atomicReferenceArray = mVar.f5878f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5844s;
        if (objK == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f5865n;
                }
                if (mVar.j(i10, objK, obj)) {
                    o();
                    return g.f5864m;
                }
            }
        } else if (objK == g.f5857d && mVar.j(i10, objK, g.f5861i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            mVar.m(i10, null);
            return obj2;
        }
        while (true) {
            Object objK2 = mVar.k(i10);
            if (objK2 == null || objK2 == g.f5858e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.j(i10, objK2, g.f5860h)) {
                        o();
                        return g.f5866o;
                    }
                } else {
                    if (obj == null) {
                        return g.f5865n;
                    }
                    if (mVar.j(i10, objK2, obj)) {
                        o();
                        return g.f5864m;
                    }
                }
            } else if (objK2 != g.f5857d) {
                P9.t tVar = g.j;
                if (objK2 == tVar) {
                    return g.f5866o;
                }
                if (objK2 == g.f5860h) {
                    return g.f5866o;
                }
                if (objK2 == g.f5863l) {
                    o();
                    return g.f5866o;
                }
                if (objK2 != g.g && mVar.j(i10, objK2, g.f5859f)) {
                    boolean z10 = objK2 instanceof w;
                    if (z10) {
                        objK2 = ((w) objK2).f5885a;
                    }
                    if (G(objK2)) {
                        mVar.n(i10, g.f5861i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        mVar.m(i10, null);
                        return obj3;
                    }
                    mVar.n(i10, tVar);
                    mVar.h();
                    if (z10) {
                        o();
                    }
                    return g.f5866o;
                }
            } else if (mVar.j(i10, objK2, g.f5861i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                mVar.m(i10, null);
                return obj4;
            }
        }
    }

    public final int I(m mVar, int i10, Object obj, long j, Object obj2, boolean z10) {
        while (true) {
            Object objK = mVar.k(i10);
            if (objK == null) {
                if (!i(j) || z10) {
                    if (z10) {
                        if (mVar.j(i10, null, g.j)) {
                            mVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.j(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.j(i10, null, g.f5857d)) {
                    break;
                }
            } else {
                if (objK != g.f5858e) {
                    P9.t tVar = g.f5862k;
                    if (objK == tVar) {
                        mVar.m(i10, null);
                        return 5;
                    }
                    if (objK == g.f5860h) {
                        mVar.m(i10, null);
                        return 5;
                    }
                    if (objK == g.f5863l) {
                        mVar.m(i10, null);
                        x();
                        return 4;
                    }
                    mVar.m(i10, null);
                    if (objK instanceof w) {
                        objK = ((w) objK).f5885a;
                    }
                    if (F(objK, obj)) {
                        mVar.n(i10, g.f5861i);
                        return 0;
                    }
                    if (mVar.f5878f.getAndSet((i10 * 2) + 1, tVar) != tVar) {
                        mVar.l(i10, true);
                    }
                    return 5;
                }
                if (mVar.j(i10, objK, g.f5857d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void J(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f5846u;
            if (atomicLongFieldUpdater.get(eVar) > j) {
                break;
            } else {
                eVar = this;
            }
        }
        int i10 = g.f5856c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5847v;
            if (i11 < i10) {
                long j10 = atomicLongFieldUpdater.get(eVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j10 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(eVar);
                    long j13 = atomicLongFieldUpdater2.get(eVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z10 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (z10) {
                        eVar = this;
                    } else {
                        eVar = this;
                        atomicLongFieldUpdater2.compareAndSet(eVar, j13, 4611686018427387904L + j14);
                    }
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // M9.u
    public final Object a(q9.i iVar) throws Throwable {
        m mVar;
        Throwable th;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5849x;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5845t;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = g.f5855b;
            long j10 = andIncrement / j;
            int i10 = (int) (andIncrement % j);
            if (mVar3.f6802c != j10) {
                m mVarP = p(j10, mVar3);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            } else {
                mVar = mVar3;
            }
            Object objH = H(mVar, i10, andIncrement, null);
            P9.t tVar = g.f5864m;
            if (objH == tVar) {
                throw new IllegalStateException("unexpected");
            }
            P9.t tVar2 = g.f5866o;
            if (objH == tVar2) {
                if (andIncrement < t()) {
                    mVar.a();
                }
                mVar3 = mVar;
            } else {
                if (objH != g.f5865n) {
                    mVar.a();
                    return objH;
                }
                C0389g c0389gR = AbstractC0405x.r(AbstractC0813f2.H(iVar));
                e eVar = this;
                try {
                    Object objH2 = eVar.H(mVar, i10, andIncrement, c0389gR);
                    if (objH2 != tVar) {
                        if (objH2 == tVar2) {
                            if (andIncrement < t()) {
                                mVar.a();
                            }
                            m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (w()) {
                                    c0389gR.resumeWith(p110k9.a.b(r()));
                                    break;
                                }
                                C0389g c0389g = c0389gR;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j11 = g.f5855b;
                                    long j12 = andIncrement2 / j11;
                                    int i11 = (int) (andIncrement2 % j11);
                                    if (mVar4.f6802c != j12) {
                                        try {
                                            m mVarP2 = p(j12, mVar4);
                                            if (mVarP2 == null) {
                                                c0389gR = c0389g;
                                            } else {
                                                mVar2 = mVarP2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0389gR = c0389g;
                                            c0389gR.z();
                                            throw th;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    objH2 = eVar.H(mVar2, i11, andIncrement2, c0389g);
                                    m mVar5 = mVar2;
                                    c0389gR = c0389g;
                                    if (objH2 == g.f5864m) {
                                        c0389gR.a(mVar5, i11);
                                        break;
                                    }
                                    if (objH2 == g.f5866o) {
                                        if (andIncrement2 < t()) {
                                            mVar5.a();
                                        }
                                        eVar = this;
                                        mVar4 = mVar5;
                                    } else {
                                        if (objH2 == g.f5865n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0389gR = c0389g;
                                    th = th;
                                    c0389gR.z();
                                    throw th;
                                }
                            }
                        } else {
                            mVar.a();
                        }
                        c0389gR.c(objH2, null);
                        break;
                    }
                    c0389gR.a(mVar, i10);
                    return c0389gR.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thR = r();
        int i12 = P9.s.f6803a;
        throw thR;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0160  */
    /* JADX WARN: Code duplicated, block: B:95:0x0163 A[RETURN] */
    @Override // M9.v
    public Object d(Object obj, p150o9.c cVar) throws Throwable {
        y yVar;
        Object objR;
        Object obj2;
        e eVar;
        m mVar;
        int i10;
        e eVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5848w;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5844s;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(eVar2);
            long j = andIncrement & 1152921504606846975L;
            boolean zV = eVar2.v(andIncrement, false);
            int i11 = g.f5855b;
            long j10 = i11;
            long j11 = j / j10;
            int i12 = (int) (j % j10);
            long j12 = mVar2.f6802c;
            p161p9.a aVar = p161p9.a.f21156r;
            yVar = y.f19095a;
            if (j12 != j11) {
                m mVarB = b(eVar2, j11, mVar2);
                if (mVarB != null) {
                    mVar2 = mVarB;
                } else if (zV) {
                    Object objB = B(obj, cVar);
                    if (objB != aVar) {
                        break;
                    }
                    return objB;
                }
            }
            int iH = h(eVar2, mVar2, i12, obj, j, null, zV);
            if (iH == 0) {
                mVar2.a();
                return yVar;
            }
            if (iH == 1) {
                break;
            }
            if (iH != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5845t;
                if (iH == 3) {
                    C0389g c0389gR = AbstractC0405x.r(AbstractC0813f2.H(cVar));
                    Object obj3 = obj;
                    try {
                        int iH2 = h(eVar2, mVar2, i12, obj3, j, c0389gR, false);
                        try {
                            if (iH2 != 0) {
                                if (iH2 == 1) {
                                    c0389gR.resumeWith(yVar);
                                } else if (iH2 != 2) {
                                    if (iH2 != 4) {
                                        String str = "unexpected";
                                        if (iH2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar2.a();
                                        m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(eVar2);
                                            long j13 = andIncrement2 & 1152921504606846975L;
                                            boolean zV2 = eVar2.v(andIncrement2, false);
                                            int i13 = g.f5855b;
                                            long j14 = i13;
                                            str = str;
                                            long j15 = j13 / j14;
                                            int i14 = (int) (j13 % j14);
                                            if (mVar3.f6802c != j15) {
                                                m mVarB2 = b(eVar2, j15, mVar3);
                                                if (mVarB2 != null) {
                                                    i10 = i13;
                                                    mVar = mVarB2;
                                                } else if (zV2) {
                                                    c(eVar2, obj3, c0389gR);
                                                    break;
                                                }
                                            } else {
                                                mVar = mVar3;
                                                i10 = i13;
                                            }
                                            int iH3 = h(eVar2, mVar, i14, obj3, j13, c0389gR, zV2);
                                            Object obj4 = obj3;
                                            eVar = eVar2;
                                            m mVar4 = mVar;
                                            obj2 = obj4;
                                            if (iH3 == 0) {
                                                mVar4.a();
                                            } else if (iH3 != 1) {
                                                if (iH3 == 2) {
                                                    if (!zV2) {
                                                        c0389gR.a(mVar4, i14 + i10);
                                                        break;
                                                    }
                                                    mVar4.h();
                                                } else {
                                                    if (iH3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iH3 != 4) {
                                                        if (iH3 == 5) {
                                                            mVar4.a();
                                                        }
                                                        mVar3 = mVar4;
                                                        eVar2 = eVar;
                                                        obj3 = obj2;
                                                    } else if (j13 < atomicLongFieldUpdater2.get(eVar)) {
                                                        mVar4.a();
                                                    }
                                                }
                                            }
                                        }
                                        c0389gR.z();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    eVar = eVar2;
                                    if (j < atomicLongFieldUpdater2.get(eVar)) {
                                        mVar2.a();
                                    }
                                    c(eVar, obj2, c0389gR);
                                    break;
                                } else {
                                    c0389gR.a(mVar2, i12 + i11);
                                }
                                objR = c0389gR.r();
                                if (objR != aVar) {
                                    objR = yVar;
                                }
                                if (objR == aVar) {
                                    return objR;
                                }
                            } else {
                                mVar2.a();
                            }
                            c0389gR.resumeWith(yVar);
                            objR = c0389gR.r();
                            if (objR != aVar) {
                                objR = yVar;
                            }
                            if (objR == aVar) {
                                return objR;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (iH == 4) {
                        if (j < atomicLongFieldUpdater2.get(eVar2)) {
                            mVar2.a();
                        }
                        Object objB2 = B(obj, cVar);
                        if (objB2 != aVar) {
                            break;
                        }
                        return objB2;
                    }
                    if (iH == 5) {
                        mVar2.a();
                    }
                }
            } else if (zV) {
                mVar2.h();
                Object objB3 = B(obj, cVar);
                if (objB3 == aVar) {
                    return objB3;
                }
            }
            return yVar;
        }
        return yVar;
    }

    @Override // M9.u
    public final void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    @Override // M9.u
    public final Object f(O9.n nVar) {
        return C(this, nVar);
    }

    @Override // M9.u
    public final Object g() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5845t;
        long j = atomicLongFieldUpdater.get(this);
        long j10 = f5844s.get(this);
        if (v(j10, true)) {
            return new j(q());
        }
        long j11 = j10 & 1152921504606846975L;
        k kVar = l.f5875b;
        if (j >= j11) {
            return kVar;
        }
        Object obj = g.f5862k;
        m mVar2 = (m) f5849x.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = g.f5855b;
            long j13 = andIncrement / j12;
            int i10 = (int) (andIncrement % j12);
            if (mVar2.f6802c != j13) {
                m mVarP = p(j13, mVar2);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            } else {
                mVar = mVar2;
            }
            Object objH = H(mVar, i10, andIncrement, obj);
            m mVar3 = mVar;
            if (objH == g.f5864m) {
                x0 x0Var = obj instanceof x0 ? (x0) obj : null;
                if (x0Var != null) {
                    x0Var.a(mVar3, i10);
                }
                J(andIncrement);
                mVar3.h();
                return kVar;
            }
            if (objH != g.f5866o) {
                if (objH == g.f5865n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar3.a();
                return objH;
            }
            if (andIncrement < t()) {
                mVar3.a();
            }
            mVar2 = mVar3;
        }
        return new j(q());
    }

    public final boolean i(long j) {
        return j < f5846u.get(this) || j < f5845t.get(this) + ((long) this.f5852r);
    }

    @Override // M9.u
    public final b iterator() {
        return new b(this);
    }

    public final boolean j(Throwable th) {
        return l(th, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // M9.v
    public Object k(Object obj) {
        int iH;
        y yVar;
        x0 x0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5844s;
        long j = atomicLongFieldUpdater.get(this);
        boolean z10 = false;
        long j10 = 1152921504606846975L;
        boolean z11 = v(j, false) ? false : !i(j & 1152921504606846975L);
        k kVar = l.f5875b;
        if (z11) {
            return kVar;
        }
        Object obj2 = g.j;
        m mVar = (m) f5848w.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean zV = v(andIncrement, z10);
            int i10 = g.f5855b;
            long j12 = i10;
            long j13 = j11 / j12;
            int i11 = (int) (j11 % j12);
            if (mVar.f6802c == j13) {
                iH = h(this, mVar, i11, obj, j11, obj2, zV);
                yVar = y.f19095a;
                if (iH != 0) {
                    mVar.a();
                    return yVar;
                }
                if (iH != 1) {
                    return yVar;
                }
                if (iH != 2) {
                    if (zV) {
                        mVar.h();
                        return new j(s());
                    }
                    if (obj2 instanceof x0) {
                        x0Var = (x0) obj2;
                    } else {
                        x0Var = null;
                    }
                    if (x0Var != null) {
                        x0Var.a(mVar, i11 + i10);
                    }
                    mVar.h();
                    return kVar;
                }
                if (iH != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iH != 4) {
                    if (j11 < f5845t.get(this)) {
                        mVar.a();
                    }
                    return new j(s());
                }
                if (iH == 5) {
                    mVar.a();
                }
                z10 = false;
            } else {
                m mVarB = b(this, j13, mVar);
                if (mVarB != null) {
                    mVar = mVarB;
                    iH = h(this, mVar, i11, obj, j11, obj2, zV);
                    yVar = y.f19095a;
                    if (iH != 0) {
                        mVar.a();
                        return yVar;
                    }
                    if (iH != 1) {
                        return yVar;
                    }
                    if (iH != 2) {
                        if (zV) {
                            mVar.h();
                            return new j(s());
                        }
                        if (obj2 instanceof x0) {
                            x0Var = (x0) obj2;
                        } else {
                            x0Var = null;
                        }
                        if (x0Var != null) {
                            x0Var.a(mVar, i11 + i10);
                        }
                        mVar.h();
                        return kVar;
                    }
                    if (iH != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iH != 4) {
                        if (j11 < f5845t.get(this)) {
                            mVar.a();
                        }
                        return new j(s());
                    }
                    if (iH == 5) {
                        mVar.a();
                    }
                    z10 = false;
                } else {
                    if (zV) {
                        return new j(s());
                    }
                    z10 = false;
                }
            }
            j10 = 1152921504606846975L;
        }
    }

    public final boolean l(Throwable th, boolean z10) {
        e eVar;
        boolean z11;
        long j;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5844s;
        if (!z10) {
            eVar = this;
            break;
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                eVar = this;
                break;
            }
            m mVar = g.f5854a;
            eVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j13, (j13 & 1152921504606846975L) + (((long) 1) << 60)));
        P9.t tVar = g.f5870s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5851z;
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, th)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j12, (((long) 3) << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j >> 60);
                if (i10 == 0) {
                    j10 = j & 1152921504606846975L;
                    j11 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j10 = j & 1152921504606846975L;
                    j11 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j, (j11 << 60) + j10));
        }
        x();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5843A;
                obj = atomicReferenceFieldUpdater2.get(this);
                P9.t tVar2 = obj == null ? g.f5868q : g.f5869r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, tVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                p251z9.y.b(1, obj);
                ((p241y9.c) obj).e(q());
                return z11;
            }
        }
        return z11;
    }

    public final m m(long j) {
        Object objF;
        long j10;
        Object obj = f5850y.get(this);
        m mVar = (m) f5848w.get(this);
        if (mVar.f6802c > ((m) obj).f6802c) {
            obj = mVar;
        }
        m mVar2 = (m) f5849x.get(this);
        if (mVar2.f6802c > ((m) obj).f6802c) {
            obj = mVar2;
        }
        P9.c cVar = (P9.c) obj;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P9.c.f6770a;
            Object obj2 = atomicReferenceFieldUpdater.get(cVar);
            P9.t tVar = P9.b.f6764a;
            objF = null;
            if (obj2 == tVar) {
                break;
            }
            P9.c cVar2 = (P9.c) obj2;
            if (cVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, tVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(cVar) == null);
            } else {
                cVar = cVar2;
            }
        }
        m mVar3 = (m) cVar;
        if (y()) {
            m mVar4 = mVar3;
            loop2: while (true) {
                int i10 = g.f5855b - 1;
                while (true) {
                    if (-1 < i10) {
                        j10 = (mVar4.f6802c * ((long) g.f5855b)) + ((long) i10);
                        if (j10 >= f5845t.get(this)) {
                            while (true) {
                                Object objK = mVar4.k(i10);
                                if (objK != null && objK != g.f5858e) {
                                    if (objK != g.f5857d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (mVar4.j(i10, objK, g.f5863l)) {
                                    mVar4.h();
                                    break;
                                }
                            }
                            i10--;
                        }
                    } else {
                        mVar4 = (m) ((P9.c) P9.c.f6771b.get(mVar4));
                        if (mVar4 == null) {
                        }
                    }
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                n(j10);
            }
        }
        loop5: for (m mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((P9.c) P9.c.f6771b.get(mVar5))) {
            for (int i11 = g.f5855b - 1; -1 < i11; i11--) {
                if ((mVar5.f6802c * ((long) g.f5855b)) + ((long) i11) < j) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = mVar5.k(i11);
                    if (objK2 != null && objK2 != g.f5858e) {
                        if (!(objK2 instanceof w)) {
                            if (!(objK2 instanceof x0)) {
                                break;
                            }
                            if (mVar5.j(i11, objK2, g.f5863l)) {
                                objF = P9.b.f(objF, objK2);
                                mVar5.l(i11, true);
                                break;
                            }
                        } else {
                            if (mVar5.j(i11, objK2, g.f5863l)) {
                                objF = P9.b.f(objF, ((w) objK2).f5885a);
                                mVar5.l(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar5.j(i11, objK2, g.f5863l)) {
                            mVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                E((x0) objF, true);
                return mVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                E((x0) arrayList.get(size), true);
            }
        }
        return mVar3;
    }

    public final void n(long j) {
        m mVar = (m) f5849x.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5845t;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f5852r) + j10, f5846u.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = g.f5855b;
                long j12 = j10 / j11;
                int i10 = (int) (j10 % j11);
                if (mVar.f6802c != j12) {
                    m mVarP = p(j12, mVar);
                    if (mVarP != null) {
                        mVar = mVarP;
                    }
                }
                m mVar2 = mVar;
                if (H(mVar2, i10, j10, null) != g.f5866o || j10 < t()) {
                    mVar2.a();
                }
                mVar = mVar2;
            }
        }
    }

    public final void o() {
        Object objB;
        if (z()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5850y;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f5846u.getAndIncrement(this);
            long j = andIncrement / ((long) g.f5855b);
            if (t() <= andIncrement) {
                if (mVar.f6802c < j && mVar.b() != null) {
                    A(j, mVar);
                }
                u(this);
                return;
            }
            if (mVar.f6802c != j) {
                f fVar = f.f5853z;
                while (true) {
                    objB = P9.b.b(mVar, j, fVar);
                    if (!P9.b.e(objB)) {
                        P9.r rVarC = P9.b.c(objB);
                        while (true) {
                            P9.r rVar = (P9.r) atomicReferenceFieldUpdater.get(this);
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
                m mVar2 = null;
                if (P9.b.e(objB)) {
                    x();
                    A(j, mVar);
                    u(this);
                } else {
                    m mVar3 = (m) P9.b.c(objB);
                    long j10 = mVar3.f6802c;
                    if (j10 > j) {
                        long j11 = j10 * ((long) g.f5855b);
                        if (f5846u.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f5847v;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            u(this);
                        }
                    } else {
                        mVar2 = mVar3;
                    }
                }
                if (mVar2 == null) {
                    continue;
                } else {
                    mVar = mVar2;
                }
            }
            int i10 = (int) (andIncrement % ((long) g.f5855b));
            Object objK = mVar.k(i10);
            boolean z10 = objK instanceof x0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5845t;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.j(i10, objK, g.g)) {
                while (true) {
                    Object objK2 = mVar.k(i10);
                    if (objK2 instanceof x0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (mVar.j(i10, objK2, new w((x0) objK2))) {
                                u(this);
                                return;
                            }
                        } else if (mVar.j(i10, objK2, g.g)) {
                            if (!G(objK2)) {
                                mVar.n(i10, g.j);
                                mVar.h();
                                break;
                            } else {
                                mVar.n(i10, g.f5857d);
                                u(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == g.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (mVar.j(i10, objK2, g.f5858e)) {
                                u(this);
                                return;
                            }
                        } else if (objK2 == g.f5857d || objK2 == g.f5860h || objK2 == g.f5861i || objK2 == g.f5862k || objK2 == g.f5863l) {
                            u(this);
                            return;
                        } else if (objK2 != g.f5859f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                u(this);
            } else if (G(objK)) {
                mVar.n(i10, g.f5857d);
                u(this);
                return;
            } else {
                mVar.n(i10, g.j);
                mVar.h();
                u(this);
            }
        }
    }

    public final m p(long j, m mVar) {
        Object objB;
        long j10;
        m mVar2 = g.f5854a;
        f fVar = f.f5853z;
        loop0: while (true) {
            objB = P9.b.b(mVar, j, fVar);
            if (!P9.b.e(objB)) {
                P9.r rVarC = P9.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5849x;
                    P9.r rVar = (P9.r) atomicReferenceFieldUpdater.get(this);
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
        if (P9.b.e(objB)) {
            x();
            if (mVar.f6802c * ((long) g.f5855b) < t()) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) P9.b.c(objB);
            long j11 = mVar3.f6802c;
            if (!z() && j <= f5846u.get(this) / ((long) g.f5855b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5850y;
                    P9.r rVar2 = (P9.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f6802c >= j11 || !mVar3.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, mVar3)) {
                            if (!rVar2.e()) {
                                break loop3;
                            }
                            rVar2.d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == rVar2);
                    if (mVar3.e()) {
                        mVar3.d();
                    }
                }
            }
            if (j11 <= j) {
                return mVar3;
            }
            long j12 = j11 * ((long) g.f5855b);
            do {
                j10 = f5845t.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!f5845t.compareAndSet(this, j10, j12));
            if (j11 * ((long) g.f5855b) < t()) {
                mVar3.a();
            }
        }
        return null;
    }

    public final Throwable q() {
        return (Throwable) f5851z.get(this);
    }

    public final Throwable r() {
        Throwable thQ = q();
        return thQ == null ? new n("Channel was closed") : thQ;
    }

    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new o("Channel was closed") : thQ;
    }

    public final long t() {
        return f5844s.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i10 = (int) (f5844s.get(this) >> 60);
        if (i10 == 2) {
            sb.append("closed,");
        } else if (i10 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f5852r + ',');
        sb.append("data=[");
        int i11 = 0;
        boolean z10 = true;
        List listS = p120l9.l.S(new m[]{f5849x.get(this), f5848w.get(this), f5850y.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (((m) obj) != g.f5854a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((m) next).f6802c;
            do {
                Object next2 = it.next();
                long j10 = ((m) next2).f6802c;
                if (j > j10) {
                    next = next2;
                    j = j10;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long j11 = f5845t.get(this);
        long jT = t();
        loop2: while (true) {
            int i12 = g.f5855b;
            int i13 = i11;
            while (i13 < i12) {
                long j12 = (mVar.f6802c * ((long) g.f5855b)) + ((long) i13);
                if (j12 >= jT && j12 >= j11) {
                    break loop2;
                }
                Object objK = mVar.k(i13);
                boolean z11 = z10;
                Object obj2 = mVar.f5878f.get(i13 * 2);
                if (objK instanceof InterfaceC0388f) {
                    string = (j12 >= j11 || j12 < jT) ? (j12 >= jT || j12 < j11) ? "cont" : "send" : "receive";
                } else if (objK instanceof t) {
                    string = "receiveCatching";
                } else if (objK instanceof w) {
                    string = "EB(" + objK + ')';
                } else if (p251z9.j.a(objK, g.f5859f) || p251z9.j.a(objK, g.g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !objK.equals(g.f5858e) && !objK.equals(g.f5861i) && !objK.equals(g.f5860h) && !objK.equals(g.f5862k) && !objK.equals(g.j) && !objK.equals(g.f5863l)) {
                        string = objK.toString();
                    }
                    i13++;
                    z10 = z11;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i13++;
                z10 = z11;
            }
            boolean z12 = z10;
            mVar = (m) mVar.b();
            if (mVar == null) {
                break;
            }
            z10 = z12;
            i11 = 0;
        }
        if (H9.o.f1(sb) == ',') {
            p251z9.j.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean v(long j, boolean z10) {
        int i10 = (int) (j >> 60);
        if (i10 != 0 && i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5845t;
            if (i10 == 2) {
                m(1152921504606846975L & j);
                if (z10) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5849x;
                        m mVarP = (m) atomicReferenceFieldUpdater.get(this);
                        long j10 = atomicLongFieldUpdater.get(this);
                        if (t() <= j10) {
                            break;
                        }
                        long j11 = g.f5855b;
                        long j12 = j10 / j11;
                        if (mVarP.f6802c != j12 && (mVarP = p(j12, mVarP)) == null) {
                            if (((m) atomicReferenceFieldUpdater.get(this)).f6802c < j12) {
                                break;
                            }
                        } else {
                            mVarP.a();
                            int i11 = (int) (j10 % j11);
                            while (true) {
                                Object objK = mVarP.k(i11);
                                if (objK != null && objK != g.f5858e) {
                                    if (objK != g.f5857d && (objK == g.j || objK == g.f5863l || objK == g.f5861i || objK == g.f5860h || (objK != g.g && (objK == g.f5859f || j10 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (mVarP.j(i11, objK, g.f5860h)) {
                                    o();
                                    break;
                                }
                            }
                            f5845t.compareAndSet(this, j10, j10 + 1);
                        }
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException(p123m2.c.r(i10, "unexpected close status: ").toString());
                }
                m mVarM = m(1152921504606846975L & j);
                Object objF = null;
                loop0: do {
                    for (int i12 = g.f5855b - 1; -1 < i12; i12--) {
                        long j13 = (mVarM.f6802c * ((long) g.f5855b)) + ((long) i12);
                        while (true) {
                            Object objK2 = mVarM.k(i12);
                            if (objK2 == g.f5861i) {
                                break loop0;
                            }
                            if (objK2 != g.f5857d) {
                                if (objK2 != g.f5858e && objK2 != null) {
                                    if (!(objK2 instanceof x0) && !(objK2 instanceof w)) {
                                        P9.t tVar = g.g;
                                        if (objK2 == tVar || objK2 == g.f5859f) {
                                            break loop0;
                                        }
                                        if (objK2 != tVar) {
                                            break;
                                        }
                                    } else {
                                        if (j13 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        x0 x0Var = objK2 instanceof w ? ((w) objK2).f5885a : (x0) objK2;
                                        if (mVarM.j(i12, objK2, g.f5863l)) {
                                            objF = P9.b.f(objF, x0Var);
                                            mVarM.m(i12, null);
                                            mVarM.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (mVarM.j(i12, objK2, g.f5863l)) {
                                        mVarM.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (mVarM.j(i12, objK2, g.f5863l)) {
                                    mVarM.m(i12, null);
                                    mVarM.h();
                                    break;
                                }
                            }
                        }
                    }
                    mVarM = (m) ((P9.c) P9.c.f6771b.get(mVarM));
                } while (mVarM != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            E((x0) arrayList.get(size), false);
                        }
                    } else {
                        E((x0) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean w() {
        return v(f5844s.get(this), true);
    }

    public final boolean x() {
        return v(f5844s.get(this), false);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j = f5846u.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }
}
