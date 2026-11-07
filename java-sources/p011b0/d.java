package p011b0;

import A9.a;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ListIterator, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13124s;

    public d(int i10, List list) {
        this.f13123r = list;
        this.f13124s = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f13123r.add(this.f13124s, obj);
        this.f13124s++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13124s < this.f13123r.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13124s > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f13124s;
        this.f13124s = i10 + 1;
        return this.f13123r.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13124s;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f13124s - 1;
        this.f13124s = i10;
        return this.f13123r.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13124s - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f13124s - 1;
        this.f13124s = i10;
        this.f13123r.remove(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f13123r.set(this.f13124s, obj);
    }
}
