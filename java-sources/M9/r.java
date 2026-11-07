package M9;

import D0.F;
import K9.AbstractC0383a;
import K9.AbstractC0405x;
import K9.b0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0383a implements s, i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f5883u;

    public r(p150o9.h hVar, e eVar) {
        super(hVar, true);
        this.f5883u = eVar;
    }

    @Override // M9.u
    public final Object a(q9.i iVar) {
        return this.f5883u.a(iVar);
    }

    @Override // M9.v
    public final Object d(Object obj, p150o9.c cVar) {
        return this.f5883u.d(obj, cVar);
    }

    @Override // K9.h0, K9.a0
    public final void e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b0(u(), null, this);
        }
        r(cancellationException);
    }

    @Override // M9.u
    public final Object f(O9.n nVar) {
        e eVar = this.f5883u;
        eVar.getClass();
        return e.C(eVar, nVar);
    }

    @Override // M9.u
    public final Object g() {
        return this.f5883u.g();
    }

    @Override // K9.AbstractC0383a
    public final void g0(Throwable th, boolean z10) {
        if (this.f5883u.l(th, false) || z10) {
            return;
        }
        AbstractC0405x.s(th, this.f5346t);
    }

    @Override // K9.AbstractC0383a
    public final void h0(Object obj) {
        this.f5883u.j(null);
    }

    @Override // M9.u
    public final b iterator() {
        e eVar = this.f5883u;
        eVar.getClass();
        return new b(eVar);
    }

    public final boolean j0(Throwable th) {
        return this.f5883u.l(th, false);
    }

    @Override // M9.v
    public final Object k(Object obj) {
        return this.f5883u.k(obj);
    }

    public final void k0(F f3) {
        e eVar = this.f5883u;
        eVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f5843A;
        while (!atomicReferenceFieldUpdater.compareAndSet(eVar, null, f3)) {
            if (atomicReferenceFieldUpdater.get(eVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(eVar);
                    P9.t tVar = g.f5868q;
                    if (obj != tVar) {
                        if (obj == g.f5869r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    P9.t tVar2 = g.f5869r;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(eVar, tVar, tVar2)) {
                            f3.e(eVar.q());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(eVar) == tVar);
                }
            }
        }
    }

    @Override // K9.h0
    public final void r(CancellationException cancellationException) {
        this.f5883u.l(cancellationException, true);
        q(cancellationException);
    }
}
