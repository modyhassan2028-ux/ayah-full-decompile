package j$.util;

import java.io.Serializable;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1207u implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f18601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set f18602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient C1206t f18603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient C1073n f18604d;

    public C1207u(java.util.Map map) {
        map.getClass();
        this.f18601a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18601a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f18601a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f18601a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f18601a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f18601a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f18602b == null) {
            this.f18602b = DesugarCollections.unmodifiableSet(this.f18601a.keySet());
        }
        return this.f18602b;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f18603c == null) {
            this.f18603c = new C1206t(this.f18601a.entrySet());
        }
        return this.f18603c;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f18604d == null) {
            this.f18604d = new C1073n(this.f18601a.values());
        }
        return this.f18604d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f18601a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f18601a.hashCode();
    }

    public final String toString() {
        return this.f18601a.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.a(this.f18601a, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.forEach(this.f18601a, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
