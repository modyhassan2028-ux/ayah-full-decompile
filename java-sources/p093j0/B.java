package p093j0;

import p074h0.i;
import p074h0.j;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final class B extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f18619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18620f;
    public c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18621h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(i iVar, c cVar, boolean z10) {
        c cVarE;
        super(0L, m.f18655v);
        i iVar2 = n.f18660a;
        this.f18619e = iVar;
        this.f18620f = z10;
        this.g = n.l(cVar, (iVar == null || (cVarE = iVar.e()) == null) ? n.f18667i.f18631e : cVarE, false);
        this.f18621h = j.b();
    }

    @Override // p093j0.i
    public final void c() {
        i iVar;
        this.f18646c = true;
        if (!this.f18620f || (iVar = this.f18619e) == null) {
            return;
        }
        iVar.c();
    }

    @Override // p093j0.i
    public final m d() {
        return v().d();
    }

    @Override // p093j0.i
    public final c e() {
        return this.g;
    }

    @Override // p093j0.i
    public final boolean f() {
        return v().f();
    }

    @Override // p093j0.i
    public final long g() {
        return v().g();
    }

    @Override // p093j0.i
    public final c i() {
        return null;
    }

    @Override // p093j0.i
    public final void k() {
        s.i();
        throw null;
    }

    @Override // p093j0.i
    public final void l() {
        s.i();
        throw null;
    }

    @Override // p093j0.i
    public final void m() {
        v().m();
    }

    @Override // p093j0.i
    public final void n(v vVar) {
        v().n(vVar);
    }

    @Override // p093j0.i
    public final i u(c cVar) {
        return n.h(v().u(null), n.l(cVar, this.g, true), true);
    }

    public final i v() {
        i iVar = this.f18619e;
        return iVar == null ? n.f18667i : iVar;
    }
}
