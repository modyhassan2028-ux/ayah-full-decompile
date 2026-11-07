package S9;

import K9.C0389g;
import K9.D;
import K9.InterfaceC0388f;
import K9.x0;
import P9.r;
import P9.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0388f, x0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0389g f7531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f7532s;

    public b(c cVar, C0389g c0389g) {
        this.f7532s = cVar;
        this.f7531r = c0389g;
    }

    @Override // K9.x0
    public final void a(r rVar, int i10) {
        this.f7531r.a(rVar, i10);
    }

    @Override // K9.InterfaceC0388f
    public final void c(Object obj, p241y9.f fVar) throws D {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f7533y;
        c cVar = this.f7532s;
        atomicReferenceFieldUpdater.set(cVar, null);
        E5.a aVar = new E5.a(8, cVar, this);
        C0389g c0389g = this.f7531r;
        c0389g.A(y.f19095a, c0389g.f5321t, new A4.f(3, aVar));
    }

    @Override // p150o9.c
    public final p150o9.h getContext() {
        return this.f7531r.f5365v;
    }

    @Override // K9.InterfaceC0388f
    public final boolean h(Throwable th) {
        return this.f7531r.h(th);
    }

    @Override // K9.InterfaceC0388f
    public final t j(Object obj, p241y9.f fVar) {
        c cVar = this.f7532s;
        A4.f fVar2 = new A4.f(cVar, this);
        t tVarJ = this.f7531r.j((y) obj, fVar2);
        if (tVarJ != null) {
            c.f7533y.set(cVar, null);
        }
        return tVarJ;
    }

    @Override // K9.InterfaceC0388f
    public final void l(Object obj) throws D {
        this.f7531r.l(obj);
    }

    @Override // p150o9.c
    public final void resumeWith(Object obj) {
        this.f7531r.resumeWith(obj);
    }
}
