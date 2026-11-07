package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class DoubleListOperator extends ManagedListOperator<Double> {
    public DoubleListOperator(BaseRealm baseRealm, OsList osList, Class<Double> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addDouble(((Number) obj).doubleValue());
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Number", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        this.osList.insertDouble(i10, ((Number) obj).doubleValue());
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setDouble(i10, ((Number) obj).doubleValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.ManagedListOperator
    public Double get(int i10) {
        return (Double) this.osList.getValue(i10);
    }
}
