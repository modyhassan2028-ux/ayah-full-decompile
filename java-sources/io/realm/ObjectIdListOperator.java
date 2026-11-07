package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes.dex */
final class ObjectIdListOperator extends ManagedListOperator<ObjectId> {
    public ObjectIdListOperator(BaseRealm baseRealm, OsList osList, Class<ObjectId> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addObjectId((ObjectId) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof ObjectId)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.ObjectId", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        this.osList.insertObjectId(i10, (ObjectId) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setObjectId(i10, (ObjectId) obj);
    }

    @Override // io.realm.ManagedListOperator
    public ObjectId get(int i10) {
        return (ObjectId) this.osList.getValue(i10);
    }
}
