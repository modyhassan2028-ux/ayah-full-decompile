package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
class StringOperator extends SetValueOperator<String> {
    public StringOperator(BaseRealm baseRealm, OsSet osSet, Class<String> cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // io.realm.SetValueOperator
    public boolean addAllInternal(Collection<? extends String> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsInternal(Object obj) {
        return this.osSet.contains((String) obj);
    }

    @Override // io.realm.SetValueOperator
    public boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean removeInternal(Object obj) {
        return this.osSet.remove((String) obj);
    }

    @Override // io.realm.SetValueOperator
    public boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean add(String str) {
        return this.osSet.add(str);
    }
}
