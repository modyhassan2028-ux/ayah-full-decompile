package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class RealmModelValueOperator<K, V> extends MapValueOperator<K, V> {
    public RealmModelValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, V> typeSelectorForMap) {
        super(RealmModel.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.OBJECT);
    }

    @Override // io.realm.MapValueOperator
    public boolean containsValue(Object obj) {
        if (obj == null || RealmModel.class.isAssignableFrom(obj.getClass())) {
            return containsValueInternal(obj);
        }
        throw new ClassCastException("Only RealmModel values can be used with 'containsValue'.");
    }

    @Override // io.realm.MapValueOperator
    public boolean containsValueInternal(Object obj) {
        if (obj == null) {
            return this.osMap.containsPrimitiveValue(null);
        }
        if (!(obj instanceof RealmObjectProxy)) {
            throw new IllegalArgumentException("Only managed models can be contained in this dictionary.");
        }
        Row row$realm = ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm();
        return this.osMap.containsRealmModel(row$realm.getObjectKey(), row$realm.getTable().getNativePtr());
    }

    @Override // io.realm.MapValueOperator
    public Set<Map.Entry<K, V>> entrySet() {
        return new RealmMapEntrySet(this.baseRealm, this.osMap, RealmMapEntrySet.IteratorType.OBJECT, this.typeSelectorForMap);
    }

    @Override // io.realm.MapValueOperator
    public V get(Object obj) {
        long modelRowKey = this.osMap.getModelRowKey(obj);
        if (modelRowKey == -1) {
            return null;
        }
        return this.typeSelectorForMap.getRealmModel(this.baseRealm, modelRowKey);
    }

    @Override // io.realm.MapValueOperator
    public V put(K k7, V v10) {
        return this.typeSelectorForMap.putRealmModel(this.baseRealm, this.osMap, k7, v10);
    }
}
