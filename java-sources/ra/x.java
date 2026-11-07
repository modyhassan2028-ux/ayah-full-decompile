package ra;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import p084i.F;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f21749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f21750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f21753f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f21754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f21755i;
    public final w j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f21756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC1290b f21757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f21758m;

    public x(int i10, p pVar, boolean z10, boolean z11, ka.l lVar) {
        p251z9.j.e(pVar, "connection");
        this.f21748a = i10;
        this.f21749b = pVar;
        this.f21750c = new F(i10);
        this.f21752e = pVar.f21703I.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f21753f = arrayDeque;
        this.f21754h = new v(this, pVar.f21702H.a(), z11);
        this.f21755i = new u(this, z10);
        this.j = new w(this);
        this.f21756k = new w(this);
        if (lVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(lVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z10;
        boolean zH;
        TimeZone timeZone = la.e.f19451a;
        synchronized (this) {
            try {
                v vVar = this.f21754h;
                if (vVar.f21742s || !vVar.f21745v) {
                    z10 = false;
                } else {
                    u uVar = this.f21755i;
                    if (uVar.f21737r || uVar.f21739t) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            c(EnumC1290b.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.f21749b.n(this.f21748a);
        }
    }

    public final void b() throws IOException {
        u uVar = this.f21755i;
        if (uVar.f21739t) {
            throw new IOException("stream closed");
        }
        if (uVar.f21737r) {
            throw new IOException("stream finished");
        }
        if (f() != null) {
            IOException iOException = this.f21758m;
            if (iOException != null) {
                throw iOException;
            }
            EnumC1290b enumC1290bF = f();
            p251z9.j.b(enumC1290bF);
            throw new C(enumC1290bF);
        }
    }

    public final void c(EnumC1290b enumC1290b, IOException iOException) {
        if (d(enumC1290b, iOException)) {
            this.f21749b.f21708N.A(this.f21748a, enumC1290b);
        }
    }

    public final boolean d(EnumC1290b enumC1290b, IOException iOException) {
        TimeZone timeZone = la.e.f19451a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.f21757l = enumC1290b;
            this.f21758m = iOException;
            notifyAll();
            if (this.f21754h.f21742s && this.f21755i.f21737r) {
                return false;
            }
            this.f21749b.n(this.f21748a);
            return true;
        }
    }

    public final void e(EnumC1290b enumC1290b) {
        if (d(enumC1290b, null)) {
            this.f21749b.E(this.f21748a, enumC1290b);
        }
    }

    public final EnumC1290b f() {
        EnumC1290b enumC1290b;
        synchronized (this) {
            enumC1290b = this.f21757l;
        }
        return enumC1290b;
    }

    public final boolean g() {
        boolean z10 = (this.f21748a & 1) == 1;
        this.f21749b.getClass();
        return true == z10;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                v vVar = this.f21754h;
                if (vVar.f21742s || vVar.f21745v) {
                    u uVar = this.f21755i;
                    if ((uVar.f21737r || uVar.f21739t) && this.g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(ka.l lVar, boolean z10) {
        boolean zH;
        p251z9.j.e(lVar, "headers");
        TimeZone timeZone = la.e.f19451a;
        synchronized (this) {
            try {
                if (this.g && lVar.b(":status") == null && lVar.b(":method") == null) {
                    this.f21754h.getClass();
                } else {
                    this.g = true;
                    this.f21753f.add(lVar);
                }
                if (z10) {
                    this.f21754h.f21742s = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f21749b.n(this.f21748a);
    }

    public final void j(EnumC1290b enumC1290b) {
        synchronized (this) {
            if (f() == null) {
                this.f21757l = enumC1290b;
                notifyAll();
            }
        }
    }
}
