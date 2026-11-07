package Z;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements InterfaceC0402u, t0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0680f f10834u = new C0680f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p150o9.h f10835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v0 f10836s = this;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile p150o9.h f10837t;

    public v0(p150o9.h hVar) {
        this.f10835r = hVar;
    }

    public final void a() {
        synchronized (this.f10836s) {
            try {
                p150o9.h hVar = this.f10837t;
                if (hVar == null) {
                    this.f10837t = f10834u;
                } else {
                    H h7 = new H(0);
                    K9.a0 a0Var = (K9.a0) hVar.i(K9.r.f5392s);
                    if (a0Var != null) {
                        a0Var.e(h7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z.t0
    public final void c() {
        a();
    }

    @Override // Z.t0
    public final void d() {
        a();
    }

    @Override // K9.InterfaceC0402u
    public final p150o9.h getCoroutineContext() {
        p150o9.h hVarL;
        p150o9.h hVar = this.f10837t;
        if (hVar == null || hVar == f10834u) {
            synchronized (this.f10836s) {
                try {
                    hVarL = this.f10837t;
                    if (hVarL == null) {
                        p150o9.h hVar2 = this.f10835r;
                        hVarL = hVar2.L(new K9.c0((K9.a0) hVar2.i(K9.r.f5392s))).L(p150o9.i.f20380r);
                    } else if (hVarL == f10834u) {
                        p150o9.h hVar3 = this.f10835r;
                        K9.c0 c0Var = new K9.c0((K9.a0) hVar3.i(K9.r.f5392s));
                        c0Var.q(new H(0));
                        hVarL = hVar3.L(c0Var).L(p150o9.i.f20380r);
                    }
                    this.f10837t = hVarL;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar = hVarL;
        }
        p251z9.j.b(hVar);
        return hVar;
    }

    @Override // Z.t0
    public final void b() {
    }
}
