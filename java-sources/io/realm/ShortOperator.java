package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
class ShortOperator extends SetValueOperator<Short> {
    public ShortOperator(BaseRealm baseRealm, OsSet osSet, Class<Short> cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // io.realm.SetValueOperator
    public boolean addAllInternal(Collection<? extends Short> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newIntegerCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newIntegerCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsInternal(Object obj) {
        return this.osSet.contains(obj == null ? null : Long.valueOf(((Short) obj).longValue()));
    }

    @Override // io.realm.SetValueOperator
    public boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newIntegerCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean removeInternal(Object obj) {
        return this.osSet.remove((Short) obj);
    }

    @Override // io.realm.SetValueOperator
    public boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newIntegerCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean add(Short sh) {
        return this.osSet.add(sh);
    }
}
