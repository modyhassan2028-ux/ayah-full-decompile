package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.core.NativeRealmAny;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class RealmAnyListOperator extends ManagedListOperator<RealmAny> {
    public RealmAnyListOperator(BaseRealm baseRealm, OsList osList, Class<RealmAny> cls) {
        super(baseRealm, osList, cls);
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        this.osList.addRealmAny(CollectionUtils.copyToRealmIfNeeded(this.realm, (RealmAny) obj).getNativePtr());
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj != null && !(obj instanceof RealmAny)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.RealmAny", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return false;
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        checkInsertIndex(i10);
        this.osList.insertRealmAny(i10, CollectionUtils.copyToRealmIfNeeded(this.realm, (RealmAny) obj).getNativePtr());
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        this.osList.setRealmAny(i10, CollectionUtils.copyToRealmIfNeeded(this.realm, (RealmAny) obj).getNativePtr());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.ManagedListOperator
    public RealmAny get(int i10) {
        NativeRealmAny nativeRealmAny = (NativeRealmAny) this.osList.getValue(i10);
        if (nativeRealmAny == null) {
            nativeRealmAny = new NativeRealmAny();
        }
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.realm, nativeRealmAny));
    }
}
