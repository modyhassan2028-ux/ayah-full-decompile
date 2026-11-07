package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class BinaryListOperator extends ManagedListOperator<byte[]> {
    public BinaryListOperator(BaseRealm baseRealm, OsList osList, Class<byte[]> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addBinary((byte[]) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof byte[])) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "byte[]", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        this.osList.insertBinary(i10, (byte[]) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setBinary(i10, (byte[]) obj);
    }

    @Override // io.realm.ManagedListOperator
    public byte[] get(int i10) {
        return (byte[]) this.osList.getValue(i10);
    }
}
