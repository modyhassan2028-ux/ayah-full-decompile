package j$.util;

import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: j$.util.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1068i extends C1067h implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f18174c;

    public C1068i(java.util.List list) {
        super(list);
        this.f18174c = list;
    }

    public C1068i(java.util.List list, Object obj) {
        super(list, obj);
        this.f18174c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f18170b) {
            zEquals = this.f18174c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f18170b) {
            iHashCode = this.f18174c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj;
        synchronized (this.f18170b) {
            obj = this.f18174c.get(i10);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2;
        synchronized (this.f18170b) {
            obj2 = this.f18174c.set(i10, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        synchronized (this.f18170b) {
            this.f18174c.add(i10, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        Object objRemove;
        synchronized (this.f18170b) {
            objRemove = this.f18174c.remove(i10);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f18170b) {
            iIndexOf = this.f18174c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f18170b) {
            iLastIndexOf = this.f18174c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f18170b) {
            zAddAll = this.f18174c.addAll(i10, collection);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f18174c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return this.f18174c.listIterator(i10);
    }

    @Override // java.util.List
    public java.util.List subList(int i10, int i11) {
        C1068i c1068i;
        synchronized (this.f18170b) {
            c1068i = new C1068i(this.f18174c.subList(i10, i11), this.f18170b);
        }
        return c1068i;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f18170b) {
            java.util.List list = this.f18174c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                Objects.requireNonNull(unaryOperator);
                ListIterator listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.set(unaryOperator.apply(listIterator.next()));
                }
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        synchronized (this.f18170b) {
            AbstractC1062c.t(this.f18174c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f18174c;
        return list instanceof RandomAccess ? new C1070k(list) : this;
    }
}
