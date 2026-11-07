package K9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: K9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0391i extends d0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5373v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0389g f5374w;

    public /* synthetic */ C0391i(C0389g c0389g, int i10) {
        this.f5373v = i10;
        this.f5374w = c0389g;
    }

    @Override // K9.d0
    public final boolean k() {
        switch (this.f5373v) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // K9.d0
    public final void l(Throwable th) {
        switch (this.f5373v) {
            case 0:
                h0 h0VarJ = j();
                C0389g c0389g = this.f5374w;
                Throwable thQ = c0389g.q(h0VarJ);
                if (c0389g.w()) {
                    P9.g gVar = (P9.g) c0389g.f5364u;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P9.g.f6775y;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        P9.t tVar = P9.b.f6766c;
                        if (p251z9.j.a(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, tVar, thQ)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != tVar) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0389g.h(thQ);
                if (!c0389g.w()) {
                    c0389g.o();
                }
                break;
            default:
                this.f5374w.resumeWith(p110k9.y.f19095a);
                break;
        }
    }
}
