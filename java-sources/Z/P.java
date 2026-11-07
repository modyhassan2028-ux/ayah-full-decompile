package Z;

import K9.AbstractC0405x;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class P implements t0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p241y9.e f10635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final P9.d f10636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public K9.A f10637t;

    public P(p150o9.h hVar, p241y9.e eVar) {
        this.f10635r = eVar;
        this.f10636s = AbstractC0405x.b(hVar);
    }

    @Override // Z.t0
    public final void b() {
        K9.A a9 = this.f10637t;
        if (a9 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            a9.e(cancellationException);
        }
        this.f10637t = AbstractC0405x.x(this.f10636s, null, this.f10635r, 3);
    }

    @Override // Z.t0
    public final void c() {
        K9.A a9 = this.f10637t;
        if (a9 != null) {
            a9.r(new H(1));
        }
        this.f10637t = null;
    }

    @Override // Z.t0
    public final void d() {
        K9.A a9 = this.f10637t;
        if (a9 != null) {
            a9.r(new H(1));
        }
        this.f10637t = null;
    }
}
