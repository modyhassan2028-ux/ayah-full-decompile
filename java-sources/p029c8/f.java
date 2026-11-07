package p029c8;

import F9.n;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements Map, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient k f13549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient l f13550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient m f13551t;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        m mVar = this.f13551t;
        if (mVar == null) {
            n nVar = (n) this;
            m mVar2 = new m(nVar.f13570v, 1, nVar.f13571w);
            this.f13551t = mVar2;
            mVar = mVar2;
        }
        return mVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        k kVar = this.f13549r;
        if (kVar != null) {
            return kVar;
        }
        n nVar = (n) this;
        k kVar2 = new k(nVar, nVar.f13570v, nVar.f13571w);
        this.f13549r = kVar2;
        return kVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((g) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        k kVar = this.f13549r;
        if (kVar == null) {
            n nVar = (n) this;
            k kVar2 = new k(nVar, nVar.f13570v, nVar.f13571w);
            this.f13549r = kVar2;
            kVar = kVar2;
        }
        Iterator it = kVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((n) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        l lVar = this.f13550s;
        if (lVar != null) {
            return lVar;
        }
        n nVar = (n) this;
        l lVar2 = new l(nVar, new m(nVar.f13570v, 0, nVar.f13571w));
        this.f13550s = lVar2;
        return lVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i10 = ((n) this).f13571w;
        n.l(i10, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb.append('{');
        q qVarL = ((k) entrySet()).iterator();
        boolean z10 = true;
        while (true) {
            b bVar = (b) qVarL;
            if (!bVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        m mVar = this.f13551t;
        if (mVar != null) {
            return mVar;
        }
        n nVar = (n) this;
        m mVar2 = new m(nVar.f13570v, 1, nVar.f13571w);
        this.f13551t = mVar2;
        return mVar2;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
