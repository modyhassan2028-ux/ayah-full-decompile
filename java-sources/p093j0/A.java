package p093j0;

import p074h0.i;
import p074h0.j;
import p241y9.c;
import u.F;

/* JADX INFO: loaded from: classes.dex */
public final class A extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f18613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f18614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f18615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f18616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f18617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f18618t;

    /* JADX WARN: Illegal instructions before constructor call */
    public A(e eVar, c cVar, c cVar2, boolean z10, boolean z11) {
        c cVarI;
        c cVarY;
        i iVar = n.f18660a;
        super(0L, m.f18655v, n.l(cVar, (eVar == null || (cVarY = eVar.e()) == null) ? n.f18667i.f18631e : cVarY, z10), n.b(cVar2, (eVar == null || (cVarI = eVar.i()) == null) ? n.f18667i.f18632f : cVarI));
        this.f18613o = eVar;
        this.f18614p = z10;
        this.f18615q = z11;
        this.f18616r = this.f18631e;
        this.f18617s = this.f18632f;
        this.f18618t = j.b();
    }

    @Override // p093j0.e
    public final void C(F f3) {
        s.i();
        throw null;
    }

    @Override // p093j0.e
    public final e D(c cVar, c cVar2) {
        c cVarL = n.l(cVar, this.f18616r, true);
        c cVarB = n.b(cVar2, this.f18617s);
        return !this.f18614p ? new A(E().D(null, cVarB), cVarL, cVarB, false, true) : E().D(cVarL, cVarB);
    }

    public final e E() {
        e eVar = this.f18613o;
        return eVar == null ? n.f18667i : eVar;
    }

    @Override // p093j0.e, p093j0.i
    public final void c() {
        e eVar;
        this.f18646c = true;
        if (!this.f18615q || (eVar = this.f18613o) == null) {
            return;
        }
        eVar.c();
    }

    @Override // p093j0.i
    public final m d() {
        return E().d();
    }

    @Override // p093j0.e, p093j0.i
    public final c e() {
        return this.f18616r;
    }

    @Override // p093j0.e, p093j0.i
    public final boolean f() {
        return E().f();
    }

    @Override // p093j0.i
    public final long g() {
        return E().g();
    }

    @Override // p093j0.e, p093j0.i
    public final int h() {
        return E().h();
    }

    @Override // p093j0.e, p093j0.i
    public final c i() {
        return this.f18617s;
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
        E().m();
    }

    @Override // p093j0.e, p093j0.i
    public final void n(v vVar) {
        E().n(vVar);
    }

    @Override // p093j0.i
    public final void r(m mVar) {
        s.i();
        throw null;
    }

    @Override // p093j0.i
    public final void s(long j) {
        s.i();
        throw null;
    }

    @Override // p093j0.e, p093j0.i
    public final void t(int i10) {
        E().t(i10);
    }

    @Override // p093j0.e, p093j0.i
    public final i u(c cVar) {
        c cVarL = n.l(cVar, this.f18616r, true);
        return !this.f18614p ? n.h(E().u(null), cVarL, true) : E().u(cVarL);
    }

    @Override // p093j0.e
    public final s w() {
        return E().w();
    }

    @Override // p093j0.e
    public final F x() {
        return E().x();
    }

    @Override // p093j0.e
    /* JADX INFO: renamed from: y */
    public final c e() {
        return this.f18616r;
    }
}
