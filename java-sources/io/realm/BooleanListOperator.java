package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class BooleanListOperator extends ManagedListOperator<Boolean> {
    public BooleanListOperator(BaseRealm baseRealm, OsList osList, Class<Boolean> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addBoolean(((Boolean) obj).booleanValue());
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof Boolean)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Boolean", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        this.osList.insertBoolean(i10, ((Boolean) obj).booleanValue());
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setBoolean(i10, ((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.ManagedListOperator
    public Boolean get(int i10) {
        return (Boolean) this.osList.getValue(i10);
    }
}
