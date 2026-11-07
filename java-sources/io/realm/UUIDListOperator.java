package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
final class UUIDListOperator extends ManagedListOperator<UUID> {
    public UUIDListOperator(BaseRealm baseRealm, OsList osList, Class<UUID> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addUUID((UUID) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof UUID)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.UUID", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        this.osList.insertUUID(i10, (UUID) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setUUID(i10, (UUID) obj);
    }

    @Override // io.realm.ManagedListOperator
    public UUID get(int i10) {
        return (UUID) this.osList.getValue(i10);
    }
}
