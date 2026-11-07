package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1074o implements ListIterator, InterfaceC1212z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f18200a;

    public C1074o(C1075p c1075p, int i10) {
        this.f18200a = c1075p.f18201b.listIterator(i10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18200a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f18200a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18200a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f18200a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18200a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18200a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC1212z
    public final void forEachRemaining(Consumer consumer) {
        AbstractC1062c.r(this.f18200a, consumer);
    }
}
