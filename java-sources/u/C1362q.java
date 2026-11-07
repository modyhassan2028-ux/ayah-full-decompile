package u;

import H0.f0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: u.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1362q implements Map, A9.a, j$.util.Map {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E f22747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1352g f22748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1352g f22749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f0 f22750u;

    public C1362q(E e10) {
        p251z9.j.e(e10, "parent");
        this.f22747r = e10;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f22747r.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f22747r.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1352g c1352g = this.f22748s;
        if (c1352g != null) {
            return c1352g;
        }
        C1352g c1352g2 = new C1352g(this.f22747r, 0);
        this.f22748s = c1352g2;
        return c1352g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1362q.class != obj.getClass()) {
            return false;
        }
        return p251z9.j.a(this.f22747r, ((C1362q) obj).f22747r);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f22747r.g(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f22747r.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f22747r.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1352g c1352g = this.f22749t;
        if (c1352g != null) {
            return c1352g;
        }
        C1352g c1352g2 = new C1352g(this.f22747r, 1);
        this.f22749t = c1352g2;
        return c1352g2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f22747r.f22673e;
    }

    public final String toString() {
        return this.f22747r.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        f0 f0Var = this.f22750u;
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(this.f22747r);
        this.f22750u = f0Var2;
        return f0Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
