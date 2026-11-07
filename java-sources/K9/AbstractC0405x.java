package K9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: K9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0405x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P9.t f5408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P9.t f5409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P9.t f5410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P9.t f5411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final P9.t f5412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P9.t f5413f;
    public static final P9.t g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P9.t f5414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L f5415i = new L(false);
    public static final L j = new L(true);

    static {
        int i10 = 0;
        f5408a = new P9.t("RESUME_TOKEN", i10);
        f5409b = new P9.t("REMOVED_TASK", i10);
        f5410c = new P9.t("CLOSED_EMPTY", i10);
        f5411d = new P9.t("COMPLETING_ALREADY", i10);
        f5412e = new P9.t("COMPLETING_WAITING_CHILDREN", i10);
        f5413f = new P9.t("COMPLETING_RETRY", i10);
        g = new P9.t("TOO_LATE_TO_CANCEL", i10);
        f5414h = new P9.t("SEALED", i10);
    }

    public static final Object A(Object obj) {
        return obj instanceof C0397o ? p110k9.a.b(((C0397o) obj).f5385a) : obj;
    }

    public static final void B(C0389g c0389g, p150o9.c cVar, boolean z10) {
        Object obj = C0389g.f5362x.get(c0389g);
        Throwable thE = c0389g.e(obj);
        Object objB = thE != null ? p110k9.a.b(thE) : c0389g.f(obj);
        if (!z10) {
            cVar.resumeWith(objB);
            return;
        }
        p251z9.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        P9.g gVar = (P9.g) cVar;
        q9.c cVar2 = gVar.f6777v;
        Object obj2 = gVar.f6779x;
        p150o9.h context = cVar2.getContext();
        Object objN = P9.b.n(context, obj2);
        v0 v0VarH = objN != P9.b.f6767d ? H(cVar2, context, objN) : null;
        try {
            cVar2.resumeWith(objB);
        } finally {
            if (v0VarH == null || v0VarH.k0()) {
                P9.b.g(context, objN);
            }
        }
    }

    public static final Object C(p150o9.h hVar, p241y9.e eVar) throws Throwable {
        S sA;
        p150o9.h hVarM;
        long jK0;
        Thread threadCurrentThread = Thread.currentThread();
        p150o9.g gVar = p150o9.d.f20379r;
        p150o9.e eVar2 = (p150o9.e) hVar.i(gVar);
        p150o9.i iVar = p150o9.i.f20380r;
        if (eVar2 == null) {
            sA = q0.a();
            hVarM = m(iVar, hVar.L(sA), true);
            R9.e eVar3 = H.f5322a;
            if (hVarM != eVar3 && hVarM.i(gVar) == null) {
                hVarM = hVarM.L(eVar3);
            }
        } else {
            if (eVar2 instanceof S) {
            }
            sA = (S) q0.f5390a.get();
            hVarM = m(iVar, hVar, true);
            R9.e eVar4 = H.f5322a;
            if (hVarM != eVar4 && hVarM.i(gVar) == null) {
                hVarM = hVarM.L(eVar4);
            }
        }
        C0385c c0385c = new C0385c(hVarM, threadCurrentThread, sA);
        c0385c.i0(EnumC0403v.f5401r, c0385c, eVar);
        S s10 = c0385c.f5350v;
        if (s10 != null) {
            int i10 = S.f5336w;
            s10.j0(false);
        }
        while (true) {
            if (s10 != null) {
                try {
                    jK0 = s10.k0();
                } catch (Throwable th) {
                    if (s10 != null) {
                        int i11 = S.f5336w;
                        s10.g0(false);
                    }
                    throw th;
                }
            } else {
                jK0 = Long.MAX_VALUE;
            }
            if (c0385c.N()) {
                break;
            }
            LockSupport.parkNanos(c0385c, jK0);
            if (Thread.interrupted()) {
                c0385c.q(new InterruptedException());
            }
        }
        if (s10 != null) {
            int i12 = S.f5336w;
            s10.g0(false);
        }
        Object objG = G(h0.f5371r.get(c0385c));
        C0397o c0397o = objG instanceof C0397o ? (C0397o) objG : null;
        if (c0397o == null) {
            return objG;
        }
        throw c0397o.f5385a;
    }

    public static final Object D(s0 s0Var, p241y9.e eVar) {
        t(s0Var, true, new K(0, o(s0Var.f6800u.getContext()).N(s0Var.f5394v, s0Var, s0Var.f5346t)));
        return va.g.Q(s0Var, false, s0Var, eVar);
    }

    public static final String E(p150o9.c cVar) {
        Object objB;
        if (cVar instanceof P9.g) {
            return ((P9.g) cVar).toString();
        }
        try {
            objB = cVar + '@' + p(cVar);
        } catch (Throwable th) {
            objB = p110k9.a.b(th);
        }
        if (p110k9.m.a(objB) != null) {
            objB = cVar.getClass().getName() + '@' + p(cVar);
        }
        return (String) objB;
    }

    public static final long F(long j10) {
        int i10 = I9.a.f3852u;
        boolean z10 = j10 > 0;
        if (z10) {
            long jF = I9.a.f(j10, p017b7.g.t0(999999L, I9.c.NANOSECONDS));
            return ((((int) jF) & 1) != 1 || I9.a.e(jF)) ? I9.a.g(jF, I9.c.MILLISECONDS) : jF >> 1;
        }
        if (z10) {
            throw new A6.a();
        }
        return 0L;
    }

    public static final Object G(Object obj) {
        X x9;
        Y y10 = obj instanceof Y ? (Y) obj : null;
        return (y10 == null || (x9 = y10.f5343a) == null) ? obj : x9;
    }

    public static final v0 H(p150o9.c cVar, p150o9.h hVar, Object obj) {
        v0 v0Var = null;
        if ((cVar instanceof q9.d) && hVar.i(w0.f5407r) != null) {
            q9.d callerFrame = (q9.d) cVar;
            while (!(callerFrame instanceof E) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof v0) {
                    v0Var = (v0) callerFrame;
                    break;
                }
            }
            if (v0Var != null) {
                v0Var.m0(hVar, obj);
            }
        }
        return v0Var;
    }

    public static final Object I(p150o9.h hVar, p241y9.e eVar, p150o9.c cVar) {
        p150o9.h context = cVar.getContext();
        p150o9.h hVarL = !((Boolean) hVar.F(Boolean.FALSE, new D4.j(7, (byte) 0))).booleanValue() ? context.L(hVar) : m(context, hVar, false);
        l(hVarL);
        if (hVarL == context) {
            P9.q qVar = new P9.q(cVar, hVarL);
            return va.g.Q(qVar, true, qVar, eVar);
        }
        p150o9.d dVar = p150o9.d.f20379r;
        if (p251z9.j.a(hVarL.i(dVar), context.i(dVar))) {
            v0 v0Var = new v0(cVar, hVarL);
            p150o9.h hVar2 = v0Var.f5346t;
            Object objN = P9.b.n(hVar2, null);
            try {
                return va.g.Q(v0Var, true, v0Var, eVar);
            } finally {
                P9.b.g(hVar2, objN);
            }
        }
        E e10 = new E(cVar, hVarL);
        try {
            P9.b.h(p110k9.y.f19095a, AbstractC0813f2.H(AbstractC0813f2.r(e10, e10, eVar)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E.f5320v;
            do {
                int i10 = atomicIntegerFieldUpdater.get(e10);
                if (i10 != 0) {
                    if (i10 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objG = G(h0.f5371r.get(e10));
                    if (objG instanceof C0397o) {
                        throw ((C0397o) objG).f5385a;
                    }
                    return objG;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(e10, 0, 1));
            return p161p9.a.f21156r;
        } catch (Throwable th) {
            th = th;
            if (th instanceof D) {
                th = ((D) th).f5319r;
            }
            e10.resumeWith(p110k9.a.b(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object J(long j10, p241y9.e eVar, q9.c cVar) {
        t0 t0Var;
        p251z9.v vVar;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i10 = t0Var.f5399t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t0Var.f5399t = i10 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(cVar);
            }
        } else {
            t0Var = new t0(cVar);
        }
        Object obj = t0Var.f5398s;
        int i11 = t0Var.f5399t;
        if (i11 == 0) {
            p110k9.a.e(obj);
            if (j10 <= 0) {
                return null;
            }
            p251z9.v vVar2 = new p251z9.v();
            try {
                t0Var.f5397r = vVar2;
                t0Var.f5399t = 1;
                s0 s0Var = new s0(j10, t0Var);
                vVar2.f24886r = s0Var;
                Object objD = D(s0Var, eVar);
                p161p9.a aVar = p161p9.a.f21156r;
                return objD == aVar ? aVar : objD;
            } catch (r0 e10) {
                e = e10;
                vVar = vVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = t0Var.f5397r;
            try {
                p110k9.a.e(obj);
                return obj;
            } catch (r0 e11) {
                e = e11;
            }
        }
        if (e.f5393r == vVar.f24886r) {
            return null;
        }
        throw e;
    }

    public static final Object K(q9.c cVar) {
        Object obj;
        p150o9.h context = cVar.getContext();
        l(context);
        p150o9.c cVarH = AbstractC0813f2.H(cVar);
        P9.g gVar = cVarH instanceof P9.g ? (P9.g) cVarH : null;
        p161p9.a aVar = p161p9.a.f21156r;
        p110k9.y yVar = p110k9.y.f19095a;
        if (gVar == null) {
            obj = yVar;
        } else {
            AbstractC0399q abstractC0399q = gVar.f6776u;
            if (P9.b.j(abstractC0399q, context)) {
                gVar.f6778w = yVar;
                gVar.f5321t = 1;
                abstractC0399q.d0(context, gVar);
            } else {
                p150o9.h hVarL = context.L(new y0(y0.f5418s));
                gVar.f6778w = yVar;
                gVar.f5321t = 1;
                abstractC0399q.d0(hVarL, gVar);
            }
            obj = aVar;
        }
        return obj == aVar ? obj : yVar;
    }

    public static C0395m a() {
        C0395m c0395m = new C0395m(true);
        c0395m.K(null);
        return c0395m;
    }

    public static final P9.d b(p150o9.h hVar) {
        if (hVar.i(r.f5392s) == null) {
            hVar = hVar.L(c());
        }
        return new P9.d(hVar);
    }

    public static c0 c() {
        return new c0(null);
    }

    public static final P9.d d() {
        p0 p0VarE = e();
        R9.e eVar = H.f5322a;
        return new P9.d(Y2.a.Z(p0VarE, P9.n.f6798a));
    }

    public static p0 e() {
        return new p0(null);
    }

    public static A f(P9.d dVar, p241y9.e eVar) {
        A a9 = new A(y(dVar, p150o9.i.f20380r), true, 0);
        a9.i0(EnumC0403v.f5401r, a9, eVar);
        return a9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void g(q9.c cVar) {
        C c10;
        if (cVar instanceof C) {
            c10 = (C) cVar;
            int i10 = c10.f5318s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10.f5318s = i10 - Integer.MIN_VALUE;
            } else {
                c10 = new C(cVar);
            }
        } else {
            c10 = new C(cVar);
        }
        Object obj = c10.f5317r;
        int i11 = c10.f5318s;
        if (i11 == 0) {
            p110k9.a.e(obj);
            c10.f5318s = 1;
            C0389g c0389g = new C0389g(1, AbstractC0813f2.H(c10));
            c0389g.s();
            if (c0389g.r() == p161p9.a.f21156r) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        throw new A6.a();
    }

    public static final void h(InterfaceC0402u interfaceC0402u, CancellationException cancellationException) {
        a0 a0Var = (a0) interfaceC0402u.getCoroutineContext().i(r.f5392s);
        if (a0Var != null) {
            a0Var.e(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0402u).toString());
        }
    }

    public static final Object i(a0 a0Var, q9.c cVar) {
        a0Var.e(null);
        Object objW = a0Var.w(cVar);
        return objW == p161p9.a.f21156r ? objW : p110k9.y.f19095a;
    }

    public static final Object j(p241y9.e eVar, p150o9.c cVar) {
        P9.q qVar = new P9.q(cVar, cVar.getContext());
        return va.g.Q(qVar, true, qVar, eVar);
    }

    public static final Object k(long j10, p150o9.c cVar) {
        if (j10 > 0) {
            C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar));
            c0389g.s();
            if (j10 < Long.MAX_VALUE) {
                o(c0389g.f5365v).H(j10, c0389g);
            }
            Object objR = c0389g.r();
            if (objR == p161p9.a.f21156r) {
                return objR;
            }
        }
        return p110k9.y.f19095a;
    }

    public static final void l(p150o9.h hVar) {
        a0 a0Var = (a0) hVar.i(r.f5392s);
        if (a0Var != null && !a0Var.b()) {
            throw a0Var.E();
        }
    }

    public static final p150o9.h m(p150o9.h hVar, p150o9.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.F(bool, new D4.j(7, (byte) 0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.F(bool, new D4.j(7, (byte) 0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.L(hVar2);
        }
        D4.j jVar = new D4.j(8, (byte) 0);
        p150o9.i iVar = p150o9.i.f20380r;
        p150o9.h hVar3 = (p150o9.h) hVar.F(iVar, jVar);
        Object objF = hVar2;
        if (zBooleanValue2) {
            objF = hVar2.F(iVar, new D4.j(9, (byte) 0));
        }
        return hVar3.L((p150o9.h) objF);
    }

    public static final AbstractC0399q n(Executor executor) {
        return new U(executor);
    }

    public static final B o(p150o9.h hVar) {
        p150o9.f fVarI = hVar.i(p150o9.d.f20379r);
        B b5 = fVarI instanceof B ? (B) fVarI : null;
        return b5 == null ? AbstractC0407z.f5419a : b5;
    }

    public static final String p(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final a0 q(p150o9.h hVar) {
        a0 a0Var = (a0) hVar.i(r.f5392s);
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final C0389g r(p150o9.c cVar) {
        C0389g c0389g;
        C0389g c0389g2;
        if (!(cVar instanceof P9.g)) {
            return new C0389g(1, cVar);
        }
        P9.g gVar = (P9.g) cVar;
        P9.t tVar = P9.b.f6766c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P9.g.f6775y;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            c0389g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, tVar);
                c0389g2 = null;
                break;
            }
            if (obj instanceof C0389g) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, tVar)) {
                        c0389g2 = (C0389g) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(gVar) == obj);
            } else if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0389g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0389g.f5362x;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0389g2);
            if (!(obj2 instanceof C0396n) || ((C0396n) obj2).f5382d == null) {
                C0389g.f5361w.set(c0389g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0389g2, C0384b.f5347a);
                c0389g = c0389g2;
            } else {
                c0389g2.o();
            }
            if (c0389g != null) {
                return c0389g;
            }
        }
        return new C0389g(2, cVar);
    }

    public static final void s(Throwable th, p150o9.h hVar) {
        if (th instanceof D) {
            th = ((D) th).f5319r;
        }
        try {
            InterfaceC0400s interfaceC0400s = (InterfaceC0400s) hVar.i(r.f5391r);
            if (interfaceC0400s != null) {
                interfaceC0400s.X(th);
            } else {
                P9.b.d(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                p110k9.a.a(runtimeException, th);
                th = runtimeException;
            }
            P9.b.d(th, hVar);
        }
    }

    public static final J t(a0 a0Var, boolean z10, d0 d0Var) {
        if (a0Var instanceof h0) {
            return ((h0) a0Var).M(z10, d0Var);
        }
        return a0Var.V(d0Var.k(), z10, new E5.c(1, d0Var, d0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 5));
    }

    public static final boolean u(InterfaceC0402u interfaceC0402u) {
        a0 a0Var = (a0) interfaceC0402u.getCoroutineContext().i(r.f5392s);
        if (a0Var != null) {
            return a0Var.b();
        }
        return true;
    }

    public static final boolean v(p150o9.h hVar) {
        a0 a0Var = (a0) hVar.i(r.f5392s);
        if (a0Var != null) {
            return a0Var.b();
        }
        return true;
    }

    public static final A w(InterfaceC0402u interfaceC0402u, p150o9.h hVar, EnumC0403v enumC0403v, p241y9.e eVar) {
        A a9;
        p150o9.h hVarY = y(interfaceC0402u, hVar);
        enumC0403v.getClass();
        if (enumC0403v == EnumC0403v.f5402s) {
            a9 = new i0(hVarY, eVar);
        } else {
            a9 = new A(hVarY, true, 1);
        }
        a9.i0(enumC0403v, a9, eVar);
        return a9;
    }

    public static /* synthetic */ A x(InterfaceC0402u interfaceC0402u, p150o9.h hVar, p241y9.e eVar, int i10) {
        if ((i10 & 1) != 0) {
            hVar = p150o9.i.f20380r;
        }
        return w(interfaceC0402u, hVar, (i10 & 2) != 0 ? EnumC0403v.f5401r : EnumC0403v.f5404u, eVar);
    }

    public static final p150o9.h y(InterfaceC0402u interfaceC0402u, p150o9.h hVar) {
        p150o9.h hVarM = m(interfaceC0402u.getCoroutineContext(), hVar, true);
        R9.e eVar = H.f5322a;
        return (hVarM == eVar || hVarM.i(p150o9.d.f20379r) != null) ? hVarM : hVarM.L(eVar);
    }

    public static final P9.d z(P9.d dVar, p150o9.f fVar) {
        return new P9.d(dVar.f6772r.L(fVar));
    }
}
