package oa;

import Z0.B;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import ka.x;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f20383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pa.f f20385c;

    public a(m mVar, e eVar, pa.f fVar) {
        this.f20383a = mVar;
        this.f20384b = eVar;
        this.f20385c = fVar;
    }

    public final void a(n nVar) {
        p251z9.j.e(nVar, "connection");
        TimeZone timeZone = la.e.f19451a;
        m mVar = this.f20383a;
        if (mVar.f20434y != null) {
            throw new IllegalStateException("Check failed.");
        }
        mVar.f20434y = nVar;
        nVar.f20451s.add(new k(mVar, mVar.f20432w));
    }

    public final void b(d dVar) {
        this.f20383a.f20426F.add(dVar);
    }

    public final n c() {
        return this.f20383a.f20434y;
    }

    public final void d(x xVar, IOException iOException) {
        p251z9.j.e(xVar, "route");
        p251z9.j.e(xVar.f19287c, "inetSocketAddress");
    }

    public final void e(n nVar) {
        p251z9.j.e(nVar, "connection");
    }

    public final void f(n nVar) {
        p251z9.j.e(nVar, "connection");
        nVar.f20443k.getClass();
        p251z9.j.e(this.f20383a, "call");
    }

    public final boolean l() {
        return !p251z9.j.a((String) this.f20385c.f21173e.f1961c, "GET");
    }

    public final boolean m() {
        return this.f20383a.f20424D;
    }

    public final Socket o() {
        return this.f20383a.g();
    }

    public final void p(d dVar) {
        this.f20383a.f20426F.remove(dVar);
    }

    public final void s(x xVar) {
        p251z9.j.e(xVar, "route");
        B b5 = this.f20383a.f20427r.f19243y;
        synchronized (b5) {
            ((LinkedHashSet) b5.f10875s).remove(xVar);
        }
    }

    public final void q() {
    }

    public final void r() {
    }

    public final void g(n nVar) {
    }

    public final void h(n nVar) {
    }

    public final void i(n nVar) {
    }

    public final void k(String str) {
    }

    public final void n(n nVar) {
    }

    public final void j(String str, List list) {
    }
}
