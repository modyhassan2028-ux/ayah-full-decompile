package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
class BooleanOperator extends SetValueOperator<Boolean> {
    public BooleanOperator(BaseRealm baseRealm, OsSet osSet, Class<Boolean> cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // io.realm.SetValueOperator
    public boolean addAllInternal(Collection<? extends Boolean> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBooleanCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBooleanCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsInternal(Object obj) {
        return this.osSet.contains((Boolean) obj);
    }

    @Override // io.realm.SetValueOperator
    public boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBooleanCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean removeInternal(Object obj) {
        return this.osSet.remove((Boolean) obj);
    }

    @Override // io.realm.SetValueOperator
    public boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBooleanCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean add(Boolean bool) {
        return this.osSet.add(bool);
    }
}
