package K9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: K9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0389g extends F implements InterfaceC0388f, q9.d, x0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5361w = AtomicIntegerFieldUpdater.newUpdater(C0389g.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5362x = AtomicReferenceFieldUpdater.newUpdater(C0389g.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5363y = AtomicReferenceFieldUpdater.newUpdater(C0389g.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p150o9.c f5364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p150o9.h f5365v;

    public C0389g(int i10, p150o9.c cVar) {
        super(i10);
        this.f5364u = cVar;
        this.f5365v = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0384b.f5347a;
    }

    public static Object C(m0 m0Var, Object obj, int i10, p241y9.f fVar) {
        if (obj instanceof C0397o) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (fVar != null || (m0Var instanceof C0387e)) {
            return new C0396n(obj, m0Var instanceof C0387e ? (C0387e) m0Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(Object obj, int i10, p241y9.f fVar) throws D {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof m0)) {
                if (obj2 instanceof C0390h) {
                    C0390h c0390h = (C0390h) obj2;
                    if (C0390h.f5370c.compareAndSet(c0390h, 0, 1)) {
                        if (fVar != null) {
                            m(fVar, c0390h.f5385a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objC = C((m0) obj2, obj, i10, fVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!w()) {
                        o();
                    }
                    p(i10);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void B(AbstractC0399q abstractC0399q) {
        p150o9.c cVar = this.f5364u;
        P9.g gVar = cVar instanceof P9.g ? (P9.g) cVar : null;
        A(p110k9.y.f19095a, (gVar != null ? gVar.f6776u : null) == abstractC0399q ? 4 : this.f5321t, null);
    }

    @Override // K9.x0
    public final void a(P9.r rVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f5361w;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(rVar);
    }

    @Override // K9.F
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof m0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0397o) {
                return;
            }
            if (!(obj instanceof C0396n)) {
                cancellationException2 = cancellationException;
                C0396n c0396n = new C0396n(obj, (C0387e) null, (p241y9.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0396n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0396n c0396n2 = (C0396n) obj;
            if (c0396n2.f5383e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0396n c0396nA = C0396n.a(c0396n2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0396nA)) {
                    C0387e c0387e = c0396n2.f5380b;
                    if (c0387e != null) {
                        k(c0387e, cancellationException);
                    }
                    p241y9.f fVar = c0396n2.f5381c;
                    if (fVar != null) {
                        m(fVar, cancellationException, c0396n2.f5379a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // K9.InterfaceC0388f
    public final void c(Object obj, p241y9.f fVar) throws D {
        A(obj, this.f5321t, fVar);
    }

    @Override // K9.F
    public final p150o9.c d() {
        return this.f5364u;
    }

    @Override // K9.F
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // K9.F
    public final Object f(Object obj) {
        return obj instanceof C0396n ? ((C0396n) obj).f5379a : obj;
    }

    @Override // q9.d
    public final q9.d getCallerFrame() {
        p150o9.c cVar = this.f5364u;
        if (cVar instanceof q9.d) {
            return (q9.d) cVar;
        }
        return null;
    }

    @Override // p150o9.c
    public final p150o9.h getContext() {
        return this.f5365v;
    }

    @Override // K9.InterfaceC0388f
    public final boolean h(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof m0)) {
                return false;
            }
            boolean z10 = (obj instanceof C0387e) || (obj instanceof P9.r);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0390h c0390h = new C0390h(cancellationException, z10);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0390h)) {
                    m0 m0Var = (m0) obj;
                    if (m0Var instanceof C0387e) {
                        k((C0387e) obj, th);
                    } else if (m0Var instanceof P9.r) {
                        n((P9.r) obj, th);
                    }
                    if (!w()) {
                        o();
                    }
                    p(this.f5321t);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // K9.F
    public final Object i() {
        return f5362x.get(this);
    }

    @Override // K9.InterfaceC0388f
    public final P9.t j(Object obj, p241y9.f fVar) {
        P9.t tVar = AbstractC0405x.f5408a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof m0)) {
                return null;
            }
            Object objC = C((m0) obj2, obj, this.f5321t, fVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!w()) {
                        o();
                    }
                    return tVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void k(C0387e c0387e, Throwable th) {
        try {
            switch (c0387e.f5354a) {
                case 0:
                    ((ScheduledFuture) c0387e.f5355b).cancel(false);
                    break;
                case 1:
                    ((p241y9.c) c0387e.f5355b).e(th);
                    break;
                default:
                    ((J) c0387e.f5355b).a();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC0405x.s(new A6.a("Exception in invokeOnCancellation handler for " + this, th2), this.f5365v);
        }
    }

    @Override // K9.InterfaceC0388f
    public final void l(Object obj) throws D {
        p(this.f5321t);
    }

    public final void m(p241y9.f fVar, Throwable th, Object obj) {
        p150o9.h hVar = this.f5365v;
        try {
            fVar.d(th, obj, hVar);
        } catch (Throwable th2) {
            AbstractC0405x.s(new A6.a("Exception in resume onCancellation handler for " + this, th2), hVar);
        }
    }

    public final void n(P9.r rVar, Throwable th) {
        p150o9.h hVar = this.f5365v;
        int i10 = f5361w.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i10, hVar);
        } catch (Throwable th2) {
            AbstractC0405x.s(new A6.a("Exception in invokeOnCancellation handler for " + this, th2), hVar);
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5363y;
        J j = (J) atomicReferenceFieldUpdater.get(this);
        if (j == null) {
            return;
        }
        j.a();
        atomicReferenceFieldUpdater.set(this, l0.f5378r);
    }

    public final void p(int i10) throws D {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f5361w;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                p150o9.c cVar = this.f5364u;
                if (!z10 && (cVar instanceof P9.g)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f5321t;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        P9.g gVar = (P9.g) cVar;
                        AbstractC0399q abstractC0399q = gVar.f6776u;
                        p150o9.h context = gVar.f6777v.getContext();
                        if (P9.b.j(abstractC0399q, context)) {
                            P9.b.i(abstractC0399q, context, this);
                            return;
                        }
                        S sA = q0.a();
                        if (sA.f5337t >= 4294967296L) {
                            sA.h0(this);
                            return;
                        }
                        sA.j0(true);
                        try {
                            AbstractC0405x.B(this, cVar, true);
                            do {
                            } while (sA.l0());
                        } catch (Throwable th) {
                            try {
                                g(th);
                            } finally {
                                sA.g0(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC0405x.B(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable q(h0 h0Var) {
        return h0Var.E();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        a0 a0Var;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = f5361w;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW) {
                    z();
                }
                Object obj = f5362x.get(this);
                if (obj instanceof C0397o) {
                    throw ((C0397o) obj).f5385a;
                }
                int i12 = this.f5321t;
                if ((i12 != 1 && i12 != 2) || (a0Var = (a0) this.f5365v.i(r.f5392s)) == null || a0Var.b()) {
                    return f(obj);
                }
                CancellationException cancellationExceptionE = a0Var.E();
                b(cancellationExceptionE);
                throw cancellationExceptionE;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((J) f5363y.get(this)) == null) {
            t();
        }
        if (zW) {
            z();
        }
        return p161p9.a.f21156r;
    }

    @Override // p150o9.c
    public final void resumeWith(Object obj) {
        Throwable thA = p110k9.m.a(obj);
        if (thA != null) {
            obj = new C0397o(thA, false);
        }
        A(obj, this.f5321t, null);
    }

    public final void s() {
        J jT = t();
        if (jT == null || (f5362x.get(this) instanceof m0)) {
            return;
        }
        jT.a();
        f5363y.set(this, l0.f5378r);
    }

    public final J t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a0 a0Var = (a0) this.f5365v.i(r.f5392s);
        if (a0Var == null) {
            return null;
        }
        J jT = AbstractC0405x.t(a0Var, true, new C0391i(this, 0));
        do {
            atomicReferenceFieldUpdater = f5363y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, jT)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return jT;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC0405x.E(this.f5364u));
        sb.append("){");
        Object obj = f5362x.get(this);
        if (obj instanceof m0) {
            str = "Active";
        } else {
            str = obj instanceof C0390h ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0405x.p(this));
        return sb.toString();
    }

    public final void u(p241y9.c cVar) {
        v(new C0387e(1, cVar));
    }

    public final void v(m0 m0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0384b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof C0387e) || (obj instanceof P9.r)) {
                x(m0Var, obj);
                throw null;
            }
            if (obj instanceof C0397o) {
                C0397o c0397o = (C0397o) obj;
                if (!C0397o.f5384b.compareAndSet(c0397o, 0, 1)) {
                    x(m0Var, obj);
                    throw null;
                }
                if (obj instanceof C0390h) {
                    Throwable th = c0397o.f5385a;
                    if (m0Var instanceof C0387e) {
                        k((C0387e) m0Var, th);
                        return;
                    } else {
                        p251z9.j.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((P9.r) m0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0396n)) {
                if (m0Var instanceof P9.r) {
                    return;
                }
                p251z9.j.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0396n c0396n = new C0396n(obj, (C0387e) m0Var, (p241y9.f) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0396n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0396n c0396n2 = (C0396n) obj;
            if (c0396n2.f5380b != null) {
                x(m0Var, obj);
                throw null;
            }
            if (m0Var instanceof P9.r) {
                return;
            }
            p251z9.j.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0387e c0387e = (C0387e) m0Var;
            Throwable th2 = c0396n2.f5383e;
            if (th2 != null) {
                k(c0387e, th2);
                return;
            }
            C0396n c0396nA = C0396n.a(c0396n2, c0387e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0396nA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f5321t != 2) {
            return false;
        }
        p150o9.c cVar = this.f5364u;
        p251z9.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return P9.g.f6775y.get((P9.g) cVar) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        p150o9.c cVar = this.f5364u;
        Throwable th = null;
        P9.g gVar = cVar instanceof P9.g ? (P9.g) cVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P9.g.f6775y;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                P9.t tVar = P9.b.f6766c;
                if (obj != tVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar, tVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(gVar) == tVar);
            }
            if (th == null) {
                return;
            }
            o();
            h(th);
        }
    }
}
