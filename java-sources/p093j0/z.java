package p093j0;

import A9.b;
import Z.AbstractC0689j0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p033d0.c;
import p033d0.f;
import p120l9.v;
import p251z9.i;
import p251z9.j;
import p251z9.t;

/* JADX INFO: loaded from: classes.dex */
public final class z implements List, b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f18700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18703u;

    public z(r rVar, int i10, int i11) {
        this.f18700r = rVar;
        this.f18701s = i10;
        this.f18702t = rVar.g();
        this.f18703u = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i10 = this.f18701s + this.f18703u;
        r rVar = this.f18700r;
        rVar.add(i10, obj);
        this.f18703u++;
        this.f18702t = rVar.g();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f18703u, collection);
    }

    public final void b() {
        if (this.f18700r.g() != this.f18702t) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10;
        c cVar;
        i iVarK;
        boolean zE;
        if (this.f18703u > 0) {
            b();
            r rVar = this.f18700r;
            int i11 = this.f18701s;
            int i12 = this.f18703u + i11;
            do {
                synchronized (s.f18675a) {
                    p pVar = rVar.f18674r;
                    j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    p pVar2 = (p) n.i(pVar);
                    i10 = pVar2.f18669d;
                    cVar = pVar2.f18668c;
                }
                j.b(cVar);
                f fVarF = cVar.f();
                fVarF.subList(i11, i12).clear();
                c cVarD = fVarF.d();
                if (j.a(cVarD, cVar)) {
                    break;
                }
                p pVar3 = rVar.f18674r;
                j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (n.f18661b) {
                    iVarK = n.k();
                    zE = r.e((p) n.x(pVar3, rVar, iVarK), i10, cVarD, true);
                }
                n.o(iVarK, rVar);
            } while (!zE);
            this.f18703u = 0;
            this.f18702t = this.f18700r.g();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b();
        s.a(i10, this.f18703u);
        return this.f18700r.get(this.f18701s + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i10 = this.f18703u;
        int i11 = this.f18701s;
        Iterator it = B0.c.i0(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((v) it).nextInt();
            if (j.a(obj, this.f18700r.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f18703u == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i10 = this.f18703u;
        int i11 = this.f18701s;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (j.a(obj, this.f18700r.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        c cVar;
        i iVarK;
        boolean zE;
        b();
        r rVar = this.f18700r;
        int i11 = this.f18701s;
        int i12 = this.f18703u + i11;
        int size = rVar.size();
        do {
            synchronized (s.f18675a) {
                p pVar = rVar.f18674r;
                j.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i10 = pVar2.f18669d;
                cVar = pVar2.f18668c;
            }
            j.b(cVar);
            f fVarF = cVar.f();
            fVarF.subList(i11, i12).retainAll(collection);
            c cVarD = fVarF.d();
            if (j.a(cVarD, cVar)) {
                break;
            }
            p pVar3 = rVar.f18674r;
            j.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f18661b) {
                iVarK = n.k();
                zE = r.e((p) n.x(pVar3, rVar, iVarK), i10, cVarD, true);
            }
            n.o(iVarK, rVar);
        } while (!zE);
        int size2 = size - rVar.size();
        if (size2 > 0) {
            this.f18702t = this.f18700r.g();
            this.f18703u -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        s.a(i10, this.f18703u);
        b();
        int i11 = i10 + this.f18701s;
        r rVar = this.f18700r;
        Object obj2 = rVar.set(i11, obj);
        this.f18702t = rVar.g();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f18703u;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f18703u)) {
            AbstractC0689j0.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i12 = this.f18701s;
        return new z(this.f18700r, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        b();
        t tVar = new t();
        tVar.f24884r = i10 - 1;
        return new y(tVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        int i11 = i10 + this.f18701s;
        r rVar = this.f18700r;
        boolean zAddAll = rVar.addAll(i11, collection);
        if (zAddAll) {
            this.f18703u = collection.size() + this.f18703u;
            this.f18702t = rVar.g();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        b();
        int i11 = this.f18701s + i10;
        r rVar = this.f18700r;
        Object objRemove = rVar.remove(i11);
        this.f18703u--;
        this.f18702t = rVar.g();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        b();
        int i11 = this.f18701s + i10;
        r rVar = this.f18700r;
        rVar.add(i11, obj);
        this.f18703u++;
        this.f18702t = rVar.g();
    }
}
