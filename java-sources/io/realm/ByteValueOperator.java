package io.realm;

import io.realm.internal.OsMap;

/* JADX INFO: loaded from: classes.dex */
class ByteValueOperator<K> extends GenericPrimitiveValueOperator<K, Byte> {
    public ByteValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, Byte> typeSelectorForMap) {
        super(Byte.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.BYTE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.GenericPrimitiveValueOperator
    public Byte processValue(Object obj) {
        return Byte.valueOf(((Long) obj).byteValue());
    }
}
