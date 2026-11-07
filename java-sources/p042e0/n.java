package p042e0;

import A9.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f15744r = m.f15739e.f15743d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15746t;

    public final void a(Object[] objArr, int i10, int i11) {
        this.f15744r = objArr;
        this.f15745s = i10;
        this.f15746t = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15746t < this.f15745s;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
