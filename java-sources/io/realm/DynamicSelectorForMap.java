package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.util.Pair;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class DynamicSelectorForMap<K> extends TypeSelectorForMap<K, DynamicRealmObject> {
    private final String className;

    public DynamicSelectorForMap(BaseRealm baseRealm, OsMap osMap, String str) {
        super(baseRealm, osMap);
        this.className = str;
    }

    private <T> RealmResults<T> produceResults(BaseRealm baseRealm, Pair<Table, Long> pair, String str) {
        return new RealmResults<>(baseRealm, OsResults.createFromMap(baseRealm.sharedRealm, pair.second.longValue()), str, false);
    }

    @Override // io.realm.TypeSelectorForMap
    public RealmDictionary<DynamicRealmObject> freeze(BaseRealm baseRealm) {
        return new RealmDictionary<>(baseRealm, this.osMap, this.className);
    }

    @Override // io.realm.TypeSelectorForMap
    public Map.Entry<K, DynamicRealmObject> getModelEntry(BaseRealm baseRealm, long j, K k7) {
        return new AbstractMap.SimpleImmutableEntry(k7, (DynamicRealmObject) baseRealm.get(DynamicRealmObject.class, this.className, j));
    }

    @Override // io.realm.TypeSelectorForMap
    public Class<DynamicRealmObject> getValueClass() {
        return DynamicRealmObject.class;
    }

    @Override // io.realm.TypeSelectorForMap
    public String getValueClassName() {
        return this.className;
    }

    @Override // io.realm.TypeSelectorForMap
    public Collection<DynamicRealmObject> getValues() {
        return produceResults(this.baseRealm, this.osMap.tableAndValuePtrs(), this.className);
    }

    @Override // io.realm.TypeSelectorForMap
    public Set<K> keySet() {
        return new HashSet(produceResults(this.baseRealm, this.osMap.tableAndKeyPtrs(), this.className));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.TypeSelectorForMap
    public DynamicRealmObject getRealmModel(BaseRealm baseRealm, long j) {
        return (DynamicRealmObject) baseRealm.get(DynamicRealmObject.class, this.className, j);
    }

    @Override // io.realm.TypeSelectorForMap
    public DynamicRealmObject putRealmModel(BaseRealm baseRealm, OsMap osMap, K k7, DynamicRealmObject dynamicRealmObject) {
        long modelRowKey = osMap.getModelRowKey(k7);
        if (dynamicRealmObject == null) {
            osMap.put(k7, null);
        } else if (baseRealm.getSchema().getSchemaForClass(this.className).isEmbedded()) {
            CollectionUtils.updateEmbeddedObject((Realm) baseRealm, dynamicRealmObject, osMap.createAndPutEmbeddedObject(k7));
        } else {
            if (CollectionUtils.checkCanObjectBeCopied(baseRealm, dynamicRealmObject, this.className, CollectionUtils.DICTIONARY_TYPE)) {
                dynamicRealmObject = (DynamicRealmObject) CollectionUtils.copyToRealm(baseRealm, dynamicRealmObject);
            }
            osMap.putRow(k7, dynamicRealmObject.realmGet$proxyState().getRow$realm().getObjectKey());
        }
        if (modelRowKey == -1) {
            return null;
        }
        return (DynamicRealmObject) baseRealm.get(DynamicRealmObject.class, this.className, modelRowKey);
    }
}
