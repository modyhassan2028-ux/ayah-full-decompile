package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsMap;
import io.realm.internal.RealmObjectProxy;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class LinkSelectorForMap<K, V extends RealmModel> extends SelectorForMap<K, V> {
    public LinkSelectorForMap(BaseRealm baseRealm, OsMap osMap, Class<K> cls, Class<V> cls2) {
        super(baseRealm, osMap, cls, cls2);
    }

    @Override // io.realm.TypeSelectorForMap
    public Map.Entry<K, V> getModelEntry(BaseRealm baseRealm, long j, K k7) {
        return new AbstractMap.SimpleImmutableEntry(k7, baseRealm.get(this.valueClass, (String) null, j));
    }

    @Override // io.realm.TypeSelectorForMap
    public V getRealmModel(BaseRealm baseRealm, long j) {
        return (V) baseRealm.get(this.valueClass, (String) null, j);
    }

    @Override // io.realm.TypeSelectorForMap
    public V putRealmModel(BaseRealm baseRealm, OsMap osMap, K k7, V v10) {
        long modelRowKey = osMap.getModelRowKey(k7);
        if (v10 == null) {
            osMap.put(k7, null);
        } else if (baseRealm.getSchema().getSchemaForClass((Class<? extends RealmModel>) this.valueClass).isEmbedded()) {
            CollectionUtils.updateEmbeddedObject((Realm) baseRealm, v10, osMap.createAndPutEmbeddedObject(k7));
        } else {
            if (CollectionUtils.checkCanObjectBeCopied(baseRealm, v10, this.valueClass.getSimpleName(), CollectionUtils.DICTIONARY_TYPE)) {
                v10 = (V) CollectionUtils.copyToRealm(baseRealm, v10);
            }
            osMap.putRow(k7, ((RealmObjectProxy) v10).realmGet$proxyState().getRow$realm().getObjectKey());
        }
        if (modelRowKey == -1) {
            return null;
        }
        return (V) baseRealm.get(this.valueClass, modelRowKey, false, new ArrayList());
    }
}
