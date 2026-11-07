package ra;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Da.x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f21737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Da.h f21738s = new Da.h();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f21740u;

    public u(x xVar, boolean z10) {
        this.f21740u = xVar;
        this.f21737r = z10;
    }

    @Override // Da.x
    public final void Z(long j, Da.h hVar) {
        TimeZone timeZone = la.e.f19451a;
        Da.h hVar2 = this.f21738s;
        hVar2.Z(j, hVar);
        while (hVar2.f1362s >= 16384) {
            b(false);
        }
    }

    public final void b(boolean z10) {
        long jMin;
        boolean z11;
        x xVar = this.f21740u;
        synchronized (xVar) {
            xVar.f21756k.h();
            while (xVar.f21751d >= xVar.f21752e && !this.f21737r && !this.f21739t && xVar.f() == null) {
                try {
                    try {
                        xVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    xVar.f21756k.k();
                    throw th;
                }
            }
            xVar.f21756k.k();
            xVar.b();
            jMin = Math.min(xVar.f21752e - xVar.f21751d, this.f21738s.f1362s);
            xVar.f21751d += jMin;
            z11 = z10 && jMin == this.f21738s.f1362s;
        }
        this.f21740u.f21756k.h();
        try {
            x xVar2 = this.f21740u;
            xVar2.f21749b.A(xVar2.f21748a, z11, this.f21738s, jMin);
        } finally {
            this.f21740u.f21756k.k();
        }
    }

    @Override // Da.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f21740u;
        TimeZone timeZone = la.e.f19451a;
        synchronized (xVar) {
            if (this.f21739t) {
                return;
            }
            boolean z10 = xVar.f() == null;
            x xVar2 = this.f21740u;
            if (!xVar2.f21755i.f21737r) {
                if (this.f21738s.f1362s > 0) {
                    while (this.f21738s.f1362s > 0) {
                        b(true);
                    }
                } else if (z10) {
                    xVar2.f21749b.A(xVar2.f21748a, true, null, 0L);
                }
            }
            x xVar3 = this.f21740u;
            synchronized (xVar3) {
                this.f21739t = true;
                xVar3.notifyAll();
            }
            this.f21740u.f21749b.flush();
            this.f21740u.a();
        }
    }

    @Override // Da.x
    public final Da.A d() {
        return this.f21740u.f21756k;
    }

    @Override // Da.x, java.io.Flushable
    public final void flush() {
        x xVar = this.f21740u;
        TimeZone timeZone = la.e.f19451a;
        synchronized (xVar) {
            xVar.b();
        }
        while (this.f21738s.f1362s > 0) {
            b(false);
            this.f21740u.f21749b.flush();
        }
    }
}
