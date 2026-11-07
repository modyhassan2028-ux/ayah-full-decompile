package io.realm;

import io.realm.internal.OsMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class GenericPrimitiveValueOperator<K, V> extends MapValueOperator<K, V> {
    private final EqualsHelper<K, V> equalsHelper;

    public GenericPrimitiveValueOperator(Class<V> cls, BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, V> typeSelectorForMap, RealmMapEntrySet.IteratorType iteratorType) {
        this(cls, baseRealm, osMap, typeSelectorForMap, iteratorType, new GenericEquals());
    }

    @Override // io.realm.MapValueOperator
    public boolean containsValueInternal(Object obj) {
        return this.osMap.containsPrimitiveValue(obj);
    }

    @Override // io.realm.MapValueOperator
    public Set<Map.Entry<K, V>> entrySet() {
        return new RealmMapEntrySet(this.baseRealm, this.osMap, this.iteratorType, this.equalsHelper, null);
    }

    @Override // io.realm.MapValueOperator
    public V get(Object obj) {
        Object obj2 = this.osMap.get(obj);
        if (obj2 == null) {
            return null;
        }
        return processValue(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V processValue(Object obj) {
        return obj;
    }

    @Override // io.realm.MapValueOperator
    public V put(K k7, V v10) {
        V v11 = get(k7);
        this.osMap.put(k7, v10);
        return v11;
    }

    public GenericPrimitiveValueOperator(Class<V> cls, BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, V> typeSelectorForMap, RealmMapEntrySet.IteratorType iteratorType, EqualsHelper<K, V> equalsHelper) {
        super(cls, baseRealm, osMap, typeSelectorForMap, iteratorType);
        this.equalsHelper = equalsHelper;
    }
}
