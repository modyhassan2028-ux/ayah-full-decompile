package oa;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f20421A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f20422B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f20423C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f20424D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile Ca.r f20425E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final CopyOnWriteArrayList f20426F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ka.r f20427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final E6.u f20428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f20429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f20430u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f20431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f20432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g f20433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n f20434y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Ca.r f20435z;

    public m(ka.r rVar, E6.u uVar) {
        this.f20427r = rVar;
        this.f20428s = uVar;
        this.f20429t = (o) rVar.f19220A.f9953r;
        rVar.f19224d.getClass();
        l lVar = new l(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lVar.g(0);
        this.f20430u = lVar;
        this.f20431v = new AtomicBoolean();
        this.f20423C = true;
        this.f20426F = new CopyOnWriteArrayList();
    }

    public final IOException a(IOException iOException) {
        IOException interruptedIOException;
        Socket socketG;
        TimeZone timeZone = la.e.f19451a;
        n nVar = this.f20434y;
        if (nVar != null) {
            synchronized (nVar) {
                socketG = g();
            }
            if (this.f20434y == null) {
                if (socketG != null) {
                    la.e.b(socketG);
                }
            } else if (socketG != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f20430u.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            p251z9.j.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final ka.u b() {
        if (!this.f20431v.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f20430u.h();
        ua.e eVar = ua.e.f22996a;
        this.f20432w = ua.e.f22996a.h();
        try {
            Aa.a aVar = this.f20427r.f19221a;
            synchronized (aVar) {
                ((ArrayDeque) aVar.f557u).add(this);
            }
            ka.u uVarD = d();
            this.f20427r.f19221a.o(this);
            return uVarD;
        } catch (Throwable th) {
            this.f20427r.f19221a.o(this);
            throw th;
        }
    }

    public final void c(boolean z10) {
        Ca.r rVar;
        synchronized (this) {
            if (!this.f20423C) {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (rVar = this.f20425E) != null) {
            ((pa.d) rVar.f851e).cancel();
            ((m) rVar.f849c).e(rVar, true, true, null);
        }
        this.f20435z = null;
    }

    public final Object clone() {
        return new m(this.f20427r, this.f20428s);
    }

    public final ka.u d() {
        ArrayList arrayList = new ArrayList();
        p120l9.m.d0(arrayList, this.f20427r.f19222b);
        arrayList.add(new pa.a(this.f20427r));
        arrayList.add(new pa.a(this.f20427r.j));
        arrayList.add(new ma.a(0));
        arrayList.add(b.f20386a);
        p120l9.m.d0(arrayList, this.f20427r.f19223c);
        arrayList.add(new ma.a(1));
        E6.u uVar = this.f20428s;
        ka.r rVar = this.f20427r;
        try {
            try {
                ka.u uVarB = new pa.f(this, arrayList, 0, null, uVar, rVar.f19240v, rVar.f19241w, rVar.f19242x).b(uVar);
                if (this.f20424D) {
                    la.c.a(uVarB);
                    throw new IOException("Canceled");
                }
                f(null);
                return uVarB;
            } catch (IOException e10) {
                IOException iOExceptionF = f(e10);
                p251z9.j.c(iOExceptionF, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionF;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                f(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException e(Ca.r rVar, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        p251z9.j.e(rVar, "exchange");
        if (rVar.equals(this.f20425E)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (this.f20421A) {
                            if (z10) {
                                this.f20421A = false;
                            }
                            if (z11) {
                                this.f20422B = false;
                            }
                            z14 = this.f20421A;
                            if (z14) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (!z14) {
                                z12 = true;
                            }
                            z13 = z12;
                            z12 = z15;
                        } else if (z11 || !this.f20422B) {
                            z13 = false;
                        } else {
                            if (z10) {
                                this.f20421A = false;
                            }
                            if (z11) {
                                this.f20422B = false;
                            }
                            z14 = this.f20421A;
                            if (z14 || this.f20422B) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (!z14 && !this.f20422B && !this.f20423C) {
                                z12 = true;
                            }
                            z13 = z12;
                            z12 = z15;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                }
            }
            if (z12) {
                this.f20425E = null;
                n nVar = this.f20434y;
                if (nVar != null) {
                    nVar.d();
                }
            }
            if (z13) {
                return a(iOException);
            }
        }
        return iOException;
    }

    public final IOException f(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f20423C) {
                this.f20423C = false;
                if (!this.f20421A && !this.f20422B) {
                    z10 = true;
                }
            }
        }
        return z10 ? a(iOException) : iOException;
    }

    public final Socket g() {
        n nVar = this.f20434y;
        p251z9.j.b(nVar);
        TimeZone timeZone = la.e.f19451a;
        ArrayList arrayList = nVar.f20451s;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i10 = -1;
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            if (p251z9.j.a(((Reference) obj).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.f20434y = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        nVar.f20452t = System.nanoTime();
        o oVar = this.f20429t;
        ConcurrentLinkedQueue concurrentLinkedQueue = oVar.f20458f;
        TimeZone timeZone2 = la.e.f19451a;
        if (!nVar.f20445m) {
            oVar.f20456d.d(oVar.f20457e, 0L);
            return null;
        }
        nVar.f20445m = true;
        concurrentLinkedQueue.remove(nVar);
        if (concurrentLinkedQueue.isEmpty()) {
            oVar.f20456d.a();
        }
        ka.a aVar = nVar.f20438d.f19285a;
        p251z9.j.e(aVar, "address");
        if (oVar.f20455c.get(aVar) == null) {
            return nVar.f20440f;
        }
        throw new ClassCastException();
    }
}
