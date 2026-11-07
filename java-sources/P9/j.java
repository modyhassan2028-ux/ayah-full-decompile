package P9;

import K9.AbstractC0405x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6787r = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6788s = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6789t = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(j jVar, int i10) {
        while (true) {
            j jVarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6788s;
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    jVarF = (j) obj;
                    if (!jVarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVarF);
                }
            }
            if (jVarF instanceof i) {
                return (((i) jVarF).f6786u & i10) == 0 && jVarF.e(jVar, i10);
            }
            atomicReferenceFieldUpdater.set(jVar, jVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6787r;
            atomicReferenceFieldUpdater2.set(jVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(jVarF, this, jVar)) {
                    jVar.g(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(jVarF) == this);
        }
    }

    public final j f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6788s;
            j jVar = (j) atomicReferenceFieldUpdater2.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f6787r;
                    obj = atomicReferenceFieldUpdater.get(jVar2);
                    if (obj == this) {
                        if (jVar == jVar2) {
                            return jVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, jVar, jVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != jVar) {
                                break;
                            }
                        }
                        return jVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof o)) {
                        p251z9.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        jVar3 = jVar2;
                        jVar2 = (j) obj;
                    } else {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar2 = (j) atomicReferenceFieldUpdater2.get(jVar2);
                    }
                }
                j jVar4 = ((o) obj).f6799a;
                while (!atomicReferenceFieldUpdater.compareAndSet(jVar3, jVar2, jVar4)) {
                    if (atomicReferenceFieldUpdater.get(jVar3) != jVar2) {
                        break;
                    }
                }
                jVar2 = jVar3;
            }
        }
    }

    public final void g(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6788s;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f6787r.get(this) != jVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                    if (i()) {
                        jVar.f();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(jVar) == jVar2);
        }
    }

    public final j h() {
        j jVar;
        Object obj = f6787r.get(this);
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null && (jVar = oVar.f6799a) != null) {
            return jVar;
        }
        p251z9.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean i() {
        return f6787r.get(this) instanceof o;
    }

    public String toString() {
        return new F.j(1, 1, AbstractC0405x.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0405x.p(this);
    }
}
