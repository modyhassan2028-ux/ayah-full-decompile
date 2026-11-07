package io.realm;

import io.realm.internal.OsList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class DateListOperator extends ManagedListOperator<Date> {
    public DateListOperator(BaseRealm baseRealm, OsList osList, Class<Date> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addDate((Date) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof Date)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.Date", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        this.osList.insertDate(i10, (Date) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setDate(i10, (Date) obj);
    }

    @Override // io.realm.ManagedListOperator
    public Date get(int i10) {
        return (Date) this.osList.getValue(i10);
    }
}
