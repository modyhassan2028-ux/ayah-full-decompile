package io.realm;

import io.realm.internal.OsMap;

/* JADX INFO: loaded from: classes.dex */
class IntegerValueOperator<K> extends GenericPrimitiveValueOperator<K, Integer> {
    public IntegerValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, Integer> typeSelectorForMap) {
        super(Integer.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.INTEGER);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.GenericPrimitiveValueOperator
    public Integer processValue(Object obj) {
        return Integer.valueOf(((Long) obj).intValue());
    }
}
