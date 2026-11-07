package la;

import Da.A;
import Da.h;
import Da.j;
import Da.y;
import ka.p;
import ka.w;

/* JADX INFO: loaded from: classes.dex */
public final class a extends w implements y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f19445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f19446t;

    public a(p pVar, long j) {
        this.f19445s = pVar;
        this.f19446t = j;
    }

    @Override // ka.w
    public final long b() {
        return this.f19446t;
    }

    @Override // Da.y
    public final A d() {
        return A.f1341d;
    }

    @Override // ka.w
    public final p e() {
        return this.f19445s;
    }

    @Override // ka.w
    public final j i() {
        return Y2.a.p(this);
    }

    @Override // Da.y
    public final long o(long j, h hVar) {
        p251z9.j.e(hVar, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // ka.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
