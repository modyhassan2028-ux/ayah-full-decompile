package i7;

import java.util.Iterator;

/* JADX INFO: renamed from: i7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1016s implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Iterator f17541r;

    public C1016s(C1019t c1019t) {
        this.f17541r = c1019t.f17548r.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17541r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f17541r.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
