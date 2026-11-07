package Da;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d implements y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f1352t;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f1350r = i10;
        this.f1351s = obj;
        this.f1352t = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1350r) {
            case 0:
                Ea.c cVar = (Ea.c) this.f1351s;
                d dVar = (d) this.f1352t;
                cVar.h();
                try {
                    try {
                        dVar.close();
                        if (cVar.i()) {
                            throw cVar.k(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!cVar.i()) {
                            throw e10;
                        }
                        throw cVar.k(e10);
                    }
                } catch (Throwable th) {
                    cVar.i();
                    throw th;
                }
            default:
                ((InputStream) this.f1351s).close();
                return;
        }
    }

    @Override // Da.y
    public final A d() {
        switch (this.f1350r) {
            case 0:
                return (Ea.c) this.f1351s;
            default:
                return (A) this.f1352t;
        }
    }

    @Override // Da.y
    public final long o(long j, h hVar) throws IOException {
        switch (this.f1350r) {
            case 0:
                p251z9.j.e(hVar, "sink");
                Ea.c cVar = (Ea.c) this.f1351s;
                d dVar = (d) this.f1352t;
                cVar.h();
                try {
                    try {
                        long jO = dVar.o(8192L, hVar);
                        if (cVar.i()) {
                            throw cVar.k(null);
                        }
                        return jO;
                    } catch (IOException e10) {
                        if (cVar.i()) {
                            throw cVar.k(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th) {
                    cVar.i();
                    throw th;
                }
            default:
                p251z9.j.e(hVar, "sink");
                try {
                    ((A) this.f1352t).f();
                    u uVarH = hVar.H(1);
                    int i10 = ((InputStream) this.f1351s).read(uVarH.f1395a, uVarH.f1397c, (int) Math.min(8192L, 8192 - uVarH.f1397c));
                    if (i10 == -1) {
                        if (uVarH.f1396b == uVarH.f1397c) {
                            hVar.f1361r = uVarH.a();
                            v.a(uVarH);
                        }
                        return -1L;
                    }
                    uVarH.f1397c += i10;
                    long j10 = i10;
                    hVar.f1362s += j10;
                    return j10;
                } catch (AssertionError e11) {
                    if (Ea.d.a(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }

    public final String toString() {
        switch (this.f1350r) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f1352t) + ')';
            default:
                return "source(" + ((InputStream) this.f1351s) + ')';
        }
    }
}
