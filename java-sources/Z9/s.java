package Z9;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class s extends i implements Map<String, i>, A9.a, j$.util.Map {
    public static final r Companion = new r();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f11062r;

    public s(Map map) {
        p251z9.j.e(map, "content");
        this.f11062r = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f11062r.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f11062r.containsValue((i) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, i>> entrySet() {
        return this.f11062r.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return p251z9.j.a(this.f11062r, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final i get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (i) this.f11062r.get((String) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f11062r.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11062r.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f11062r.keySet();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i put(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends i> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11062r.size();
    }

    public final String toString() {
        return p120l9.m.l0(this.f11062r.entrySet(), ",", "{", "}", new G9.m(9), 24);
    }

    @Override // java.util.Map
    public final Collection<i> values() {
        return this.f11062r.values();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
