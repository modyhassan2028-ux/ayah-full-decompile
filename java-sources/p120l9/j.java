package p120l9;

import A9.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p251z9.i;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Collection, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object[] f19433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f19434s;

    public j(Object[] objArr, boolean z10) {
        this.f19433r = objArr;
        this.f19434s = z10;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return l.T(obj, this.f19433r);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        p251z9.j.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!l.T(it.next(), this.f19433r)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f19433r.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return p251z9.j.h(this.f19433r);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f19433r.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        p251z9.j.e(objArr, "array");
        return i.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f19433r;
        if (this.f19434s && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        p251z9.j.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }
}
