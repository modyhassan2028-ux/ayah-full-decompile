package p100j8;

import I8.a;
import I8.b;
import K.u0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W2.n f18815c = new W2.n(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f18816d = new d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f18817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f18818b;

    public n(W2.n nVar, b bVar) {
        this.f18817a = nVar;
        this.f18818b = bVar;
    }

    public final void a(a aVar) {
        b bVar;
        b bVar2;
        b bVar3 = this.f18818b;
        d dVar = f18816d;
        if (bVar3 != dVar) {
            aVar.e(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f18818b;
            if (bVar != dVar) {
                bVar2 = bVar;
            } else {
                this.f18817a = new u0(7, this.f18817a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.e(bVar);
        }
    }

    @Override // I8.b
    public final Object get() {
        return this.f18818b.get();
    }
}
