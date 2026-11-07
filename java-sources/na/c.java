package na;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import la.e;
import p251z9.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f20039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f20042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20044f;

    public c(d dVar, String str) {
        j.e(str, "name");
        this.f20039a = dVar;
        this.f20040b = str;
        this.f20043e = new ArrayList();
    }

    public static void c(c cVar, String str, p241y9.a aVar) {
        cVar.getClass();
        j.e(str, "name");
        j.e(aVar, "block");
        cVar.d(new b(str, aVar), 0L);
    }

    public final void a() {
        d dVar = this.f20039a;
        TimeZone timeZone = e.f19451a;
        synchronized (dVar) {
            if (b()) {
                this.f20039a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f20042d;
        if (aVar != null && aVar.f20034b) {
            this.f20044f = true;
        }
        ArrayList arrayList = this.f20043e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f20034b) {
                Logger logger = this.f20039a.f20048b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    g.f(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void d(a aVar, long j) {
        j.e(aVar, "task");
        synchronized (this.f20039a) {
            if (!this.f20041c) {
                if (e(aVar, j, false)) {
                    this.f20039a.c(this);
                }
            } else if (aVar.f20034b) {
                Logger logger = this.f20039a.f20048b;
                if (logger.isLoggable(Level.FINE)) {
                    g.f(logger, aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f20039a.f20048b;
                if (logger2.isLoggable(Level.FINE)) {
                    g.f(logger2, aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[LOOP:0: B:23:0x0065->B:27:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007b A[EDGE_INSN: B:39:0x007b->B:29:0x007b BREAK  A[LOOP:0: B:23:0x0065->B:27:0x0077], SYNTHETIC] */
    public final boolean e(a aVar, long j, boolean z10) {
        int size;
        int size2;
        int i10;
        Object obj;
        String strConcat;
        Logger logger = this.f20039a.f20048b;
        j.e(aVar, "task");
        c cVar = aVar.f20035c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f20035c = this;
        }
        long jNanoTime = System.nanoTime();
        long j10 = jNanoTime + j;
        ArrayList arrayList = this.f20043e;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf == -1) {
            aVar.f20036d = j10;
            if (logger.isLoggable(Level.FINE)) {
                if (z10) {
                    strConcat = "run again after ".concat(g.p(j10 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(g.p(j10 - jNanoTime));
                }
                g.f(logger, aVar, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i10 = 0;
            while (true) {
                if (i10 < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i10);
                i10++;
                if (((a) obj).f20036d - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, aVar);
            if (size2 == 0) {
                return true;
            }
        } else if (aVar.f20036d > j10) {
            arrayList.remove(iIndexOf);
            aVar.f20036d = j10;
            if (logger.isLoggable(Level.FINE)) {
                if (z10) {
                    strConcat = "run again after ".concat(g.p(j10 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(g.p(j10 - jNanoTime));
                }
                g.f(logger, aVar, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i10 = 0;
            while (true) {
                if (i10 < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i10);
                i10++;
                if (((a) obj).f20036d - jNanoTime > j) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, aVar);
            if (size2 == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            g.f(logger, aVar, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void f() {
        d dVar = this.f20039a;
        TimeZone timeZone = e.f19451a;
        synchronized (dVar) {
            this.f20041c = true;
            if (b()) {
                this.f20039a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f20040b;
    }
}
