package K9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 extends P9.j implements J, X {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h0 f5353u;

    @Override // K9.J
    public final void a() {
        h0 h0VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0.f5371r;
            Object obj = atomicReferenceFieldUpdater.get(h0VarJ);
            if (obj instanceof d0) {
                if (obj != this) {
                    return;
                }
                L l10 = AbstractC0405x.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(h0VarJ, obj, l10)) {
                    if (atomicReferenceFieldUpdater.get(h0VarJ) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof X) || ((X) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = P9.j.f6787r;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof P9.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                p251z9.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                P9.j jVar = (P9.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = P9.j.f6789t;
                P9.o oVar = (P9.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new P9.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                        jVar.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    @Override // K9.X
    public final boolean b() {
        return true;
    }

    @Override // K9.X
    public final j0 d() {
        return null;
    }

    public a0 getParent() {
        return j();
    }

    public final h0 j() {
        h0 h0Var = this.f5353u;
        if (h0Var != null) {
            return h0Var;
        }
        p251z9.j.k("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // P9.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0405x.p(this) + "[job@" + AbstractC0405x.p(j()) + ']';
    }
}
