package io.realm;

import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes.dex */
final class ObjectIdRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public ObjectIdRealmAnyOperator(ObjectId objectId) {
        super(objectId, RealmAny.Type.OBJECT_ID);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((ObjectId) super.getValue(ObjectId.class));
    }

    public ObjectIdRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), RealmAny.Type.OBJECT_ID, nativeRealmAny);
    }
}
