package io.realm;

import io.realm.internal.OsMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class TypeSelectorForMap<K, V> {
    protected final BaseRealm baseRealm;
    protected final OsMap osMap;

    public TypeSelectorForMap(BaseRealm baseRealm, OsMap osMap) {
        this.baseRealm = baseRealm;
        this.osMap = osMap;
    }

    public abstract RealmDictionary<V> freeze(BaseRealm baseRealm);

    public Map.Entry<K, V> getModelEntry(BaseRealm baseRealm, long j, K k7) {
        throw new UnsupportedOperationException("Function 'getModelEntry' can only be called from 'LinkSelectorForMap' instances.");
    }

    public V getRealmModel(BaseRealm baseRealm, long j) {
        throw new UnsupportedOperationException("Function 'getRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }

    public abstract Class<V> getValueClass();

    public abstract String getValueClassName();

    public abstract Collection<V> getValues();

    public abstract Set<K> keySet();

    public V putRealmModel(BaseRealm baseRealm, OsMap osMap, K k7, V v10) {
        throw new UnsupportedOperationException("Function 'putRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }
}
