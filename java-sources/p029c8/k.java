package p029c8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient f f13560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object[] f13561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int f13562w;

    public k(f fVar, Object[] objArr, int i10) {
        this.f13560u = fVar;
        this.f13561v = objArr;
        this.f13562w = i10;
    }

    @Override // p029c8.a
    public final int b(Object[] objArr) {
        return f().b(objArr);
    }

    @Override // p029c8.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f13560u.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p029c8.g
    public final d j() {
        return new j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final q iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13562w;
    }
}
