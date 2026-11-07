package i7;

import I1.RunnableC0250e0;
import android.os.Bundle;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y0 f17115t;

    public /* synthetic */ R0(Y0 y10, AtomicReference atomicReference, int i10, boolean z10) {
        this.f17113r = i10;
        this.f17115t = y10;
        this.f17114s = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f17114s;
        synchronized (atomicReference) {
            try {
                try {
                    C1023u0 c1023u0 = (C1023u0) this.f17115t.f16104r;
                    atomicReference.set(c1023u0.f17582u.u(c1023u0.r().u(), G.f16935c0));
                    this.f17114s.notify();
                } catch (Throwable th) {
                    this.f17114s.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        AtomicReference atomicReference = this.f17114s;
        synchronized (atomicReference) {
            try {
                try {
                    C1023u0 c1023u0 = (C1023u0) this.f17115t.f16104r;
                    atomicReference.set(Long.valueOf(c1023u0.f17582u.v(c1023u0.r().u(), G.f16938d0)));
                    this.f17114s.notify();
                } catch (Throwable th) {
                    this.f17114s.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        AtomicReference atomicReference = this.f17114s;
        synchronized (atomicReference) {
            try {
                try {
                    C1023u0 c1023u0 = (C1023u0) this.f17115t.f16104r;
                    atomicReference.set(Integer.valueOf(c1023u0.f17582u.w(c1023u0.r().u(), G.f16940e0)));
                    this.f17114s.notify();
                } catch (Throwable th) {
                    this.f17114s.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        AtomicReference atomicReference = this.f17114s;
        synchronized (atomicReference) {
            try {
                try {
                    C1023u0 c1023u0 = (C1023u0) this.f17115t.f16104r;
                    atomicReference.set(Double.valueOf(c1023u0.f17582u.x(c1023u0.r().u(), G.f16943f0)));
                    this.f17114s.notify();
                } catch (Throwable th) {
                    this.f17114s.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17113r) {
            case 0:
                AtomicReference atomicReference = this.f17114s;
                synchronized (atomicReference) {
                    try {
                        try {
                            C1023u0 c1023u0 = (C1023u0) this.f17115t.f16104r;
                            atomicReference.set(Boolean.valueOf(c1023u0.f17582u.y(c1023u0.r().u(), G.f16932b0)));
                            this.f17114s.notify();
                        } catch (Throwable th) {
                            this.f17114s.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            case 4:
                d();
                return;
            case 5:
                Y0 y10 = this.f17115t;
                C0985h0 c0985h0 = ((C1023u0) y10.f16104r).f17583v;
                C1023u0.k(c0985h0);
                Bundle bundleL = c0985h0.f17388E.L();
                C1021t1 c1021t1P = ((C1023u0) y10.f16104r).p();
                AtomicReference atomicReference2 = this.f17114s;
                c1021t1P.o();
                c1021t1P.p();
                c1021t1P.C(new RunnableC0250e0(c1021t1P, atomicReference2, c1021t1P.E(false), bundleL, 7));
                return;
            default:
                C1021t1 c1021t1P2 = ((C1023u0) this.f17115t.f16104r).p();
                J1 j1B = J1.b(EnumC0980f1.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.f17114s;
                c1021t1P2.o();
                c1021t1P2.p();
                c1021t1P2.C(new RunnableC0250e0(c1021t1P2, atomicReference3, c1021t1P2.E(false), j1B, 8));
                return;
        }
    }

    public R0(Y0 y10, AtomicReference atomicReference, int i10) {
        this.f17113r = i10;
        switch (i10) {
            case 1:
                this.f17114s = atomicReference;
                Objects.requireNonNull(y10);
                this.f17115t = y10;
                break;
            case 2:
                this.f17114s = atomicReference;
                Objects.requireNonNull(y10);
                this.f17115t = y10;
                break;
            case 3:
                this.f17114s = atomicReference;
                Objects.requireNonNull(y10);
                this.f17115t = y10;
                break;
            case 4:
                this.f17114s = atomicReference;
                Objects.requireNonNull(y10);
                this.f17115t = y10;
                break;
            default:
                this.f17114s = atomicReference;
                Objects.requireNonNull(y10);
                this.f17115t = y10;
                break;
        }
    }
}
