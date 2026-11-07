package p033d0;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15526s;

    public a(int i10, int i11) {
        this.f15525r = i10;
        this.f15526s = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15525r < this.f15526s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15525r > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15525r;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15525r - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
