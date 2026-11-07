package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class StringListOperator extends ManagedListOperator<String> {
    public StringListOperator(BaseRealm baseRealm, OsList osList, Class<String> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addString((String) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        this.osList.insertString(i10, (String) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setString(i10, (String) obj);
    }

    @Override // io.realm.ManagedListOperator
    public String get(int i10) {
        return (String) this.osList.getValue(i10);
    }
}
