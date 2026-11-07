package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class RealmAnyValueOperator<K> extends MapValueOperator<K, RealmAny> {
    public RealmAnyValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, RealmAny> typeSelectorForMap) {
        super(RealmAny.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.MIXED);
    }

    @Override // io.realm.MapValueOperator
    public boolean containsValueInternal(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof RealmAny) {
            return this.osMap.containsRealmAnyValue(((RealmAny) obj).getNativePtr());
        }
        throw new IllegalArgumentException("This dictionary can only contain 'RealmAny' values.");
    }

    @Override // io.realm.MapValueOperator
    public Set<Map.Entry<K, RealmAny>> entrySet() {
        return new RealmMapEntrySet(this.baseRealm, this.osMap, RealmMapEntrySet.IteratorType.MIXED, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.MapValueOperator
    public RealmAny get(Object obj) {
        long realmAnyPtr = this.osMap.getRealmAnyPtr(obj);
        if (realmAnyPtr == -1) {
            return null;
        }
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, new NativeRealmAny(realmAnyPtr)));
    }

    @Override // io.realm.MapValueOperator
    public RealmAny put(Object obj, RealmAny realmAny) {
        RealmAny realmAny2 = get(obj);
        if (realmAny == null) {
            this.osMap.put(obj, null);
            return realmAny2;
        }
        this.osMap.putRealmAny(obj, CollectionUtils.copyToRealmIfNeeded(this.baseRealm, realmAny).getNativePtr());
        return realmAny2;
    }
}
