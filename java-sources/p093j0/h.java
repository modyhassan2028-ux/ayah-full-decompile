package p093j0;

import p074h0.i;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f18642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18643f;

    public h(long j, m mVar, c cVar) {
        super(j, mVar);
        this.f18642e = cVar;
        this.f18643f = 1;
    }

    @Override // p093j0.i
    public final void c() {
        if (this.f18646c) {
            return;
        }
        l();
        this.f18646c = true;
        synchronized (n.f18661b) {
            o();
        }
    }

    @Override // p093j0.i
    public final c e() {
        return this.f18642e;
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
        this.f18643f++;
    }

    @Override // p093j0.i
    public final void l() {
        int i10 = this.f18643f - 1;
        this.f18643f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // p093j0.i
    public final void n(v vVar) {
        i iVar = n.f18660a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p093j0.i
    public final i u(c cVar) {
        n.d(this);
        return new g(this.f18645b, this.f18644a, n.l(cVar, this.f18642e, true), this);
    }

    @Override // p093j0.i
    public final void m() {
    }
}
