package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.Decimal128;

/* JADX INFO: loaded from: classes.dex */
final class Decimal128ListOperator extends ManagedListOperator<Decimal128> {
    public Decimal128ListOperator(BaseRealm baseRealm, OsList osList, Class<Decimal128> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addDecimal128((Decimal128) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof Decimal128)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.Decimal128", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        this.osList.insertDecimal128(i10, (Decimal128) obj);
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setDecimal128(i10, (Decimal128) obj);
    }

    @Override // io.realm.ManagedListOperator
    public Decimal128 get(int i10) {
        return (Decimal128) this.osList.getValue(i10);
    }
}
