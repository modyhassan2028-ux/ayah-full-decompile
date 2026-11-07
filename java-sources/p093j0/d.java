package p093j0;

import Z.U;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    @Override // p093j0.e
    public final e D(c cVar, c cVar2) {
        return (e) ((i) n.f(new U(new C1214b(cVar, cVar2, 0), 1)));
    }

    @Override // p093j0.e, p093j0.i
    public final void c() {
        synchronized (n.f18661b) {
            o();
        }
    }

    @Override // p093j0.e, p093j0.i
    public final void k() {
        s.i();
        throw null;
    }

    @Override // p093j0.e, p093j0.i
    public final void l() {
        s.i();
        throw null;
    }

    @Override // p093j0.e, p093j0.i
    public final void m() {
        n.a();
    }

    @Override // p093j0.e, p093j0.i
    public final i u(c cVar) {
        return (h) ((i) n.f(new U(new c(cVar, 0), 1)));
    }

    @Override // p093j0.e
    public final s w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
