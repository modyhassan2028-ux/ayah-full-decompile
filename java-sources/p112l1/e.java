package p112l1;

import F9.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19361f;
    public final AtomicReferenceFieldUpdater g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19363i;
    public final AtomicReferenceFieldUpdater j;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f19361f = atomicReferenceFieldUpdater;
        this.g = atomicReferenceFieldUpdater2;
        this.f19362h = atomicReferenceFieldUpdater3;
        this.f19363i = atomicReferenceFieldUpdater4;
        this.j = atomicReferenceFieldUpdater5;
    }

    @Override // F9.n
    public final void O(g gVar, g gVar2) {
        this.g.lazySet(gVar, gVar2);
    }

    @Override // F9.n
    public final void P(g gVar, Thread thread) {
        this.f19361f.lazySet(gVar, thread);
    }

    @Override // F9.n
    public final boolean g(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19363i;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // F9.n
    public final boolean h(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // F9.n
    public final boolean i(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19362h;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
