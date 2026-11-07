package na;

import E2.RunnableC0147v;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import la.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f20045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f20046l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X4.c f20047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f20048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20052f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f20053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f20054i;
    public final RunnableC0147v j;

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        j.d(logger, "getLogger(...)");
        f20045k = logger;
        String str = e.f19452b + " TaskRunner";
        j.e(str, "name");
        la.d dVar = new la.d(str, true);
        X4.c cVar = new X4.c();
        cVar.f9953r = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), dVar);
        f20046l = new d(cVar);
    }

    public d(X4.c cVar) {
        Logger logger = f20045k;
        j.e(logger, "logger");
        this.f20047a = cVar;
        this.f20048b = logger;
        this.f20049c = 10000;
        this.f20053h = new ArrayList();
        this.f20054i = new ArrayList();
        this.j = new RunnableC0147v(25, this);
    }

    public static final void a(d dVar, a aVar, long j, boolean z10) {
        TimeZone timeZone = e.f19451a;
        c cVar = aVar.f20035c;
        j.b(cVar);
        if (cVar.f20042d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z11 = cVar.f20044f;
        cVar.f20044f = false;
        cVar.f20042d = null;
        dVar.f20053h.remove(cVar);
        if (j != -1 && !z11 && !cVar.f20041c) {
            cVar.e(aVar, j, true);
        }
        if (cVar.f20043e.isEmpty()) {
            return;
        }
        dVar.f20054i.add(cVar);
        if (z10) {
            return;
        }
        dVar.e();
    }

    public final a b() {
        long j;
        a aVar;
        boolean z10;
        TimeZone timeZone = e.f19451a;
        while (true) {
            ArrayList arrayList = this.f20054i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i10 = 0;
            a aVar2 = null;
            while (true) {
                if (i10 >= size) {
                    j = jNanoTime;
                    aVar = null;
                    z10 = false;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                a aVar3 = (a) ((c) obj).f20043e.get(0);
                j = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.f20036d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z10 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.f20053h;
            if (aVar2 != null) {
                TimeZone timeZone2 = e.f19451a;
                aVar2.f20036d = -1L;
                c cVar = aVar2.f20035c;
                j.b(cVar);
                cVar.f20043e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f20042d = aVar2;
                arrayList2.add(cVar);
                if (z10 || (!this.f20050d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            }
            if (this.f20050d) {
                if (jMin >= this.f20051e - j) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f20050d = true;
            this.f20051e = j + jMin;
            try {
                try {
                    TimeZone timeZone3 = e.f19451a;
                    if (jMin > 0) {
                        long j10 = jMin / 1000000;
                        Long.signum(j10);
                        long j11 = jMin - (1000000 * j10);
                        if (j10 > 0 || jMin > 0) {
                            wait(j10, (int) j11);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = e.f19451a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.f20043e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
                this.f20050d = false;
            } catch (Throwable th) {
                this.f20050d = false;
                throw th;
            }
        }
    }

    public final void c(c cVar) {
        j.e(cVar, "taskQueue");
        TimeZone timeZone = e.f19451a;
        if (cVar.f20042d == null) {
            boolean zIsEmpty = cVar.f20043e.isEmpty();
            ArrayList arrayList = this.f20054i;
            if (zIsEmpty) {
                arrayList.remove(cVar);
            } else {
                byte[] bArr = la.c.f19448a;
                j.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.f20050d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i10;
        synchronized (this) {
            i10 = this.f20049c;
            this.f20049c = i10 + 1;
        }
        return new c(this, p123m2.c.r(i10, "Q"));
    }

    public final void e() {
        TimeZone timeZone = e.f19451a;
        int i10 = this.f20052f;
        if (i10 > this.g) {
            return;
        }
        this.f20052f = i10 + 1;
        RunnableC0147v runnableC0147v = this.j;
        j.e(runnableC0147v, "runnable");
        ((ThreadPoolExecutor) this.f20047a.f9953r).execute(runnableC0147v);
    }
}
