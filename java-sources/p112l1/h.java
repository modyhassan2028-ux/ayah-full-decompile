package p112l1;

import E6.s;
import F9.n;
import android.support.v4.media.session.p;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p039d8.a;
import p039d8.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f19367u = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f19368v = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final n f19369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f19370x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Object f19371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile d f19372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile g f19373t;

    static {
        n fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "t"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "s"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "r"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f19369w = fVar;
        if (th != null) {
            f19368v.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f19370x = new Object();
    }

    public static void d(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f19373t;
        } while (!f19369w.i(hVar, gVar, g.f19364c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f19365a;
            if (thread != null) {
                gVar.f19365a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f19366b;
        }
        hVar.c();
        do {
            dVar2 = hVar.f19372s;
        } while (!f19369w.g(hVar, dVar2, d.f19357d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f19360c;
            dVar.f19360c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f19360c;
            e(dVar3.f19358a, dVar3.f19359b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f19368v.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f19354b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f19356a);
        }
        if (obj == f19370x) {
            return null;
        }
        return obj;
    }

    public static Object g(h hVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // p039d8.b
    public final void a(a aVar, s sVar) {
        d dVar = this.f19372s;
        d dVar2 = d.f19357d;
        if (dVar != dVar2) {
            d dVar3 = new d(aVar, sVar);
            do {
                dVar3.f19360c = dVar;
                if (f19369w.g(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f19372s;
                }
            } while (dVar != dVar2);
        }
        e(aVar, sVar);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.f19371r;
        if (obj == null) {
            if (f19367u) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z10);
            } else {
                aVar = z10 ? a.f19351c : a.f19352d;
            }
            if (f19369w.h(this, obj, aVar)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        g gVar = g.f19364c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f19371r;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f19373t;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                while (true) {
                    n nVar = f19369w;
                    nVar.O(gVar3, gVar2);
                    if (nVar.i(this, gVar2, gVar3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f19371r;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                i(gVar3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        gVar2 = this.f19373t;
                        if (gVar2 == gVar) {
                        }
                    }
                }
            }
            return f(this.f19371r);
        }
        while (nanos > 0) {
            Object obj3 = this.f19371r;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strZ = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strZ2 = p.z(strZ, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strZ3 = strZ2 + jConvert + " " + lowerCase;
                if (z10) {
                    strZ3 = p.z(strZ3, ",");
                }
                strZ2 = p.z(strZ3, " ");
            }
            if (z10) {
                strZ2 = strZ2 + nanos2 + " nanoseconds ";
            }
            strZ = p.z(strZ2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(p.z(strZ, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strZ + " for " + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(g gVar) {
        gVar.f19365a = null;
        while (true) {
            g gVar2 = this.f19373t;
            if (gVar2 == g.f19364c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f19366b;
                if (gVar2.f19365a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f19366b = gVar4;
                    if (gVar3.f19365a == null) {
                    }
                } else if (!f19369w.i(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19371r instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19371r != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f19370x;
        }
        if (!f19369w.h(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f19369w.h(this, null, new c(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f19371r instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e10) {
                strH = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.f19364c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f19371r;
            if (obj2 != null) {
                return f(obj2);
            }
            g gVar2 = this.f19373t;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    n nVar = f19369w;
                    nVar.O(gVar3, gVar2);
                    if (nVar.i(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f19371r;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    gVar2 = this.f19373t;
                } while (gVar2 != gVar);
            }
            return f(this.f19371r);
        }
        throw new InterruptedException();
    }
}
