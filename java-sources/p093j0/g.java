package p093j0;

import p074h0.i;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f18640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f18641f;

    public g(long j, m mVar, c cVar, i iVar) {
        super(j, mVar);
        this.f18640e = cVar;
        this.f18641f = iVar;
        iVar.k();
    }

    @Override // p093j0.i
    public final void c() {
        i iVar = this.f18641f;
        if (this.f18646c) {
            return;
        }
        if (this.f18645b != iVar.g()) {
            a();
        }
        iVar.l();
        this.f18646c = true;
        synchronized (n.f18661b) {
            o();
        }
    }

    @Override // p093j0.i
    public final c e() {
        return this.f18640e;
    }

    @Override // p093j0.i
    public final boolean f() {
        return true;
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
    public final void n(v vVar) {
        i iVar = n.f18660a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p093j0.i
    public final i u(c cVar) {
        return new g(this.f18645b, this.f18644a, n.l(cVar, this.f18640e, true), this.f18641f);
    }

    @Override // p093j0.i
    public final void m() {
    }
}
