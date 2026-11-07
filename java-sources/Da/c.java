package Da;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f1349t;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f1347r = i10;
        this.f1348s = obj;
        this.f1349t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093 A[LOOP:1: B:12:0x005a->B:25:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[SYNTHETIC] */
    @Override // Da.x
    public final void Z(long j, h hVar) throws IOException {
        Ea.c cVar;
        switch (this.f1347r) {
            case 0:
                F9.n.m(hVar.f1362s, 0L, j);
                long j10 = j;
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    u uVar = hVar.f1361r;
                    p251z9.j.b(uVar);
                    try {
                        try {
                            while (j11 < 65536) {
                                j11 += (long) (uVar.f1397c - uVar.f1396b);
                                if (j11 >= j10) {
                                    j11 = j10;
                                    cVar = (Ea.c) this.f1348s;
                                    c cVar2 = (c) this.f1349t;
                                    cVar.h();
                                    cVar2.Z(j11, hVar);
                                    if (!cVar.i()) {
                                        throw cVar.k(null);
                                    }
                                    j10 -= j11;
                                } else {
                                    uVar = uVar.f1400f;
                                    p251z9.j.b(uVar);
                                }
                            }
                            cVar2.Z(j11, hVar);
                            if (!cVar.i()) {
                                throw cVar.k(null);
                            }
                            j10 -= j11;
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
                    cVar = (Ea.c) this.f1348s;
                    c cVar3 = (c) this.f1349t;
                    cVar.h();
                }
                break;
            default:
                F9.n.m(hVar.f1362s, 0L, j);
                while (j > 0) {
                    ((A) this.f1349t).f();
                    u uVar2 = hVar.f1361r;
                    p251z9.j.b(uVar2);
                    int iMin = (int) Math.min(j, uVar2.f1397c - uVar2.f1396b);
                    ((OutputStream) this.f1348s).write(uVar2.f1395a, uVar2.f1396b, iMin);
                    int i10 = uVar2.f1396b + iMin;
                    uVar2.f1396b = i10;
                    long j12 = iMin;
                    j -= j12;
                    hVar.f1362s -= j12;
                    if (i10 == uVar2.f1397c) {
                        hVar.f1361r = uVar2.a();
                        v.a(uVar2);
                    }
                }
                return;
        }
    }

    @Override // Da.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1347r) {
            case 0:
                Ea.c cVar = (Ea.c) this.f1348s;
                c cVar2 = (c) this.f1349t;
                cVar.h();
                try {
                    try {
                        cVar2.close();
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
                ((OutputStream) this.f1348s).close();
                return;
        }
    }

    @Override // Da.x
    public final A d() {
        switch (this.f1347r) {
            case 0:
                return (Ea.c) this.f1348s;
            default:
                return (A) this.f1349t;
        }
    }

    @Override // Da.x, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1347r) {
            case 0:
                Ea.c cVar = (Ea.c) this.f1348s;
                c cVar2 = (c) this.f1349t;
                cVar.h();
                try {
                    try {
                        cVar2.flush();
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
                ((OutputStream) this.f1348s).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f1347r) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f1349t) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1348s) + ')';
        }
    }
}
