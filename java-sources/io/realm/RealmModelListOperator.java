package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.RealmObjectProxy;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class RealmModelListOperator<T> extends ManagedListOperator<T> {
    private final String className;

    public RealmModelListOperator(BaseRealm baseRealm, OsList osList, Class<T> cls, String str) {
        super(baseRealm, osList, cls);
        this.className = str;
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(Object obj) {
        RealmModel realmModelCopyToRealm = (RealmModel) obj;
        boolean zCheckCanObjectBeCopied = CollectionUtils.checkCanObjectBeCopied(this.realm, realmModelCopyToRealm, this.className, CollectionUtils.LIST_TYPE);
        if (!CollectionUtils.isEmbedded(this.realm, realmModelCopyToRealm)) {
            if (zCheckCanObjectBeCopied) {
                realmModelCopyToRealm = CollectionUtils.copyToRealm(this.realm, realmModelCopyToRealm);
            }
            this.osList.addRow(((RealmObjectProxy) realmModelCopyToRealm).realmGet$proxyState().getRow$realm().getObjectKey());
        } else {
            if (obj instanceof DynamicRealmObject) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
            }
            CollectionUtils.updateEmbeddedObject((Realm) this.realm, realmModelCopyToRealm, this.osList.createAndAddEmbeddedObject());
        }
    }

    @Override // io.realm.ManagedListOperator
    public void checkValidValue(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("RealmList does not accept null values.");
        }
        if (!(obj instanceof RealmModel)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
        }
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
        return true;
    }

    @Override // io.realm.ManagedListOperator
    public T get(int i10) {
        return (T) this.realm.get(this.clazz, this.className, this.osList.getUncheckedRow(i10));
    }

    @Override // io.realm.ManagedListOperator
    public void insertNull(int i10) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int i10, Object obj) {
        checkInsertIndex(i10);
        RealmModel realmModelCopyToRealm = (RealmModel) obj;
        boolean zCheckCanObjectBeCopied = CollectionUtils.checkCanObjectBeCopied(this.realm, realmModelCopyToRealm, this.className, CollectionUtils.LIST_TYPE);
        if (!CollectionUtils.isEmbedded(this.realm, realmModelCopyToRealm)) {
            if (zCheckCanObjectBeCopied) {
                realmModelCopyToRealm = CollectionUtils.copyToRealm(this.realm, realmModelCopyToRealm);
            }
            this.osList.insertRow(i10, ((RealmObjectProxy) realmModelCopyToRealm).realmGet$proxyState().getRow$realm().getObjectKey());
        } else {
            if (obj instanceof DynamicRealmObject) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
            }
            CollectionUtils.updateEmbeddedObject((Realm) this.realm, realmModelCopyToRealm, this.osList.createAndAddEmbeddedObject(i10));
        }
    }

    @Override // io.realm.ManagedListOperator
    public void setNull(int i10) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // io.realm.ManagedListOperator
    public void setValue(int i10, Object obj) {
        RealmModel realmModelCopyToRealm = (RealmModel) obj;
        boolean zCheckCanObjectBeCopied = CollectionUtils.checkCanObjectBeCopied(this.realm, realmModelCopyToRealm, this.className, CollectionUtils.LIST_TYPE);
        if (!CollectionUtils.isEmbedded(this.realm, realmModelCopyToRealm)) {
            if (zCheckCanObjectBeCopied) {
                realmModelCopyToRealm = CollectionUtils.copyToRealm(this.realm, realmModelCopyToRealm);
            }
            this.osList.setRow(i10, ((RealmObjectProxy) realmModelCopyToRealm).realmGet$proxyState().getRow$realm().getObjectKey());
        } else {
            if (obj instanceof DynamicRealmObject) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
            }
            CollectionUtils.updateEmbeddedObject((Realm) this.realm, realmModelCopyToRealm, this.osList.createAndSetEmbeddedObject(i10));
        }
    }
}
