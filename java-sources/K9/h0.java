package K9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements a0, n0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5371r = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5372s = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public h0(boolean z10) {
        this._state$volatile = z10 ? AbstractC0405x.j : AbstractC0405x.f5415i;
    }

    public static C0393k T(P9.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P9.j.f6788s;
            P9.j jVarF = jVar.f();
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (P9.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof C0393k) {
                    return (C0393k) jVar;
                }
                if (jVar instanceof j0) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (!(obj instanceof g0)) {
            if (obj instanceof X) {
                return ((X) obj).b() ? "Active" : "New";
            }
            return obj instanceof C0397o ? "Cancelled" : "Completed";
        }
        g0 g0Var = (g0) obj;
        if (g0Var.e()) {
            return "Cancelling";
        }
        return g0.f5366s.get(g0Var) == 1 ? "Completing" : "Active";
    }

    @Override // p150o9.h
    public final p150o9.h A(p150o9.g gVar) {
        return Y2.a.Y(this, gVar);
    }

    public final Object B() throws Throwable {
        Object obj = f5371r.get(this);
        if (obj instanceof X) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0397o) {
            throw ((C0397o) obj).f5385a;
        }
        return AbstractC0405x.G(obj);
    }

    public final Throwable C(g0 g0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (g0Var.e()) {
                return new b0(u(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        do {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof r0) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof r0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean D() {
        return true;
    }

    @Override // K9.a0
    public final CancellationException E() {
        CancellationException cancellationException;
        Object obj = f5371r.get(this);
        if (!(obj instanceof g0)) {
            if (obj instanceof X) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0397o)) {
                return new b0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0397o) obj).f5385a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new b0(u(), th, this) : cancellationException;
        }
        Throwable thC = ((g0) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = u();
        }
        return new b0(strConcat, thC, this);
    }

    @Override // p150o9.h
    public final Object F(Object obj, p241y9.e eVar) {
        return eVar.invoke(obj, this);
    }

    public boolean G() {
        return this instanceof C0395m;
    }

    public final j0 H(X x9) {
        j0 j0VarD = x9.d();
        if (j0VarD != null) {
            return j0VarD;
        }
        if (x9 instanceof L) {
            return new j0();
        }
        if (x9 instanceof d0) {
            a0((d0) x9);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + x9).toString());
    }

    public boolean I(Throwable th) {
        return false;
    }

    public final void K(a0 a0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5372s;
        l0 l0Var = l0.f5378r;
        if (a0Var == null) {
            atomicReferenceFieldUpdater.set(this, l0Var);
            return;
        }
        a0Var.start();
        InterfaceC0392j interfaceC0392jN = a0Var.n(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0392jN);
        if (N()) {
            interfaceC0392jN.a();
            atomicReferenceFieldUpdater.set(this, l0Var);
        }
    }

    @Override // p150o9.h
    public final p150o9.h L(p150o9.h hVar) {
        return Y2.a.Z(this, hVar);
    }

    public final J M(boolean z10, d0 d0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z11;
        boolean zE;
        d0Var.f5353u = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f5371r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof L;
            l0 l0Var = l0.f5378r;
            z11 = true;
            if (!z12) {
                if (!(obj instanceof X)) {
                    z11 = false;
                    break;
                }
                X x9 = (X) obj;
                j0 j0VarD = x9.d();
                if (j0VarD == null) {
                    a0((d0) obj);
                } else {
                    if (d0Var.k()) {
                        g0 g0Var = x9 instanceof g0 ? (g0) x9 : null;
                        Throwable thC = g0Var != null ? g0Var.c() : null;
                        if (thC == null) {
                            zE = j0VarD.e(d0Var, 5);
                        } else if (z10) {
                            d0Var.l(thC);
                            return l0Var;
                        }
                    } else {
                        zE = j0VarD.e(d0Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                L l10 = (L) obj;
                if (l10.f5326r) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    Z(l10);
                }
            }
            return l0Var;
        }
        if (z11) {
            return d0Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0397o c0397o = obj2 instanceof C0397o ? (C0397o) obj2 : null;
            d0Var.l(c0397o != null ? c0397o.f5385a : null);
        }
        return l0Var;
    }

    public final boolean N() {
        return !(f5371r.get(this) instanceof X);
    }

    public boolean P() {
        return this instanceof C0385c;
    }

    public final boolean Q(Object obj) {
        Object objE0;
        do {
            objE0 = e0(f5371r.get(this), obj);
            if (objE0 == AbstractC0405x.f5411d) {
                return false;
            }
            if (objE0 == AbstractC0405x.f5412e) {
                return true;
            }
        } while (objE0 == AbstractC0405x.f5413f);
        m(objE0);
        return true;
    }

    public final Object R(Object obj) {
        Object objE0;
        do {
            objE0 = e0(f5371r.get(this), obj);
            if (objE0 == AbstractC0405x.f5411d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0397o c0397o = obj instanceof C0397o ? (C0397o) obj : null;
                throw new IllegalStateException(str, c0397o != null ? c0397o.f5385a : null);
            }
        } while (objE0 == AbstractC0405x.f5413f);
        return objE0;
    }

    public String S() {
        return getClass().getSimpleName();
    }

    public final void U(j0 j0Var, Throwable th) {
        j0Var.e(new P9.i(4), 4);
        Object obj = P9.j.f6787r.get(j0Var);
        p251z9.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        A6.a aVar = null;
        for (P9.j jVarH = (P9.j) obj; !jVarH.equals(j0Var); jVarH = jVarH.h()) {
            if ((jVarH instanceof d0) && ((d0) jVarH).k()) {
                try {
                    ((d0) jVarH).l(th);
                } catch (Throwable th2) {
                    if (aVar != null) {
                        p110k9.a.a(aVar, th2);
                    } else {
                        aVar = new A6.a("Exception in completion handler " + jVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (aVar != null) {
            J(aVar);
        }
        t(th);
    }

    @Override // K9.a0
    public final J V(boolean z10, boolean z11, E5.c cVar) {
        return M(z11, z10 ? new Z(cVar) : new K(1, cVar));
    }

    public final void Z(L l10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j0 j0Var = new j0();
        Object w9 = j0Var;
        if (!l10.f5326r) {
            w9 = new W(j0Var);
        }
        do {
            atomicReferenceFieldUpdater = f5371r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l10, w9)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l10);
    }

    public final void a0(d0 d0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j0 j0Var = new j0();
        d0Var.getClass();
        P9.j.f6788s.set(j0Var, d0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = P9.j.f6787r;
        atomicReferenceFieldUpdater2.set(j0Var, d0Var);
        loop0: while (atomicReferenceFieldUpdater2.get(d0Var) == d0Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(d0Var, d0Var, j0Var)) {
                    j0Var.g(d0Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(d0Var) == d0Var);
        }
        P9.j jVarH = d0Var.h();
        do {
            atomicReferenceFieldUpdater = f5371r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, d0Var, jVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == d0Var);
    }

    @Override // K9.a0
    public boolean b() {
        Object obj = f5371r.get(this);
        return (obj instanceof X) && ((X) obj).b();
    }

    public final int c0(Object obj) {
        boolean z10 = obj instanceof L;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5371r;
        if (z10) {
            if (((L) obj).f5326r) {
                return 0;
            }
            L l10 = AbstractC0405x.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l10)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Y();
            return 1;
        }
        if (!(obj instanceof W)) {
            return 0;
        }
        j0 j0Var = ((W) obj).f5342r;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Y();
        return 1;
    }

    @Override // K9.a0
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new b0(u(), null, this);
        }
        r(cancellationException);
    }

    public final Object e0(Object obj, Object obj2) {
        if (!(obj instanceof X)) {
            return AbstractC0405x.f5411d;
        }
        if (((obj instanceof L) || (obj instanceof d0)) && !(obj instanceof C0393k) && !(obj2 instanceof C0397o)) {
            X x9 = (X) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5371r;
            Object y10 = obj2 instanceof X ? new Y((X) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, x9, y10)) {
                if (atomicReferenceFieldUpdater.get(this) != x9) {
                    return AbstractC0405x.f5413f;
                }
            }
            W(obj2);
            x(x9, obj2);
            return obj2;
        }
        X x10 = (X) obj;
        j0 j0VarH = H(x10);
        if (j0VarH == null) {
            return AbstractC0405x.f5413f;
        }
        g0 g0Var = x10 instanceof g0 ? (g0) x10 : null;
        if (g0Var == null) {
            g0Var = new g0(j0VarH, null);
        }
        synchronized (g0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g0.f5366s;
            if (atomicIntegerFieldUpdater.get(g0Var) == 1) {
                return AbstractC0405x.f5411d;
            }
            atomicIntegerFieldUpdater.set(g0Var, 1);
            if (g0Var != x10) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5371r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, x10, g0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != x10) {
                        return AbstractC0405x.f5413f;
                    }
                }
            }
            boolean zE = g0Var.e();
            C0397o c0397o = obj2 instanceof C0397o ? (C0397o) obj2 : null;
            if (c0397o != null) {
                g0Var.a(c0397o.f5385a);
            }
            Throwable thC = zE ? null : g0Var.c();
            if (thC != null) {
                U(j0VarH, thC);
            }
            C0393k c0393kT = T(j0VarH);
            if (c0393kT != null && f0(g0Var, c0393kT, obj2)) {
                return AbstractC0405x.f5412e;
            }
            j0VarH.e(new P9.i(2), 2);
            C0393k c0393kT2 = T(j0VarH);
            return (c0393kT2 == null || !f0(g0Var, c0393kT2, obj2)) ? z(g0Var, obj2) : AbstractC0405x.f5412e;
        }
    }

    public final boolean f0(g0 g0Var, C0393k c0393k, Object obj) {
        while (AbstractC0405x.t(c0393k.f5376v, false, new f0(this, g0Var, c0393k, obj)) == l0.f5378r) {
            c0393k = T(c0393k);
            if (c0393k == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p150o9.f
    public final p150o9.g getKey() {
        return r.f5392s;
    }

    @Override // p150o9.h
    public final p150o9.f i(p150o9.g gVar) {
        return Y2.a.y(this, gVar);
    }

    @Override // K9.a0
    public final boolean isCancelled() {
        Object obj = f5371r.get(this);
        if (obj instanceof C0397o) {
            return true;
        }
        return (obj instanceof g0) && ((g0) obj).e();
    }

    @Override // K9.a0
    public final InterfaceC0392j n(h0 h0Var) {
        C0393k c0393k = new C0393k(h0Var);
        c0393k.f5353u = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5371r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof L) {
                L l10 = (L) obj;
                if (l10.f5326r) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0393k)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                Z(l10);
            } else {
                boolean z10 = obj instanceof X;
                l0 l0Var = l0.f5378r;
                Throwable thC = null;
                if (!z10) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0397o c0397o = obj2 instanceof C0397o ? (C0397o) obj2 : null;
                    c0393k.l(c0397o != null ? c0397o.f5385a : null);
                    return l0Var;
                }
                j0 j0VarD = ((X) obj).d();
                if (j0VarD != null) {
                    if (j0VarD.e(c0393k, 7)) {
                        break;
                    }
                    boolean zE = j0VarD.e(c0393k, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof g0) {
                        thC = ((g0) obj3).c();
                    } else {
                        C0397o c0397o2 = obj3 instanceof C0397o ? (C0397o) obj3 : null;
                        if (c0397o2 != null) {
                            thC = c0397o2.f5385a;
                        }
                    }
                    c0393k.l(thC);
                    if (zE) {
                        break;
                    }
                    return l0Var;
                }
                a0((d0) obj);
            }
        }
        return c0393k;
    }

    public void o(Object obj) {
        m(obj);
    }

    public final Object p(q9.c cVar) throws Throwable {
        Object obj;
        do {
            obj = f5371r.get(this);
            if (!(obj instanceof X)) {
                if (obj instanceof C0397o) {
                    throw ((C0397o) obj).f5385a;
                }
                return AbstractC0405x.G(obj);
            }
        } while (c0(obj) < 0);
        e0 e0Var = new e0(AbstractC0813f2.H(cVar), this);
        e0Var.s();
        e0Var.v(new C0387e(2, AbstractC0405x.t(this, true, new K(2, e0Var))));
        return e0Var.r();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b4->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean q(Object obj) {
        Throwable thY;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z10;
        Throwable thC;
        P9.t tVar;
        X x9;
        j0 j0VarH;
        g0 g0Var;
        Object objE0;
        Object objE1 = AbstractC0405x.f5411d;
        if (G()) {
            do {
                Object obj3 = f5371r.get(this);
                if (obj3 instanceof X) {
                    if (obj3 instanceof g0) {
                        if (g0.f5366s.get((g0) obj3) == 1) {
                        }
                    }
                    objE1 = e0(obj3, new C0397o(y(obj), false));
                }
                objE1 = AbstractC0405x.f5411d;
                break;
            } while (objE1 == AbstractC0405x.f5413f);
            if (objE1 != AbstractC0405x.f5412e) {
                if (objE1 == AbstractC0405x.f5411d) {
                    thY = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f5371r;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof g0) {
                            synchronized (obj2) {
                                if (g0.f5368u.get((g0) obj2) == AbstractC0405x.f5414h) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    tVar = AbstractC0405x.g;
                                } else {
                                    boolean zE = ((g0) obj2).e();
                                    if (thY == null) {
                                        thY = y(obj);
                                    }
                                    ((g0) obj2).a(thY);
                                    thC = zE ? null : ((g0) obj2).c();
                                    if (thC != null) {
                                        U(((g0) obj2).f5369r, thC);
                                    }
                                    tVar = AbstractC0405x.f5411d;
                                }
                            }
                        } else if (obj2 instanceof X) {
                            if (thY == null) {
                                thY = y(obj);
                            }
                            x9 = (X) obj2;
                            if (x9.b()) {
                                j0VarH = H(x9);
                                if (j0VarH == null) {
                                    continue;
                                } else {
                                    g0Var = new g0(j0VarH, thY);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, x9, g0Var)) {
                                            U(j0VarH, thY);
                                            tVar = AbstractC0405x.f5411d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != x9) {
                                        }
                                    }
                                }
                            } else {
                                objE0 = e0(obj2, new C0397o(thY, false));
                                if (objE0 != AbstractC0405x.f5411d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objE0 != AbstractC0405x.f5413f) {
                                    objE1 = objE0;
                                    break;
                                }
                            }
                        } else {
                            tVar = AbstractC0405x.g;
                        }
                        objE1 = tVar;
                        break;
                    }
                }
                if (objE1 != AbstractC0405x.f5411d && objE1 != AbstractC0405x.f5412e) {
                    if (objE1 == AbstractC0405x.g) {
                        return false;
                    }
                    m(objE1);
                    return true;
                }
            }
        } else {
            if (objE1 == AbstractC0405x.f5411d) {
                thY = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f5371r;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof g0) {
                        synchronized (obj2) {
                            if (g0.f5368u.get((g0) obj2) == AbstractC0405x.f5414h) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                tVar = AbstractC0405x.g;
                            } else {
                                boolean zE2 = ((g0) obj2).e();
                                if (thY == null) {
                                    thY = y(obj);
                                }
                                ((g0) obj2).a(thY);
                                if (zE2) {
                                }
                                if (thC != null) {
                                    U(((g0) obj2).f5369r, thC);
                                }
                                tVar = AbstractC0405x.f5411d;
                            }
                        }
                    } else if (obj2 instanceof X) {
                        if (thY == null) {
                            thY = y(obj);
                        }
                        x9 = (X) obj2;
                        if (x9.b()) {
                            j0VarH = H(x9);
                            if (j0VarH == null) {
                                continue;
                            } else {
                                g0Var = new g0(j0VarH, thY);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, x9, g0Var)) {
                                        U(j0VarH, thY);
                                        tVar = AbstractC0405x.f5411d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != x9) {
                                    }
                                }
                            }
                        } else {
                            objE0 = e0(obj2, new C0397o(thY, false));
                            if (objE0 != AbstractC0405x.f5411d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objE0 != AbstractC0405x.f5413f) {
                                objE1 = objE0;
                                break;
                            }
                        }
                    } else {
                        tVar = AbstractC0405x.g;
                    }
                    objE1 = tVar;
                    break;
                }
            }
            if (objE1 != AbstractC0405x.f5411d) {
                if (objE1 == AbstractC0405x.g) {
                    return false;
                }
                m(objE1);
                return true;
            }
        }
        return true;
    }

    public void r(CancellationException cancellationException) {
        q(cancellationException);
    }

    @Override // K9.a0
    public final J s(p241y9.c cVar) {
        return M(true, new K(1, cVar));
    }

    @Override // K9.a0
    public final boolean start() {
        int iC0;
        do {
            iC0 = c0(f5371r.get(this));
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    public final boolean t(Throwable th) {
        if (P()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC0392j interfaceC0392j = (InterfaceC0392j) f5372s.get(this);
        if (interfaceC0392j == null || interfaceC0392j == l0.f5378r) {
            return z10;
        }
        return interfaceC0392j.c(th) || z10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(S() + '{' + d0(f5371r.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0405x.p(this));
        return sb.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && D();
    }

    @Override // K9.a0
    public final Object w(q9.c cVar) {
        Object obj;
        p110k9.y yVar;
        do {
            obj = f5371r.get(this);
            boolean z10 = obj instanceof X;
            yVar = p110k9.y.f19095a;
            if (!z10) {
                AbstractC0405x.l(cVar.getContext());
                return yVar;
            }
        } while (c0(obj) < 0);
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar));
        c0389g.s();
        c0389g.v(new C0387e(2, AbstractC0405x.t(this, true, new C0391i(c0389g, 1))));
        Object objR = c0389g.r();
        p161p9.a aVar = p161p9.a.f21156r;
        if (objR != aVar) {
            objR = yVar;
        }
        return objR == aVar ? objR : yVar;
    }

    public final void x(X x9, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5372s;
        InterfaceC0392j interfaceC0392j = (InterfaceC0392j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0392j != null) {
            interfaceC0392j.a();
            atomicReferenceFieldUpdater.set(this, l0.f5378r);
        }
        A6.a aVar = null;
        C0397o c0397o = obj instanceof C0397o ? (C0397o) obj : null;
        Throwable th = c0397o != null ? c0397o.f5385a : null;
        if (x9 instanceof d0) {
            try {
                ((d0) x9).l(th);
                return;
            } catch (Throwable th2) {
                J(new A6.a("Exception in completion handler " + x9 + " for " + this, th2));
                return;
            }
        }
        j0 j0VarD = x9.d();
        if (j0VarD != null) {
            j0VarD.e(new P9.i(1), 1);
            Object obj2 = P9.j.f6787r.get(j0VarD);
            p251z9.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (P9.j jVarH = (P9.j) obj2; !jVarH.equals(j0VarD); jVarH = jVarH.h()) {
                if (jVarH instanceof d0) {
                    try {
                        ((d0) jVarH).l(th);
                    } catch (Throwable th3) {
                        if (aVar != null) {
                            p110k9.a.a(aVar, th3);
                        } else {
                            aVar = new A6.a("Exception in completion handler " + jVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (aVar != null) {
                J(aVar);
            }
        }
    }

    public final Throwable y(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        h0 h0Var = (h0) ((n0) obj);
        Object obj2 = f5371r.get(h0Var);
        if (obj2 instanceof g0) {
            thC = ((g0) obj2).c();
        } else if (obj2 instanceof C0397o) {
            thC = ((C0397o) obj2).f5385a;
        } else {
            if (obj2 instanceof X) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new b0("Parent job is ".concat(d0(obj2)), thC, h0Var) : cancellationException;
    }

    public final Object z(g0 g0Var, Object obj) {
        Throwable thC;
        C0397o c0397o = obj instanceof C0397o ? (C0397o) obj : null;
        Throwable th = c0397o != null ? c0397o.f5385a : null;
        synchronized (g0Var) {
            g0Var.e();
            ArrayList arrayListF = g0Var.f(th);
            thC = C(g0Var, arrayListF);
            if (thC != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayListF.get(i10);
                    i10++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thC && th2 != thC && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        p110k9.a.a(thC, th2);
                    }
                }
            }
        }
        if (thC != null && thC != th) {
            obj = new C0397o(thC, false);
        }
        if (thC != null && (t(thC) || I(thC))) {
            p251z9.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0397o.f5384b.compareAndSet((C0397o) obj, 0, 1);
        }
        W(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5371r;
        Object y10 = obj instanceof X ? new Y((X) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, g0Var, y10) && atomicReferenceFieldUpdater.get(this) == g0Var) {
        }
        x(g0Var, obj);
        return obj;
    }

    public void Y() {
    }

    public void J(A6.a aVar) {
        throw aVar;
    }

    public void W(Object obj) {
    }

    public void m(Object obj) {
    }
}
