package p011b0;

import A9.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p251z9.i;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements List, b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13122t;

    public c(int i10, int i11, List list) {
        this.f13120r = list;
        this.f13121s = i10;
        this.f13122t = i11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f13122t;
        this.f13122t = i10 + 1;
        this.f13120r.add(i10, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f13120r.addAll(i10 + this.f13121s, collection);
        int size = collection.size();
        this.f13122t += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f13122t - 1;
        int i11 = this.f13121s;
        if (i11 <= i10) {
            while (true) {
                this.f13120r.remove(i10);
                if (i10 == i11) {
                    break;
                } else {
                    i10--;
                }
            }
        }
        this.f13122t = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f13122t;
        for (int i11 = this.f13121s; i11 < i10; i11++) {
            if (j.a(this.f13120r.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this);
        return this.f13120r.get(i10 + this.f13121s);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f13122t;
        int i11 = this.f13121s;
        for (int i12 = i11; i12 < i10; i12++) {
            if (j.a(this.f13120r.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f13122t == this.f13121s;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f13122t - 1;
        int i11 = this.f13121s;
        if (i11 > i10) {
            return -1;
        }
        while (!j.a(this.f13120r.get(i10), obj)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f13122t;
        for (int i11 = this.f13121s; i11 < i10; i11++) {
            ?? r10 = this.f13120r;
            if (j.a(r10.get(i11), obj)) {
                r10.remove(i11);
                this.f13122t--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f13122t;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f13122t;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f13122t;
        int i11 = i10 - 1;
        int i12 = this.f13121s;
        if (i12 <= i11) {
            while (true) {
                ?? r10 = this.f13120r;
                if (!collection.contains(r10.get(i11))) {
                    r10.remove(i11);
                    this.f13122t--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        return i10 != this.f13122t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        f.a(i10, this);
        return this.f13120r.set(i10 + this.f13121s, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f13122t - this.f13121s;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f13120r.add(i10 + this.f13121s, obj);
        this.f13122t++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new d(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f13120r.addAll(this.f13122t, collection);
        int size = collection.size();
        this.f13122t += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i10) {
        f.a(i10, this);
        Object objRemove = this.f13120r.remove(i10 + this.f13121s);
        this.f13122t--;
        return objRemove;
    }
}
