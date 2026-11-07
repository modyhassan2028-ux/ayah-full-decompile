package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class SelectorForMap<K, V> extends TypeSelectorForMap<K, V> {
    protected final Class<K> keyClass;
    protected final Class<V> valueClass;

    public SelectorForMap(BaseRealm baseRealm, OsMap osMap, Class<K> cls, Class<V> cls2) {
        super(baseRealm, osMap);
        this.keyClass = cls;
        this.valueClass = cls2;
    }

    private <T> RealmResults<T> produceResults(BaseRealm baseRealm, Pair<Table, Long> pair, boolean z10, Class<T> cls) {
        return new RealmResults<>(baseRealm, OsResults.createFromMap(baseRealm.sharedRealm, pair.second.longValue()), cls, z10);
    }

    @Override // io.realm.TypeSelectorForMap
    public RealmDictionary<V> freeze(BaseRealm baseRealm) {
        return new RealmDictionary<>(baseRealm, this.osMap, this.valueClass);
    }

    @Override // io.realm.TypeSelectorForMap
    public Class<V> getValueClass() {
        return this.valueClass;
    }

    @Override // io.realm.TypeSelectorForMap
    public String getValueClassName() {
        return this.valueClass.getSimpleName();
    }

    @Override // io.realm.TypeSelectorForMap
    public Collection<V> getValues() {
        return produceResults(this.baseRealm, this.osMap.tableAndValuePtrs(), !CollectionUtils.isClassForRealmModel(this.valueClass), this.valueClass);
    }

    @Override // io.realm.TypeSelectorForMap
    public Set<K> keySet() {
        return new HashSet(produceResults(this.baseRealm, this.osMap.tableAndKeyPtrs(), true, this.keyClass));
    }
}
