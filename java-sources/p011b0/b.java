package p011b0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p251z9.i;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements List, A9.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f13119r;

    public b(e eVar) {
        this.f13119r = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f13119r.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f13119r;
        return eVar.e(eVar.f13127t, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f13119r.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13119r.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f13119r;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this);
        return this.f13119r.f13125r[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f13119r.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f13119r.f13127t == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f13119r;
        Object[] objArr = eVar.f13125r;
        for (int i10 = eVar.f13127t - 1; i10 >= 0; i10--) {
            if (j.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13119r.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f13119r;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = eVar.f13127t;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.k(it.next());
        }
        return i10 != eVar.f13127t;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f13119r;
        int i10 = eVar.f13127t;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(eVar.f13125r[i11])) {
                eVar.l(i11);
            }
        }
        return i10 != eVar.f13127t;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        f.a(i10, this);
        Object[] objArr = this.f13119r.f13125r;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f13119r.f13127t;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        f.b(i10, i11, this);
        return new c(i10, i11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f13119r.a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new d(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        f.a(i10, this);
        return this.f13119r.l(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f13119r.e(i10, collection);
    }
}
