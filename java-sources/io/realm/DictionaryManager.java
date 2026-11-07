package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.util.Pair;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class DictionaryManager<V> extends ManagedMapManager<String, V> {
    public DictionaryManager(BaseRealm baseRealm, MapValueOperator<String, V> mapValueOperator, TypeSelectorForMap<String, V> typeSelectorForMap) {
        super(baseRealm, mapValueOperator, typeSelectorForMap);
    }

    @Override // io.realm.ManagedMapManager
    public MapChangeSet<String> changeSetFactory(long j) {
        return new StringMapChangeSet(j);
    }

    @Override // io.realm.ManagedMapManager
    public boolean containsKeyInternal(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed when calling 'containsKey'.");
        }
        if (isNotNullItemTypeValid(obj, String.class)) {
            return this.mapValueOperator.containsKey(obj);
        }
        throw new ClassCastException("Only String keys can be used with 'containsKey'.");
    }

    @Override // io.realm.ManagedMapManager, java.util.Map
    public Set<Map.Entry<String, V>> entrySet() {
        return this.mapValueOperator.entrySet();
    }

    @Override // io.realm.ManagedMapManager
    public /* bridge */ /* synthetic */ RealmMap freezeInternal(Pair pair) {
        return freezeInternal((Pair<BaseRealm, OsMap>) pair);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed when calling 'get'.");
        }
        if (isNotNullItemTypeValid(obj, String.class)) {
            return this.mapValueOperator.get((K) ((String) obj));
        }
        throw new ClassCastException("Only String keys can be used with 'containsKey'.");
    }

    @Override // io.realm.ManagedMapManager
    public void validateMap(Map<? extends String, ? extends V> map) {
        Iterator<Map.Entry<? extends String, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey() == null) {
                throw new NullPointerException("Null keys are not allowed.");
            }
        }
    }

    @Override // io.realm.ManagedMapManager
    public RealmDictionary<V> freezeInternal(Pair<BaseRealm, OsMap> pair) {
        return this.typeSelectorForMap.freeze(pair.first);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.realm.ManagedMapManager, java.util.Map
    public V put(String str, V v10) {
        if (str == null) {
            throw new NullPointerException("Null keys are not allowed.");
        }
        try {
            return this.mapValueOperator.put((K) str, v10);
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            Objects.requireNonNull(message);
            if (message.contains("Data type mismatch")) {
                throw new NullPointerException("Cannot insert null values in a dictionary marked with '@Required'.");
            }
            throw e10;
        }
    }
}
