package p093j0;

import A9.b;
import Z.AbstractC0689j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p033d0.c;
import p033d0.f;
import p033d0.i;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class r implements v, List, RandomAccess, b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f18674r;

    public r() {
        i iVarK = n.k();
        long jG = iVarK.g();
        i iVar = i.f15549s;
        p pVar = new p(jG, iVar);
        if (!(iVarK instanceof d)) {
            pVar.f18696b = new p(1, iVar);
        }
        this.f18674r = pVar;
    }

    public static boolean e(p pVar, int i10, c cVar, boolean z10) {
        boolean z11;
        synchronized (s.f18675a) {
            try {
                int i11 = pVar.f18669d;
                if (i11 == i10) {
                    pVar.f18668c = cVar;
                    z11 = true;
                    if (z10) {
                        pVar.f18670e++;
                    }
                    pVar.f18669d = i11 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        c cVar;
        i iVarK;
        boolean zE;
        do {
            synchronized (s.f18675a) {
                p pVar = this.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i10 = pVar2.f18669d;
                cVar = pVar2.f18668c;
            }
            j.b(cVar);
            c cVarD = cVar.d(obj);
            if (cVarD.equals(cVar)) {
                return false;
            }
            p pVar3 = this.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = e((p) n.x(pVar3, this, iVarK), i10, cVarD, true);
            }
            n.o(iVarK, this);
        } while (!zE);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return h(new q(i10, collection));
    }

    @Override // p093j0.v
    public final x b() {
        return this.f18674r;
    }

    @Override // p093j0.v
    public final /* synthetic */ x c(x xVar, x xVar2, x xVar3) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i iVarK;
        p pVar = this.f18674r;
        j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (n.f18661b) {
            iVarK = n.k();
            p pVar2 = (p) n.x(pVar, this, iVarK);
            synchronized (s.f18675a) {
                pVar2.f18668c = i.f15549s;
                pVar2.f18669d++;
                pVar2.f18670e++;
            }
        }
        n.o(iVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return f().f18668c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return f().f18668c.containsAll(collection);
    }

    @Override // p093j0.v
    public final void d(x xVar) {
        xVar.f18696b = this.f18674r;
        this.f18674r = (p) xVar;
    }

    public final p f() {
        p pVar = this.f18674r;
        j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (p) n.u(pVar, this);
    }

    public final int g() {
        p pVar = this.f18674r;
        j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((p) n.i(pVar)).f18670e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return f().f18668c.get(i10);
    }

    public final boolean h(p241y9.c cVar) {
        int i10;
        c cVar2;
        Object objE;
        i iVarK;
        boolean zE;
        do {
            synchronized (s.f18675a) {
                p pVar = this.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i10 = pVar2.f18669d;
                cVar2 = pVar2.f18668c;
            }
            j.b(cVar2);
            f fVarF = cVar2.f();
            objE = cVar.e(fVarF);
            c cVarD = fVarF.d();
            if (j.a(cVarD, cVar2)) {
                break;
            }
            p pVar3 = this.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = e((p) n.x(pVar3, this, iVarK), i10, cVarD, true);
            }
            n.o(iVarK, this);
        } while (!zE);
        return ((Boolean) objE).booleanValue();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return f().f18668c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return f().f18668c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return f().f18668c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new J0.r(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        c cVar;
        i iVarK;
        boolean zE;
        Object obj = get(i10);
        do {
            synchronized (s.f18675a) {
                p pVar = this.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i11 = pVar2.f18669d;
                cVar = pVar2.f18668c;
            }
            j.b(cVar);
            c cVarH = cVar.h(i10);
            if (cVarH.equals(cVar)) {
                break;
            }
            p pVar3 = this.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = e((p) n.x(pVar3, this, iVarK), i11, cVarH, true);
            }
            n.o(iVarK, this);
        } while (!zE);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        c cVar;
        i iVarK;
        boolean zE;
        do {
            synchronized (s.f18675a) {
                p pVar = this.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i10 = pVar2.f18669d;
                cVar = pVar2.f18668c;
            }
            j.b(cVar);
            c cVarG = cVar.g(new p033d0.b(0, collection));
            if (j.a(cVarG, cVar)) {
                return false;
            }
            p pVar3 = this.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = e((p) n.x(pVar3, this, iVarK), i10, cVarG, true);
            }
            n.o(iVarK, this);
        } while (!zE);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return h(new p033d0.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        c cVar;
        i iVarK;
        boolean zE;
        Object obj2 = get(i10);
        do {
            synchronized (s.f18675a) {
                p pVar = this.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i11 = pVar2.f18669d;
                cVar = pVar2.f18668c;
            }
            j.b(cVar);
            c cVarJ = cVar.j(i10, obj);
            if (cVarJ.equals(cVar)) {
                break;
            }
            p pVar3 = this.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = e((p) n.x(pVar3, this, iVarK), i11, cVarJ, false);
            }
            n.o(iVarK, this);
        } while (!zE);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return f().f18668c.b();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            AbstractC0689j0.a("fromIndex or toIndex are out of bounds");
        }
        return new z(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p251z9.i.a(this);
    }

    public final String toString() {
        p pVar = this.f18674r;
        j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((p) n.i(pVar)).f18668c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        c cVar;
        i iVarK;
        boolean zE;
        do {
            synchronized (s.f18675a) {
                p pVar = this.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i10 = pVar2.f18669d;
                cVar = pVar2.f18668c;
            }
            j.b(cVar);
            c cVarE = cVar.e(collection);
            if (j.a(cVarE, cVar)) {
                return false;
            }
            p pVar3 = this.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = e((p) n.x(pVar3, this, iVarK), i10, cVarE, true);
            }
            n.o(iVarK, this);
        } while (!zE);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new J0.r(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return p251z9.i.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c cVar;
        i iVarK;
        boolean zE;
        do {
            synchronized (s.f18675a) {
                p pVar = this.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i11 = pVar2.f18669d;
                cVar = pVar2.f18668c;
            }
            j.b(cVar);
            c cVarC = cVar.c(i10, obj);
            if (cVarC.equals(cVar)) {
                return;
            }
            p pVar3 = this.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = e((p) n.x(pVar3, this, iVarK), i11, cVarC, true);
            }
            n.o(iVarK, this);
        } while (!zE);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        c cVar;
        i iVarK;
        boolean zE;
        do {
            synchronized (s.f18675a) {
                p pVar = this.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i10 = pVar2.f18669d;
                cVar = pVar2.f18668c;
            }
            j.b(cVar);
            int iIndexOf = cVar.indexOf(obj);
            c cVarH = iIndexOf != -1 ? cVar.h(iIndexOf) : cVar;
            if (cVarH.equals(cVar)) {
                return false;
            }
            p pVar3 = this.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = e((p) n.x(pVar3, this, iVarK), i10, cVarH, true);
            }
            n.o(iVarK, this);
        } while (!zE);
        return true;
    }
}
