package ra;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import p084i.F;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Da.y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f21741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Da.h f21743t = new Da.h();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Da.h f21744u = new Da.h();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f21746w;

    public v(x xVar, long j, boolean z10) {
        this.f21746w = xVar;
        this.f21741r = j;
        this.f21742s = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        x xVar = this.f21746w;
        synchronized (xVar) {
            this.f21745v = true;
            Da.h hVar = this.f21744u;
            j = hVar.f1362s;
            hVar.skip(j);
            xVar.notifyAll();
        }
        if (j > 0) {
            x xVar2 = this.f21746w;
            TimeZone timeZone = la.e.f19451a;
            xVar2.f21749b.w(j);
        }
        this.f21746w.a();
    }

    @Override // Da.y
    public final Da.A d() {
        return this.f21746w.j;
    }

    @Override // Da.y
    public final long o(long j, Da.h hVar) throws Throwable {
        boolean z10;
        Throwable c10;
        long jO;
        p251z9.j.e(hVar, "sink");
        do {
            x xVar = this.f21746w;
            synchronized (xVar) {
                xVar.f21749b.getClass();
                u uVar = xVar.f21755i;
                z10 = true;
                boolean z11 = uVar.f21739t || uVar.f21737r;
                if (z11) {
                    xVar.j.h();
                }
                try {
                    if (xVar.f() == null || this.f21742s) {
                        c10 = null;
                    } else {
                        c10 = xVar.f21758m;
                        if (c10 == null) {
                            EnumC1290b enumC1290bF = xVar.f();
                            p251z9.j.b(enumC1290bF);
                            c10 = new C(enumC1290bF);
                        }
                    }
                    if (this.f21745v) {
                        throw new IOException("stream closed");
                    }
                    Da.h hVar2 = this.f21744u;
                    long j10 = hVar2.f1362s;
                    if (j10 > 0) {
                        jO = hVar2.o(Math.min(8192L, j10), hVar);
                        F.c(xVar.f21750c, jO, 0L, 2);
                        long jB = xVar.f21750c.b();
                        if (c10 == null && jB >= xVar.f21749b.f21702H.a() / 2) {
                            xVar.f21749b.F(jB, xVar.f21748a);
                            F.c(xVar.f21750c, 0L, jB, 1);
                        }
                        z10 = false;
                    } else {
                        if (this.f21742s || c10 != null) {
                            z10 = false;
                        } else {
                            try {
                                xVar.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jO = -1;
                    }
                    if (z11) {
                        xVar.j.k();
                    }
                } catch (Throwable th) {
                    if (z11) {
                        xVar.j.k();
                    }
                    throw th;
                }
            }
            this.f21746w.f21749b.f21701G.getClass();
        } while (z10);
        if (jO != -1) {
            return jO;
        }
        if (c10 == null) {
            return -1L;
        }
        throw c10;
    }
}
