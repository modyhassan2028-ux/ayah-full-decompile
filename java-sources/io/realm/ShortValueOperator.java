package io.realm;

import io.realm.internal.OsMap;

/* JADX INFO: loaded from: classes.dex */
class ShortValueOperator<K> extends GenericPrimitiveValueOperator<K, Short> {
    public ShortValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, Short> typeSelectorForMap) {
        super(Short.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.SHORT);
    }

    @Override // io.realm.GenericPrimitiveValueOperator
    public Short processValue(Object obj) {
        return Short.valueOf(((Long) obj).shortValue());
    }
}
