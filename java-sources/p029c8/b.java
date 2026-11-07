package p029c8;

import com.google.android.gms.internal.measurement.B1;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q implements ListIterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f13541t;

    public b(d dVar, int i10) {
        int size = dVar.size();
        B1.k(i10, size);
        this.f13539r = size;
        this.f13540s = i10;
        this.f13541t = dVar;
    }

    public final Object a(int i10) {
        return this.f13541t.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13540s < this.f13539r;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13540s > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13540s;
        this.f13540s = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13540s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13540s - 1;
        this.f13540s = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13540s - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
