package p042e0;

import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p062g0.a;
import p062g0.b;
import p120l9.g;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends g implements Map {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f15722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f15723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f15724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15726v;

    public final void a(int i10) {
        this.f15726v = i10;
        this.f15725u++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f15723s = m.f15739e;
        a(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f15723s.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f15723s.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f15724t = null;
        this.f15723s = this.f15723s.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f15724t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        c cVarB = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarB = ((p074h0.g) eVar).b();
            }
        } else {
            cVarB = cVar;
        }
        if (cVarB == null) {
            super.putAll(map);
            return;
        }
        a aVar = new a();
        aVar.f16244a = 0;
        int i10 = this.f15726v;
        m mVar = this.f15723s;
        m mVar2 = cVarB.f15717r;
        j.c(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f15723s = mVar.m(mVar2, 0, aVar, this);
        int i11 = (cVarB.f15718s + i10) - aVar.f16244a;
        if (i10 != i11) {
            a(i11);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f15726v;
        m mVarO = this.f15723s.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mVarO == null) {
            mVarO = m.f15739e;
        }
        this.f15723s = mVarO;
        return i10 != this.f15726v;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f15724t = null;
        m mVarN = this.f15723s.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mVarN == null) {
            mVarN = m.f15739e;
        }
        this.f15723s = mVarN;
        return this.f15724t;
    }
}
