package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes.dex */
class ObjectIdOperator extends SetValueOperator<ObjectId> {
    public ObjectIdOperator(BaseRealm baseRealm, OsSet osSet, Class<ObjectId> cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // io.realm.SetValueOperator
    public boolean addAllInternal(Collection<? extends ObjectId> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsInternal(Object obj) {
        return this.osSet.contains(obj == null ? null : (ObjectId) obj);
    }

    @Override // io.realm.SetValueOperator
    public boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean removeInternal(Object obj) {
        return this.osSet.remove((ObjectId) obj);
    }

    @Override // io.realm.SetValueOperator
    public boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean add(ObjectId objectId) {
        return this.osSet.add(objectId);
    }
}
