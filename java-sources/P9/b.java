package P9;

import K9.AbstractC0399q;
import K9.AbstractC0405x;
import K9.C0397o;
import K9.D;
import K9.InterfaceC0400s;
import K9.S;
import K9.a0;
import K9.q0;
import K9.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f6764a = new t("CLOSED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f6765b = new t("UNDEFINED", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f6766c = new t("REUSABLE_CLAIMED", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f6767d = new t("NO_THREAD_ELEMENTS", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D4.j f6768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D4.j f6769f;
    public static final D4.j g;

    static {
        byte b5 = 0;
        f6768e = new D4.j(15, b5);
        f6769f = new D4.j(16, b5);
        g = new D4.j(17, b5);
    }

    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(p123m2.c.r(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j, p241y9.e eVar) {
        while (true) {
            if (rVar.f6802c >= j && !rVar.c()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f6770a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            t tVar = f6764a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) eVar.invoke(Long.valueOf(rVar.f6802c + 1), rVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                        if (rVar.c()) {
                            rVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(rVar) == null);
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f6764a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, p150o9.h hVar) {
        Throwable runtimeException;
        Iterator it = e.f6773a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0400s) it.next()).X(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    p110k9.a.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            p110k9.a.a(th, new f(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f6764a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(p150o9.h hVar, Object obj) {
        if (obj == f6767d) {
            return;
        }
        if (!(obj instanceof y)) {
            Object objF = hVar.F(null, f6769f);
            p251z9.j.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((v) objF).a(obj);
            return;
        }
        y yVar = (y) obj;
        v[] vVarArr = yVar.f6815c;
        int length = vVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            v vVar = vVarArr[length];
            p251z9.j.b(vVar);
            vVar.a(yVar.f6814b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    public static final void h(Object obj, p150o9.c cVar) throws D {
        if (!(cVar instanceof g)) {
            cVar.resumeWith(obj);
            return;
        }
        g gVar = (g) cVar;
        AbstractC0399q abstractC0399q = gVar.f6776u;
        q9.c cVar2 = gVar.f6777v;
        Throwable thA = p110k9.m.a(obj);
        Object c0397o = thA == null ? obj : new C0397o(thA, false);
        if (j(abstractC0399q, cVar2.getContext())) {
            gVar.f6778w = c0397o;
            gVar.f5321t = 1;
            i(abstractC0399q, cVar2.getContext(), gVar);
            return;
        }
        S sA = q0.a();
        if (sA.f5337t >= 4294967296L) {
            gVar.f6778w = c0397o;
            gVar.f5321t = 1;
            sA.h0(gVar);
            return;
        }
        sA.j0(true);
        try {
            a0 a0Var = (a0) cVar2.getContext().i(K9.r.f5392s);
            if (a0Var == null || a0Var.b()) {
                Object obj2 = gVar.f6779x;
                p150o9.h context = cVar2.getContext();
                Object objN = n(context, obj2);
                v0 v0VarH = objN != f6767d ? AbstractC0405x.H(cVar2, context, objN) : null;
                try {
                    cVar2.resumeWith(obj);
                    if (v0VarH == null || v0VarH.k0()) {
                        g(context, objN);
                    }
                } catch (Throwable th) {
                    if (v0VarH == null || v0VarH.k0()) {
                        g(context, objN);
                    }
                    throw th;
                }
            } else {
                gVar.resumeWith(p110k9.a.b(a0Var.E()));
            }
            while (sA.l0()) {
            }
        } catch (Throwable th2) {
            try {
                gVar.g(th2);
            } finally {
                sA.g0(true);
            }
        }
    }

    public static final void i(AbstractC0399q abstractC0399q, p150o9.h hVar, Runnable runnable) throws D {
        try {
            abstractC0399q.c0(hVar, runnable);
        } catch (Throwable th) {
            throw new D(th, abstractC0399q, hVar);
        }
    }

    public static final boolean j(AbstractC0399q abstractC0399q, p150o9.h hVar) throws D {
        try {
            return abstractC0399q.e0(hVar);
        } catch (Throwable th) {
            throw new D(th, abstractC0399q, hVar);
        }
    }

    public static final long k(long j, long j10, long j11, String str) {
        String property;
        int i10 = u.f6806a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lT0 = H9.v.T0(property);
        if (lT0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lT0.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int l(String str, int i10, int i11) {
        return (int) k(i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final Object m(p150o9.h hVar) {
        Object objF = hVar.F(0, f6768e);
        p251z9.j.b(objF);
        return objF;
    }

    public static final Object n(p150o9.h hVar, Object obj) {
        if (obj == null) {
            obj = m(hVar);
        }
        if (obj == 0) {
            return f6767d;
        }
        return obj instanceof Integer ? hVar.F(new y(((Number) obj).intValue(), hVar), g) : ((v) obj).c(hVar);
    }
}
