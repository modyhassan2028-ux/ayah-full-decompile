package ra;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import p084i.F;
import p151p.m1;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Closeable {
    public static final B Q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final na.c f21695A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final A f21696B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f21697C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f21698D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f21699E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f21700F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1291c f21701G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final B f21702H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public B f21703I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final F f21704J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f21705K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f21706L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Socket f21707M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final y f21708N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final o f21709O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final LinkedHashSet f21710P;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f21711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f21712s = new LinkedHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f21713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final na.d f21717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final na.c f21718y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final na.c f21719z;

    static {
        B b5 = new B();
        b5.c(4, 65535);
        b5.c(5, 16384);
        Q = b5;
    }

    public p(m1 m1Var) {
        this.f21711r = (m) m1Var.f20745f;
        String str = (String) m1Var.f20742c;
        if (str == null) {
            p251z9.j.k("connectionName");
            throw null;
        }
        this.f21713t = str;
        this.f21715v = 3;
        na.d dVar = (na.d) m1Var.f20740a;
        this.f21717x = dVar;
        this.f21718y = dVar.d();
        this.f21719z = dVar.d();
        this.f21695A = dVar.d();
        this.f21696B = A.f21637a;
        this.f21701G = (C1291c) m1Var.g;
        B b5 = new B();
        b5.c(4, 16777216);
        this.f21702H = b5;
        B b10 = Q;
        this.f21703I = b10;
        this.f21704J = new F(0);
        this.f21706L = b10.a();
        Socket socket = (Socket) m1Var.f20741b;
        if (socket == null) {
            p251z9.j.k("socket");
            throw null;
        }
        this.f21707M = socket;
        Da.i iVar = (Da.i) m1Var.f20744e;
        if (iVar == null) {
            p251z9.j.k("sink");
            throw null;
        }
        this.f21708N = new y(iVar);
        Da.j jVar = (Da.j) m1Var.f20743d;
        if (jVar == null) {
            p251z9.j.k("source");
            throw null;
        }
        this.f21709O = new o(this, new t(jVar));
        this.f21710P = new LinkedHashSet();
    }

    public final void A(int i10, boolean z10, Da.h hVar, long j) {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (j == 0) {
            this.f21708N.e(z10, i10, hVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.f21705K;
                            j11 = this.f21706L;
                            if (j10 >= j11) {
                                if (!this.f21712s.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j11 - j10), this.f21708N.f21762t);
                j12 = iMin;
                this.f21705K += j12;
            }
            j -= j12;
            this.f21708N.e(z10 && j == 0, i10, hVar, iMin);
        }
    }

    public final void E(int i10, EnumC1290b enumC1290b) {
        na.c.c(this.f21718y, this.f21713t + '[' + i10 + "] writeSynReset", new G4.a(i10, 1, this, enumC1290b));
    }

    public final void F(final long j, final int i10) {
        na.c.c(this.f21718y, this.f21713t + '[' + i10 + "] windowUpdate", new p241y9.a() { // from class: ra.i
            @Override // p241y9.a
            public final Object invoke() {
                p pVar = this.f21678r;
                int i11 = i10;
                try {
                    pVar.f21708N.F(j, i11);
                } catch (IOException e10) {
                    EnumC1290b enumC1290b = EnumC1290b.PROTOCOL_ERROR;
                    pVar.b(enumC1290b, enumC1290b, e10);
                }
                return p110k9.y.f19095a;
            }
        });
    }

    public final void b(EnumC1290b enumC1290b, EnumC1290b enumC1290b2, IOException iOException) {
        int i10;
        Object[] array;
        TimeZone timeZone = la.e.f19451a;
        try {
            s(enumC1290b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f21712s.isEmpty()) {
                array = null;
            } else {
                array = this.f21712s.values().toArray(new x[0]);
                this.f21712s.clear();
            }
        }
        x[] xVarArr = (x[]) array;
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.c(enumC1290b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f21708N.close();
        } catch (IOException unused3) {
        }
        try {
            this.f21707M.close();
        } catch (IOException unused4) {
        }
        this.f21718y.f();
        this.f21719z.f();
        this.f21695A.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(EnumC1290b.NO_ERROR, EnumC1290b.CANCEL, null);
    }

    public final x e(int i10) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.f21712s.get(Integer.valueOf(i10));
        }
        return xVar;
    }

    public final void flush() {
        this.f21708N.flush();
    }

    public final boolean i(long j) {
        synchronized (this) {
            if (this.f21716w) {
                return false;
            }
            return this.f21699E >= this.f21698D || j < this.f21700F;
        }
    }

    public final x n(int i10) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.f21712s.remove(Integer.valueOf(i10));
            notifyAll();
        }
        return xVar;
    }

    public final void s(EnumC1290b enumC1290b) {
        synchronized (this.f21708N) {
            synchronized (this) {
                if (this.f21716w) {
                    return;
                }
                this.f21716w = true;
                this.f21708N.n(this.f21714u, enumC1290b, la.c.f19448a);
            }
        }
    }

    public final void w(long j) {
        synchronized (this) {
            try {
                F.c(this.f21704J, j, 0L, 2);
                long jB = this.f21704J.b();
                if (jB >= this.f21702H.a() / 2) {
                    F(jB, 0);
                    F.c(this.f21704J, 0L, jB, 1);
                }
                C1291c c1291c = this.f21701G;
                F f3 = this.f21704J;
                c1291c.getClass();
                p251z9.j.e(f3, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
