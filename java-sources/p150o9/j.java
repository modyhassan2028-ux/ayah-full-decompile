package p150o9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p161p9.a;
import q9.d;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c, d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20381s = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f20382r;
    private volatile Object result;

    public j(c cVar) {
        a aVar = a.f21156r;
        this.f20382r = cVar;
        this.result = aVar;
    }

    @Override // q9.d
    public final d getCallerFrame() {
        c cVar = this.f20382r;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Override // p150o9.c
    public final h getContext() {
        return this.f20382r.getContext();
    }

    @Override // p150o9.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            a aVar = a.f21157s;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20381s;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            a aVar2 = a.f21156r;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20381s;
            a aVar3 = a.f21158t;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f20382r.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f20382r;
    }
}
