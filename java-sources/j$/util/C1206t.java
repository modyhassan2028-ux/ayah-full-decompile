package j$.util;

import j$.util.stream.C1081a2;
import j$.util.stream.Stream;
import j$.util.stream.Y2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1206t extends C1209w {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C1073n, java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        AbstractC1062c.q(this.f18199a, new C1076q(0, consumer));
    }

    @Override // j$.util.C1073n, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final Spliterator spliterator() {
        return new C1077s(AbstractC1062c.u(this.f18199a));
    }

    @Override // j$.util.C1073n, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new C1081a2(spliterator, Y2.p(spliterator), false);
    }

    @Override // j$.util.C1073n, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new C1081a2(spliterator, Y2.p(spliterator), true);
    }

    @Override // j$.util.C1073n, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1072m(this);
    }

    @Override // j$.util.C1073n, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f18199a.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            array[i10] = new r((java.util.Map.Entry) array[i10]);
        }
        return array;
    }

    @Override // j$.util.C1073n, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f18199a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i10 = 0; i10 < array.length; i10++) {
            array[i10] = new r((java.util.Map.Entry) array[i10]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.C1073n, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return this.f18199a.contains(new r((java.util.Map.Entry) obj));
        }
        return false;
    }

    @Override // j$.util.C1073n, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C1209w, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != this.f18199a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
