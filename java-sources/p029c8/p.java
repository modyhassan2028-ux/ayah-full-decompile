package p029c8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Object f13579u;

    public p(Object obj) {
        this.f13579u = obj;
    }

    @Override // p029c8.a
    public final int b(Object[] objArr) {
        objArr[0] = this.f13579u;
        return 1;
    }

    @Override // p029c8.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13579u.equals(obj);
    }

    @Override // p029c8.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13579u.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(this.f13579u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f13579u.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
