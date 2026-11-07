package io.realm;

import io.realm.internal.Freezable;
import io.realm.internal.ManageableObject;
import io.realm.internal.ObservableMap;
import io.realm.internal.ObserverPairList;
import io.realm.internal.OsMap;
import io.realm.internal.util.Pair;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class ManagedMapManager<K, V> implements Map<K, V>, ManageableObject, Freezable<RealmMap<K, V>>, ObservableMap {
    protected final BaseRealm baseRealm;
    protected final ObserverPairList<ObservableMap.MapObserverPair<K, V>> mapObserverPairs = new ObserverPairList<>();
    protected final MapValueOperator<K, V> mapValueOperator;
    protected final TypeSelectorForMap<K, V> typeSelectorForMap;

    public ManagedMapManager(BaseRealm baseRealm, MapValueOperator<K, V> mapValueOperator, TypeSelectorForMap<K, V> typeSelectorForMap) {
        this.baseRealm = baseRealm;
        this.mapValueOperator = mapValueOperator;
        this.typeSelectorForMap = typeSelectorForMap;
    }

    public void addChangeListener(RealmMap<K, V> realmMap, MapChangeListener<K, V> mapChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, mapChangeListener, true);
        if (this.mapObserverPairs.isEmpty()) {
            this.mapValueOperator.startListening(this);
        }
        this.mapObserverPairs.add(new ObservableMap.MapObserverPair(realmMap, mapChangeListener));
    }

    public abstract MapChangeSet<K> changeSetFactory(long j);

    @Override // java.util.Map
    public void clear() {
        this.mapValueOperator.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return containsKeyInternal(obj);
    }

    public abstract boolean containsKeyInternal(Object obj);

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.mapValueOperator.containsValue(obj);
    }

    @Override // java.util.Map
    public abstract Set<Map.Entry<K, V>> entrySet();

    public abstract RealmMap<K, V> freezeInternal(Pair<BaseRealm, OsMap> pair);

    public String getClassName() {
        return this.typeSelectorForMap.getValueClassName();
    }

    public OsMap getOsMap() {
        return this.mapValueOperator.osMap;
    }

    public Class<V> getValueClass() {
        return this.typeSelectorForMap.getValueClass();
    }

    public boolean hasListeners() {
        return !this.mapObserverPairs.isEmpty();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.mapValueOperator.isEmpty();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        return this.mapValueOperator.isFrozen();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isManaged() {
        return true;
    }

    public boolean isNotNullItemTypeValid(Object obj, Class<?> cls) {
        return obj == null || obj.getClass() == cls;
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isValid() {
        return this.mapValueOperator.isValid();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.mapValueOperator.keySet();
    }

    @Override // io.realm.internal.ObservableMap
    public void notifyChangeListeners(long j) {
        MapChangeSetImpl mapChangeSetImpl = new MapChangeSetImpl(changeSetFactory(j));
        if (mapChangeSetImpl.isEmpty()) {
            return;
        }
        this.mapObserverPairs.foreach(new ObservableMap.Callback(mapChangeSetImpl));
    }

    @Override // java.util.Map
    public abstract V put(K k7, V v10);

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        validateMap(map);
        this.mapValueOperator.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed.");
        }
        V v10 = this.mapValueOperator.get(obj);
        this.mapValueOperator.remove(obj);
        return v10;
    }

    public void removeAllChangeListeners() {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, null, false);
        this.mapObserverPairs.clear();
        this.mapValueOperator.stopListening();
    }

    public void removeListener(RealmMap<K, V> realmMap, MapChangeListener<K, V> mapChangeListener) {
        this.mapObserverPairs.remove(realmMap, mapChangeListener);
        if (this.mapObserverPairs.isEmpty()) {
            this.mapValueOperator.stopListening();
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.mapValueOperator.size();
    }

    public abstract void validateMap(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    public Collection<V> values() {
        return this.mapValueOperator.values();
    }

    @Override // io.realm.internal.Freezable
    public RealmMap<K, V> freeze() {
        return freezeInternal(this.mapValueOperator.freeze());
    }

    public void removeListener(RealmMap<K, V> realmMap, RealmChangeListener<RealmMap<K, V>> realmChangeListener) {
        removeListener(realmMap, new ObservableMap.RealmChangeListenerWrapper(realmChangeListener));
    }

    public void addChangeListener(RealmMap<K, V> realmMap, RealmChangeListener<RealmMap<K, V>> realmChangeListener) {
        addChangeListener(realmMap, new ObservableMap.RealmChangeListenerWrapper(realmChangeListener));
    }
}
