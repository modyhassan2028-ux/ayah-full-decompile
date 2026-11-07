package p029c8;

/* JADX INFO: loaded from: classes.dex */
public final class l extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient f f13563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient m f13564v;

    public l(f fVar, m mVar) {
        this.f13563u = fVar;
        this.f13564v = mVar;
    }

    @Override // p029c8.a
    public final int b(Object[] objArr) {
        return this.f13564v.b(objArr);
    }

    @Override // p029c8.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13563u.get(obj) != null;
    }

    @Override // p029c8.g
    public final d f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final q iterator() {
        return this.f13564v.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((n) this.f13563u).f13571w;
    }
}
